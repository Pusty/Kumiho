package pusty.f0xC.rt.lang.throwable;

import pusty.f0xC.lang.OverrideHandler.OverrideTranslation;

@SuppressWarnings("serial")
@OverrideTranslation(override = "java/lang/UnsatisfiedLinkError")
public class OUnsatisfiedLinkError extends LinkageError {
    public OUnsatisfiedLinkError() {
        super();
    }
    public OUnsatisfiedLinkError(String s) {
        super(s);
    }
}
