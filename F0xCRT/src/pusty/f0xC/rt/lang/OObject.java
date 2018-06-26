package pusty.f0xC.rt.lang;

import pusty.f0xC.imports.InternalObject;
import pusty.f0xC.lang.OverrideHandler.OverrideTranslation;

@OverrideTranslation(override = "java/lang/Object")
public abstract class OObject {
    public String toString() {
        return getClass().getName() + '@' + Integer.toHexString(hashCode());
    }
	public int hashCode() { return InternalObject.obj2int(this); }
    public boolean equals(Object obj) {
        return (this == obj);
    }
    public static <T> OClass<T> getClass(Object obj) {
		return new OClass<T>(InternalObject.getID(obj));
    }
}
