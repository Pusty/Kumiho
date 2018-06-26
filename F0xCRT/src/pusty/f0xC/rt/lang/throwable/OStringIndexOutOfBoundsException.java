package pusty.f0xC.rt.lang.throwable;

import pusty.f0xC.lang.OverrideHandler.OverrideTranslation;

@SuppressWarnings("serial")
@OverrideTranslation(override = "java/lang/StringIndexOutOfBoundsException")
public class OStringIndexOutOfBoundsException extends IndexOutOfBoundsException {
    public OStringIndexOutOfBoundsException() {
        super();
    }
    public OStringIndexOutOfBoundsException(String s) {
        super(s);
    }
    public OStringIndexOutOfBoundsException(int index) {
        super("String index out of range: " + index);
    }
}
