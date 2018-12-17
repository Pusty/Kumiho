package pusty.f0cr.types;

public class MethodHandle {
	int index;
	int index2;
	Object[] ref;
	//Reference to a (type descriptor) and (index within constant pool)
	public MethodHandle(Object[] a,int kind, int in) {
		index = kind;
		index2 = in;
		ref = a;
	}
	public int getKind() {
		return index;
	}
	public int getIndex() {
		return index2;
	}
}
