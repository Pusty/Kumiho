package pusty.f0xC.rt.util;

import java.util.Arrays;
import java.util.Set;

import pusty.f0xC.lang.OverrideHandler.OverrideTranslation;

@OverrideTranslation(override = "java/util/HashMap")
public class OHashMap<K,V> extends OAbstractMap<K,V> {
	 static final int DEFAULT_INITIAL_CAPACITY = 1 << 4; // aka 16
	 static final int MAXIMUM_CAPACITY = 1 << 30;
	 static final HashEntry<?,?>[] EMPTY_TABLE = {};
	 static final int ALTERNATIVE_HASHING_THRESHOLD_DEFAULT = Integer.MAX_VALUE;
	 
	 @SuppressWarnings("unchecked")
	 HashEntry<K,V>[] table = (HashEntry<K,V>[]) EMPTY_TABLE;
	 int size;
	 int threshold;
	
	 int hashSeed = 0;

	 private OSet<MapEntry<K, V>> entrySet = null;

	 
	 public OHashMap(int initialCapacity, float loadFactor) {
        if (initialCapacity < 0)
            throw new IllegalArgumentException("Illegal initial capacity: " +
                                               initialCapacity);
        if (initialCapacity > MAXIMUM_CAPACITY)
            initialCapacity = MAXIMUM_CAPACITY;
        threshold = initialCapacity;
	 }
	 
     public OHashMap(int initialCapacity) {
         this(initialCapacity, 1);
     }
     
     public OHashMap() {
         this(DEFAULT_INITIAL_CAPACITY, 0);
     }
     
     public OHashMap(OMap<? extends K, ? extends V> m) {
         this(Math.max((int) (m.size() / 1) + 1,
                       DEFAULT_INITIAL_CAPACITY), 0);
         inflateTable(threshold);
         putAllForCreate(m);
     }
     
     private static int roundUpToPowerOf2(int number) {
         // assert number >= 0 : "number must be non-negative";
         int rounded = number >= MAXIMUM_CAPACITY
                 ? MAXIMUM_CAPACITY
                 : (rounded = Integer.highestOneBit(number)) != 0
                     ? (Integer.bitCount(number) > 1) ? rounded << 1 : rounded
                     : 1;

         return rounded;
     }
     
     @SuppressWarnings("unchecked")
	private void inflateTable(int toSize) {
         // Find a power of 2 >= toSize
         int capacity = roundUpToPowerOf2(toSize);
         threshold = (int) Math.min(capacity, MAXIMUM_CAPACITY + 1);
         table = new HashEntry[capacity];
    }
    
    final int hash(Object k) {
        int h = hashSeed;
        /*if (0 != h && k instanceof String) {
            return sun.misc.Hashing.stringHash32((String) k);
        }*/
        h ^= k.hashCode();
        // This function ensures that hashCodes that differ only by
        // constant multiples at each bit position have a bounded
        // number of collisions (approximately 8 at default load factor).
        h ^= (h >>> 20) ^ (h >>> 12);
        return h ^ (h >>> 7) ^ (h >>> 4);
    }
    
    static int indexFor(int h, int length) {
        // assert Integer.bitCount(length) == 1 : "length must be a non-zero power of 2";
        return h & (length-1);
    }
    
