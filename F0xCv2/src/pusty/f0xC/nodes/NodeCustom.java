package pusty.f0xC.nodes;

import java.lang.reflect.Method;
import java.util.HashMap;

/**
 * Node used for saving and loading fixed sized variables
 */
public class NodeCustom extends Node {
	
	private Method customMethod;
	
	public NodeCustom(Method m) {
		customMethod = m;
	}
	@Override
	public String refName() {
		String base = "nodes.custom";
		return base;
	}
	
	public Method customMethod() {
		return customMethod;
	}
	
	@Override
	public String getName() {
		return "Custom";
	}

	@Override
	public void process(HashMap<String, String> vars) {
		vars.put("node", getName());
	}

}
