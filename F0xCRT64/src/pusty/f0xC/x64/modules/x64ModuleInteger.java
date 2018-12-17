package pusty.f0xC.x64.modules;

import pusty.f0xC.ContextClass;
import pusty.f0xC.F0xUtil;
import pusty.f0xC.module.F0xEventSubscription;
import pusty.f0xC.module.F0xEvent.F0xEventPriority;
import pusty.f0xC.module.F0xEvent.F0xEventType;
import pusty.f0xC.module.event.F0xEventNodeStackParsing;
import pusty.f0xC.module.event.F0xEventParsing;
import pusty.f0xC.x64.StringConfig64;
import pusty.f0xC.x86.modules.x86ModuleInteger;

public class x64ModuleInteger extends x86ModuleInteger {

	@Override
	public String uniqueIdentifier() {
		return "x64Integer";
	}

	/*@F0xEventSubscription(event=F0xEventType.ParseNodeConstBYTE, priority=F0xEventPriority.NORMAL)
	public void nodeCONST_INT8(F0xEventNodeConstParsing event) {
		event.getCurrentList().add("mov reg0, "+Integer.toString(((byte)event.getNode().getValue())&0xFF));
		event.getCurrentList().add("movsx reg0, reg0b");
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeConstSHORT, priority=F0xEventPriority.NORMAL)
	public void nodeCONST_INT16(F0xEventNodeConstParsing event) {
		event.getCurrentList().add("mov reg0, "+Integer.toString(((short)event.getNode().getValue())&0xFFFF));
		event.getCurrentList().add("movsx reg0, reg0s");
	}	
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeConstINT, priority=F0xEventPriority.NORMAL)
	public void nodeCONST_INT32(F0xEventNodeConstParsing event) {
		event.getCurrentList().add("xor reg0, reg0");
		event.getCurrentList().add("mov reg0d, "+Integer.toString((int)event.getNode().getValue()));
	}*/
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeStackPUSHINT, priority=F0xEventPriority.NORMAL)
	public void nodeSTACK_PUSHINT(F0xEventNodeStackParsing event) {
		event.getCurrentList().add("cdqe");
		event.getCurrentList().add("push reg"+event.getIndex());
	}
	
	/*@F0xEventSubscription(event=F0xEventType.ParseNodeStackPOPINT, priority=F0xEventPriority.NORMAL)
	public void nodeSTACK_POPINT(F0xEventNodeStackParsing event) {
		event.getCurrentList().add("pop reg"+event.getIndex());
		event.getCurrentList().add("mov reg"+event.getIndex()+", reg"+event.getIndex());
	}*/	

	@F0xEventSubscription(event=F0xEventType.Code)
	public void arrayCheck(F0xEventParsing event) {
		event.getCurrentList().add(F0xUtil.formatFunction("array_checkBounds")+":");
		event.getCurrentList().add("cmp reg2d, [reg1+"+ContextClass.arrayLength(event.getF0xC().getParser().getAddressSize())+"]");
		event.getCurrentList().add("jl "+F0xUtil.formatFunction("array_checkBounds_ok"));
		event.getCurrentList().add("push reg1");
		event.getCurrentList().add("push reg2");
		event.getCurrentList().add("call "+F0xUtil.formatFunction(StringConfig64.strInternalOutOfBounds()));
		event.getCurrentList().add("pop reg2");
		event.getCurrentList().add("pop reg1");
		event.getCurrentList().add("ret");
		event.getCurrentList().add(F0xUtil.formatFunction("array_checkBounds_ok")+":");
		event.getCurrentList().add("ret");
	}
}
