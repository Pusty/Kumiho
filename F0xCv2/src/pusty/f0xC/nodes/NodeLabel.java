package pusty.f0xC.nodes;

import java.util.HashMap;

/**
 * Dummy Node meant as a label
 */
public class NodeLabel extends Node {

	protected int index;

	public NodeLabel(int index) {
		this.index = index;
	}
	@Override
	public String refName() {
		String base = "nodes.label";
		return base;
	}
	
	public int getIndex() {
		return index;
	}
	

	@Override
	public String getName() {
		return "Label";
	}

	@Override
	public void process(HashMap<String, String> vars) {
		vars.put("node", getName());
		vars.put("index", Integer.toString(index));
	}

}
