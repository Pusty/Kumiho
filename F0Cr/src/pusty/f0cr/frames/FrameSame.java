package pusty.f0cr.frames;

import java.io.DataInputStream;
import pusty.f0cr.ClassReader;

public class FrameSame extends Frame{
	
	public FrameSame(ClassReader classReader, DataInputStream s, int frame_type) throws Exception {
		super(classReader, s, frame_type);
	}
	public void read(DataInputStream s) throws Exception {
		//Empty
	}
}
