package pusty.f0xdc.pe;

import java.io.IOException;
import pusty.f0xdc.pe.ExecutableReader;
import pusty.f0xdc.ExecutableStream;
import pusty.f0xdc.ReadableObject;
import pusty.f0xdc.location.Address;
import pusty.f0xdc.pe.DescriptorImport.IMAGE_IMPORT_DESCRIPTOR;
import pusty.f0xdc.pe.DescriptorImport.IMAGE_THUNK_DATA;
import pusty.f0xdc.pe.DescriptorResource.IMAGE_RESOURCE_DIRECTORY;
import pusty.f0xdc.pe.DescriptorResource.IMAGE_RESOURCE_DIRECTORY_ENTRY;

public class IMAGE_OPTIONAL_HEADER32 extends ReadableObject{

	//
	// Standard fields.
	//
	// private final static int PE32 = 0x10b;
	// private final static int PE32P = 0x20b;

	protected int Magic; // magic number (0x10b = PE32; 0x20b = PE32+)
	protected int MajorLinkerVersion; // Linker Information
	protected int MinorLinkerVersion; // Linker Information
	protected int SizeOfCode; // Length of Executable Code
	protected int SizeOfInitializedData; // Length of Initialized Data
	protected int SizeOfUninitializedData; // Length of Uninitialized Data
	protected int AddressOfEntryPoint; // Entry for PE
	protected int BaseOfCode; // Start of .text (Code)
	protected int BaseOfData; // Start of .bss (Uninitialized Data) (not
								// included in PE32+)
	//
	// NT additional fields.
	//
	protected int ImageBase;
	protected int SectionAlignment;
	protected int FileAlignment;
	protected int MajorOperatingSystemVersion;
	protected int MinorOperatingSystemVersion;
	protected int MajorImageVersion;
	protected int MinorImageVersion;
	protected int MajorSubsystemVersion;
	protected int MinorSubsystemVersion;
	protected int Reserved1;
	protected int SizeOfImage;
	protected int SizeOfHeaders;

	protected int CheckSum;
	protected int Subsystem;
	protected int DllCharacteristics;
	protected int SizeOfStackReserve;
	protected int SizeOfStackCommit;
	protected int SizeOfHeapReserve;
	protected int SizeOfHeapCommit;
	protected int LoaderFlags;
	protected int NumberOfRvaAndSizes;
	
	public static final int IMAGE_NUMBEROF_DIRECTORY_ENTRIES = 16;
	
	public static final int IMAGE_DIRECTORY_ENTRY_EXPORT         = 0;   // Export Directory
	public static final int IMAGE_DIRECTORY_ENTRY_IMPORT         = 1;   // Import Directory
	public static final int IMAGE_DIRECTORY_ENTRY_RESOURCE       = 2;   // Resource Directory
	public static final int IMAGE_DIRECTORY_ENTRY_EXCEPTION      = 3;   // Exception Directory
	public static final int IMAGE_DIRECTORY_ENTRY_SECURITY       = 4;   // Security Directory
	public static final int IMAGE_DIRECTORY_ENTRY_BASERELOC      = 5;   // Base Relocation Table
	public static final int IMAGE_DIRECTORY_ENTRY_DEBUG          = 6;   // Debug Directory
	public static final int IMAGE_DIRECTORY_ENTRY_COPYRIGHT      = 7;   // (X86 usage)
	public static final int IMAGE_DIRECTORY_ENTRY_ARCHITECTURE   = 7;   // Architecture Specific Data
	public static final int IMAGE_DIRECTORY_ENTRY_GLOBALPTR      = 8;   // RVA of GP
	public static final int IMAGE_DIRECTORY_ENTRY_TLS            = 9;   // TLS Directory
	public static final int IMAGE_DIRECTORY_ENTRY_LOAD_CONFIG    = 10;   // Load Configuration Directory
	public static final int IMAGE_DIRECTORY_ENTRY_BOUND_IMPORT   = 11;   // Bound Import Directory in headers
	public static final int IMAGE_DIRECTORY_ENTRY_IAT            = 12;   // Import Address Table
	public static final int IMAGE_DIRECTORY_ENTRY_DELAY_IMPORT   = 13;   // Delay Load Import Descriptors
	public static final int IMAGE_DIRECTORY_ENTRY_COM_DESCRIPTOR = 14;   // COM Runtime descriptor
	
	
	protected IMAGE_DATA_DIRECTORY DataDirectory[];
	protected Object       DirectoryEntries[];
	
