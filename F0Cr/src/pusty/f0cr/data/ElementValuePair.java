package pusty.f0cr.data;

import java.io.DataInputStream;

import pusty.f0cr.ClassReader;

public class ElementValuePair {


    protected short element_name_index;
    protected ElementValue value;
    
    protected ClassReader classReader;
	public ElementValuePair(ClassReader classReader, DataInputStream s) throws Exception {
		this.classReader = classReader;
		read(s);
	}
	public void read(DataInputStream s) throws Exception {
		element_name_index = s.readShort();
		value = new ElementValue(classReader, s);

	}
	public short getElementNameIndex() { return element_name_index; }
	public ElementValue getValue() { return value; }
}
