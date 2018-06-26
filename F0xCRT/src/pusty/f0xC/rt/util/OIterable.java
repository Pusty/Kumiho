package pusty.f0xC.rt.util;

import pusty.f0xC.lang.OverrideHandler.OverrideTranslation;

@OverrideTranslation(override = "java/util/Iterable")
public abstract class OIterable<T> {
	abstract OIterator<T> iterator();
}
