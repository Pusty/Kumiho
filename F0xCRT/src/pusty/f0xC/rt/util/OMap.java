package pusty.f0xC.rt.util;

import pusty.f0xC.lang.OverrideHandler.OverrideTranslation;

@OverrideTranslation(override = "java/util/Map")
public abstract class OMap<K,V> {
	public abstract int size();
	public abstract boolean isEmpty();
	public abstract boolean containsKey(Object key);
	public abstract boolean containsValue(Object value);
	public abstract V get(Object key);
	public abstract V put(K key, V value);
	public abstract V remove(Object key);
	public abstract void putAll(OMap<? extends K, ? extends V> m);
	public abstract void clear();
	public abstract OSet<K> keySet();
	public abstract OCollection<V> values();
	public abstract OSet<MapEntry<K, V>> entrySet();	
	public abstract boolean equals(Object o);
	public abstract int hashCode();
}
