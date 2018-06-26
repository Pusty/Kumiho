package pusty.f0xC.rt.lang.throwable;

import pusty.f0xC.lang.OverrideHandler.OverrideTranslation;

@SuppressWarnings("serial")
@OverrideTranslation(override = "java/lang/IndexOutOfBoundsException")
public class OIndexOutOfBoundsException extends RuntimeException {
    public OIndexOutOfBoundsException() {
        super();
    }
    public OIndexOutOfBoundsException(String s) {
        super(s);
    }
}
