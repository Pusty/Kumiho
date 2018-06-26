package pusty.f0cr;

import java.io.DataInputStream;

import pusty.f0cr.data.RuntimeAnnotations;

public class RuntimeAnnotationsTable {
	protected int tableSize;
	protected RuntimeAnnotations[] indexes;
	protected ClassReader classReader;
	public RuntimeAnnotationsTable(ClassReader classReader, DataInputStream s) throws Exception {
		this.classReader = classReader;
		read(s);
	}
	public void read(DataInputStream s) throws Exception {
		tableSize = s.readShort();
		indexes = new RuntimeAnnotations[tableSize];
		for(int i=0;i<tableSize;i++) {
			indexes[i] = new RuntimeAnnotations(classReader, s);
		}
	}
	public int getSize() { return tableSize; }
	public RuntimeAnnotations[] getIndexes() { return indexes; }
}
