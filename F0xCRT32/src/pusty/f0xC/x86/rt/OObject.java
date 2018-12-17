package pusty.f0xC.x86.rt;

import pusty.f0xC.lang.OverrideHandler.OverrideTranslation;
import pusty.f0xC.x86.internal.InternalObject;


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
    protected Object clone() { return null; }
    protected void finalize() throws Throwable { }
}
