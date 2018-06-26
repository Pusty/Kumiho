package pusty.f0xC.nodes;

import java.util.HashMap;

/**
 * Node used for pushing and poping from the stack to/from register/transfer place
 */
public class NodeStack extends Node {

	public static final int PUSH_0 = 0;
	public static final int PUSH_1 = 1;
	public static final int PUSH_2 = 2;
	public static final int PUSH_3 = 3;
	public static final int POP_0 = 4;
	public static final int POP_1 = 5;
	public static final int POP_2 = 6;
	public static final int POP_3 = 7;
	
	public static final int F2D = 8;
	public static final int D2F = 9;
	public static final int I2L = 10;
	public static final int L2I = 11;
	public static final int I2F = 12;
	public static final int F2I = 13;
	public static final int L2D = 14;
	public static final int D2L = 15;
	
	public static final int THROW = 16;
	
	protected int size; //size for this operation
	protected int type; //type of variable
	
	//TODO: Make n and v save for long and double
	public NodeStack(int size, int type) {
		this.size = size;
		this.type = type;
	}
	@Override
	public String refName() {
		String base = "nodes.stack";
		return base;
	}
	
	public int getType() {
		return type;
	}
	
	public int getSize() {
		return size;
	}

	@Override
	public String getName() {
		return "Stack";
	}
	
	@Override
	public void process(HashMap<String, String> vars) {
		vars.put("node", getName());
		vars.put("size", Node.size2String(size));
		switch(type) {
			case PUSH_0:
				vars.put("type", "PUSH_0");
				break;
			case PUSH_1:
				vars.put("type", "PUSH_1");
				break;
			case PUSH_2:
				vars.put("type", "PUSH_2");
				break;
			case PUSH_3:
				vars.put("type", "PUSH_3");
				break;
			case POP_0:
				vars.put("type", "POP_0");
				break;
			case POP_1:
				vars.put("type", "POP_1");
				break;
			case POP_2:
				vars.put("type", "POP_2");
				break;
			case POP_3:
				vars.put("type", "POP_3");
				break;
			case F2D:
				vars.put("type", "F2D");
				break;
			case D2F:
				vars.put("type", "D2F");
				break;
			case I2L:
				vars.put("type", "I2L");
				break;
			case L2I:
				vars.put("type", "L2I");
				break;
			case F2I:
				vars.put("type", "F2I");
				break;
			case I2F:
				vars.put("type", "I2F");
				break;
			case D2L:
				vars.put("type", "D2L");
				break;
			case L2D:
				vars.put("type", "L2D");
				break;
			case THROW:
				vars.put("type", "THROW");
				break;
			default:
				vars.put("type", "UNKNOWN");
		}
	}

}
