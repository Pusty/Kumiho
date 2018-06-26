package pusty.f0xC.nodes;

import java.util.HashMap;

import pusty.f0xC.F0xUtil;

/**
 * Node used for invoking methods with the stack
 */
public class NodeInvoke extends Node {
	
	//Size is used to determine how many parameters are used
	protected int parameters; //size of parameters (int = 1, long = 2, etc)
	protected int invokeType; //kind of invoking (invokedynamic, invokeinterface,invokespecial, invokestatic, invokevirtual)
	protected String invokeIdentifierRaw; //what to invoke in raw format
	protected String invokeIdentifier; //what to invoke in sanitized format
	protected Class<?> returnType;
	
	public static final int INVOKE_DYNAMIC = 0;
	public static final int INVOKE_INTERFACE = 1;
	public static final int INVOKE_SPECIAL = 2;
	public static final int INVOKE_STATIC = 3; //Invoke a static function
	public static final int INVOKE_VIRTUAL = 4;
	
	public NodeInvoke(int parameters, int invokeType, String invokeIdentifier, Class<?> returnType) {
		this.parameters = parameters;
		this.invokeType = invokeType;
		this.invokeIdentifierRaw = invokeIdentifier;
		this.invokeIdentifier = invokeIdentifier.replace(";", "").replace('/', '_').replace("(", "_").replace(")", "_").replace("[", "_").replace("]", "_");
		this.returnType = returnType;
	}
	@Override
	public String refName() {
		String base = "nodes.invoke";
		return base;
	}

	@Override
	public String getName() {
		return "Invoke";
	}
	
	public int getInvokeType() {
		return invokeType;
	}
	
	public String getInvokeIdentifier() {
		return invokeIdentifier;
	}
	
	public String getInvokeIdentifierRaw() {
		return invokeIdentifierRaw;
	}
	
	public int getParameters() {
		return parameters;
	}
	
	public boolean returnVoid() {
		return returnType == null;
	}
	
	public int returnType() {
		return F0xUtil.convertedType(returnType);
	}
	
	@Override
	public void process(HashMap<String, String> vars) {
		vars.put("node", getName());
		switch(invokeType) {
		case INVOKE_DYNAMIC:
			vars.put("invokeType", "DYNAMIC");
			break;
		case INVOKE_INTERFACE:
			vars.put("invokeType", "INTERFACE");
			break;
		case INVOKE_SPECIAL:
			vars.put("invokeType", "SPECIAL");
			break;
		case INVOKE_STATIC:
			vars.put("invokeType", "STATIC");
			break;
		case INVOKE_VIRTUAL:
			vars.put("invokeType", "VIRTUAL");
			break;
		default:
			vars.put("invokeType", "UNKNOWN");
	}
		
		vars.put("invokeIdentifier", invokeIdentifier);
		vars.put("invokeIdentifierRaw", invokeIdentifierRaw);
		vars.put("returnType", returnType==null?"void":returnType.getSimpleName());
	}

}
