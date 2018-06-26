package pusty.f0xC.rt.util;

import pusty.f0xC.lang.OverrideHandler.OverrideTranslation;

@OverrideTranslation(override = "java/util/Iterator")
public abstract class OIterator<E> {
	public abstract boolean hasNext();
	public abstract E next();
	public abstract void remove();
}
