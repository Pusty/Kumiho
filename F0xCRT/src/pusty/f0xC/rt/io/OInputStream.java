package pusty.f0xC.rt.io;

import java.io.IOException;

import pusty.f0xC.lang.OverrideHandler.OverrideTranslation;

@OverrideTranslation(override = "java/io/InputStream")
public abstract class OInputStream {
	private static final int MAX_SKIP_BUFFER_SIZE = 2048;
	public abstract int read() throws IOException;
    public int read(byte b[]) throws IOException {
        return read(b, 0, b.length);
    }
    
    public int read(byte b[], int off, int len) throws IOException {
        if (b == null) {
            throw new NullPointerException();
        } else if (off < 0 || len < 0 || len > b.length - off) {
            throw new IndexOutOfBoundsException();
        } else if (len == 0) {
            return 0;
        }

        int c = read();
        if (c == -1) {
            return -1;
        }
        b[off] = (byte)c;

        int i = 1;
        for (; i < len ; i++) {
            c = read();
            if (c == -1) {
                break;
            }
            b[off + i] = (byte)c;
        }
        return i;
    }
    
    public long skip(long n) throws IOException {

        long remaining = n;
        int nr;

        if (n <= 0) {
            return 0;
        }

        int size = (int) (MAX_SKIP_BUFFER_SIZE > remaining?remaining:MAX_SKIP_BUFFER_SIZE);
        byte[] skipBuffer = new byte[size];
        while (remaining > 0) {
            nr = read(skipBuffer, 0, (int)(size>remaining?remaining:size));
            if (nr < 0) {
                break;
            }
            remaining -= nr;
        }

        return n - remaining;
    }
    
    public int available() throws IOException {
        return 0;
    }
    
    public void close() throws IOException {}
    
    public void reset() throws IOException {
        throw new IOException("mark/reset not supported");
    }
    
}
