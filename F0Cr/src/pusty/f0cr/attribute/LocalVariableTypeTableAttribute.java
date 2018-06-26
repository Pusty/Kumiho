package pusty.f0cr.attribute;

import java.io.DataInputStream;

import pusty.f0cr.ClassReader;
import pusty.f0cr.data.LocalVariableTypeInfo;

public class LocalVariableTypeTableAttribute extends Attribute {
	
	protected short line_number_table_length;
	protected LocalVariableTypeInfo[] localVariableTypeTable;
	public LocalVariableTypeTableAttribute(ClassReader classReader, DataInputStream s, int l) throws Exception {
		super(classReader, s, l);
	}

	@Override
	public void read(DataInputStream s) throws Exception {
		line_number_table_length = s.readShort();
		localVariableTypeTable = new LocalVariableTypeInfo[line_number_table_length];
		for(int i=0;i<line_number_table_length;i++)
			localVariableTypeTable[i] = new LocalVariableTypeInfo(classReader, s);
	}
	
	public short getSize() { return line_number_table_length; }
	public LocalVariableTypeInfo[] getTable() { return localVariableTypeTable; }
}
