package pusty.f0xC.rt.util;

import pusty.f0xC.lang.OverrideHandler.OverrideTranslation;

@OverrideTranslation(override = "java/util/ListIterator")
public abstract class OListIterator<E> extends OIterator<E> {
	public abstract boolean hasNext();
	public abstract E next();
	public abstract boolean hasPrevious();
	public abstract E previous();
	public abstract int nextIndex();
	public abstract int previousIndex();
	public abstract void remove();
	public abstract void set(E e);
	public abstract void add(E e);
}
