package pusty.f0xC.rt.util;

import java.util.Arrays;
import java.util.Collection;

import pusty.f0xC.lang.OverrideHandler.OverrideTranslation;

@OverrideTranslation(override = "java/util/AbstractCollection")
public abstract class OAbstractCollection<E> extends OCollection<E>  {
    protected OAbstractCollection() {}
    public abstract OIterator<E> iterator();
    public abstract int size();
    public boolean isEmpty() {
        return size() == 0;
    }
    public boolean contains(Object o) {
        OIterator<E> it = iterator();
        if (o==null) {
            while (it.hasNext())
                if (it.next()==null)
                    return true;
        } else {
            while (it.hasNext())
                if (o.equals(it.next()))
                    return true;
        }
        return false;
    }
    public Object[] toArray() {
        // Estimate size of array; be prepared to see more or fewer elements
        Object[] r = new Object[size()];
        OIterator<E> it = iterator();
        for (int i = 0; i < r.length; i++) {
            if (! it.hasNext()) // fewer elements than expected
                return OArrays.copyOf(r, i);
            r[i] = it.next();
        }
        return it.hasNext() ? finishToArray(r, it) : r;
    }
    
    @SuppressWarnings("unchecked")
	public <T> T[] toArray(T[] a) {
        // Estimate size of array; be prepared to see more or fewer elements
        int size = size();
        T[] r = a.length >= size ? a : (T[])new Object[size];
        OIterator<E> it = iterator();
        for (int i = 0; i < r.length; i++) {
            if (! it.hasNext()) { // fewer elements than expected
                if (a == r) {
                    r[i] = null; // null-terminate
                } else if (a.length < i) {
                    return Arrays.copyOf(r, i);
                } else {
                	for(int b=0;b<i;b++)
                		a[b]=r[b];
                    //System.arraycopy(r, 0, a, 0, i);
                    if (a.length > i) {
                        a[i] = null;
                    }
                }
                return a;
            }
            r[i] = (T)it.next();
        }
        // more elements than expected
        return it.hasNext() ? finishToArray(r, it) : r;
    }
    
    private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;
    
    @SuppressWarnings("unchecked")
	private static <T> T[] finishToArray(T[] r, OIterator<?> it) {
        int i = r.length;
        while (it.hasNext()) {
            int cap = r.length;
            if (i == cap) {
                int newCap = cap + (cap >> 1) + 1;
                // overflow-conscious code
                if (newCap - MAX_ARRAY_SIZE > 0)
                    newCap = hugeCapacity(cap + 1);
                r = Arrays.copyOf(r, newCap);
            }
            r[i++] = (T)it.next();
        }
        // trim if overallocated
        return (i == r.length) ? r : Arrays.copyOf(r, i);
    }

    private static int hugeCapacity(int minCapacity) {
        if (minCapacity < 0) // overflow
            throw new OutOfMemoryError
                ("Required array size too large");
        return (minCapacity > MAX_ARRAY_SIZE) ?
            Integer.MAX_VALUE :
            MAX_ARRAY_SIZE;
    }
    
    public boolean add(E e) {
        throw new UnsupportedOperationException();
    }
    
    public boolean remove(Object o) {
        OIterator<E> it = iterator();
        if (o==null) {
            while (it.hasNext()) {
                if (it.next()==null) {
                    it.remove();
                    return true;
                }
            }
        } else {
            while (it.hasNext()) {
                if (o.equals(it.next())) {
                    it.remove();
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean containsAll(OCollection<?> c) {
        for (Object e : ((Collection<?>)c))
            if (!contains(e))
                return false;
        return true;
    }
    
    @SuppressWarnings("unchecked")
	public boolean addAll(OCollection<? extends E> c) {
        boolean modified = false;
        for (E e : ((Collection<? extends E>)c))
            if (add(e))
                modified = true;
        return modified;
    }
    
    public boolean retainAll(OCollection<?> c) {
        boolean modified = false;
        OIterator<E> it = iterator();
        while (it.hasNext()) {
            if (!c.contains(it.next())) {
                it.remove();
                modified = true;
            }
        }
        return modified;
    }
    
    public void clear() {
        OIterator<E> it = iterator();
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }
    
    @SuppressWarnings("unchecked")
 	public boolean equals(Object o) {
         if (o == this)
             return true;
         if (o.getClass() != this.getClass())
             return false;
         OCollection<E> c = (OCollection<E>) o;
         if (c.size() != size())
             return false;
         try {
             return containsAll(c);
         }catch (NullPointerException unused) {
             return false;
         }
     }
     public int hashCode() {
         int h = 0;
         OIterator<E> i = iterator();
         while (i.hasNext()) {
             E obj = i.next();
             if (obj != null)
                 h += obj.hashCode();
         }
         return h;
     }
     public boolean removeAll(OCollection<?> c) {
         boolean modified = false;
         if (size() > c.size()) {
             for (OIterator<?> i = c.iterator(); i.hasNext(); )
                 modified |= remove(i.next());
         } else {
             for (OIterator<?> i = iterator(); i.hasNext(); ) {
                 if (c.contains(i.next())) {
                     i.remove();
                     modified = true;
                 }
             }
         }
         return modified;
     }
    
    public String toString() {
        OIterator<E> it = iterator();
        if (! it.hasNext())
            return "[]";

        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (;;) {
            E e = it.next();
            sb.append(e == this ? "(this Collection)" : e);
            if (! it.hasNext())
                return sb.append(']').toString();
            sb.append(',').append(' ');
        }
    }


}
