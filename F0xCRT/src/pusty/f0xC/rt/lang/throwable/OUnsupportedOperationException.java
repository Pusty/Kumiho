package pusty.f0xC.rt.lang.throwable;

import pusty.f0xC.lang.OverrideHandler.OverrideTranslation;

@SuppressWarnings("serial")
@OverrideTranslation(override = "java/lang/UnsupportedOperationException")
public class OUnsupportedOperationException extends RuntimeException {
    public OUnsupportedOperationException() {
        super();
    }
    public OUnsupportedOperationException(String s) {
        super(s);
    }
    public OUnsupportedOperationException(String message, Throwable cause) {
        super(message, cause);
    }
    public OUnsupportedOperationException(Throwable cause) {
        super(cause);
    }
}
