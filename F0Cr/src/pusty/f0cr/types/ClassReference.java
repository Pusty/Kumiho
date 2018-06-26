package pusty.f0cr.types;

public class ClassReference {
	int index;
	Object[] ref;
	//Reference to a Class String
	public ClassReference(Object[] a, int i) {
		index = i;
		ref = a;
	}
	public int getIndex() {
		return index;
	}
	public String toString() {
		return getClass()+" "+ref[index].toString();
	}
}
