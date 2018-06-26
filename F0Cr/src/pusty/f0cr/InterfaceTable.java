package pusty.f0cr;

import java.io.DataInputStream;

public class InterfaceTable {
	protected int tableSize;
	protected int[] indexes;
	protected ClassReader classReader;
	public InterfaceTable(ClassReader classReader, DataInputStream s) throws Exception {
		this.classReader = classReader;
		read(s);
	}
	public void read(DataInputStream s) throws Exception {
		tableSize = s.readShort();
		indexes = new int[tableSize];
		for(int i=0;i<tableSize;i++)
			indexes[i] = s.readShort();
	}
	public int getSize() { return tableSize; }
	public int[] getIndexes() { return indexes; }
}
