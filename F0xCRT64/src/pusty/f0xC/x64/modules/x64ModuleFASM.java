package pusty.f0xC.x64.modules;

import java.util.ArrayList;
import java.util.HashMap;
import pusty.f0xC.lang.OverrideHandler.ExternalProperty;
import pusty.f0xC.lang.OverrideHandler.ExternalPropertyObject;
import pusty.f0xC.module.F0xEvent.F0xEventPriority;
import pusty.f0xC.module.F0xEvent.F0xEventType;
import pusty.f0xC.module.F0xEventSubscription;
import pusty.f0xC.module.F0xModule;
import pusty.f0xC.module.event.F0xEventParsing;

public class x64ModuleFASM extends F0xModule {

	@Override
	public String uniqueIdentifier() {
		return "FASM PE64";
	}
	
	@F0xEventSubscription(event=F0xEventType.StartParsingCode, priority=F0xEventPriority.HIGH)
	public void startParsingCode(F0xEventParsing event) {
		event.getCurrentList().add("; FASM DEBUG MACROS [HEADER AND SECTION ALIGNMENT]");
		event.getCurrentList().add("format PE64 console");
		event.getCurrentList().add("entry start_function");
		event.getCurrentList().add("include 'C:\\fasm\\INCLUDE\\win64a.inc'");
		event.getCurrentList().add("");
		event.getCurrentList().add("section '.text' code readable executable");
		event.getCurrentList().add("");	
	}
	
	@F0xEventSubscription(event=F0xEventType.StartParsingData, priority=F0xEventPriority.HIGH)
	public void startParsingData(F0xEventParsing event) {
		event.getCurrentList().add(";FASM DATA SECTION");
		event.getCurrentList().add("section '.data' data readable writeable");
		event.getCurrentList().add("db 0");    
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseImport, priority=F0xEventPriority.HIGH)
	public void startParsingImport(F0xEventParsing event) {
		
		ArrayList<ExternalPropertyObject> epo = event.getF0xC().getExternalProperties();
		HashMap<String, HashMap<String,String>> importMap = new HashMap<String, HashMap<String, String>>();
		for(ExternalPropertyObject ep:epo) {
			if(ep.getProperty() != ExternalProperty.IMPORT) continue;
			if(ep.getParent().equals("")) {
				System.err.println("Error importing '"+ep.getKey()+"' from '"+ep.getParent()+"'");
				continue;
			}
			if(importMap.containsKey(ep.getParent().toLowerCase()))
				importMap.get(ep.getParent().toLowerCase()).put(ep.getAlias(),ep.getKey());
			else {
				importMap.put(ep.getParent().toLowerCase(), new HashMap<String, String>());
				importMap.get(ep.getParent().toLowerCase()).put(ep.getAlias(),ep.getKey());
			}
		}
		
		event.getCurrentList().add("");
		event.getCurrentList().add("; FASM IMPORT MACROS [DYNAMICLY IMPORTED]");
		event.getCurrentList().add("section '.idata' data import readable");
		event.getCurrentList().add("include \"C:\\FASM\\INCLUDE\\macro\\import64.inc\"");
		
		event.getCurrentList().add("");

		//include library statements
		String[] libraries = importMap.keySet().toArray(new String[importMap.size()]);
		for(int i=0;i<libraries.length;i++) {
			String lib = "";
			if(i == 0)
				lib = "library ";
			else
				lib = "        ";
			lib += libraries[i];
			lib += ", \"";
			lib += libraries[i];
			lib += ".dll\"";
			if(i != libraries.length-1)
				lib += ",\\";
			event.getCurrentList().add(lib);
		}
		
		event.getCurrentList().add("");

		//add actual imports
		for(String key:libraries) {
			event.getCurrentList().add("import "+key+",\\");
			HashMap<String,String> l = importMap.get(key);
			String[] imports = l.keySet().toArray(new String[l.size()]);
			for(int i=0;i<l.size();i++) {
				String imp = "       "+imports[i]+", '"+l.get(imports[i])+"'";
				if(i != l.size()-1) //remove the ",\" for the last entry
					imp = imp+",\\";
				event.getCurrentList().add(imp);
			}
		}
		
		
	}
	
	

}
