package pusty.f0cr.frames;

import java.io.DataInputStream;
import pusty.f0cr.ClassReader;
import pusty.f0cr.data.VerificationTypeInfo;

public class FrameSameLocalsExtended extends Frame{
	
	protected short offset_delta;
	protected VerificationTypeInfo[] stack;
	
	public FrameSameLocalsExtended(ClassReader classReader, DataInputStream s, int frame_type) throws Exception {
		super(classReader, s, frame_type);
	}
	public void read(DataInputStream s) throws Exception {
		offset_delta = s.readShort();
		stack = new VerificationTypeInfo[1];
		stack[0] = new VerificationTypeInfo(classReader, s);
	}
	public short getOffsetDelta() { return offset_delta; }
	public VerificationTypeInfo[] getStack() { return stack; }
}
