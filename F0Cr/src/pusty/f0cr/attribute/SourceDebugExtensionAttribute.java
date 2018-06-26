package pusty.f0cr.attribute;

import java.io.DataInputStream;

import pusty.f0cr.ClassReader;

public class SourceDebugExtensionAttribute extends Attribute {
	protected short signatureValue;
	
	public SourceDebugExtensionAttribute(ClassReader classReader, DataInputStream s, int l) throws Exception {
		super(classReader, s, l);
	}

	@Override
	public void read(DataInputStream s) throws Exception {
		signatureValue = s.readShort();
	}
	
	public short getSignatureValue() { return signatureValue; }

}
