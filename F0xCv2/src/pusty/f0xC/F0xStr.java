package pusty.f0xC;

public class F0xStr {
	public static String strInternal() {
		return "pusty/f0xC/imports/Internal";
	}
	public static String strInternalFreeMemory() {
		return strInternal()+".free_memory_Ljava_lang_Object_V";
	}
	public static String strInternalExit() {
		return strInternal()+".exit_I_V";
	}
	public static String strInternalDiagnostics() {
		return strInternal()+".diagnostics__V";
	}
	public static String strInternalAllocateMemory() {
		return strInternal()+".allocate_memory_II_Ljava_lang_Object";
	}
	public static String strInternalIncMemory() {
		return strInternal()+".inc_memory_Ljava_lang_Object_V";
	}
	public static String strInternalStringTableInit() {
		return strInternal()+".initStringTable__V";
	}
	public static String strInternalStringTableFree() {
		return strInternal()+".freeStringTable__V";
	}
	public static String strInternalException() {
		return strInternal()+".exception_Ljava_lang_Exception_V";
	}
	public static String strInternalMarkAddress() {
		return strInternal()+".markAddress__V";
	}
}
