package pusty.f0cr.data;

import java.io.DataInputStream;

import pusty.f0cr.ClassReader;

public class LineInfo {
	
//  u2 start_pc;
//  u2 line_number;	
	
	protected short start_pc; //line in code attribute
    protected short line_number; //line in source code
    protected ClassReader classReader;
	public LineInfo(ClassReader classReader, DataInputStream s) throws Exception {
		this.classReader = classReader;
		read(s);
	}
	public void read(DataInputStream s) throws Exception {
		start_pc = s.readShort();
		line_number = s.readShort();
	}
	
	public short getStart() { return start_pc; }
	public short getLineNumber() { return line_number; }

}
