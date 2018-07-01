package pusty.f0cr;

import java.io.DataInputStream;
import pusty.f0cr.data.FieldInfo;
import pusty.f0cr.util.AccessFlags;
import pusty.f0cr.util.Descriptor;

public class FieldTable {
	protected int tableSize;
	protected FieldInfo[] indexes;
	protected ClassReader classReader;
	public FieldTable(ClassReader classReader, DataInputStream s) throws Exception {
		this.classReader = classReader;
		read(s);
	}
	public void read(DataInputStream s) throws Exception {
		tableSize = s.readShort();
		indexes = new FieldInfo[tableSize];
		for(int i=0;i<tableSize;i++) {
			indexes[i] = new FieldInfo(classReader, s);
		}
	}
	public int getSize() { return tableSize; }
	public FieldInfo[] getIndexes() { return indexes; }
	public FieldInfo getField(ConstantPool pool, String name) {
		for(int i=0;i<tableSize;i++) {
//			System.out.println(pool.get(indexes[i].getNameIndex()));
			if(pool.get(indexes[i].getNameIndex()).toString().equals(name))
				return indexes[i];
		}
		return null;
	}
	
	public void printOut(String pre) {
		for(FieldInfo field:indexes) {
			System.out.println(pre+"Variable: ["+AccessFlags.getFlags(field.getAccessFlags())+"] "+Descriptor.getType(field.getDescription())+" "+field.getName()+ "("+field.getDescription()+")");
		}
	}
	
}
