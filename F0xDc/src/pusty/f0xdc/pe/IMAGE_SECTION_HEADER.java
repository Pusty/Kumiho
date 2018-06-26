package pusty.f0xdc.pe;

import java.io.IOException;
import java.util.ArrayList;

import pusty.f0xdc.pe.ExecutableReader;
import pusty.f0xdc.ExecutableStream;
import pusty.f0xdc.ReadableObject;


public class IMAGE_SECTION_HEADER extends ReadableObject {
	
	private static final int IMAGE_SIZEOF_SHORT_NAME = 8;
    protected int[] NameData;
    protected int VirtualSize;
    protected int VirtualAddress;
    protected int SizeOfRawData;
    protected int PointerToRawData;
    protected int PointerToRelocations;
    protected int PointerToLinenumbers;
    protected int NumberOfRelocations;
    protected int NumberOfLinenumbers;
    protected int Characteristics;

	public IMAGE_SECTION_HEADER(ExecutableReader reader) throws Exception {
		super(reader);
	}
	public void read(ExecutableStream s) throws Exception {
		NameData = new int[IMAGE_SIZEOF_SHORT_NAME];
		for(int i=0;i<NameData.length;i++)
			NameData[i] = s.readAddrByte();
		VirtualSize = s.readAddrInt();
		VirtualAddress = s.readAddrInt();
		SizeOfRawData = s.readAddrInt();
		PointerToRawData = s.readAddrInt();
		PointerToRelocations = s.readAddrInt();
		PointerToLinenumbers = s.readAddrInt();
		NumberOfRelocations = s.readAddrShort();
		NumberOfLinenumbers = s.readAddrShort();
		Characteristics = s.readAddrInt();

	}
	public byte[] getNameData() {
		try {
			byte[] output = new byte[this.NameData.length];
			for(int i=0;i<this.NameData.length;i++)
				output[i] = reader.getStream().getByte(this.NameData[i]);
			return output;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	public void setNameData(byte[] nameData) {
		try {
			for(int i=0;i<this.NameData.length;i++)
				reader.getStream().setByte(this.NameData[i], nameData[i]);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
	}
	public int getVirtualSize() {
		try {
			return reader.getStream().getInt(VirtualSize);
		} catch (IOException e) {
			e.printStackTrace();
			return 0;
		}
	}
	public void setVirtualSize(int virtualSize) {
		try {
			reader.getStream().setInt(VirtualSize, virtualSize);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
	}
	public int getVirtualAddress() {
		try {
			return reader.getStream().getInt(VirtualAddress);
		} catch (IOException e) {
			e.printStackTrace();
			return 0;
		}
	}
	public void setVirtualAddress(int virtualAddress) {
		try {
			reader.getStream().setInt(VirtualAddress, virtualAddress);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
	}
	public int getSizeOfRawData() {
		try {
			return reader.getStream().getInt(SizeOfRawData);
		} catch (IOException e) {
			e.printStackTrace();
			return 0;
		}
	}
	public void setSizeOfRawData(int sizeOfRawData) {
		try {
			reader.getStream().setInt(SizeOfRawData, sizeOfRawData);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
	}
	public int getPointerToRawData() {
		try {
			return reader.getStream().getInt(PointerToRawData);
		} catch (IOException e) {
			e.printStackTrace();
			return 0;
		}
	}
	public void setPointerToRawData(int pointerToRawData) {
		try {
			reader.getStream().setInt(PointerToRawData, pointerToRawData);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
	}
	public int getPointerToRelocations() {
		try {
			return reader.getStream().getInt(PointerToRelocations);
		} catch (IOException e) {
			e.printStackTrace();
			return 0;
		}
	}
	public void setPointerToRelocations(int pointerToRelocations) {
		try {
			reader.getStream().setInt(PointerToRelocations, pointerToRelocations);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
	}
	public int getPointerToLinenumbers() {
		try {
			return reader.getStream().getInt(PointerToLinenumbers);
		} catch (IOException e) {
			e.printStackTrace();
			return 0;
		}
	}
	public void setPointerToLinenumbers(int pointerToLinenumbers) {
		try {
			reader.getStream().setInt(PointerToLinenumbers, pointerToLinenumbers);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
	}
	public short getNumberOfRelocations() {
		try {
			return reader.getStream().getShort(NumberOfRelocations);
		} catch (IOException e) {
			e.printStackTrace();
			return 0;
		}
	}
	public void setNumberOfRelocations(short numberOfRelocations) {
		try {
			reader.getStream().setShort(NumberOfRelocations, numberOfRelocations);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
	}
	public short getNumberOfLinenumbers() {
		try {
			return reader.getStream().getShort(NumberOfLinenumbers);
		} catch (IOException e) {
			e.printStackTrace();
			return 0;
		}
	}
	public void setNumberOfLinenumbers(short numberOfLinenumbers) {
		try {
			reader.getStream().setShort(NumberOfLinenumbers, numberOfLinenumbers);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
	}
	public int getCharacteristics() {
		try {
			return reader.getStream().getInt(Characteristics);
		} catch (IOException e) {
			e.printStackTrace();
			return 0;
		}
	}
	public void setCharacteristics(int characteristics) {
		try {
			reader.getStream().setInt(Characteristics, characteristics);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
	}
	
	public static final int IMAGE_SCN_MEM_EXECUTE = 0x20000000;
	public static final int IMAGE_SCN_MEM_READ = 0x40000000;
	public static final int IMAGE_SCN_MEM_WRITE = 0x80000000;
	public static final int IMAGE_SCN_MEM_SHARED = 0x10000000;
	public static final int IMAGE_SCN_CNT_UNINITIALIZED_DATA = 0x00000080;
	public static final int IMAGE_SCN_CNT_INITIALIZED_DATA = 0x00000040;
	public static final int IMAGE_SCN_CNT_CODE = 0x00000020;
	
	public ArrayList<String> printCharacteristics() {
		ArrayList<String> list = new ArrayList<String>();
		int temp = getCharacteristics();
		if ((temp & IMAGE_SCN_MEM_EXECUTE) != 0)
			list.add("IMAGE_SCN_MEM_EXECUTE");
		if ((temp & IMAGE_SCN_MEM_READ) != 0)
			list.add("IMAGE_SCN_MEM_READ");
		if ((temp & IMAGE_SCN_MEM_WRITE) != 0)
			list.add("IMAGE_SCN_MEM_WRITE");
		if ((temp & IMAGE_SCN_MEM_SHARED) != 0)
			list.add("IMAGE_SCN_MEM_SHARED");
		if ((temp & IMAGE_SCN_CNT_UNINITIALIZED_DATA) != 0)
			list.add("IMAGE_SCN_CNT_UNINITIALIZED_DATA");
		if ((temp & IMAGE_SCN_CNT_INITIALIZED_DATA) != 0)
			list.add("IMAGE_SCN_CNT_INITIALIZED_DATA");
		if ((temp & IMAGE_SCN_CNT_CODE) != 0)
			list.add("IMAGE_SCN_CNT_CODE");
		//MAYBE ADD MORE IF NEEDED
		return list;
	}

	public String getName() {
		return new String(getNameData());
	}
	public void setName(String name) {
		byte[] data = new byte[IMAGE_SIZEOF_SHORT_NAME];
		for(int i=0;i<IMAGE_SIZEOF_SHORT_NAME;i++)
			data[i] = (byte) (i>=name.length()?0:name.charAt(i));
		this.setNameData(data);
	}
}
