package pusty.f0xC;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ContextClass {
	private String className;
	
	private String superName;
	
	private ArrayList<String> content;
	
	protected HashMap<String,String> globalVariables;
	private HashMap<String,Integer> globalVariables_index;
	private int globalVariables_size;
	protected VariableTable objectVariables; //this will contain the resulting variables
	protected VariableTable objectVariablesQueue; //this will contain the variables specific to this class before they get merged with it's parents 
	private boolean variablesMerged;
	private boolean processed;
	
	private ContextFunction[] functions = null;
	private ArrayList<String> virtualTable = null;
	private int index = 0;
	private boolean done = false;
	
	public ContextClass() {
		globalVariables = new HashMap<String,String>();
		globalVariables_index = new HashMap<String,Integer>();

		objectVariables = new VariableTable(this);
		objectVariables.registerVariable("<0_id>", "L"); //ID = address of deconstructor
		objectVariables.registerVariable("<1_ref>", "S"); //REF MUST BE SECOND ELEMENT OF EVERY OBJECT
		objectVariables.registerVariable("<2_size>", "S"); //SIZE MUST BE THIRD ELEMENT
		
		objectVariablesQueue = new VariableTable(this);
		
		content = new ArrayList<String>();
		
		globalVariables_size = 0;
		variablesMerged = false;
		processed = false;
	}
	
	public void computeIndex(int addrSize, ContextClass[] cc) {		
		if(processed) return;
		processParentVariables(cc, this, this.getSuperName(), addrSize);
		String[] globalArray = globalVariables.keySet().toArray(new String[globalVariables.size()]);
		Arrays.sort(globalArray);
		for(String key:globalArray) {
			String value = globalVariables.get(key);
			globalVariables_index.put(key, globalVariables_size);
			globalVariables_size += F0xUtil.convertedSize(value, addrSize);
		}
		objectVariables.calculate(addrSize);
		processed = true;
	//	System.out.println(this.getClassName()+": "+objectVariables_index);
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getSuperName() {
		return superName;
	}

	public void setSuperName(String superName) {
		this.superName = superName;
	}
	
	public HashMap<String,String> getGlobalVariables() {
		return globalVariables;
	}

//	public HashMap<String,String> getObjectVariables() {
//		return objectVariables;
//	}
	
	public HashMap<String,Integer> getGlobalIndexes() {
		return globalVariables_index;
	}

//	public HashMap<String,Integer> getObjectIndexes() {
//		return objectVariables_index;
//	}
	
	public int getGlobalSize() {
		return globalVariables_size;
	}

	public ContextFunction[] getFunctions() {
		return functions;
	}

	public void setFunctions(ContextFunction[] functions) {
		this.functions = functions;
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
	
	private static void processParentVariables(ContextClass[] cc, ContextClass current, String name, int addrSize) {
		ContextClass parent = null;
		if(name == null) return;
		for(int i=0;i<cc.length;i++)
			if(cc[i].getClassName().equals(name))
				parent = cc[i];
		if(parent == null) { /*System.err.println("Error@ContextClass Wasn't able to find parent class '"+name+"' variable"); */ return; }
		if(!name.equals("java/lang/Object")) {
			if(!parent.variablesMerged) {
				processParentVariables(cc, parent, parent.getSuperName(), addrSize);
				parent.computeIndex(addrSize, cc);
			}
		}
		if(!current.variablesMerged) {
			current.objectVariables.registerTable(parent.objectVariables);
			current.objectVariables.registerTable(current.objectVariablesQueue, false);
			current.globalVariables.putAll(parent.globalVariables);
			current.variablesMerged = true;
		}
	}
	
	private static void processParentFunctions(ArrayList<ContextFunction> functionsWP,ArrayList<String> functionsWP_name, ContextClass[] cc, String name) {
		ContextClass parent = null;
		if(name == null) return;
		for(int i=0;i<cc.length;i++)
			if(cc[i].getClassName().equals(name))
				parent = cc[i];
		if(parent == null) { /*System.err.println("Error@ContextClass Wasn't able to find parent class '"+name+"' class"); */ return; }
		if(!parent.getClassName().equals("java/lang/Object"))
			processParentFunctions(functionsWP,functionsWP_name, cc, parent.getSuperName());
		for(int i=0;i<parent.getFunctions().length;i++) {
			if(parent.getFunctions()[i].getFullName().startsWith("<")) continue; //ignore not overwritable functions
			if(parent.getFunctions()[i].getType() != ContextFunction.LOCAL) continue; //ignore static functions
			functionsWP.add(parent.getFunctions()[i]);
			functionsWP_name.add(parent.getFunctions()[i].getFullName());
		}
		//TODO: Add recursive interface adding because of the mean "default" keyword >:(
	}
	
	//creates a virtual function table
	public void processFunctions(ContextClass[] cc) {
		ArrayList<ContextFunction> functionsWP = new ArrayList<ContextFunction>();
		ArrayList<String> functionsWP_name = new ArrayList<String>();
		processParentFunctions(functionsWP,functionsWP_name, cc, this.getClassName());
		HashMap<String, ContextFunction> functionsMap = new HashMap<String, ContextFunction>();
		HashMap<Integer, String> indexMap = new HashMap<Integer, String>();
		int regIndex = 0;
		for(int i=0;i<functionsWP.size();i++) {
			if(!functionsMap.containsKey(functionsWP_name.get(i))) {
				regIndex++;
				indexMap.put(regIndex-1, functionsWP_name.get(i));
			}
			functionsMap.put(functionsWP_name.get(i), functionsWP.get(i));
		}
		ArrayList<String> functions = new ArrayList<String>();
		for(int i=0;i<indexMap.size();i++) {
			ContextFunction f = functionsMap.get(indexMap.get(i));
			functions.add(f.getClassName()+"."+f.getSanitizedFullName());
		}
		//TODO: ADD VIRTUAL TABLE FOR OBJECT
		virtualTable = functions;
	}
	
	public ArrayList<String> getVirtualTable() {
		return virtualTable;
	}
	
	public ArrayList<String> getContent() {
		return content;
	}
	
	public String toString() {
		return "ContextClass@[Name='"+this.getClassName()+"', GlobalSize="+this.getGlobalSize()+", ObjectSize="+this.getObjectSize()+"]";
	}
	
	
	public int getObjectSize() {
		if(!processed) System.err.println("Accessing Object Variables before being processed!");
		return objectVariables.getSize();
	}

	public void queueObjectVariable(String name, String desc) {
		objectVariablesQueue.registerVariable(name, desc);
	}
	
	public int getObjectIndex(String var) {
		if(!processed) System.err.println("Accessing Object Variables before being processed!");
		return objectVariables.getOffset(var);
	}
	
	public String getObjectDesc(String var) {
		if(!processed) System.err.println("Accessing Object Variables before being processed!");
		return objectVariables.getDesc(var);
	}
	
	public HashMap<Integer, String> getObjectVariables() {
		if(!processed) System.err.println("Accessing Object Variables before being processed!");
		return objectVariables.getNameTable();
	}
	
	
	
	private static ContextClassDummy oDummy = null;
	public static ContextClassDummy dummy(int addrsize) {
		if(oDummy == null)
			oDummy = new ContextClassDummy(addrsize);
		return oDummy;
	}
	
	public static int dummyOffset(int addrsize) {
		return dummy(addrsize).getObjectSize();
	}
	
	public static int dummyID(int addrsize) {
		return dummy(addrsize).getObjectIndex("<0_id>");
	}
	
	public static int dummyReference(int addrsize) {
		return dummy(addrsize).getObjectIndex("<1_ref>");
	}
	
	public static int dummySize(int addrsize) {
		return dummy(addrsize).getObjectIndex("<2_size>");
	}
	
	private static ContextClassArray oArray = null;
	public static ContextClassArray array(int addrsize) {
		if(oArray == null)
			oArray = new ContextClassArray(addrsize);
		return oArray;
	}
	public static int arrayLength(int addrsize) {
		return array(addrsize).getObjectIndex("<3_length>");
	}
	
	public static int arrayOffset(int addrsize) {
		return array(addrsize).getObjectSize();
	}
	
	public static class ContextClassDummy  extends ContextClass{
		public ContextClassDummy(int addrsize) {
			super();
			setClassName("<Dummy>");
			computeIndex(addrsize, null);
		}
	}
	
	public static class ContextClassArray  extends ContextClass{
		public ContextClassArray(int addrsize) {
			super();
			this.objectVariables.registerVariable("<3_length>", "I");
			setClassName("<Array>");
			computeIndex(addrsize, null);
		}
	}
	
	//This object is used for pushing class reference constants
	public static class ContextClassReference {
		private String className;
		public ContextClassReference(String cN) {
			className = cN;
		}
		public String getClassName() {
			return className;
		}
	}


}
