package example.object;

//This Class is going to get compiled and read via F0Cr and then converted into F0xC nodes
public class Example {
	public static void main(String[] args) {
		ExampleObject obj = new ExampleObject();
		System.out.println(obj.createChild().getChildValue());
		new Example(); 
		obj.createChild();
	}
}
