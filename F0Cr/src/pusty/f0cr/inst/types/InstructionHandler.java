package pusty.f0cr.inst.types;

import pusty.f0cr.inst.InstructionReader;


public class InstructionHandler {
	public static Instruction createInstruction(InstructionReader reader, byte inst, byte[] data) {
		if(InstAVar.isInst(inst))
			return new InstAVar(reader, inst, data);
		if(InstBranch.isInst(inst))
			return new InstBranch(reader, inst, data);
		if(InstCompare.isInst(inst))
			return new InstCompare(reader, inst, data);
		if(InstConst.isInst(inst))
			return new InstConst(reader, inst, data);
		if(InstConvert.isInst(inst))
			return new InstConvert(reader, inst, data);
		if(InstLocalVar.isInst(inst))
			return new InstLocalVar(reader, inst, data);
		if(InstMath.isInst(inst))
			return new InstMath(reader, inst, data);
		if(InstStack.isInst(inst))
			return new InstStack(reader, inst, data);
		if(InstVar.isInst(inst))
			return new InstVar(reader, inst, data);	
		return new Instruction(reader, inst, data);
	}
}
