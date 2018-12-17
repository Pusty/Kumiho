package kumiho.main;

import pusty.f0xC.x86.internal.Internal;

public class KumihoPEReader {
	public short e_magic; //MZ magic
	public int e_lfanew;
	public int pe_magic;  //PE magic
	public short NumberOfSections;
	public short SizeOfOptionalHeader;
	public short Magic; //PE or PE+
	public int AddressOfEntryPoint;
	public int ImageBase;
	public int SizeOfImage;
	public int SizeOfHeaders;
	public int ImageDirectoryEntryExport;
	public int ImageDirectoryEntryImport;
	public int ImageDirectoryEntryTLS;
	
	public int[] VirtualSize;
	public int[] VirtualAddress;
	public int[] SizeOfRawData;
	public int[] PointerToRawData;
	
	public KumihoPEReader(int addr) {
		e_magic = (short)Internal.rawMemoryReadInt(addr); //DOS
		if(e_magic != 0x5a4d) {
			System.out.println("No MZ Header found");
			return;
		}
		e_lfanew = Internal.rawMemoryReadInt(addr+0x3C);
		pe_magic = Internal.rawMemoryReadInt(addr+e_lfanew);
		if(pe_magic != 0x4550) {
			System.out.println("No PE Header found");
			return;
		}
		NumberOfSections = (short)Internal.rawMemoryReadInt(addr+e_lfanew+0x6);
		SizeOfOptionalHeader = (short)Internal.rawMemoryReadInt(addr+e_lfanew+0x14);
		
		Magic = (short)Internal.rawMemoryReadInt(addr+e_lfanew+0x18);
		AddressOfEntryPoint = Internal.rawMemoryReadInt(addr+e_lfanew+0x28);
		ImageBase  = Internal.rawMemoryReadInt(addr+e_lfanew+0x34);
		SizeOfImage = Internal.rawMemoryReadInt(addr+e_lfanew+0x50);
		SizeOfHeaders = Internal.rawMemoryReadInt(addr+e_lfanew+0x54);
		
		ImageDirectoryEntryExport = Internal.rawMemoryReadInt(addr+e_lfanew+0x78);
		ImageDirectoryEntryImport = Internal.rawMemoryReadInt(addr+e_lfanew+0x80);
		ImageDirectoryEntryTLS    = Internal.rawMemoryReadInt(addr+e_lfanew+0xC0);
		
		VirtualSize = new int[NumberOfSections];
		VirtualAddress = new int[NumberOfSections];
		SizeOfRawData = new int[NumberOfSections];
		PointerToRawData = new int[NumberOfSections];
		
		for(int i=0;i<NumberOfSections;i++) {
			int sectionOffset = addr+e_lfanew+0xF8+0x28*i;
			VirtualSize[i] = Internal.rawMemoryReadInt(sectionOffset+0x8);
			VirtualAddress[i] = Internal.rawMemoryReadInt(sectionOffset+0xC);
			SizeOfRawData[i] = Internal.rawMemoryReadInt(sectionOffset+0x10);
			PointerToRawData[i] = Internal.rawMemoryReadInt(sectionOffset+0x14);
		}
	}

	public static int readInt(byte[] a, int i) {
		return  (((int)(a[i+3]&0xFF) << 24) + ((int)(a[i+2]&0xFF) << 16) + ((int)(a[i+1]&0xFF) << 8) + ((int)(a[i]&0xFF) << 0));
	}
	public KumihoPEReader(byte[] rawFile) {
		e_magic = (short)readInt(rawFile, 0); //DOS
		if(e_magic != 0x5a4d) {
			System.out.println("No MZ Header found");
			return;
		}
		e_lfanew = readInt(rawFile,0x3C);
		pe_magic = readInt(rawFile,e_lfanew);
		if(pe_magic != 0x4550) {
			System.out.println("No PE Header found");
			return;
		}
		NumberOfSections = (short)readInt(rawFile,e_lfanew+0x6);
		SizeOfOptionalHeader = (short)readInt(rawFile,e_lfanew+0x14);
		
		Magic = (short)readInt(rawFile,e_lfanew+0x18);
		AddressOfEntryPoint = readInt(rawFile,e_lfanew+0x28);
		ImageBase  = readInt(rawFile,e_lfanew+0x34);
		SizeOfImage = readInt(rawFile,e_lfanew+0x50);
		SizeOfHeaders = readInt(rawFile,e_lfanew+0x54);
		
		ImageDirectoryEntryExport = readInt(rawFile,e_lfanew+0x78);
		ImageDirectoryEntryImport = readInt(rawFile,e_lfanew+0x80);
		ImageDirectoryEntryTLS    = readInt(rawFile,e_lfanew+0xC0);
		
		VirtualSize = new int[NumberOfSections];
		VirtualAddress = new int[NumberOfSections];
		SizeOfRawData = new int[NumberOfSections];
		PointerToRawData = new int[NumberOfSections];
		
		for(int i=0;i<NumberOfSections;i++) {
			int sectionOffset = e_lfanew+0xF8+0x28*i;
			VirtualSize[i] = readInt(rawFile,sectionOffset+0x8);
			VirtualAddress[i] = readInt(rawFile,sectionOffset+0xC);
			SizeOfRawData[i] = readInt(rawFile,sectionOffset+0x10);
			PointerToRawData[i] = readInt(rawFile,sectionOffset+0x14);
		}
	}
}
