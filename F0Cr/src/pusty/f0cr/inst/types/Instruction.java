package pusty.f0cr.inst.types;

import pusty.f0cr.ConstantPool;
import pusty.f0cr.inst.InstructionReader;
import pusty.f0cr.inst.Opcodes;

public class Instruction {
	protected byte inst;
	protected byte[] data;
	protected ConstantPool pool;
	protected InstructionReader reader;

	public Instruction(InstructionReader reader, byte inst, byte[] data) {
		this.inst = inst;
		this.data = data;
		this.pool = reader.getReader().getPool();
		this.reader = reader;
	}
	public InstructionReader getInstructionReader() {
		return reader;
	}
	public ConstantPool getConstantPool() {
		return pool;
	}
	public byte getInstruction() {
		return inst;
	}
	public byte[] getData() {
		return data;
	}
	public String getName() {
		return Opcodes.getName(inst);
	}
}
