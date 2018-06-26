package pusty.f0xC.imports;

import pusty.f0xC.lang.OverrideHandler.ExternalProperty;

public class LibC {

	//@TranslationProperty(property = TranslationProperty.EXTERNAL_CCALL) //this is implied for all external calls, needs to be explicit if default calling convention changes
	@ExternalProperty(property = ExternalProperty.IMPORT, parent = "msvcrt", key = "malloc")
	public static native int native_malloc(int size);

	@ExternalProperty(property = ExternalProperty.IMPORT, parent = "msvcrt", key = "free")
	public static native void native_free(int object);

	@ExternalProperty(property = ExternalProperty.IMPORT, parent = "msvcrt", key = "exit")
	public static native void native_exit(int i);

	@ExternalProperty(property = ExternalProperty.IMPORT, parent = "msvcrt", key = "printf")
	public static native void libc_printf();

	public static Object malloc(int size) {
		return InternalObject.int2obj(native_malloc(size));
	}

	public static void free(Object o) {
		native_free(InternalObject.obj2int(o));
	}

	public static void exit(int i) {
		native_exit(i);
	}

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

}
