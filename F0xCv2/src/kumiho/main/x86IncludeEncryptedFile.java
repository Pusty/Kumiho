package kumiho.main;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.nio.file.Files;
import java.util.Arrays;

import kumiho.modified.x86InternalXOR;
import pusty.f0xC.module.F0xEventSubscription;
import pusty.f0xC.module.F0xModule;
import pusty.f0xC.lang.x86.modules.x86ModuleDefault;
import pusty.f0xC.lang.x86.modules.core.x86ModuleInteger;
import pusty.f0xC.module.F0xEvent.F0xEventPriority;
import pusty.f0xC.module.F0xEvent.F0xEventType;
import pusty.f0xC.module.event.F0xEventNodeVarFixParsing;
import pusty.f0xC.module.event.F0xEventParsing;
import pusty.f0xdc.ExecutableStream;
import pusty.f0xdc.pe.ExecutableReader;

public class x86IncludeEncryptedFile extends F0xModule {

	protected File file;
	private byte[] data;
	private int virtualSize;
	public x86IncludeEncryptedFile(File file) {
		super();
		this.file = file;
		try {
			data = Files.readAllBytes(this.file.toPath());
			ByteArrayInputStream bis = new ByteArrayInputStream(data);
			ExecutableReader reader  = new ExecutableReader(new ExecutableStream(bis));
			if(reader.getSignature()==0x4550) { //PE HEADER
				virtualSize = reader.getOptionalHeader().getSizeOfImage();
			}else
				virtualSize = data.length;
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
		//event.getCurrentList().add("format PE GUI");
		event.getCurrentList().add("entry start_function");
		event.getCurrentList().add("include 'C:\\fasm\\INCLUDE\\win32a.inc'");
		event.getCurrentList().add("");
		/* tbh this is pretty stupid, but I don't know how to do this with FASM */
		/* A virtual offset / section would be WAAAY better */
		event.getCurrentList().add("section '.orig' code readable writeable executable");
		event.getCurrentList().add("repeat "+virtualSize);	
		event.getCurrentList().add("db 0");
		event.getCurrentList().add("end repeat");
		event.getCurrentList().add("");	
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
		System.out.println("[#] Hash of Included File: "+Integer.toHexString(Arrays.hashCode(data)));
		data = QuickLZ.compress(data, 1);
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
    		value += (event.getF0xC().getParser().dumpByte(c&0xFF))+", ";
    	}
    	value += event.getF0xC().getParser().dumpByte(0);
    	event.getCurrentList().add("   includedFile db "+value);    	
	}
	
	@F0xEventSubscription(event=F0xEventType.Init, priority=F0xEventPriority.LOW)
	public void fileInit(F0xEventParsing event) {
		event.getCurrentList().add("call "+x86ModuleDefault.formatFunction("kumiho/main/Kumiho.initFile__V"));
	}
	
	@F0xEventSubscription(event=F0xEventType.Free, priority=F0xEventPriority.LOW)
	public void fileFree(F0xEventParsing event) { 
		event.getCurrentList().add("call "+x86ModuleDefault.formatFunction("kumiho/main/Kumiho.freeFile__V"));
	}
	
	
	//Meant to encrypt byte arrays on run time
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeVarFixArrayLoadBYTE, priority=F0xEventPriority.NORMAL)
	public void nodeVARFIX_ARRAYLOADBYTE(F0xEventNodeVarFixParsing event) {
		x86ModuleInteger.nodeVARFIX_ARRAYLOAD(event);
		event.getCurrentList().add("xor reg0, reg0");
		event.getCurrentList().add("mov reg0b, [reg1]");
		event.getCurrentList().add("xor reg0b, "+(x86InternalXOR.XOR_KEY&0xFF));
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeVarFixArrayStoreBYTE, priority=F0xEventPriority.NORMAL)
	public void nodeVARFIX_ARRAYSTOREBYTE(F0xEventNodeVarFixParsing event) {
		x86ModuleInteger.nodeVARFIX_ARRAYSTORE(event); 
		event.getCurrentList().add("xor reg0b, "+(x86InternalXOR.XOR_KEY&0xFF));
		event.getCurrentList().add("mov [reg1], reg0b");
	}
	
	//Jump out at the end!
	@F0xEventSubscription(event=F0xEventType.Diagnostic, priority=F0xEventPriority.LOW)
	public void jumpToUnpacked(F0xEventParsing event) {
		event.getCurrentList().add("mov reg0, [kumiho_main_KumihoTestcase_jumpOut]");
		event.getCurrentList().add("jmp reg0");
	}
	
	
}
