package pusty.f0xC.rt.lang;

import pusty.f0xC.lang.OverrideHandler.OverrideTranslation;

//This class is super hacky because of ASCII strings
@OverrideTranslation(override = "java/lang/Character")
public class OCharacter {
	private char value;
    public OCharacter(char value) {
        this.value = value;
    }
    public static OCharacter valueOf(char c) {
        return new OCharacter(c);
    }
    
    public char charValue() {
        return value;
    }
    
    public int hashCode() {
        return (int)value;
    }
    
    public String toString() {
        char buf[] = {value};
        return String.valueOf(buf);
    }
    
    public static String toString(char c) {
        return String.valueOf(c);
    }
    
    public static int digit(char ch, int radix) {
        return digit((int)ch, radix);
    }
    
    public static int digit(int codePoint, int radix) {
        if(OCharacter.isLowerCase(codePoint)) {
        	if(radix + 'a' - 10 <= codePoint) return -1;
        	return codePoint - 'a' + 10;
        }else if(OCharacter.isUpperCase(codePoint)) {
        	if(radix + 'A' - 10 <= codePoint) return -1;
        	return codePoint - 'A' + 10;
        }else if(OCharacter.isDigit(codePoint)) {
        	if(radix + '0'<= codePoint) return -1;
        	return codePoint - '0';
        }else
        	return -1;
    }
    
    public static boolean isLowerCase(char ch) {
        return isLowerCase((int)ch);
    }
    
    public static boolean isLowerCase(int codePoint) {
        return getType(codePoint) == OCharacter.LOWERCASE_LETTER;
    }
    
    public static boolean isUpperCase(char ch) {
        return isUpperCase((int)ch);
    }
    
    public static boolean isUpperCase(int codePoint) {
        return getType(codePoint) == OCharacter.UPPERCASE_LETTER;
    }
    
    public static boolean isDigit(char ch) {
        return isDigit((int)ch);
    }
    
    public static boolean isDigit(int codePoint) {
        return getType(codePoint) == OCharacter.DECIMAL_DIGIT_NUMBER;
    }
    
    public static boolean isDefined(char ch) {
        return isDefined((int)ch);
    }
    
    public static boolean isDefined(int codePoint) {
        return getType(codePoint) != OCharacter.UNASSIGNED;
    }
    
    public static boolean isLetter(char ch) {
        return isLetter((int)ch);
    }
    
    public static boolean isLetter(int codePoint) {
        return (getType(codePoint) == OCharacter.UPPERCASE_LETTER ||
        		getType(codePoint) == OCharacter.LOWERCASE_LETTER ||
        				getType(codePoint) == OCharacter.OTHER_LETTER);
    }
    
    public static boolean isLetterOrDigit(char ch) {
        return isLetterOrDigit((int)ch);
    }
    
    public static boolean isLetterOrDigit(int codePoint) {
        return (isLetter(codePoint) || isDigit(codePoint));
    }
    
    public static boolean isAlphabetic(int codePoint) {
        return (codePoint >= 0x41 && codePoint <= 0x5a) || (codePoint >= 0x61 && codePoint <= 0x7a) ;
    }
    
    public static char toLowerCase(char ch) {
        return (char)toLowerCase((int)ch);
    }
    
    public static int toLowerCase(int codePoint) {
    	if(isAlphabetic(codePoint))
    		return codePoint | 0x20;
    	else
    		return codePoint;
    }
    
    public static char toUpperCase(char ch) {
        return (char)toUpperCase((int)ch);
    }
    
    public static int toUpperCase(int codePoint) {
    	if(isAlphabetic(codePoint))
    		return codePoint & (~0x20);
    	else
    		return codePoint;
    }
    
    public static int getNumericValue(char ch) {
        return getNumericValue((int)ch);
    }
    
    public static int getNumericValue(int codePoint) {
        return codePoint;
    }
    
    public static boolean isSpaceChar(char ch) {
        return isSpaceChar((int)ch);
    }
    
    public static boolean isSpaceChar(int codePoint) {
        return (codePoint == ' ' || codePoint == '\n' || codePoint == '\t');
    }
    
    public static boolean isWhitespace(char ch) {
        return isWhitespace((int)ch);
    }
    
    public static boolean isWhitespace(int codePoint) {
    	return (codePoint == ' ');
    }
    
    public static int getType(char ch) {
        return getType((int)ch);
    }
    
    public static final byte UNASSIGNED = 0;
    public static final byte UPPERCASE_LETTER = 1;
    public static final byte LOWERCASE_LETTER = 2;
    public static final byte OTHER_LETTER = 5;
    public static final byte DECIMAL_DIGIT_NUMBER = 9;
    
    public static int getType(int codePoint) {
    	if(codePoint >= 0x41 && codePoint <= 0x5a) return UPPERCASE_LETTER;
    	if(codePoint >= 0x61 && codePoint <= 0x7a) return LOWERCASE_LETTER;
    	if(codePoint >= 0x30 && codePoint <= 0x39) return DECIMAL_DIGIT_NUMBER;
    	if(codePoint >= 0x20 && codePoint <= 0x7E) return OTHER_LETTER;
        return UNASSIGNED;
    }
    
    public int compareTo(OCharacter anotherCharacter) {
        return compare(this.value, anotherCharacter.value);
    }
    
    public static int compare(char x, char y) {
        return x - y;
    }
    
}
