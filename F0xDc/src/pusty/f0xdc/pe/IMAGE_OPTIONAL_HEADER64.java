package pusty.f0xdc.pe;

import java.io.IOException;

import pusty.f0xdc.pe.ExecutableReader;
import pusty.f0xdc.ExecutableStream;

public class IMAGE_OPTIONAL_HEADER64 extends IMAGE_OPTIONAL_HEADER32 {

	//See PEOptionHeader for documentation, almost the same
	protected int ImageBase64;
	
	protected int SizeOfStackReserve64;
	protected int SizeOfStackCommit64;
	protected int SizeOfHeapReserve64;
	protected int SizeOfHeapCommit64;
	

	public IMAGE_OPTIONAL_HEADER64(ExecutableReader reader)
			throws Exception {
		super(reader);
	}
	@Override
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
		ImageBase64 = s.readAddrLong();
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
		SizeOfStackReserve64 = s.readAddrLong();
		SizeOfStackCommit64 = s.readAddrLong();
		SizeOfHeapReserve64 = s.readAddrLong();
		SizeOfHeapCommit64 = s.readAddrLong();
		LoaderFlags = s.readAddrInt();
		NumberOfRvaAndSizes = s.readAddrInt();
		for (int i = 0; i < DataDirectory.length; i++)
			DataDirectory[i] = new IMAGE_DATA_DIRECTORY(reader);
		

	}
	@Override
	public boolean is32bit() { return false; }
	
	public long getImageBase64() {
		try {
			return reader.getStream().getLong(ImageBase64);
		} catch (IOException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public void setImageBase64(short imageBase64) {
		try {
			reader.getStream().setLong(ImageBase64, imageBase64);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
	}
	
	
	public long getSizeOfStackReserve64() {
		try {
			return reader.getStream().getLong(SizeOfStackReserve64);
		} catch (IOException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public void setSizeOfStackReserve64(short sizeOfStackReserve64) {
		try {
			reader.getStream().setLong(SizeOfStackReserve64, sizeOfStackReserve64);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
	}
	
	public long getSizeOfStackCommit64() {
		try {
			return reader.getStream().getLong(SizeOfStackCommit64);
		} catch (IOException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public void setSizeOfStackCommit64(short sizeOfStackCommit64) {
		try {
			reader.getStream().setLong(SizeOfStackCommit64, sizeOfStackCommit64);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
	}
	
	public long getSizeOfHeapReserve64() {
		try {
			return reader.getStream().getLong(SizeOfHeapReserve64);
		} catch (IOException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public void setSizeOfHeapReserve64(short sizeOfHeapReserve64) {
		try {
			reader.getStream().setLong(SizeOfHeapReserve64, sizeOfHeapReserve64);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
	}
	
	public long getSizeOfHeapCommit64() {
		try {
			return reader.getStream().getLong(SizeOfHeapCommit64);
		} catch (IOException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public void setSizeOfHeapCommit64(short sizeOfHeapCommit64) {
		try {
			reader.getStream().setLong(SizeOfHeapCommit64, sizeOfHeapCommit64);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
	}

	
}
