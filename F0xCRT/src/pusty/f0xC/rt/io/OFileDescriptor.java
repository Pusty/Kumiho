package pusty.f0xC.rt.io;

import pusty.f0xC.imports.libc.CStdio.FILE;
import pusty.f0xC.lang.OverrideHandler.OverrideTranslation;

@OverrideTranslation(override = "java/io/FileDescriptor")
public class OFileDescriptor {

    public FILE fd;
    public static final OFileDescriptor in = standardStream(0);
    public static final OFileDescriptor out = standardStream(1);
    public static final OFileDescriptor err = standardStream(2);
    
    public OFileDescriptor() {
        fd = new FILE(-1);
    }
    
    public boolean valid() {
        return (fd.getFD() != -1);
    }
    
    private static OFileDescriptor standardStream(int fd) {
        OFileDescriptor desc = new OFileDescriptor();
        desc.fd.setFD(fd);
        return desc;
    }
    
}
