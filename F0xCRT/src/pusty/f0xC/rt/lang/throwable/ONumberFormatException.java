package pusty.f0xC.rt.lang.throwable;

import pusty.f0xC.lang.OverrideHandler.OverrideTranslation;

//same as original
@SuppressWarnings("serial")
@OverrideTranslation(override = "java/lang/NumberFormatException")
public class ONumberFormatException extends IllegalArgumentException  {
    public ONumberFormatException () {
        super();
    }
    public ONumberFormatException (String s) {
        super (s);
    }
    public static ONumberFormatException forInputString(String s) {
        return new ONumberFormatException("For input string: \"" + s + "\"");
    }
}
