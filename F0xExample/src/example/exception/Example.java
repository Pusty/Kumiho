package example.exception;

//Testing of arrays
public class Example {
	public static void main(String[] args) {
		try {
			Integer.parseInt("I'm a banana".substring(1337));
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
