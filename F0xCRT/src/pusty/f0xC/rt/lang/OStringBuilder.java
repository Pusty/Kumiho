package pusty.f0xC.rt.lang;

import pusty.f0xC.lang.OverrideHandler.OverrideTranslation;

@OverrideTranslation(override = "java/lang/StringBuilder")
public class OStringBuilder{
	
	private char[] chars;
	private int length;
	
	static final int INITIAL_CAPACITY = 16;
	
	public OStringBuilder() {
		this(INITIAL_CAPACITY);
	}
	
	public OStringBuilder(int capacity) {
		chars = new char[capacity];
	}
	
	public OStringBuilder(OStringBuilder builder) {
		length = builder.length;
		chars = new char[length + INITIAL_CAPACITY];
		System.arraycopy(builder.chars, 0, chars, 0, length);
	}
	
	public OStringBuilder(String string) {
		length = string.length();
		chars = new char[length + INITIAL_CAPACITY];
		string.getChars(0, length, chars, 0);
	}
	
	private void enlargeBuffer(int min) {
		int newSize =(chars.length >> 1) + chars.length + 2;
		char[] newData = new char[min > newSize ? min : newSize];
		System.arraycopy(chars, 0, newData, 0, length);
		chars = newData;
	}
	
	final void appendNull() {
		int newSize = length + 4;
		if(newSize > chars.length) {
			enlargeBuffer(newSize);
		}
		chars[length++] = 'n';
		chars[length++] = 'u';
		chars[length++] = 'l';
		chars[length++] = 'l';
	}
	
	final void append0(char[] value) {
		int newSize = length + value.length;
		if(newSize > chars.length) {
			enlargeBuffer(newSize);
		}
		System.arraycopy(value, 0, chars, length, value.length);
		length = newSize;
	}
	
	final void append0(char[] value, int offset, int length) {
		if(offset > value.length || offset < 0)
			return;
		if(length < 0 || value.length - offset < length)
			return;
		int newSize = this.length + length;
		if(newSize > chars.length) {
			enlargeBuffer(newSize);
		}
		System.arraycopy(value, offset, chars, this.length, length);
		this.length = newSize;
	}

	final void append0(char ch) {
		if(length == chars.length) {
			enlargeBuffer(length + 1);
		}
		chars[length++] = ch;
	}

	final void append0(String string) {
		if(string == null) {
			appendNull();
			return;
		}
		int adding = string.length();
		int newSize = length + adding;
		if(newSize > chars.length) {
			enlargeBuffer(newSize);
		}
		string.getChars(0, adding, chars, length);
		length = newSize;
	}

	
	final void delete0 (int start, int end) {
		if (start >= 0) {
			if (end > length)
				end = length;
			if (end == start)
				return;
			if (end > start) {
				int count = length - end;
				if (count >= 0) System.arraycopy(chars, end, chars, start, count);
				length -= end - start;
				return;
			}
		}
		return;
	}
	
	final void deleteCharAt0 (int location) {
		if (0 > location || location >= length)
			return;
		int count = length - location - 1;
		if (count > 0)
			System.arraycopy(chars, location + 1, chars, location, count);
		length--;
	}
	
	public void ensureCapacity (int min) {
		if (min > chars.length) {
			int twice = (chars.length << 1) + 2;
			enlargeBuffer(twice > min ? twice : min);
		}
	}
	
	public void getChars (int start, int end, char[] dest, int destStart) {
		if (start > length || end > length || start > end)
			return;
		System.arraycopy(chars, start, dest, destStart, end - start);
	}
	

	final void insert0 (int index, char[] value) {
		if (0 > index || index > length)
			return;
		
		if (value.length != 0) {
			move(value.length, index);
			System.arraycopy(value, 0, value, index, value.length);
			length += value.length;
		}
	}
	
	final void insert0 (int index, char[] value, int start, int length) {
		if (0 <= index && index <= length) {
			if (start >= 0 && 0 <= length && length <= value.length - start) {
				if (length != 0) {
					move(length, index);
					System.arraycopy(value, start, chars, index, length);
					this.length += length;
				}
				return;
			}
			return;
		}
		return;
	}
	
