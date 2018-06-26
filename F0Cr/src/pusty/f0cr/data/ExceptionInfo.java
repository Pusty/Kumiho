package pusty.f0cr.data;

import java.io.DataInputStream;

import pusty.f0cr.ClassReader;

public class ExceptionInfo {
	
	protected short start_pc; //inclusive from index in instructions
    protected short end_pc; //exclusive till index in instructions
    protected short handle_pc; //start exception handler in instructions
    protected short catch_type; //entry in constant pool containing type
    protected ClassReader classReader;
	public ExceptionInfo(ClassReader classReader, DataInputStream s) throws Exception {
		this.classReader = classReader;
		read(s);
	}
	public void read(DataInputStream s) throws Exception {
		start_pc = s.readShort();
		end_pc = s.readShort();
		handle_pc = s.readShort();
		catch_type = s.readShort();
	}
	
	public short getStart() { return start_pc; }
	public short getEnd() { return end_pc; }
	public short getHandle() { return handle_pc; }
	public short getCatchType() { return catch_type; }

}
