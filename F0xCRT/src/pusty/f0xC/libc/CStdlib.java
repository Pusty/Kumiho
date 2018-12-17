package pusty.f0xC.libc;

public class CStdlib {
	public static final int NULL = 0;
	public static final int EXIT_SUCCESS = 0;
	public static final int EXIT_FAILURE = 1;
	public static final int RAND_MAX = 0x7FFF;
	
	public static Object calloc(int size) { return null; }	
	public static Object malloc(int size) { return null; }
	public static void free(Object o) {}
	public static Object realloc(Object o,int size) { return null; }	
	public static void exit(int i) {}
	public static void abort() {}
	//public static int atexit(Thread t) {}
	public static String getenv(String name) { return null; }
	public static int system(String name) { return 0;    }
	public static int abs(int x) { return 0; }
	public static void srand(int seed) {}
	public static int rand() { return 0; }
}
