package example.object;

//This Class is going to get compiled and read via F0Cr and then converted into F0xC nodes
public class ExampleObjectChild {
	private int childValue;
	public ExampleObjectChild(int v) {
		childValue = v;
	}
	public void setChildValue(int a) {
		childValue = a;
	}
	public int getChildValue() {
		return childValue;
	}
}
