package pusty.f0cr.inst.types;

import java.lang.reflect.Array;

import pusty.f0cr.ConstantPool;
import pusty.f0cr.inst.Opcodes;

public class InstLocalVar extends Instruction {
	protected Class<?> cla;
	protected int var;
	protected boolean load=false;
	protected boolean ref=false;
	
	/*
	 *  Loads Value from Stack or Loads Value into Stack (from or into a local variable)
	 */
	public InstLocalVar(ConstantPool pool, byte inst, byte[] data) {
		super(pool, inst, data);
		if(!isInst(inst)) {System.err.println("Error: Created LocalVar instruction with OpCode: "+inst+" => " +Opcodes.getName(inst));}
		cla = setType();
		if(cla == Array.class)
			ref=true;
		var = setVariable();
		load = setBool();
	}
	public boolean isLoad() { return load; }
	public boolean isStore() { return !load; }
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
	public int getVariable() {
		return var;
	}
	public boolean setBool() {
		switch(inst&0xFF) {
		case Opcodes.ILOAD:
		case Opcodes.LLOAD:
		case Opcodes.FLOAD:
		case Opcodes.DLOAD:
		case Opcodes.ILOAD_0:
		case Opcodes.ILOAD_1:
		case Opcodes.ILOAD_2:
		case Opcodes.ILOAD_3:
		case Opcodes.LLOAD_0:
		case Opcodes.LLOAD_1:
		case Opcodes.LLOAD_2:
		case Opcodes.LLOAD_3:
		case Opcodes.FLOAD_0:
		case Opcodes.FLOAD_1:
		case Opcodes.FLOAD_2:
		case Opcodes.FLOAD_3:
		case Opcodes.DLOAD_0:
		case Opcodes.DLOAD_1:
		case Opcodes.DLOAD_2:
		case Opcodes.DLOAD_3:
			//ARRAY STUFF
		case Opcodes.ALOAD:
		case Opcodes.ALOAD_0:
		case Opcodes.ALOAD_1:
		case Opcodes.ALOAD_2:
		case Opcodes.ALOAD_3:
			return true;
		case Opcodes.ISTORE:
		case Opcodes.LSTORE:
		case Opcodes.FSTORE:
		case Opcodes.DSTORE:
		case Opcodes.ISTORE_0:
		case Opcodes.ISTORE_1:
		case Opcodes.ISTORE_2:
		case Opcodes.ISTORE_3:
		case Opcodes.LSTORE_0:
		case Opcodes.LSTORE_1:
		case Opcodes.LSTORE_2:
		case Opcodes.LSTORE_3:
		case Opcodes.FSTORE_0:
		case Opcodes.FSTORE_1:
		case Opcodes.FSTORE_2:
		case Opcodes.FSTORE_3:
		case Opcodes.DSTORE_0:
		case Opcodes.DSTORE_1:
		case Opcodes.DSTORE_2:
		case Opcodes.DSTORE_3:
			//ARRAY STUFF
		case Opcodes.ASTORE:
		case Opcodes.ASTORE_0:
		case Opcodes.ASTORE_1:
		case Opcodes.ASTORE_2:
		case Opcodes.ASTORE_3:
			return false;
		default: return false;
	}	
	}
	public static boolean isInst(byte inst) {
		switch(inst&0xFF) {
			case Opcodes.ILOAD:
			case Opcodes.LLOAD:
			case Opcodes.FLOAD:
			case Opcodes.DLOAD:
			case Opcodes.ILOAD_0:
			case Opcodes.ILOAD_1:
			case Opcodes.ILOAD_2:
			case Opcodes.ILOAD_3:
			case Opcodes.LLOAD_0:
			case Opcodes.LLOAD_1:
			case Opcodes.LLOAD_2:
			case Opcodes.LLOAD_3:
			case Opcodes.FLOAD_0:
			case Opcodes.FLOAD_1:
			case Opcodes.FLOAD_2:
			case Opcodes.FLOAD_3:
			case Opcodes.DLOAD_0:
			case Opcodes.DLOAD_1:
			case Opcodes.DLOAD_2:
			case Opcodes.DLOAD_3:
				//ARRAY STUFF
			case Opcodes.ALOAD:
			case Opcodes.ALOAD_0:
			case Opcodes.ALOAD_1:
			case Opcodes.ALOAD_2:
			case Opcodes.ALOAD_3:
				return true;
			case Opcodes.ISTORE:
			case Opcodes.LSTORE:
			case Opcodes.FSTORE:
			case Opcodes.DSTORE:
			case Opcodes.ISTORE_0:
			case Opcodes.ISTORE_1:
			case Opcodes.ISTORE_2:
			case Opcodes.ISTORE_3:
			case Opcodes.LSTORE_0:
			case Opcodes.LSTORE_1:
			case Opcodes.LSTORE_2:
			case Opcodes.LSTORE_3:
			case Opcodes.FSTORE_0:
			case Opcodes.FSTORE_1:
			case Opcodes.FSTORE_2:
			case Opcodes.FSTORE_3:
			case Opcodes.DSTORE_0:
			case Opcodes.DSTORE_1:
			case Opcodes.DSTORE_2:
			case Opcodes.DSTORE_3:
				//ARRAY STUFF
			case Opcodes.ASTORE:
			case Opcodes.ASTORE_0:
			case Opcodes.ASTORE_1:
			case Opcodes.ASTORE_2:
			case Opcodes.ASTORE_3:
				return true;
			default: return false;
		}
	}
	public int setVariable() {
		switch(inst&0xFF) {
		case Opcodes.ILOAD_0:
		case Opcodes.LLOAD_0:
		case Opcodes.FLOAD_0:
		case Opcodes.DLOAD_0:
		case Opcodes.ALOAD_0:
			return 0;		
		case Opcodes.ILOAD_1:
		case Opcodes.LLOAD_1:
		case Opcodes.FLOAD_1:
		case Opcodes.DLOAD_1:
		case Opcodes.ALOAD_1:
			return 1;
		case Opcodes.ILOAD_2:
		case Opcodes.LLOAD_2:
		case Opcodes.FLOAD_2:
		case Opcodes.DLOAD_2:
		case Opcodes.ALOAD_2:
			return 2;
		case Opcodes.ILOAD_3:
		case Opcodes.LLOAD_3:
		case Opcodes.FLOAD_3:
		case Opcodes.DLOAD_3:
		case Opcodes.ALOAD_3:
			return 3;
		case Opcodes.ILOAD:
		case Opcodes.LLOAD:
		case Opcodes.FLOAD:
		case Opcodes.DLOAD:
		case Opcodes.ALOAD:
			return data[0]&0xFF;
		case Opcodes.ISTORE_0:
		case Opcodes.LSTORE_0:
		case Opcodes.FSTORE_0:
		case Opcodes.DSTORE_0:
		case Opcodes.ASTORE_0:
			return 0;		
		case Opcodes.ISTORE_1:
		case Opcodes.LSTORE_1:
		case Opcodes.FSTORE_1:
		case Opcodes.DSTORE_1:
		case Opcodes.ASTORE_1:
			return 1;
		case Opcodes.ISTORE_2:
		case Opcodes.LSTORE_2:
		case Opcodes.FSTORE_2:
		case Opcodes.DSTORE_2:
		case Opcodes.ASTORE_2:
			return 2;
		case Opcodes.ISTORE_3:
		case Opcodes.LSTORE_3:
		case Opcodes.FSTORE_3:
		case Opcodes.DSTORE_3:
		case Opcodes.ASTORE_3:
			return 3;
		case Opcodes.ISTORE:
		case Opcodes.LSTORE:
		case Opcodes.FSTORE:
		case Opcodes.DSTORE:
		case Opcodes.ASTORE:
			return data[0]&0xFF;
		default: return -1;
	}
	}
	public Class<?> setType() {
		switch(inst&0xFF) {
		case Opcodes.ILOAD_0:
		case Opcodes.ILOAD_1:
		case Opcodes.ILOAD_2:
		case Opcodes.ILOAD_3:
		case Opcodes.ILOAD: return int.class;
		case Opcodes.LLOAD_0:
		case Opcodes.LLOAD_1:
		case Opcodes.LLOAD_2:
		case Opcodes.LLOAD_3:
		case Opcodes.LLOAD: return long.class;
		case Opcodes.FLOAD_0:
		case Opcodes.FLOAD_1:
		case Opcodes.FLOAD_2:
		case Opcodes.FLOAD_3:
		case Opcodes.FLOAD: return float.class;
		case Opcodes.DLOAD_0:
		case Opcodes.DLOAD_1:
		case Opcodes.DLOAD_2:
		case Opcodes.DLOAD_3:
		case Opcodes.DLOAD: return double.class;
			//ARRAY STUFF
		case Opcodes.ALOAD:
		case Opcodes.ALOAD_0:
		case Opcodes.ALOAD_1:
		case Opcodes.ALOAD_2:
		case Opcodes.ALOAD_3: return Array.class;
		case Opcodes.ISTORE_0:
		case Opcodes.ISTORE_1:
		case Opcodes.ISTORE_2:
		case Opcodes.ISTORE_3:
		case Opcodes.ISTORE: return int.class;
		case Opcodes.LSTORE_0:
		case Opcodes.LSTORE_1:
		case Opcodes.LSTORE_2:
		case Opcodes.LSTORE_3:
		case Opcodes.LSTORE: return long.class;
		case Opcodes.FSTORE_0:
		case Opcodes.FSTORE_1:
		case Opcodes.FSTORE_2:
		case Opcodes.FSTORE_3:
		case Opcodes.FSTORE: return float.class;
		case Opcodes.DSTORE_0:
		case Opcodes.DSTORE_1:
		case Opcodes.DSTORE_2:
		case Opcodes.DSTORE_3:
		case Opcodes.DSTORE: return double.class;
			//ARRAY STUFF
		case Opcodes.ASTORE:
		case Opcodes.ASTORE_0:
		case Opcodes.ASTORE_1:
		case Opcodes.ASTORE_2:
		case Opcodes.ASTORE_3: return Array.class;
		default: return null;
	}
	}
}
