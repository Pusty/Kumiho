package pusty.f0xC.rt.lang.throwable;

import pusty.f0xC.lang.OverrideHandler.OverrideTranslation;

@SuppressWarnings("serial")
@OverrideTranslation(override = "java/lang/Error")
public class OError extends Throwable {
    public OError() {
        super();
    }
    public OError(String message) {
        super(message);
    }
    public OError(String message, Throwable cause) {
        super(message, cause);
    }
    public OError(Throwable cause) {
        super(cause);
    }
}
