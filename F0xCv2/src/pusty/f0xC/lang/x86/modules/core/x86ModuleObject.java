package pusty.f0xC.lang.x86.modules.core;

import java.util.ArrayList;
import java.util.Map.Entry;

import pusty.f0xC.ContextClass;
import pusty.f0xC.ContextFunction;
import pusty.f0xC.F0xC;
import pusty.f0xC.F0xStr;
import pusty.f0xC.F0xUtil;
import pusty.f0xC.lang.OverrideHandler.TranslationProperty;
import pusty.f0xC.lang.x86.Parser86;
import pusty.f0xC.lang.x86.modules.x86ModuleDefault;
import pusty.f0xC.module.F0xEventSubscription;
import pusty.f0xC.module.F0xModule;
import pusty.f0xC.module.F0xEvent.F0xEventPriority;
import pusty.f0xC.module.F0xEvent.F0xEventType;
import pusty.f0xC.module.event.F0xEventNodeCompareParsing;
import pusty.f0xC.module.event.F0xEventNodeConstParsing;
import pusty.f0xC.module.event.F0xEventNodeInvokeParsing;
import pusty.f0xC.module.event.F0xEventNodeObjectParsing;
import pusty.f0xC.module.event.F0xEventNodeParsing;
import pusty.f0xC.module.event.F0xEventNodeStackParsing;
import pusty.f0xC.module.event.F0xEventNodeVarFixParsing;
import pusty.f0xC.module.event.F0xEventParsing;
import pusty.f0xC.nodes.Node;
import pusty.f0xC.nodes.NodeInvoke;
import pusty.f0xC.nodes.NodeObject;

public class x86ModuleObject extends F0xModule {

	@Override
	public String uniqueIdentifier() {
		return "x86Object";
	}
	
	@F0xEventSubscription(event=F0xEventType.Code)
	public void objectInit(F0xEventParsing event) {
		event.getCurrentList().add(x86ModuleDefault.formatFunction("java_lang_Object_$init$__V")+":");
		event.getCurrentList().add("ret");
	}
	
	@F0xEventSubscription(event=F0xEventType.Code)
	public void objectGetClass(F0xEventParsing event) {
		event.getCurrentList().add(x86ModuleDefault.formatFunction("java_lang_Object_getClass__Ljava_lang_Class")+":");
		event.getCurrentList().add("jmp "+x86ModuleDefault.formatFunction("java_lang_Object_getClass_Ljava_lang_Object_Ljava_lang_Class"));
	}
	
	@F0xEventSubscription(event=F0xEventType.Code)
	public void aarrayDestroy(F0xEventParsing event) {
		event.getCurrentList().add(x86ModuleDefault.formatFunction("aarray_<destroy>")+":");
		event.getCurrentList().add("mov reg1, [regS+addrsize]");
		event.getCurrentList().add("mov reg2, [reg1+"+ContextClass.arrayLength(event.getF0xC().getParser().getAddressSize())+"]");
		event.getCurrentList().add("lea reg0, [reg1+"+ContextClass.arrayOffset(event.getF0xC().getParser().getAddressSize())+"]");
		event.getCurrentList().add("jmp function_aarray_<destroy>_check");
		event.getCurrentList().add("function_aarray_<destroy>_next:");
		event.getCurrentList().add("push reg2");
		event.getCurrentList().add("push reg0");
		event.getCurrentList().add("push addrname [reg0]");
		event.getCurrentList().add("call "+x86ModuleDefault.formatFunction(F0xStr.strInternalFreeMemory()));
		event.getCurrentList().add("add regS, addrsize");
		event.getCurrentList().add("pop reg0");
		event.getCurrentList().add("pop reg2");
		event.getCurrentList().add("dec reg2");
		event.getCurrentList().add("add reg0, addrsize");
		event.getCurrentList().add("function_aarray_<destroy>_check:");
		event.getCurrentList().add("test reg2, reg2");
		event.getCurrentList().add("jne function_aarray_<destroy>_next");
		event.getCurrentList().add("ret");
	}
	
