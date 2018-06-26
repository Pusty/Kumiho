package pusty.f0xC.lang.x86.modules;

import pusty.f0xC.module.F0xEvent.F0xEventPriority;
import pusty.f0xC.module.F0xEvent.F0xEventType;

import java.util.ArrayList;
import java.util.Map.Entry;

import pusty.f0xC.ContextClass;
import pusty.f0xC.ContextFunction;
import pusty.f0xC.F0xC;
import pusty.f0xC.F0xStr;
import pusty.f0xC.F0xUtil;
import pusty.f0xC.lang.OverrideHandler.TranslationProperty;
import pusty.f0xC.lang.x86.Parser86;
import pusty.f0xC.module.F0xEventSubscription;
import pusty.f0xC.module.F0xModule;
import pusty.f0xC.module.event.F0xEventFunctionParsing;
import pusty.f0xC.module.event.F0xEventNodeInvokeParsing;
import pusty.f0xC.module.event.F0xEventNodeJumpParsing;
import pusty.f0xC.module.event.F0xEventNodeParsing;
import pusty.f0xC.module.event.F0xEventNodeStackParsing;
import pusty.f0xC.module.event.F0xEventParsing;
import pusty.f0xC.nodes.Node;
import pusty.f0xC.nodes.NodeInvoke;

public class x86ModuleDefault extends F0xModule {

	@Override
	public String uniqueIdentifier() {
		return "x86Default";
	}
	
	@F0xEventSubscription(event=F0xEventType.Code, priority=F0xEventPriority.NORMAL)
	public void genericFunctionality(F0xEventParsing event) {
		event.getCurrentList().add("_generic_return: ret");
	}
	
	
	@F0xEventSubscription(event=F0xEventType.Code, priority=F0xEventPriority.NORMAL)
	public void startParsingCode(F0xEventParsing event) {
		addStartFunction((Parser86)event.getF0xC().getParser(), event.getCurrentList(), event.getF0xC());
	}
	
	public static void addStartFunction(Parser86 parser, ArrayList<String> list, F0xC fox) {
		list.add("");
		list.add("start_function:");
		
		fox.getEventHandler().triggerEvent(F0xEventType.Init, new F0xEventParsing(fox, list));
	
		for(int i=fox.getRegistedClasses().length-1;i>=0;i--) {
			ContextClass cc = fox.getRegistedClasses()[i];
			for(ContextFunction cf:cc.getFunctions()) {
				if(cf.getFullName().equals("<clinit>()V")) {
					list.add("call "+x86ModuleDefault.formatFunction(cc.getClassName()+".$clinit$__V"));
				}
			}
		}
		
		//TODO: Prepare arguments here!
		
		//CALL MAIN FUNCTION!
		boolean mainClass = false;
		for(ContextClass cla:fox.getRegistedClasses()) {
			for(ContextFunction func:cla.getFunctions()) {
				if(func.getFullName().equals("main([Ljava/lang/String;)V")) {
					if(mainClass)
						System.out.println("[!] More than one main function found! ["+func.getClassName()+"]");
					String m = cla.getClassName().replace('/', '_')+"_main__Ljava_lang_String_V";
					list.add("call "+x86ModuleDefault.formatFunction(m));
					mainClass = true;
				}
			}
		}
		
		for(int i=0;i<fox.getRegistedClasses().length;i++) {
			ContextClass cc = fox.getRegistedClasses()[i];
			for(ContextFunction cf:cc.getFunctions()) {
				if(cf.getFullName().equals("<clinit>()V")) {
					list.add("call "+x86ModuleDefault.formatFunction(cc.getClassName()+".$cldestroy$"));
				}
			}
		}
		
		fox.getEventHandler().triggerEvent(F0xEventType.Free, new F0xEventParsing(fox, list));
		fox.getEventHandler().triggerEvent(F0xEventType.Diagnostic, new F0xEventParsing(fox, list));
		
		list.add("mov reg0, 0");
		list.add("push reg0");
		list.add("  call "+x86ModuleDefault.formatFunction(F0xStr.strInternalExit()));    //exit!
		list.add("pop reg0");
		
		list.add("ret");
	}
	
