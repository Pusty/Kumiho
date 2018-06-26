package pusty.f0xdc.location;

import java.util.HashMap;

import pusty.f0xdc.pe.ExecutableReader;
import pusty.f0xdc.pe.IMAGE_SECTION_HEADER;

public class MemorySection {

	protected int offset_from; //from (index in data array)
	protected int offset_to; //to (index in data array)
	protected IMAGE_SECTION_HEADER section; //section this is in
	protected HashMap<String, Object> data; //data hash for stuff
	
	public MemorySection(int from, int to, IMAGE_SECTION_HEADER sec) {
		offset_from = from;
		offset_to = to;
		section = sec;
		data = new HashMap<String, Object>();
	}
	
	public MemorySection(IMAGE_SECTION_HEADER sec) {
		offset_from = sec.getPointerToRawData();
		offset_to = sec.getPointerToRawData()+sec.getSizeOfRawData();
		section = sec;
		data = new HashMap<String, Object>();
	}
	
	public IMAGE_SECTION_HEADER getSection() { return section; }
	/*public Address getAddress() { //this might confuse people, me as well
		return InjectingEngine.fromSection(null, this);  //This has no image base 
	}*/
	public int getOffsetFrom() { return offset_from; }
	public int getOffsetTo() { return offset_to; }
	public int getSize() { return offset_to-offset_from; }
	
	public int getAddressFrom() {
		return offset_from-section.getPointerToRawData()+section.getVirtualAddress();
	}
	public int getAddressTo() {
		return offset_to-section.getPointerToRawData()+section.getVirtualAddress();
	}
	public Address getAddress(ExecutableReader reader) {
		return reader.offset2rva(getOffsetFrom());
	}
	
	public String toString() {
		return section.getName()+": "+getSize();
	}

	/**
	 *  returnMode = true/false where true = return on end and false = jump on end <br>
	 *  is64bit = true/false <br>
	 *  returnAddr = Address this function should return to <br>
	 */
	public void putData(String string, Object d) {
		data.put(string, d);
	}
	
	public Object getData(String string) {
		if(!data.containsKey(string)) 
			return null; 
		return data.get(string);
	}

	public void setSize(int size) {
		offset_to = offset_from + size;
	}
	
}
