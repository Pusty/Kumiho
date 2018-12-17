package kumiho.main;

import kumiho.crypto.QuickLZ;
import kumiho.crypto.XTEA;
import pusty.f0xC.lang.OverrideHandler.TranslationProperty;
import pusty.f0xC.x86.internal.Internal;
import pusty.f0xC.x86.internal.InternalObject;

public class Kumiho {

	public static byte[] rawFile;
	
	//@TranslationProperty(property = TranslationProperty.INTERNAL_NOGBC)
	public static void initFile() {
		int size = Internal.rawMemoryReadInt(addrIncludeLen());
		int currentAddress = addrInclude();
		byte[] raw = new byte[size];
		for(int i=0;i<size;i++)
			raw[i] = Internal.staticReadByte(currentAddress+i);
		
		byte[] xteaOut = new byte[size];
		XTEA xtea = new XTEA();
		xtea.setKey("0123456789ABCDEF".getBytes());
		xtea.decrypt(raw, xteaOut, 0, size);
		//rawFile = xteaOut;
		rawFile = QuickLZ.decompress(xteaOut);
	}
	
	@TranslationProperty(property = TranslationProperty.INTERNAL_NOGBC)
	public static void freeFile() {
		int a = InternalObject.getRef(rawFile);
		for(int i=0;i<a;i++)
			Internal.free_memory(rawFile);
	}
	
	
	//ok now the question is how to actually "load" the included binary?
	//through F0xDc? custom structures?
	
	@TranslationProperty(property = TranslationProperty.NO_FRAME)
	public static int addrIncludeLen() { return 0;}
	@TranslationProperty(property = TranslationProperty.NO_FRAME)
	public static int addrInclude() { return 0;}
	
	@TranslationProperty(property = TranslationProperty.NO_FRAME)
	public static int addrStartFree() { return 0;}
	
	@TranslationProperty(property = TranslationProperty.NO_FRAME)
	public static void jumpOut(int pos) {}
	@TranslationProperty(property = TranslationProperty.NO_FRAME)
	public static void callOut(int pos) {}
	@TranslationProperty(property = TranslationProperty.NO_FRAME)
	public static void callTLS(int pos, int base, int type, int resv) {}

	public static void hookExitProcess(int exitCode) {
		System.out.println();
		System.out.println("Exit Process Hook Called!");
		//LibC.exit(0);
		Internal.setReturnAddress(Kumiho.addrStartFree());
	}
	@TranslationProperty(property = TranslationProperty.NO_FRAME)
	public static int hookExitProcessAddr() { return 0;	}
}
