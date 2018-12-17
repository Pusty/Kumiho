package pusty.f0xC.x64.internal;

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
	public static long getID(Object obj) {
		return 0;
	}
	
	@TranslationProperty(property = TranslationProperty.NO_FRAME)
	public static byte getMem(Object obj, int i) {
		return 0;
	}
	
	/**
	 * Returns the address of a c-like string representing this class
	 * @param structAddr the address of the class data
	 * @return the address of the c-like string
	 */
	@TranslationProperty(property = TranslationProperty.NO_FRAME)
	public static long getClassName(long structAddr) {
		return 0;
	}
	
	@TranslationProperty(property = TranslationProperty.NO_FRAME)
	public static void setRef(Object obj, short ref) {}
	
	@TranslationProperty(property = TranslationProperty.NO_FRAME)
	public static void setSize(Object obj, short size) {}
	
	@TranslationProperty(property = TranslationProperty.NO_FRAME)
	public static void setID(Object obj, long addr) {}
	
	@TranslationProperty(property = TranslationProperty.NO_FRAME)
	public static void setMem(Object obj, int i, byte v) {}
	
	@TranslationProperty(property = TranslationProperty.NO_GARBAGE_COLLECT)
	public static void destroy(Object obj) {}
	
	@TranslationProperty(property = TranslationProperty.NO_FRAME)
	public static Object long2obj(long addr) { return null; }
	
	@TranslationProperty(property = TranslationProperty.NO_FRAME)
	public static long obj2long(Object obj) { return 0; }
	
	@TranslationProperty(property = TranslationProperty.NO_FRAME)
	public static long obj2str(Object obj) { return 0; }
	
	@TranslationProperty(property = TranslationProperty.NO_FRAME)
	public static long con2long(Object array) { return 0; }
	
	@TranslationProperty(property = TranslationProperty.NO_FRAME)
	public static long arr2long(Object array) { return 0; }
	
	@TranslationProperty(property = TranslationProperty.NO_FRAME)
	public static int getContentSize(Object obj) { return 0; }
}
