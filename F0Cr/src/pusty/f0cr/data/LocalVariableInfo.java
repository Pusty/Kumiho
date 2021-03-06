package pusty.f0cr.data;

import java.io.DataInputStream;

import pusty.f0cr.ClassReader;

public class LocalVariableInfo {
	
//	  u2 start_pc;
//    u2 length;
//    u2 name_index;
//    u2 descriptor_index;
//    u2 index;
	
	protected short start_pc; //from start (inclusive)
    protected short length; //to start_pc+length (exclusive)
    protected short name_index; //name of local variable;
    protected short descriptor_index; //description of local variable;
    protected short index; //index within local variable array (double and long take 2 slots)
    
    protected ClassReader classReader;
	public LocalVariableInfo(ClassReader classReader, DataInputStream s) throws Exception {
		this.classReader = classReader;
		read(s);
	}
	public void read(DataInputStream s) throws Exception {
		start_pc = s.readShort();
		length = s.readShort();
		name_index = s.readShort();
		descriptor_index = s.readShort();
		index = s.readShort();
	}
	
	public short getStart() { return start_pc; }
	public short getLength() { return length; }
	public short getNameIndex() { return name_index; }
	public short getDescriptorIndex() { return descriptor_index; }
	public short getIndex() { return index; }
	
	public String getName() {
		return classReader.getPool().get(getNameIndex()).toString();
	}
	public String getDesc() {
		return classReader.getPool().get(getDescriptorIndex()).toString();
	}
}
