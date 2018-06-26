package pusty.f0xC.nodes;

import java.util.HashMap;

/**
 * Basic Abstract Node (A node is an abstract statement)
 */
public abstract class Node {
	public static final int INT8 = 0; //byte
	public static final int INT16 = 1; //short
	public static final int INT32 = 2; //int
	public static final int INT64 = 3; //long
	public static final int FLOAT = 4; //float
	public static final int DOUBLE = 5; //double
	public static final int ADDR = 6; //address (32/64)
	public static final int UNKNOWN = 42; //?
	
	public abstract void process(HashMap<String, String> vars);
	public abstract String refName();
	public abstract String getName();
	@Override
	public String toString() {
		HashMap<String, String> output = new HashMap<String, String>();
		process(output);
		return getName()+":"+output;
	}
	public static String size2String(int size) {
		switch(size) {
		case INT8:
			return "INT8";
		case INT16:
			return "INT16";
		case INT32:
			return "INT32";
		case INT64:
			return "INT64";
		case FLOAT:
			return "FLOAT";
		case DOUBLE:
			return "DOUBLE";
		case ADDR:
			return "ADDR";
		default:
			return "UNKNOWN";
		}
	}
}