    public int size() {
        return size;
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public V get(Object key) {
        if (key == null)
            return getForNullKey();
        HashEntry<K,V> entry = getEntry(key);
        return null == entry ? null : entry.getValue();
    }
    
    private V getForNullKey() {
        if (size == 0) {
            return null;
        }
        for (HashEntry<K,V> e = table[0]; e != null; e = e.next) {
            if (e.key == null)
                return e.value;
        }
        return null;
    }
    
    public boolean containsKey(Object key) {
        return getEntry(key) != null;
    }
    
    final HashEntry<K,V> getEntry(Object key) {
        if (size == 0) {
            return null;
        }
        int hash = (key == null) ? 0 : hash(key);
        for (HashEntry<K,V> e = table[indexFor(hash, table.length)];
             e != null;
             e = e.next) {
            Object k;
            if (e.hash == hash &&
                ((k = e.key) == key || (key != null && key.equals(k))))
                return e;
        }
        return null;
    }
    
    public V put(K key, V value) {
        if (table == EMPTY_TABLE) {
            inflateTable(threshold);
        }
        if (key == null)
            return putForNullKey(value);
        int hash = hash(key);
        int i = indexFor(hash, table.length);
        for (HashEntry<K,V> e = table[i]; e != null; e = e.next) {
            Object k;
            if (e.hash == hash && ((k = e.key) == key || key.equals(k))) {
                V oldValue = e.value;
                e.value = value;
                e.recordAccess(this);
                return oldValue;
            }
        }
        addEntry(hash, key, value, i);
        return null;
    }
    
    private V putForNullKey(V value) {
        for (HashEntry<K,V> e = table[0]; e != null; e = e.next) {
            if (e.key == null) {
                V oldValue = e.value;
                e.value = value;
                e.recordAccess(this);
                return oldValue;
            }
        }
        addEntry(0, null, value, 0);
        return null;
    }
    
    private void putForCreate(K key, V value) {
        int hash = null == key ? 0 : hash(key);
        int i = indexFor(hash, table.length);
        for (HashEntry<K,V> e = table[i]; e != null; e = e.next) {
            Object k;
            if (e.hash == hash &&
                ((k = e.key) == key || (key != null && key.equals(k)))) {
                e.value = value;
                return;
            }
        }
        createEntry(hash, key, value, i);
    }

    @SuppressWarnings("unchecked")
	private void putAllForCreate(OMap<? extends K, ? extends V> m) {
        for (HashEntry<? extends K, ? extends V> e : ((Set<HashEntry<? extends K, ? extends V>>)m.entrySet()))
            putForCreate(e.getKey(), e.getValue());
    }
    
    @SuppressWarnings({ "rawtypes", "unchecked" })
	void resize(int newCapacity) {
    	HashEntry[] oldTable = table;
        int oldCapacity = oldTable.length;
        if (oldCapacity == MAXIMUM_CAPACITY) {
            threshold = Integer.MAX_VALUE;
            return;
        }
        HashEntry[] newTable = new HashEntry[newCapacity];
        transfer(newTable, false);
        table = newTable;
        threshold = (int)Math.min(newCapacity, MAXIMUM_CAPACITY + 1);
    }
    
    @SuppressWarnings({ "rawtypes", "unchecked" })
	void transfer(HashEntry[] newTable, boolean rehash) {
        int newCapacity = newTable.length;
        for (HashEntry<K,V> e : table) {
            while(null != e) {
            	HashEntry<K,V> next = e.next;
                if (rehash) {
                    e.hash = null == e.key ? 0 : hash(e.key);
                }
                int i = indexFor(e.hash, newCapacity);
                e.next = newTable[i];
                newTable[i] = e;
                e = next;
            }
        }
    }
    
    @SuppressWarnings("unchecked")
	public void putAll(OMap<? extends K, ? extends V> m) {
        int numKeysToBeAdded = m.size();
        if (numKeysToBeAdded == 0)
            return;
        if (table == EMPTY_TABLE) {
            inflateTable((int) Math.max(numKeysToBeAdded, threshold));
        }
        if (numKeysToBeAdded > threshold) {
            int targetCapacity = (int)(numKeysToBeAdded + 1);
            if (targetCapacity > MAXIMUM_CAPACITY)
                targetCapacity = MAXIMUM_CAPACITY;
            int newCapacity = table.length;
            while (newCapacity < targetCapacity)
                newCapacity <<= 1;
            if (newCapacity > table.length)
                resize(newCapacity);
        }
        for (HashEntry<? extends K, ? extends V> e : (Set<HashEntry<? extends K, ? extends V>>)m.entrySet())
            put(e.getKey(), e.getValue());
    }
    
    public V remove(Object key) {
    	HashEntry<K,V> e = removeEntryForKey(key);
        return (e == null ? null : e.value);
    }

    final HashEntry<K,V> removeEntryForKey(Object key) {
        if (size == 0) {
            return null;
        }
        int hash = (key == null) ? 0 : hash(key);
        int i = indexFor(hash, table.length);
        HashEntry<K,V> prev = table[i];
        HashEntry<K,V> e = prev;

        while (e != null) {
        	HashEntry<K,V> next = e.next;
            Object k;
            if (e.hash == hash &&
                ((k = e.key) == key || (key != null && key.equals(k)))) {
                size--;
                if (prev == e)
                    table[i] = next;
                else
                    prev.next = next;
                e.recordRemoval(this);
                return e;
            }
            prev = e;
            e = next;
        }

        return e;
    }
    
    @SuppressWarnings("unchecked")
	final HashEntry<K,V> removeMapping(Object o) {
        if (size == 0 || !(o instanceof HashEntry))
            return null;
        HashEntry<K,V> entry = (HashEntry<K,V>) o;
        Object key = entry.getKey();
        int hash = (key == null) ? 0 : hash(key);
        int i = indexFor(hash, table.length);
        HashEntry<K,V> prev = table[i];
        HashEntry<K,V> e = prev;
        while (e != null) {
        	HashEntry<K,V> next = e.next;
            if (e.hash == hash && e.equals(entry)) {
                size--;
                if (prev == e)
                    table[i] = next;
                else
                    prev.next = next;
                e.recordRemoval(this);
                return e;
            }
            prev = e;
            e = next;
        }
        return e;
    }
    
    
    public void clear() {
        Arrays.fill(table, null);
        size = 0;
    }
    
    @SuppressWarnings("rawtypes")
	public boolean containsValue(Object value) {
        if (value == null)
            return containsNullValue();
        HashEntry[] tab = table;
        for (int i = 0; i < tab.length ; i++)
            for (HashEntry e = tab[i] ; e != null ; e = e.next)
                if (value.equals(e.value))
                    return true;
        return false;
    }
    
    @SuppressWarnings("rawtypes")
	private boolean containsNullValue() {
    	HashEntry[] tab = table;
        for (int i = 0; i < tab.length ; i++)
            for (HashEntry e = tab[i] ; e != null ; e = e.next)
                if (e.value == null)
                    return true;
        return false;
    }
    
    @SuppressWarnings("unchecked")
	public Object clone() {
        OHashMap<K,V> result = null;
        try {
            result = (OHashMap<K,V>)super.clone();
        } catch (CloneNotSupportedException e) {
            // assert false;
        }
        if (result.table != EMPTY_TABLE) {
            result.inflateTable(Math.min(
                (int) Math.min(
                    size * Math.min(1, 4),
                    // we have limits...
                    OHashMap.MAXIMUM_CAPACITY),
               table.length));
        }
        result.entrySet = null;
        result.size = 0;
        result.putAllForCreate(this);
        return result;
    }
    
    void addEntry(int hash, K key, V value, int bucketIndex) {
        if ((size >= threshold) && (null != table[bucketIndex])) {
            resize(2 * table.length);
            hash = (null != key) ? hash(key) : 0;
            bucketIndex = indexFor(hash, table.length);
        }
        createEntry(hash, key, value, bucketIndex);
    }
    
    void createEntry(int hash, K key, V value, int bucketIndex) {
    	HashEntry<K,V> e = table[bucketIndex];
        table[bucketIndex] = new HashEntry<>(hash, key, value, e);
        size++;
    }
    
    OIterator<K> newKeyIterator()   {
        return new KeyIterator<K>(this);
    }
    OIterator<V> newValueIterator()   {
        return new ValueIterator<V>(this);
    }
    OIterator<MapEntry<K, V>> newEntryIterator()   {
        return new EntryIterator<K,V>(this);
    }
    public OSet<K> keySet() {
        OSet<K> ks = keySet;
        return (ks != null ? ks : (keySet = new HashKeySet<K>(this)));
    }
    
    public OCollection<V> values() {
        OCollection<V> vs = values;
        return (vs != null ? vs : (values = new HashValues<V>(this)));
    }
    
    public OSet<MapEntry<K,V>> entrySet() {
        OSet<MapEntry<K,V>> es = entrySet;
        return es != null ? es : (entrySet = new HashEntrySet<K,V>(this));
    }

}
