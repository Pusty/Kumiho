package pusty.f0xC.rt.util;

import pusty.f0xC.lang.OverrideHandler.OverrideTranslation;

@SuppressWarnings({ "unchecked", "rawtypes" })
@OverrideTranslation(override = "java/util/HashMap$EntrySet")
public class HashEntrySet<K,V> extends OSet<MapEntry<K,V>> {
	private OHashMap<K,V> map;
	public HashEntrySet(OHashMap<K,V> m) {
		map = m;
	}
    public OIterator<MapEntry<K,V>> iterator() {
        return map.newEntryIterator();
    }
	public boolean contains(Object o) {
        if (!(o instanceof MapEntry))
            return false;
        MapEntry<K,V> e = (MapEntry) o;
        HashEntry<K,V> candidate = map.getEntry(e.getKey());
        return candidate != null && candidate.equals(e);
    }
    public boolean remove(Object o) {
        return map.removeMapping(o) != null;
    }
    public int size() {
        return map.size;
    }
    public void clear() {
        map.clear();
    }
}