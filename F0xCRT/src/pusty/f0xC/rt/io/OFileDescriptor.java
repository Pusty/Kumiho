package pusty.f0xC.rt.io;

import pusty.f0xC.lang.OverrideHandler.OverrideTranslation;
import pusty.f0xC.libc.CFile;


@OverrideTranslation(override = "java/io/FileDescriptor")
public class OFileDescriptor {

    public CFile fd;
    public static final OFileDescriptor in = standardStream(0);
    public static final OFileDescriptor out = standardStream(1);
    public static final OFileDescriptor err = standardStream(2);
    
    public OFileDescriptor() {
        fd = new CFile();
    }
    
    public boolean valid() {
        return fd.valid();
    }
    
    private static OFileDescriptor standardStream(int fd) {
        OFileDescriptor desc = new OFileDescriptor();
        desc.fd = CFile.fromInt(fd);
        return desc;
    }
    
}
