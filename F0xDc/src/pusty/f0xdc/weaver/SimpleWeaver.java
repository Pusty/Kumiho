package pusty.f0xdc.weaver;

import java.io.File;
import java.util.ArrayList;

import pusty.f0xdc.pe.ExecutableReader;
import pusty.f0xdc.location.MemorySection;
import pusty.f0xdc.location.SectionSearcher;
import pusty.f0xdc.payload.EditablePayload;
import pusty.f0xdc.payload.InjectingEngine;
import pusty.f0xdc.payload.Payload;

public class SimpleWeaver extends Weaver {

	protected MemorySection section;
	@Override
	public void run(ExecutableReader reader, Payload payload) {
		super.run(reader,  payload);
		System.out.println("[*] Simple Weaver started...");
		System.out.println("[*] Payload size: " + payload.getSize() + " Bytes");
		System.out.println("[*] Detected arch: "
				+ reader.getArch());
		System.out.println("[#] Weaver is assuming that payload has same arch");
		//ArrayList<MemorySection> result = WeaverUtil.querySorted(reader, payload.getSize());
		ArrayList<MemorySection> result = WeaverUtil.querySortedFiltered(reader, payload.getSize(), new String[] {".text"},  SectionSearcher.MODE_NORMAL);
		if(result.size()==0) {
			System.out.println("[!] No Code Cave with needed size found!");
			return;
		}else {
			System.out.println("[#] Found Code Cave in "
					+ result.get(0).getSection().getName()
							.trim() + " section (Size: "+result.get(0).getSize()+")");
			System.out.println(Integer.toHexString(result.get(0).getOffsetFrom()));
			System.out.println(Integer.toHexString(result.get(0).getAddressFrom()));
		}

		if (!InjectingEngine.inject(reader, payload,
				result.get(0))) {
			System.out.println("[!] Code Injection failed!");
			return;
		}
		System.out.println("[*] Code injection finished");
		if (!InjectingEngine.update(reader, payload,
				result.get(0))) {
			System.out.println("[!] Updating Binary failed!");
			return;
		}
		System.out.println("[*] Updating Binary finished");
		section = result.get(0);
	}
	
	public MemorySection getSection() {
		return section;
	}

	public static SimpleWeaver runFromFiles(File peFile, File payload) {
		SimpleWeaver simpleWeaver = new SimpleWeaver();
		try {
			ExecutableReader reader = ExecutableReader.create(peFile);
			simpleWeaver.run(reader, EditablePayload.fromFile(payload));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return simpleWeaver;
	}
	
	public static SimpleWeaver runFromReader(ExecutableReader reader, Payload payload) {
		SimpleWeaver simpleWeaver = new SimpleWeaver();
		try {
			simpleWeaver.run(reader, payload);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return simpleWeaver;
	}

}
