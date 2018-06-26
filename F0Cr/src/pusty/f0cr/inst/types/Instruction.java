package pusty.f0cr.inst.types;

import pusty.f0cr.ConstantPool;
import pusty.f0cr.inst.Opcodes;

public class Instruction {
	protected byte inst;
	protected byte[] data;
	protected ConstantPool pool;
	public Instruction(byte inst, byte[] data) {
		this(null, inst, data);
	}
	public Instruction(ConstantPool pool, byte inst, byte[] data) {
		this.inst = inst;
		this.data = data;
		this.pool = pool;
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
