package pusty.f0cr.util;

public class AccessFlags {
	public static final int ACC_PUBLIC = 0x0001; //	ACC_PUBLIC 	0x0001 	Declared public; may be accessed from outside its package.
	public static final int ACC_PRIVATE = 0x0002; // ACC_PRIVATE  0x0002 	Declared private; usable only within the defining class. 
	public static final int ACC_PROTECTED = 0x0004; // ACC_PROTECTED  0x0004 	Declared protected; may be accessed within subclasses. 
	public static final int ACC_STATIC = 0x0008; // ACC_STATIC 	0x0008 	Declared static. 
	public static final int ACC_FINAL = 0x0010;  //	ACC_FINAL 	0x0010 	Declared final; no subclasses allowed.
	public static final int ACC_SUPER = 0x0020;  //	ACC_SUPER 	0x0020 	Treat superclass methods specially when invoked by the invokespecial instruction.
	public static final int ACC_VOLATILE = 0x0040; // ACC_VOLATILE 	0x0040 	Declared volatile; cannot be cached.
	public static final int ACC_TRANSIENT = 0x0080; // ACC_TRANSIENT 	0x0080 	Declared transient; not written or read by a persistent object manager.
	public static final int ACC_INTERFACE = 0x0200;  //	ACC_INTERFACE 	0x0200 	Is an interface, not a class.
	public static final int ACC_ABSTRACT = 0x0400;  //	ACC_ABSTRACT 	0x0400 	Declared abstract; must not be instantiated.
	public static final int ACC_SYNTHETIC = 0x1000;  //	ACC_SYNTHETIC 	0x1000 	Declared synthetic; not present in the source code.
	public static final int ACC_ANNOTATION = 0x2000;  //	ACC_ANNOTATION 	0x2000 	Declared as an annotation type.
	public static final int ACC_ENUM = 0x4000;  //	ACC_ENUM 	0x4000 	Declared as an enum type. 

	public static String getFlags(int flag) {
		String flags = "";
		if(isPublic(flag))  flags = flags+" public";
		if(isPrivate(flag))  flags = flags+" private";
		if(isProtected(flag))  flags = flags+" protected";
		if(isStatic(flag))  flags = flags+" static";
		if(isFinal(flag))  flags = flags+" final";
		if(isSuper(flag))  flags = flags+" super";
		if(isVolatile(flag))  flags = flags+" volatile";
		if(isTransient(flag))  flags = flags+" transient";
		if(isInterface(flag))  flags = flags+" interface";
		if(isAbstract(flag))  flags = flags+" abstract";
		if(isSynthetic(flag))  flags = flags+" synthetic";
		if(isAnnotation(flag))  flags = flags+" annotation";
		if(isEnum(flag))  flags = flags+" enum";
		return flags.trim();
	}
	public static boolean isPublic(int flag) {
		return (ACC_PUBLIC & flag)!=0;
	}
	public static boolean isPrivate(int flag) {
		return (ACC_PRIVATE & flag)!=0;
	}
	public static boolean isProtected(int flag) {
		return (ACC_PROTECTED & flag)!=0;
	}
	public static boolean isStatic(int flag) {
		return (ACC_STATIC & flag)!=0;
	}
	public static boolean isFinal(int flag) {
		return (ACC_FINAL & flag)!=0;
	}
	public static boolean isSuper(int flag) {
		return (ACC_SUPER & flag)!=0;
	}
	public static boolean isVolatile(int flag) {
		return (ACC_VOLATILE & flag)!=0;
	}
	public static boolean isTransient(int flag) {
		return (ACC_TRANSIENT & flag)!=0;
	}
	public static boolean isInterface(int flag) {
		return (ACC_INTERFACE & flag)!=0;
	}
	public static boolean isAbstract(int flag) {
		return (ACC_ABSTRACT & flag)!=0;
	}
	public static boolean isSynthetic(int flag) {
		return (ACC_SYNTHETIC & flag)!=0;
	}
	public static boolean isAnnotation(int flag) {
		return (ACC_ANNOTATION & flag)!=0;
	}
	public static boolean isEnum(int flag) {
		return (ACC_ENUM & flag)!=0;
	}
}
