package pusty.f0cr.attribute;

import java.io.DataInputStream;

import pusty.f0cr.AttributeTable;
import pusty.f0cr.ClassReader;
import pusty.f0cr.ExceptionTable;
import pusty.f0cr.inst.InstructionReader;

public class CodeAttribute extends Attribute {
	protected short maxStacks;
	protected short maxLocals;
	protected int codeLength;
	protected byte[] instructions;
	protected ExceptionTable exceptionTable;
	protected AttributeTable attributeTable;
	protected InstructionReader instructionReader;
	
	private int lineNumberTable = -1;
	private int localVariableTable = -1;
	
	public CodeAttribute(ClassReader classReader, DataInputStream s, int l) throws Exception {
		super(classReader, s, l);
		for(int i=0;i<getAttributeTable().getSize();i++) {
			Attribute at = getAttributeTable().getIndexes()[i].getInfo();
			if(at instanceof LineNumberTableAttribute)
				lineNumberTable = i;
			if(at instanceof LocalVariableTableAttribute)
				localVariableTable = i;
		}
	}

	@Override
	public void read(DataInputStream s) throws Exception {
		maxStacks = s.readShort();
		maxLocals = s.readShort();
		codeLength = s.readInt();
		instructions = new byte[codeLength];
		for(int i=0;i<codeLength;i++) {
			instructions[i] = s.readByte();
		}
		instructionReader = new InstructionReader(classReader, instructions);
		exceptionTable = new ExceptionTable(classReader, s);
		attributeTable = new AttributeTable(classReader, s);
	}
	
	public short getMaxStacks() { return maxStacks; }
	public short getMaxLocals() { return maxLocals; }
	/**
	 * Size of code segment in bytes
	 * @return amount of bytes of this code attribute
	 */
	public int getCodeLength() { return codeLength; }
	public byte[] getInstructions() { return instructions; }
	public ExceptionTable getExceptionTable() { return exceptionTable; }
	public AttributeTable getAttributeTable() { return attributeTable; }
	public InstructionReader getInst() { return instructionReader; }
	
	/**
	 * Returns the LineNumberTableAttribute if it exists
	 * @return returns an entry of type LineNumberTableAttribute from the AttributeTable
	 */
	public LineNumberTableAttribute getLineNumberTable() {
		if(lineNumberTable==-1) return null;
		return (LineNumberTableAttribute) getAttributeTable().getIndexes()[lineNumberTable].getInfo();
	}
	/**
	 * Returns the LocalVariableTable if it exists
	 * @return returns an entry of type LocalVariableTableAttribute from the AttributeTable
	 */
	public LocalVariableTableAttribute getLocalVariableTable() {
		if(localVariableTable==-1) return null;
		return (LocalVariableTableAttribute) getAttributeTable().getIndexes()[localVariableTable].getInfo();
	}
	@Override
	public void printOut(String pre) {
		getAttributeTable().printOut(pre);
	}
}
