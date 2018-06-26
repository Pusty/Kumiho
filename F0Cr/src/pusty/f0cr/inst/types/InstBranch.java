package pusty.f0cr.inst.types;

import pusty.f0cr.ConstantPool;
import pusty.f0cr.inst.Opcodes;

public class InstBranch extends Instruction {
	protected int type;
	protected long branchPos;
	protected int poolIndex;
	/*
	 * Branches to memory location getBranch()
	 * either if integers on stack fulify Xcc
	 * or if integer on stack fulifies Xcc
	 * or unconditional jump
	 */
	public InstBranch(ConstantPool pool, byte inst, byte[] data) {
		super(pool, inst, data);
		if(!isInst(inst)) {System.err.println("Error: Created Branch with OpCode: "+inst+" => " +Opcodes.getName(inst));}
		type = setType();
		if(type != BRANCH_SUBROUTINE && type != BRANCH_INVOKE && type != BRANCH_RET && type != BRANCH_RETURN) {
			if((inst&0xFF) == Opcodes.GOTO_W || (inst&0xFF) == Opcodes.JSR_W) {
				branchPos = (((data[0]&0xFF) << 24) + ((data[1]&0xFF) << 16) + ((data[2]&0xFF) << 8) + data[3]&0xFF);
			}else {
				branchPos = (((data[0]&0xFF) << 8) + data[1]&0xFF);
			}
		}else if(type == BRANCH_INVOKE) {
			poolIndex = (((data[0]&0xFF) << 8) + data[1]&0xFF);
		}
			
	}
	public long getBranchPos() {
		return branchPos;
	}
	public int getPoolIndex() {
		return poolIndex;
	}
	public int getTypeOfBranch() {
		return type;
	}
	public static boolean isInst(byte inst) {
		switch(inst&0xFF) {
			case Opcodes.IFEQ:
	        case Opcodes.IFNE:
	        case Opcodes.IFLT:
	        case Opcodes.IFGE:
	        case Opcodes.IFGT:
	        case Opcodes.IFLE:
	        case Opcodes.IF_ICMPEQ:
	        case Opcodes.IF_ICMPNE:
	        case Opcodes.IF_ICMPLT:
	        case Opcodes.IF_ICMPGE:
	        case Opcodes.IF_ICMPGT:
	        case Opcodes.IF_ICMPLE:
	        case Opcodes.IF_ACMPEQ:
	        case Opcodes.IF_ACMPNE:
	        case Opcodes.IFNULL:
	        case Opcodes.IFNONNULL: 
	        case Opcodes.GOTO:
	        case Opcodes.GOTO_W:
	        case Opcodes.JSR:
	        case Opcodes.JSR_W:
	        //RETURN BRANCHES
	        case Opcodes.RET:
	        case Opcodes.RETURN:
	        case Opcodes.ARETURN:
	        case Opcodes.IRETURN:
	        case Opcodes.LRETURN:
	        case Opcodes.FRETURN:
	        case Opcodes.DRETURN:
	        //INVOKES
	        case Opcodes.INVOKEVIRTUAL:
	        case Opcodes.INVOKESPECIAL:
	        case Opcodes.INVOKESTATIC:
	        case Opcodes.INVOKEINTERFACE:
	        case Opcodes.INVOKEDYNAMIC:
				return true;
			default: return false;
		}
	}
	public static final int BRANCH_ERROR = -1;
	public static final int BRANCH_RET = 0; //returns from subroutine
	public static final int BRANCH_RETURN = 1; //returns with value
	public static final int BRANCH_SUBROUTINE = 2; //branches to subroutine
	public static final int BRANCH_GOTO = 3; //just branches
	public static final int BRANCH_NULL = 4; //compares reference with null
	public static final int BRANCH_ICMPCC = 5; //compares 2 integers
	public static final int BRANCH_ACMPCC = 6; //compares 2 references
	public static final int BRANCH_CC = 7; //checks value
	public static final int BRANCH_INVOKE = 8; //invokes method
	
	public int setType() {
		switch(inst&0xFF) {
		case Opcodes.IFEQ:
        case Opcodes.IFNE:
        case Opcodes.IFLT:
        case Opcodes.IFGE:
        case Opcodes.IFGT:
        case Opcodes.IFLE:
        	return BRANCH_CC;
        case Opcodes.IF_ICMPEQ:
        case Opcodes.IF_ICMPNE:
        case Opcodes.IF_ICMPLT:
        case Opcodes.IF_ICMPGE:
        case Opcodes.IF_ICMPGT:
        case Opcodes.IF_ICMPLE:
        	return BRANCH_ICMPCC;
        case Opcodes.IF_ACMPEQ:
        case Opcodes.IF_ACMPNE:
        	return BRANCH_ACMPCC;
        case Opcodes.IFNULL:
        case Opcodes.IFNONNULL: 
        	return BRANCH_NULL;
        case Opcodes.GOTO:
        case Opcodes.GOTO_W:
        	return BRANCH_GOTO;
        case Opcodes.JSR:
        case Opcodes.JSR_W:
        	return BRANCH_SUBROUTINE;
        //RETURN BRANCHES
        case Opcodes.RET:
        	return BRANCH_RET;
        case Opcodes.RETURN:
        case Opcodes.ARETURN:
        case Opcodes.IRETURN:
        case Opcodes.LRETURN:
        case Opcodes.FRETURN:
        case Opcodes.DRETURN:
        	return BRANCH_RETURN;
        case Opcodes.INVOKEVIRTUAL:
        case Opcodes.INVOKESPECIAL:
        case Opcodes.INVOKESTATIC:
        case Opcodes.INVOKEINTERFACE:
        case Opcodes.INVOKEDYNAMIC:
        	return BRANCH_INVOKE;
		default: return BRANCH_ERROR;
		}
	}
}
