package pusty.f0cr.types;

public class MethodReference {
	int index;
	int index2;
	Object[] ref;
	//Reference to a (class reference) and (name and type descriptor)
	public MethodReference(Object[] a,int c, int nat) {
		index = c;
		index2 = nat;
		ref = a;
	}
	public int getClassReference() {
		return index;
	}
	public int getNameAndType() {
		return index2;
	}
	public String toString() {
		return ref[getClassReference()].toString()+"."+ref[getNameAndType()].toString();
	}
}
