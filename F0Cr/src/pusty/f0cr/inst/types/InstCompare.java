package pusty.f0cr.inst.types;

import pusty.f0cr.inst.InstructionReader;
import pusty.f0cr.inst.Opcodes;
import pusty.f0cr.types.ClassReference;

public class InstCompare extends Instruction {
	protected Class<?> type;
	protected ClassReference classInfo;
	/*
	 * Loads 2 Values from Stack and Compares them (Long, Double, Float)
	 * or checks if stackRef = classRef in Pool at getInstanceofInfo()
	 */
	public InstCompare(InstructionReader reader, byte inst, byte[] data) {
		super(reader, inst, data);
		if(!isInst(inst)) {System.err.println("Error: Created Compare with OpCode: "+inst+" => " +Opcodes.getName(inst));}
		type = setType();
		if(type == Object.class)
			classInfo = (ClassReference) pool.get(((data[0]&0xFF) << 8)+(data[1]&0xFF));
	}
	public Class<?> getType() {
		return type;
	}
	public ClassReference getInstanceofInfo() {
		return classInfo;
	}
	public static boolean isInst(byte inst) {
		switch(inst&0xFF) {
			case Opcodes.DCMPG:
			case Opcodes.DCMPL:
			case Opcodes.FCMPG:
			case Opcodes.FCMPL:
			case Opcodes.LCMP:
	        case Opcodes.INSTANCEOF:
				return true;				
			default: return false;
		}
	}
	public Class<?> setType() {
		switch(inst&0xFF) {
		case Opcodes.DCMPG:
		case Opcodes.DCMPL:
			return double.class;
		case Opcodes.FCMPG:
		case Opcodes.FCMPL:
			return float.class;
		case Opcodes.LCMP:
			return long.class;
		case Opcodes.INSTANCEOF:
			return Object.class;
		default: return null;
	}
	}
}
