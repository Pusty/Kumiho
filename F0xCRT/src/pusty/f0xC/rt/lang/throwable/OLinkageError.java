package pusty.f0xC.rt.lang.throwable;

import pusty.f0xC.lang.OverrideHandler.OverrideTranslation;

@SuppressWarnings("serial")
@OverrideTranslation(override = "java/lang/LinkageError")
public class OLinkageError extends Error {
    public OLinkageError() {
        super();
    }
    public OLinkageError(String s) {
        super(s);
    }
    public OLinkageError(String s, Throwable cause) {
        super(s, cause);
    }
}
