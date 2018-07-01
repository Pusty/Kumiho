package pusty.f0cr.inst.types;

import pusty.f0cr.inst.InstructionReader;
import pusty.f0cr.inst.Opcodes;

public class InstVar extends Instruction {
	protected boolean input = false;
	protected boolean static_ = false;
	protected int poolIndex = 0;
	/*
	 * Loads or Saves Variable either from Global or Object Space
	 */
	public InstVar(InstructionReader reader, byte inst, byte[] data) {
		super(reader, inst, data);
		if(!isInst(inst)) {System.err.println("Error: Created Var with OpCode: "+inst+" => " +Opcodes.getName(inst));}
		if((inst&0xFF) == Opcodes.PUTFIELD) {
			input = false;
			static_ = false;
		}else if((inst&0xFF) == Opcodes.GETFIELD) {
			input = true;
			static_ = false;
		}else if((inst&0xFF) == Opcodes.PUTSTATIC) {
			input = false;
			static_ = true;
		}else if((inst&0xFF) == Opcodes.GETSTATIC) {
			input = true;
			static_ = true;
		}
		poolIndex = (((data[0]&0xFF) << 8) + (data[1]&0xFF));
	}
	public boolean isLoad() {
		return input;
	}
	public boolean isStore() {
		return !input;
	}
	public boolean isStatic() {
		return static_;
	}
	public int getIndex() {
		return poolIndex;
	}
	public static boolean isInst(byte inst) {
		switch(inst&0xFF) {
			case Opcodes.PUTFIELD:
			case Opcodes.GETFIELD:
			case Opcodes.PUTSTATIC:
			case Opcodes.GETSTATIC:
				return true;				
			default: return false;
		}
	}
}
