package pusty.f0xC.x64.internal;

import pusty.f0xC.ContextClass;
import pusty.f0xC.lang.OverrideHandler.TranslationProperty;
import pusty.f0xC.libc.CStdlib;
import pusty.f0xC.libc.LibC;

@SuppressWarnings("unused")
public class Internal {
	
	//This are diagnostic variables to check if automatic garbage collection is working as expected
	//Considering these only takes 4*4 bytes and the problems/bloat code of implementing them separate is bigger
	//these can stay/be used in any case for the default target
	public static int allocCalls;
	public static int allocMemory;
	public static int freeCalls;
	public static int freedMemory;
	
	public static long lastMarkedAddress; //marking addresses for debug and exception reasons
	private static GarbageCollector gbCollector;
	private static long gbStatus; // garbage collector, gb = 0 -> working, gb = ebp -> freeze until hit
	
	@TranslationProperty(property = TranslationProperty.INTERNAL_GBF)
	public static void createGB() {
		allocCalls = 0;
		allocMemory = 0;
		freeCalls = 0;
		freedMemory = 0;
		gbCollector = new GarbageCollector(64);
	}
	
	@TranslationProperty(property = TranslationProperty.INTERNAL_GBF)
	public static void deleteGB() {
		free_memory(gbCollector);
	}
	
	@TranslationProperty(property = TranslationProperty.INTERNAL_GBF)
	public static Object allocate_memory(int reference, int size) {
		allocCalls ++;
		allocMemory = allocMemory + size;
		Object obj = CStdlib.malloc(size);
		for(int i=0;i<size;i++)
			InternalObject.setMem(obj, i, (byte)0);
		InternalObject.setID(obj, reference);
		InternalObject.setSize(obj, (short)size);
		InternalObject.setRef(obj, (short)0);
		return obj;
	}
	
	@TranslationProperty(property = TranslationProperty.INTERNAL_GBF)
	public static void free_memory(Object obj) {
		if(obj == null) return;
		short s = InternalObject.getRef(obj);
		s--;
		InternalObject.setRef(obj, s);
		if(s > 0) return;
		if(InternalObject.getID(obj) != 0) {
			InternalObject.destroy(obj);
		}
		freedMemory += InternalObject.getSize(obj);
		CStdlib.free(obj);
		freeCalls ++;
	}
	
	@TranslationProperty(property = TranslationProperty.INTERNAL_GBF)
	public static void inc_memory(Object obj) {
		if(obj == null) return;
		InternalObject.setRef(obj, (short) (InternalObject.getRef(obj)+1));
	}
	
	@TranslationProperty(property = TranslationProperty.INTERNAL_NOGBC)
	public static void garbage_register(Object obj,long rbp) {
		if(gbStatus != 0) return;
		if(obj == null) return;
		if(!gbCollector.add(obj, rbp))
			garbage_collect(0); //collector overflow!
	}
	
	@TranslationProperty(property = TranslationProperty.INTERNAL_NOGBC)
	public static void garbage_collect(long rbp) {
		if(gbStatus != 0) return;
		gbCollector.collect(rbp);
	}
	
	@TranslationProperty(property = TranslationProperty.INTERNAL_NOGBC)
	public static void garbage_enable(long rbp) {
		if(gbStatus == rbp)  {
			gbStatus = 0;
		}
	}
	
	@TranslationProperty(property = TranslationProperty.INTERNAL_NOGBC)
	public static void garbage_disable(long rbp) {
		if(gbStatus == 0)  {
			gbStatus = rbp;
		}
	}

	@TranslationProperty(property = TranslationProperty.INTERNAL_GBF)
	public static void exit(int errorCode) {
		CStdlib.exit(errorCode);
	}

	public static void exception(Exception e) {
		e.fillInStackTrace();
		long addr = Internal.getMarkedAddress();
		if(addr >= exception_start && addr <= exception_end) {
			System.out.println("Handler Found!");
			//clear stack
			//push exception
			//continue at dest
			exit(1);
		}else {
			e.printStackTrace();
			exit(1);
		}
	}
	
