package pusty.f0cr;

import java.io.DataInputStream;

import pusty.f0cr.data.MethodInfo;

public class MethodTable {
	protected int tableSize;
	protected MethodInfo[] indexes;
	protected ClassReader classReader;
	public MethodTable(ClassReader classReader, DataInputStream s) throws Exception {
		this.classReader = classReader;
		read(s);
	}
	public void read(DataInputStream s) throws Exception {
		tableSize = s.readShort();
		indexes = new MethodInfo[tableSize];
		for(int i=0;i<tableSize;i++) {
			indexes[i] = new MethodInfo(classReader, s);
		}
	}
	public int getSize() { return tableSize; }
	public MethodInfo[] getIndexes() { return indexes; }
	public MethodInfo getMethod(ConstantPool pool, String name) {
		for(int i=0;i<tableSize;i++) {
			if(pool.get(indexes[i].getNameIndex()).toString().equals(name))
				return indexes[i];
		}
		return null;
	}

	public void printOut() {
		for(int i=0;i<getSize();i++) {
			MethodInfo info = getIndexes()[i];
			System.out.println("Method: "+info.getName());
			info.getInfo().printOut("   ");
		}
	}
}
