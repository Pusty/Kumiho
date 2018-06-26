package pusty.f0xC.rt.lang;

import java.util.ArrayList;

import pusty.f0xC.lang.OverrideHandler.OverrideTranslation;

//parts copy pasted from jdk
@OverrideTranslation(override = "java/lang/String")
public class OString implements OCharSequence {
	private char[] value;
	private int    hash;
	
	public OString(char[] array) {
		value = new char[array.length];
		for(int i=0;i<array.length;i++)
			value[i] = array[i];
	}
	
	public OString(byte[] bytes) {
		this(bytes, 0, bytes.length);
	}
	
	public OString() {
		value = new char[0];
	}
	
	public OString(OString s) {
		this.value = s.value;
		this.hash  = s.hash;
	}
	
    public OString(byte value[], int offset, int count) {
        if (offset < 0) {
            throw new StringIndexOutOfBoundsException(offset);
        }
        if (count < 0) {
            throw new StringIndexOutOfBoundsException(count);
        }
        if (offset > value.length - count) {
            throw new StringIndexOutOfBoundsException(offset + count);
        }
        char[] copy = new char[count];
        for(int i=0;i<count;i++)
        	copy[i] = (char)value[offset+i];
        this.value = copy;
    }
    public OString(char value[], int offset, int count) {
        if (offset < 0) {
            throw new StringIndexOutOfBoundsException(offset);
        }
        if (count < 0) {
            throw new StringIndexOutOfBoundsException(count);
        }
        if (offset > value.length - count) {
            throw new StringIndexOutOfBoundsException(offset + count);
        }
        char[] copy = new char[count];
        for(int i=0;i<count;i++)
        	copy[i] = value[offset+i];
        this.value = copy;
    }
    
    public OString(OStringBuilder builder) {
        int l = builder.getValue().length > builder.length()?builder.length():builder.getValue().length;
        char[] copy = new char[l];
        for(int i=0;i<l;i++)
        	copy[i] = builder.charAt(i);
        this.value = copy;
    }
	
	public int length() {
		return value.length;
	}
	
	
    public boolean isEmpty() {
        return value.length == 0;
    }
    
    public char charAt(int index) {
        if ((index < 0) || (index >= value.length)) {
            throw new StringIndexOutOfBoundsException(index);
        }
        return value[index];
    }
    
    public byte[] getBytes() {
    	byte[] array = new byte[value.length];
        for(int i=0;i<array.length;i++)
        	array[i] = (byte)value[i];
        return array;
    }

    public static OString valueOf(char c) {
        char data[] = {c};
        return new OString(data);
    }
    
  /*  public static String valueOf(Object obj) {
        return (obj == null) ? "null" : obj.toString();
    }*/
    
    public static String valueOf(char data[]) {
        return new String(data);
    }
    
    public static String valueOf(boolean b) {
        return b ? "true" : "false";
    }
    
    public static String valueOf(int i) {
        return Integer.toString(i);
    }
    
    public static String valueOf(long l) {
        return Long.toString(l);
    }
    
    public static String valueOf(float f) {
        return Float.toString(f);
    }
    
    public static String valueOf(double d) {
        return Double.toString(d);
    }
    
    public int indexOf(int ch) {
        return indexOf(ch, 0);
    }
    
    public int indexOf(int ch, int fromIndex) {
        final int max = value.length;
        if (fromIndex < 0)
            fromIndex = 0;
        else if (fromIndex >= max)
            return -1;
        final char[] value = this.value;
        for (int i = fromIndex; i < max; i++)
            if (value[i] == ch)
                return i;
        return -1;
    }
    /*
    public boolean equals(Object anObject) {
        if (this == anObject) {
            return true;
        }
        if (anObject instanceof OString) {
            OString anotherString = (OString) anObject;
            int n = value.length;
            if (n == anotherString.value.length) {
                char v1[] = value;
                char v2[] = anotherString.value;
                int i = 0;
                while (n-- != 0) {
                    if (v1[i] != v2[i])
                            return false;
                    i++;
                }
                return true;
            }
        }
        return false;
    }*/

    public OString substring(int beginIndex) {
        if (beginIndex < 0) {
            throw new StringIndexOutOfBoundsException(beginIndex);
        }
        int subLen = value.length - beginIndex;
        if (subLen < 0) {
            throw new StringIndexOutOfBoundsException(subLen);
        }
        return (beginIndex == 0) ? this : new OString(value, beginIndex, subLen);
    }
    
    public OString substring(int beginIndex, int endIndex) {
        if (beginIndex < 0) {
            throw new StringIndexOutOfBoundsException(beginIndex);
        }
        if (endIndex > value.length) {
            throw new StringIndexOutOfBoundsException(endIndex);
        }
        int subLen = endIndex - beginIndex;
        if (subLen < 0) {
            throw new StringIndexOutOfBoundsException(subLen);
        }
        return ((beginIndex == 0) && (endIndex == value.length)) ? this
                : new OString(value, beginIndex, subLen);
    }
    
