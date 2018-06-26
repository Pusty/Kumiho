package pusty.f0cr.data;

import java.io.DataInputStream;

import pusty.f0cr.ClassReader;

public class RuntimeAnnotations {

    protected short type_index;
    protected short num_element_value_pairs;
    protected ElementValuePair[] element_value_pairs;
    
    protected ClassReader classReader;
	public RuntimeAnnotations(ClassReader classReader, DataInputStream s) throws Exception {
		this.classReader = classReader;
		read(s);
	}
	public void read(DataInputStream s) throws Exception {
		type_index = s.readShort();
		num_element_value_pairs = s.readShort();
		element_value_pairs = new ElementValuePair[num_element_value_pairs];
		for(int i=0;i<num_element_value_pairs;i++)
			element_value_pairs[i] = new ElementValuePair(classReader, s);
	}
	public short getTypeIndex() { return type_index; }
	public short getNumElementValuePairs() { return num_element_value_pairs; }
	public ElementValuePair[] getElementValuePairs() { return element_value_pairs; }
}