	public IMAGE_OPTIONAL_HEADER32(ExecutableReader reader)
			throws Exception {
		super(reader);
	}
	

	public void read(ExecutableStream s) throws Exception {
		DataDirectory = new IMAGE_DATA_DIRECTORY[IMAGE_NUMBEROF_DIRECTORY_ENTRIES];
		DirectoryEntries = new Object[IMAGE_NUMBEROF_DIRECTORY_ENTRIES];
		Magic = s.readAddrShort();
		MajorLinkerVersion = s.readAddrByte();
		MinorLinkerVersion = s.readAddrByte();
		SizeOfCode = s.readAddrInt();
		SizeOfInitializedData = s.readAddrInt();
		SizeOfUninitializedData = s.readAddrInt();
		AddressOfEntryPoint = s.readAddrInt();
		BaseOfCode = s.readAddrInt();
		BaseOfData = s.readAddrInt();
		ImageBase = s.readAddrInt();
		SectionAlignment = s.readAddrInt();
		FileAlignment = s.readAddrInt();
		MajorOperatingSystemVersion = s.readAddrShort();
		MinorOperatingSystemVersion = s.readAddrShort();
		MajorImageVersion = s.readAddrShort();
		MinorImageVersion = s.readAddrShort();
		MajorSubsystemVersion = s.readAddrShort();
		MinorSubsystemVersion = s.readAddrShort();
		Reserved1 = s.readAddrInt();
		SizeOfImage = s.readAddrInt();
		SizeOfHeaders = s.readAddrInt();
		CheckSum = s.readAddrInt();
		Subsystem = s.readAddrShort();
		DllCharacteristics = s.readAddrShort();
		SizeOfStackReserve = s.readAddrInt();
		SizeOfStackCommit = s.readAddrInt();
		SizeOfHeapReserve = s.readAddrInt();
		SizeOfHeapCommit = s.readAddrInt();
		LoaderFlags = s.readAddrInt();
		NumberOfRvaAndSizes = s.readAddrInt();
		for (int i = 0; i < DataDirectory.length; i++)
			DataDirectory[i] = new IMAGE_DATA_DIRECTORY(reader);
	}
	