	private static long exception_start;
	private static long exception_end;
	private static long exception_dest;
	private static long exception_type;
	
	public static void registerExceptionHandler(long start, long end, long dest, long type) {
		exception_start = start;
		exception_end = end;
		exception_dest = dest;
		exception_type = type;
	}
	
	public static void arrayOutOfBounds(Object[] array, int index) throws ArrayIndexOutOfBoundsException {
		throw new ArrayIndexOutOfBoundsException(index);
	}
	
	@TranslationProperty(property = TranslationProperty.INTERNAL_NOGBC)
	public static void initStringTable() {
		long currentAddress = addrStringTableData();
		long startOfString = currentAddress;
		boolean endOfString = false;
		int index = 0;
		byte read = 0;
		while((read=staticReadByte(currentAddress))!=0 || !endOfString) {
			if(read == 0) {
				endOfString = true;
				byte[] array = new byte[(int) (currentAddress-startOfString)];
				for(int i=0;i<(int)(currentAddress-startOfString);i++) {
					array[i] = staticReadByte(startOfString+i);
				}
				setStringTable(index, new String(array));
			    inc_memory(getStringTable(index)); //register the newly created string (as it's not referenced automatically through native functions)
				free_memory(array); //String always does copies so this has to be deleted manually
				index++;
				startOfString = currentAddress+1;
			}else
				endOfString = false;
			currentAddress++;
		}
	}
	
	@TranslationProperty(property = TranslationProperty.INTERNAL_NOGBC)
	public static void freeStringTable() {
		String c = null;
		int index = 0;
		do {
		   c = getStringTable(index);
		   if(c == null) break;
		   free_memory(c);
		   setStringTable(index, null);
		   index++;
		}while(c != null);
	}
	
	public static void markAddress() {
		lastMarkedAddress = getNextAddress();
	}
	public static long getMarkedAddress() { 
		return lastMarkedAddress;
	}
	
	@TranslationProperty(property = TranslationProperty.INTERNAL_NOGBC)
	public static String getStringTable(int i) { return (String) InternalObject.long2obj(rawMemoryReadLong(addrStringTable()+i*8)); }
	
	@TranslationProperty(property = TranslationProperty.INTERNAL_NOGBC)
	public static void setStringTable(int i, String a) { 	
		rawMemoryWriteLong(addrStringTable()+i*8, InternalObject.obj2long(a));
	}
	
	@TranslationProperty(property = TranslationProperty.NO_FRAME)
	public static long getNextAddress() { return 0; }	
	@TranslationProperty(property = TranslationProperty.NO_FRAME)
	public static long getFramePointer() { return 0;}
	@TranslationProperty(property = TranslationProperty.NO_FRAME)
	public static long addrStringTable() { return 0;}
	@TranslationProperty(property = TranslationProperty.NO_FRAME)
	public static long addrStringTableData() { return 0;}
	@TranslationProperty(property = TranslationProperty.NO_FRAME)
	public static void rawMemoryWriteByte(long addr, byte data) {}
	@TranslationProperty(property = TranslationProperty.NO_FRAME)
	public static void rawMemoryWriteLong(long addr, long data) {}
	@TranslationProperty(property = TranslationProperty.INTERNAL_NOGBC)
	public static byte rawMemoryReadByte(long addr) { return (byte)rawMemoryReadLong(addr); } //0000000000409F54
	@TranslationProperty(property = TranslationProperty.NO_FRAME)
	public static long  rawMemoryReadLong(long addr) { return 0; }
	@TranslationProperty(property = TranslationProperty.INTERNAL_NOGBC)
	public static byte staticReadByte(long addr) { return (byte)staticReadLong(addr); }
	@TranslationProperty(property = TranslationProperty.NO_FRAME)
	public static long  staticReadLong(long addr) { return 0; }
	@TranslationProperty(property = TranslationProperty.NO_FRAME)
	public static void  breakpoint() { }
	@TranslationProperty(property = TranslationProperty.NO_FRAME)
	public static void  setReturnAddress(int addr) {}
}
