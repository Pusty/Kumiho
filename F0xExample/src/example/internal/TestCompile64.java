package example.internal;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;

import pusty.f0cr.bridge.F0CrBridge;
import pusty.f0xC.ContextClass;
import pusty.f0xC.F0xC;
import pusty.f0xC.x64.Parser64;
import pusty.f0xC.x64.modules.*;

public class TestCompile64 {
	public static void main(String[] args) throws Exception {
		F0CrBridge.addPath(System.getProperty("user.dir")+"/../F0xCv2/bin/");
		F0CrBridge.addPath(System.getProperty("user.dir")+"/../F0xCRT/bin/");
		//F0CrBridge.addPath(System.getProperty("user.dir")+"/../F0xCRT32/bin/");
		F0CrBridge.addPath(System.getProperty("user.dir")+"/../F0xCRT64/bin/");
		F0CrBridge.addPath(System.getProperty("user.dir")+"/../F0xExample/bin/");
		
		//F0CrBridge.addPath(System.getProperty("user.dir")+"/../F0xDc/bin/");
		F0xC.DEBUG_MODE=true;
		F0xC fox = new F0xC(new Parser64());
		
		//String p = "pusty/f0xdc/tests/TestTableDumping";
		String p = "example/internal/Example";
		
		ArrayList<ContextClass> cList = F0CrBridge.runThroughClass(fox, p); //"pusty/f0x86/F0x86"
		fox.set(cList.toArray(new ContextClass[cList.size()]));
		for(ContextClass c:fox.getRegistedClasses()) {
			c.computeIndex(fox.getParser().getAddressSize(), fox.getRegistedClasses());
			c.processFunctions(fox.getRegistedClasses());
		}
		
		//Currently Registering has to be done after processing
		fox.getEventHandler().registerModule(new x64ModuleDefault());
		fox.getEventHandler().registerModule(new x64ModuleFASM());
		fox.getEventHandler().registerModule(new x64ModuleGC());
		fox.getEventHandler().registerModule(new x64ModuleString());
		if(F0xC.DEBUG_MODE)
			fox.getEventHandler().registerModule(new x64ModuleDiagnostic());
		
		fox.getEventHandler().registerModule(new x64ModuleInteger());
		fox.getEventHandler().registerModule(new x64ModuleObject());
		fox.getEventHandler().registerModule(new x64ModuleFloat());
		fox.getEventHandler().registerModule(new x64ModuleDouble());
		fox.getEventHandler().registerModule(new x64ModuleLong());
		
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
