package pusty.f0xC.x86.modules;

import pusty.f0xC.module.F0xEventSubscription;
import pusty.f0xC.module.F0xModule;
import pusty.f0xC.module.F0xEvent.F0xEventType;
import pusty.f0xC.module.event.F0xEventParsing;
import pusty.f0xC.x86.StringConfig86;

public class x86ModuleDiagnostic extends F0xModule {

	@Override
	public String uniqueIdentifier() {
		return "x86Diagnositc";
	}

	@F0xEventSubscription(event=F0xEventType.Data)
	public void placeDebugStrings(F0xEventParsing event) {
    	event.getCurrentList().add("debugFixedStrings:");
    	event.getCurrentList().add("debug_allocStr:    db 'Overall: [F:% 2d M: % 2d]',10,0");
    	event.getCurrentList().add("debug_allocMemStr: db 'Allocated Memory: [%d/%d]',10,0");
    	event.getCurrentList().add("debug_allocHeader: db '========= DIAGNOSTICS =========',10,0");
    	event.getCurrentList().add("debug_allocFooter: db '===============================',10,0");
    	event.getCurrentList().add("debug_freeMsg:     db '[#] Freeing  \"%s\" [%04X]',10,0");
    	event.getCurrentList().add("debug_allocMsg:    db '[#] Allocing \"%s\" [%04X]',10,0");
    	event.getCurrentList().add("debug_gbRegMsg:    db '[#] Register \"%s\" [%04X]',10,0");
    	event.getCurrentList().add("debug_gbMsg:       db '[#] Collect  \"%s\" [%04X]',10,0");
    	event.getCurrentList().add("debug_gbFullMsg:   db '[#] Garbage Collector Full!',10,0");
	}
	
	//note that this is fasm specific and doesn't request the libc_printf import
	@F0xEventSubscription(event=F0xEventType.Diagnostic)
	public void diagnostics(F0xEventParsing event) {
		event.getCurrentList().add("cinvoke libc_printf, debug_allocHeader");
		event.getCurrentList().add("cinvoke libc_printf, debug_allocMemStr, addrname ["+StringConfig86.strVarFreeCalls()+"], addrname ["+StringConfig86.strVarAllocCalls()+"]");
		event.getCurrentList().add("cinvoke libc_printf, debug_allocStr, addrname ["+StringConfig86.strVarFreedMemory()+"], addrname ["+StringConfig86.strVarAllocMemory()+"]");
		event.getCurrentList().add("cinvoke libc_printf, debug_allocFooter");
	}
	

}
