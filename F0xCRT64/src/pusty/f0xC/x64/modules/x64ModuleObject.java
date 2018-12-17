package pusty.f0xC.x64.modules;

import java.util.ArrayList;
import pusty.f0xC.ContextClass;
import pusty.f0xC.ContextFunction;
import pusty.f0xC.F0xC;
import pusty.f0xC.F0xUtil;
import pusty.f0xC.lang.OverrideHandler.TranslationProperty;
import pusty.f0xC.lang.Parser;
import pusty.f0xC.module.F0xEventSubscription;
import pusty.f0xC.module.F0xEvent.F0xEventPriority;
import pusty.f0xC.module.F0xEvent.F0xEventType;
import pusty.f0xC.module.event.F0xEventNodeObjectParsing;
import pusty.f0xC.module.event.F0xEventNodeParsing;
import pusty.f0xC.module.event.F0xEventNodeVarFixParsing;
import pusty.f0xC.module.event.F0xEventParsing;
import pusty.f0xC.nodes.Node;
import pusty.f0xC.nodes.NodeObject;
import pusty.f0xC.x64.StringConfig64;
import pusty.f0xC.x86.modules.x86ModuleObject;

public class x64ModuleObject extends x86ModuleObject {

	@Override
	public String uniqueIdentifier() {
		return "x64Object";
	}
	
	public void newObject(Parser parser, ArrayList<String> list, NodeObject node, ContextFunction f, F0xC fox, F0xEventNodeParsing event) {
		ContextClass nO = fox.getClass(node.getClassName());
		if(nO == null) {
			System.err.println("Wasn't able to handle create new: "+node.toString());
			return;
		}
		list.add("mov reg0, "+F0xUtil.getClassReferenceString(nO));
		
		list.add("push reg0");
		list.add("mov reg0, "+nO.getObjectSize());
		list.add("push reg0");
		list.add("call "+F0xUtil.formatFunction(StringConfig64.strInternalAllocateMemory()));
		list.add("add regS, addrsize*2");
		
		if(f!= null && !f.containsProperty(TranslationProperty.NO_GARBAGE_COLLECT)){
			incObject(parser, list, node, f, fox);
			fox.getEventHandler().triggerEvent(F0xEventType.GCRegister, event);
		}
	}
	
	public void newArray(Parser parser, ArrayList<String> list, NodeObject node, ContextFunction f, F0xC fox, F0xEventNodeObjectParsing event) {
		int size = F0xUtil.convertArrayType(Integer.parseInt(node.getClassName()));
		if(size == Node.ADDR) {
			list.add("mov reg0, aarray_class");
		}else
			list.add("mov reg0, array_class");
		list.add("push reg2");
		list.add("push reg0");
		list.add("imul reg0, reg2, "+F0xUtil.convertedSize(size, parser.getAddressSize()));
		list.add("add reg0, "+ContextClass.arrayOffset(parser.getAddressSize())); //extra for deconstructor, size and ref count
		list.add("push reg0");
		list.add("call "+F0xUtil.formatFunction(StringConfig64.strInternalAllocateMemory()));
		list.add("add regS, addrsize*2");
		list.add("pop reg2");
		list.add("mov [reg0+"+ContextClass.arrayLength(parser.getAddressSize())+"], reg2d");
		
		if(f!= null && !f.containsProperty(TranslationProperty.NO_GARBAGE_COLLECT)){
			incObject(parser, list, node, f, fox);
			fox.getEventHandler().triggerEvent(F0xEventType.GCRegister, event);
		}
	}
	
