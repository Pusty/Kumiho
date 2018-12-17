package pusty.f0xC.x64;

import pusty.f0xC.F0xUtil;

public class StringConfig64 {
	
	public static final String class_Internal = "pusty/f0xC/x64/internal/Internal";
	public static final String class_InternalObject = "pusty/f0xC/x64/internal/InternalObject";
	
	public static String strInternal() {
		return class_Internal;
	}
	public static String strInternalObject() {
		return class_InternalObject;
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
	public static String strInternalOutOfBounds() {
		return strInternal()+".arrayOutOfBounds__Ljava_lang_ObjectI_V";
	}
	public static String strInternalMarkAddress() {
		return strInternal()+".markAddress__V";
	}	
	public static String strGarbageCollectWrapper() {
		return strInternal()+".garbage_collect_wrapper_J_V";
	}
	public static String strGarbageCollect() {
		return strInternal()+".garbage_collect_J_V";
	}
	public static String strGarbageRegister() {
		return strInternal()+".garbage_register_Ljava_lang_ObjectJ_V";
	}
	public static String strGarbageEnable() {
		return strInternal()+".garbage_enable_J_V";
	}
	public static String strGarbageDisable() {
		return strInternal()+".garbage_disable_J_V";
	}
	public static String strDeleteGB() {
		return strInternal()+".deleteGB__V";
	}
	public static String strCreateGB() {
		return strInternal()+".createGB__V";
	}
	
	public static String strVarFreedMemory() {
		return F0xUtil.formatVariable(strInternal()+".freedMemory");
	}
	public static String strVarAllocMemory() {
		return F0xUtil.formatVariable(strInternal()+".allocMemory");
	}
	public static String strVarFreeCalls() {
		return F0xUtil.formatVariable(strInternal()+".freeCalls");
	}
	public static String strVarAllocCalls() {
		return F0xUtil.formatVariable(strInternal()+".allocCalls");
	}
	
}

