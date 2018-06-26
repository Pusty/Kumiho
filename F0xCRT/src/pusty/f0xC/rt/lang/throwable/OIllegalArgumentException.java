package pusty.f0xC.rt.lang.throwable;

import pusty.f0xC.lang.OverrideHandler.OverrideTranslation;

@SuppressWarnings("serial")
@OverrideTranslation(override = "java/lang/IllegalArgumentException")
public class OIllegalArgumentException extends RuntimeException {
    public OIllegalArgumentException() {
        super();
    }
    public OIllegalArgumentException(String s) {
        super(s);
    }
    public OIllegalArgumentException(String message, Throwable cause) {
        super(message, cause);
    }
    public OIllegalArgumentException(Throwable cause) {
        super(cause);
    }
}
