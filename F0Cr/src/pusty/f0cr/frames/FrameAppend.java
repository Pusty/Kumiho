package pusty.f0cr.frames;

import java.io.DataInputStream;
import pusty.f0cr.ClassReader;
import pusty.f0cr.data.VerificationTypeInfo;

public class FrameAppend extends Frame{
	
	protected short offset_delta;
	protected VerificationTypeInfo[] stack;
	
	public FrameAppend(ClassReader classReader, DataInputStream s, int frame_type) throws Exception {
		super(classReader, s, frame_type);
	}
	public void read(DataInputStream s) throws Exception {
		offset_delta = s.readShort();
		stack = new VerificationTypeInfo[frame_type-251];
		for(int i=0;i<(frame_type-251);i++)
			stack[i] = new VerificationTypeInfo(classReader, s);
	}
	public short getOffsetDelta()  { return offset_delta; }
	public VerificationTypeInfo[] getStack() { return stack; }
}