    void getChars(char dst[], int dstBegin) {
        System.arraycopy(value, 0, dst, dstBegin, value.length);
    }
    
    public void getChars(int srcBegin, int srcEnd, char dst[], int dstBegin) {
        if (srcBegin < 0) {
            throw new StringIndexOutOfBoundsException(srcBegin);
        }
        if (srcEnd > value.length) {
            throw new StringIndexOutOfBoundsException(srcEnd);
        }
        if (srcBegin > srcEnd) {
            throw new StringIndexOutOfBoundsException(srcEnd - srcBegin);
        }
        System.arraycopy(value, srcBegin, dst, dstBegin, srcEnd - srcBegin);
    }
    
    public boolean regionMatches(int toffset, OString other, int ooffset,
            int len) {
        char ta[] = value;
        int to = toffset;
        char pa[] = other.value;
        int po = ooffset;
        if ((ooffset < 0) || (toffset < 0)
                || (toffset > value.length - len)
                || (ooffset > other.value.length - len))
            return false;
     
        while (len-- > 0)
            if (ta[to++] != pa[po++])
                return false;
        return true;
    }
    
    public boolean startsWith(OString prefix, int toffset) {
        char ta[] = value;
        int to = toffset;
        char pa[] = prefix.value;
        int po = 0;
        int pc = prefix.value.length;
        if ((toffset < 0) || (toffset > value.length - pc))
            return false;
   
        while (--pc >= 0)
            if (ta[to++] != pa[po++])
                return false;
        return true;
    }
    
    public boolean startsWith(OString prefix) {
        return startsWith(prefix, 0);
    }
    
    public boolean endsWith(OString suffix) {
        return startsWith(suffix, value.length - suffix.value.length);
    }
    
    public int hashCode() {
        int h = hash;
        if (h == 0 && value.length > 0) {
            char val[] = value;
            for (int i = 0; i < value.length; i++)
                h = 31 * h + val[i];
            hash = h;
        }
        return h;
    }
    
    public int indexOf(OString str) {
        return indexOf(str, 0);
    }
    
    public int indexOf(OString str, int fromIndex) {
        return indexOf(value, 0, value.length,
                str.value, 0, str.value.length, fromIndex);
    }
    
    static int indexOf(char[] source, int sourceOffset, int sourceCount,
            char[] target, int targetOffset, int targetCount,
            int fromIndex) {
        if (fromIndex >= sourceCount)
            return (targetCount == 0 ? sourceCount : -1);
        if (fromIndex < 0)
            fromIndex = 0;
        if (targetCount == 0)
            return fromIndex;
        char first = target[targetOffset];
        int max = sourceOffset + (sourceCount - targetCount);
        for (int i = sourceOffset + fromIndex; i <= max; i++) {
            if (source[i] != first)
                while (++i <= max && source[i] != first);
            if (i <= max) {
                int j = i + 1;
                int end = j + targetCount - 1;
                for (int k = targetOffset + 1; j < end && source[j] == target[k]; j++, k++);
                if (j == end)
                    return i - sourceOffset;
            }
        }
        return -1;
    }
    
    public int lastIndexOf(OString str) {
        return lastIndexOf(str, value.length);
    }
    
    public int lastIndexOf(OString str, int fromIndex) {
        return lastIndexOf(value, 0, value.length,
                str.value, 0, str.value.length, fromIndex);
    }
    
    static int lastIndexOf(char[] source, int sourceOffset, int sourceCount,
            char[] target, int targetOffset, int targetCount,
            int fromIndex) {
        int rightIndex = sourceCount - targetCount;
        if (fromIndex < 0)
            return -1;
        if (fromIndex > rightIndex)
            fromIndex = rightIndex;
        if (targetCount == 0)
            return fromIndex;
        int strLastIndex = targetOffset + targetCount - 1;
        char strLastChar = target[strLastIndex];
        int min = sourceOffset + targetCount - 1;
        int i = min + fromIndex;
        startSearchForLastChar:
        while (true) {
            while (i >= min && source[i] != strLastChar)
                i--;
            if (i < min)
                return -1;
            int j = i - 1;
            int start = j - (targetCount - 1);
            int k = strLastIndex - 1;

            while (j > start)
                if (source[j--] != target[k--]) {
                    i--;
                    continue startSearchForLastChar;
                }
            return start - sourceOffset + 1;
        }
    }
    
    public OString concat(OString str) {
        int otherLen = str.length();
        if (otherLen == 0)
            return this;
        int len = value.length;
        char buf[] = new char[len + otherLen];
        for(int i=0;i<len;i++)
        	buf[i] = value[i];
        str.getChars(buf, len);
        return new OString(buf);
    }
    
    public OString replace(char oldChar, char newChar) {
        if (oldChar != newChar) {
            int len = value.length;
            int i = -1;
            char[] val = value;
            while (++i < len)
                if (val[i] == oldChar)
                    break;
            if (i < len) {
                char buf[] = new char[len];
                for (int j = 0; j < i; j++)
                    buf[j] = val[j];
                while (i < len)  {
                    char c = val[i];
                    buf[i] = (c == oldChar) ? newChar : c;
                    i++;
                }
                return new OString(buf);
            }
        }
      
        return this;
    }
    
