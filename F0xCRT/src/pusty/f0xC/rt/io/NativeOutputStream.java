package pusty.f0xC.rt.io;

import pusty.f0xC.libc.CStdio;

public class NativeOutputStream extends OOutputStream {
	public void write(int b) { CStdio.putchar(b); }
}
