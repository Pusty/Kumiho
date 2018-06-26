package example.internal;

public class Template implements ITemplate {
	int original = 0;
	public void runMe() {
		System.out.println("default output");
	}
	@Override
	public void meanFunction() {
		System.out.println(meanVariable);
	}
	public static Template create() {
		return new Template();
	}
}
