package pusty.f0cr.inst.types;

import java.lang.reflect.Array;

import pusty.f0cr.ConstantPool;
import pusty.f0cr.inst.Opcodes;

public class InstAVar extends Instruction {
	protected Class<?> cla;
	protected boolean ref=false;
	protected boolean load=false;
	
	/*
	 * Load or Store value from/to array
	 */
	public InstAVar(ConstantPool pool, byte inst, byte[] data) {
		super(pool, inst, data);
		if(!isInst(inst)) {System.err.println("Error: Created LoadFrom instruction with OpCode: "+inst+" => " +Opcodes.getName(inst));}
		cla = setType();
		if(cla == Array.class)
			ref=true;
		load = setBool();
	}
	public boolean isLoad() {
		return load;
	}
	public boolean isStore() {
		return !load;
	}
	//Size of bytes read from stack
	public int getLoadSize() {
		if(cla == int.class || cla == float.class || cla == Array.class || cla == short.class || cla == byte.class || cla == boolean.class  || cla == char.class) return 4; //oneWord
		if(cla == double.class || cla == long.class) return 8; //twoWord
		return 0;
	}
	public boolean loadsReference() {
		return ref;
	}
	public Class<?> getType() {
		return cla;
	}
	public static boolean isInst(byte inst) {
		switch(inst&0xFF) {
			case Opcodes.IALOAD:
			case Opcodes.LALOAD:
			case Opcodes.FALOAD:
			case Opcodes.DALOAD:
			case Opcodes.AALOAD:
			case Opcodes.BALOAD:
			case Opcodes.CALOAD:
			case Opcodes.SALOAD:
				return true;
			case Opcodes.IASTORE:
			case Opcodes.LASTORE:
			case Opcodes.FASTORE:
			case Opcodes.DASTORE:
			case Opcodes.AASTORE:
			case Opcodes.BASTORE:
			case Opcodes.CASTORE:
			case Opcodes.SASTORE:
				return true;
			default: return false;
		}
	}
	public boolean setBool() {
		switch(inst&0xFF) {
			case Opcodes.IALOAD:
			case Opcodes.LALOAD:
			case Opcodes.FALOAD:
			case Opcodes.DALOAD:
			case Opcodes.AALOAD:
			case Opcodes.BALOAD:
			case Opcodes.CALOAD:
			case Opcodes.SALOAD:
				return true;
			case Opcodes.IASTORE:
			case Opcodes.LASTORE:
			case Opcodes.FASTORE:
			case Opcodes.DASTORE:
			case Opcodes.AASTORE:
			case Opcodes.BASTORE:
			case Opcodes.CASTORE:
			case Opcodes.SASTORE:
				return false;
			default: return false;
		}
	}
	public Class<?> setType() {
		switch(inst&0xFF) {
		case Opcodes.IALOAD: return int.class;
		case Opcodes.LALOAD: return long.class;
		case Opcodes.FALOAD: return float.class;
		case Opcodes.DALOAD: return double.class;
		case Opcodes.AALOAD: return Array.class;
		case Opcodes.BALOAD: return byte.class;
		case Opcodes.CALOAD: return char.class;
		case Opcodes.SALOAD: return short.class;
		case Opcodes.IASTORE: return int.class;
		case Opcodes.LASTORE: return long.class;
		case Opcodes.FASTORE: return float.class;
		case Opcodes.DASTORE: return double.class;
		case Opcodes.AASTORE: return Array.class;
		case Opcodes.BASTORE: return byte.class;
		case Opcodes.CASTORE: return char.class;
		case Opcodes.SASTORE: return short.class;
		default: return null;
	}
	}
}
