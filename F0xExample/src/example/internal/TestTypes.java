package example.internal;

public class TestTypes {
	
	public static byte returnByte() {
		return 0;
	}
	public static char returnChar() {
		return 2;
	}
	public static short returnShort() {
		return 3;
	}
	public static int returnInt() {
		return 7;
	}
	public static long returnLong() {
		return 8l;
	}
	public static float returnFloat() {
		return 5f;
	}
	public static double returnDouble() {
		return 4d;
	}
	public static void returnVoid() {
		return;
	}
	public static boolean returnBool() {
		return true;
	}
	
	//boolean tests
	public static boolean boolFunc0(boolean in) {
		if(in==true)
			return true;
		else
			return false;
	}
	
	public static boolean boolFunc1(boolean in) {
		if(in)
			return true;
		else
			return false;
	}
	
	public static boolean boolFunc2(boolean in) {
		return in?true:false;
	}
	
	public static boolean boolFunc3(boolean in) {
		if(!in)
			return true;
		else
			return false;
	}
	
	public static boolean boolFunc4(boolean in) {
		return !in;
	}
	
	public static void main(String[] args) {
		returnBool();
		boolFunc0(true);
		boolFunc1(true);
		boolFunc2(false);
		boolFunc3(true);
		boolFunc4(true);
	}
}
