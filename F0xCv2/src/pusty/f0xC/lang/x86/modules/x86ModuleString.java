package pusty.f0xC.lang.x86.modules;

import java.util.Map.Entry;

import pusty.f0xC.F0xStr;
import pusty.f0xC.lang.x86.Parser86;
import pusty.f0xC.module.F0xEventSubscription;
import pusty.f0xC.module.F0xModule;
import pusty.f0xC.module.F0xEvent.F0xEventPriority;
import pusty.f0xC.module.F0xEvent.F0xEventType;
import pusty.f0xC.module.event.F0xEventParsing;

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
	    event.getCurrentList().add("   "+Parser86.getStringVarName("")+"       dd 0"); //zero string has to be first
	    for(Entry<Integer, String> strMap:event.getF0xC().getStaticStrings().entrySet()) {
	    	if(strMap.getValue().equals("")) continue;
	    	event.getCurrentList().add("   "+Parser86.getStringVarName(strMap.getValue())+"       dd 0");
	    }
	    event.getCurrentList().add("   "+"dd 0");
	    event.getCurrentList().add("   stringTableData:");
	    event.getCurrentList().add("   "+Parser86.getStringVarName("")+"_value db "+event.getF0xC().getParser().dumpByte(0)); //zero string has to be first
	    for(Entry<Integer, String> strMap:event.getF0xC().getStaticStrings().entrySet()) {
	    	if(strMap.getValue().equals("")) continue;
	    	event.getCurrentList().add("   "+Parser86.getStringVarName(strMap.getValue())+"_value db "+event.getF0xC().getParser().dumpString(strMap.getValue()));
	    }
	    event.getCurrentList().add("   "+"dd "+event.getF0xC().getParser().dumpByte(0));
	}
	

	@F0xEventSubscription(event=F0xEventType.Init, priority=F0xEventPriority.HIGH)
	public void stringInit(F0xEventParsing event) {
		event.getCurrentList().add("call "+x86ModuleDefault.formatFunction(F0xStr.strInternalStringTableInit()));
	}
	
	@F0xEventSubscription(event=F0xEventType.Free, priority=F0xEventPriority.HIGH)
	public void stringFree(F0xEventParsing event) { 
		event.getCurrentList().add("call "+x86ModuleDefault.formatFunction(F0xStr.strInternalStringTableFree()));
	}
	


	
	
}
