package pusty.f0xC.rt.util;

import java.util.Objects;

import pusty.f0xC.lang.OverrideHandler.OverrideTranslation;

@OverrideTranslation(override = "java/util/HashMap$Entry")
public class HashEntry<K,V> extends MapEntry<K,V> {
    public K key;
    public V value;
    public HashEntry<K,V> next;
    public int hash;
    public HashEntry(int h, K k, V v, HashEntry<K,V> n) {
        value = v;
        next = n;
        key = k;
        hash = h;
    }
    public final K getKey() {
        return key;
    }
    public final V getValue() {
        return value;
    }
    public final V setValue(V newValue) {
        V oldValue = value;
        value = newValue;
        return oldValue;
    }
    @SuppressWarnings("rawtypes")
	public final boolean equals(Object o) {
        if (!(o instanceof HashEntry))
            return false;
        HashEntry e = (HashEntry)o;
        Object k1 = getKey();
        Object k2 = e.getKey();
        if (k1 == k2 || (k1 != null && k1.equals(k2))) {
            Object v1 = getValue();
            Object v2 = e.getValue();
            if (v1 == v2 || (v1 != null && v1.equals(v2)))
                return true;
        }
        return false;
    }
    public final int hashCode() {
        return Objects.hashCode(getKey()) ^ Objects.hashCode(getValue());
    }
    public final String toString() {
        return getKey() + "=" + getValue();
    }
    void recordAccess(OHashMap<K,V> m) {
    }
    void recordRemoval(OHashMap<K,V> m) {
    }
}
