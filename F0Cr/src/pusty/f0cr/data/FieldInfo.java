package pusty.f0cr.data;

import java.io.DataInputStream;

import pusty.f0cr.AttributeTable;
import pusty.f0cr.ClassReader;

public class FieldInfo {

	protected int access_flags;
    protected int name_index;
    protected int descriptor_index;
    protected AttributeTable attribute_table;
	protected ClassReader classReader;
	
	public FieldInfo(ClassReader classReader, DataInputStream s) throws Exception {
		this.classReader = classReader;
		read(s);
	}
	public void read(DataInputStream s) throws Exception {
		access_flags = s.readShort();
		name_index = s.readShort();
		descriptor_index = s.readShort();
		attribute_table = new AttributeTable(classReader, s);
	}
	public int getAttributeCount() { return attribute_table.getSize(); }
	public int getDescriptorIndex() { return descriptor_index; }
	public int getNameIndex() { return name_index; }
	public int getAccessFlags() { return access_flags; }
	public AttributeTable getInfo() { return attribute_table; }

}
