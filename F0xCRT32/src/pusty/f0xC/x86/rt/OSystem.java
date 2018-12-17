package pusty.f0xC.x86.rt;


import pusty.f0xC.lang.OverrideHandler.OverrideTranslation;
import pusty.f0xC.rt.io.NativeOutputStream;
import pusty.f0xC.rt.io.OPrintStream;
import pusty.f0xC.x86.internal.Internal;
import pusty.f0xC.x86.internal.InternalObject;

@OverrideTranslation(override = "java/lang/System")
public class OSystem {
	
	public static final NativeOutputStream stdout = new NativeOutputStream();
    public static final OPrintStream err = new OPrintStream(stdout);
    public static final OPrintStream out = new OPrintStream(stdout);

    /*
    public static String getProperty(String name) {
  	  if (name.equals("user.home")) {
  		  return "/";
  	  } 
  	  return "Unknown property '" + name + "'";
    }
    */
    
    public static long currentTimeMillis() {
    	return 0;
    }
    
    public static long nanoTime() {
    	return 0;
    }
    
    public static void arraycopy(Object src,  int  srcPos,
            Object dest, int destPos,
            int length) {
    	for(int i=0;i<length;i++) {
    		((byte[])dest)[i+destPos] = ((byte[])src)[i+srcPos];
    	}
    }
    
    public static int identityHashCode(Object x) {
    	return InternalObject.obj2int(x);
    }
    
    public static String lineSeparator() {
        return lineSeparator;
    }

    private static String lineSeparator = "\n";
    
    public static void exit(int code) {
    	Internal.exit(code);
    }
    
    
}
