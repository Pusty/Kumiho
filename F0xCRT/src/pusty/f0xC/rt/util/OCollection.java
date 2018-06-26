package pusty.f0xC.rt.util;

import pusty.f0xC.lang.OverrideHandler.OverrideTranslation;

@OverrideTranslation(override = "java/util/Collection")
public abstract class OCollection<E> extends OIterable<E>{
	public abstract int size();
	public abstract boolean isEmpty();
	public abstract boolean contains(Object o);
	public abstract OIterator<E> iterator();
	public abstract Object[] toArray();
	public abstract <T> T[] toArray(T[] a);
	public abstract boolean add(E e);
	public abstract boolean remove(Object o);
	public abstract boolean containsAll(OCollection<?> c);
	public abstract boolean addAll(OCollection<? extends E> c);
	public abstract boolean removeAll(OCollection<?> c);
	public abstract boolean retainAll(OCollection<?> c);
	public abstract void clear();
	public abstract boolean equals(Object o);
	public abstract int hashCode();
}
