package pusty.f0xC.x86.libc;

import pusty.f0xC.lang.OverrideHandler.OverrideTranslation;

@OverrideTranslation(override = "pusty/f0xC/libc/CFile")
public class OCFile {
	public int fd;

	public OCFile() {
		this(-1);
	}
	
	public OCFile(int fd) {
		this.fd = fd;
	}
	
	public static OCFile fromInt(int i) {
		return new OCFile(i);
	}

	public int getFD() {
		return this.fd;
	}

	public void setFD(int fd) {
		this.fd = fd;
	}
	
	public boolean valid() { return this.fd != 0; }
}
