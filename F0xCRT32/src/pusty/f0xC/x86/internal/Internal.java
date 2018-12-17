package pusty.f0xC.x86.internal;

import pusty.f0xC.ContextClass;
import pusty.f0xC.lang.OverrideHandler.TranslationProperty;
import pusty.f0xC.libc.CStdio;
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
	
	public static int lastMarkedAddress; //marking addresses for debug and exception reasons
	private static GarbageCollector gbCollector;
	private static int gbStatus; // garbage collector, gb = 0 -> working, gb = ebp -> freeze until hit
	
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
	public static void garbage_register(Object obj,int ebp) {
		if(gbStatus != 0) return;
		if(obj == null) return;
		if(!gbCollector.add(obj, ebp))
			garbage_collect(0); //collector overflow!
	}
	
	@TranslationProperty(property = TranslationProperty.INTERNAL_NOGBC)
	public static void garbage_collect(int ebp) {
		if(gbStatus != 0) return;
		gbCollector.collect(ebp);
	}
	
	@TranslationProperty(property = TranslationProperty.INTERNAL_NOGBC)
	public static void garbage_enable(int ebp) {
		if(gbStatus == ebp) 
			gbStatus = 0;
	}
	
	@TranslationProperty(property = TranslationProperty.INTERNAL_NOGBC)
	public static void garbage_disable(int ebp) {
		if(gbStatus == 0) 
			gbStatus = ebp;
	}

	@TranslationProperty(property = TranslationProperty.INTERNAL_GBF)
	public static void exit(int errorCode) {
		CStdlib.exit(errorCode);
	}

	public static void exception(Exception e) {
		e.fillInStackTrace();
		int addr = Internal.getMarkedAddress();
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
	
	private static int exception_start;
	private static int exception_end;
	private static int exception_dest;
	private static int exception_type;
	
	public static void registerExceptionHandler(int start, int end, int dest, int type) {
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
		int currentAddress = addrStringTableData();
		int startOfString = currentAddress;
		boolean endOfString = false;
		int index = 0;
		byte read = 0;
		while((read=staticReadByte(currentAddress))!=0 || !endOfString) {
			if(read == 0) {
				endOfString = true;
				byte[] array = new byte[currentAddress-startOfString];
				for(int i=0;i<currentAddress-startOfString;i++)
					array[i] = staticReadByte(startOfString+i);
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
	public static int getMarkedAddress() { 
		return lastMarkedAddress;
	}
	
	@TranslationProperty(property = TranslationProperty.INTERNAL_NOGBC)
	public static String getStringTable(int i) { return (String) InternalObject.int2obj(rawMemoryReadInt(addrStringTable()+i*4)); }
	
	@TranslationProperty(property = TranslationProperty.INTERNAL_NOGBC)
	public static void setStringTable(int i, String a) { 	
		rawMemoryWriteInt(addrStringTable()+i*4, InternalObject.obj2int(a));
	}
	
	@TranslationProperty(property = TranslationProperty.NO_FRAME)
	public static int getNextAddress() { return 0; }	
	@TranslationProperty(property = TranslationProperty.NO_FRAME)
	public static int getFramePointer() { return 0;}
	@TranslationProperty(property = TranslationProperty.NO_FRAME)
	public static int addrStringTable() { return 0;}
	@TranslationProperty(property = TranslationProperty.NO_FRAME)
	public static int addrStringTableData() { return 0;}
	@TranslationProperty(property = TranslationProperty.NO_FRAME)
	public static void rawMemoryWriteByte(int addr, byte data) {}
	@TranslationProperty(property = TranslationProperty.NO_FRAME)
	public static void rawMemoryWriteInt(int addr, int data) {}
	@TranslationProperty(property = TranslationProperty.INTERNAL_NOGBC)
	public static byte rawMemoryReadByte(int addr) { return (byte)rawMemoryReadInt(addr); }
	@TranslationProperty(property = TranslationProperty.NO_FRAME)
	public static int  rawMemoryReadInt(int addr) { return 0; }
	@TranslationProperty(property = TranslationProperty.INTERNAL_NOGBC)
	public static byte staticReadByte(int addr) { return (byte)staticReadInt(addr); }
	@TranslationProperty(property = TranslationProperty.NO_FRAME)
	public static int  staticReadInt(int addr) { return 0; }
	@TranslationProperty(property = TranslationProperty.NO_FRAME)
	public static void  breakpoint() { }
	@TranslationProperty(property = TranslationProperty.NO_FRAME)
	public static void  setReturnAddress(int addr) {}
}
