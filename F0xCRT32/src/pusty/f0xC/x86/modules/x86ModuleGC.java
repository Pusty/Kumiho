package pusty.f0xC.x86.modules;

import pusty.f0xC.module.F0xEvent.F0xEventPriority;
import pusty.f0xC.module.F0xEvent.F0xEventType;
import pusty.f0xC.F0xUtil;
import pusty.f0xC.module.F0xEventSubscription;
import pusty.f0xC.module.F0xModule;
import pusty.f0xC.module.event.F0xEventNodeParsing;
import pusty.f0xC.module.event.F0xEventParsing;
import pusty.f0xC.x86.StringConfig86;

public class x86ModuleGC extends F0xModule {

	@Override
	public String uniqueIdentifier() {
		return "x86GarbageCollector";
	}
	
	
	@F0xEventSubscription(event=F0xEventType.Code, priority=F0xEventPriority.NORMAL)
	public void gcWrapper(F0xEventParsing event) {
		event.getCurrentList().add(F0xUtil.formatFunction(StringConfig86.strGarbageCollectWrapper())+":");
		event.getCurrentList().add("pushfd");
		event.getCurrentList().add("push dword [regB]");
		event.getCurrentList().add("call "+F0xUtil.formatFunction(StringConfig86.strGarbageCollect()));
		event.getCurrentList().add("add regS, addrsize");
		event.getCurrentList().add("popfd");
	    event.getCurrentList().add("ret");
	}
	
	
	@F0xEventSubscription(event=F0xEventType.GCRegister, priority=F0xEventPriority.NORMAL)
	public void gcRegister(F0xEventNodeParsing event) {
		event.getCurrentList().add("push reg0"); //push object reference
		event.getCurrentList().add("mov reg1, addrname [regB]"); //get the current stack frame for garbage collection
		event.getCurrentList().add("push reg1");
		event.getCurrentList().add("call "+F0xUtil.formatFunction(StringConfig86.strGarbageRegister()));			
		event.getCurrentList().add("pop reg1");
		event.getCurrentList().add("pop reg0");
	}
	
	@F0xEventSubscription(event=F0xEventType.GCCollect, priority=F0xEventPriority.NORMAL)
	public void gcCollect(F0xEventNodeParsing event) {
		event.getCurrentList().add("call "+F0xUtil.formatFunction(StringConfig86.strGarbageCollect()));
	}
	
	@F0xEventSubscription(event=F0xEventType.GCCollectKeepFlags, priority=F0xEventPriority.NORMAL)
	public void gcCollectKeepFlags(F0xEventNodeParsing event) {
		event.getCurrentList().add("call "+F0xUtil.formatFunction(StringConfig86.strGarbageCollectWrapper()));
	}
	
	@F0xEventSubscription(event=F0xEventType.GCEnable, priority=F0xEventPriority.NORMAL)
	public void gcEnable(F0xEventNodeParsing event) {
		event.getCurrentList().add("call "+F0xUtil.formatFunction(StringConfig86.strGarbageEnable()));
	}
	
	@F0xEventSubscription(event=F0xEventType.GCDisable, priority=F0xEventPriority.NORMAL)
	public void gcDisable(F0xEventNodeParsing event) {
		event.getCurrentList().add("call "+F0xUtil.formatFunction(StringConfig86.strGarbageDisable()));
	}
	
	@F0xEventSubscription(event=F0xEventType.Init, priority=F0xEventPriority.HIGH)
	public void gcInit(F0xEventParsing event) {
		event.getCurrentList().add("call "+F0xUtil.formatFunction(StringConfig86.strCreateGB())); //create garbage collector
	}
	
	@F0xEventSubscription(event=F0xEventType.Free, priority=F0xEventPriority.HIGH)
	public void gcFree(F0xEventParsing event) { 
		event.getCurrentList().add("call "+F0xUtil.formatFunction(StringConfig86.strDeleteGB())); //delete garbage collector
	}

}
