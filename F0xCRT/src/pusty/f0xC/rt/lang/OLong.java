package pusty.f0xC.rt.lang;

import pusty.f0xC.lang.OverrideHandler.OverrideTranslation;
import pusty.f0xC.rt.lang.throwable.ONumberFormatException;

@OverrideTranslation(override = "java/lang/Long")
public class OLong extends ONumber {
	
	public static final long MIN_VALUE = 0x8000000000000000L;
	public static final long MAX_VALUE = 0x7fffffffffffffffL;
	
	private long value;

	public OLong(long value) {
		this.value = value;
	}
	
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
        return value;
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
    
    public static String toHexString(long i) {
        return toUnsignedString(i, 4);
    }
    
    public static String toOctalString(long i) {
        return toUnsignedString(i, 3);
    }
    
    public static String toBinaryString(long i) {
        return toUnsignedString(i, 1);
    }
    
    private static String toUnsignedString(long i, int shift) {
        char[] buf = new char[64];
        int charPos = 64;
        int radix = 1 << shift;
        long mask = radix - 1;
        do {
            buf[--charPos] = OInteger.digits[(int)(i & mask)];
            i >>>= shift;
        } while (i != 0);
        return new String(buf, charPos, (64 - charPos));
    }
    
    
    public static long parseLong(String s, int radix) throws ONumberFormatException {
      if (s == null) {
          throw new ONumberFormatException("null");
      }

      if (radix < Character.MIN_RADIX) {
          throw new ONumberFormatException("radix " + radix +
                                          " less than Character.MIN_RADIX");
      }
      if (radix > Character.MAX_RADIX) {
          throw new ONumberFormatException("radix " + radix +
                                          " greater than Character.MAX_RADIX");
      }

      long result = 0;
      boolean negative = false;
      int i = 0, len = s.length();
      long limit = -Long.MAX_VALUE;
      long multmin;
      int digit;

      if (len > 0) {
          char firstChar = s.charAt(0);
          if (firstChar < '0') { // Possible leading "+" or "-"
              if (firstChar == '-') {
                  negative = true;
                  limit = OLong.MIN_VALUE;
              } else if (firstChar != '+')
                  throw ONumberFormatException.forInputString(s);

              if (len == 1) // Cannot have lone "+" or "-"
                  throw ONumberFormatException.forInputString(s);
              i++;
          }
          multmin = limit / radix;
          while (i < len) {
              // Accumulating negatively avoids surprises near MAX_VALUE
              digit = OCharacter.digit(s.charAt(i++),radix);
              if (digit < 0) {
                  throw ONumberFormatException.forInputString(s);
              }
              if (result < multmin) {
                  throw ONumberFormatException.forInputString(s);
              }
              result *= radix;
              if (result < limit + digit) {
                  throw ONumberFormatException.forInputString(s);
              }
              result -= digit;
          }
      } else {
          throw ONumberFormatException.forInputString(s);
      }
       return negative ? result : -result;
   }
    
    public static OLong valueOf(String s, int radix) throws ONumberFormatException {
        return OLong.valueOf(parseLong(s, radix));
    }
    
    public static OLong valueOf(String s) throws ONumberFormatException {
        return OLong.valueOf(parseLong(s, 10));
    }

    public static OLong valueOf(long l) {
        return new OLong(l);
    }
    
    static void getChars(long i, int index, char[] buf) {
        long q;
        int r;
        int charPos = index;
        char sign = 0;
        if (i < 0) {
            sign = '-';
            i = -i;
        }
        // Get 2 digits/iteration using longs until quotient fits into an int
        while (i > Integer.MAX_VALUE) {
            q = i / 100;
            // really: r = i - (q * 100);
            r = (int)(i - ((q << 6) + (q << 5) + (q << 2)));
            i = q;
            buf[--charPos] = OInteger.DigitOnes[r];
            buf[--charPos] = OInteger.DigitTens[r];
        }
        // Get 2 digits/iteration using ints
        int q2;
        int i2 = (int)i;
        while (i2 >= 65536) {
            q2 = i2 / 100;
            // really: r = i2 - (q * 100);
            r = i2 - ((q2 << 6) + (q2 << 5) + (q2 << 2));
            i2 = q2;
            buf[--charPos] = OInteger.DigitOnes[r];
            buf[--charPos] = OInteger.DigitTens[r];
        }
        // Fall thru to fast mode for smaller numbers
        // assert(i2 <= 65536, i2);
        for (;;) {
            q2 = (i2 * 52429) >>> (16+3);
            r = i2 - ((q2 << 3) + (q2 << 1));  // r = i2-(q2*10) ...
            buf[--charPos] = OInteger.digits[r];
            i2 = q2;
            if (i2 == 0) break;
        }
        if (sign != 0) {
            buf[--charPos] = sign;
        }
    }

    // Requires positive x
    static int stringSize(long x) {
        long p = 10;
        for (int i=1; i<19; i++) {
            if (x < p)
                return i;
            p = 10*p;
        }
        return 19;
    }
    
