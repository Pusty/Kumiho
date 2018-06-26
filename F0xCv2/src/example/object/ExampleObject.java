package example.object;

//This Class is going to get compiled and read via F0Cr and then converted into F0xC nodes
public class ExampleObject {
	private ExampleObjectChild obj;
	public ExampleObject() {
		obj = new ExampleObjectChild(1337);
	}
	public ExampleObjectChild getChild() {
		return obj;
	}
	
	public ExampleObjectChild createChild() {
		ExampleObjectChild child = new ExampleObjectChild(420);
		return child;
	}
}
