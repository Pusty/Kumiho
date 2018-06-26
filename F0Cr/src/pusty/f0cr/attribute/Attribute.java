package pusty.f0cr.attribute;

import java.io.DataInputStream;

import pusty.f0cr.ClassReader;

public class Attribute {

	protected int length;
	protected ClassReader classReader;
	public Attribute(ClassReader classReader, DataInputStream s, int l) throws Exception {
		this.classReader = classReader;
		length = l;
		read(s);
	}
	public void read(DataInputStream s) throws Exception {
		for(int i=0;i<length;i++)
			s.readByte();
	}
	public void printOut(String pre) {
	}
}
