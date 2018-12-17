package pusty.f0xC.rt.util;

import pusty.f0xC.lang.OverrideHandler.OverrideTranslation;

@OverrideTranslation(override = "java/util/Enumeration")
public abstract class OEnumeration<E>  {
	public abstract boolean hasMoreElements();
	public abstract E nextElement();
}
