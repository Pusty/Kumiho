package pusty.f0cr.bridge;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

import pusty.f0cr.ClassReader;
import pusty.f0cr.attribute.CodeAttribute;
import pusty.f0cr.attribute.RuntimeInvisibleAnnotationsAttribute;
import pusty.f0cr.data.AttributeInfo;
import pusty.f0cr.data.ElementValuePair;
import pusty.f0cr.data.ExceptionInfo;
import pusty.f0cr.data.FieldInfo;
import pusty.f0cr.data.LocalVariableInfo;
import pusty.f0cr.data.MethodInfo;
import pusty.f0cr.data.RuntimeAnnotations;
import pusty.f0cr.inst.Opcodes;
import pusty.f0cr.inst.types.*;
import pusty.f0cr.types.ClassReference;
import pusty.f0cr.types.FieldReference;
import pusty.f0cr.types.MethodReference;
import pusty.f0cr.types.NameAndTypeDescriptor;
import pusty.f0cr.types.StringReference;
import pusty.f0cr.util.AccessFlags;
import pusty.f0xC.ContextClass;
import pusty.f0xC.ContextFunction;
import pusty.f0xC.F0xC;
import pusty.f0xC.F0xUtil;
import pusty.f0xC.lang.OverrideHandler.ExternalProperty;
import pusty.f0xC.lang.OverrideHandler.ExternalPropertyObject;
import pusty.f0xC.lang.OverrideHandler.TranslationProperty;
import pusty.f0xC.nodes.*;

public class F0CrBridge {
	
	
	/**
	 * Function to parse through 'MainClass' in folder path (and sub classes)
	 * path = path to binary files
	 * className = class in format 'I/am/a/example/ClassFile'
	 */
	public static ArrayList<ContextClass> runThroughClass( F0xC fox, String path, String className) {
		HashMap<String, F0CrImportObject> importObjects = new HashMap<String, F0CrImportObject>();
		
	    HashMap<String, String> replaceMap = null;	
		if(fox.getParser().getOverrideHandler() != null)
			replaceMap = fox.getParser().getOverrideHandler().getClassOverrides();
		
		runThroughClass(importObjects,fox,path,className, null);
		
		if(replaceMap != null && replaceMap.containsKey("java/lang/String"))
			runThroughClass(importObjects,fox,path, replaceMap.get("java/lang/String"), "java/lang/String");
		
		if(replaceMap != null && replaceMap.containsKey("java/lang/Class"))
			runThroughClass(importObjects,fox,path, replaceMap.get("java/lang/Class"), "java/lang/Class");
		
		runThroughClass(importObjects,fox,path,"pusty/f0xC/imports/Internal", null);
		
		ArrayList<ContextClass> result = new ArrayList<ContextClass>();
		
		for(int i=0;i<10;i++) {
			for(Entry<String, F0CrImportObject> imports:importObjects.entrySet())
				if(imports.getValue().getPriority() == i)
					importClass(result, fox, imports.getValue().getClassReader(), imports.getValue().getClassName(), imports.getValue().getOverride());
		}
		
		return result;
	}
	
	private static void importClass(ArrayList<ContextClass> result, F0xC fox, ClassReader reader, String className, String override) {
		ContextClass cClass = new ContextClass();
		F0CrBridge bridge = new F0CrBridge(reader);
		for(FieldInfo info:reader.getFieldTable().getIndexes()) {
			if(!(info.getDescription().startsWith("L") || info.getDescription().startsWith("[")) && (info.getAccessFlags() & AccessFlags.ACC_FINAL) != 0) continue;
			if((info.getAccessFlags() & AccessFlags.ACC_STATIC)!=0) {
				cClass.getGlobalVariables().put(info.getName(), info.getDescription());
			}else {
				cClass.queueObjectVariable(info.getName(), info.getDescription());
			}
		}
		
		//set classname to the actual one or the overwritten one
		if(override == null)
			cClass.setClassName(reader.getClassName());
		else
			cClass.setClassName(override);
		
		//Register a replace map to take overwrites in consideration
	    HashMap<String, String> replaceMap;	
		if(fox.getParser().getOverrideHandler() == null)
			replaceMap = new HashMap<String, String>();
		else
			replaceMap = fox.getParser().getOverrideHandler().getClassOverrides();
		
		ClassReference superRef = (ClassReference)reader.getPool().get(reader.getSuperClassIndex());
		String superRef_name = reader.getPool().get(superRef.getIndex()).toString(); //super class
		
		superRef_name = filterMap(superRef_name, replaceMap);
		
		cClass.setSuperName(superRef_name);
	//	System.err.println(reader.getClassName());
	//	System.err.println(superRef_name);
	//	System.err.println(replaceMap);
		
		ArrayList<ContextFunction> fList = bridge.runThrough(fox, override==null?reader.getClassName():override, replaceMap);
		
		//ContextFunction for deconstructing objects
		{
			ContextFunction decon = new ContextFunction();
			decon.setFunctionName("<destroy>");
			decon.setFullName("<destroy>");
			decon.setType(ContextFunction.LOCAL);
			decon.addParameter(F0xUtil.convertedSize(F0xUtil.convertedType(Object.class), fox.getParser().getAddressSize()));
			decon.setTypes(new Class<?>[] {Object.class, null});
			decon.addProperty(TranslationProperty.NO_GARBAGE_COLLECT);
			ArrayList<Node> deconList = new ArrayList<Node>();
			deconList.add(new NodeObject(NodeObject.DESTROY, null));
			deconList.add(new NodeLabel(-1));
			decon.setNodes(deconList.toArray(new Node[deconList.size()]));
			fList.add(decon);
		}
		
		{
			ContextFunction decon = new ContextFunction();
			decon.setFunctionName("<cldestroy>");
			decon.setFullName("<cldestroy>");
			decon.setType(ContextFunction.STATIC);
			decon.setTypes(new Class<?>[] {null});
			decon.addProperty(TranslationProperty.NO_GARBAGE_COLLECT);
			ArrayList<Node> deconList = new ArrayList<Node>();
			deconList.add(new NodeLabel(0));
			deconList.add(new NodeObject(NodeObject.CLDESTROY, null));
			deconList.add(new NodeLabel(-1));
			decon.setNodes(deconList.toArray(new Node[deconList.size()]));
			fList.add(decon);
		}
		
		//set class name for each function
		for(ContextFunction f:fList) {
			if(override == null)
				f.setClassName(cClass.getClassName());
			else
				f.setClassName(override);
		}
		
		//register functions to the class
		cClass.setFunctions(fList.toArray(new ContextFunction[fList.size()]));
		//register the class to the array
		result.add(cClass);
		
		if(override == null)
			System.out.println("[#] Class '"+className+"' registered");
		else
			System.out.println("[#] Class '"+override+"' registered using '"+className+"'");
	}
	
