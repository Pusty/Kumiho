package pusty.f0xC.x64.libc;

import pusty.f0xC.lang.OverrideHandler.ExternalProperty;
import pusty.f0xC.lang.OverrideHandler.OverrideTranslation;
import pusty.f0xC.x64.internal.Internal;

@OverrideTranslation(override = "pusty/f0xC/libc/LibC")
public class OLibC {

	//@TranslationProperty(property = TranslationProperty.EXTERNAL_CCALL) //this is implied for all external calls, needs to be explicit if default calling convention changes
	@ExternalProperty(property = ExternalProperty.IMPORT, parent = "msvcrt", key = "printf")
	public static native void libc_printf();

	// TODO: move this
	public static byte[] JString2CString(String str) {
		if(str == null) return null;
		byte[] asciiStr = new byte[str.length() + 1];
		for (int i = 0; i < str.length(); i++)
			asciiStr[i] = (byte) str.charAt(i);
		asciiStr[str.length()] = 0;
		return asciiStr;
	}

	public static byte[] JString2WString(String str) {
		if(str == null) return null;
		byte[] wideStr = new byte[(str.length() + 1) * 2];
		for (int i = 0; i < str.length(); i++) {
			wideStr[i * 2] = 0;
			wideStr[i * 2 + 1] = (byte) str.charAt(i);
		}
		wideStr[wideStr.length - 1] = 0;
		wideStr[wideStr.length] = 0;
		return wideStr;
	}

	public static String CString2JString64(long address) {
		int size = 0;
		while(Internal.rawMemoryReadByte(address+size)!=0)size++;
		if(size == 0) return null;
		byte[] asciiStr = new byte[size];
		for(int i=0;i<size;i++)
			asciiStr[i] = Internal.rawMemoryReadByte(address+i);
		return new String(asciiStr);
	}
}
