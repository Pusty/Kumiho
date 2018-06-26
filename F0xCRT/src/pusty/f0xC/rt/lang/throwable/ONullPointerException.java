package pusty.f0xC.rt.lang.throwable;

import pusty.f0xC.lang.OverrideHandler.OverrideTranslation;

@SuppressWarnings("serial")
@OverrideTranslation(override = "java/lang/NullPointerException")
public class ONullPointerException extends RuntimeException  {
    public ONullPointerException() {
        super();
    }
    public ONullPointerException(String s) {
        super(s);
    }
}
