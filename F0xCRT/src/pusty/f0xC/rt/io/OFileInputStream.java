package pusty.f0xC.rt.io;

import java.io.FileNotFoundException;
import java.io.IOException;

import pusty.f0xC.imports.libc.CStdio;
import pusty.f0xC.lang.OverrideHandler.OverrideTranslation;

@OverrideTranslation(override = "java/io/FileInputStream")
public class OFileInputStream extends OInputStream {

	private final OFileDescriptor fd;

    public OFileInputStream(String name) throws FileNotFoundException {
        this(name != null ? new OFile(name) : null);
    }
    
    public OFileInputStream(OFile file) throws FileNotFoundException {
        String name = (file != null ? file.getPath() : null);
        if (name == null) {
            throw new NullPointerException();
        }
        if (file.isInvalid()) {
            throw new FileNotFoundException("Invalid file path");
        }
        fd = new OFileDescriptor();
        open(name);
    }
    
    public OFileInputStream(OFileDescriptor fdObj) {
        if (fdObj == null) {
            throw new NullPointerException();
        }
        fd = fdObj;
    }
    
    private void open(String name) throws FileNotFoundException {
    	fd.fd = CStdio.fopen(name, "rb");
    }

	  
    public int read() throws IOException {
        return read0();
    }

    private int read0() throws IOException {
    	if(CStdio.feof(fd.fd)) return -1;
    	int b = CStdio.fgetc(fd.fd);
    	return b;
    }
    
    private int readBytes(byte b[], int off, int len) throws IOException {
    	if(b.length < len) throw new IOException("Array too small");
    	CStdio.fsetpos(fd.fd, off);
    	if(len > available()) throw new IOException("Read out of bounds");
    	int amount = CStdio.fread(b, 1, len, fd.fd);
    	CStdio.rewind(fd.fd);
    	return amount;
    }
    
    public int read(byte b[]) throws IOException {
        int bytesRead = 0;
        bytesRead = readBytes(b, 0, b.length);
        return bytesRead;
    }
    
    public int read(byte b[], int off, int len) throws IOException {
        int bytesRead = 0;
        bytesRead = readBytes(b, off, len);
        return bytesRead;
    }
    
    public long skip(long n) throws IOException {
    	return CStdio.fseek(fd.fd, (int)n, CStdio.SEEK_CUR);
    }
    
    public int available() throws IOException {
    	Integer cur = 0;
    	CStdio.fgetpos(fd.fd, cur);
    	CStdio.fseek(fd.fd, 0, CStdio.SEEK_END);
    	int size = CStdio.ftell(fd.fd)-cur;
    	CStdio.fsetpos(fd.fd, cur);
    	return size;
    }
    
    public void close() throws IOException {
        close0();
    }
    
    private void close0() throws IOException {
    	if(CStdio.fclose(fd.fd) != 0) throw new IOException();
    }

    
    public final OFileDescriptor getFD() throws IOException {
        if (fd != null) return fd;
        throw new IOException();
    }
    
    protected void finalize() throws IOException {
        if ((fd != null) &&  (fd != OFileDescriptor.in))
              close();
    }
}
