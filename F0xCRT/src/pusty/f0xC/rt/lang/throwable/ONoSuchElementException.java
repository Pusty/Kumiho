package pusty.f0xC.rt.lang.throwable;

import pusty.f0xC.lang.OverrideHandler.OverrideTranslation;

@SuppressWarnings("serial")
@OverrideTranslation(override = "java/util/NoSuchElementException")
public class ONoSuchElementException extends RuntimeException{
    public ONoSuchElementException() {
        super();
    }
    public ONoSuchElementException(String s) {
        super(s);
    }
}
