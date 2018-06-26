package pusty.f0cr.attribute;

import java.io.DataInputStream;

import pusty.f0cr.ClassReader;

public class SourceFileAttribute extends Attribute {
	protected short sourceFileIndex;
	
	public SourceFileAttribute(ClassReader classReader, DataInputStream s, int l) throws Exception {
		super(classReader, s, l);
	}

	@Override
	public void read(DataInputStream s) throws Exception {
		sourceFileIndex = s.readShort();
	}
	
	public short getSourceFileIndex() { return sourceFileIndex; }
	public String toString() { return classReader.getPool().get(sourceFileIndex).toString(); }

}
