package pusty.f0xC.rt.io;

import pusty.f0xC.lang.OverrideHandler.OverrideTranslation;

@SuppressWarnings("serial")
@OverrideTranslation(override = "java/io/FileNotFoundException")
public class OFileNotFoundException extends OIOException {
    public OFileNotFoundException() {
        super();
    }
    public OFileNotFoundException(String s) {
        super(s);
    }
    @SuppressWarnings("unused")
	private OFileNotFoundException(String path, String reason) {
        super(path + ((reason == null)
                      ? ""
                      : " (" + reason + ")"));
    }
}
