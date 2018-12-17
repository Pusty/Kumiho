package pusty.f0xC.rt.util;

import java.util.Set;

import pusty.f0xC.lang.OverrideHandler.OverrideTranslation;

@OverrideTranslation(override = "java/util/AbstractMap")
public abstract class OAbstractMap<K,V> extends OMap<K,V> {
    
    protected OSet<K>        keySet = null;
    protected OCollection<V> values = null;
    
    protected OAbstractMap() {}
    public int size() {
        return entrySet().size();
    }
    public boolean isEmpty() {
        return size() == 0;
    }
    public boolean containsValue(Object value) {
        OIterator<MapEntry<K,V>> i = entrySet().iterator();
        if (value==null) {
            while (i.hasNext()) {
            	MapEntry<K,V> e = i.next();
                if (e.getValue()==null)
                    return true;
            }
        } else {
            while (i.hasNext()) {
            	MapEntry<K,V> e = i.next();
                if (value.equals(e.getValue()))
                    return true;
            }
        }
        return false;
    }
    
    public boolean containsKey(Object key) {
        OIterator<MapEntry<K,V>> i = entrySet().iterator();
        if (key==null) {
            while (i.hasNext()) {
            	MapEntry<K,V> e = i.next();
                if (e.getKey()==null)
                    return true;
            }
        } else {
            while (i.hasNext()) {
            	MapEntry<K,V> e = i.next();
                if (key.equals(e.getKey()))
                    return true;
            }
        }
        return false;
    }
    
    public V get(Object key) {
        OIterator<MapEntry<K,V>> i = entrySet().iterator();
        if (key==null) {
            while (i.hasNext()) {
            	MapEntry<K,V> e = i.next();
                if (e.getKey()==null)
                    return e.getValue();
            }
        } else {
            while (i.hasNext()) {
            	MapEntry<K,V> e = i.next();
                if (key.equals(e.getKey()))
                    return e.getValue();
            }
        }
        return null;
    }
    
    public V put(K key, V value) {
        throw new UnsupportedOperationException();
    }
    
    public V remove(Object key) {
        OIterator<MapEntry<K,V>> i = entrySet().iterator();
        MapEntry<K,V> correctEntry = null;
        if (key==null) {
            while (correctEntry==null && i.hasNext()) {
            	MapEntry<K,V> e = i.next();
                if (e.getKey()==null)
                    correctEntry = e;
            }
        } else {
            while (correctEntry==null && i.hasNext()) {
            	MapEntry<K,V> e = i.next();
                if (key.equals(e.getKey()))
                    correctEntry = e;
            }
        }
        V oldValue = null;
        if (correctEntry !=null) {
            oldValue = correctEntry.getValue();
            i.remove();
        }
        return oldValue;
    }
    
    @SuppressWarnings("unchecked")
	public void putAll(OMap<? extends K, ? extends V> m) {
    	Object it = m.entrySet();
        for (MapEntry<? extends K, ? extends V> e : ((Set<MapEntry<? extends K, ? extends V>>)it))
            put(e.getKey(), e.getValue());
    }
    
    public void clear() {
        entrySet().clear();
    }

