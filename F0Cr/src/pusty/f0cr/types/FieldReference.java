package pusty.f0cr.types;

public class FieldReference {
	int index;
	int index2;
	Object[] ref;
	//Reference to a (class reference) and (name and type descriptor)
	public FieldReference(Object[] a,int c, int nat) {
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
		return getClass()+": "+ref[index].toString() + "."+ ref[((NameAndTypeDescriptor)ref[getNameAndType()]).getIdentifier()]+" : "+ref[((NameAndTypeDescriptor)ref[getNameAndType()]).getEncodedTypeDescriptor()];
	}
}
