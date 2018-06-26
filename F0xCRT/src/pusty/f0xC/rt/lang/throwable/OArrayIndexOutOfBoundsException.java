package pusty.f0xC.rt.lang.throwable;

import pusty.f0xC.lang.OverrideHandler.OverrideTranslation;


@SuppressWarnings("serial")
@OverrideTranslation(override = "java/lang/ArrayIndexOutOfBoundsException")
public class OArrayIndexOutOfBoundsException extends IndexOutOfBoundsException{
    public OArrayIndexOutOfBoundsException() {
        super();
    }
    public OArrayIndexOutOfBoundsException(int index) {
        super("Array index out of range: " + index);
    }
    public OArrayIndexOutOfBoundsException(String s) {
        super(s);
    }
}
