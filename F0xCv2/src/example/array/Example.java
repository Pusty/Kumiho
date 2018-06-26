package example.array;

import example.object.ExampleObjectChild;

//Testing of arrays
public class Example {
	public static void main(String[] args) {
		ExampleObjectChild[][] arrayM = new ExampleObjectChild[2][];
		arrayM[1] = new ExampleObjectChild[2];
		arrayM[1][0] = null;
		arrayM[1][1] = new ExampleObjectChild(5);
		arrayM[1][1] = null;
		arrayM[1][0] = new ExampleObjectChild(7);
		System.out.println(arrayM[1].length);
		for(int i=0;i<arrayM[1].length;i++)
			System.out.println(arrayM[1][i]==null?1337:arrayM[1][i].getChildValue());
	}
}
