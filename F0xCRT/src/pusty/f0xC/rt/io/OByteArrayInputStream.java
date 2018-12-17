package pusty.f0xC.rt.io;

import java.io.IOException;

import pusty.f0xC.lang.OverrideHandler.OverrideTranslation;

@OverrideTranslation(override = "java/io/ByteArrayInputStream")
public class OByteArrayInputStream extends OInputStream {
    byte buf[];
    int pos;
    int count;
    int mark = 0;

    public OByteArrayInputStream(byte buf[]) {
        this.buf = buf;
        this.pos = 0;
        this.count = buf.length;
    }

    public OByteArrayInputStream(byte buf[], int offset, int length) {
        this.buf = buf;
        this.pos = offset;
        this.count = Math.min(offset + length, buf.length);
        this.mark = offset;
    }

    public int read() {
        return (pos < count) ? (buf[pos++] & 0xff) : -1;
    }

    public int read(byte b[], int off, int len) {
        if (b == null)
            throw new NullPointerException();
        else if (off < 0 || len < 0 || len > b.length - off)
            throw new IndexOutOfBoundsException();
        if (pos >= count)
            return -1;
        int avail = count - pos;
        if (len > avail)
            len = avail;
        if (len <= 0)
            return 0;
        //System.arraycopy(buf, pos, b, off, len);
        for(int i=0;i<len;i++)
        	b[off+i] = buf[pos+i];
        pos += len;
        return len;
    }

    public long skip(long n) {
        long k = count - pos;
        if (n < k)
            k = n < 0 ? 0 : n;
        pos += k;
        return k;
    }

    public int available() {
        return count - pos;
    }

    public boolean markSupported() {
        return true;
    }

    public void mark(int readAheadLimit) {
        mark = pos;
    }

    public void reset() {
        pos = mark;
    }

    public void close() throws IOException {
    }
}
