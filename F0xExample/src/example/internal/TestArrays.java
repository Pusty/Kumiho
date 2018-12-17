package example.internal;

import java.util.Arrays;

public class TestArrays {
	public static void main(String[] args) {
		int[] arrayInt = new int[10];
		boolean boolArray[]  = new boolean[30];
		String strArray[] = new String[24];
		/*Object test[] = new Object[10] {
				@Override
				public String toString() {
					return Arrays.toString(this);
				}
		};*/
		System.out.println(arrayInt.toString());
		System.out.println(arrayInt.getClass());
		System.out.println(boolArray.toString());
		System.out.println(strArray.toString());
	}
}
