package pusty.f0xC.nodes;

import java.util.HashMap;

/**
 * Node used for handling math operations and putting results into register/transfer place
 */
public class NodeMath extends Node {

	public static final int ADD = 0; //addition (p1+p2=p3)
	public static final int SUB = 1; //subtract (p1-p2=p3)
	public static final int MUL = 2; //multiplication (p1*p2=p3)
	public static final int DIV = 3; //division (p1/p2=p3)
	public static final int REM = 4; //reminder (p1%p2=p3)
	public static final int NEG = 5;  //not (!p1 = p2)
	public static final int SHL = 6; //shift left (p1 << p2 = p3)
	public static final int SHR = 7; //shift right (p1 >> p2 = p3)
	public static final int USHR = 8; //logical shift right (p1 >>> p2 = p3)
	public static final int AND = 9; //and (p1 & p2 = p3)
	public static final int OR = 10; //or (p1 | p2 = p3)
	public static final int XOR = 11; //xor (p1 ^ p2 = p3)
	
	protected int size; //size for this operation
	protected int type; //type of variable
	
	public NodeMath(int size, int type) {
		this.size = size;
		this.type = type;
	}
	@Override
	public String refName() {
		String base = "nodes.math";
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
		return "Math";
	}
	
	@Override
	public void process(HashMap<String, String> vars) {
		vars.put("node", getName());
		vars.put("size", Node.size2String(size));
		switch(type) {
			case ADD:
				vars.put("type", "ADD");
				break;
			case SUB:
				vars.put("type", "SUB");
				break;
			case MUL:
				vars.put("type", "MUL");
				break;
			case DIV:
				vars.put("type", "DIV");
				break;
			case REM:
				vars.put("type", "REM");
				break;
			case NEG:
				vars.put("type", "NEG");
				break;
			case SHL:
				vars.put("type", "SHL");
				break;
			case SHR:
				vars.put("type", "SHR");
				break;
			case USHR:
				vars.put("type", "USHR");
				break;
			case AND:
				vars.put("type", "AND");
				break;
			case OR:
				vars.put("type", "OR");
				break;
			case XOR:
				vars.put("type", "XOR");
				break;
			default:
				vars.put("type", "UNKNOWN");
		}
	}

}