	@F0xEventSubscription(event=F0xEventType.Code)
	public void arrayDestroy(F0xEventParsing event) {
		event.getCurrentList().add(x86ModuleDefault.formatFunction("array_<destroy>")+":");
		event.getCurrentList().add("ret");
	}
	
	
	@F0xEventSubscription(event=F0xEventType.Data)
	public void createClassData(F0xEventParsing event) {
		if(getInvokes() == 0) return;
		event.getCurrentList().add("");
		event.getCurrentList().add(";Class Data");
		for(ContextClass c:event.getF0xC().getRegistedClasses()) {
			String cname = c.getClassName().replace('/', '_');
    		String destroy = x86ModuleDefault.formatFunction(cname+"_<destroy>");
    		String refby = cname+"_class";
    		event.getCurrentList().add(refby+": storeref "+destroy);
    		event.getCurrentList().add("storeref "+cname+"_name");
    		for(int i=0;i<c.getVirtualTable().size();i++) {
    			String s = c.getVirtualTable().get(i);
    			event.getCurrentList().add("storeref "+x86ModuleDefault.formatFunction(s.replace('/', '_').replace('.', '_'))+" ;VFT:"+s.replace('/', '_').split("\\.")[1]);
    		}
		}
		
		event.getCurrentList().add("aarray_class: storeref "+x86ModuleDefault.formatFunction("aarray_$destroy$"));
		event.getCurrentList().add("storeref aarray_name");
		
		event.getCurrentList().add("array_class: storeref "+x86ModuleDefault.formatFunction("array_$destroy$"));;
		event.getCurrentList().add("storeref array_name");

    	for(ContextClass cc:event.getF0xC().getRegistedClasses()) {
    		String name = cc.getClassName().replace('/', '_')+"_name";
	    	event.getCurrentList().add(name+" db "+event.getF0xC().getParser().dumpString(cc.getClassName()));
    	}
    	event.getCurrentList().add("array_name db "+event.getF0xC().getParser().dumpString("Array(?)[]"));
    	event.getCurrentList().add("aarray_name db "+event.getF0xC().getParser().dumpString("Array(Object)[]"));
	    event.getCurrentList().add("empty db \" \",0");
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeCompareNULL, priority=F0xEventPriority.NORMAL)
	public void nodeCOMPARE_NULL(F0xEventNodeCompareParsing event) {
		event.getCurrentList().add("cmp reg0, 0");
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeCompareSAMEREFERENCE, priority=F0xEventPriority.NORMAL)
	public void nodeCOMPARE_SAMEREFERENCE(F0xEventNodeCompareParsing event) {
		event.getCurrentList().add("cmp reg0, reg1");
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeCompareINSTANCEOF, priority=F0xEventPriority.NORMAL)
	public void nodeCOMPARE_INSTANCEOF(F0xEventNodeCompareParsing event) {
		event.getCurrentList().add("cmp addrname [reg1], reg0");
		event.getCurrentList().add("setz reg0b");
		event.getCurrentList().add("and reg0, 0xFF");
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeConstADDR, priority=F0xEventPriority.NORMAL)
	public void nodeCONST_ADDR(F0xEventNodeConstParsing event) {
		if(event.getNode().getValue() == null) {
			event.getCurrentList().add("mov reg0, 0");
		}else if(event.getNode().getValue() instanceof String) {
			event.getCurrentList().add("mov reg0, addrname ["+Parser86.getStringVarName(event.getNode().getValue().toString())+"]");
		}else if(event.getNode().getValue() instanceof ContextClass.ContextClassReference) {
			String cn = (((ContextClass.ContextClassReference)event.getNode().getValue()).getClassName()).replace('/', '_')+"_class";
			event.getCurrentList().add("lea reg0, addrname ["+cn+"]");
		}else {
			System.err.println("Placing objects not supported @ "+event.getClassContext().getClassName()+"/"+event.getFunctionContext().getFullName()+" - "+event.getNode().toString());
	
		}
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeStackPUSHADDR, priority=F0xEventPriority.NORMAL)
	public void nodeSTACK_PUSHADDR(F0xEventNodeStackParsing event) {
		event.getCurrentList().add("push reg"+event.getIndex());
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeStackPOPADDR, priority=F0xEventPriority.NORMAL)
	public void nodeSTACK_POPADDR(F0xEventNodeStackParsing event) {
		event.getCurrentList().add("pop reg"+event.getIndex());
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeObjectNEWOBJECT, priority=F0xEventPriority.NORMAL)
	public void nodeOBJECT_NEW_OBJECT(F0xEventNodeObjectParsing event) {
		newObject((Parser86)event.getF0xC().getParser(), event.getCurrentList(), event.getNode(), event.getFunctionContext(), event.getF0xC(), event);
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeObjectNEWARRAY, priority=F0xEventPriority.NORMAL)
	public void nodeOBJECT_NEW_ARRAY(F0xEventNodeObjectParsing event) {
		newArray((Parser86)event.getF0xC().getParser(), event.getCurrentList(), event.getNode(), event.getFunctionContext(), event.getF0xC(), event);
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeObjectFREE, priority=F0xEventPriority.NORMAL)
	public void nodeOBJECT_FREE(F0xEventNodeObjectParsing event) {
		free((Parser86)event.getF0xC().getParser(), event.getCurrentList(), event.getNode(), event.getFunctionContext(), event.getF0xC());
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeObjectDESTROY, priority=F0xEventPriority.NORMAL)
	public void nodeOBJECT_DESTROY(F0xEventNodeObjectParsing event) {
		destroy((Parser86)event.getF0xC().getParser(), event.getCurrentList(), event.getNode(), event.getFunctionContext(), event.getClassContext(), event.getF0xC());
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeObjectCLDESTROY, priority=F0xEventPriority.NORMAL)
	public void nodeOBJECT_CLDESTROY(F0xEventNodeObjectParsing event) {
		cldestroy((Parser86)event.getF0xC().getParser(), event.getCurrentList(), event.getNode(), event.getFunctionContext(), event.getClassContext(), event.getF0xC());
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeObjectREFERENCE, priority=F0xEventPriority.NORMAL)
	public void nodeOBJECT_REFERENCE(F0xEventNodeObjectParsing event) {
		incObject((Parser86)event.getF0xC().getParser(), event.getCurrentList(), event.getNode(), event.getFunctionContext(), event.getF0xC());
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeObjectARRAYLENGTH, priority=F0xEventPriority.NORMAL)
	public void nodeOBJECT_ARRAYLENGTH(F0xEventNodeObjectParsing event) {
		arrayLength((Parser86)event.getF0xC().getParser(), event.getCurrentList(), event.getNode(), event.getF0xC());
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeInvokeSPECIAL, priority=F0xEventPriority.NORMAL)
	public void nodeINVOKE_SPECIAL(F0xEventNodeInvokeParsing event) {
		invokeObject((Parser86)event.getF0xC().getParser(), event.getCurrentList(), event.getFunctionContext(), event.getNode(), event.getF0xC(), true, event);
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeInvokeOBJECT, priority=F0xEventPriority.NORMAL)
	public void nodeINVOKE_OBJECT(F0xEventNodeInvokeParsing event) {
		invokeObject((Parser86)event.getF0xC().getParser(), event.getCurrentList(), event.getFunctionContext(), event.getNode(), event.getF0xC(), false, event);
	}
	