	final void insert0 (int index, char ch) {
		if (0 > index || index > length)
			return;
		move(1, index);
		chars[index] = ch;
		length++;
	}
	
	final void insert0 (int index, String string) {
		if (0 <= index && index <= length) {
			if (string == null)
				string = "null";
			int min = string.length();
			if (min != 0) {
				move(min, index);
				string.getChars(0, min, chars, index);
				length += min;
			}
		} else
			return;
	}
	
	private void move (int size, int index) {
		if (chars.length - length >= size) {
			System.arraycopy(chars, index, chars, index + size, length - index); // index == count case is no-op
			return;
		}
		int a = length + size, b = (chars.length << 1) + 2;
		int newSize = a > b ? a : b;
		char[] newData = new char[newSize];
		System.arraycopy(chars, 0, newData, 0, index);
		System.arraycopy(chars, index, newData, index + size, length - index);
		chars = newData;
	}
	
	final void replace0 (int start, int end, String string) {
		if (start >= 0) {
			if (end > length)
				end = length;
			if (end > start) {
				int stringLength = string.length();
				int diff = end - start - stringLength;
				if (diff > 0)
					System.arraycopy(chars, end, chars, start + stringLength, length - end);
				else if (diff < 0)
					move(-diff, end);
				string.getChars(0, stringLength, chars, start);
				length -= diff;
				return;
			}
			if (start == end) {
				if (string == null)
					return;
				insert0(start, string);
				return;
			}
		}
		return;
	}
	
	final void reverse0 () {
		if (length < 2)
			return;
		for(int i=0;i<length;i++) {
			char c = chars[length-i-1];
			chars[length-i-1] = chars[i];
			chars[i] = c;
		}
	}
	
    public int length() {
        return length;
    }
	
    public int capacity() {
        return chars.length;
    }
    
	final char[] getValue() {
		return chars;
	}

	public char charAt(int index) {
		if(index < 0 || index >= length)
			return 0;
		return chars[index];
	}
	
	
	public void setCharAt(int index, char ch) {
		if(0 > index || index >= length)
			return;
		chars[index] = ch;
	}
	
	public void setLength(int newLength) {
		if(newLength < 0)
			return;
		if(newLength > chars.length)
			enlargeBuffer(newLength);
		else if(length < newLength) {
			for(int i=length;i<newLength;i++)
				chars[i] = 0;
		}
		length = newLength;
	}
	
	public OString substring(int start) {
		if(0 <= start && start <= length) {
			if(start == length)
				return new OString();
			return new OString(chars, start, length - start);
		}
		return null;
	}
	
	public OString substring(int start, int end) {
		if(0 <= start && start <= end && end <= length) {
			if(start == end)
				return new OString();
			return new OString(chars, start, end - start);
		}
		return null;
	}

	public String toString() {
		if(length == 0) return "";
		return new String(chars, 0, length);
	}

	public int indexOf (String string) {
		return indexOf(string, 0);
	}
	
	public int indexOf (String subString, int start) {
		if (start < 0)
			start = 0;
		int subCount = subString.length();
		if (subCount > 0) {
			if (subCount + start > length)
				return -1;
			char firstChar = subString.charAt(0);
			while (true) {
				int i = start;
				boolean found = false;
				for (; i < length; i++) {
					if (chars[i] == firstChar) {
						found = true;
						break;
					}
				}
				if (!found || subCount + i > length)
					return -1;
				int o1 = i, o2 = 0;
				while (++o2 < subCount && chars[++o1] == subString.charAt(o2)) {}
				if (o2 == subCount)
					return i;
				start = i + 1;
			}
		}
		return start < length || start == 0 ? start : length;
	}
	
	public int lastIndexOf (String string) {
		return lastIndexOf(string, length);
	}
	
