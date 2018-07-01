package kumiho.main;

import java.io.File;
import java.io.FileInputStream;

import pusty.f0xC.module.F0xEventSubscription;
import pusty.f0xC.module.F0xModule;
import pusty.f0xC.lang.x86.modules.x86ModuleDefault;
import pusty.f0xC.module.F0xEvent.F0xEventPriority;
import pusty.f0xC.module.F0xEvent.F0xEventType;
import pusty.f0xC.module.event.F0xEventParsing;

public class x86KumihoFile extends F0xModule {

	protected File file;
	private byte[] data;
	public x86KumihoFile(File file) {
		super();
		this.file = file;
		try {
			FileInputStream fis = new FileInputStream(this.file);
			data = new byte[fis.available()];
			fis.read(data);
			fis.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public String uniqueIdentifier() {
		return "x86KumihoFile";
	}
	
	@F0xEventSubscription(event=F0xEventType.StartParsingCode, priority=F0xEventPriority.HIGH)
	public void startParsingCode(F0xEventParsing event) {
		event.getCurrentList().add("; FASM DEBUG MACROS [HEADER AND SECTION ALIGNMENT]");
		event.getCurrentList().add("format PE console");
		event.getCurrentList().add("entry start_function");
		event.getCurrentList().add("include 'C:\\fasm\\INCLUDE\\win32a.inc'");
		event.getCurrentList().add("");
		/* tbh this is pretty stupid, but I don't know how to do this with FASM */
		/* A virtual offset / section would be WAAAY better */
//		event.getCurrentList().add("section '.orig' code readable writeable executable");
//		event.getCurrentList().add("repeat "+data.length);	
//		event.getCurrentList().add("nop");
//		event.getCurrentList().add("end repeat");
//		event.getCurrentList().add("");	
		event.getCurrentList().add("section '.text' code readable executable");
		event.getCurrentList().add("");	
	}
	
	
	private byte[] xtea(byte[] raw, byte[] key) {
		final int BLOCK_SIZE = 8;
		int new_size = raw.length;
		if(raw.length%BLOCK_SIZE != 0)  
			new_size = ((raw.length/8)+1)*BLOCK_SIZE;
		byte[] data = new byte[new_size];
		System.arraycopy(raw, 0, data, 0, raw.length);
		byte[] dataOutput = new byte[data.length];
		XTEA xtea = new XTEA();
		xtea.setKey(key);
		xtea.encrypt(data, dataOutput, 0, data.length);
		return dataOutput;
	}
	public byte[] processData(byte[] data) {		
		//data = QuickLZ.compress(data, 1);
		data = xtea(data, "0123456789ABCDEF".getBytes());	
		return data;
	}
	
	@F0xEventSubscription(event=F0xEventType.Data)
	public void includeFile(F0xEventParsing event) {
    	byte[] d = processData(data);
	    event.getCurrentList().add("");
	    event.getCurrentList().add(";File include");  
	    event.getCurrentList().add("   includedFileLen dd "+d.length);
    	String value = "";
    	for(byte c:d) {
    		value += (c&0xFF)+", ";
    	}
    	value += "0";
    	event.getCurrentList().add("   includedFile db "+value);    	
	}
	
	@F0xEventSubscription(event=F0xEventType.Init, priority=F0xEventPriority.NORMAL)
	public void fileInit(F0xEventParsing event) {
		event.getCurrentList().add("call "+x86ModuleDefault.formatFunction("kumiho/main/Kumiho.initFile__V"));
	}
	
	@F0xEventSubscription(event=F0xEventType.Free, priority=F0xEventPriority.NORMAL)
	public void fileFree(F0xEventParsing event) { 
		event.getCurrentList().add("call "+x86ModuleDefault.formatFunction("kumiho/main/Kumiho.freeFile__V"));
	}
	


	
	
}