	public static void newObject(Parser86 parser86, ArrayList<String> list, NodeObject node, ContextFunction f, F0xC fox, F0xEventNodeParsing event) {
		ContextClass nO = fox.getClass(node.getClassName());
		if(nO == null) {
			System.err.println("Wasn't able to handle create new: "+node.toString());
			return;
		}
		list.add("mov reg0, "+getClassReferenceString(nO));
		
		list.add("push reg0");
		list.add("mov reg0, "+nO.getObjectSize());
		list.add("push reg0");
		list.add("call "+x86ModuleDefault.formatFunction(F0xStr.strInternalAllocateMemory()));
		list.add("add regS, addrsize*2");
		
		if(f!= null && !f.containsProperty(TranslationProperty.NO_GARBAGE_COLLECT)){
			incObject(parser86, list, node, f, fox);
			fox.getEventHandler().triggerEvent(F0xEventType.GCRegister, event);
		}
	}
	
	public static void destroy(Parser86 parser86, ArrayList<String> list, NodeObject node,ContextFunction f, ContextClass c, F0xC fox) {
		list.add("mov reg1, "+F0xUtil.argB(0, 1));
		for(Entry<Integer, String> varTable:c.getObjectVariables().entrySet()) {
			int size = F0xUtil.convertedType(F0xUtil.convertDescriptor(c.getObjectDesc(varTable.getValue()).charAt(0)));
			if(size != Node.ADDR) continue;
			int offset = c.getObjectIndex(varTable.getValue());
			if(offset == 0) continue;
			list.add("push reg1");
			list.add("mov reg0, [reg1+"+offset+"]");
			free(parser86, list, node, f, fox);
			list.add("pop reg1");
		}
	}
	
