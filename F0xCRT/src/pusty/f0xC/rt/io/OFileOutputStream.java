package pusty.f0xC.rt.io;

import java.io.FileNotFoundException;
import java.io.IOException;

import pusty.f0xC.lang.OverrideHandler.OverrideTranslation;
import pusty.f0xC.libc.CStdio;

@OverrideTranslation(override = "java/io/FileOutputStream")
public class OFileOutputStream extends OOutputStream {

	private boolean append;
	private final OFileDescriptor fd;
	
    public OFileOutputStream(String name) throws FileNotFoundException {
        this(name != null ? new OFile(name) : null, false);
    }
    public OFileOutputStream(String name, boolean append)
        throws FileNotFoundException {
        this(name != null ? new OFile(name) : null, append);
    }
    public OFileOutputStream(OFile file) throws FileNotFoundException {
        this(file, false);
    }
    public OFileOutputStream(OFile file, boolean append) throws FileNotFoundException {
        String name = (file != null ? file.getPath() : null);
        if (name == null) {
            throw new NullPointerException();
        }
        if (file.isInvalid()) {
            throw new FileNotFoundException("Invalid file path");
        }
        this.fd = new OFileDescriptor();
        this.append = append;
        open(name, append);
    }

    public OFileOutputStream(OFileDescriptor fdObj) {
        if (fdObj == null) {
            throw new NullPointerException();
        }
        this.fd = fdObj;
    }
    
    private void open(String name, boolean append) throws FileNotFoundException {
    	if(append)
    		fd.fd = CStdio.fopen(name, "ab+");
    	else
    		fd.fd = CStdio.fopen(name, "wb+");
    	
    	if(!fd.fd.valid()) throw new FileNotFoundException(name);
    }
    
    
    public void write(int b, boolean append) throws IOException {
    	CStdio.fputc(b, fd.fd);
    }
    
    public void write(int b) throws IOException {
       write(b, append);
    }

    private void writeBytes(byte b[], int off, int len, boolean append) throws IOException {
    	if(b.length < len) throw new IOException("Array too small");
    	CStdio.fsetpos(fd.fd, (long)off);
    	CStdio.fwrite(b, 1, len, fd.fd);
    	CStdio.rewind(fd.fd);
    }
    
    public void write(byte b[]) throws IOException {
        writeBytes(b, 0, b.length, append);
    }

    public void write(byte b[], int off, int len) throws IOException {
        writeBytes(b, off, len, append);
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
