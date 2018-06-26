package pusty.f0xdc.tests;

import java.io.File;

import pusty.f0xdc.location.Address;
import pusty.f0xdc.payload.InjectingEngine;
import pusty.f0xdc.weaver.NewSectionWeaver;

//Testing Section Injection
public class TestSectionInjection {
	public static void main(String[] args) throws Exception {
		File file = new File("NoREpls.exe");
		File payload = new File("payload\\msgbox_dynamic");
		NewSectionWeaver weaver = NewSectionWeaver.runFromFiles(file, payload);
		InjectingEngine.filterDirect(weaver.getReader(), weaver.getPayload(), weaver.getSection(), new Address(0xAAAAAAAA), "user32.dll", "MessageBoxA");
		InjectingEngine.filterReturn(weaver.getReader(), weaver.getPayload(), weaver.getSection(), new Address(0xAAAAAAAA));
		InjectingEngine.replaceInt(weaver.getReader(), weaver.getPayload(), weaver.getSection(), 0xBBBBBBBB, weaver.getSection().getAddressFrom());
		File output = new File("output.exe");
		output.delete();
		output.createNewFile();
		weaver.getReader().save(output);
		System.out.println("****************************************************************");
		System.out.println("[*] Done");
//		ExecutableReader reader = ExecutableReader.create(file);
//		SectionSearcher searcher  = new SectionSearcher(128);
//		int result = searcher.search(reader);
//		System.out.println(result);
		
	}
}
