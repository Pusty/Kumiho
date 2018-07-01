package pusty.f0xC.rt.lang.throwable;

import pusty.f0xC.lang.OverrideHandler.OverrideTranslation;

@SuppressWarnings("serial")
@OverrideTranslation(override = "java/io/EOFException")
public class OEOFException extends OIOException {
    public OEOFException() {
        super();
    }
    public OEOFException(String s) {
        super(s);
    }
}
