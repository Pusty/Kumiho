package pusty.f0cr.data;

import java.io.DataInputStream;

import pusty.f0cr.ClassReader;

public class RuntimeParameterAnnotations {

    protected short num_annotations;
    protected RuntimeAnnotations[] annotations;
    
    protected ClassReader classReader;
	public RuntimeParameterAnnotations(ClassReader classReader, DataInputStream s) throws Exception {
		this.classReader = classReader;
		read(s);
	}
	public void read(DataInputStream s) throws Exception {
		num_annotations = s.readShort();
		annotations = new RuntimeAnnotations[num_annotations];
		for(int i=0;i<num_annotations;i++)
			annotations[i] = new RuntimeAnnotations(classReader, s);
	}
	public short getNumAnnotations() { return num_annotations; }
	public RuntimeAnnotations[] getAnnotations() { return annotations; }
}
