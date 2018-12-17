package pusty.f0xC.rt.util;

import pusty.f0xC.lang.OverrideHandler.OverrideTranslation;

@SuppressWarnings({"rawtypes","unchecked"})
@OverrideTranslation(override = "java/util/HashMap$Values")
public class HashValues<V> extends OAbstractCollection<V> {
	private OHashMap map;
	public HashValues(OHashMap m) {
		map = m;
	}
	public OIterator<V> iterator() {
        return map.newValueIterator();
    }
    public int size() {
        return map.size;
    }
    public boolean contains(Object o) {
        return map.containsValue(o);
    }
    public void clear() {
        map.clear();
    }
}