package pusty.f0cr.inst.types;

import pusty.f0cr.inst.InstructionReader;
import pusty.f0cr.inst.Opcodes;

public class InstConvert extends Instruction {
	protected Class<?> typeA;
	protected Class<?> typeB;
	/*
	 * Converts Stack Values from TypA into TypB
	 */
	public InstConvert(InstructionReader reader, byte inst, byte[] data) {
		super(reader, inst, data);
		if(!isInst(inst)) {System.err.println("Error: Created Convert with OpCode: "+inst+" => " +Opcodes.getName(inst));}
		setTypes();
	}
	public Class<?> getTypeFrom() {
		return typeA;
	}
	public Class<?> getTypeTo() {
		return typeB;
	}
	public static boolean isInst(byte inst) {
		switch(inst&0xFF) {
			case Opcodes.I2L:
			case Opcodes.I2F:
			case Opcodes.I2D:
			case Opcodes.I2B:
			case Opcodes.I2C:
			case Opcodes.I2S:
			case Opcodes.L2I:
			case Opcodes.L2F:
			case Opcodes.L2D:
			case Opcodes.F2L:
			case Opcodes.F2I:
			case Opcodes.F2D:
			case Opcodes.D2L:
			case Opcodes.D2F:
			case Opcodes.D2I:
				return true;				
			default: return false;
		}
	}
	public void setTypes() {
		switch(inst&0xFF) {
			case Opcodes.I2L:
				typeA = int.class;
				typeB = long.class;
				break;
			case Opcodes.I2F:
				typeA = int.class;
				typeB = float.class;
				break;
			case Opcodes.I2D:
				typeA = int.class;
				typeB = double.class;
				break;
			case Opcodes.I2B:
				typeA = int.class;
				typeB = byte.class;
				break;
			case Opcodes.I2C:
				typeA = int.class;
				typeB = char.class;
				break;
			case Opcodes.I2S:
				typeA = int.class;
				typeB = short.class;
				break;
			case Opcodes.L2I:
				typeA = long.class;
				typeB = int.class;
				break;
			case Opcodes.L2F:
				typeA = long.class;
				typeB = float.class;
				break;
			case Opcodes.L2D:
				typeA = long.class;
				typeB = double.class;
				break;
			case Opcodes.F2L:
				typeA = float.class;
				typeB = long.class;
				break;
			case Opcodes.F2I:
				typeA = float.class;
				typeB = int.class;
				break;
			case Opcodes.F2D:
				typeA = float.class;
				typeB = double.class;
				break;
			case Opcodes.D2L:
				typeA = double.class;
				typeB = long.class;
				break;
			case Opcodes.D2F:
				typeA = double.class;
				typeB = float.class;
				break;
			case Opcodes.D2I:
				typeA = double.class;
				typeB = int.class;
				break;				
		}
	}
}
