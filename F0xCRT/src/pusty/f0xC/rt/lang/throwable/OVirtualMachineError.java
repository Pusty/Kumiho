package pusty.f0xC.rt.lang.throwable;

import pusty.f0xC.lang.OverrideHandler.OverrideTranslation;

@SuppressWarnings("serial")
@OverrideTranslation(override = "java/lang/VirtualMachineError")
public class OVirtualMachineError extends Error {
    public OVirtualMachineError() {
        super();
    }
    public OVirtualMachineError(String s) {
        super(s);
    }
}
