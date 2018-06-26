package pusty.f0cr.attribute;

import java.io.DataInputStream;

import pusty.f0cr.RuntimeAnnotationsTable;
import pusty.f0cr.ClassReader;

public class RuntimeInvisibleAnnotationsAttribute extends Attribute {

	protected RuntimeAnnotationsTable attributeTable;
	
	public RuntimeInvisibleAnnotationsAttribute(ClassReader classReader, DataInputStream s, int l) throws Exception {
		super(classReader, s, l);
	}

	@Override
	public void read(DataInputStream s) throws Exception {
		attributeTable = new RuntimeAnnotationsTable(classReader, s);
	}
	
	public RuntimeAnnotationsTable getAttributeTable() { return attributeTable; }

}
