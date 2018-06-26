package pusty.f0xC.rt.io;

import java.io.IOException;

import pusty.f0xC.lang.OverrideHandler.OverrideTranslation;

@OverrideTranslation(override = "java/io/FilterInputStream")
public class OFilterInputStream extends OInputStream {

	protected OInputStream in;

	protected OFilterInputStream(OInputStream in) {
        this.in = in;
    }
	
    public int read() throws IOException {
        return in.read();
    }
    
    public int read(byte b[]) throws IOException {
        return read(b, 0, b.length);
    }
    
    public int read(byte b[], int off, int len) throws IOException {
        return in.read(b, off, len);
    }
    
    public long skip(long n) throws IOException {
        return in.skip(n);
    }
    
    public int available() throws IOException {
        return in.available();
    }
    
    public void close() throws IOException {
        in.close();
    }
    
    public void reset() throws IOException {
        in.reset();
    }


}
