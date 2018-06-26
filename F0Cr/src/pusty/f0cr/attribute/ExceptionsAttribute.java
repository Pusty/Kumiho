package pusty.f0cr.attribute;

import java.io.DataInputStream;

import pusty.f0cr.ClassReader;

public class ExceptionsAttribute extends Attribute {
	protected short numberOfExceptions;
	protected short[] exceptionIndexTable;
	
	public ExceptionsAttribute(ClassReader classReader, DataInputStream s, int l) throws Exception {
		super(classReader, s, l);
	}

	@Override
	public void read(DataInputStream s) throws Exception {
		numberOfExceptions = s.readShort();
		exceptionIndexTable = new short[numberOfExceptions];
		for(int i=0;i<numberOfExceptions;i++)
			exceptionIndexTable[i] = s.readShort();
	}
	
	public short getNumberOfExceptions() { return numberOfExceptions; }
	public short[] getExceptionIndexTable() { return exceptionIndexTable; }
}
