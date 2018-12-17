package pusty.f0xC.x86.internal;

import pusty.f0xC.lang.OverrideHandler.TranslationProperty;

public class GarbageCollector {
	private int[] collectorData;
	private int size;

	@TranslationProperty(property = TranslationProperty.INTERNAL_GBF)
	public GarbageCollector(int size) {
		this.size = size;
		this.collectorData = new int[size*2];
	}
	
	@TranslationProperty(property = TranslationProperty.INTERNAL_GBF)
	public boolean add(Object obj, int ebp) {
		for(int i=0;i<size;i++) {
			int d = i*2;
			if(collectorData[d+0] == 0) {
				collectorData[d+0] = InternalObject.obj2int(obj);
				collectorData[d+1] = ebp;
				return true;
			}
		}
		return false;
	}
	
	@TranslationProperty(property = TranslationProperty.INTERNAL_GBF)
	public void collect(int ebp) {
		for(int i=0;i<size;i++) {
			int d = i*2;
			if(collectorData[d+0] != 0 && (ebp >= collectorData[d+1] || ebp == 0)) {
				Internal.free_memory(InternalObject.int2obj(collectorData[d+0]));		
				collectorData[d+0] = 0;
				collectorData[d+1] = 0;
			}
		}
	}
}
