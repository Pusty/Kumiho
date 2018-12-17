package pusty.f0xC.x64.modules;

import pusty.f0xC.F0xUtil;
import pusty.f0xC.module.F0xEventSubscription;
import pusty.f0xC.module.F0xEvent.F0xEventPriority;
import pusty.f0xC.module.F0xEvent.F0xEventType;
import pusty.f0xC.module.event.F0xEventParsing;
import pusty.f0xC.x64.StringConfig64;
import pusty.f0xC.x86.modules.x86ModuleString;

public class x64ModuleString extends x86ModuleString {

	@Override
	public String uniqueIdentifier() {
		return "x64DefaultString";
	}

	@F0xEventSubscription(event=F0xEventType.Init, priority=F0xEventPriority.HIGH)
	public void stringInit(F0xEventParsing event) {
		event.getCurrentList().add("call "+F0xUtil.formatFunction(StringConfig64.strInternalStringTableInit()));
	}
	
	@F0xEventSubscription(event=F0xEventType.Free, priority=F0xEventPriority.HIGH)
	public void stringFree(F0xEventParsing event) { 
		event.getCurrentList().add("call "+F0xUtil.formatFunction(StringConfig64.strInternalStringTableFree()));
	}
	


	
	
}
