package pusty.f0cr.attribute;

import java.io.DataInputStream;

import pusty.f0cr.ClassReader;
import pusty.f0cr.data.LocalVariableInfo;

public class LocalVariableTableAttribute extends Attribute {
	
	protected short line_number_table_length;
	protected LocalVariableInfo[] localVariableTable;
	public LocalVariableTableAttribute(ClassReader classReader, DataInputStream s, int l) throws Exception {
		super(classReader, s, l);
	}

	@Override
	public void read(DataInputStream s) throws Exception {
		line_number_table_length = s.readShort();
		localVariableTable = new LocalVariableInfo[line_number_table_length];
		for(int i=0;i<line_number_table_length;i++)
			localVariableTable[i] = new LocalVariableInfo(classReader, s);
	}
	
	public short getSize() { return line_number_table_length; }
	public LocalVariableInfo[] getTable() { return localVariableTable; }
	
	@Override
	public void printOut(String pre) {
		for(int li=0;li<getSize();li++) {
			LocalVariableInfo l = getTable()[li];
			System.out.println(pre+"("+l.getIndex()+") "+l.getStart()+"-"+(l.getStart()+l.getLength())+": "+l.getName()+"["+l.getDesc()+"]");
		}
	}
	

}
