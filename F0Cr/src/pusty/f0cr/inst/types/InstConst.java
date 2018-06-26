package pusty.f0cr.inst.types;

import pusty.f0cr.ConstantPool;
import pusty.f0cr.inst.Opcodes;

public class InstConst extends Instruction {
	protected Object value;
	/*
	 * Pushes the getValue() onto the stack
	 */
	public InstConst(ConstantPool pool, byte inst, byte[] data) {
		super(pool, inst, data);
		if(!isInst(inst)) {System.err.println("Error: Created Constant with OpCode: "+inst+" => " +Opcodes.getName(inst));}
		value = setValue();
	}
	public Object getValue() {
		return value;
	}
	public static boolean isInst(byte inst) {
		switch(inst&0xFF) {
			//Fixed by Opcode
			case Opcodes.ICONST_0:
			case Opcodes.ICONST_1:
			case Opcodes.ICONST_2:
			case Opcodes.ICONST_3:
			case Opcodes.ICONST_4:
			case Opcodes.ICONST_5:
			case Opcodes.ICONST_M1:
			case Opcodes.ACONST_NULL:
			case Opcodes.DCONST_0:
			case Opcodes.DCONST_1:
			case Opcodes.FCONST_0:
			case Opcodes.FCONST_1:
			case Opcodes.FCONST_2:
			case Opcodes.LCONST_0:
			case Opcodes.LCONST_1:
				return true;
			//Fixed by readable bytes
			case Opcodes.BIPUSH:
			case Opcodes.SIPUSH:
			case Opcodes.LDC:
			case Opcodes.LDC2_W:
			case Opcodes.LDC_W:
				return true;
				
			default: return false;
		}
	}
	public Object setValue() {
		if(inst == Opcodes.ICONST_0) return 0;
		else if(inst == Opcodes.ICONST_1) return 1;
		else if(inst == Opcodes.ICONST_2) return 2;
		else if(inst == Opcodes.ICONST_3) return 3;
		else if(inst == Opcodes.ICONST_4) return 4;
		else if(inst == Opcodes.ICONST_5) return 5;
		else if(inst == Opcodes.ICONST_M1) return -1;
		else if(inst == Opcodes.ACONST_NULL) return null;
		else if(inst == Opcodes.DCONST_0) return 0d;
		else if(inst == Opcodes.DCONST_1) return 1d;
		else if(inst == Opcodes.FCONST_0) return 0f;
		else if(inst == Opcodes.FCONST_1) return 1f;
		else if(inst == Opcodes.FCONST_2) return 2f;
		else if(inst == Opcodes.LCONST_0) return 0l;
		else if(inst == Opcodes.LCONST_1) return 1l;
		else if(inst == Opcodes.BIPUSH) return data[0]&0xFF;
		else if(inst == Opcodes.SIPUSH) return (((data[0]&0xFF) << 8) + data[1]&0xFF);
		else if(inst == Opcodes.LDC) return pool.get(data[0]&0xFF);
		else if(inst == Opcodes.LDC2_W || inst == Opcodes.LDC_W) return pool.get(((data[0]&0xFF) << 8)+data[1]&0xFF);
		return null;
	}
}
