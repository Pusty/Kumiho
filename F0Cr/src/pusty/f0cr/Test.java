package pusty.f0cr;

public class Test {
	public static Long value = new Long(25L);
	
	public static void main(String[] args) {
		int value = 7;
		System.out.println(simpleSwitch(value));
	}
	public static int simpleSwitch(int intOne) {
	    switch (intOne) {
        case 10:
            return 1;
        case 20:
            return 2;
        case 30:
            return 3;
        default:
            return -1;
    }
	}

}
