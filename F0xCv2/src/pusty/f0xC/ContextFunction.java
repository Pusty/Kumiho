package pusty.f0xC;

import java.util.ArrayList;

import pusty.f0xC.lang.OverrideHandler.TranslationProperty;
import pusty.f0xC.nodes.Node;

public class ContextFunction {
	
	public static final int STATIC = 0;
	public static final int LOCAL  = 1;
	
	private String className;
	public String functionName; //TODO CHANGE THIS AND MAKE IT USEFUL AGAIN
	private String fullName; //TODO Change references to the function belong to this

	private int type = 0;
	private Class<?>[] classTypes; //types of arguments and return type
	
	
	private ArrayList<Integer> localVariables;
	private ArrayList<Integer> parameters;
	
	private int properties;
	
	private ArrayList<String> content;
	
	private Node[] nodes = null;
	private int index = 0;
	private int nodeIndex = 0; //index within nodes defined through the last passed label
	private boolean done = false;
	
	public ContextFunction() {
		content = new ArrayList<String>();
		properties = TranslationProperty.NONE;
		localVariables = new ArrayList<Integer>();
		parameters     = new ArrayList<Integer>();
		classTypes = null;
	}
	
	public ArrayList<Integer> getLocalVariables() {
		return localVariables;
	}
	

	public int getLocalVariableSize(int addrsize) {
		return F0xUtil.calcSize(localVariables, addrsize, localVariables.size());
	}
	public int getLocalVariableOffset(int index, int addrsize) {
		return F0xUtil.calcSize(localVariables, addrsize, index);
	}
	
	public int getParameterSize(int addrsize) {
		return F0xUtil.calcSize(parameters, addrsize, parameters.size());
	}
	
	public int getParameterOffset(int index, int addrsize) {
		return F0xUtil.calcSize(parameters, addrsize, index);
	}
	
	public ArrayList<Integer> getParameters() {
		return parameters;
	}
	
	public void addLocalVariable(int s) {
		localVariables.add(s);
	}
	
	public void addParameter(int s) {
		parameters.add(s);
	}
	
	public int getProperties() {
		return properties;
	}
	
	public void addProperty(int p) {
		properties = properties | p;
	}
	
	public void removeProperty(int p) {
		properties = properties & (~p);
	}
	
	public boolean containsProperty(int p) {
		return (properties&p) == p;
	}
	
	public void setProperties(int p) {
		properties =  p;
	}

	public int getType() {
		return type;
	}
	
	public void setType(int t) {
		type = t;
	}
	
	public static String sanitizeFunctionName(String fullName) {
		return fullName.replace(";", "").replace('/', '_').replace("(", "_").replace(")", "_").replace("[", "_").replace("]", "_");
	}
	/*public String getFunctionName() {
		//return functionName;
		//System.err.println(fullName);
		return sanitizeFunctionName(fullName);
	}*/
	
	public static String hashFunctionName(String sanitized) {
		sanitized  = sanitizeFunctionName(sanitized);
		if(!F0xC.DEBUG_MODE)
			return Integer.toHexString(sanitized.substring(0, sanitized.length()/2).hashCode())+"_"+Integer.toHexString(sanitized.substring(sanitized.length()/2, sanitized.length()).hashCode());
	    return sanitized;
	}
	
	public String getSanitizedFullName() {
		return sanitizeFunctionName(fullName);
	}
	public String getFullName() {
		return fullName;
	}
	
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	public String getClassName() {
		return className;
	}

	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}
	
	public void setClassName(String className) {
		this.className = className;
	}

/*	public int getLocalVariables() {
		int l = localVariables;
		if(getType() == LOCAL)
			l++;
		l = l - parameters;
		return l;
	}
	
	public int getParameters() {
		int p = parameters;
		if(getType() == LOCAL)
			p++;
		return p;
	}*/

	public Node[] getNodes() {
		return nodes;
	}

	public void setNodes(Node[] nodes) {
		this.nodes = nodes;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}
	
	public ArrayList<String> getContent() {
		return content;
	}
	
	public void setTypes(Class<?>[] object) {
		classTypes = object;
	}
	
	public Class<?>[] getTypes() {
		return classTypes;
	}

	public void setNodeIndex(int i) {
		nodeIndex = i;
	}
	
	public int getNodeIndex() {
		return nodeIndex;
	}

}
