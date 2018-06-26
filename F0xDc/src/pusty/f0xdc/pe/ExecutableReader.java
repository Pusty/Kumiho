package pusty.f0xdc.pe;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import pusty.f0xdc.ExecutableStream;
import pusty.f0xdc.location.Address;

//Only supports executables up to the size of 2GB! (I hope you don't have something bigger o.O)
//Reader for 32bit PE Windows Executables
public class ExecutableReader  {
	protected IMAGE_DOS_HEADER dosHeader;
	protected int signature;
	protected IMAGE_FILE_HEADER peHeader;
	protected IMAGE_OPTIONAL_HEADER32 peOptionalHeader;
	protected IMAGE_SECTION_HEADER[] peFileSections;
	
	public ExecutableStream exStr;
	public ExecutableReader(InputStream is) throws Exception {
		exStr = new ExecutableStream(is);
		read(exStr);
	}
	public ExecutableReader(ExecutableStream stream) throws Exception {
		exStr = stream;
		read(stream);
	}
	
	/**
	 * Dummy initializer, should not be used
	 */
	private ExecutableReader() {
	}
	
	public ExecutableStream getStream() {
		return exStr;
	}
	public void save(File file) throws Exception {
		FileOutputStream fos = new FileOutputStream(file);		
		fos.write(getStream().getData());
		fos.close();
	}
	public void read(ExecutableStream s) throws Exception {
		dosHeader = new IMAGE_DOS_HEADER(this);
		if(dosHeader.getE_magic()==0x5a4d) { //MZ HEADER FOUND
			s.setIndex(dosHeader.getE_lfanew());
			signature = s.readAddrInt();
		}else if(dosHeader.getE_magic()==0x4550){ //PE HEADER FOUND
			signature = dosHeader.getE_magic();
			getStream().setIndex(getStream().getIndex()+2); //MZ only reads short but int must be read
		}else {
			System.out.println("[!] File isn't an executable."); return;
		}
		if(getSignature()!=0x4550){System.out.println("[!] Signature isn't PE00 format."); return;}
		peHeader = new IMAGE_FILE_HEADER(this);
		if(peHeader.getMachine() != IMAGE_FILE_HEADER.IMAGE_FILE_MACHINE_I386) {
			System.out.println("[!] Isn't a 32bit executable");
			return;
		}
		peOptionalHeader = new IMAGE_OPTIONAL_HEADER32(this);
		peFileSections = new IMAGE_SECTION_HEADER[peHeader.getNumberOfSections()];
		for(int i=0;i<peFileSections.length;i++)
			peFileSections[i]	= new IMAGE_SECTION_HEADER(this);
		
		peOptionalHeader.parseDirectories();
	}
	
	
	public int addr2offset(Address address) {
		return rva2offset(new Address(address.getAddr32()-peOptionalHeader.getImageBase()));
	}
	
	
	public int rva2offset(Address address) {
		int offset = -1;
		for(IMAGE_SECTION_HEADER section:peFileSections) {
			if(address.getAddr32() >= section.getVirtualAddress()
			&& address.getAddr32() < section.getVirtualAddress() + section.getVirtualSize()) {
				offset = address.getAddr32() - section.getVirtualAddress() + section.getPointerToRawData();
				return offset;
			}
		}
		if(address.getAddr32() < peOptionalHeader.getSizeOfHeaders())
			return address.getAddr32();
		return offset;
	}
	
	public Address offset2rva(int offset) {
		for(IMAGE_SECTION_HEADER section:peFileSections) {
			if(section.getPointerToRawData() != 0 && offset >= section.getPointerToRawData()
			&& offset < section.getPointerToRawData() + section.getSizeOfRawData()) {
				return new Address(offset - section.getPointerToRawData() + section.getVirtualAddress());
			}
		}
		if(offset < peOptionalHeader.getSizeOfHeaders())
			return new Address(offset);
		return null;
	}
	
	
	public IMAGE_DOS_HEADER getDOSHeader() { return dosHeader; }
	public IMAGE_FILE_HEADER getFileHeader() { return peHeader; }
	public IMAGE_OPTIONAL_HEADER32 getOptionalHeader() { return peOptionalHeader; }
	public IMAGE_OPTIONAL_HEADER32 getOptionalHeader32() { return (IMAGE_OPTIONAL_HEADER32) peOptionalHeader; }
	public IMAGE_OPTIONAL_HEADER64 getOptionalHeader64() { return null; }
	public IMAGE_SECTION_HEADER[]  getSectionHeader() { return peFileSections; }
	
