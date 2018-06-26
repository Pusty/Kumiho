package pusty.f0xdc.tests;

import java.io.File;
import java.util.ArrayList;

import pusty.f0xdc.payload.InjectingEngine;
import pusty.f0xdc.payload.InjectingEngine.EditableImportTable;
import pusty.f0xdc.pe.DescriptorImport.IMAGE_IMPORT_DESCRIPTOR;
import pusty.f0xdc.pe.DescriptorImport.IMAGE_THUNK_DATA;
import pusty.f0xdc.pe.ExecutableReader;
import pusty.f0xdc.pe.IMAGE_OPTIONAL_HEADER32;
import pusty.f0xdc.pe.IMAGE_SECTION_HEADER;

public class Kumiho {
	public static void main(String[] args) throws Exception {
		if(args.length != 1) {
			System.out.println("./Kumiho.jar <exe>");
			return;
		}
		File protectF = new File(args[0]);
		File peF = new File("payload/kumiho/stub.exe");
		
		ExecutableReader protect = ExecutableReader.create(protectF);
		ExecutableReader pe      = ExecutableReader.create(peF);
		
		
		EditableImportTable table = EditableImportTable.fromReader(pe);
		
		
		int    sizeForSection     = protect.getOptionalHeader().getSizeOfImage();
		byte[] dataForSection     = protect.getStream().getData();
		int    len_dataForSection = InjectingEngine.align(dataForSection.length, pe.getOptionalHeader().getSectionAlignment());
		int    baseAddress        = 0x1000;
		Kumiho.swapSections(pe, pe.getSection(".rdata"), pe.getSection(".idata"));
		InjectingEngine.removeLastSection(pe);
		Kumiho.merge(pe, pe.getSection(".text"), pe.getSection(".idata"), ".PACKED", table, baseAddress+sizeForSection+len_dataForSection);
		InjectingEngine.injectSection(pe, ".VRTCOPY", sizeForSection,        0xE0000020, true);
		InjectingEngine.injectSection(pe, ".RAWCOPY", dataForSection.length ,0xE0000020);
		
		Kumiho.injectCode(pe, pe.getSection(".RAWCOPY"), dataForSection);
		pe.getOptionalHeader().setAddressOfEntryPoint(baseAddress+sizeForSection+len_dataForSection);
		pe.getSection(".VRTCOPY").setVirtualAddress(baseAddress);
		pe.getSection(".RAWCOPY").setVirtualAddress(baseAddress+sizeForSection);
		
		swapSections(pe, pe.getSection(".PACKED"), pe.getSection(".VRTCOPY"));
		swapSections(pe, pe.getSection(".PACKED"), pe.getSection(".RAWCOPY"));
		pe.getOptionalHeader().setSizeOfImage(InjectingEngine.align(pe.getSectionHeader()[pe.getSectionHeader().length-1].getVirtualAddress()
		+ pe.getSectionHeader()[pe.getSectionHeader().length-1].getVirtualSize(),pe.getOptionalHeader().getSectionAlignment()));
		System.out.println("[#] Starting Protector");
		
		
		/*
		 injectSection(pe,".VRTCOPY" ,sizeForSection,0xE0000020,reserveRaw=False) #Add virtual section VRTCOPY
injectSection(pe,".RAWCOPY" , len(dataForSection),0xE0000020,reserveRaw=True) #add raw data section RAWCOPY
injectCode(pe, getID(pe, ".RAWCOPY"), dataForSection) #ADD PROTECTED FILE INTO RAWCOPY SECTION
pe = save(pe) #RELOADS WORK COPY (PREVENDS BUGS)
pe.OPTIONAL_HEADER.AddressOfEntryPoint = baseAddress+sizeForSection+len_dataForSection #correct entry point
pe.sections[getID(pe, ".VRTCOPY")].VirtualAddress = baseAddress #correct address of VRTCOPY
pe.sections[getID(pe, ".RAWCOPY")].VirtualAddress = baseAddress+sizeForSection #correct address of RAWCOPY
		 */
		File output = new File("output.exe");
		output.delete();
		output.createNewFile();
		pe.save(output);
		System.out.println("****************************************************************");
		System.out.println("[*] Done");
	}

