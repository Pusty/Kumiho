package kumiho.main;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;

import kumiho.modified.x86InternalXOR;
import pusty.f0cr.bridge.F0CrBridge;
import pusty.f0xC.ContextClass;
import pusty.f0xC.F0xC;
import pusty.f0xC.x86.Parser86;
import pusty.f0xC.x86.modules.*;

public class KumihoSetup {
	public static void main(String[] args) throws Exception {
		F0CrBridge.addPath(System.getProperty("user.dir")+"/../F0xCv2/bin/");
		F0CrBridge.addPath(System.getProperty("user.dir")+"/../F0xCRT/bin/");
		F0CrBridge.addPath(System.getProperty("user.dir")+"/../F0xCRT32/bin/");
		//F0CrBridge.addPath(System.getProperty("user.dir")+"/../F0xCRT64/bin/");
		F0CrBridge.addPath(System.getProperty("user.dir")+"/../F0xExample/bin/");
		
		String mainClass = "kumiho/main/KumihoTestcase";
		//F0xC.DEBUG_MODE=false;
		int xorKey = 0xABABABAB;
		F0xC fox = new F0xC(new Parser86() {
			@Override
			public String dumpByte(int i) {
				return Integer.toString((i&0xFF)^(xorKey&0xFF));
			}
		});
		
		//register overwrite of x86Kumiho
		fox.getParser().getOverrideHandler().registerOverride(x86Kumiho.class);
		x86InternalXOR.XOR_KEY = xorKey;
		fox.getParser().getOverrideHandler().registerOverride(x86InternalXOR.class);
		
		ArrayList<String> slist = new ArrayList<String>();
		slist.add("pusty/f0xC/x86/internal/Internal");
		slist.add("kumiho/main/Kumiho");
		ArrayList<ContextClass> cList = F0CrBridge.runThroughClass(fox, mainClass, slist);
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
		
		//fox.getEventHandler().registerModule(new x86IncludeEncryptedFile(new File("test.asm")));
		fox.getEventHandler().registerModule(new x86IncludeEncryptedFile(new File("etc/NoREpls.exe")));
		
		while(!fox.isDone())
			fox.iterate();
		fox.simplify();
		System.out.println("--------------------------------------------------");
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
