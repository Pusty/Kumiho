package pusty.f0xC.lang.x86.modules;

import pusty.f0xC.module.F0xEvent.F0xEventPriority;
import pusty.f0xC.module.F0xEvent.F0xEventType;
import pusty.f0xC.module.F0xEventSubscription;
import pusty.f0xC.module.F0xModule;
import pusty.f0xC.module.event.F0xEventNodeParsing;
import pusty.f0xC.module.event.F0xEventParsing;

public class x86ModuleGC extends F0xModule {

	@Override
	public String uniqueIdentifier() {
		return "GarbageCollector";
	}
	
	
	@F0xEventSubscription(event=F0xEventType.Code, priority=F0xEventPriority.NORMAL)
	public void gcWrapper(F0xEventParsing event) {
		event.getCurrentList().add(x86ModuleDefault.formatFunction("pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V")+":");
		event.getCurrentList().add("pushfd");
		event.getCurrentList().add("push dword [regB]");
		event.getCurrentList().add("call "+x86ModuleDefault.formatFunction(strInternalGarbageCollect()));
		event.getCurrentList().add("add regS, addrsize");
		event.getCurrentList().add("popfd");
	    event.getCurrentList().add("ret");
	}
	
	
	@F0xEventSubscription(event=F0xEventType.GCRegister, priority=F0xEventPriority.NORMAL)
	public void gcRegister(F0xEventNodeParsing event) {
		event.getCurrentList().add("push reg0"); //push object reference
		event.getCurrentList().add("mov reg1, addrname [regB]"); //get the current stack frame for garbage collection
		event.getCurrentList().add("push reg1");
		event.getCurrentList().add("call "+x86ModuleDefault.formatFunction(strInternalGarbageRegister()));			
		event.getCurrentList().add("pop reg1");
		event.getCurrentList().add("pop reg0");
	}
	
	@F0xEventSubscription(event=F0xEventType.GCCollect, priority=F0xEventPriority.NORMAL)
	public void gcCollect(F0xEventNodeParsing event) {
		event.getCurrentList().add("call "+x86ModuleDefault.formatFunction(strInternalGarbageCollect()));
	}
	
	@F0xEventSubscription(event=F0xEventType.GCCollectKeepFlags, priority=F0xEventPriority.NORMAL)
	public void gcCollectKeepFlags(F0xEventNodeParsing event) {
		event.getCurrentList().add("call "+x86ModuleDefault.formatFunction(strInternalGarbageCollectWrapper()));
	}
	
	@F0xEventSubscription(event=F0xEventType.GCEnable, priority=F0xEventPriority.NORMAL)
	public void gcEnable(F0xEventNodeParsing event) {
		event.getCurrentList().add("call "+x86ModuleDefault.formatFunction(strInternalGarbageEnable()));
	}
	
	@F0xEventSubscription(event=F0xEventType.GCDisable, priority=F0xEventPriority.NORMAL)
	public void gcDisable(F0xEventNodeParsing event) {
		event.getCurrentList().add("call "+x86ModuleDefault.formatFunction(strInternalGarbageDisable()));
	}
	
	
	
	@F0xEventSubscription(event=F0xEventType.Init, priority=F0xEventPriority.HIGH)
	public void gcInit(F0xEventParsing event) {
		event.getCurrentList().add("call "+x86ModuleDefault.formatFunction(strInternalCreateGB())); //create garbage collector
	}
	
	@F0xEventSubscription(event=F0xEventType.Free, priority=F0xEventPriority.HIGH)
	public void gcFree(F0xEventParsing event) { 
		event.getCurrentList().add("call "+x86ModuleDefault.formatFunction(strInternalDeleteGB())); //delete garbage collector
	}
	
	public static String strInternal() {
		return "pusty/f0xC/imports/Internal";
	}
	public static String strInternalGarbageCollectWrapper() {
		return strInternal()+".garbage_collect_wrapper_I_V";
	}
	public static String strInternalGarbageCollect() {
		return strInternal()+".garbage_collect_I_V";
	}
	public static String strInternalGarbageRegister() {
		return strInternal()+".garbage_register_Ljava_lang_ObjectI_V";
	}
	public static String strInternalGarbageEnable() {
		return strInternal()+".garbage_enable_I_V";
	}
	public static String strInternalGarbageDisable() {
		return strInternal()+".garbage_disable_I_V";
	}
	public static String strInternalDeleteGB() {
		return strInternal()+".deleteGB__V";
	}
	public static String strInternalCreateGB() {
		return strInternal()+".createGB__V";
	}
	

}
