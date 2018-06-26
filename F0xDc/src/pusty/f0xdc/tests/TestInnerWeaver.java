package pusty.f0xdc.tests;

import java.io.File;

import pusty.f0xdc.payload.InjectingEngine;
import pusty.f0xdc.weaver.InnerWeaver;

//Testing inner weaver message box
public class TestInnerWeaver {
	public static void main(String[] args) throws Exception {
		File file = new File("example64.exe");
		File payload = new File("payload\\inner_weaver\\inner_msgboxpex86-64");
		InnerWeaver weaver = InnerWeaver.runFromFiles(file, payload);
		InjectingEngine.filterDirect(weaver.getReader(), weaver.getPayload(), weaver.getSections(), weaver.getReader().getDummyAddress("A"), "user32.dll", "MessageBoxA");
		File output = new File("output.exe");
		output.delete();
		output.createNewFile();
		weaver.getReader().save(output);
		System.out.println("****************************************************************");
		System.out.println("[*] Done");
		
	}
}
