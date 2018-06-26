package pusty.f0cr.attribute;

import java.io.DataInputStream;

import pusty.f0cr.ClassReader;

public class ConstantValueAttribute extends Attribute {
	protected short constantValue;
	
	public ConstantValueAttribute(ClassReader classReader, DataInputStream s, int l) throws Exception {
		super(classReader, s, l);
	}

	@Override
	public void read(DataInputStream s) throws Exception {
		constantValue = s.readShort();
	}
	
	public short getConstantValue() { return constantValue; }

}
