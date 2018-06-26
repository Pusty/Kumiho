package pusty.f0cr.frames;

import java.io.DataInputStream;
import pusty.f0cr.ClassReader;

public class FrameChop extends Frame{
	
	protected short offset_delta;

	public FrameChop(ClassReader classReader, DataInputStream s, int frame_type) throws Exception {
		super(classReader, s, frame_type);
	}
	public void read(DataInputStream s) throws Exception {
		offset_delta = s.readShort();
	}
	public short getOffsetDelta() { return offset_delta; }
}