    public OString toLowerCase() {
    	char[] newStr = new char[value.length];
    	for(int i=0;i<value.length;i++)
    		newStr[i] = OCharacter.toLowerCase(value[i]);
    	return new OString(newStr);
    }
    
    public boolean contains(OString s) {
        return indexOf(s) > -1;
    }
    
    public boolean contains(CharSequence s) {
        return indexOf((OString)((Object)s.toString())) > -1;
    }
    
    public boolean regionMatches(boolean ignoreCase, int toffset,
            OString other, int ooffset, int len) {
        char ta[] = value;
        int to = toffset;
        char pa[] = other.value;
        int po = ooffset;
        if ((ooffset < 0) || (toffset < 0)
                || (toffset > (long)value.length - len)
                || (ooffset > (long)other.value.length - len)) {
            return false;
        }
        while (len-- > 0) {
            char c1 = ta[to++];
            char c2 = pa[po++];
            if (c1 == c2) {
                continue;
            }
            if (ignoreCase) {
                char u1 = Character.toUpperCase(c1);
                char u2 = Character.toUpperCase(c2);
                if (u1 == u2) {
                    continue;
                }
                if (Character.toLowerCase(u1) == Character.toLowerCase(u2)) {
                    continue;
                }
            }
            return false;
        }
        return true;
    }
    
    public boolean equalsIgnoreCase(OString anotherString) {
        return (this == anotherString) ? true
                : (anotherString != null)
                && (anotherString.value.length == value.length)
                && regionMatches(true, 0, anotherString, 0, value.length);
    }
    
    public OString trim() {
        int len = value.length;
        int st = 0;
        char[] val = value;
        while ((st < len) && (val[st] <= ' '))
            st++;
        while ((st < len) && (val[len - 1] <= ' '))
            len--;
        return ((st > 0) || (len < value.length)) ? substring(st, len) : this;
    }
    
    public String toString() {
        return new String(this.getBytes());
    }
    
    public char[] toCharArray() {
        char result[] = new char[value.length];
        System.arraycopy(value, 0, result, 0, value.length);
        return result;
    }
    
    public static String valueOf(Object obj) {
        return (obj == null) ? "null" : obj.toString();
    }
    
    public static String valueOf(char data[], int offset, int count) {
        return new String(data, offset, count);
    }
    
    public static String copyValueOf(char data[], int offset, int count) {
        return new String(data, offset, count);
    }
    
    public static String copyValueOf(char data[]) {
        return new String(data);
    }
    
    public OString[] split(OString delim) {
	    ArrayList<OString> l = new ArrayList<OString>();
	    int offset = 0;
	    while (true)
	    {
	        int index = this.indexOf(delim, offset);
	        if (index == -1)
	        {
	        	OString last = this.substring(offset);
	        	if(last.length() > 0)
	        		l.add(last);
	            return (OString[]) l.toArray();
	        } else
	        {
	            l.add(this.substring(offset, index));
	            offset = (index + delim.length());
	        }
	    }
	}
    
    
    public String replace(CharSequence ths, CharSequence that) {
	    StringBuilder sb = new StringBuilder((String)((Object)this));
	    int idx = sb.indexOf(ths.toString()); 
	    sb.replace(idx, idx + ths.length(), that.toString());
        return sb.toString();
    }
    
    
	public String replaceAll(String ths, String that) {
	    StringBuilder sb = new StringBuilder((String)((Object)this));
	    int idx = sb.indexOf(ths); 
	    while (idx > -1) {
	        sb.replace(idx, idx + ths.length(), that);
	        idx = sb.indexOf(ths);
	    } 
        return sb.toString();
	}

    public CharSequence subSequence(int beginIndex, int endIndex) {
        return (CharSequence) this.substring(beginIndex, endIndex);
    }

    
    public int compareTo(OString anotherString) {
        int len1 = value.length;
        int len2 = anotherString.value.length;
        int lim = len1>len2?len2:len1;
        char v1[] = value;
        char v2[] = anotherString.value;

        int k = 0;
        while (k < lim) {
            char c1 = v1[k];
            char c2 = v2[k];
            if (c1 != c2) {
                return c1 - c2;
            }
            k++;
        }
        return len1 - len2;
    }
    
    public int compareToIgnoreCase(OString str) {
        return this.toLowerCase().compareToIgnoreCase(str.toLowerCase());
    }

    public int lastIndexOf(int ch) {
        return lastIndexOf(ch, value.length - 1);
    }
    
    public int lastIndexOf(int ch, int fromIndex) {
            // handle most cases here (ch is a BMP code point or a
            // negative value (invalid code point))
        final char[] value = this.value;
        int i = fromIndex > (value.length - 1)? (value.length - 1) : fromIndex;
        for (; i >= 0; i--) {
            if (value[i] == ch) {
                return i;
            }
        }
        return -1;
    }


}
