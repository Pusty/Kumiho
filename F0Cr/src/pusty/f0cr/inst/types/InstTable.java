package pusty.f0cr.inst.types;

import pusty.f0cr.inst.InstructionReader;
import pusty.f0cr.inst.Opcodes;

public class InstTable extends Instruction {

	
	protected int defaultBranch;
	protected int branchIndex[];
	protected int branchList[];
	
	/*
	 * Table Operations
	 */
	public InstTable(InstructionReader reader, byte inst, byte[] data) {
		super(reader, inst, data);
		if(!isInst(inst)) {System.err.println("Error: Created Table with OpCode: "+inst+" => " +Opcodes.getName(inst));}
		if((inst&0xFF) == Opcodes.TABLESWITCH) parseTableSwitch(data);
		if((inst&0xFF) == Opcodes.LOOKUPSWITCH) parseLookupSwitch(data);
	}
	
	public int getBranchDefault() { return defaultBranch; }
	public int[] getBranchIndex() { return branchIndex; }
	public int[]  getBranchList() { return branchList; }
	
	private void parseTableSwitch(byte[] data) {
		defaultBranch = InstructionHandler.readInt(data, 0);
		int lowInt = InstructionHandler.readInt(data, 4);
		int highInt = InstructionHandler.readInt(data, 8);
		int amount = (highInt-lowInt+1);
		branchList = new int[amount];
		branchIndex = new int[amount];
		for(int i=0;i<amount;i++) {
			branchIndex[i] = i+lowInt;
			branchList[i] = InstructionHandler.readInt(data, 12+i*4);
		}
	}
	
	private void parseLookupSwitch(byte[] data) {
		defaultBranch = InstructionHandler.readInt(data, 0);
		int npairs = InstructionHandler.readInt(data, 4);
		branchList = new int[npairs];
		branchIndex = new int[npairs];
		for(int i=0;i<npairs;i++) {
			branchIndex[i] = InstructionHandler.readInt(data, 8+i*8);
			branchList[i] = InstructionHandler.readInt(data, 8+i*8+4);
		}
	}

	public static boolean isInst(byte inst) {
		switch(inst&0xFF) {
			case Opcodes.TABLESWITCH:
			case Opcodes.LOOKUPSWITCH:
				return true;			
			default: return false;
		}
	}
}

