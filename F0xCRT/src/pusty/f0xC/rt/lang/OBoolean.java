package pusty.f0xC.rt.lang;

import pusty.f0xC.lang.OverrideHandler.OverrideTranslation;

@OverrideTranslation(override = "java/lang/Boolean")
public class OBoolean {
	public static final OBoolean TRUE = new OBoolean(true);
	public static final OBoolean FALSE = new OBoolean(false);
	
	private boolean value;
	
    public OBoolean(boolean value) {
        this.value = value;
    }
    
    public OBoolean(String s) {
        this(toBoolean(s));
    }
    
    public static boolean parseBoolean(String s) {
        return toBoolean(s);
    }
    
    public boolean booleanValue() {
        return value;
    }
    
    public static OBoolean valueOf(boolean b) {
        return (b ? TRUE : FALSE);
    }
    
    public static OBoolean valueOf(String s) {
        return toBoolean(s) ? TRUE : FALSE;
    }
    
    public static String toString(boolean b) {
        return b ? "true" : "false";
    }
    
    public String toString() {
        return value ? "true" : "false";
    }
    
    public int hashCode() {
        return value ? 1231 : 1237;
    }
    
    public boolean equals(Object obj) {
        if (obj instanceof Boolean) {
            return value == ((Boolean)obj).booleanValue();
        }
        return false;
    }
    
    public int compareTo(OBoolean b) {
        return compare(this.value, b.value);
    }
    
    public static int compare(boolean x, boolean y) {
        return (x == y) ? 0 : (x ? 1 : -1);
    }

    private static boolean toBoolean(String name) {
        return ((name != null) && name.equalsIgnoreCase("true"));
    }
}
