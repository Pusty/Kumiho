package pusty.f0xdc.weaver;

import java.io.File;

import pusty.f0xdc.pe.IMAGE_SECTION_HEADER;
import pusty.f0xdc.pe.ExecutableReader;
import pusty.f0xdc.location.MemorySection;
import pusty.f0xdc.payload.EditablePayload;
import pusty.f0xdc.payload.InjectingEngine;
import pusty.f0xdc.payload.Payload;

public class NewSectionWeaver extends Weaver {

	protected MemorySection section;
	@Override
	public void run(ExecutableReader reader, Payload payload) {
		super.run(reader,  payload);
		System.out.println("[*] New Section Weaver started...");
		System.out.println("[*] Payload size: " + payload.getSize() + " Bytes");
		System.out.println("[*] Detected arch: "
				+ reader.getArch());
		System.out.println("[#] Weaver is assuming that payload has same arch");
		System.out.println("[#] Only works for PE files");
		int section = InjectingEngine.injectSection(reader, ".banana",payload.getSize(), IMAGE_SECTION_HEADER.IMAGE_SCN_CNT_CODE | IMAGE_SECTION_HEADER.IMAGE_SCN_MEM_EXECUTE | IMAGE_SECTION_HEADER.IMAGE_SCN_MEM_WRITE | IMAGE_SECTION_HEADER.IMAGE_SCN_MEM_READ);	
		MemorySection result = new MemorySection(reader.getSectionHeader()[section].getPointerToRawData(), reader.getSectionHeader()[section].getPointerToRawData()+payload.getSize(), reader.getSectionHeader()[section]);
		
		if (!InjectingEngine.inject(reader, payload,
				result)) {
			System.out.println("[!] Code Injection failed!");
			return;
		}
		System.out.println("[*] Code injection finished");
		if (!InjectingEngine.update(reader, payload,
				result)) {
			System.out.println("[!] Updating Binary failed!");
			return;
		}
		System.out.println("[*] Updating Binary finished");
		this.section = result;
	}
	
	public MemorySection getSection() {
		return section;
	}

	public static NewSectionWeaver runFromFiles(File peFile, File payload) {
		NewSectionWeaver simpleWeaver = new NewSectionWeaver();
		try {
			ExecutableReader reader = ExecutableReader.create(peFile);
			simpleWeaver.run(reader, EditablePayload.fromFile(payload));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return simpleWeaver;
	}
	
	public static NewSectionWeaver runFromReader(ExecutableReader reader, Payload payload) {
		NewSectionWeaver simpleWeaver = new NewSectionWeaver();
		try {
			simpleWeaver.run(reader, payload);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return simpleWeaver;
	}

}
