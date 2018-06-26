package pusty.f0cr.data;

import java.io.DataInputStream;

import pusty.f0cr.ClassReader;

public class ClassInfo {

	protected short inner_class_info_index; //Index of inner class structure
	protected short outer_class_info_index; //Index of a class structure of a class this class is a member of
	protected short inner_name_index; //Index of the name of this class if not anonymous
	protected short inner_class_access_flags; //default accesFlag rules
	 
    protected ClassReader classReader;
	public ClassInfo(ClassReader classReader, DataInputStream s) throws Exception {
		this.classReader = classReader;
		read(s);
	}
	public void read(DataInputStream s) throws Exception {
		inner_class_info_index = s.readShort();
		outer_class_info_index = s.readShort();
		inner_name_index = s.readShort();
		inner_class_access_flags = s.readShort();
	}
	
	public short getInnerClassInfoIndex() { return inner_class_info_index; }
	public short getOuterClassInfoIndex() { return outer_class_info_index; }
	public short getInnerNameIndex() { return inner_name_index; }
	public short getInnerClassAccessFlags() { return inner_class_access_flags; }
}
