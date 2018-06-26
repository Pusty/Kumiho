package pusty.f0cr.types;

public class NameAndTypeDescriptor {
	int index;
	int index2;
	Object[] ref;
	//Reference to a (reference to string identifier) and (reference to encoded type descriptor)
	public NameAndTypeDescriptor(Object[] a,int id, int enc) {
		index = id;
		index2 = enc;
		ref = a;
	}
	public int getIdentifier() {
		return index;
	}
	public int getEncodedTypeDescriptor() {
		return index2;
	}
	public String toString() {
		return getClass()+": "+ref[getIdentifier()]+" "+ref[getEncodedTypeDescriptor()];
	}
}
