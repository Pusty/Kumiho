package pusty.f0cr.frames;

import java.io.DataInputStream;
import pusty.f0cr.ClassReader;
import pusty.f0cr.data.VerificationTypeInfo;

public class FrameFull extends Frame{
	
	protected short offset_delta;
	protected short number_of_locals;
	protected VerificationTypeInfo[] locals;
	protected short number_of_stack_items;
	protected VerificationTypeInfo[] stack;
	
	public FrameFull(ClassReader classReader, DataInputStream s, int frame_type) throws Exception {
		super(classReader, s, frame_type);
	}
	public void read(DataInputStream s) throws Exception {
		offset_delta = s.readShort();
		number_of_locals = s.readShort();
		locals = new VerificationTypeInfo[number_of_locals];
		for(int i=0;i<number_of_locals;i++)
			locals[i] = new VerificationTypeInfo(classReader, s);
		number_of_stack_items = s.readShort();
		stack = new VerificationTypeInfo[number_of_stack_items];
		for(int i=0;i<number_of_stack_items;i++)
			stack[i] = new VerificationTypeInfo(classReader, s);
	}
	public short getOffsetDelta()  { return offset_delta; }
	public short getNumberOfLocals()  { return number_of_locals; }
	public VerificationTypeInfo[] getLocals() { return locals; }
	public short getNumberOfStackItems()  { return number_of_stack_items; }
	public VerificationTypeInfo[] getStack() { return stack; }
}
