package pusty.f0cr;

import java.io.DataInputStream;

import pusty.f0cr.data.AttributeInfo;

public class AttributeTable {
	private int tableSize;
	private AttributeInfo[] indexes;
	private ClassReader classReader;
	public AttributeTable(ClassReader classReader, DataInputStream s) throws Exception {
		this.classReader = classReader;
		read(s);
	}
	public void read(DataInputStream s) throws Exception {
		tableSize = s.readShort();
		indexes = new AttributeInfo[tableSize];
		for(int i=0;i<tableSize;i++) {
			indexes[i] = new AttributeInfo(classReader, s);
		}
	}
	public int getSize() { return tableSize; }
	public AttributeInfo[] getIndexes() { return indexes; }
	public void printOut() {
		printOut("");
	}
	public void printOut(String pre) {
		if(pre == null) pre = "";
		for(int i=0;i<tableSize;i++) {
			AttributeInfo ai = indexes[i];
			System.out.println(pre+"Attribute: "+classReader.getPool().get(ai.getAttributeNameIndex()));
			ai.getInfo().printOut(pre+"   ");
		}
	}
}
