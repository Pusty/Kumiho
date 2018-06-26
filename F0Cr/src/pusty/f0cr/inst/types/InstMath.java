package pusty.f0cr.inst.types;

import pusty.f0cr.ConstantPool;
import pusty.f0cr.inst.Opcodes;

public class InstMath extends Instruction {
	protected Class<?> cla;
	protected int operation;
	/*
	 * Reads v1 and v2 from stack then use math operation getOperation() on them and output value with type getType() to stack
	 */
	public InstMath(ConstantPool pool, byte inst, byte[] data) {
		super(pool, inst, data);
		if(!isInst(inst)) {System.err.println("Error: Created Math with OpCode: "+inst+" => " +Opcodes.getName(inst));}
		operation = setOperation();
		cla = setType();
	}
	public int getOperationType() {
		return operation;
	}
	//IINC STUFF
	public int getLocalVariable() {
		if(operation==MATH_INC)
		return data[0]&0xFF; 
		else return -1;
	}
	//IINC STUFF
	public int getConstantValue() {
		if(operation==MATH_INC)
		return data[1]&0xFF; 
		else return -1;
	}
	//number of arguments f.e. arg0*arg1 or -arg0
	public int getArgumentCount() {
		if(operation!=MATH_NEG) return 2;
		return 1;
	}
	public static final int MATH_ERROR = -1;
	public static final int MATH_ADD = 0;
	public static final int MATH_SUB = 1;
	public static final int MATH_MUL = 2;
	public static final int MATH_DIV = 3;
	public static final int MATH_REM = 4;
	public static final int MATH_NEG = 5; //NOTE THAT NEG ONLY HAS 1 ARGUMENT, THE OTHERS 2
	public static final int MATH_SHL = 6;
	public static final int MATH_SHR = 7;
	public static final int MATH_USHR = 8;
	public static final int MATH_AND = 9;
	public static final int MATH_OR = 10;
	public static final int MATH_XOR = 11;
	public static final int MATH_INC = 12; //IINC HAS COMPLETLY DIFFERENT MECHANICS BUT ANYWAYS
	public String getOperation() {
		switch(operation) {
		case MATH_ADD: return "ADD";
		case MATH_SUB: return "SUB";
		case MATH_MUL: return "MUL";
		case MATH_DIV: return "DIV";
		case MATH_REM: return "REM";
		case MATH_NEG: return "NEG";
		case MATH_SHL: return "SHL";
		case MATH_SHR: return "SHR";
		case MATH_USHR: return "USHR";
		case MATH_AND: return "AND";
		case MATH_OR: return "OR";
		case MATH_XOR: return "XOR";
		case MATH_INC: return "INC";
			default: return "@ERROR";
		}
	}
	public String getOperationShort() {
		switch(operation) {
		case MATH_ADD: return "+";
		case MATH_SUB: return "-";
		case MATH_MUL: return "*";
		case MATH_DIV: return "/";
		case MATH_REM: return "%";
		case MATH_NEG: return "*-1";
		case MATH_SHL: return "<<";
		case MATH_SHR: return ">>";
		case MATH_USHR: return ">>>";
		case MATH_AND: return "&";
		case MATH_OR: return "|";
		case MATH_XOR: return "^";
		case MATH_INC: return "+=";
			default: return "@ERROR";
		}
	}
	public Class<?> getType() {
		return cla;
	}
	public static boolean isInst(byte inst) {
		switch(inst&0xFF) {
			case Opcodes.IADD:
			case Opcodes.LADD:
			case Opcodes.FADD:
			case Opcodes.DADD:
			case Opcodes.ISUB:
			case Opcodes.LSUB:
			case Opcodes.FSUB:
			case Opcodes.DSUB:
			case Opcodes.IMUL:
			case Opcodes.LMUL:
			case Opcodes.FMUL:
			case Opcodes.DMUL:
			case Opcodes.IDIV:
			case Opcodes.LDIV:
			case Opcodes.FDIV:
			case Opcodes.DDIV:
			case Opcodes.IAND:
			case Opcodes.LAND:
			case Opcodes.IOR:
			case Opcodes.LOR:
			case Opcodes.IXOR:
			case Opcodes.LXOR:
			case Opcodes.IREM:
			case Opcodes.LREM:
			case Opcodes.FREM:
			case Opcodes.DREM:
			case Opcodes.INEG:
			case Opcodes.LNEG:
			case Opcodes.FNEG:
			case Opcodes.DNEG:
			case Opcodes.ISHR:
			case Opcodes.LSHR:
			case Opcodes.ISHL:
			case Opcodes.LSHL:
			case Opcodes.IUSHR:
			case Opcodes.LUSHR:
			case Opcodes.IINC:
				return true;			
			default: return false;
		}
	}
	public Class<?> setType() {
		switch(inst&0xFF) {
		case Opcodes.IADD:
		case Opcodes.ISUB:
		case Opcodes.IMUL:
		case Opcodes.IDIV:
		case Opcodes.IAND:
		case Opcodes.IOR:
		case Opcodes.IXOR:
		case Opcodes.IREM:
		case Opcodes.INEG:
		case Opcodes.ISHR:
		case Opcodes.ISHL:
		case Opcodes.IUSHR:
		case Opcodes.IINC:
			return int.class;
		case Opcodes.LADD:
		case Opcodes.LSUB:
		case Opcodes.LMUL:
		case Opcodes.LDIV:
		case Opcodes.LAND:
		case Opcodes.LOR:
		case Opcodes.LXOR:
		case Opcodes.LREM:
		case Opcodes.LNEG:
		case Opcodes.LSHR:
		case Opcodes.LSHL:
		case Opcodes.LUSHR:
			return long.class;			
		case Opcodes.FADD:
		case Opcodes.FSUB:
		case Opcodes.FMUL:
		case Opcodes.FDIV:
		case Opcodes.FREM:
		case Opcodes.FNEG:
			return float.class;
		case Opcodes.DADD:
		case Opcodes.DSUB:
		case Opcodes.DMUL:
		case Opcodes.DDIV:
		case Opcodes.DREM:
		case Opcodes.DNEG:
			return double.class;
		default: return null;
	}
	}
	