	public IMAGE_SECTION_HEADER getSection(String str) {
		for(int i=str.length();i<8;i++)
			str += (char)0;
		for(IMAGE_SECTION_HEADER ish:peFileSections) {
			if(ish.getName().equals(str))
				return ish;
		}
		return null;
	}
	
	
	public int getSignature() {
		try {
			return getStream().getInt(signature);
		} catch (IOException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public void setSignature(short signature) {
		try {
			getStream().setInt(this.signature, signature);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
	}
	
	public boolean is32bit() {
		return true;
	}
	
	/**
	 * Output an arch string
	 * @return a string containing the name of the architecture
	 */
	public String getArch() {
		return "pex86";
	}
	
	/**
	 * Returns a dummy address fitting the architecture of the reader
	 * <br> Currently Supported Dummy Addresses:
	 * <br> "A", "B", "C", "D", "E", "F"
	 * 
	 * @return
	 */
	public Address getDummyAddress(String name) {
		     if(name.equalsIgnoreCase("A")) return new Address(0xAAAAAAAA);
		else if(name.equalsIgnoreCase("B")) return new Address(0xBBBBBBBB);
		else if(name.equalsIgnoreCase("C")) return new Address(0xCCCCCCCC);
		else if(name.equalsIgnoreCase("D")) return new Address(0xDDDDDDDD);
		else if(name.equalsIgnoreCase("E")) return new Address(0xEEEEEEEE);
		else if(name.equalsIgnoreCase("F")) return new Address(0xFFFFFFFF);
		return new Address(0);
	}
	
	public static ExecutableReader createSpecific(File file) throws Exception {
		
		FileInputStream fis = new FileInputStream(file);		
		ExecutableReader reader = new ExecutableReader(fis);
		fis.close();
		return reader;
	}	

	
	
	public static void rewrite(ExecutableReader reader, File file) throws Exception {
		FileInputStream fis = new FileInputStream(file);		
		reader.exStr = new ExecutableStream(fis);
		reader.read(reader.exStr);
		fis.close();
	}
	
	public static void rewrite(ExecutableReader reader, byte[] data) throws Exception {
		ByteArrayInputStream bis = new ByteArrayInputStream(data);
		reader.exStr = new ExecutableStream(bis);
		reader.read(reader.exStr);
		bis.close();
	}
	
	public static ExecutableReader reload(ExecutableReader in) throws Exception {
		ByteArrayInputStream bis = new ByteArrayInputStream(in.getStream().getData());
		ExecutableReader reader = null;
		if(in.is32bit())
			reader = new ExecutableReader(bis);
		else
			reader = new ExecutableReader64(bis);
		bis.close();
		return reader;
	}
	
	
	public static int identify(File file) throws Exception {
		FileInputStream fis = new FileInputStream(file);
		ExecutableStream str = new ExecutableStream(fis);
		ExecutableReader dummy = new ExecutableReader();
		dummy.exStr = str;
		char fstChar = (char)str.getByte(str.readAddrByte());
		char sndChar = (char)str.getByte(str.readAddrByte()); //MZ / PE => PE | ?ELF => ELF
		int result = TYPEID_UNDEFINED;
		if(sndChar == 'Z' || (fstChar == 'P' && sndChar == 'E')) {
			result = TYPEID_PE_GENERIC;
			str.setIndex(0);
			if(sndChar == 'Z') {
				IMAGE_DOS_HEADER dosHeader = new IMAGE_DOS_HEADER(dummy);
				str.setIndex(str.getShort(dosHeader.getE_lfanewAddr()));
			}
			str.readAddrInt(); //PE signature
			short machine = str.getShort(str.readAddrShort());
			if(machine == IMAGE_FILE_HEADER.IMAGE_FILE_MACHINE_I386)
				result = TYPEID_PE_x86;
			else if(machine == IMAGE_FILE_HEADER.IMAGE_FILE_MACHINE_AMD64)
				result = TYPEID_PE_x64;
		}
		fis.close();
		return result;
	}
	public static ExecutableReader create(File file) throws Exception {
		int identify = identify(file);
		FileInputStream fis = new FileInputStream(file);
		ExecutableReader reader = null;
		switch(identify) {
			case TYPEID_PE_x86:
				reader = new ExecutableReader(fis);
			break;
			case TYPEID_PE_x64:
				reader = new ExecutableReader64(fis);
			break;
			default:
				System.out.println("[!] Arch not supported (Error: "+identify+")");
		}
		fis.close();
		return reader;
	}

	public static final int TYPEID_UNDEFINED = -1;
	public static final int TYPEID_PE_GENERIC = 1;
	public static final int TYPEID_PE_x86 = 2;
	public static final int TYPEID_PE_x64 = 3;
	

}
