package pusty.f0cr.bridge;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;

import pusty.f0xC.ContextClass;
import pusty.f0xC.F0xC;
import pusty.f0xC.lang.x86.Parser86;
import pusty.f0xC.lang.x86.modules.*;
import pusty.f0xC.lang.x86.modules.core.x86ModuleDouble;
import pusty.f0xC.lang.x86.modules.core.x86ModuleFloat;
import pusty.f0xC.lang.x86.modules.core.x86ModuleInteger;
import pusty.f0xC.lang.x86.modules.core.x86ModuleLong;
import pusty.f0xC.lang.x86.modules.core.x86ModuleObject;

public class TestCrBridge {
	public static void main(String[] args) throws Exception {
		String path = System.getProperty("user.dir")+"/bin/";
		//String mainClass = "kumiho/main/KumihoTestcase";
		//String mainClass = "example/windows/Debugger";
	    //String mainClass = "example/string/Example";
		String mainClass = "pusty/f0x86/F0x86";
		if(mainClass.contains("Debugger"))
			F0xC.DEBUG_MODE=false;

		F0xC fox = new F0xC(new Parser86());
		
		
		ArrayList<ContextClass> cList = F0CrBridge.runThroughClass(fox, path, mainClass);
		fox.set(cList.toArray(new ContextClass[cList.size()]));
		for(ContextClass c:fox.getRegistedClasses()) {
			c.computeIndex(fox.getParser().getAddressSize(), fox.getRegistedClasses());
			c.processFunctions(fox.getRegistedClasses());
		}
		//Currently Registering has to be done after processing
		fox.getEventHandler().registerModule(new x86ModuleDefault());
		fox.getEventHandler().registerModule(new x86ModuleFASM());
		fox.getEventHandler().registerModule(new x86ModuleGC());
		fox.getEventHandler().registerModule(new x86ModuleString());
		if(F0xC.DEBUG_MODE)
			fox.getEventHandler().registerModule(new x86ModuleDiagnostic());
		
		fox.getEventHandler().registerModule(new x86ModuleInteger());
		fox.getEventHandler().registerModule(new x86ModuleObject());
		fox.getEventHandler().registerModule(new x86ModuleFloat());
		fox.getEventHandler().registerModule(new x86ModuleDouble());
		fox.getEventHandler().registerModule(new x86ModuleLong());
		
		while(!fox.isDone()) {
			fox.iterate();
			//System.out.println(fox.last());
		}
		fox.simplify();
		System.out.println("--------------------------------------------------");
//		System.out.println();
		File outputFile = new File("temp/output.asm");
		outputFile.delete();
		outputFile.createNewFile();
		
		
		FileOutputStream fos = new FileOutputStream(outputFile);
		for(String s:fox.getResult()) {
			fos.write(s.getBytes());
			fos.write("\n".getBytes());
		}
		fos.close();
		
		System.out.println();

	}
	
}
