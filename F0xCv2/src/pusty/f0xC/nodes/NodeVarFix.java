package pusty.f0xC.nodes;

import java.util.HashMap;

/**
 * Node used for saving and loading fixed sized variables
 */
public class NodeVarFix extends Node {

	//Type
	public static final int LOCAL = 0;
	public static final int GLOBAL = 1;
	public static final int OBJECT = 2;
	public static final int ARRAY = 3;
	
	public static final int LOAD = 0;
	public static final int SAVE = 1;
	
	protected int size; //size for this operation
	protected int scope; //scope of this node
	protected String referredBy; //how this variable is refered to
	protected int opType; //type of valuing this variable

	//TODO: Make n and v save for long and double
	public NodeVarFix(int size, int scope ,int opType, String referredBy) {
		this.size = size;
		this.scope = scope;
		this.opType = opType;
		this.referredBy = referredBy;
	}
	@Override
	public String refName() {
		String base = "nodes.var.fix";
		return base;
	}
	
	public int getSize() {
		return size;
	}
	
	public int getScope() {
		return scope;
	}
	
	public int getOpType() {
		return opType;
	}
	
	public String refferedBy() {
		return referredBy;
	}

	@Override
	public String getName() {
		return "VariableFixed";
	}

	@Override
	public void process(HashMap<String, String> vars) {
		vars.put("node", getName());
		vars.put("size", Node.size2String(size));
		switch(opType) {
			case LOAD:
				vars.put("opType", "LOAD");
				break;
			case SAVE:
				vars.put("opType", "SAVE");
				break;
			default:
				vars.put("opType", "UNKNOWN");
		}
		switch(scope) {
			case GLOBAL:
				vars.put("scope", "GLOBAL");
				break;
			case LOCAL:
				vars.put("scope", "LOCAL");
				break;
			case OBJECT:
				vars.put("scope", "OBJECT");
				break;
			case ARRAY:
				vars.put("scope", "ARRAY");
				break;
			default:
				vars.put("scope", "UNKNOWN");
		}
		vars.put("referredBy", referredBy);
	}

}
