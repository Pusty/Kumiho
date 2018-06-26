package pusty.f0cr.data;

import java.io.DataInputStream;

import pusty.f0cr.ClassReader;

public class ElementValue {


    protected char tag;
    
    //Const: if tag = B, C, D, F, I, J, S, Z, or s
    protected short const_value_index;
    //Enum: if tag = e
    protected short type_name_index;
    protected short const_name_index;
    //Class: if tag = c
    protected short class_info_index;
    //Annotation: if tag = @
    protected RuntimeAnnotations annotation_value;
    //Array: if tag = [
    protected short num_values;
    protected ElementValue[] values;
    
    
    protected ClassReader classReader;
	public ElementValue(ClassReader classReader, DataInputStream s) throws Exception {
		this.classReader = classReader;
		read(s);
	}
	public void read(DataInputStream s) throws Exception {
		tag = (char) s.readByte();
		if(tag == 'B' || tag == 'C' || tag == 'D' || tag == 'F' || tag == 'I' || tag == 'J' || tag == 'S' || tag == 'Z' || tag == 's') {
			const_value_index = s.readShort();
		}
		if(tag =='e') {
			type_name_index = s.readShort();
			const_name_index = s.readShort();
		}
		if(tag == 'c') {
			class_info_index = s.readShort();
		}
		if(tag == '@') {
			annotation_value = new RuntimeAnnotations(classReader, s);
		}
		if(tag == '[') {
			num_values = s.readShort();
			values = new ElementValue[num_values];
			for(int i=0;i<num_values;i++)
				values[i] = new ElementValue(classReader, s);
		}
	}
	public char getTag() { return tag; }
	public short getConstValueIndex() { return const_value_index; } //Const
	public short getTypeNameIndex() { return type_name_index; } //Enum
	public short getConstNameIndex() { return const_name_index; } //Enum
	public short getClassInfoIndex() { return class_info_index; } //Class
	public RuntimeAnnotations getAnnotationValue() { return annotation_value; } //Annotation
	public short getNumValues() { return num_values; } //Array
	public ElementValue[] getValues() { return values; } //Array
}
