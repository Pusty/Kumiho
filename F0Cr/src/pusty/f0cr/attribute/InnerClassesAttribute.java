package pusty.f0cr.attribute;

import java.io.DataInputStream;

import pusty.f0cr.ClassReader;
import pusty.f0cr.data.ClassInfo;

public class InnerClassesAttribute extends Attribute {
	
    short numberOfClasses;
    ClassInfo[] classes;
    
	
	public InnerClassesAttribute(ClassReader classReader, DataInputStream s, int l) throws Exception {
		super(classReader, s, l);
	}

	@Override
	public void read(DataInputStream s) throws Exception {
		numberOfClasses = s.readShort();
		classes = new ClassInfo[numberOfClasses];
		for(int i=0;i<numberOfClasses;i++)
			classes[i] = new ClassInfo(classReader, s);
	}
	
	public short getNumberOfClasses() { return numberOfClasses; }
	public ClassInfo[] getClasses() { return classes; }
}
