package pusty.f0xC.lang;

//import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;

public class OverrideHandler {
	
	private HashMap<String, String> classOverrides;
	private HashMap<String, Method> methodOverrides;
	private Class<?>[] overrideClasses = null;
	
	public Class<?>[] getOverrides() {
		return overrideClasses;
	}
	
	
	public void registerOverride(Class<?> cl) {
		ArrayList<Class<?>> aCl = new ArrayList<Class<?>>();
		if(overrideClasses != null)
			for(Class<?> c:overrideClasses)
				aCl.add(c);
		aCl.add(cl);
		overrideClasses = aCl.toArray(new Class<?>[aCl.size()]);
	}
	public void setOverride(Class<?>[] cls) {
		overrideClasses = cls;
	}
	
	/*@OverrideTranslation(type = OverrideType.METHOD,override = "")
	public void handle() {
		
	}*/
	
	public void process() {
		classOverrides = new HashMap<String, String>();
		methodOverrides = new HashMap<String, Method>();
		Class<?>[] classes = getOverrides();
		if(classes == null) return;
		for(Class<?> cl:classes) {
			OverrideTranslation overrideClass = cl.getAnnotation(OverrideTranslation.class);
			for (Method method : cl.getDeclaredMethods()) {
				OverrideTranslation overrideMethod = method.getAnnotation(OverrideTranslation.class);
				if(overrideMethod != null) {
					method.setAccessible(true);
					methodOverrides.put(overrideMethod.override(), method);
					//System.out.println("[#] Method Override '"+overrideMethod.override()+"' registered");
				}
			}
			if(overrideClass != null) {
				classOverrides.put(overrideClass.override(), cl.getCanonicalName().replace('.', '/'));
				//System.out.println("[#] Class Override '"+overrideClass.override()+"' registered");
			}
		}
	}
	
	public HashMap<String, String> getClassOverrides() {
		return classOverrides;
	}
	
	public HashMap<String, Method> getMethodOverrides() {
		return methodOverrides;
	}
	
	
	//@Target({ElementType.CONSTRUCTOR, ElementType.METHOD})
	@Retention(RetentionPolicy.RUNTIME)
	public static @interface OverrideTranslation {
		String override();
	}
	
	@Retention(RetentionPolicy.CLASS)
	public static @interface TranslationProperty {
		
		public static final int NONE = 0;                      //Don't collect garbage
		public static final int NO_GARBAGE_COLLECT = 1;        //Don't generate a stack frame (referencing variables over stack pointer)
		public static final int NO_FRAME_ONLY = 2;             //Don't generate a stack frame (referencing variables over stack pointer)
		public static final int FREEZE_GARBAGE_COLLECT = 2<<1; //Freeze the garbage collection for internally called functions until end
		public static final int INTERNAL = 2<<2;               //Prevents objects to be internally references or freed (doesn't stop garbage collection and registering though!)
		//note that all functions are by default c calling convention functions! For user made functions this shouldn't matter after stdcall is properly implemented, but internal functions have to use cdecl
		public static final int STDCALL = 2<<3;                //Makes the function a std calling convention function (default for winAPI) [TODO: implement returning from stdcall function]
		public static final int NATIVE = 2<<4;                  //A native function (either the translation option or the keyword) will have it's 'actual' name and no code generated

		public static final int INTERNAL_GBF = INTERNAL | NO_GARBAGE_COLLECT | FREEZE_GARBAGE_COLLECT; //used within the garbage collector and other internals
		public static final int INTERNAL_NOGBC = INTERNAL | NO_GARBAGE_COLLECT; //used for garbage registering and other internals
		public static final int NO_FRAME = NO_FRAME_ONLY | NO_GARBAGE_COLLECT; //used for 'small' functions that don't have a stack frame for optimization purpose and are overwritten with native code anyways
		
		public static final int EXTERNAL_STDCALL = NATIVE | NO_GARBAGE_COLLECT | STDCALL; //used for imports of external functions (e.g. winAPI)
		public static final int EXTERNAL_CCALL   = NATIVE | NO_GARBAGE_COLLECT;  //used for imports of external functions (e.g. libc)
		
		int property();
	}
	
	@Retention(RetentionPolicy.CLASS)
	public static @interface ExternalProperty {
		public static final int NONE = 0;
		public static final int IMPORT = 1;
		
		int property() default NONE;
		String parent() default "";
		String key();
	}
	
	public static class ExternalPropertyObject {
		private int property;
		private String parent;
		private String key;
		private String alias;
		public ExternalPropertyObject(int property, String parent, String key, String alias) {
			this.property = property;
			this.parent = parent;
			this.key = key;
			this.alias = alias;
		}
		public int getProperty() { return property; }
		public String getParent() { return parent; }
		public String getKey() { return key; }
		public String getAlias() { return alias; }
	}
	
	

}
