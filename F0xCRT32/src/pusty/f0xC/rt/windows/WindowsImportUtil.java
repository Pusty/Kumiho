package pusty.f0xC.rt.windows;

import pusty.f0xC.lang.OverrideHandler.ExternalProperty;
import pusty.f0xC.lang.OverrideHandler.TranslationProperty;
import pusty.f0xC.x86.internal.InternalObject;
import pusty.f0xC.libc.LibC;

public class WindowsImportUtil {
	
	@TranslationProperty(property=TranslationProperty.EXTERNAL_STDCALL)
	@ExternalProperty(property=ExternalProperty.IMPORT, parent="USER32", key="MessageBoxA")
	public static native boolean MessageBoxA(int type, int str2, int str1, int hwnd);

	public static boolean MessageBox(int hwnd, String string, String string2, int type) {
		return MessageBoxA(type,InternalObject.arr2int(LibC.JString2CString(string2)),InternalObject.arr2int(LibC.JString2CString(string)),hwnd);
	}
	
}
