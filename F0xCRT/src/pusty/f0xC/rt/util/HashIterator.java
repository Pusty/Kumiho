package pusty.f0xC.rt.util;

@SuppressWarnings({ "rawtypes"})
public abstract class HashIterator<E> extends OIterator<E> {
	OHashMap map;
	
	HashEntry next;        // next entry to return
    int index;              // current slot
    HashEntry current;     // current entry
   
	public HashIterator(OHashMap m) {
		map = m;
        if (map.size > 0) { // advance to first entry
        	HashEntry[] t = map.table;
            while (index < t.length && (next = t[index++]) == null);
        }
    }
    public final boolean hasNext() {
        return next != null;
    }
	final HashEntry nextEntry() {
    	HashEntry e = next;
        if (e == null)
            throw new RuntimeException();
        if ((next = e.next) == null) {
        	HashEntry[] t =  map.table;
            while (index < t.length && (next = t[index++]) == null)
                ;
        }
        current = e;
        return e;
    }
    public void remove() {
        if (current == null)
            throw new IllegalStateException();
        Object k = current.key;
        current = null;
        map.removeEntryForKey(k);
    }
}

@SuppressWarnings({"rawtypes", "unchecked"})
class ValueIterator<V> extends HashIterator<V> {
    public ValueIterator(OHashMap m) {
		super(m);
	}
    public V next() {
        return (V) nextEntry().value;
    }
}

@SuppressWarnings({"rawtypes", "unchecked"})
class KeyIterator<K> extends HashIterator<K> {
    public KeyIterator(OHashMap m) {
		super(m);
	}
	public K next() {
        return (K) nextEntry().getKey();
    }
}

@SuppressWarnings({"rawtypes", "unchecked"})
class EntryIterator<K,V> extends HashIterator<MapEntry<K,V>> {
    public EntryIterator(OHashMap m) {
		super(m);
	}
    public MapEntry<K,V> next() {
        return nextEntry();
    }
}
