package pusty.f0xC.rt.lang;

import pusty.f0xC.lang.OverrideHandler.OverrideTranslation;

@OverrideTranslation(override = "java/lang/Byte")
public class OByte extends ONumber {
	
	public static final byte   MIN_VALUE = -128;
	public static final byte   MAX_VALUE = 127;
	public static final int SIZE = 8;
	
	private byte value;
	
    public OByte(byte value) {
        this.value = value;
    }
    
    public OByte(String s) throws NumberFormatException {
        this.value = parseByte(s, 10);
    }
    
    public byte byteValue() {
        return value;
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
        return (double)value;
    }
    
    public String toString() {
        return Integer.toString((int)value);
    }

    
    public int hashCode() {
        return (int)value;
    }
    
    public boolean equals(Object obj) {
        if (obj instanceof OByte) {
            return value == ((OByte)obj).byteValue();
        }
        return false;
    }
    
    public int compareTo(OByte anotherByte) {
        return compare(this.value, anotherByte.value);
    }
    
    public static int compare(byte x, byte y) {
        return x - y;
    }
    
    public static String toString(byte b) {
        return Integer.toString((int)b, 10);
    }
    
    public static OByte valueOf(byte b) {
        return new OByte(b);
    }
    
    public static byte parseByte(String s, int radix)
            throws NumberFormatException {
            int i = Integer.parseInt(s, radix);
            if (i < MIN_VALUE || i > MAX_VALUE)
                throw new NumberFormatException(
                    "Value out of range. Value:\"" + s + "\" Radix:" + radix);
            return (byte)i;
    }
    
    public static byte parseByte(String s) throws NumberFormatException {
        return parseByte(s, 10);
    }
    
    public static OByte valueOf(String s, int radix)
            throws NumberFormatException {
            return valueOf(parseByte(s, radix));
        }
    
    public static OByte valueOf(String s) throws NumberFormatException {
        return valueOf(s, 10);
    }
    
    public static OByte decode(String nm) throws NumberFormatException {
        int i = Integer.decode(nm);
        if (i < MIN_VALUE || i > MAX_VALUE)
            throw new NumberFormatException(
                    "Value " + i + " out of range from input " + nm);
        return valueOf((byte)i);
    }
}
