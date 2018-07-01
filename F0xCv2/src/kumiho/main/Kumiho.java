package kumiho.main;

import pusty.f0xC.imports.Internal;
import pusty.f0xC.lang.OverrideHandler.TranslationProperty;

public class Kumiho {

	public static byte[] rawFile;
	
//	@TranslationProperty(property = TranslationProperty.INTERNAL_NOGBC)
	public static void initFile() {
		int size = Internal.rawMemoryReadInt(addrIncludeLen());
		int currentAddress = addrInclude();
		byte[] raw = new byte[size];
		for(int i=0;i<size;i++)
			raw[i] = Internal.rawMemoryReadByte(currentAddress+i);
		
		byte[] xteaOut = new byte[size];
		XTEA xtea = new XTEA();
		xtea.setKey("0123456789ABCDEF".getBytes());
		xtea.decrypt(raw, xteaOut, 0, size);
		rawFile = xteaOut;
		//rawFile = QuickLZ.decompress(xteaOut);
	}
	
	@TranslationProperty(property = TranslationProperty.INTERNAL_NOGBC)
	public static void freeFile() {
		Internal.free_memory(rawFile);
	}
	
	
	//ok now the question is how to actually "load" the included binary?
	//through F0xDc? custom structures?
	
	@TranslationProperty(property = TranslationProperty.NO_FRAME)
	public static int addrIncludeLen() { return 0;}
	@TranslationProperty(property = TranslationProperty.NO_FRAME)
	public static int addrInclude() { return 0;}
}
