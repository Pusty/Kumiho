package pusty.f0xC.x86.internal;

import pusty.f0xC.lang.OverrideHandler.TranslationProperty;

public class InternalObject {
	
	@TranslationProperty(property = TranslationProperty.NO_FRAME)
	public static short getRef(Object obj) {
		return 0;
	}
	
	@TranslationProperty(property = TranslationProperty.NO_FRAME)
	public static short getSize(Object obj) {
		return 0;
	}
	
	@TranslationProperty(property = TranslationProperty.NO_FRAME)
	public static int getID(Object obj) {
		return 0;
	}
	
	@TranslationProperty(property = TranslationProperty.NO_FRAME)
	public static byte getMem(Object obj, int i) {
		return 0;
	}
	
	/**
	 * Returns the address of a c-like string representing this class
	 * @param id the address of the class data
	 * @return the address of the c-like string
	 */
	@TranslationProperty(property = TranslationProperty.NO_FRAME)
	public static int getClassName(int id) {
		return 0;
	}
	
	@TranslationProperty(property = TranslationProperty.NO_FRAME)
	public static void setRef(Object obj, short ref) {}
	
	@TranslationProperty(property = TranslationProperty.NO_FRAME)
	public static void setSize(Object obj, short size) {}
	
	@TranslationProperty(property = TranslationProperty.NO_FRAME)
	public static void setID(Object obj, int addr) {}
	
	@TranslationProperty(property = TranslationProperty.NO_FRAME)
	public static void setMem(Object obj, int i, byte v) {}
	
	@TranslationProperty(property = TranslationProperty.NO_GARBAGE_COLLECT)
	public static void destroy(Object obj) {}
	
	@TranslationProperty(property = TranslationProperty.NO_FRAME)
	public static Object int2obj(int addr) { return null; }
	
	@TranslationProperty(property = TranslationProperty.NO_FRAME)
	public static int obj2int(Object obj) { return 0; }
	
	@TranslationProperty(property = TranslationProperty.NO_FRAME)
	public static int obj2str(Object obj) { return 0; }
	
	@TranslationProperty(property = TranslationProperty.NO_FRAME)
	public static int con2int(Object array) { return 0; }
	
	@TranslationProperty(property = TranslationProperty.NO_FRAME)
	public static int arr2int(Object array) { return 0; }
	
	@TranslationProperty(property = TranslationProperty.NO_FRAME)
	public static int getContentSize(Object obj) { return 0; }
}
