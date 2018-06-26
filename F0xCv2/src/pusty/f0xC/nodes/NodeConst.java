package pusty.f0xC.nodes;

import java.util.HashMap;

/**
 * Node used for setting register/transfer place to constant
 */
public class NodeConst extends Node {
	
	protected int size; //size for this operation
	protected Object value; //constant value
	
	public NodeConst(int size, Object value) {
		this.size = size;
		this.value = value;
	}
	@Override
	public String refName() {
		String base = "nodes.const";
		return base;
	}

	public Object getValue() {
		return value;
	}
	
	@Override
	public String getName() {
		return "Constant";
	}
	
	@Override
	public void process(HashMap<String, String> vars) {
		vars.put("node", getName());
		vars.put("size", Node.size2String(size));
		vars.put("value", value==null?"null":value.toString());
	}

}
