package pusty.f0xC.rt.io;

import java.io.IOException;

import pusty.f0xC.lang.OverrideHandler.OverrideTranslation;

@OverrideTranslation(override = "java/io/FileSystem")
public abstract class OFileSystem {
	
    public static final int BA_EXISTS    = 0x01;
    public static final int BA_REGULAR   = 0x02;
    public static final int BA_DIRECTORY = 0x04;
    public static final int BA_HIDDEN    = 0x08;
    
    public static final int ACCESS_READ    = 0x04;
    public static final int ACCESS_WRITE   = 0x02;
    public static final int ACCESS_EXECUTE = 0x01;
    
    public static final int SPACE_TOTAL  = 0;
    public static final int SPACE_FREE   = 1;
    public static final int SPACE_USABLE = 2;
    
    public static OFileSystem ofs = new CFileSystem();
	public static OFileSystem getFileSystem() { return ofs; }
	
	
	public abstract char getSeparator();
	public abstract char getPathSeparator();
//	public abstract String normalize(String path);
//	public abstract int prefixLength(String path);
//	public abstract String resolve(String parent, String child);
//	public abstract String getDefaultParent();
//	public abstract String fromURIPath(String path);
//	public abstract boolean isAbsolute(OFile f);
//    public abstract String resolve(OFile f);
//    public abstract String canonicalize(String path) throws IOException;
//    public abstract int getBooleanAttributes(OFile f);
//    public abstract boolean checkAccess(OFile f, int access);
//    public abstract boolean setPermission(OFile f, int access, boolean enable, boolean owneronly);
//    public abstract long getLastModifiedTime(OFile f);
//    public abstract long getLength(OFile f);
    
    public abstract boolean createFileExclusively(String pathname)
            throws IOException;
    public abstract boolean delete(OFile f);
//    public abstract String[] list(OFile f);
//    public abstract boolean createDirectory(OFile f);
    public abstract boolean rename(OFile f1, OFile f2);
//    public abstract boolean setLastModifiedTime(OFile f, long time);
//    public abstract boolean setReadOnly(OFile f);
//    public abstract OFile[] listRoots();
    
//    public abstract long getSpace(OFile f, int t);
    
    public abstract int compare(OFile f1, OFile f2);
    
    public abstract int hashCode(OFile f);
    
//    static boolean useCanonCaches      = true;
//    static boolean useCanonPrefixCache = true;
    
    /*private static boolean getBooleanProperty(String prop, boolean defaultVal) {
        String val = System.getProperty(prop);
        if (val == null) return defaultVal;
        if (val.equalsIgnoreCase("true")) {
            return true;
        } else {
            return false;
        }
    }*/
    
}
