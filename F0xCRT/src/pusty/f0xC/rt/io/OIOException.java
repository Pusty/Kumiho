package pusty.f0xC.rt.io;

import pusty.f0xC.lang.OverrideHandler.OverrideTranslation;

@SuppressWarnings("serial")
@OverrideTranslation(override = "java/io/IOException")
public class OIOException extends Exception {
    public OIOException() {
        super();
    }
    public OIOException(String message) {
        super(message);
    }
    public OIOException(String message, Throwable cause) {
        super(message, cause);
    }
    public OIOException(Throwable cause) {
        super(cause);
    }
}
