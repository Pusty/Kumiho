package pusty.f0cr.types;

public class MethodType {
	int index;
	Object[] ref;
	//Represents a Method Type
	public MethodType(Object[] a,int i) {
		index = i;
		ref = a;
	}
	public int getIndex() {
		return index;
	}
}
