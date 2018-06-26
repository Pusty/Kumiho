package pusty.f0cr.inst.types;

import pusty.f0cr.ConstantPool;
import pusty.f0cr.inst.Opcodes;

public class InstStack extends Instruction {
	/*
	 * Direct Stack Operations
	 */
	public InstStack(ConstantPool pool, byte inst, byte[] data) {
		super(pool, inst, data);
		if(!isInst(inst)) {System.err.println("Error: Created Stack with OpCode: "+inst+" => " +Opcodes.getName(inst));}
	}
	public static boolean isInst(byte inst) {
		switch(inst&0xFF) {
			case Opcodes.POP:
			case Opcodes.POP2:
			case Opcodes.DUP:
			case Opcodes.DUP_X1:
			case Opcodes.DUP_X2:
			case Opcodes.DUP2:
			case Opcodes.DUP2_X1:
			case Opcodes.DUP2_X2:
			case Opcodes.SWAP:
			case Opcodes.ATHROW:
				return true;
				
			default: return false;
		}
	}
}
