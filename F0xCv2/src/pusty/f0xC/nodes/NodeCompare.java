package pusty.f0xC.nodes;

import java.util.HashMap;

/**
 * Node used for comparing
 */
public class NodeCompare extends Node {
	
	protected int size; //size for this operation
	protected int compareType; //what this compares for
	
	public static final int COMPARE_EQUAL = 0;
	
	public static final int COMPARE_NULL = 6;
	
	public static final int COMPARE_CHECKCAST = 8;
	public static final int COMPARE_INSTANCEOF = 9;
	
	public static final int COMPARE_SAMEREFERENCE = 10;

	public NodeCompare(int size, int compareType) {
		this.size = size;
		this.compareType = compareType;
	}
	@Override
	public String refName() {
		String base = "nodes.compare";
		return base;
	}

	@Override
	public String getName() {
		return "Compare";
	}
	
	public int getCompareType() {
		return compareType;
	}
	
	public int getSize() {
		return size;
	}
	
	@Override
	public void process(HashMap<String, String> vars) {
		vars.put("node", getName());
		vars.put("size", Node.size2String(size));
		switch(compareType) {
		case COMPARE_EQUAL:
			vars.put("compareType", "EQUAL");
			break;
		case COMPARE_NULL:
			vars.put("compareType", "NULL");
			break;
		case COMPARE_CHECKCAST:
			vars.put("compareType", "CHECKCAST");
			break;
		case COMPARE_INSTANCEOF:
			vars.put("compareType", "INSTANCEOF");
			break;
		case COMPARE_SAMEREFERENCE:
			vars.put("compareType", "SAMEREFERENCE");
			break;
		default:
			vars.put("compareType", "UNKNOWN");
	}
	}

}