	@F0xEventSubscription(event=F0xEventType.Code)
	public void aarrayDestroy(F0xEventParsing event) {
		event.getCurrentList().add(F0xUtil.formatFunction("aarray_<destroy>")+":");
		event.getCurrentList().add("mov reg1, [regS+addrsize]");
		event.getCurrentList().add("mov reg2d, [reg1+"+ContextClass.arrayLength(event.getF0xC().getParser().getAddressSize())+"]");
		event.getCurrentList().add("lea reg0, [reg1+"+ContextClass.arrayOffset(event.getF0xC().getParser().getAddressSize())+"]");
		event.getCurrentList().add("jmp "+F0xUtil.formatFunction("aarray_<destroy>_check"));
		event.getCurrentList().add(F0xUtil.formatFunction("aarray_<destroy>_next")+":");
		event.getCurrentList().add("push reg2");
		event.getCurrentList().add("push reg0");
		event.getCurrentList().add("push addrname [reg0]");
		event.getCurrentList().add("call "+F0xUtil.formatFunction(StringConfig64.strInternalFreeMemory()));
		event.getCurrentList().add("add regS, addrsize");
		event.getCurrentList().add("pop reg0");
		event.getCurrentList().add("pop reg2");
		event.getCurrentList().add("dec reg2");
		event.getCurrentList().add("add reg0, addrsize");
		event.getCurrentList().add(F0xUtil.formatFunction("aarray_<destroy>_check")+":");
		event.getCurrentList().add("test reg2, reg2");
		event.getCurrentList().add("jne "+F0xUtil.formatFunction("aarray_<destroy>_next"));
		event.getCurrentList().add("ret");
	}
	
	public void free(Parser parser, ArrayList<String> list, NodeObject node, ContextFunction f, F0xC fox) {
		if((f==null || !f.containsProperty(TranslationProperty.INTERNAL))) {
			list.add("push reg0");
			list.add("call "+F0xUtil.formatFunction(StringConfig64.strInternalFreeMemory()));
			list.add("pop reg0");
		}
	}
	
	public void incObject(Parser parser, ArrayList<String> list, Node node, ContextFunction f, F0xC fox) {
		if((f==null || !f.containsProperty(TranslationProperty.INTERNAL))) {
			list.add("push reg0");
			list.add("call "+ F0xUtil.formatFunction(StringConfig64.strInternalIncMemory()));
			list.add("pop reg0");
		}
	}

	@F0xEventSubscription(event=F0xEventType.ParseNodeVarFixLocalLoadADDR, priority=F0xEventPriority.NORMAL)
	public void nodeVARFIX_LOCALLOADADDR(F0xEventNodeVarFixParsing event) { x64ModuleInteger.nodeVARFIX_LOCALLOAD(event); }
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeVarFixLocalStoreADDR, priority=F0xEventPriority.NORMAL)
	public void nodeVARFIX_LOCALSTOREADDR(F0xEventNodeVarFixParsing event) { x64ModuleInteger.nodeVARFIX_LOCALSTORE(event); }
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeVarFixGlobalLoadADDR, priority=F0xEventPriority.NORMAL)
	public void nodeVARFIX_GLOBALLOADADDR(F0xEventNodeVarFixParsing event) { x64ModuleInteger.nodeVARFIX_GLOBALLOAD(event); }
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeVarFixGlobalStoreADDR, priority=F0xEventPriority.NORMAL)
	public void nodeVARFIX_GLOBALSTOREADDR(F0xEventNodeVarFixParsing event) { x64ModuleInteger.nodeVARFIX_GLOBALSTORE(event); }
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeVarFixObjectLoadADDR, priority=F0xEventPriority.NORMAL)
	public void nodeVARFIX_OBJECTLOADADDR(F0xEventNodeVarFixParsing event) {
		event.getCurrentList().add("mov reg0, addrname [reg1+"+x64ModuleInteger.nodeVARFIX_OBJECTOFFSET(event)+"]");
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeVarFixObjectStoreADDR, priority=F0xEventPriority.NORMAL)
	public void nodeVARFIX_OBJECTSTOREADDR(F0xEventNodeVarFixParsing event) {
		event.getCurrentList().add("mov addrname [reg1+"+x64ModuleInteger.nodeVARFIX_OBJECTOFFSET(event)+"], reg0");
	}

}
