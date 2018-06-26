package pusty.f0cr;

import java.io.DataInputStream;

import pusty.f0cr.data.ExceptionInfo;

public class ExceptionTable {
	protected int tableSize;
	protected ExceptionInfo[] indexes;
	protected ClassReader classReader;
	public ExceptionTable(ClassReader classReader, DataInputStream s) throws Exception {
		this.classReader = classReader;
		read(s);
	}
	public void read(DataInputStream s) throws Exception {
		tableSize = s.readShort();
		indexes = new ExceptionInfo[tableSize];
		for(int i=0;i<tableSize;i++) {
			indexes[i] = new ExceptionInfo(classReader, s);
		}
	}
	public int getSize() { return tableSize; }
	public ExceptionInfo[] getIndexes() { return indexes; }
}
