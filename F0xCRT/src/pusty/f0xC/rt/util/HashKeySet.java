package pusty.f0xC.rt.util;

import pusty.f0xC.lang.OverrideHandler.OverrideTranslation;

@SuppressWarnings({"rawtypes","unchecked"})
@OverrideTranslation(override = "java/util/HashMap$KeySet")
public class HashKeySet<K> extends OSet<K> {
	
	OHashMap map;
	public HashKeySet(OHashMap m) {
		map = m;
	}
    public OIterator<K> iterator() {
        return map.newKeyIterator();
    }
    public int size() {
        return map.size;
    }
    public boolean contains(Object o) {
        return map.containsKey(o);
    }
    public boolean remove(Object o) {
        return map.removeEntryForKey(o) != null;
    }
    public void clear() {
    	map.clear();
    }
}