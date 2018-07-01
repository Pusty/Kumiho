package pusty.f0xC.rt.lang.throwable;

import pusty.f0xC.lang.OverrideHandler.OverrideTranslation;

@SuppressWarnings("serial")
@OverrideTranslation(override = "java/lang/IllegalStateException")
public class OIllegalStateException extends RuntimeException {
    public OIllegalStateException() {
        super();
    }
    public OIllegalStateException(String s) {
        super(s);
    }
    public OIllegalStateException(String message, Throwable cause) {
        super(message, cause);
    }
    public OIllegalStateException(Throwable cause) {
        super(cause);
    }
}
