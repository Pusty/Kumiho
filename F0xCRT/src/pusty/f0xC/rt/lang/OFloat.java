package pusty.f0xC.rt.lang;

import pusty.f0xC.lang.OverrideHandler.OverrideTranslation;

@OverrideTranslation(override = "java/lang/Float")
public class OFloat {
	
	//private float value;

	public OFloat(float value) {
	//	this.value = value;
	}
	
	public static OFloat valueOf(float c) {
		return new OFloat(c);
	}

	/*
	 * TODO: Implement FLOAT/DOUBLE LOAD/SAVE ON OBJECTS!
    public byte byteValue() {
        return (byte)value;
    }
    
    public short shortValue() {
        return (short)value;
    }
    
    public int intValue() {
        return (int)value;
    }
    
    public long longValue() {
        return (long)value;
    }
    
    public float floatValue() {
        return value;
    }
    
    public double doubleValue() {
        return (double)value;
    }
    
    */
	
    public String toString() {
        return "==TOO LAZY TO IMPLEMENT SRY==";
    }
    
    public static String toString(float f) {
    	return "==TOO LAZY TO IMPLEMENT SRY==";
    }
}
