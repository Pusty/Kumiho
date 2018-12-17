package pusty.f0xC.x64.libc;

import pusty.f0xC.lang.OverrideHandler.OverrideTranslation;

@OverrideTranslation(override = "pusty/f0xC/libc/CFile")
public class OCFile {
	private long fd;

	public OCFile() {
		this(-1);
	}
	
	public OCFile(long fd) {
		this.fd = fd;
	}

	public long getFD() {
		return this.fd;
	}

	public void setFD(long fd) {
		this.fd = fd;
	}
	
	public static OCFile fromInt(int i) {
		return new OCFile((long)i);
	}
	
	public boolean valid() { return this.fd != 0; }
}
