package pusty.f0cr.frames;

import java.io.DataInputStream;
import pusty.f0cr.ClassReader;

public class StackMapFrame {
	
	protected byte frame_type;
	/* 0-63 = SAME */
	/* 64-127 = SAME_LOCALS_1_STACK_ITEM */
	/* 247 = SAME_LOCALS_1_STACK_ITEM_EXTENDED */
	/* 248-250 = CHOP */
	/* 251 = SAME_FRAME_EXTENDED */
	/* 252-254 = APPEND */
	/* 255 = FULL_FRAME */
	protected Frame frame;
	
	protected ClassReader classReader;
    
	public StackMapFrame(ClassReader classReader, DataInputStream s) throws Exception {
		this.classReader = classReader;
		read(s);
	}
	public void read(DataInputStream s) throws Exception {
		frame_type = s.readByte();
		int value = frame_type&0xFF;
		if(value >= 0 && value <= 63)
			frame = new FrameSame(classReader, s, value);
		else if(value >= 64 && value <= 127)
			frame = new FrameSameLocals(classReader, s, value);
		else if(value == 247)
			frame = new FrameSameLocalsExtended(classReader, s, value);
		else if(value >= 248 && value <= 250)
			frame = new FrameChop(classReader, s, value);
		else if(value == 251)
			frame = new FrameSameExtended(classReader, s, value);
		else if(value >= 252 && value <= 254)
			frame = new FrameAppend(classReader, s, value);
		else if(value == 255)
			frame = new FrameFull(classReader, s, value);
	}
	public byte getFrameType() { return frame_type; }
	public Frame getFrame() { return frame; }
}
