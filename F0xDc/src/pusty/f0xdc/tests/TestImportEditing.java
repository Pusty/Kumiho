package pusty.f0xdc.tests;

import java.io.File;

import pusty.f0xdc.payload.InjectingEngine;
import pusty.f0xdc.payload.InjectingEngine.EditableImportTable;
import pusty.f0xdc.pe.DescriptorImport;
import pusty.f0xdc.pe.DescriptorImport.IMAGE_IMPORT_DESCRIPTOR;
import pusty.f0xdc.pe.DescriptorImport.IMAGE_THUNK_DATA;
import pusty.f0xdc.pe.ExecutableReader;
import pusty.f0xdc.pe.IMAGE_SECTION_HEADER;

//Testing Reading of Import Table/Resource Table
public class TestImportEditing {
	public static void main(String[] args) throws Exception {
		File file = new File("NoREpls.exe");
		ExecutableReader reader = ExecutableReader.create(file);
		int sec = InjectingEngine.injectSection(reader, "PING", 0x2024, IMAGE_SECTION_HEADER.IMAGE_SCN_MEM_READ  | IMAGE_SECTION_HEADER.IMAGE_SCN_CNT_INITIALIZED_DATA );
		InjectingEngine.replaceImport(reader, "kernel32.dll", "IsDebuggerPresent", "ExitProcess", reader.getSectionHeader()[sec].getPointerToRawData());
		EditableImportTable table = EditableImportTable.fromReader(reader);
		table.writeTable(reader, reader.getSectionHeader()[sec].getPointerToRawData());
		reader.save(new File("output.exe"));
	}
	
	public static void dumpAddresses(DescriptorImport imp) {
		System.out.println(Integer.toHexString(imp.offset()));
		IMAGE_IMPORT_DESCRIPTOR[] imports = imp.getImports();
		for(IMAGE_IMPORT_DESCRIPTOR i:imports) {
			System.out.println(Integer.toHexString(i.offset()));
			try {
				IMAGE_THUNK_DATA[] impos = i.parseImportTable();
				for(IMAGE_THUNK_DATA impo:impos) {
					System.out.println("   "+Integer.toHexString(impo.offset()));
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
