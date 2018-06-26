package pusty.f0xC.nodes;

import java.util.HashMap;

/**
 * Node used for jumping (conditional or not)
 */
public class NodeJump extends Node {
	
	protected int size; //size for this operation
	protected int jumpCondition; //condition for jumping
	protected int branchPosition; //where to jump to
	
	public static final int JUMP_ALWAYS = 0;
	public static final int JUMP_EQUALS = 1;
	public static final int JUMP_NOTEQUALS = 2;
	public static final int JUMP_LESSTHAN = 3;
	public static final int JUMP_GREATERTHAN = 4;
	public static final int JUMP_LESSEQUALS = 5;
	public static final int JUMP_GREATEREQUALS = 6;
	public static final int JUMP_RETURN = 7;

	public NodeJump(int size, int jumpCondition, int branchPosition) {
		this.size = size;
		this.jumpCondition = jumpCondition;
		this.branchPosition = branchPosition;
	}
	@Override
	public String refName() {
		String base = "nodes.jump";
		return base;
	}

	@Override
	public String getName() {
		return "Jump";
	}
	public int getJumpCondition() {
		return jumpCondition;
	}
	
	public int getBranchPosition() {
		return branchPosition;
	}
	
	@Override
	public void process(HashMap<String, String> vars) {
		vars.put("node", getName());
		vars.put("size", Node.size2String(size));
		switch(jumpCondition) {
		case JUMP_ALWAYS:
			vars.put("jumpCondition", "ALWAYS");
			break;
		case JUMP_EQUALS:
			vars.put("jumpCondition", "EQUALS");
			break;
		case JUMP_NOTEQUALS:
			vars.put("jumpCondition", "NOTEQUALS");
			break;
		case JUMP_LESSTHAN:
			vars.put("jumpCondition", "LESSTHAN");
			break;
		case JUMP_GREATERTHAN:
			vars.put("jumpCondition", "GREATERTHAN");
			break;
		case JUMP_LESSEQUALS:
			vars.put("jumpCondition", "LESSEQUALS");
			break;
		case JUMP_GREATEREQUALS:
			vars.put("jumpCondition", "GREATEREQUALS");
			break;
		case JUMP_RETURN:
			vars.put("jumpCondition", "RETURN");
			break;
		default:
			vars.put("jumpCondition", "UNKNOWN");
	}
		vars.put("branchPosition", Integer.toString(branchPosition));
	}

}
