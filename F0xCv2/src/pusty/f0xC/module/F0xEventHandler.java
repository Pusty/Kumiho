package pusty.f0xC.module;

import java.lang.reflect.Method;
import java.util.ArrayList;

import pusty.f0xC.F0xC;
import pusty.f0xC.module.F0xEvent.F0xEventPriority;
import pusty.f0xC.module.F0xEvent.F0xEventStatus;
import pusty.f0xC.module.F0xEvent.F0xEventType;

public class F0xEventHandler {
	
	private F0xModule[][] moduleMap;
	private Method[][]    methodMap;
	
	//Code functions don't behave like other functions, they can't be overwritten nor be removed
	private ArrayList<ModuleMethodPair> codeFunctionMap;
	//Data functions don't behave like other functions, they can't be overwritten nor be removed
	private ArrayList<ModuleMethodPair> dataFunctionMap;
	//Init functions don't behave like other functions, they can't be overwritten nor be removed
	private ArrayList<ModuleMethodPair> initFunctionMap;
	//Free functions don't behave like other functions, they can't be overwritten nor be removed
	private ArrayList<ModuleMethodPair> freeFunctionMap;
	
	protected F0xC fox;
	
	public F0xEventHandler(F0xC f) {
		moduleMap = new F0xModule[F0xEventPriority.values().length][F0xEventType.values().length];
		for(int x=0;x<moduleMap.length;x++)
			for(int y=0;y<moduleMap[x].length;y++)
				moduleMap[x][y] = null;
		methodMap = new Method[F0xEventPriority.values().length][F0xEventType.values().length];
		for(int x=0;x<methodMap.length;x++)
			for(int y=0;y<methodMap[x].length;y++)
				methodMap[x][y] = null;		
		codeFunctionMap = new ArrayList<ModuleMethodPair>();
		dataFunctionMap = new ArrayList<ModuleMethodPair>();
		initFunctionMap = new ArrayList<ModuleMethodPair>();
		freeFunctionMap = new ArrayList<ModuleMethodPair>();
		fox = f;
	}
	
	/**
	 * Register a module into the handler
	 * @param module the module to register
	 */
	public void registerModule(F0xModule module) {
		Method[] methods = module.getClass().getMethods();
		for(int a=0;a<methods.length;a++) {
			F0xEventSubscription f = methods[a].getAnnotation(F0xEventSubscription.class);
			if(f == null) continue;
			if(f.event() == F0xEventType.Data)
				dataFunctionMap.add(new ModuleMethodPair(module, methods[a], f.priority()));
			else if(f.event() == F0xEventType.Code)
				codeFunctionMap.add(new ModuleMethodPair(module, methods[a], f.priority()));
			else if(f.event() == F0xEventType.Init)
				initFunctionMap.add(new ModuleMethodPair(module, methods[a], f.priority()));
			else if(f.event() == F0xEventType.Free)
				freeFunctionMap.add(new ModuleMethodPair(module, methods[a], F0xEventPriority.values()[F0xEventPriority.values().length-f.priority().ordinal()-1]));
			else {
				moduleMap[f.priority().ordinal()][f.event().ordinal()] = module;
				methodMap[f.priority().ordinal()][f.event().ordinal()] = methods[a];
			}
		}
	}
	
	/**
	 * Unregister a module from the handler
	 * @param uid the unique identifier of the module to remove
	 */
	public void unregisterModule(String uid) {
		for(int x=0;x<moduleMap.length;x++)
			for(int y=0;y<moduleMap[x].length;y++)
				if(moduleMap[x][y].uniqueIdentifier().equals(uid)) {
					moduleMap[x][y] = null;
					methodMap[x][y] = null;
				}
	}
	
	
	public void triggerEvent(F0xEventType type, F0xEvent event, F0xEventPriority priority) {
		if(event.getStatus().equals(F0xEventStatus.CANCELLED)) return;	
		//Data Parsing
		if(type == F0xEventType.Data) {	
			for(ModuleMethodPair mmp:dataFunctionMap) {
				if(mmp.priority != priority) continue;
				try { mmp.method.invoke(mmp.module, event);
				}catch(IllegalArgumentException iae) { printError(mmp.module, mmp.method, event);
				}catch (Exception e) { e.printStackTrace();	}
			}
			return;
		}else if(type == F0xEventType.Code) {	
			for(ModuleMethodPair mmp:codeFunctionMap) {
				if(mmp.priority != priority) continue;
				try { mmp.method.invoke(mmp.module, event);
				}catch(IllegalArgumentException iae) { printError(mmp.module, mmp.method, event);
				}catch (Exception e) { e.printStackTrace();	}
			}
			return;
		}else if(type == F0xEventType.Init) {
			for(int i=0;i<initFunctionMap.size();i++) {
				ModuleMethodPair mmp = initFunctionMap.get(i);
				if(mmp.priority != priority) continue;
				try { mmp.method.invoke(mmp.module, event);
				}catch(IllegalArgumentException iae) { printError(mmp.module, mmp.method, event);
				}catch (Exception e) { e.printStackTrace();	}
			} return;
		}else if(type == F0xEventType.Free) {
			for(int i=freeFunctionMap.size()-1;i>=0;i--) {
				ModuleMethodPair mmp = freeFunctionMap.get(i);
				if(mmp.priority != priority) continue;
				try { mmp.method.invoke(mmp.module, event);
				}catch(IllegalArgumentException iae) { printError(mmp.module, mmp.method, event);
				}catch (Exception e) { e.printStackTrace();	}
			} return;
		}
		
		if(methodMap[priority.ordinal()][type.ordinal()] == null) return;
		try {
			moduleMap[priority.ordinal()][type.ordinal()].invokeModule();
			methodMap[priority.ordinal()][type.ordinal()].invoke(moduleMap[priority.ordinal()][type.ordinal()], event);
		}catch(IllegalArgumentException iae) {
			printError(moduleMap[priority.ordinal()][type.ordinal()], methodMap[priority.ordinal()][type.ordinal()], event);
		}catch (Exception e) { e.printStackTrace(); }
	}
	
	private static void printError(F0xModule mo, Method me, F0xEvent event) {
		String t = "Illegal Argument Exception: ";
		t += mo.getClass().getSimpleName();
		t += ".";
		t += me.getName();
		t += " -> ";
		t += event;
		System.err.println(t);
	}
	
	public void triggerEvent(F0xEventType type, F0xEvent event) {
		for(int i=0;i<F0xEventPriority.values().length;i++)
			triggerEvent(type, event, F0xEventPriority.values()[i]);
	}
	
	private class ModuleMethodPair {
		protected F0xModule module;
		protected Method method;
		protected F0xEventPriority priority;
		public ModuleMethodPair(F0xModule mo, Method me, F0xEventPriority pr) {
			module = mo;
			method = me;
			priority = pr;
		}
	}
	
}
