package pusty.f0cr.inst.types;

import pusty.f0cr.ConstantPool;


public class InstructionHandler {
	public static Instruction createInstruction(ConstantPool pool, byte inst, byte[] data) {
		if(InstAVar.isInst(inst))
			return new InstAVar(pool, inst, data);
		if(InstBranch.isInst(inst))
			return new InstBranch(pool, inst, data);
		if(InstCompare.isInst(inst))
			return new InstCompare(pool, inst, data);
		if(InstConst.isInst(inst))
			return new InstConst(pool, inst, data);
		if(InstConvert.isInst(inst))
			return new InstConvert(pool, inst, data);
		if(InstLocalVar.isInst(inst))
			return new InstLocalVar(pool, inst, data);
		if(InstMath.isInst(inst))
			return new InstMath(pool, inst, data);
		if(InstStack.isInst(inst))
			return new InstStack(pool, inst, data);
		if(InstVar.isInst(inst))
			return new InstVar(pool, inst, data);	
		return new Instruction(pool, inst, data);
	}
}
