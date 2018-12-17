package pusty.f0xC.x64.rt;

import pusty.f0xC.lang.OverrideHandler.OverrideTranslation;
import pusty.f0xC.x64.internal.InternalObject;


@OverrideTranslation(override = "java/lang/Object")
public abstract class OObject {
    public String toString() {
        return getClass().getName() + '@' + Integer.toHexString(hashCode());
    }
	public int hashCode() { return (int)InternalObject.obj2long(this); }
    public boolean equals(Object obj) {
        return (this == obj);
    }
    public static <T> OClass<T> getClass(Object obj) {
		return new OClass<T>(InternalObject.getID(obj));
    }
    protected Object clone()  { return null; }
    protected void finalize() throws Throwable { }
}