    /*
    public OSet<K> keySet() {
        if (keySet == null) {
            keySet = new OSet<K>() {
                public OIterator<K> iterator() {
                    return new OIterator<K>() {
                        private OIterator<MapEntry<K,V>> i = entrySet().iterator();
                        public boolean hasNext() {
                            return i.hasNext();
                        }
                        public K next() {
                            return i.next().getKey();
                        }
                        public void remove() {
                            i.remove();
                        }
                    };
                }
                public int size() {
                    return OAbstractMap.this.size();
                }
                public boolean isEmpty() {
                    return OAbstractMap.this.isEmpty();
                }
                public void clear() {
                    OAbstractMap.this.clear();
                }
                public boolean contains(Object k) {
                    return OAbstractMap.this.containsKey(k);
                }
            };
        }
        return keySet;
    }
    
    public OCollection<V> values() {
        if (values == null) {
            values = new OAbstractCollection<V>() {
                public OIterator<V> iterator() {
                    return new OIterator<V>() {
                        private OIterator<MapEntry<K,V>> i = entrySet().iterator();

                        public boolean hasNext() {
                            return i.hasNext();
                        }

                        public V next() {
                            return i.next().getValue();
                        }

                        public void remove() {
                            i.remove();
                        }
                    };
                }
                public int size() {
                    return OAbstractMap.this.size();
                }
                public boolean isEmpty() {
                    return OAbstractMap.this.isEmpty();
                }
                public void clear() {
                    OAbstractMap.this.clear();
                }
                public boolean contains(Object v) {
                    return OAbstractMap.this.containsValue(v);
                }
            };
        }
        return values;
    } */
    public abstract OSet<MapEntry<K,V>> entrySet();
    @SuppressWarnings("unchecked")
	public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof OMap))
            return false;
        OMap<K,V> m = (OMap<K,V>) o;
        if (m.size() != size())
            return false;
        try {
            OIterator<MapEntry<K,V>> i = entrySet().iterator();
            while (i.hasNext()) {
            	MapEntry<K,V> e = i.next();
                K key = e.getKey();
                V value = e.getValue();
                if (value == null) {
                    if (!(m.get(key)==null && m.containsKey(key)))
                        return false;
                } else {
                    if (!value.equals(m.get(key)))
                        return false;
                }
            }
        } catch (NullPointerException unused) {
            return false;
        }
        return true;
    }
    
    public int hashCode() {
        int h = 0;
        OIterator<MapEntry<K,V>> i = entrySet().iterator();
        while (i.hasNext())
            h += i.next().hashCode();
        return h;
    }
    
    public String toString() {
        OIterator<MapEntry<K,V>> i = entrySet().iterator();
        if (! i.hasNext())
            return "{}";
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        for (;;) {
            MapEntry<K,V> e = i.next();
            K key = e.getKey();
            V value = e.getValue();
            sb.append(key   == this ? "(this Map)" : key);
            sb.append('=');
            sb.append(value == this ? "(this Map)" : value);
            if (! i.hasNext())
                return sb.append('}').toString();
            sb.append(',').append(' ');
        }
    }
    
    @SuppressWarnings("unchecked")
	protected Object clone() throws CloneNotSupportedException {
        OAbstractMap<K,V> result = (OAbstractMap<K,V>)super.clone();
        result.keySet = null;
        result.values = null;
        return result;
    }
    
	//private static boolean eq(Object o1, Object o2) {
    //   return o1 == null ? o2 == null : o1.equals(o2);
    //}
	/*
    public static class SimpleEntry<K,V> extends MapEntry<K,V> {
	    private final K key;
	    private V value;
	    public SimpleEntry(K key, V value) {
	        this.key   = key;
	        this.value = value;
	    }
	    public SimpleEntry(MapEntry<? extends K, ? extends V> entry) {
	        this.key   = entry.getKey();
	        this.value = entry.getValue();
	    }
	    public K getKey() {
	        return key;
	    }
	    public V getValue() {
	        return value;
	    }
	    public V setValue(V value) {
	        V oldValue = this.value;
	        this.value = value;
	        return oldValue;
	    }
	    @SuppressWarnings("rawtypes")
		public boolean equals(Object o) {
	        if (!(o instanceof MapEntry))
	            return false;
	        MapEntry e = (MapEntry)o;
	        return eq(key, e.getKey()) && eq(value, e.getValue());
	    }
	    public int hashCode() {
	        return (key   == null ? 0 :   key.hashCode()) ^
	               (value == null ? 0 : value.hashCode());
	    }
	    public String toString() {
	        return key + "=" + value;
	    }
    }
    */
    /*
    public static class SimpleImmutableEntry<K,V>  extends MapEntry<K,V> {
	    private final K key;
	    private final V value;
	    public SimpleImmutableEntry(K key, V value) {
	        this.key   = key;
	        this.value = value;
	    }
	    public SimpleImmutableEntry(MapEntry<? extends K, ? extends V> entry) {
	        this.key   = entry.getKey();
	        this.value = entry.getValue();
	    }
	    public K getKey() {
	        return key;
	    }
	    public V getValue() {
	        return value;
	    }
	    public V setValue(V value) {
	        throw new UnsupportedOperationException();
	    }
	    @SuppressWarnings("rawtypes")
		public boolean equals(Object o) {
	        if (!(o instanceof MapEntry))
	            return false;
	        MapEntry e = (MapEntry)o;
	        return eq(key, e.getKey()) && eq(value, e.getValue());
	    }
	    public int hashCode() {
	        return (key   == null ? 0 :   key.hashCode()) ^
	               (value == null ? 0 : value.hashCode());
	    }
	    public String toString() {
	        return key + "=" + value;
	    }
	}
	*/
}
