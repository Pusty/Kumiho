package pusty.f0xC.x64.modules;

import pusty.f0xC.module.F0xEvent.F0xEventPriority;
import pusty.f0xC.module.F0xEvent.F0xEventType;

import java.util.ArrayList;
import pusty.f0xC.ContextClass;
import pusty.f0xC.ContextFunction;
import pusty.f0xC.F0xC;
import pusty.f0xC.F0xUtil;
import pusty.f0xC.lang.OverrideHandler.TranslationProperty;
import pusty.f0xC.lang.Parser;
import pusty.f0xC.module.F0xEventSubscription;
import pusty.f0xC.module.event.F0xEventFunctionParsing;
import pusty.f0xC.module.event.F0xEventNodeParsing;
import pusty.f0xC.module.event.F0xEventNodeStackParsing;
import pusty.f0xC.module.event.F0xEventParsing;
import pusty.f0xC.nodes.Node;
import pusty.f0xC.nodes.NodeInvoke;
import pusty.f0xC.x64.StringConfig64;
import pusty.f0xC.x86.modules.x86ModuleDefault;

public class x64ModuleDefault extends x86ModuleDefault {

	@Override
	public String uniqueIdentifier() {
		return "x64Default";
	}
	
	@F0xEventSubscription(event=F0xEventType.Code, priority=F0xEventPriority.NORMAL)
	public void startParsingCode(F0xEventParsing event) {
		event.getCurrentList().add("");
		event.getCurrentList().add("start_function:");
		
		event.getCurrentList().add("mov regB, regS");
		
		event.getCurrentList().add("start_function_init:");
		event.getF0xC().getEventHandler().triggerEvent(F0xEventType.Init, new F0xEventParsing(event.getF0xC(), event.getCurrentList()));
		
		//TODO: Prepare arguments here!
		
		//CALL MAIN FUNCTION!
		event.getCurrentList().add("start_function_main:");
		boolean mainClass = false;
		for(ContextClass cla:event.getF0xC().getRegistedClasses()) {
			for(ContextFunction func:cla.getFunctions()) {
				if(func.getFullName().equals("main([Ljava/lang/String;)V")) {
					if(mainClass)
						System.out.println("[!] More than one main function found! ["+func.getClassName()+"]");
					String m = cla.getClassName().replace('/', '_')+"_main__Ljava_lang_String_V";
					event.getCurrentList().add("call "+F0xUtil.formatFunction(m));
					mainClass = true;
				}
			}
		}
		event.getCurrentList().add("start_function_free:");
		event.getF0xC().getEventHandler().triggerEvent(F0xEventType.Free, new F0xEventParsing(event.getF0xC(), event.getCurrentList()));
		event.getCurrentList().add("start_function_diag:");
		event.getF0xC().getEventHandler().triggerEvent(F0xEventType.Diagnostic, new F0xEventParsing(event.getF0xC(), event.getCurrentList()));
		
		event.getCurrentList().add("start_function_exit:");
		event.getCurrentList().add("xor reg0, reg0");
		event.getCurrentList().add("push reg0");
		event.getCurrentList().add("  call "+F0xUtil.formatFunction(StringConfig64.strInternalExit()));    //exit!
		event.getCurrentList().add("pop reg0");
		event.getCurrentList().add("ret");
	}
	
	@F0xEventSubscription(event=F0xEventType.StopParsingFunction, priority=F0xEventPriority.NORMAL)
	public void stopFunction(F0xEventFunctionParsing event) {
		if(event.getFunctionContext().containsProperty(TranslationProperty.NATIVE)) return;
		if(!event.getFunctionContext().containsProperty(TranslationProperty.NO_FRAME)) {
			event.getCurrentList().add("mov regS, regB");
			event.getCurrentList().add("pop regB");
			event.getCurrentList().add("push reg0");
			event.getCurrentList().add("push regB");
			if(!event.getFunctionContext().containsProperty(TranslationProperty.NO_GARBAGE_COLLECT))
				event.getF0xC().getEventHandler().triggerEvent(F0xEventType.GCCollect, new F0xEventNodeParsing(event.getF0xC(), event.getCurrentList(), null, event.getFunctionContext(), null));
			if(event.getFunctionContext().containsProperty(TranslationProperty.FREEZE_GARBAGE_COLLECT))
				event.getF0xC().getEventHandler().triggerEvent(F0xEventType.GCEnable, new F0xEventNodeParsing(event.getF0xC(), event.getCurrentList(), null, event.getFunctionContext(), null));
			event.getCurrentList().add("pop regB");
			event.getCurrentList().add("pop reg0");
		}
		event.getCurrentList().add("ret");
		event.getCurrentList().add("");
	}

	@F0xEventSubscription(event=F0xEventType.ParseNodeStackTHROW, priority=F0xEventPriority.NORMAL)
	public void throwError(F0xEventNodeStackParsing event) {
		//event.getCurrentList().add(";throw exception!");
		//System.err.println("Throwing not actually implemented!");
		event.getCurrentList().add("call "+F0xUtil.formatFunction(StringConfig64.strInternalMarkAddress()));
		event.getCurrentList().add("call "+F0xUtil.formatFunction(StringConfig64.strInternalException())); //note that no cleanup is necessary
	}
	
	public void invokeStatic(Parser parser, ArrayList<String> list,ContextClass c,ContextFunction f, NodeInvoke node, F0xC fox) {
		
		ContextFunction f2 = fox.getMethod(node.getInvokeIdentifier());
		
		if(f2 != null && f2.containsProperty(TranslationProperty.NATIVE)) {
			String callName = node.getInvokeIdentifierRaw().substring(node.getInvokeIdentifierRaw().indexOf('.')+1);
			callName = callName.substring(0, callName.indexOf(';'));
			//64bit calling convention
			list.add("mov reg2, addrname [regS]");
			//list.add("shl reg2, 2");
			list.add("mov reg3, addrname [regS+addrsize]");
			list.add("mov r8,   addrname [regS+addrsize*2]");
			list.add("mov r9,   addrname [regS+addrsize*3]"); //TODO: make this better/dependent on actual parameters
			//list.add("xor reg3, reg3");
			//list.add("xor r8, r8");
			//list.add("xor r9, r9");
			list.add("xor reg0, reg0");
			list.add("sub regS, addrsize*5");
			list.add("call addrname ["+callName+"]");
			list.add("add regS, addrsize*5");
		}else {
			list.add("call "+F0xUtil.formatFunction(node.getInvokeIdentifier()));
		}
		
		if(f2 == null)
				list.add("add regS, addrsize*"+(node.getParameters()));
			else if(f2.containsProperty(TranslationProperty.STDCALL)) {
				
			}else
				list.add("add regS, addrsize*"+(f2.getParameterSize(parser.getAddressSize())));
		
		if((f==null || !f.containsProperty(TranslationProperty.NO_GARBAGE_COLLECT)) && !node.returnVoid() && node.returnType() == Node.ADDR) {
			fox.getEventHandler().triggerEvent(F0xEventType.GCRegister, new F0xEventNodeParsing(fox, list, c, f, node));
		}
		if(!node.returnVoid()) {
			list.add("push reg0");
		}
	}
	
	
}
