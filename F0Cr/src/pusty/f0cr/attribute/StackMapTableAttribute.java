package pusty.f0cr.attribute;

import java.io.DataInputStream;

import pusty.f0cr.ClassReader;
import pusty.f0cr.frames.StackMapFrame;

public class StackMapTableAttribute extends Attribute {
	
	protected short number_of_entries;
	protected StackMapFrame[] entries;
	
	public StackMapTableAttribute(ClassReader classReader, DataInputStream s, int l) throws Exception {
		super(classReader, s, l);
	}

	@Override
	public void read(DataInputStream s) throws Exception {
		number_of_entries = s.readShort();
		entries = new StackMapFrame[number_of_entries];
		for(int i=0;i<number_of_entries;i++)
			entries[i] = new StackMapFrame(classReader, s);
	}
	
	public short getNumberOfEntries() { return number_of_entries; }
	public StackMapFrame[] getEntries() { return entries; }
}
