package pusty.f0xC.x86.modules;

import java.util.Map.Entry;

import pusty.f0xC.module.F0xEventSubscription;
import pusty.f0xC.module.F0xModule;
import pusty.f0xC.F0xUtil;
import pusty.f0xC.module.F0xEvent.F0xEventPriority;
import pusty.f0xC.module.F0xEvent.F0xEventType;
import pusty.f0xC.module.event.F0xEventParsing;
import pusty.f0xC.x86.StringConfig86;

public class x86ModuleString extends F0xModule {

	@Override
	public String uniqueIdentifier() {
		return "x86DefaultString";
	}
	
	@F0xEventSubscription(event=F0xEventType.Data)
	public void createStringTable(F0xEventParsing event) {
	//	if(getInvokes() == 0) return;
	    event.getCurrentList().add("");
	    event.getCurrentList().add(";Static String Map");    
	    event.getCurrentList().add("   stringTable:");
	    event.getCurrentList().add("   "+F0xUtil.getStringVarName("")+":       storeref 0"); //zero string has to be first
	    for(Entry<Integer, String> strMap:event.getF0xC().getStaticStrings().entrySet()) {
	    	if(strMap.getValue().equals("")) continue;
	    	event.getCurrentList().add("   "+F0xUtil.getStringVarName(strMap.getValue())+":       storeref 0");
	    }
	    event.getCurrentList().add("   "+"storeref 0");
	    event.getCurrentList().add("   stringTableData:");
	    event.getCurrentList().add("   "+F0xUtil.getStringVarName("")+"_value: db "+event.getF0xC().getParser().dumpByte(0)); //zero string has to be first
	    for(Entry<Integer, String> strMap:event.getF0xC().getStaticStrings().entrySet()) {
	    	if(strMap.getValue().equals("")) continue;
	    	event.getCurrentList().add("   "+F0xUtil.getStringVarName(strMap.getValue())+"_value: db "+event.getF0xC().getParser().dumpString(strMap.getValue()));
	    }
	    event.getCurrentList().add("   "+"storeref "+event.getF0xC().getParser().dumpByte(0));
	}
	

	@F0xEventSubscription(event=F0xEventType.Init, priority=F0xEventPriority.HIGH)
	public void stringInit(F0xEventParsing event) {
		event.getCurrentList().add("call "+F0xUtil.formatFunction(StringConfig86.strInternalStringTableInit()));
	}
	
	@F0xEventSubscription(event=F0xEventType.Free, priority=F0xEventPriority.HIGH)
	public void stringFree(F0xEventParsing event) { 
		event.getCurrentList().add("call "+F0xUtil.formatFunction(StringConfig86.strInternalStringTableFree()));
	}

	
}
