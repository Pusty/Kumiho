package pusty.f0cr.frames;

import java.io.DataInputStream;
import pusty.f0cr.ClassReader;

public class Frame {
	
	protected ClassReader classReader;
	protected int frame_type;
    
	public Frame(ClassReader classReader, DataInputStream s, int frame_type) throws Exception {
		this.classReader = classReader;
		this.frame_type = frame_type;
		read(s);
	}
	public void read(DataInputStream s) throws Exception {
		
	}
}
