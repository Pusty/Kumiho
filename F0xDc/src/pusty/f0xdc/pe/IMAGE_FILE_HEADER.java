package pusty.f0xdc.pe;

import java.io.IOException;
import java.util.ArrayList;

import pusty.f0xdc.pe.ExecutableReader;
import pusty.f0xdc.ExecutableStream;
import pusty.f0xdc.ReadableObject;

public class IMAGE_FILE_HEADER extends ReadableObject {

	protected int Machine;
	protected int NumberOfSections;
	protected int TimeDateStamp;
	protected int PointerToSymbolTable;
	protected int NumberOfSymbols;
	protected int SizeOfOptionalHeader;
	protected int Characteristics;


	public IMAGE_FILE_HEADER(ExecutableReader reader)
			throws Exception {
		super(reader);
	}

	public void read(ExecutableStream s) throws Exception {
		Machine = s.readAddrShort();
		NumberOfSections = s.readAddrShort();
		TimeDateStamp = s.readAddrInt();
		PointerToSymbolTable = s.readAddrInt();
		NumberOfSymbols = s.readAddrInt();
		SizeOfOptionalHeader = s.readAddrShort();
		Characteristics = s.readAddrShort();
	}

	public short getNumberOfSections() {
		try {
			return reader.getStream().getShort(NumberOfSections);
		} catch (IOException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public void setNumberOfSections(short numberOfSections) {
		try {
			reader.getStream().setShort(NumberOfSections, numberOfSections);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
	}

	public int getTimeDateStamp() {
		try {
			return reader.getStream().getInt(TimeDateStamp);
		} catch (IOException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public void setTimeDateStamp(int timeDateStamp) {
		try {
			reader.getStream().setInt(TimeDateStamp, timeDateStamp);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
	}

	public int getPointerToSymbolTable() {
		try {
			return reader.getStream().getInt(PointerToSymbolTable);
		} catch (IOException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public void setPointerToSymbolTable(int pointerToSymbolTable) {
		try {
			reader.getStream().setInt(PointerToSymbolTable, pointerToSymbolTable);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
	}

	public int getNumberOfSymbols() {
		try {
			return reader.getStream().getInt(NumberOfSymbols);
		} catch (IOException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public void setNumberOfSymbols(int numberOfSymbols) {
		try {
			reader.getStream().setInt(NumberOfSymbols, numberOfSymbols);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
	}

	public short getSizeOfOptionalHeader() {
		try {
			return reader.getStream().getShort(SizeOfOptionalHeader);
		} catch (IOException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public void setSizeOfOptionalHeader(short sizeOfOptionalHeader) {
		try {
			reader.getStream().setShort(SizeOfOptionalHeader, sizeOfOptionalHeader);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
	}

	public short getCharacteristics() {
		try {
			return reader.getStream().getShort(Characteristics);
		} catch (IOException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public void setCharacteristics(short characteristics) {
		try {
			reader.getStream().setShort(Characteristics, characteristics);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
	}

	public short getMachine() {
		try {
			return reader.getStream().getShort(Machine);
		} catch (IOException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public void setMachine(short machine) {
		try {
			reader.getStream().setShort(Machine, machine);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
	}

	public static final short IMAGE_FILE_MACHINE_UNKNOWN = 0x0;
	public static final short IMAGE_FILE_MACHINE_ALPHA = 0x184;
	public static final short IMAGE_FILE_MACHINE_ARM = 0x1c0;  /* ARM little endian */
	public static final short IMAGE_FILE_MACHINE_ALPHA64 = 0x284;
	public static final short IMAGE_FILE_MACHINE_I386 = 0x14c; /* Intel 386 or later processors and compatible processors */
	public static final short IMAGE_FILE_MACHINE_IA64 = 0x200; /* Intel Itanium processor family */
	public static final short IMAGE_FILE_MACHINE_M68K = 0x268; 
	public static final short IMAGE_FILE_MACHINE_MIPS16 = 0x266; /* MIPS16 */
	public static final short IMAGE_FILE_MACHINE_MIPSFPU = 0x366; /* MIPS with FPU */
	public static final short IMAGE_FILE_MACHINE_MIPSFPU16 = 0x466; /* MIPS16 with FPU */
	public static final short IMAGE_FILE_MACHINE_POWERPC = 0x1f0; /* Power PC little endian */
	public static final short IMAGE_FILE_MACHINE_R3000 = 0x162;
	public static final short IMAGE_FILE_MACHINE_R4000 = 0x166;
	public static final short IMAGE_FILE_MACHINE_R10000 = 0x168;
	public static final short IMAGE_FILE_MACHINE_SH3 = 0x1a2; /* Hitachi SH3 */
	public static final short IMAGE_FILE_MACHINE_SH4 = 0x1a6; /* Hitachi SH4 */
	public static final short IMAGE_FILE_MACHINE_THUMB = 0x1c2; /* Thumb */
	public static final short IMAGE_FILE_MACHINE_AMD64 = (short) 0x8664; /* x64 */
	
	public String getMachineString() {
		switch (getMachine()) {
		case IMAGE_FILE_MACHINE_UNKNOWN:
			return "IMAGE_FILE_MACHINE_UNKNOWN";
		case IMAGE_FILE_MACHINE_ALPHA:
			return "IMAGE_FILE_MACHINE_ALPHA";
		case IMAGE_FILE_MACHINE_ARM:
			return "IMAGE_FILE_MACHINE_ARM"; /* ARM little endian */
		case IMAGE_FILE_MACHINE_ALPHA64:
			return "IMAGE_FILE_MACHINE_ALPHA64";
		case IMAGE_FILE_MACHINE_I386:
			return "IMAGE_FILE_MACHINE_I386"; /* Intel 386 or later processors and compatible processors */
		case IMAGE_FILE_MACHINE_IA64:
			return "IMAGE_FILE_MACHINE_IA64"; /* Intel Itanium processor family */
		case IMAGE_FILE_MACHINE_M68K:
			return "IMAGE_FILE_MACHINE_M68K";
		case IMAGE_FILE_MACHINE_MIPS16:
			return "IMAGE_FILE_MACHINE_MIPS16"; /* MIPS16 */
		case IMAGE_FILE_MACHINE_MIPSFPU:
			return "IMAGE_FILE_MACHINE_MIPSFPU";  /* MIPS with FPU */
		case IMAGE_FILE_MACHINE_MIPSFPU16:
			return "IMAGE_FILE_MACHINE_MIPSFPU16"; /* MIPS16 with FPU */
		case IMAGE_FILE_MACHINE_POWERPC:
			return "IMAGE_FILE_MACHINE_POWERPC"; /* Power PC little endian */
		case IMAGE_FILE_MACHINE_R3000:
			return "IMAGE_FILE_MACHINE_R3000";
		case IMAGE_FILE_MACHINE_R4000:
			return "IMAGE_FILE_MACHINE_R4000"; /* MIPS little endian */
		case IMAGE_FILE_MACHINE_R10000:
			return "IMAGE_FILE_MACHINE_R10000";
		case IMAGE_FILE_MACHINE_SH3:
			return "IMAGE_FILE_MACHINE_SH3"; /* Hitachi SH3 */
		case IMAGE_FILE_MACHINE_SH4:
			return "IMAGE_FILE_MACHINE_SH4"; /* Hitachi SH4 */
		case IMAGE_FILE_MACHINE_THUMB:
			return "IMAGE_FILE_MACHINE_THUMB"; /* Thumb */
		case IMAGE_FILE_MACHINE_AMD64:
			return "IMAGE_FILE_MACHINE_AMD64"; /* x64 */
		default:
			return "@Error "+Integer.toHexString(getMachine());
		}
	}

	public ArrayList<String> printCharacteristics() {
		ArrayList<String> list = new ArrayList<String>();
		short temp = getCharacteristics();
		if ((temp & 0x0001) != 0)
			list.add("IMAGE_FILE_RELOCS_STRIPPED");
		if ((temp & 0x0002) != 0)
			list.add("IMAGE_FILE_EXECUTABLE_IMAGE");
		if ((temp & 0x0004) != 0)
			list.add("IMAGE_FILE_LINE_NUMS_STRIPPED");
		if ((temp & 0x0008) != 0)
			list.add("IMAGE_FILE_LOCAL_SYMS_STRIPPED");
		if ((temp & 0x0010) != 0)
			list.add("IMAGE_FILE_AGGRESSIVE_WS_TRIM");
		if ((temp & 0x0020) != 0)
			list.add("IMAGE_FILE_LARGE_ADDRESS_AWARE");
		if ((temp & 0x0040) != 0)
			list.add("IMAGE_FILE_16BIT_MACHINE");
		if ((temp & 0x0080) != 0)
			list.add("IMAGE_FILE_BYTES_REVERSED_LO");
		if ((temp & 0x0100) != 0)
			list.add("IMAGE_FILE_32BIT_MACHINE");
		if ((temp & 0x0200) != 0)
			list.add("IMAGE_FILE_DEBUG_STRIPPED");
		if ((temp & 0x0400) != 0)
			list.add("IMAGE_FILE_REMOVABLE_RUN_FROM_SWAP");
		if ((temp & 0x1000) != 0)
			list.add("IMAGE_FILE_SYSTEM");
		if ((temp & 0x2000) != 0)
			list.add("IMAGE_FILE_DLL");
		if ((temp & 0x4000) != 0)
			list.add("IMAGE_FILE_UP_SYSTEM_ONLY");
		return list;
	}

}