	public int lastIndexOf (String subString, int start) {
		int subCount = subString.length();
		if (subCount <= length && start >= 0) {
			if (subCount > 0) {
				if (start > length - subCount)
					start = length - subCount;
				char firstChar = subString.charAt(0);
				while (true) {
					int i = start;
					boolean found = false;
					for (; i >= 0; --i)
						if (chars[i] == firstChar) {
							found = true;
							break;
						}
					if (!found)
						return -1;
					int o1 = i, o2 = 0;
					while (++o2 < subCount && chars[++o1] == subString.charAt(o2)) {}
					if (o2 == subCount)
						return i;
					start = i - 1;
				}
			}
			return start < length ? start : length;
		}
		return -1;
	}
	
	public void trimToSize () {
		if (length < chars.length) {
			char[] newValue = new char[length];
			System.arraycopy(chars, 0, newValue, 0, length);
			chars = newValue;
		}
	}
	
	public OStringBuilder append(boolean b) {
		append0(b ? "true" : "false"); //$NON-NLS-1$ //$NON-NLS-2$
		return this;
	}
	
	public OStringBuilder append(char c) {
		append0(c);
		return this;
	}
	
	public OStringBuilder append(int i) {
		append0(Integer.toString(i));
		return this;
	}
	
	public OStringBuilder append(long l) {
		append0(Long.toString(l));
		return this;
	}
	
	public OStringBuilder append(float f) {
		append0(Float.toString(f));
		return this;
	}
	
	public OStringBuilder append(double d) {
		append0(Double.toString(d));
		return this;
	}
	
	public OStringBuilder append(Object obj) {
		if (obj == null) {
			appendNull();
		} else {
			append0(obj.toString());
		}
		return this;
	}
	
	public OStringBuilder append(String str) {
		append0(str);
		return this;
	}
	
	public OStringBuilder append(char[] ch) {
		append0(ch);
		return this;
	}
	
	public OStringBuilder append(char[] str, int offset, int len) {
		append0(str, offset, len);
		return this;
	}
	
	public OStringBuilder append(OStringBuilder builder) {
		if(builder == null)
			appendNull();
		else
			append0(builder.chars, 0, builder.length);
		return this;
	}
	
	
	public OStringBuilder append(OStringBuilder builder, int start, int end) {
		if(builder == null)
			appendNull();
		else
			append0(builder.chars, start, end);
		return this;
	}
	
	public OStringBuilder delete(int start, int end) {
		delete0(start, end);
		return this;
	}
	
	public OStringBuilder deleteCharAt(int index) {
		deleteCharAt0(index);
		return this;
	}
	
	public OStringBuilder insert(int offset, boolean b) {
		insert0(offset, b ? "true" : "false"); //$NON-NLS-1$ //$NON-NLS-2$
		return this;
	}
	
	public OStringBuilder insert(int offset, char c) {
		insert0(offset, c);
		return this;
	}
	
	public OStringBuilder insert(int offset, int i) {
		insert0(offset, Integer.toString(i));
		return this;
	}
	
	public OStringBuilder insert(int offset, long l) {
		insert0(offset, Long.toString(l));
		return this;
	}
	
	public OStringBuilder insert(int offset, float f) {
		insert0(offset, Float.toString(f));
		return this;
	}
	
	public OStringBuilder insert(int offset, double d) {
		insert0(offset, Double.toString(d));
		return this;
	}
	
	public OStringBuilder insert(int offset, Object obj) {
		insert0(offset, obj == null ? "null" : obj.toString()); //$NON-NLS-1$
		return this;
	}
	
	public OStringBuilder insert(int offset, String str) {
		insert0(offset, str);
		return this;
	}
	
	public OStringBuilder insert(int offset, char[] ch) {
		insert0(offset, ch);
		return this;
	}
	
	public OStringBuilder insert(int offset, char[] str, int strOffset, int strLen) {
		insert0(offset, str, strOffset, strLen);
		return this;
	}
	
	public OStringBuilder replace(int start, int end, String str) {
		replace0(start, end, str);
		return this;
	}
	
	public OStringBuilder reverse() {
		reverse0();
		return this;
	}
    
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime + length;
		result = prime * result + super.hashCode(); //Arrays.hashCode(chars);
		return result;
	}

}
