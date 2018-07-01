package pusty.f0cr;

public class Test {
	
	int testValue = 26;
	double unInitTest;
	
	public Test() {
		testValue = 25;
		unInitTest = 7d;
	}
	public int getTest() { return testValue;}
	
	static Long[] value = new Long[25];
	
	public static void main(String[] args) {
//		int value = 5;
//		System.out.println(simpleSwitch(value));
		for(int i=0;i<5;i++) {
			System.out.println("Hellow");
		}
	}
//	public static int simpleSwitch(int intOne) {
//	    switch (intOne) {
//	        case 0:
//	            return 3;
//	        case 1:
//	            return 2;
//	        case 4:
//	            return 1;
//	        default:
//	            return -1;
//	    }
//	}

}