	private static void runThroughClass(HashMap<String, F0CrImportObject> importObjects, F0xC fox, String path, String className, String override) {
		try {
			String pathName = className;
			File file = new File(path+pathName+".class");
			
			FileInputStream fis = new FileInputStream(file);		
			ClassReader reader = new ClassReader(fis);
			fis.close();
			
			
	        String classNameA = className;

	        
			F0CrImportObject iObject = new F0CrImportObject(reader, path, classNameA, override, 1);
			importObjects.put(override==null?reader.getClassName():override, iObject);

			
			for(Object o:reader.getPool().getPool()) {
				if(o != null && (o instanceof ClassReference || o instanceof StringReference)) {
					String ref_name = "java/lang/String";
					if(o instanceof ClassReference) {
						ClassReference ref = (ClassReference)o;
						ref_name = reader.getPool().get(ref.getIndex()).toString();
					}
					if(o instanceof StringReference) {
						fox.addStaticString(reader.getPool().get(((StringReference)o).getIndex()).toString());
						continue;
					}
					if(override != null && override.equals("java/lang/Object")) continue;

					//TODO: Fix path for overrides, also add .jar parsing :O
					String overrideNext = null;
					if(fox.getParser().getOverrideHandler() != null) {
						String str = fox.getParser().getOverrideHandler().getClassOverrides().get(ref_name);
						if(str != null) {
							overrideNext = ref_name;
							ref_name = str;
						}else {
							for(Entry<String, String> e:fox.getParser().getOverrideHandler().getClassOverrides().entrySet()) {
								if(e.getValue().equals(ref_name)) {
									overrideNext = e.getKey();
									break;
								}
							}
						}
					}
					
					if(overrideNext == null)
						overrideNext = ref_name;
					
					if(overrideNext.equals(override)) continue;
					if(overrideNext.equals(className)) continue;
					boolean already = false;
					for(Entry<String, F0CrImportObject> imports:importObjects.entrySet()) {
						if(imports.getValue().getClassName().equals(overrideNext) || imports.getKey().equals(overrideNext)) {
							already = true;
							break;
						}
					}
					if(already) continue;
					if(ref_name.startsWith("java")) continue;
					if(ref_name.startsWith("pusty/f0xC/lang/OverrideHandler")) continue; //TODO: make this more generic to prevent actually importing an interface
					
					if(ref_name.startsWith("[")) continue;

					if(overrideNext.equals(ref_name))
						overrideNext = null;
					runThroughClass(importObjects,fox,path,ref_name, overrideNext);
				}
		}
		}catch(FileNotFoundException e) {
			System.err.println("[!] Failed to load class '"+className+"'");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * The reader for the main class file
	 */
	protected ClassReader classReader;
	
	public F0CrBridge(ClassReader classReader) {
		this.classReader = classReader;
	}
	
	
	public static String filterMap(String in, HashMap<String, String> replaceMap) {
		String out = new String(in);
		for(Entry<String, String> e:replaceMap.entrySet()) {
			if(out.contains(e.getValue().split("#")[0])) {
				out = out.replace(e.getValue().split("#")[0], e.getKey());
				break;
			}
		}
		return out;
	}
	
	public ArrayList<ContextFunction> runThrough(F0xC fox, String overrideName, HashMap<String, String> replaceMap) {
		ArrayList<ContextFunction> fList = new ArrayList<ContextFunction>();
		
		for(MethodInfo mi:classReader.getMethodTable().getIndexes()) {
			CodeAttribute code = mi.getCode();
			/*if(!AccessFlags.isStatic(mi.getAccessFlags()) && code == null) {
				if(!(AccessFlags.isAbstract(classReader.getAccessFlags()) || AccessFlags.isInterface(classReader.getAccessFlags())))
					System.err.println("Error registering (native?) non-static function '"+mi.getName()+"' in '"+overrideName+"'");
				continue;
			}*/
			
			ContextFunction context = new ContextFunction();
			if(mi.getName().contains("main")) { //TODO: Mark for debug print out
			   // code.getInst().printOut("");
			    if(code.getExceptionTable() != null) {
			    	for(ExceptionInfo eI:code.getExceptionTable().getIndexes()) { 
			    		System.err.println("ExceptionTable: "+eI.getStart()+"-"+eI.getEnd()+" -> "+eI.getHandle()+" -> "+classReader.getPool().get(eI.getCatchType()));
			    		System.err.println("Note that catching isn't implemented yet"); //TODO: Implement Error Catching
			    	}
			    }
			}
			if(AccessFlags.isStatic(mi.getAccessFlags()))
				context.setType(ContextFunction.STATIC);
			else
				context.setType(ContextFunction.LOCAL);
			
			
			context.setFunctionName(mi.getName());
			String filteredDesc = mi.getDescriptor();
			filteredDesc = filterMap(filteredDesc, replaceMap);
			context.setFullName(mi.getName()+filteredDesc);
			
			Class<?>[] cl = F0xUtil.convertFunctionDescriptor(mi.getDescriptor());
			context.setTypes(cl);
			
			ArrayList<Node> nodeList = new ArrayList<Node>();
			

			if(!AccessFlags.isStatic(mi.getAccessFlags()))
				context.addParameter(F0xUtil.convertedSize(F0xUtil.convertedType(Object.class), fox.getParser().getAddressSize()));

			for(int i=0;i<cl.length-1;i++)
				context.addParameter(F0xUtil.convertedSize(F0xUtil.convertedType(cl[i]), fox.getParser().getAddressSize()));
			//SPECIAL ATTRIBUTES FOR FUNCTIONS! :O
			for(AttributeInfo info:mi.getInfo().getIndexes()) {
				if(info.getAttribute().equals("RuntimeInvisibleAnnotations")) {
					RuntimeInvisibleAnnotationsAttribute riaa = (RuntimeInvisibleAnnotationsAttribute)info.getInfo();
					for(RuntimeAnnotations ra:riaa.getAttributeTable().getIndexes()) {
						String annotationName = classReader.getPool().get(ra.getTypeIndex()).toString();
						//check for translation properties such as calling convention or garbage collection modes
						if(annotationName.contains("TranslationProperty")) {
							for(ElementValuePair pair:ra.getElementValuePairs()) {
								String entryName = classReader.getPool().get(pair.getElementNameIndex()).toString();
								if(entryName.equals("property")) {
									int value = Integer.parseInt(classReader.getPool().get(pair.getValue().getConstValueIndex()).toString());
									context.addProperty(value);
								}
							}
						}
						//check for external properties such as requiring external libraries or files
						if(annotationName.contains("ExternalProperty")) {
							int property = ExternalProperty.NONE;
							String parent = "";
							String key = "";
							for(ElementValuePair pair:ra.getElementValuePairs()) {
								String entryName = classReader.getPool().get(pair.getElementNameIndex()).toString();
								if(entryName.equals("property"))
									property = Integer.parseInt(classReader.getPool().get(pair.getValue().getConstValueIndex()).toString());
								if(entryName.equals("parent"))
									parent = classReader.getPool().get(pair.getValue().getConstValueIndex()).toString();
								if(entryName.equals("key"))
									key = classReader.getPool().get(pair.getValue().getConstValueIndex()).toString();
							}
							fox.addExternalProperty(new ExternalPropertyObject(property,parent,key, mi.getName()));
						}
						
					}
				}
			}
			
			boolean custom = false;
			if(fox.getParser().getOverrideHandler() != null) {
				Method m = fox.getParser().getOverrideHandler().getMethodOverrides().get(overrideName+"."+mi.getName());
				if(m != null) {
				//	System.out.println("[#] Custom Method '"+(overrideName+"."+mi.getName())+"' registered");
					nodeList.add(new NodeCustom(m));
					custom = true;
				}
			}
			
			//register native functions
			if(code == null) { 
				if(!(AccessFlags.isAbstract(classReader.getAccessFlags()) || AccessFlags.isInterface(classReader.getAccessFlags()))) {
					context.addProperty(TranslationProperty.NATIVE);
					context.addProperty(TranslationProperty.NO_GARBAGE_COLLECT);
					nodeList.add(new NodeLabel(-1));
				}else {
					context.addProperty(TranslationProperty.NO_GARBAGE_COLLECT);
					context.addProperty(TranslationProperty.NO_FRAME);
					nodeList.add(new NodeLabel(-1));
				}
				context.setNodes(nodeList.toArray(new Node[nodeList.size()]));
				fList.add(context);
				continue;
			}
			
			LocalVariableInfo[] data = code.getLocalVariableTable().getTable();

			for(int i=context.getParameters().size();i<data.length;i++)
				context.addLocalVariable(F0xUtil.convertedSize(data[i].getDesc(), fox.getParser().getAddressSize()));
			
		    for(int i=data.length;i<code.getMaxLocals();i++)
				context.addLocalVariable(F0xUtil.convertedSize("L", fox.getParser().getAddressSize()));		 //TODO: make this more dynamic
			
			Integer[] array = new Integer[1];
			array[0] = 0;
			
			if(!custom) {
				//Normal execution
				array = code.getInst().getInstructionMap().keySet().toArray(new Integer[code.getInst().getInstructionMap().size()]);
				Arrays.sort(array);
				for(Integer key:array) {				
					//Register exception handler
				    /*if(code.getExceptionTable() != null) {
				    	for(ExceptionInfo eI:code.getExceptionTable().getIndexes()) { 
				    	//TODO: Exception Handler!	
				    	}
				    }*/
					
					Instruction value = code.getInst().getInstructionMap().get(key);
					ArrayList<Node> list = convertInst(fox, key, value, context, replaceMap);
					
					
					//TODO: Apperently the same Variable index can be given twice. This is critical for a (Not Object) to (Object) conversion because frees will be called on the not Address one
					//if(mi.getName().contains("main"))
					//	code.getLocalVariableTable().printOut("");
//					nodeList.add(new NodeStack(Node.INT32, NodeStack.PUSH_0));
					for(LocalVariableInfo info:code.getLocalVariableTable().getTable()) {
						int convSize = F0xUtil.convertedType(F0xUtil.convertDescriptor(info.getDesc().charAt(0)));
						//if(mi.getName().contains("main"))
						//	System.out.println(info.getName()+"->"+o2is(context, info.getIndex()));
						if(key == info.getStart()+info.getLength() && info.getIndex() >= context.getParameters().size()) {
							if(convSize == Node.ADDR) {
								nodeList.add(new NodeVarFix(Node.ADDR, NodeVarFix.LOCAL, NodeVarFix.LOAD, o2is(context, info.getIndex())));	
								nodeList.add(new NodeObject(NodeObject.FREE, null));						
							}
							nodeList.add(new NodeConst(convSize, 0));
							nodeList.add(new NodeVarFix(convSize, NodeVarFix.LOCAL, NodeVarFix.SAVE, o2is(context, info.getIndex())));	
						}
					}
					//nodeList.add(new NodeStack(Node.INT32, NodeStack.POP_0));
					nodeList.addAll(list);
				}
			}
					
			nodeList.add(new NodeLabel(-1));
			nodeList.add(new NodeStack(Node.INT32, NodeStack.PUSH_0));
			
			for(LocalVariableInfo info:code.getLocalVariableTable().getTable()) {
				if(F0xUtil.convertedType(F0xUtil.convertDescriptor(info.getDesc().charAt(0))) != Node.ADDR)
					continue;
				if(array[array.length-1] < info.getStart()+info.getLength() && F0xUtil.calcIndex(context.getParameters(), context.getLocalVariables(), fox.getParser().getAddressSize(), info.getIndex()) >= context.getParameters().size()) {
					nodeList.add(new NodeVarFix(Node.ADDR, NodeVarFix.LOCAL, NodeVarFix.LOAD, o2is(context, info.getIndex())));	
					nodeList.add(new NodeObject(NodeObject.FREE, null));
				}
			}
			
			for(int i=code.getLocalVariableTable().getTable().length;i<code.getMaxLocals();i++) {
				//IS THIS ACTUALLY AN ADDRESS?
				nodeList.add(new NodeVarFix(Node.ADDR, NodeVarFix.LOCAL, NodeVarFix.LOAD, Integer.toString(i)));	
				nodeList.add(new NodeObject(NodeObject.FREE, null));
			}
			
			nodeList.add(new NodeStack(Node.INT32, NodeStack.POP_0));
			//code.getLocalVariableTable().printOut("");
			//System.out.println(overrideName+"_"+mi.getName()+"_"+mi.getDescriptor()+":");
			//code.getInst().printOut("   ");
			context.setNodes(nodeList.toArray(new Node[nodeList.size()]));
			fList.add(context);
		}
		return fList;
	}
	
	//offset to index string, used to convert java offsets to sizeless offsets
	private static String o2is(ContextFunction f, int offset) {
		int a = F0xUtil.calcIndex(f.getParameters(), f.getLocalVariables(), 4, offset);
		//if(f.getFullName().contains("main")) {
		//	System.out.println("F0xUtil@calcIndex something went wrong: "+f.getParameters()+" "+f.getLocalVariables()+" <- "+offset+"("+a+")");
		//}
		return Integer.toString(a);
	}
	
	public ArrayList<Node> convertInst(F0xC fox, int instIndex, Instruction instRaw, ContextFunction context, HashMap<String, String> replaceMap) {
		ArrayList<Node> list = new ArrayList<Node>();
		list.add(new NodeLabel(instIndex));
		if(instRaw instanceof InstConst) {
			InstConst inst = (InstConst)instRaw;
			int value = F0xUtil.convertedType(inst.getValue());
			Object obj = inst.getValue();
			if(obj != null && obj instanceof StringReference) {
				obj = inst.getConstantPool().get(((StringReference)obj).getIndex());
			}
			list.add(new NodeConst(value, obj));
			list.add(new NodeStack(value, NodeStack.PUSH_0));
		}else if(instRaw instanceof InstLocalVar) {
			InstLocalVar inst = (InstLocalVar)instRaw;
			int value = F0xUtil.convertedType(inst.getType());
			if(inst.isLoad()) {
				list.add(new NodeVarFix(value, NodeVarFix.LOCAL, NodeVarFix.LOAD, o2is(context, inst.getVariable())));	
				list.add(new NodeStack(value, NodeStack.PUSH_0));
			}
			if(inst.isStore()) {
				if(value == Node.ADDR && inst.getVariable() >= context.getParameters().size()) {
					list.add(new NodeVarFix(value, NodeVarFix.LOCAL, NodeVarFix.LOAD, o2is(context, inst.getVariable())));	
					list.add(new NodeObject(NodeObject.FREE, null));
				}
				list.add(new NodeStack(value, NodeStack.POP_0));
				
				if(value == Node.ADDR)
					list.add(new NodeObject(NodeObject.REFERENCE, null));
				
				list.add(new NodeVarFix(value, NodeVarFix.LOCAL, NodeVarFix.SAVE, o2is(context, inst.getVariable())));
			}
		}else if(instRaw instanceof InstVar) {
			InstVar inst = (InstVar)instRaw;
			FieldReference field = ((FieldReference)classReader.getPool().get(inst.getIndex()));
			NameAndTypeDescriptor natdesc = (NameAndTypeDescriptor)classReader.getPool().get(field.getNameAndType());
			ClassReference cref = (ClassReference)classReader.getPool().get(field.getClassReference());
			String crefStr = classReader.getPool().get(cref.getIndex()).toString();
			crefStr = filterMap(crefStr, replaceMap);
			String desc = classReader.getPool().get(natdesc.getEncodedTypeDescriptor()).toString();
			String identifier = crefStr+"."+classReader.getPool().get(natdesc.getIdentifier()).toString();
			int convert = F0xUtil.convertedType(F0xUtil.convertDescriptor(desc.charAt(0)));
			if(inst.isLoad()) {
				if(inst.isStatic())
					list.add(new NodeVarFix(convert, NodeVarFix.GLOBAL, NodeVarFix.LOAD, identifier));	
				else {
					list.add(new NodeStack(Node.ADDR, NodeStack.POP_1));
					list.add(new NodeVarFix(convert, NodeVarFix.OBJECT, NodeVarFix.LOAD, identifier));
				}
				list.add(new NodeStack(convert, NodeStack.PUSH_0));
			}
			if(inst.isStore()) {
				if(convert == Node.ADDR) {
					if(inst.isStatic()) {
						list.add(new NodeVarFix(convert, NodeVarFix.GLOBAL, NodeVarFix.LOAD, identifier));
						list.add(new NodeObject(NodeObject.FREE, null));
					}else{
						list.add(new NodeStack(convert, NodeStack.POP_0));
						list.add(new NodeStack(Node.ADDR, NodeStack.POP_1));
						list.add(new NodeStack(Node.ADDR, NodeStack.PUSH_1));
						list.add(new NodeStack(Node.ADDR, NodeStack.PUSH_0));
						list.add(new NodeVarFix(convert, NodeVarFix.OBJECT, NodeVarFix.LOAD, identifier));
						list.add(new NodeObject(NodeObject.FREE, null));
					}
				}	
				list.add(new NodeStack(convert, NodeStack.POP_0));
				if(convert == Node.ADDR)
					list.add(new NodeObject(NodeObject.REFERENCE, null));
				if(inst.isStatic())
					list.add(new NodeVarFix(convert, NodeVarFix.GLOBAL, NodeVarFix.SAVE, identifier));	
				else {
					list.add(new NodeStack(Node.ADDR, NodeStack.POP_1));
					list.add(new NodeVarFix(convert, NodeVarFix.OBJECT, NodeVarFix.SAVE, identifier));
				}
			}
		}else if(instRaw instanceof InstMath) {
			InstMath inst = (InstMath)instRaw;
			int size = F0xUtil.convertedType(inst.getType());
			if(inst.getOperationType() == InstMath.MATH_INC) {
				list.add(new NodeVarFix(size, NodeVarFix.LOCAL, NodeVarFix.LOAD, o2is(context, inst.getLocalVariable())));
				list.add(new NodeStack(size, NodeStack.PUSH_0));
				if(((byte)inst.getConstantValue()) < 0)
					list.add(new NodeConst(size, -((byte)inst.getConstantValue())));
				else
					list.add(new NodeConst(size, inst.getConstantValue()));
				list.add(new NodeStack(size, NodeStack.PUSH_0));
				list.add(new NodeStack(size, NodeStack.POP_1));
				list.add(new NodeStack(size, NodeStack.POP_0));
				if(((byte)inst.getConstantValue()) < 0)
					list.add(new NodeMath(size, NodeMath.SUB));
				else
					list.add(new NodeMath(size, NodeMath.ADD));
				list.add(new NodeVarFix(size, NodeVarFix.LOCAL, NodeVarFix.SAVE, o2is(context, inst.getLocalVariable())));
			}else if(inst.getOperationType() == InstMath.MATH_NEG) {
				list.add(new NodeStack(size, NodeStack.POP_0));
				list.add(new NodeMath(size, NodeMath.NEG));
				list.add(new NodeStack(size, NodeStack.PUSH_0));
			}else if(inst.getOperationType() == InstMath.MATH_ERROR) {
				System.out.println("Can't converted corrupted node");
			}else {
				if(inst.getOperationType() == InstMath.MATH_SHL || inst.getOperationType() == InstMath.MATH_SHR || inst.getOperationType() == InstMath.MATH_USHR) {
					list.add(new NodeStack(Node.INT32, NodeStack.POP_1));
					list.add(new NodeStack(size, NodeStack.POP_0));
					list.add(new NodeMath(size, convertMath(inst.getOperationType())));
					list.add(new NodeStack(size, NodeStack.PUSH_0));
				} else {
					list.add(new NodeStack(size, NodeStack.POP_1));
					list.add(new NodeStack(size, NodeStack.POP_0));
					list.add(new NodeMath(size, convertMath(inst.getOperationType())));
					list.add(new NodeStack(size, NodeStack.PUSH_0));
				}
			}
		}else if(instRaw instanceof InstConvert) {
			InstConvert inst = (InstConvert)instRaw;
			int from = F0xUtil.convertedType(inst.getTypeFrom());
			int to   = F0xUtil.convertedType(inst.getTypeTo());
			list.add(new NodeStack(from, NodeStack.POP_0));		
			if(from == Node.INT32 && to == Node.INT64)
				list.add(new NodeStack(to, NodeStack.I2L));
			else if(from == Node.INT64 && to == Node.INT32)
				list.add(new NodeStack(to, NodeStack.L2I));
			else if(from == Node.INT32 && to == Node.FLOAT)
				list.add(new NodeStack(to, NodeStack.I2F));
			else if(from == Node.FLOAT && to == Node.INT32)
				list.add(new NodeStack(to, NodeStack.F2I));
			else if(from == Node.INT64 && to == Node.DOUBLE)
				list.add(new NodeStack(to, NodeStack.L2D));
			else if(from == Node.DOUBLE && to == Node.INT64)
				list.add(new NodeStack(to, NodeStack.D2L));
			else if(from == Node.FLOAT && to == Node.DOUBLE)
				list.add(new NodeStack(to, NodeStack.F2D));
			else if(from == Node.DOUBLE && to == Node.FLOAT)
				list.add(new NodeStack(to, NodeStack.D2F));
			else if(from == Node.INT32 && to == Node.DOUBLE) {
				list.add(new NodeStack(to, NodeStack.I2F));
				list.add(new NodeStack(to, NodeStack.F2D));
			}else if(from == Node.DOUBLE && to == Node.INT32) {
				list.add(new NodeStack(to, NodeStack.D2F));
				list.add(new NodeStack(to, NodeStack.F2I));
			}else if(from == Node.INT64 && to == Node.FLOAT) {
				list.add(new NodeStack(to, NodeStack.L2I));
				list.add(new NodeStack(to, NodeStack.I2F));
			}else if(from == Node.FLOAT && to == Node.INT64) {
				list.add(new NodeStack(to, NodeStack.F2I));
				list.add(new NodeStack(to, NodeStack.I2L));
			}		
			list.add(new NodeStack(to, NodeStack.PUSH_0));
		}else if(instRaw instanceof InstBranch) {
			InstBranch inst = (InstBranch)instRaw;
			int instID = inst.getInstruction()&0xFF;
        	int branchPosition = inst.getBranchInstructionPos();
			if(inst.getTypeOfBranch() == InstBranch.BRANCH_INVOKE) {
				int identifierID = inst.getPoolIndex();
				Class<?>[] args = F0xUtil.convertFunctionDescriptor(classReader.getPool().get(((NameAndTypeDescriptor)classReader.getPool().get(((MethodReference)classReader.getPool().get(identifierID)).getNameAndType())).getEncodedTypeDescriptor()).toString());
				int amountOfArguments =	F0xUtil.calcSizeDescriptor(args, fox.getParser().getAddressSize());
				String ClassPath = classReader.getPool().get(((ClassReference)classReader.getPool().get(((MethodReference)classReader.getPool().get(identifierID)).getClassReference())).getIndex()).toString();
				ClassPath = filterMap(ClassPath, replaceMap);
				String Name = (String) classReader.getPool().get(((NameAndTypeDescriptor)(classReader.getPool().get(((MethodReference)classReader.getPool().get(identifierID)).getNameAndType()))).getIdentifier());
				String Ident = (String) classReader.getPool().get(((NameAndTypeDescriptor)(classReader.getPool().get(((MethodReference)classReader.getPool().get(identifierID)).getNameAndType()))).getEncodedTypeDescriptor());
				Ident = filterMap(Ident, replaceMap);
				Name = Name+";"+Ident;
				list.add(new NodeInvoke(amountOfArguments, convertInvoke(instID), ClassPath+"."+Name, args[args.length-1]));
			}else if(inst.getTypeOfBranch() == InstBranch.BRANCH_CC) {			
				list.add(new NodeConst(Node.INT32, 0));
				list.add(new NodeStack(Node.INT32, NodeStack.PUSH_0));
				list.add(new NodeStack(Node.INT32, NodeStack.POP_1));
				list.add(new NodeStack(Node.INT32, NodeStack.POP_0));
	        	list.add(new NodeCompare(Node.INT32, NodeCompare.COMPARE_EQUAL));
				switch(inst.getInstruction()&0xFF) {
					case Opcodes.IFEQ:
			        	list.add(new NodeJump(Node.UNKNOWN, NodeJump.JUMP_EQUALS, branchPosition));
			        	break;
			        case Opcodes.IFNE:
			        	list.add(new NodeJump(Node.UNKNOWN, NodeJump.JUMP_NOTEQUALS, branchPosition));
			        	break;
			        case Opcodes.IFLT:
			        	list.add(new NodeJump(Node.UNKNOWN, NodeJump.JUMP_LESSTHAN, branchPosition));
			        	break;
			        case Opcodes.IFGE:
			        	list.add(new NodeJump(Node.UNKNOWN, NodeJump.JUMP_GREATEREQUALS, branchPosition));
			        	break;
			        case Opcodes.IFGT:
			        	list.add(new NodeJump(Node.UNKNOWN, NodeJump.JUMP_GREATERTHAN, branchPosition));
			        	break;
			        case Opcodes.IFLE:
			        	list.add(new NodeJump(Node.UNKNOWN, NodeJump.JUMP_LESSEQUALS, branchPosition));
			        	break;
				}
			}else if(inst.getTypeOfBranch() == InstBranch.BRANCH_ICMPCC) {
				list.add(new NodeStack(Node.INT32, NodeStack.POP_1));
				list.add(new NodeStack(Node.INT32, NodeStack.POP_0));
	        	list.add(new NodeCompare(Node.INT32, NodeCompare.COMPARE_EQUAL));
				switch(inst.getInstruction()&0xFF) {
			        case Opcodes.IF_ICMPEQ:
			        	list.add(new NodeJump(Node.UNKNOWN, NodeJump.JUMP_EQUALS, branchPosition));
			        	break;
			        case Opcodes.IF_ICMPNE:
			        	list.add(new NodeJump(Node.UNKNOWN, NodeJump.JUMP_NOTEQUALS, branchPosition));
			        	break;
			        case Opcodes.IF_ICMPLT:
			        	list.add(new NodeJump(Node.UNKNOWN, NodeJump.JUMP_LESSTHAN, branchPosition));
			        	break;
			        case Opcodes.IF_ICMPGE:
			        	list.add(new NodeJump(Node.UNKNOWN, NodeJump.JUMP_GREATEREQUALS, branchPosition));
			        	break;
			        case Opcodes.IF_ICMPGT:
			        	list.add(new NodeJump(Node.UNKNOWN, NodeJump.JUMP_GREATERTHAN, branchPosition));
			        	break;
			        case Opcodes.IF_ICMPLE:
			        	list.add(new NodeJump(Node.UNKNOWN, NodeJump.JUMP_LESSEQUALS, branchPosition));
			        	break;
				}
			}else if(inst.getTypeOfBranch() == InstBranch.BRANCH_ACMPCC) {
				list.add(new NodeStack(Node.ADDR, NodeStack.POP_1));
				list.add(new NodeStack(Node.ADDR, NodeStack.POP_0));
	        	list.add(new NodeCompare(Node.ADDR, NodeCompare.COMPARE_SAMEREFERENCE));
				switch(inst.getInstruction()&0xFF) {
			        case Opcodes.IF_ACMPEQ:
			        	list.add(new NodeJump(Node.UNKNOWN, NodeJump.JUMP_EQUALS, branchPosition));
			        	break;
			        case Opcodes.IF_ACMPNE:
			        	list.add(new NodeJump(Node.UNKNOWN, NodeJump.JUMP_NOTEQUALS, branchPosition));
			        	break;
				}
			}else if(inst.getTypeOfBranch() == InstBranch.BRANCH_NULL) {
				list.add(new NodeStack(Node.ADDR, NodeStack.POP_0));
	        	list.add(new NodeCompare(Node.ADDR, NodeCompare.COMPARE_NULL));
				switch(inst.getInstruction()&0xFF) {
			        case Opcodes.IFNULL:
			        	list.add(new NodeJump(Node.UNKNOWN, NodeJump.JUMP_EQUALS, branchPosition));
			        	break;
			        case Opcodes.IFNONNULL: 
			        	list.add(new NodeJump(Node.UNKNOWN, NodeJump.JUMP_NOTEQUALS, branchPosition));
			        	break;
				}
			}else if(inst.getTypeOfBranch() == InstBranch.BRANCH_GOTO) {
				list.add(new NodeJump(Node.UNKNOWN, NodeJump.JUMP_ALWAYS, branchPosition));
			}else if(inst.getTypeOfBranch() == InstBranch.BRANCH_RETURN) {
				switch(inst.getInstruction()&0xFF) {
					case Opcodes.RETURN:
						break;
			        case Opcodes.ARETURN:
			        	list.add(new NodeStack(Node.ADDR, NodeStack.POP_0));
			        	list.add(new NodeObject(NodeObject.REFERENCE, null)); //don't delete object to return
			        	break;
			        case Opcodes.IRETURN:
			        	list.add(new NodeStack(Node.INT32, NodeStack.POP_0));
			        	break;
			        case Opcodes.LRETURN:
			        	list.add(new NodeStack(Node.INT64, NodeStack.POP_0));
			        	break;
			        case Opcodes.FRETURN:
			        	list.add(new NodeStack(Node.FLOAT, NodeStack.POP_0));
			        	break;
			        case Opcodes.DRETURN:
			        	list.add(new NodeStack(Node.DOUBLE, NodeStack.POP_0));
			        	break;
				}
				list.add(new NodeJump(Node.UNKNOWN, NodeJump.JUMP_RETURN, 0));
			}else {
				System.out.println("Can't handle branch type "+inst.getTypeOfBranch());
			}
		}else if(instRaw instanceof InstStack) {
			InstStack inst = (InstStack)instRaw;
			switch(inst.getInstruction()&0xFF) {
			case Opcodes.POP:
				list.add(new NodeStack(Node.INT32, NodeStack.POP_0));
				break;
			case Opcodes.POP2:
				list.add(new NodeStack(Node.INT32, NodeStack.POP_0));
				list.add(new NodeStack(Node.INT32, NodeStack.POP_3));
				break;
			case Opcodes.DUP:
				list.add(new NodeStack(Node.INT32, NodeStack.POP_0));
				list.add(new NodeStack(Node.INT32, NodeStack.PUSH_0));
				list.add(new NodeStack(Node.INT32, NodeStack.PUSH_0));
				break;
			case Opcodes.DUP_X1:
				list.add(new NodeStack(Node.INT32, NodeStack.POP_0));
				list.add(new NodeStack(Node.INT32, NodeStack.POP_1));
				list.add(new NodeStack(Node.INT32, NodeStack.PUSH_0));
				list.add(new NodeStack(Node.INT32, NodeStack.PUSH_1));
				list.add(new NodeStack(Node.INT32, NodeStack.PUSH_0));
				break;
			case Opcodes.DUP_X2:
				list.add(new NodeStack(Node.INT32, NodeStack.POP_2));
				list.add(new NodeStack(Node.INT32, NodeStack.POP_1));
				list.add(new NodeStack(Node.INT32, NodeStack.POP_0));
				list.add(new NodeStack(Node.INT32, NodeStack.PUSH_2));
				list.add(new NodeStack(Node.INT32, NodeStack.PUSH_1));
				list.add(new NodeStack(Node.INT32, NodeStack.PUSH_0));
				list.add(new NodeStack(Node.INT32, NodeStack.PUSH_2));
				break;
			case Opcodes.DUP2:
				list.add(new NodeStack(Node.INT32, NodeStack.POP_0));
				list.add(new NodeStack(Node.INT32, NodeStack.POP_3));
				list.add(new NodeStack(Node.INT32, NodeStack.PUSH_3));
				list.add(new NodeStack(Node.INT32, NodeStack.PUSH_0));
				list.add(new NodeStack(Node.INT32, NodeStack.PUSH_3));
				list.add(new NodeStack(Node.INT32, NodeStack.PUSH_0));
				break;
			case Opcodes.DUP2_X1:
				list.add(new NodeStack(Node.INT32, NodeStack.POP_1));
				list.add(new NodeStack(Node.INT32, NodeStack.POP_0));
				list.add(new NodeStack(Node.INT32, NodeStack.POP_3));
				list.add(new NodeStack(Node.INT32, NodeStack.PUSH_3));
				list.add(new NodeStack(Node.INT32, NodeStack.PUSH_0));
				list.add(new NodeStack(Node.INT32, NodeStack.PUSH_1));
				list.add(new NodeStack(Node.INT32, NodeStack.PUSH_3));
				list.add(new NodeStack(Node.INT32, NodeStack.PUSH_0));
				break;
			case Opcodes.DUP2_X2:
				list.add(new NodeStack(Node.INT32, NodeStack.POP_1));
				list.add(new NodeStack(Node.INT32, NodeStack.POP_2));
				list.add(new NodeStack(Node.INT32, NodeStack.POP_0));
				list.add(new NodeStack(Node.INT32, NodeStack.POP_3));
				list.add(new NodeStack(Node.INT32, NodeStack.PUSH_3));
				list.add(new NodeStack(Node.INT32, NodeStack.PUSH_0));
				list.add(new NodeStack(Node.INT32, NodeStack.PUSH_2));
				list.add(new NodeStack(Node.INT32, NodeStack.PUSH_1));
				list.add(new NodeStack(Node.INT32, NodeStack.PUSH_3));
				list.add(new NodeStack(Node.INT32, NodeStack.PUSH_0));
				break;
			case Opcodes.SWAP:
				list.add(new NodeStack(Node.INT32, NodeStack.POP_0));
				list.add(new NodeStack(Node.INT32, NodeStack.POP_1));
				list.add(new NodeStack(Node.INT32, NodeStack.PUSH_0));
				list.add(new NodeStack(Node.INT32, NodeStack.PUSH_1));
				break;
			case Opcodes.ATHROW:
				//TODO: ATHROW
				list.add(new NodeStack(Node.INT32, NodeStack.THROW));
				break;
			default:
				System.out.println("Can't handle stack instruction "+inst.getName());
		}
		}else if(instRaw instanceof InstAVar) {
			InstAVar inst = (InstAVar)instRaw;
			int convert = F0xUtil.convertedType(inst.getType());
			if(inst.isLoad()) {
				list.add(new NodeStack(Node.INT32, NodeStack.POP_2));
				list.add(new NodeStack(Node.ADDR, NodeStack.POP_1));
				list.add(new NodeVarFix(convert, NodeVarFix.ARRAY, NodeVarFix.LOAD, null));
				list.add(new NodeStack(convert, NodeStack.PUSH_0));
			}
			if(inst.isStore()) {
				if(convert == Node.ADDR) {
						list.add(new NodeStack(convert, NodeStack.POP_0));
						list.add(new NodeStack(Node.INT32, NodeStack.POP_2));
						list.add(new NodeStack(Node.ADDR, NodeStack.POP_1));
						list.add(new NodeStack(Node.ADDR, NodeStack.PUSH_1));
						list.add(new NodeStack(Node.ADDR, NodeStack.PUSH_2));
						list.add(new NodeStack(Node.ADDR, NodeStack.PUSH_0));
						list.add(new NodeVarFix(convert, NodeVarFix.ARRAY, NodeVarFix.LOAD, null));
						list.add(new NodeObject(NodeObject.FREE, null));
				}
				list.add(new NodeStack(convert, NodeStack.POP_0));
				if(convert == Node.ADDR)
					list.add(new NodeObject(NodeObject.REFERENCE, null));
				list.add(new NodeStack(Node.INT32, NodeStack.POP_2));
				list.add(new NodeStack(Node.ADDR, NodeStack.POP_1));
				list.add(new NodeVarFix(convert, NodeVarFix.ARRAY, NodeVarFix.SAVE, null));
			}
		}else if(instRaw instanceof InstCompare) {
			InstCompare inst = (InstCompare)instRaw;
			switch(inst.getInstruction()&0xFF) {
				case Opcodes.FCMPL:
				case Opcodes.FCMPG:
					list.add(new NodeStack(Node.FLOAT, NodeStack.POP_1));
					list.add(new NodeStack(Node.FLOAT, NodeStack.POP_0));
		        	list.add(new NodeCompare(Node.FLOAT, NodeCompare.COMPARE_EQUAL));
		        	list.add(new NodeStack(Node.INT32, NodeStack.PUSH_0));
					break;
				case Opcodes.DCMPL:
				case Opcodes.DCMPG:
					list.add(new NodeStack(Node.DOUBLE, NodeStack.POP_1));
					list.add(new NodeStack(Node.DOUBLE, NodeStack.POP_0));
		        	list.add(new NodeCompare(Node.DOUBLE, NodeCompare.COMPARE_EQUAL));
		        	list.add(new NodeStack(Node.INT32, NodeStack.PUSH_0));
					break;
				case Opcodes.LCMP:
					list.add(new NodeStack(Node.INT64, NodeStack.POP_1));
					list.add(new NodeStack(Node.INT64, NodeStack.POP_0));
		        	list.add(new NodeCompare(Node.INT64, NodeCompare.COMPARE_EQUAL));
		        	list.add(new NodeStack(Node.INT32, NodeStack.PUSH_0));
					break;
				case Opcodes.INSTANCEOF:
					String className = filterMap(inst.getConstantPool().get(inst.getInstanceofInfo().getIndex()).toString(), replaceMap);
					list.add(new NodeConst(Node.ADDR, new ContextClass.ContextClassReference(className)));
					list.add(new NodeStack(Node.ADDR, NodeStack.PUSH_0));
					list.add(new NodeStack(Node.ADDR, NodeStack.POP_0));
					list.add(new NodeStack(Node.ADDR, NodeStack.POP_1));
					list.add(new NodeCompare(Node.ADDR, NodeCompare.COMPARE_INSTANCEOF));
					list.add(new NodeStack(Node.INT32, NodeStack.PUSH_0));
					break;
			}
		}else if(instRaw.getName().equals("NEW")) {
			int poolIndex = ((((instRaw.getData()[0]&0xFF) << 8) + (instRaw.getData()[1]&0xFF)));
			String cN = (instRaw.getConstantPool().get(((ClassReference)instRaw.getConstantPool().get(poolIndex)).getIndex())).toString();
			cN = filterMap(cN, replaceMap).replace('/', '_');
			list.add(new NodeObject(NodeObject.NEW_OBJECT, cN));
			list.add(new NodeStack(Node.INT32, NodeStack.PUSH_0));
		}else if(instRaw.getName().equals("NEWARRAY")) {
			int type = ((int)instRaw.getData()[0])&0xFF;
			list.add(new NodeStack(Node.INT32, NodeStack.POP_2));
			list.add(new NodeObject(NodeObject.NEW_ARRAY, Integer.toString(type)));
			list.add(new NodeStack(Node.INT32, NodeStack.PUSH_0));
		}else if(instRaw.getName().equals("ANEWARRAY")) {
			list.add(new NodeStack(Node.INT32, NodeStack.POP_2));
			list.add(new NodeObject(NodeObject.NEW_ARRAY, Integer.toString(F0xUtil.ARRAY_TYPE_VOID)));
			list.add(new NodeStack(Node.INT32, NodeStack.PUSH_0));
		}else if(instRaw.getName().equals("MULTIANEWARRAY")) {
			System.err.println("MULTIANEWARRAY isn't currently implemented. Init Arrays manual instead.");
		}else if(instRaw.getName().equals("ARRAYLENGTH")) {
			list.add(new NodeStack(Node.INT32, NodeStack.POP_1));
			list.add(new NodeObject(NodeObject.ARRAYLENGTH, null));
			list.add(new NodeStack(Node.INT32, NodeStack.PUSH_0));
		}else if(instRaw.getName().equals("CHECKCAST")) {
			//TODO: CHECKCAST CHECKS IF VALUE INSTANCEOF CAST BUT DOESN'T CHANGE STACK
		}else {
			System.out.println("Can't convert "+instRaw.getClass()+ " - "+instRaw.getName());
		}
		return list;
	}
	
	
	public static int convertInvoke(int crInvokeOp) {
		switch(crInvokeOp) {
		case Opcodes.INVOKEDYNAMIC: return NodeInvoke.INVOKE_DYNAMIC;
		case Opcodes.INVOKEINTERFACE: return NodeInvoke.INVOKE_INTERFACE;
		case Opcodes.INVOKESPECIAL: return NodeInvoke.INVOKE_SPECIAL;
		case Opcodes.INVOKESTATIC: return NodeInvoke.INVOKE_STATIC;
		case Opcodes.INVOKEVIRTUAL: return NodeInvoke.INVOKE_VIRTUAL;
			default: return -1;
		}
	}
	
	public static int convertMath(int crMathOp) {
		switch(crMathOp) {
		case InstMath.MATH_ADD: return NodeMath.ADD;
		case InstMath.MATH_SUB: return NodeMath.SUB;
		case InstMath.MATH_MUL: return NodeMath.MUL;
		case InstMath.MATH_DIV: return NodeMath.DIV;
		case InstMath.MATH_REM: return NodeMath.REM;
		case InstMath.MATH_NEG: return NodeMath.NEG;
		case InstMath.MATH_SHL: return NodeMath.SHL;
		case InstMath.MATH_SHR: return NodeMath.SHR;
		case InstMath.MATH_USHR: return NodeMath.USHR;
		case InstMath.MATH_AND: return NodeMath.AND;
		case InstMath.MATH_OR: return NodeMath.OR;
		case InstMath.MATH_XOR: return NodeMath.XOR;
			default: return -1;
		}
	}

	
	public ClassReader getClassReader() {
		return classReader;
	}
	
    public static class F0CrImportObject {
    	private String path;
    	private String className;
    	private String override;
    	private int priority;
    	private ClassReader reader;
    	
    	public F0CrImportObject(ClassReader reader, String path, String className, String override, int priority) {
    		this.path = path;
    		this.className = className;
    		this.override = override;
    		this.priority = priority;
    		this.reader = reader;
    	}
    	
		public String getPath() {
			return path;
		}
		public void setPath(String path) {
			this.path = path;
		}
		public String getClassName() {
			return className;
		}
		public void setClassName(String className) {
			this.className = className;
		}
		public String getOverride() {
			return override;
		}
		public void setOverride(String override) {
			this.override = override;
		}
		public int getPriority() {
			return priority;
		}
		public void setPriority(int priority) {
			this.priority = priority;
		}
		public ClassReader getClassReader() {
			return reader;
		}
		public void setClassReader(ClassReader reader) {
			this.reader = reader;
		}
    	
    }
}
