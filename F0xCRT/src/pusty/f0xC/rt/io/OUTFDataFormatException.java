package pusty.f0xC.rt.io;

import pusty.f0xC.lang.OverrideHandler.OverrideTranslation;

@SuppressWarnings("serial")
@OverrideTranslation(override = "java/io/UTFDataFormatException")
public class OUTFDataFormatException extends OIOException {

	public OUTFDataFormatException (String msg) {
		super(msg);
	}

	public OUTFDataFormatException () {
		super();
	}
}
