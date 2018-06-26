package pusty.f0xC.rt.lang;

import pusty.f0xC.lang.OverrideHandler.OverrideTranslation;

@OverrideTranslation(override = "java/lang/Double")
public class ODouble {
	
	//private double value;

	public ODouble(double value) {
	//	this.value = value;
	}
	
	public static ODouble valueOf(double c) {
		return new ODouble(c);
	}
	
	/*
	 TODO: Apperently object float load/save isn't implemented, ok..
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
        return (float)value;
    }
    
    public double doubleValue() {
        return value;
    }
    */
    public String toString() {
        return "==TOO LAZY TO IMPLEMENT SRY==";
    }
    
    public static String toString(double f) {
    	return "==TOO LAZY TO IMPLEMENT SRY==";
    }
}
