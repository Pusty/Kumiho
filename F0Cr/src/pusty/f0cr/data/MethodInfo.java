package pusty.f0cr.data;

import java.io.DataInputStream;

import pusty.f0cr.AttributeTable;
import pusty.f0cr.ClassReader;
import pusty.f0cr.attribute.CodeAttribute;

public class MethodInfo {

	protected int access_flags;
	protected int name_index;
	protected int descriptor_index;
	protected AttributeTable attribute_table;
    protected ClassReader classReader;
    
	public MethodInfo(ClassReader classReader, DataInputStream s) throws Exception {
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

	/**
	 * Returns the name of this method
	 * @return returns content of #name_index within the pool
	 */
	public String getName() {
		return classReader.getPool().get(name_index).toString();
	}
	/**
	 * Returns the CodeAttribute of this Method if it exists
	 * @return the code attribute if it exists
	 */
	public CodeAttribute getCode() {
		for(int a=0;a<getAttributeCount();a++)
			if(getInfo().getIndexes()[a].getInfo() instanceof CodeAttribute)
				return (CodeAttribute)getInfo().getIndexes()[a].getInfo();
		return null;
	}
	
}
