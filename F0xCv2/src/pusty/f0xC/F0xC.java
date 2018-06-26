package pusty.f0xC;

import java.util.ArrayList;
import java.util.HashMap;

import pusty.f0xC.lang.OverrideHandler.ExternalPropertyObject;
import pusty.f0xC.lang.Parser;
import pusty.f0xC.module.F0xEventHandler;

public class F0xC {
	
	public static boolean DEBUG_MODE = true;
	
	protected F0xEventHandler eventHandler;
	protected Parser language = null;
	protected ContextClass[] classObjects;
	protected int index = 0;
	protected boolean done = false;
	protected String lastStatus;
	
	protected HashMap<Integer, String> stringMap;
	protected ArrayList<ExternalPropertyObject> externalProperties;

	public F0xC(Parser parser) {
		this.language = parser;
		this.stringMap = new HashMap<Integer, String>();
		this.externalProperties = new ArrayList<ExternalPropertyObject>();
		this.eventHandler = new F0xEventHandler(this);
	}
	
	public F0xEventHandler getEventHandler() {
		return eventHandler;
	}
	
	public ContextClass[] getRegistedClasses() {
		return classObjects;
	}
	
	public ArrayList<ExternalPropertyObject> getExternalProperties() {
		return externalProperties;
	}
	
	public ContextClass getClass(String ref) {
		ref = ref.replace('/', '_');
		for(ContextClass c:classObjects)
			if(c.getClassName().replace('/', '_').equals(ref))
				return c;
		return null;
	}
	
	public void addStaticString(String string) {
		this.stringMap.put(string.hashCode(), string);
	}
	
	/**
	 * Register a new external property (f.e. imports or dependency files)
	 * @param externalPropertyObject the object containing the external property data
	 */
	public void addExternalProperty(ExternalPropertyObject externalPropertyObject) {
		externalProperties.add(externalPropertyObject);
	}
	
	public HashMap<Integer, String> getStaticStrings() {
		return stringMap;
	}
	
	public ContextFunction getMethod(String ref) {
		String[] cl = ref.split("\\.");
		ContextClass context = getClass(cl[0]);
		if(context!=null)
			for(ContextFunction f:context.getFunctions())
				if(f.getSanitizedFullName().equals(cl[1]))
					return f;
		return null;
	}
	
	public int getVirtualMethodIndex(String ref) {
		String[] cl = ref.split("\\.");
		ContextClass context = getClass(cl[0]);
		if(context!=null)
			for(int i=0;i<context.getVirtualTable().size();i++) {
				String func = context.getVirtualTable().get(i).split("\\.")[1];
				if(func.equals(cl[1]))
					return i;
			}
		return -1;
	}	
	
	public ContextFunction getVirtualMethod(String ref) {
		String[] cl = ref.split("\\.");
		ContextClass context = getClass(cl[0]);
		if(context!=null) {
			int inx = getVirtualMethodIndex(ref);
			return getMethod(context.getVirtualTable().get(inx));
		}
		return null;
	}	
	
	public Parser getParser() {
		return this.language;
	}
	
	public void simplify() {
		language.simplify(this);
	}
	public void set(ContextClass[] c) {
		classObjects = c;
		index = 0;
		done = false;
		overAll = new ArrayList<String>();
	}

	ArrayList<String> overAll;
	
	public void iterate() {
		ContextClass classObject = classObjects[index];
		ContextFunction context = classObjects[index].getFunctions()[classObjects[index].getIndex()];
		
		if(index == 0 && classObject.getIndex() == 0 && context.getIndex() == 0)
			overAll.addAll(language.startParsing(this));	
		if(classObject.getIndex() == 0 && context.getIndex() == 0)
			classObject.getContent().addAll(language.startClass(this, classObject));
		if(!(context.getIndex() == 0 && classObject.getClassName().equals("java/lang/Object") && (context.getSanitizedFullName().startsWith("<init>")))) {
			if(context.getIndex() == 0)
					context.getContent().addAll(language.startFunction(this, context));
	
			ArrayList<String> list = language.parseNode(this, classObject, context, context.getNodes()[context.getIndex()]);
			context.getContent().addAll(list);
			//System.out.println(list);
			
			//Done with this node
			lastStatus = context.getNodes()[context.getIndex()].toString();
			context.setIndex(context.getIndex()+1);
			//Check if done with all nodes
			if(context.getIndex() >= context.getNodes().length) {
				context.setDone(true); 
				context.getContent().addAll(language.stopFunction(this, context));
				classObject.getContent().addAll(context.getContent());
				classObject.setIndex(classObject.getIndex()+1); 
			}
		}else {
			context.setDone(true); 
			classObject.setIndex(classObject.getIndex()+1); 
		}
		if(classObject.getIndex() >= classObject.getFunctions().length) {
			classObject.setDone(true);
			classObject.getContent().addAll(language.stopClass(this, classObject));
			overAll.addAll(classObject.getContent());
			index++;
		}
		if(index >= classObjects.length) {
			done = true;
			overAll.addAll(language.stopParsing(this));
		}
	}
	public ArrayList<String> getResult() { return overAll; }
	public boolean isDone() {
		return done;
	}
	public String last() {
		return lastStatus;
	}
	
}
