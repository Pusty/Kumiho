package pusty.f0cr.attribute;

import java.io.DataInputStream;

import pusty.f0cr.ClassReader;

public class EnclosingMethodAttribute extends Attribute {
	protected short class_index;
	protected short method_index;
	
	public EnclosingMethodAttribute(ClassReader classReader, DataInputStream s, int l) throws Exception {
		super(classReader, s, l);
	}

	@Override
	public void read(DataInputStream s) throws Exception {
		class_index = s.readShort();
		method_index = s.readShort();
	}
	
	public short getClassIndex() { return class_index; }
	public short getMethodIndex() { return method_index; }

}