	@F0xEventSubscription(event=F0xEventType.StartParsingFunction, priority=F0xEventPriority.NORMAL)
	public void startFuncion(F0xEventFunctionParsing event) {
		if(event.getFunctionContext().containsProperty(TranslationProperty.NATIVE)) return;
		event.getCurrentList().add("label_start:");
		if(!event.getFunctionContext().containsProperty(TranslationProperty.NO_FRAME)) {
			event.getCurrentList().add("push regB");
			if(event.getFunctionContext().containsProperty(TranslationProperty.FREEZE_GARBAGE_COLLECT))
				event.getF0xC().getEventHandler().triggerEvent(F0xEventType.GCDisable, new F0xEventNodeParsing(event.getF0xC(), event.getCurrentList(), null, event.getFunctionContext(), null));
			event.getCurrentList().add("mov regB, regS");
			if(event.getFunctionContext().getLocalVariables().size()>0) {
				int s = event.getFunctionContext().getLocalVariableSize(event.getF0xC().getParser().getAddressSize());
				event.getCurrentList().add("sub regS, addrsize*"+s);
				for(int i=0;i<s;i++)
					event.getCurrentList().add("mov addrname [regS+addrsize*"+i+"], 0"); //ZERO STACK VALUES
			}
		}
	}
	
	@F0xEventSubscription(event=F0xEventType.StopParsingFunction, priority=F0xEventPriority.NORMAL)
	public void stopFunction(F0xEventFunctionParsing event) {
		if(event.getFunctionContext().containsProperty(TranslationProperty.NATIVE)) return;
		if(!event.getFunctionContext().containsProperty(TranslationProperty.NO_FRAME)) {
			event.getCurrentList().add("mov regS, regB");
			event.getCurrentList().add("pop regB");
			event.getCurrentList().add("push reg0");
			event.getCurrentList().add("push reg3");
			event.getCurrentList().add("push regB");
			if(!event.getFunctionContext().containsProperty(TranslationProperty.NO_GARBAGE_COLLECT))
				event.getF0xC().getEventHandler().triggerEvent(F0xEventType.GCCollect, new F0xEventNodeParsing(event.getF0xC(), event.getCurrentList(), null, event.getFunctionContext(), null));
			if(event.getFunctionContext().containsProperty(TranslationProperty.FREEZE_GARBAGE_COLLECT))
				event.getF0xC().getEventHandler().triggerEvent(F0xEventType.GCEnable, new F0xEventNodeParsing(event.getF0xC(), event.getCurrentList(), null, event.getFunctionContext(), null));
			event.getCurrentList().add("pop regB");
			event.getCurrentList().add("pop reg3");
			event.getCurrentList().add("pop reg0");
		}
		event.getCurrentList().add("ret");
		event.getCurrentList().add("");
	}
	
	public static void jumpCC(F0xEventNodeJumpParsing event, String cc) {
		if(!event.getFunctionContext().containsProperty(TranslationProperty.NO_GARBAGE_COLLECT)
		   && event.getNode().getBranchPosition() <  event.getFunctionContext().getNodeIndex()) //only collect in loops
			event.getF0xC().getEventHandler().triggerEvent(F0xEventType.GCCollectKeepFlags, new F0xEventNodeParsing(event.getF0xC(), event.getCurrentList(), event.getClassContext(), event.getFunctionContext(), event.getGenericNode()));
		event.getCurrentList().add(cc+" "+("label_"+Integer.toString(event.getNode().getBranchPosition())));
	}

	@F0xEventSubscription(event=F0xEventType.ParseNodeJumpAlways, priority=F0xEventPriority.NORMAL)
	public void jumpAlways(F0xEventNodeJumpParsing event) {
		jumpCC(event, "jmp");
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeJumpEqual, priority=F0xEventPriority.NORMAL)
	public void jumpEqual(F0xEventNodeJumpParsing event) {
		jumpCC(event, "je ");
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeJumpNotEqual, priority=F0xEventPriority.NORMAL)
	public void jumpNotEqual(F0xEventNodeJumpParsing event) {
		jumpCC(event, "jne");
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeJumpLessThan, priority=F0xEventPriority.NORMAL)
	public void jumpLessThan(F0xEventNodeJumpParsing event) {
		jumpCC(event, "jl ");
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeJumpLessEqual, priority=F0xEventPriority.NORMAL)
	public void jumpLessEqual(F0xEventNodeJumpParsing event) {
		jumpCC(event, "jle");
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeJumpGreaterThan, priority=F0xEventPriority.NORMAL)
	public void jumpGreaterThan(F0xEventNodeJumpParsing event) {
		jumpCC(event, "jg ");
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeJumpGreaterEqual, priority=F0xEventPriority.NORMAL)
	public void jumpGreaterEqual(F0xEventNodeJumpParsing event) {
		jumpCC(event, "jge");
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeJumpReturn, priority=F0xEventPriority.NORMAL)
	public void jumpReturn(F0xEventNodeJumpParsing event) {
		event.getCurrentList().add("jmp label_exit");
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeStackTHROW, priority=F0xEventPriority.NORMAL)
	public void throwError(F0xEventNodeStackParsing event) {
		//event.getCurrentList().add(";throw exception!");
		//System.err.println("Throwing not actually implemented!");
		event.getCurrentList().add("call "+x86ModuleDefault.formatFunction(F0xStr.strInternalMarkAddress()));
		event.getCurrentList().add("call "+x86ModuleDefault.formatFunction(F0xStr.strInternalException())); //note that no cleanup is necessary
	}