	public static void injectCode(ExecutableReader pe,
			IMAGE_SECTION_HEADER section, byte[] dataForSection) throws Exception {
		for(int i=0;i<dataForSection.length;i++)
			pe.getStream().setByte(section.getPointerToRawData()+i, dataForSection[i]);
	}	

	public static void merge(ExecutableReader pe,
			IMAGE_SECTION_HEADER s1, IMAGE_SECTION_HEADER s2,
			String newname, EditableImportTable table, int vaddr) throws Exception {
		int tableOffset = s2.getPointerToRawData() - s1.getPointerToRawData();
		int size = tableOffset + s2.getSizeOfRawData();
		
		int vaddr_delta = (vaddr+ tableOffset)-s1.getVirtualAddress()-0x2000;
		ArrayList<Integer> trampoline = new ArrayList<Integer>();
	    IMAGE_IMPORT_DESCRIPTOR[] descNew = pe.getOptionalHeader().getImportDescriptor().getImports();
		for(IMAGE_IMPORT_DESCRIPTOR desc:descNew) {
			IMAGE_THUNK_DATA[] thunkData = desc.parseImportTable();
			for(IMAGE_THUNK_DATA thunk:thunkData) {
				trampoline.add(pe.offset2rva(thunk.offset()).getAddr32());
				if(thunk.getName() != null) {
					thunk.setNameOffsetRaw(thunk.getNameOffsetRaw() + vaddr_delta);
				}
			}
			desc.setOriginalFirstThunk(desc.getOriginalFirstThunk() + vaddr_delta);
			desc.setCharacteristics(desc.getCharacteristics() + vaddr_delta);
			desc.setName(desc.getName() + vaddr_delta);
			desc.setFirstThunk(desc.getFirstThunk() + vaddr_delta);
		}
	    	
		s1.setSizeOfRawData(InjectingEngine.align(size, pe.getOptionalHeader().getFileAlignment()));
		s1.setVirtualAddress(vaddr);
		s1.setVirtualSize(InjectingEngine.align(size, pe.getOptionalHeader().getSectionAlignment()));
		pe.getOptionalHeader().setSizeOfImage(InjectingEngine.align(vaddr + s1.getVirtualSize(), pe.getOptionalHeader().getSectionAlignment()));
		pe.getOptionalHeader().getDataDirectory()[IMAGE_OPTIONAL_HEADER32.IMAGE_DIRECTORY_ENTRY_IAT].setVirtualAddresss(
				pe.getOptionalHeader().getDataDirectory()[IMAGE_OPTIONAL_HEADER32.IMAGE_DIRECTORY_ENTRY_IAT].getVirtualAddress() -
				pe.getOptionalHeader().getDataDirectory()[IMAGE_OPTIONAL_HEADER32.IMAGE_DIRECTORY_ENTRY_IMPORT].getVirtualAddress()	
				+ vaddr+ tableOffset
		);
		pe.getOptionalHeader().getDataDirectory()[IMAGE_OPTIONAL_HEADER32.IMAGE_DIRECTORY_ENTRY_IMPORT].setVirtualAddresss(vaddr+ tableOffset);
		s1.setName(newname);
	    InjectingEngine.removeLastSection(pe);
	    
		for(Integer t:trampoline)
			InjectingEngine.replaceAllInt(pe, t+pe.getOptionalHeader().getImageBase(), t+pe.getOptionalHeader().getImageBase()+vaddr_delta);
	}

	public static void swapSections(ExecutableReader pe,
			IMAGE_SECTION_HEADER section, IMAGE_SECTION_HEADER section2) {
		int p1 = section.offset();
		int p2 = section2.offset();
		byte[] s1 = new byte[section.sizeof()];
		System.arraycopy(pe.getStream().getData(), p1, s1, 0, s1.length);
		byte[] s2 = new byte[section2.sizeof()];
		System.arraycopy(pe.getStream().getData(), p2, s2, 0, s2.length);
		System.arraycopy(s2,0, pe.getStream().getData(), p1, s2.length);
		System.arraycopy(s1,0, pe.getStream().getData(), p2, s1.length);
	}
}
