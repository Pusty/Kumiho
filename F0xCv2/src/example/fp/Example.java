package example.fp;

//Testing of arrays
public class Example {
	public static void main(String[] args) {
		long a = -213L;
		long b = -213L;
		long c = 1000000L;
		long d = 20L;
		
		
		if(d == 20L)
			System.out.println(a*b*c*d);
		
		if(d != 20L)
			System.out.println("?");
		if(c*d == 20000000L)
			System.out.println("!");
		
		
		System.out.println(c/d);
		System.out.println(c*d);
		System.out.println((c-a)%d);
		System.out.println(c==d);
		System.out.println(a==b);
		/*float a = 7.5f;
		float d = 9.11f;
		System.out.println((int)new Example().doubleMath2(a, d)); //error!
		System.out.println((int)doubleMath(a, d));*/
	}
	
	public static float doubleMath(float a, float b) {
		return a*b;
	}
	
	public double doubleMath2(double a, double b) {
		return (double) (a*b*3);
	}
}
