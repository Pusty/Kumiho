package pusty.f0xC.rt.util;

import pusty.f0xC.lang.OverrideHandler.OverrideTranslation;

@OverrideTranslation(override = "java/util/Map$Entry")
public abstract class MapEntry<K,V> {
	public abstract K getKey();
    public abstract V getValue();
    public abstract V setValue(V value);
    public abstract boolean equals(Object o);
    public abstract int hashCode();
}