package pusty.f0xC.x86.libc;

import pusty.f0xC.lang.OverrideHandler.ExternalProperty;
import pusty.f0xC.lang.OverrideHandler.OverrideTranslation;
import pusty.f0xC.libc.LibC;
import pusty.f0xC.x86.internal.InternalObject;

@OverrideTranslation(override = "pusty/f0xC/libc/CStdlib")
public class OCStdlib {
	
	public static final int NULL = 0;
	public static final int EXIT_SUCCESS = 0;
	public static final int EXIT_FAILURE = 1;
	public static final int RAND_MAX = 0x7FFF;

	@ExternalProperty(property = ExternalProperty.IMPORT, parent = "msvcrt", key = "malloc")
	public static native int native_malloc(int size);

	@ExternalProperty(property = ExternalProperty.IMPORT, parent = "msvcrt", key = "free")
	public static native void native_free(int object);

	@ExternalProperty(property = ExternalProperty.IMPORT, parent = "msvcrt", key = "exit")
	public static native void native_exit(int i);
	
	@ExternalProperty(property = ExternalProperty.IMPORT, parent = "msvcrt", key = "calloc")
	public static native int native_calloc(int size, int nitems);
	
	@ExternalProperty(property = ExternalProperty.IMPORT, parent = "msvcrt", key = "abort")
	public static native void native_abort();
	
	@ExternalProperty(property = ExternalProperty.IMPORT, parent = "msvcrt", key = "realloc")
	public static native int native_realloc(int size, int ptr);
	
	@ExternalProperty(property = ExternalProperty.IMPORT, parent = "msvcrt", key = "getenv")
	public static native int native_getenv(int ptr_name);
	
	@ExternalProperty(property = ExternalProperty.IMPORT, parent = "msvcrt", key = "system")
	public static native int native_system(int ptr_command);
	
	@ExternalProperty(property = ExternalProperty.IMPORT, parent = "msvcrt", key = "abs")
	public static native int native_abs(int x);
	
	@ExternalProperty(property = ExternalProperty.IMPORT, parent = "msvcrt", key = "srand")
	public static native void native_srand(int seed);
	
	@ExternalProperty(property = ExternalProperty.IMPORT, parent = "msvcrt", key = "rand")
	public static native int native_rand();

	public static Object calloc(int nitems, int size) {
		return InternalObject.int2obj(native_calloc(size, nitems));
	}
	
	public static Object malloc(int size) {
		return InternalObject.int2obj(native_malloc(size));
	}

	public static void free(Object o) {
		native_free(InternalObject.obj2int(o));
	}

	public static void exit(int i) {
		native_exit(i);
	}
	
	public static void abort() {
		native_abort();
	}
	
	public static Object realloc(Object o, int size) {
		return InternalObject.int2obj(native_realloc(size, InternalObject.obj2int(o)));
	}
	
	//public static int atexit(Thread t) {}
	
	public static String getenv(String name) {
		return LibC.CString2JString32(native_getenv(InternalObject.arr2int(LibC.JString2CString(name))));
	}
	
	public static int system(String command) {
		return native_system(InternalObject.arr2int(LibC.JString2CString(command)));
	}
	
	public static int abs(int x) { return native_abs(x); }
	public static void srand(int seed) { native_srand(seed); }
	public static int rand() { return native_rand(); }

}
