package pusty.f0xC.rt.lang;

import pusty.f0xC.lang.OverrideHandler.OverrideTranslation;
import pusty.f0xC.rt.lang.throwable.ONumberFormatException;

@OverrideTranslation(override = "java/lang/Integer")
public class OInteger extends ONumber {
	
	public static final int   MIN_VALUE = 0x80000000;
	public static final int   MAX_VALUE = 0x7fffffff;
	
	/*final static char[] digits = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g',
			'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
	
    final static char [] DigitTens = {
            '0', '0', '0', '0', '0', '0', '0', '0', '0', '0',
            '1', '1', '1', '1', '1', '1', '1', '1', '1', '1',
            '2', '2', '2', '2', '2', '2', '2', '2', '2', '2',
            '3', '3', '3', '3', '3', '3', '3', '3', '3', '3',
            '4', '4', '4', '4', '4', '4', '4', '4', '4', '4',
            '5', '5', '5', '5', '5', '5', '5', '5', '5', '5',
            '6', '6', '6', '6', '6', '6', '6', '6', '6', '6',
            '7', '7', '7', '7', '7', '7', '7', '7', '7', '7',
            '8', '8', '8', '8', '8', '8', '8', '8', '8', '8',
            '9', '9', '9', '9', '9', '9', '9', '9', '9', '9',
            } ;

    final static char [] DigitOnes = {
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
            } ;*/
	
	protected static char digits(int i) {
		if(i > 9)
			return (char) ('W'+i);
		else
			return (char) ('0'+i);
	}

	protected static char DigitTens(int i) {
		return (char) ('0'+(i/10));
	}
	
	protected static char DigitOnes(int i) {
		return (char) ('0'+(i%10));
	}


	
	private int value;

	public OInteger(int value) {
		this.value = value;
	}
	
    public OInteger(String s) throws NumberFormatException {
        this.value = parseInt(s, 10);
    }

	public static OInteger valueOf(int c) {
		return new OInteger(c);
	}

    public byte byteValue() {
        return (byte)value;
    }
    
    public short shortValue() {
        return (short)value;
    }
    
    public int intValue() {
        return value;
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
        return toString(value);
    }
    
    public boolean equals(Object obj) {
        if (obj instanceof Integer) {
            return value == ((Integer)obj).intValue();
        }
        return false;
    }
    
    public static OInteger decode(String nm)  {
        int radix = 10;
        int index = 0;
        boolean negative = false;
        OInteger result;
        if (nm.length() == 0)
            return null;
        char firstChar = nm.charAt(0);
        if (firstChar == '-') {
            negative = true;
            index++;
        } else if (firstChar == '+')
            index++;
        if (nm.startsWith("0x", index) || nm.startsWith("0X", index)) {
            index += 2;
            radix = 16;
        }
        else if (nm.startsWith("#", index)) {
            index ++;
            radix = 16;
        }
        else if (nm.startsWith("0", index) && nm.length() > 1 + index) {
            index ++;
            radix = 8;
        }

        if (nm.startsWith("-", index) || nm.startsWith("+", index))
          	return null;

        result = OInteger.valueOf(nm.substring(index), radix);
        result = negative ? OInteger.valueOf(-result.intValue()) : result;
    
        return result;
    }
    
    
    public int compareTo(OInteger anotherInteger) {
        return compare(this.value, anotherInteger.value);
    }
    
    public static int compare(int x, int y) {
        return (x < y) ? -1 : ((x == y) ? 0 : 1);
    }
    
    
    public static int highestOneBit(int i) {
        i |= (i >>  1);
        i |= (i >>  2);
        i |= (i >>  4);
        i |= (i >>  8);
        i |= (i >> 16);
        return i - (i >>> 1);
    }
    
    public static int lowestOneBit(int i) {
        return i & -i;
    }
    
    public static int numberOfLeadingZeros(int i) {
        if (i == 0)
            return 32;
        int n = 1;
        if (i >>> 16 == 0) { n += 16; i <<= 16; }
        if (i >>> 24 == 0) { n +=  8; i <<=  8; }
        if (i >>> 28 == 0) { n +=  4; i <<=  4; }
        if (i >>> 30 == 0) { n +=  2; i <<=  2; }
        n -= i >>> 31;
        return n;
    }
    
    public static int numberOfTrailingZeros(int i) {
        int y;
        if (i == 0) return 32;
        int n = 31;
        y = i <<16; if (y != 0) { n = n -16; i = y; }
        y = i << 8; if (y != 0) { n = n - 8; i = y; }
        y = i << 4; if (y != 0) { n = n - 4; i = y; }
        y = i << 2; if (y != 0) { n = n - 2; i = y; }
        return n - ((i << 1) >>> 31);
    }

