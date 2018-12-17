package pusty.f0cr.types;

public class InvokeDynamic {
	Object[] ref;
	short bootstrapIndex;
	short nameAndTypeIndex;
	//Reference to a Class String
	public InvokeDynamic(Object[] a, short bootstrapIndex, short nameAndTypeIndex) {
		ref = a;
		this.bootstrapIndex = bootstrapIndex;
		this.nameAndTypeIndex = nameAndTypeIndex;
	}
}