	public int setOperation() {
		switch(inst&0xFF) {
			case Opcodes.IADD:
			case Opcodes.LADD:
			case Opcodes.FADD:
			case Opcodes.DADD:
				return MATH_ADD;
			case Opcodes.ISUB:
			case Opcodes.LSUB:
			case Opcodes.FSUB:
			case Opcodes.DSUB:
				return MATH_SUB;
			case Opcodes.IMUL:
			case Opcodes.LMUL:
			case Opcodes.FMUL:
			case Opcodes.DMUL:
				return MATH_MUL;
			case Opcodes.IDIV:
			case Opcodes.LDIV:
			case Opcodes.FDIV:
			case Opcodes.DDIV:
				return MATH_DIV;
			case Opcodes.IREM:
			case Opcodes.LREM:
			case Opcodes.FREM:
			case Opcodes.DREM:
				return MATH_REM;
			case Opcodes.INEG:
			case Opcodes.LNEG:
			case Opcodes.FNEG:
			case Opcodes.DNEG:
				return MATH_NEG;
			case Opcodes.IAND:
			case Opcodes.LAND:
				return MATH_AND;
			case Opcodes.IOR:
			case Opcodes.LOR:
				return MATH_OR;
			case Opcodes.IXOR:
			case Opcodes.LXOR:
				return MATH_XOR;
			case Opcodes.ISHR:
			case Opcodes.LSHR:
				return MATH_SHR;
			case Opcodes.ISHL:
			case Opcodes.LSHL:
				return MATH_SHL;
			case Opcodes.IUSHR:
			case Opcodes.LUSHR:
				return MATH_USHR;
			case Opcodes.IINC:
				return MATH_INC;
			default: return MATH_ERROR;
		}
	}
}
