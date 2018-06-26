package pusty.f0cr.types;

public class StringReference {
	int index;
	Object[] ref;
	//Index to a String
	public StringReference(Object[] a,int i) {
		index = i;
		ref = a;
	}
	public int getIndex() {
		return index;
	}
	public String toString() {
		return getClass()+": "+'"'+ref[getIndex()].toString()+'"';
	}
}