	/**
	 * Dump the Import Table (not the Hint Table) to stdout
	 */
	public void printImportTable() {
		//Exit if no import table is found
		if(DirectoryEntries[IMAGE_DIRECTORY_ENTRY_IMPORT] == null) {
			System.out.println("[*] No Import Table Entry found");
			return;
		}
		System.out.println("[*] Dumping Imports:");
		for(IMAGE_IMPORT_DESCRIPTOR desc:getImportDescriptor().getImports()) {
			try {
				System.out.println(desc.getDLLName()+":");
				IMAGE_THUNK_DATA[] thunks = desc.parseImportTable();
				//Dump THUNK_DATA[] for the current DLL
				for(IMAGE_THUNK_DATA thunk:thunks) {
					//Print out the Ordinal OR the name depending on the value within the THUNK_DATA
					if(thunk.isOrdinal())
						System.out.println("   Ordinal: "+thunk.getOrdinal());
					else
						System.out.println("   Name:    "+thunk.getName());
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	
	/**
	 * Dump the Resource Table to stdout
	 */
	public void printResourceTable() {
		//Exit if no resource table is found
		if(DirectoryEntries[IMAGE_DIRECTORY_ENTRY_RESOURCE] == null) {
			System.out.println("[*] No Resource Table Entry found");
			return;
		}
		System.out.println("[*] Dumping Resource Structure:");
		DescriptorResource res = getResourceDescriptor();
		printResourceDirectory(res.getRoot(), 0);
	}
	private void printResourceDirectory(IMAGE_RESOURCE_DIRECTORY dir, int lvl) {
		String prefix = "";
		for(int i=0;i<lvl;i++) prefix = prefix + " ";
		System.out.println(prefix+"NumberOfEntries: "+dir.getNumberOfEntries());
		for(IMAGE_RESOURCE_DIRECTORY_ENTRY entry:dir.getEntires()) {
			if(entry.isOrdinal())
				System.out.println(prefix+" ID:   "+entry.getID());
			else
				System.out.println(prefix+" Name: "+entry.getNameStr());
			if(entry.isDirectory()) {
				printResourceDirectory(entry.getDir(), lvl+1);
			}else {
				System.out.println(prefix+"  Size: "+entry.getData().getSize());
			}
		}
	}
	
	
	/**
	 * Dump the TLS (Thread Local Storage) to stdout
	 */
	public void printTLS() {
		//Exit if no import table is found
		if(DirectoryEntries[IMAGE_DIRECTORY_ENTRY_TLS] == null) {
			System.out.println("[*] No Thread Local Storage found");
			return;
		}
		System.out.println("[*] Dumping TLS:");
		System.out.println("   Size of "+(getTLSDescriptor().getTLS().getEndAddressOfRawData().getAddr64()-getTLSDescriptor().getTLS().getStartAddressOfRawData().getAddr64())+ " bytes");
		if(getTLSDescriptor().getTLSCallbacks().length == 0)
			System.out.println("   No Callbacks");
		else {
			System.out.println("   Following Callbacks are present:");
			for(int i=0;i<getTLSDescriptor().getTLSCallbacks().length;i++)
				if(reader.is32bit())
					System.out.println("      "+(i+1)+". at 0x"+Integer.toHexString(getTLSDescriptor().getTLSCallbacks()[i].getAddr32()));
				else
					System.out.println("      "+(i+1)+". at 0x"+Long.toHexString(getTLSDescriptor().getTLSCallbacks()[i].getAddr64()));
		}
	}
	
	public IMAGE_DATA_DIRECTORY[] getDataDirectory() {
		return DataDirectory;
	}
	public DescriptorImport getImportDescriptor() {
		return (DescriptorImport) DirectoryEntries[IMAGE_DIRECTORY_ENTRY_IMPORT];
	}
	public DescriptorResource getResourceDescriptor() {
		return (DescriptorResource) DirectoryEntries[IMAGE_DIRECTORY_ENTRY_RESOURCE];
	}
	public DescriptorTLS getTLSDescriptor() {
		return (DescriptorTLS) DirectoryEntries[IMAGE_DIRECTORY_ENTRY_TLS];
	}
	public Object[] getDirectoryEntries() {
		return DirectoryEntries;
	}
	/**
	 * Offset for reading the resources the correct way
	 * @return file offset to resources if they exist (0 if not)
	 */
	public int getResourceOffset() {
		return reader.rva2offset(new Address(getDataDirectory()[IMAGE_OPTIONAL_HEADER32.IMAGE_DIRECTORY_ENTRY_RESOURCE].getVirtualAddress()));
	}
	
	public boolean is32bit() { return true; }

	/**
	 * Parse Directories of the PE File <br>
	 * Current Implemented: ImportTable, ResourceTable<br>
	 * NOTE: NOT THREAD SAFE
	 * @throws Exception Something went wrong while parsing
	 */
	public void parseDirectories() {
		parseImportTable();
		parseResourceTable();
		parseTLS();
	}
	
	public void parseImportTable() {
		int temp = reader.getStream().getIndex();	
		try {
			//IMPORT DIRECTORY
			Address rva = new Address(getDataDirectory()[IMAGE_OPTIONAL_HEADER32.IMAGE_DIRECTORY_ENTRY_IMPORT].getVirtualAddress());
			
			if(!rva.isNull()) {
				reader.getStream().setIndex(reader.rva2offset(rva));
				DirectoryEntries[IMAGE_OPTIONAL_HEADER32.IMAGE_DIRECTORY_ENTRY_IMPORT] = new DescriptorImport(reader);
			}
		}catch(Exception e) {
			e.printStackTrace();
			System.err.println("Failed Reading Import Table");
		}	
		//Restore reader
		reader.getStream().setIndex(temp);
	}
	
	public void parseResourceTable() {
		int temp = reader.getStream().getIndex();	
		try {
			//RESOURCE DIRECTORY
			Address rva = new Address(getDataDirectory()[IMAGE_OPTIONAL_HEADER32.IMAGE_DIRECTORY_ENTRY_RESOURCE].getVirtualAddress());
			if(!rva.isNull()) {
				reader.getStream().setIndex(reader.rva2offset(rva));
				DirectoryEntries[IMAGE_OPTIONAL_HEADER32.IMAGE_DIRECTORY_ENTRY_RESOURCE] = new DescriptorResource(reader);
			}
		}catch(Exception e) {
			e.printStackTrace();
			System.err.println("Failed Reading Resource Table");
		}	
		//Restore reader
		reader.getStream().setIndex(temp);
	}
	
	public void parseTLS() {
		int temp = reader.getStream().getIndex();	
		try {
			//IMPORT DIRECTORY
			Address rva = new Address(getDataDirectory()[IMAGE_OPTIONAL_HEADER32.IMAGE_DIRECTORY_ENTRY_TLS].getVirtualAddress());
			
			if(!rva.isNull()) {
				reader.getStream().setIndex(reader.rva2offset(rva));
				DirectoryEntries[IMAGE_OPTIONAL_HEADER32.IMAGE_DIRECTORY_ENTRY_TLS] = new DescriptorTLS(reader);
			}
		}catch(Exception e) {
			e.printStackTrace();
			System.err.println("Failed Reading TLS Table");
		}	
		//Restore reader
		reader.getStream().setIndex(temp);
	}
	
	public short getMagic() {
		try {
			return reader.getStream().getShort(Magic);
		} catch (IOException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public void setMagic(short magic) {
		try {
			reader.getStream().setShort(Magic, magic);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
	}

	public char getMajorLinkerVersion() {
		try {
			return (char) reader.getStream().getByte(MajorLinkerVersion);
		} catch (IOException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public void setMajorLinkerVersion(char majorLinkerVersion) {
		try {
			reader.getStream().setByte(MajorLinkerVersion,
					(byte) majorLinkerVersion);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
	}

	public char getMinorLinkerVersion() {
		try {
			return (char) reader.getStream().getByte(MinorLinkerVersion);
		} catch (IOException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public void setMinorLinkerVersion(char minorLinkerVersion) {
		try {
			reader.getStream().setByte(MinorLinkerVersion,
					(byte) minorLinkerVersion);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
	}

	public int getSizeOfCode() {
		try {
			return reader.getStream().getInt(SizeOfCode);
		} catch (IOException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public void setSizeOfCode(int sizeOfCode) {
		try {
			reader.getStream().setInt(SizeOfCode, sizeOfCode);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
	}

	public int getSizeOfInitializedData() {
		try {
			return reader.getStream().getInt(SizeOfInitializedData);
		} catch (IOException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public void setSizeOfInitializedData(int sizeOfInitializedData) {
		try {
			reader.getStream().setInt(SizeOfInitializedData, sizeOfInitializedData);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
	}

	public int getSizeOfUninitializedData() {
		try {
			return reader.getStream().getInt(SizeOfUninitializedData);
		} catch (IOException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public void setSizeOfUninitializedData(int sizeOfUninitializedData) {
		try {
			reader.getStream().setInt(SizeOfUninitializedData,
					sizeOfUninitializedData);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
	}

	public int getAddressOfEntryPoint() {
		try {
			return reader.getStream().getInt(AddressOfEntryPoint);
		} catch (IOException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public void setAddressOfEntryPoint(int addressOfEntryPoint) {
		try {
			reader.getStream().setInt(AddressOfEntryPoint, addressOfEntryPoint);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
	}

	public int getBaseOfCode() {
		try {
			return reader.getStream().getInt(BaseOfCode);
		} catch (IOException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public void setBaseOfCode(int baseOfCode) {
		try {
			reader.getStream().setInt(BaseOfCode, baseOfCode);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
	}

	public int getBaseOfData() {
		try {
			return reader.getStream().getInt(BaseOfData);
		} catch (IOException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public void setBaseOfData(int baseOfData) {
		try {
			reader.getStream().setInt(BaseOfData, baseOfData);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
	}

	public int getImageBase() {
		try {
			return reader.getStream().getInt(ImageBase);
		} catch (IOException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public void setImageBase(int imageBase) {
		try {
			reader.getStream().setInt(ImageBase, imageBase);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
	}

	public int getSectionAlignment() {
		try {
			return reader.getStream().getInt(SectionAlignment);
		} catch (IOException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public void setSectionAlignment(int sectionAlignment) {
		try {
			reader.getStream().setInt(SectionAlignment, sectionAlignment);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
	}

	public int getFileAlignment() {
		try {
			return reader.getStream().getInt(FileAlignment);
		} catch (IOException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public void setFileAlignment(int fileAlignment) {
		try {
			reader.getStream().setInt(FileAlignment, fileAlignment);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
	}

	public short getMajorOperatingSystemVersion() {
		try {
			return reader.getStream().getShort(MajorOperatingSystemVersion);
		} catch (IOException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public void setMajorOperatingSystemVersion(short majorOperatingSystemVersion) {
		try {
			reader.getStream().setShort(MajorOperatingSystemVersion,
					majorOperatingSystemVersion);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
	}

	public short getMinorOperatingSystemVersion() {
		try {
			return reader.getStream().getShort(MinorOperatingSystemVersion);
		} catch (IOException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public void setMinorOperatingSystemVersion(short minorOperatingSystemVersion) {
		try {
			reader.getStream().setShort(MinorOperatingSystemVersion,
					minorOperatingSystemVersion);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
	}

	public short getMajorImageVersion() {
		try {
			return reader.getStream().getShort(MajorImageVersion);
		} catch (IOException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public void setMajorImageVersion(short majorImageVersion) {
		try {
			reader.getStream().setShort(MajorImageVersion, majorImageVersion);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
	}

	public short getMinorImageVersion() {
		try {
			return reader.getStream().getShort(MinorImageVersion);
		} catch (IOException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public void setMinorImageVersion(short minorImageVersion) {
		try {
			reader.getStream().setShort(MinorImageVersion, minorImageVersion);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
	}

	public short getMajorSubsystemVersion() {
		try {
			return reader.getStream().getShort(MajorSubsystemVersion);
		} catch (IOException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public void setMajorSubsystemVersion(short majorSubsystemVersion) {
		try {
			reader.getStream().setShort(MajorSubsystemVersion,
					majorSubsystemVersion);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
	}

	public short getMinorSubsystemVersion() {
		try {
			return reader.getStream().getShort(MinorSubsystemVersion);
		} catch (IOException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public void setMinorSubsystemVersion(short minorSubsystemVersion) {
		try {
			reader.getStream().setShort(MinorSubsystemVersion,
					minorSubsystemVersion);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
	}

	public int getReserved1() {
		try {
			return reader.getStream().getInt(Reserved1);
		} catch (IOException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public void setReserved1(int reserved1) {
		try {
			reader.getStream().setInt(Reserved1, reserved1);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
	}

	public int getSizeOfImage() {
		try {
			return reader.getStream().getInt(SizeOfImage);
		} catch (IOException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public void setSizeOfImage(int sizeOfImage) {
		try {
			reader.getStream().setInt(SizeOfImage, sizeOfImage);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
	}

	public int getSizeOfHeaders() {
		try {
			return reader.getStream().getInt(SizeOfHeaders);
		} catch (IOException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public void setSizeOfHeaders(int sizeOfHeaders) {
		try {
			reader.getStream().setInt(SizeOfHeaders, sizeOfHeaders);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
	}

	public int getCheckSum() {
		try {
			return reader.getStream().getInt(CheckSum);
		} catch (IOException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public void setCheckSum(int checkSum) {
		try {
			reader.getStream().setInt(CheckSum, checkSum);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
	}

	public short getSubsystem() {
		try {
			return reader.getStream().getShort(Subsystem);
		} catch (IOException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public void setSubsystem(short subsystem) {
		try {
			reader.getStream().setShort(Subsystem, subsystem);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
	}

	public short getDllCharacteristics() {
		try {
			return reader.getStream().getShort(DllCharacteristics);
		} catch (IOException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public void setDllCharacteristics(short dllCharacteristics) {
		try {
			reader.getStream().setShort(DllCharacteristics, dllCharacteristics);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
	}

	public int getSizeOfStackReserve() {
		try {
			return reader.getStream().getInt(SizeOfStackReserve);
		} catch (IOException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public void setSizeOfStackReserve(int sizeOfStackReserve) {
		try {
			reader.getStream().setInt(SizeOfStackReserve, sizeOfStackReserve);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
	}

	public int getSizeOfStackCommit() {
		try {
			return reader.getStream().getInt(SizeOfStackCommit);
		} catch (IOException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public void setSizeOfStackCommit(int sizeOfStackCommit) {
		try {
			reader.getStream().setInt(SizeOfStackCommit, sizeOfStackCommit);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
	}

	public int getSizeOfHeapReserve() {
		try {
			return reader.getStream().getInt(SizeOfHeapReserve);
		} catch (IOException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public void setSizeOfHeapReserve(int sizeOfHeapReserve) {
		try {
			reader.getStream().setInt(SizeOfHeapReserve, sizeOfHeapReserve);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
	}

	public int getSizeOfHeapCommit() {
		try {
			return reader.getStream().getInt(SizeOfHeapCommit);
		} catch (IOException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public void setSizeOfHeapCommit(int sizeOfHeapCommit) {
		try {
			reader.getStream().setInt(SizeOfHeapCommit, sizeOfHeapCommit);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
	}

	public int getLoaderFlags() {
		try {
			return reader.getStream().getInt(LoaderFlags);
		} catch (IOException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public void setLoaderFlags(int loaderFlags) {
		try {
			reader.getStream().setInt(LoaderFlags, loaderFlags);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
	}

	public int getNumberOfRvaAndSizes() {
		try {
			return reader.getStream().getInt(NumberOfRvaAndSizes);
		} catch (IOException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public void setNumberOfRvaAndSizes(int numberOfRvaAndSizes) {
		try {
			reader.getStream().setInt(NumberOfRvaAndSizes, numberOfRvaAndSizes);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
	}

	
	public String getSubsystemString() {
		switch (getSubsystem()) {
		case 0x0:
			return "IMAGE_SUBSYSTEM_UNKNOWN";
		case 0x1:
			return "IMAGE_SUBSYSTEM_NATIVE";
		case 0x2:
			return "IMAGE_SUBSYSTEM_WINDOWS_GUI";
		case 0x3:
			return "IMAGE_SUBSYSTEM_WINDOWS_CUI";
		case 0x7:
			return "IMAGE_SUBSYSTEM_POSIX_CUI";
		case 0x9:
			return "IMAGE_SUBSYSTEM_WINDOWS_CE_GUI";
		case 0x10:
			return "IMAGE_SUBSYSTEM_EFI_APPLICATION";
		case 0x11:
			return "IMAGE_SUBSYSTEM_EFI_BOOT_SERVICE_DRIVER";
		case 0x12:
			return "IMAGE_SUBSYSTEM_EFI_RUNTIME_DRIVER";
		case 0x13:
			return "IMAGE_SUBSYSTEM_EFI_ROM";
		case 0x14:
			return "IMAGE_SUBSYSTEM_XBOX";
		default:
			return "@Error "+Integer.toHexString(getSubsystem());
		}
	}

public static class IMAGE_DATA_DIRECTORY extends ReadableObject{
	protected int VirtualAddress;
	protected int Size;

	public IMAGE_DATA_DIRECTORY(ExecutableReader reader)
			throws Exception {
		super(reader);
	}

	public void read(ExecutableStream s) throws Exception {
		VirtualAddress = s.readAddrInt();
		Size = s.readAddrInt();
	}

	public int getVirtualAddress() {
		try {
			return reader.getStream().getInt(VirtualAddress);
		} catch (IOException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public void setVirtualAddresss(int virtualAddress) {
		try {
			reader.getStream().setInt(VirtualAddress, virtualAddress);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
	}

	public int getSize() {
		try {
			return reader.getStream().getInt(Size);
		} catch (IOException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public void setSize(int size) {
		try {
			reader.getStream().setInt(Size, size);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
	}
	
	
}



}