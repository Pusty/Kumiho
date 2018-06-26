package pusty.f0cr.attribute;

import java.io.DataInputStream;

import pusty.f0cr.ClassReader;

public class SignatureAttribute extends Attribute {
	protected byte[] data;
	protected String debug_extension;
	
	public SignatureAttribute(ClassReader classReader, DataInputStream s, int l) throws Exception {
		super(classReader, s, l);
	}

	@Override
	public void read(DataInputStream s) throws Exception {
		data = new byte[length];
		for(int i=0;i<length;i++)
			data[i] = s.readByte();
		debug_extension = new String(data); //To ensure the whole data is read, may fail to create the String tho'
	}
	
	public String getDebugExtension() { return debug_extension; }

}
