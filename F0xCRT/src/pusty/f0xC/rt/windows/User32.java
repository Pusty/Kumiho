package pusty.f0xC.rt.windows;


import pusty.f0xC.imports.InternalObject;
import pusty.f0xC.imports.LibC;
import pusty.f0xC.lang.OverrideHandler.ExternalProperty;
import pusty.f0xC.lang.OverrideHandler.TranslationProperty;
import pusty.f0xC.rt.windows.WinStruct.*;

public class User32 {
	
	@TranslationProperty(property=TranslationProperty.EXTERNAL_STDCALL)
	@ExternalProperty(property=ExternalProperty.IMPORT, parent="user32", key="FindWindowA")
	public static native int _FindWindowA(int lpWindowName, int lpClassName);
	
	
	public static HWND FindWindow(String lpClassName, String lpWindowName) {
		return new HWND(_FindWindowA(
				InternalObject.arr2int(LibC.JString2CString(lpWindowName)),
				InternalObject.arr2int(LibC.JString2CString(lpClassName))
				));
	}
	
	@TranslationProperty(property=TranslationProperty.EXTERNAL_STDCALL)
	@ExternalProperty(property=ExternalProperty.IMPORT, parent="user32", key="GetWindowThreadProcessId")
	public static native int _GetWindowThreadProcessId(int lpdwProcessId, int hWnd);
	
	public static int GetWindowThreadProcessId(HWND hWnd, Integer lpdwProcessId) {
		return _GetWindowThreadProcessId(InternalObject.con2int(lpdwProcessId), hWnd.handle);
	}

}
