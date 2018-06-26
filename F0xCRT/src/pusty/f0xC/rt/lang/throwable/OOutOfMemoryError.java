package pusty.f0xC.rt.lang.throwable;

import pusty.f0xC.lang.OverrideHandler.OverrideTranslation;

@SuppressWarnings("serial")
@OverrideTranslation(override = "java/lang/OutOfMemoryError")
public class OOutOfMemoryError extends VirtualMachineError{
    public OOutOfMemoryError() {
        super();
    }
    public OOutOfMemoryError(String s) {
        super(s);
    }
}
