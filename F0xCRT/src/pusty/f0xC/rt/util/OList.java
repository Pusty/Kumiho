package pusty.f0xC.rt.util;

import pusty.f0xC.lang.OverrideHandler.OverrideTranslation;

@OverrideTranslation(override = "java/util/List")
public abstract class OList<E> extends OCollection<E>{
	public abstract boolean addAll(int index, OCollection<? extends E> c);
	public abstract E get(int index);
	public abstract E set(int index, E element);
	public abstract void add(int index, E element);
	public abstract E remove(int index);
	public abstract int indexOf(Object o);
	public abstract int lastIndexOf(Object o);
	public abstract OListIterator<E> listIterator();
	public abstract OListIterator<E> listIterator(int index);
	public abstract OList<E> subList(int fromIndex, int toIndex);
}