	public static void cldestroy(Parser86 parser86, ArrayList<String> list, NodeObject node,ContextFunction f , ContextClass c, F0xC fox) {
		for(String key:c.getGlobalVariables().keySet()) {
			int size = F0xUtil.convertedType(F0xUtil.convertDescriptor(c.getGlobalVariables().get(key).charAt(0)));
			if(size != Node.ADDR) continue;
			list.add("mov reg0, ["+x86ModuleInteger.formatVariable(c.getClassName()+"_"+key)+"]");
			free(parser86, list, node,f, fox);
		}
	}
	
	public static String getClassReferenceString(ContextClass nO) {
		return  (nO.getClassName()+"_class").replace('/', '_');
	}


	
	public static void newArray(Parser86 parser86, ArrayList<String> list, NodeObject node, ContextFunction f, F0xC fox, F0xEventNodeObjectParsing event) {
		int size = F0xUtil.convertArrayType(Integer.parseInt(node.getClassName()));
		if(size == Node.ADDR) {
			list.add("mov reg0, aarray_class");
		}else
			list.add("mov reg0, array_class");
		list.add("push reg2");
		list.add("push reg0");
		list.add("imul reg0, reg2, "+F0xUtil.convertedSize(size, parser86.getAddressSize()));
		list.add("add reg0, "+ContextClass.arrayOffset(parser86.getAddressSize())); //extra for deconstructor, size and ref count
		list.add("push reg0");
		list.add("call "+x86ModuleDefault.formatFunction(F0xStr.strInternalAllocateMemory()));
		list.add("add regS, addrsize*2");
		list.add("pop reg2");
		list.add("mov [reg0+"+ContextClass.arrayLength(parser86.getAddressSize())+"], reg2");
		
		if(f!= null && !f.containsProperty(TranslationProperty.NO_GARBAGE_COLLECT)){
			incObject(parser86, list, node, f, fox);
			fox.getEventHandler().triggerEvent(F0xEventType.GCRegister, event);
		}
	}
	
	public static void arrayLength(Parser86 parser86, ArrayList<String> list, NodeObject node, F0xC fox) {
		list.add("mov reg0, [reg1+"+ContextClass.arrayLength(parser86.getAddressSize())+"]");
	}
	
	public static void free(Parser86 parser86, ArrayList<String> list, NodeObject node, ContextFunction f, F0xC fox) {
		if((f==null || !f.containsProperty(TranslationProperty.INTERNAL))) {
			list.add("push reg0");
			list.add("call "+x86ModuleDefault.formatFunction(F0xStr.strInternalFreeMemory()));
			list.add("pop reg0");
		}
	}
	
	public static void incObject(Parser86 parser86, ArrayList<String> list, Node node, ContextFunction f, F0xC fox) {
		if((f==null || !f.containsProperty(TranslationProperty.INTERNAL))) {
			list.add("push reg0");
			list.add("call "+ x86ModuleDefault.formatFunction(F0xStr.strInternalIncMemory()));
			list.add("pop reg0");
		}
	}
	
