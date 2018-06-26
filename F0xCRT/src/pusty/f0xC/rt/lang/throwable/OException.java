package pusty.f0xC.rt.lang.throwable;

import pusty.f0xC.lang.OverrideHandler.OverrideTranslation;

@SuppressWarnings("serial")
@OverrideTranslation(override = "java/lang/Exception")
public class OException extends Throwable {
	public OException() {
		super();
	}
    public OException(String message) {
    	super(message);
    }
    public OException(String message, Throwable cause) {
        super(message, cause);
    }
    public OException(Throwable cause) {
        super(cause);
    }
}
