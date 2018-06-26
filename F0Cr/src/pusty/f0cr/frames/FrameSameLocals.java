package pusty.f0cr.frames;

import java.io.DataInputStream;
import pusty.f0cr.ClassReader;
import pusty.f0cr.data.VerificationTypeInfo;

public class FrameSameLocals extends Frame{
	
	protected VerificationTypeInfo[] stack;
	
	public FrameSameLocals(ClassReader classReader, DataInputStream s, int frame_type) throws Exception {
		super(classReader, s, frame_type);
	}
	public void read(DataInputStream s) throws Exception {
		stack = new VerificationTypeInfo[1];
		stack[0] = new VerificationTypeInfo(classReader, s);
	}
	public VerificationTypeInfo[] getStack() { return stack; }
}