    public static int bitCount(int i) {
        i = i - ((i >>> 1) & 0x55555555);
        i = (i & 0x33333333) + ((i >>> 2) & 0x33333333);
        i = (i + (i >>> 4)) & 0x0f0f0f0f;
        i = i + (i >>> 8);
        i = i + (i >>> 16);
        return i & 0x3f;
    }
    
    public static int rotateLeft(int i, int distance) {
        return (i << distance) | (i >>> -distance);
    }
    
    public static int rotateRight(int i, int distance) {
        return (i >>> distance) | (i << -distance);
    }
    
    public static int reverse(int i) {
        i = (i & 0x55555555) << 1 | (i >>> 1) & 0x55555555;
        i = (i & 0x33333333) << 2 | (i >>> 2) & 0x33333333;
        i = (i & 0x0f0f0f0f) << 4 | (i >>> 4) & 0x0f0f0f0f;
        i = (i << 24) | ((i & 0xff00) << 8) |
            ((i >>> 8) & 0xff00) | (i >>> 24);
        return i;
    }
    
    public static int signum(int i) {
        return (i >> 31) | (-i >>> 31);
    }
    
    public static int reverseBytes(int i) {
        return ((i >>> 24)           ) |
               ((i >>   8) &   0xFF00) |
               ((i <<   8) & 0xFF0000) |
               ((i << 24));
    }
	   
	public int hashCode() {
		return (int) value;
	}

	public static String toString(int i, int radix) {

		if (radix < Character.MIN_RADIX || radix > Character.MAX_RADIX)
			radix = 10;

		char buf[] = new char[33];
		boolean negative = (i < 0);
		int charPos = 32;

		if (!negative) {
			i = -i;
		}

		while (i <= -radix) {
			buf[charPos--] = digits(-(i % radix));
			i = i / radix;
		}
		buf[charPos] = digits(-i);

		if (negative) {
			buf[--charPos] = '-';
		}

		return new String(buf, charPos, (33 - charPos));
	}
	
	public static String toHexString(int i) {
		return toUnsignedString(i, 4);
	}

	public static String toOctalString(int i) {
		return toUnsignedString(i, 3);
	}

	public static String toBinaryString(int i) {
		return toUnsignedString(i, 1);
	}

	private static String toUnsignedString(int i, int shift) {
		char[] buf = new char[32];
		int charPos = 32;
		int radix = 1 << shift;
		int mask = radix - 1;
		do {
			buf[--charPos] = digits(i & mask);
			i >>>= shift;
		} while (i != 0);
		return new String(buf, charPos, (32 - charPos));
	}

	public static String toString(int i) {
		return toString(i, 10);
	}

	public static int parseInt(String s, int radix) throws ONumberFormatException{
        if (s == null)
            throw new NumberFormatException("null");
		if (radix < OCharacter.MIN_RADIX)
			throw new NumberFormatException("radix " + radix +
                    " less than Character.MIN_RADIX");
		if (radix > OCharacter.MAX_RADIX)
			throw new NumberFormatException("radix " + radix +
                    " greater than Character.MAX_RADIX");

		int result = 0;
		boolean negative = false;
		int i = 0, len = s.length();
		int limit = -OInteger.MAX_VALUE;
		int multmin;
		int digit;

		if (len > 0) {
			char firstChar = s.charAt(0);
			if (firstChar < '0') {
				if (firstChar == '-') {
					negative = true;
					limit = OInteger.MIN_VALUE;
				} else if (firstChar != '+')
					throw ONumberFormatException.forInputString(s);

				if (len == 1)
					throw ONumberFormatException.forInputString(s);
				i++;
			}
			multmin = limit / radix;
			while (i < len) {
				digit = OCharacter.digit(s.charAt(i++), radix);
				if (digit < 0)
					throw ONumberFormatException.forInputString(s);
				if (result < multmin)
					throw ONumberFormatException.forInputString(s);
				result *= radix;
				if (result < limit + digit)
					throw ONumberFormatException.forInputString(s);
				result -= digit;
			}
		} else
			throw ONumberFormatException.forInputString(s);
		return negative ? result : -result;
	}

    public static int parseInt(String s) throws ONumberFormatException {
        return parseInt(s,10);
    }
    
    public static OInteger valueOf(String s, int radix) throws ONumberFormatException {
        return OInteger.valueOf(parseInt(s,radix));
    }
    
    public static OInteger valueOf(String s) throws ONumberFormatException {
        return OInteger.valueOf(parseInt(s, 10));
    }
}
