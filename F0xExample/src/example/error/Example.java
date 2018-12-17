package example.error;

//Testing of arrays
public class Example {
	public static void main(String[] args) {
		System.out.println(ping(26));
	}
	
	public static int ping(int i) {
		try {
			return i; 
		}catch(Exception e) {
			return -1;
		}
	}
	
}
