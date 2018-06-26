package pusty.f0xC.nodes;

import java.util.HashMap;

/**
 * Node used for handling objects
 */
public class NodeObject extends Node {
	
	protected int type;
	protected String className;
	
	public static final int NEW_OBJECT = 0;
	public static final int DESTROY = 1;
	public static final int REFERENCE = 2;
	public static final int NEW_ARRAY = 3;
	public static final int FREE = 4;
	public static final int ARRAYLENGTH = 5;
	public static final int CLDESTROY = 6;

	public NodeObject(int type, String className) {
		this.type = type;
		this.className = className;
	}
	
	@Override
	public String refName() {
		String base = "nodes.object";
		return base;
	}

	@Override
	public String getName() {
		return "Object";
	}
	public String getClassName() {
		return className;
	}
	public int getType() {
		return type;
	}
	
	
	
	@Override
	public void process(HashMap<String, String> vars) {
		vars.put("node", getName());
		vars.put("className", className);
		switch(type) {
		case NEW_OBJECT:
			vars.put("type", "NEW_OBJECT");
			break;
		case DESTROY:
			vars.put("type", "DESTROY");
			break;
		case REFERENCE:
			vars.put("type", "REFERENCE");
			break;
		case NEW_ARRAY:
			vars.put("type", "NEW_ARRAY");
			break;
		case FREE:
			vars.put("type", "FREE");
			break;
		case ARRAYLENGTH:
			vars.put("type", "ARRAYLENGTH");
			break;
		case CLDESTROY:
			vars.put("type", "CLDESTROY");
			break;
		default:
			vars.put("type", "UNKNOWN");
	}
	}

}
