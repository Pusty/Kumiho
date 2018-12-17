package pusty.f0xC.rt.lang;

import java.io.InputStream;
import java.io.OutputStream;

import pusty.f0xC.lang.OverrideHandler.OverrideTranslation;

@OverrideTranslation(override = "java/lang/Process")
public abstract class OProcess {
	abstract public OutputStream getOutputStream();
	abstract public InputStream getInputStream();
	abstract public InputStream getErrorStream();
	abstract public int waitFor() throws InterruptedException;
	abstract public int exitValue();
	abstract public void destroy();
}