    public static String toString(long i, int radix) {
        if (radix < Character.MIN_RADIX || radix > Character.MAX_RADIX)
            radix = 10;
        if (radix == 10)
            return toString(i);
        char[] buf = new char[65];
        int charPos = 64;
        boolean negative = (i < 0);

        if (!negative) {
            i = -i;
        }

        while (i <= -radix) {
            buf[charPos--] = OInteger.digits[(int)(-(i % radix))];
            i = i / radix;
        }
        buf[charPos] = OInteger.digits[(int)(-i)];

        if (negative) {
            buf[--charPos] = '-';
        }

        return new String(buf, charPos, (65 - charPos));
    }
    
    public static String toString(long i) {
        if (i == OLong.MIN_VALUE)
            return "-9223372036854775808";
        int size = (i < 0) ? stringSize(-i) + 1 : stringSize(i);
        char[] buf = new char[size];
        getChars(i, size, buf);
        return new String(buf);
    }
    
    public int hashCode() {
        return (int)(value ^ (value >>> 32));
    }
    
    public boolean equals(Object obj) {
        if (obj instanceof Long) {
            return value == ((Long)obj).longValue();
        }
        return false;
    }
    
    public int compareTo(OLong anotherLong) {
        return compare(this.value, anotherLong.value);
    }
    
    public static int compare(long x, long y) {
        return (x < y) ? -1 : ((x == y) ? 0 : 1);
    }
    
    public static final int SIZE = 64;
    
    public static long highestOneBit(long i) {
        // HD, Figure 3-1
        i |= (i >>  1);
        i |= (i >>  2);
        i |= (i >>  4);
        i |= (i >>  8);
        i |= (i >> 16);
        i |= (i >> 32);
        return i - (i >>> 1);
    }
    
    public static long lowestOneBit(long i) {
        // HD, Section 2-1
        return i & -i;
    }
    
    public static int numberOfLeadingZeros(long i) {
        // HD, Figure 5-6
         if (i == 0)
            return 64;
        int n = 1;
        int x = (int)(i >>> 32);
        if (x == 0) { n += 32; x = (int)i; }
        if (x >>> 16 == 0) { n += 16; x <<= 16; }
        if (x >>> 24 == 0) { n +=  8; x <<=  8; }
        if (x >>> 28 == 0) { n +=  4; x <<=  4; }
        if (x >>> 30 == 0) { n +=  2; x <<=  2; }
        n -= x >>> 31;
        return n;
    }
    
    public static int numberOfTrailingZeros(long i) {
        // HD, Figure 5-14
        int x, y;
        if (i == 0) return 64;
        int n = 63;
        y = (int)i; if (y != 0) { n = n -32; x = y; } else x = (int)(i>>>32);
        y = x <<16; if (y != 0) { n = n -16; x = y; }
        y = x << 8; if (y != 0) { n = n - 8; x = y; }
        y = x << 4; if (y != 0) { n = n - 4; x = y; }
        y = x << 2; if (y != 0) { n = n - 2; x = y; }
        return n - ((x << 1) >>> 31);
    }
    
    public static int bitCount(long i) {
        // HD, Figure 5-14
        i = i - ((i >>> 1) & 0x5555555555555555L);
        i = (i & 0x3333333333333333L) + ((i >>> 2) & 0x3333333333333333L);
        i = (i + (i >>> 4)) & 0x0f0f0f0f0f0f0f0fL;
        i = i + (i >>> 8);
        i = i + (i >>> 16);
        i = i + (i >>> 32);
        return (int)i & 0x7f;
     }
    
    public static long rotateLeft(long i, int distance) {
        return (i << distance) | (i >>> -distance);
    }
    
    public static long rotateRight(long i, int distance) {
        return (i >>> distance) | (i << -distance);
    }
    
    public static long reverse(long i) {
        // HD, Figure 7-1
        i = (i & 0x5555555555555555L) << 1 | (i >>> 1) & 0x5555555555555555L;
        i = (i & 0x3333333333333333L) << 2 | (i >>> 2) & 0x3333333333333333L;
        i = (i & 0x0f0f0f0f0f0f0f0fL) << 4 | (i >>> 4) & 0x0f0f0f0f0f0f0f0fL;
        i = (i & 0x00ff00ff00ff00ffL) << 8 | (i >>> 8) & 0x00ff00ff00ff00ffL;
        i = (i << 48) | ((i & 0xffff0000L) << 16) |
            ((i >>> 16) & 0xffff0000L) | (i >>> 48);
        return i;
    }
    
    public static int signum(long i) {
        // HD, Section 2-7
        return (int) ((i >> 63) | (-i >>> 63));
    }
    
    public static long reverseBytes(long i) {
        i = (i & 0x00ff00ff00ff00ffL) << 8 | (i >>> 8) & 0x00ff00ff00ff00ffL;
        return (i << 48) | ((i & 0xffff0000L) << 16) |
            ((i >>> 16) & 0xffff0000L) | (i >>> 48);
    }
    
}
