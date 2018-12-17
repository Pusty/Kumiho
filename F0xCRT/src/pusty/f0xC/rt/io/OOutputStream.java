package pusty.f0xC.rt.io;

import java.io.IOException;

import pusty.f0xC.lang.OverrideHandler.OverrideTranslation;

@OverrideTranslation(override = "java/io/OutputStream")
public abstract class OOutputStream {
	
	public void write(int b) throws IOException {}

	public void write(byte[] ba) throws IOException  {
		write(ba, 0, ba.length);
	}

	public void write(byte[] ba, int start, int len) throws IOException  {
		int end = start + len;
		for (int i = start; i < end; i++) {
			write(ba[i]);
		}
	}

	public void flush() {}

	public void close() throws IOException  {}
    
}