	@F0xEventSubscription(event=F0xEventType.ParseNodeInvokeSTATIC, priority=F0xEventPriority.NORMAL)
	public void nodeINVOKE_STATIC(F0xEventNodeInvokeParsing event) {
		invokeStatic((Parser86)event.getF0xC().getParser(), event.getCurrentList(),event.getClassContext(), event.getFunctionContext(), event.getNode(), event.getF0xC());
	}
	
	public static void invokeStatic(Parser86 parser86, ArrayList<String> list,ContextClass c,ContextFunction f, NodeInvoke node, F0xC fox) {
		
		ContextFunction f2 = fox.getMethod(node.getInvokeIdentifier());
		
		if(f2 != null && f2.containsProperty(TranslationProperty.NATIVE)) {
			String callName = node.getInvokeIdentifierRaw().substring(node.getInvokeIdentifierRaw().indexOf('.')+1);
			callName = callName.substring(0, callName.indexOf(';'));
			list.add("call addrname ["+callName+"]");
		}else {
			list.add("call "+formatFunction(node.getInvokeIdentifier()));
		}
		
		if(f2 == null)
				list.add("add regS, addrsize*"+(node.getParameters()));
			else if(f2.containsProperty(TranslationProperty.STDCALL)) {
				
			}else
				list.add("add regS, addrsize*"+(f2.getParameterSize(parser86.getAddressSize())));
		
		if((f==null || !f.containsProperty(TranslationProperty.NO_GARBAGE_COLLECT)) && !node.returnVoid() && node.returnType() == Node.ADDR) {
			fox.getEventHandler().triggerEvent(F0xEventType.GCRegister, new F0xEventNodeParsing(fox, list, c, f, node));
		}
		if(!node.returnVoid()) {
			list.add("push reg0");
			if(node.returnType() == Node.INT64 || node.returnType() == Node.DOUBLE)
				list.add("push reg2");
		}
	}
	
	public static void callInternal(F0xC fox, ArrayList<String> list, ContextClass fClass, ContextFunction fMain, String function) {
		ContextFunction f = fox.getMethod(function);
		NodeInvoke inv = new NodeInvoke(f.getParameterSize(fox.getParser().getAddressSize()), NodeInvoke.INVOKE_STATIC , function, f.getTypes()[f.getTypes().length-1]);
		invokeStatic(null, list,fClass,fMain, inv, fox);
	}

	public static String formatFunction(String str) {
		String label = str.replace('/', '_').replace('.', '_').replace('<', '$').replace('>', '$');
		return "function_"+ContextFunction.hashFunctionName(label)+"_line_start";
	}
	
	
	@F0xEventSubscription(event=F0xEventType.Data)
	public void createGlobalData(F0xEventParsing event) {
	    event.getCurrentList().add("");
	    for(ContextClass c:event.getF0xC().getRegistedClasses()) {
	    	event.getCurrentList().add(";Global Data for '"+c.getClassName()+"'");
			for(Entry<String, String> global:c.getGlobalVariables().entrySet()) {
				int size = F0xUtil.convertedSize(global.getValue(), event.getF0xC().getParser().getAddressSize());
				String vn = c.getClassName().replace('/', '_')+"_"+global.getKey();
				if(size == 1)
					event.getCurrentList().add("   "+vn+" db 0");
				else if(size == 2)
					event.getCurrentList().add("   "+vn+" dw 0");
				else if(size == 4)
					event.getCurrentList().add("   "+vn+" dd 0");
				else if(size == 8)
					event.getCurrentList().add("   "+vn+" dq 0");
				else if(size > 8) {
					event.getCurrentList().add("   "+vn+" db  0");
					for(int i=0;i<size-1;i++)
						event.getCurrentList().add("   "+"   "+" db  0");
				}else
					System.err.println("Error handling global variable '"+vn+"'");
			}
			event.getCurrentList().add("");
	    
	    }
	}


	
}
