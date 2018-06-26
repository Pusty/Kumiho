package pusty.f0xC.rt.lang.throwable;

import pusty.f0xC.lang.OverrideHandler.OverrideTranslation;

@SuppressWarnings("serial")
@OverrideTranslation(override = "java/lang/RuntimeException")
public class ORuntimeException extends Exception {
    public ORuntimeException() {
        super();
    }
    public ORuntimeException(String message) {
        super(message);
    }
    public ORuntimeException(String message, Throwable cause) {
        super(message, cause);
    }
    public ORuntimeException(Throwable cause) {
        super(cause);
    }

}