	public static void invokeObject(Parser86 parser86, ArrayList<String> list,ContextFunction f, NodeInvoke node, F0xC fox, boolean special, F0xEventNodeParsing event) {
		
		//can someone tell me why getClass isn't a special operation? o.O
		if(node.getInvokeIdentifier().equals("java_lang_Object.getClass__Ljava_lang_Class"))
			special = true;
		
		if(special) { //can't be overwritten 
			list.add("call "+ x86ModuleDefault.formatFunction(node.getInvokeIdentifier()));
			ContextFunction f2 = fox.getMethod(node.getInvokeIdentifier());
			if(f2 == null)
				list.add("add regS, addrsize*"+(node.getParameters()));
			else
				list.add("add regS, addrsize*"+(f2.getParameterSize(parser86.getAddressSize())));
		}else {
			int index = fox.getVirtualMethodIndex(node.getInvokeIdentifier());
			if(index == -1) {System.err.println(node.getInvokeIdentifier()+" is not implemented."); 
			list.add(";Failed to find "+node.getInvokeIdentifier()+"..."); return;}
			ContextFunction ft = fox.getVirtualMethod(node.getInvokeIdentifier());
			list.add("mov reg0, addrname [regS+addrsize*"+(ft.getParameterSize(parser86.getAddressSize())-1)+"]");
			list.add("mov reg0, addrname [reg0] ;VFC:"+ft.getSanitizedFullName()); //add an optimization label
			list.add("add reg0, addrsize*"+(index+2));
			list.add("call addrname [reg0] ;"+node.getInvokeIdentifier());
			list.add("add regS, addrsize*"+(ft.getParameterSize(parser86.getAddressSize())));
		}
		
		if((f==null || !f.containsProperty(TranslationProperty.NO_GARBAGE_COLLECT)) && !node.returnVoid() && node.returnType() == Node.ADDR) {
			fox.getEventHandler().triggerEvent(F0xEventType.GCRegister, event);
		}

		if(!node.returnVoid()) {
			list.add("push reg0");
			if(node.returnType() == Node.INT64 || node.returnType() == Node.DOUBLE)
				list.add("push reg3");
		}
	}
	

	@F0xEventSubscription(event=F0xEventType.ParseNodeVarFixLocalLoadADDR, priority=F0xEventPriority.NORMAL)
	public void nodeVARFIX_LOCALLOADADDR(F0xEventNodeVarFixParsing event) { x86ModuleInteger.nodeVARFIX_LOCALLOAD(event); }
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeVarFixLocalStoreADDR, priority=F0xEventPriority.NORMAL)
	public void nodeVARFIX_LOCALSTOREADDR(F0xEventNodeVarFixParsing event) { x86ModuleInteger.nodeVARFIX_LOCALSTORE(event); }
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeVarFixGlobalLoadADDR, priority=F0xEventPriority.NORMAL)
	public void nodeVARFIX_GLOBALLOADADDR(F0xEventNodeVarFixParsing event) { x86ModuleInteger.nodeVARFIX_GLOBALLOAD(event); }
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeVarFixGlobalStoreADDR, priority=F0xEventPriority.NORMAL)
	public void nodeVARFIX_GLOBALSTOREADDR(F0xEventNodeVarFixParsing event) { x86ModuleInteger.nodeVARFIX_GLOBALSTORE(event); }
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeVarFixObjectLoadADDR, priority=F0xEventPriority.NORMAL)
	public void nodeVARFIX_OBJECTLOADADDR(F0xEventNodeVarFixParsing event) {
		event.getCurrentList().add("mov reg0, addrname [reg1+"+x86ModuleInteger.nodeVARFIX_OBJECTOFFSET(event)+"]");
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeVarFixObjectStoreADDR, priority=F0xEventPriority.NORMAL)
	public void nodeVARFIX_OBJECTSTOREADDR(F0xEventNodeVarFixParsing event) {
		event.getCurrentList().add("mov addrname [reg1+"+x86ModuleInteger.nodeVARFIX_OBJECTOFFSET(event)+"], reg0");
	}
		
	@F0xEventSubscription(event=F0xEventType.ParseNodeVarFixArrayLoadADDR, priority=F0xEventPriority.NORMAL)
	public void nodeVARFIX_ARRAYLOADADDR(F0xEventNodeVarFixParsing event) {
		x86ModuleInteger.nodeVARFIX_ARRAYLOAD(event);
		event.getCurrentList().add("mov reg0, [reg1]");
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeVarFixArrayStoreADDR, priority=F0xEventPriority.NORMAL)
	public void nodeVARFIX_ARRAYSTOREADDR(F0xEventNodeVarFixParsing event) { 
		x86ModuleInteger.nodeVARFIX_ARRAYSTORE(event); 
		event.getCurrentList().add("mov [reg1], reg0");
	}
	


	
	
}
