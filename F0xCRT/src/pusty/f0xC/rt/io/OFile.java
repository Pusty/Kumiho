package pusty.f0xC.rt.io;

import java.io.IOException;

import pusty.f0xC.lang.OverrideHandler.OverrideTranslation;

@OverrideTranslation(override = "java/io/File")
public class OFile {
	
	static private OFileSystem fs = OFileSystem.getFileSystem();
	
	private String path;
	private int prefixLength;
    
    int getPrefixLength() {
        return prefixLength;
    }

    
    public static char separatorChar = fs.getSeparator();
   // public static final String separator = "" + separatorChar;
    public static char pathSeparatorChar = fs.getPathSeparator();
   // public static final String pathSeparator = "" + pathSeparatorChar;
    
    private OFile(String pathname, int prefixLength) {
        this.path = pathname;
        this.prefixLength = prefixLength;
    }
    
  /*  private OFile(String child, OFile parent) {
        assert parent.path != null;
        assert (!parent.path.equals(""));
        this.path = fs.resolve(parent.path, child);
        this.prefixLength = parent.prefixLength;
    }
    */
    public OFile(String pathname) {
        if (pathname == null) {
            throw new NullPointerException();
        }
        //this.path = fs.normalize(pathname);
       // this.prefixLength = fs.prefixLength(this.path);
        this.path = pathname;
        this.prefixLength = 0;
    }
    
   /* public OFile(String parent, String child) {
        if (child == null) {
            throw new NullPointerException();
        }
        if (parent != null) {
            if (parent.equals("")) {
                this.path = fs.resolve(fs.getDefaultParent(),
                                       fs.normalize(child));
            } else {
                this.path = fs.resolve(fs.normalize(parent),
                                       fs.normalize(child));
            }
        } else {
            this.path = fs.normalize(child);
        }
        this.prefixLength = fs.prefixLength(this.path);
    }
    
    public OFile(OFile parent, String child) {
        if (child == null) {
            throw new NullPointerException();
        }
        if (parent != null) {
            if (parent.path.equals("")) {
                this.path = fs.resolve(fs.getDefaultParent(),
                                       fs.normalize(child));
            } else {
                this.path = fs.resolve(parent.path,
                                       fs.normalize(child));
            }
        } else {
            this.path = fs.normalize(child);
        }
        this.prefixLength = fs.prefixLength(this.path);
    }*/
    
   /* public OFile(URI uri) {

        // Check our many preconditions
        if (!uri.isAbsolute())
            throw new IllegalArgumentException("URI is not absolute");
        if (uri.isOpaque())
            throw new IllegalArgumentException("URI is not hierarchical");
        String scheme = uri.getScheme();
        if ((scheme == null) || !scheme.equalsIgnoreCase("file"))
            throw new IllegalArgumentException("URI scheme is not \"file\"");
        if (uri.getAuthority() != null)
            throw new IllegalArgumentException("URI has an authority component");
        if (uri.getFragment() != null)
            throw new IllegalArgumentException("URI has a fragment component");
        if (uri.getQuery() != null)
            throw new IllegalArgumentException("URI has a query component");
        String p = uri.getPath();
        if (p.equals(""))
            throw new IllegalArgumentException("URI path component is empty");

        // Okay, now initialize
        p = fs.fromURIPath(p);
        if (OFile.separatorChar != '/')
            p = p.replace('/', OFile.separatorChar);
        this.path = fs.normalize(p);
        this.prefixLength = fs.prefixLength(this.path);
    }*/
    
    public String getName() {
        int index = path.lastIndexOf(separatorChar);
        if (index < prefixLength) return path.substring(prefixLength);
        return path.substring(index + 1);
    }
    
    public String getParent() {
        int index = path.lastIndexOf(separatorChar);
        if (index < prefixLength) {
            if ((prefixLength > 0) && (path.length() > prefixLength))
                return path.substring(0, prefixLength);
            return null;
        }
        return path.substring(0, index);
    }
    
    public OFile getParentFile() {
        String p = this.getParent();
        if (p == null) return null;
        return new OFile(p, this.prefixLength);
    }
    
    public String getPath() {
        return path;
    }
    
    /*public boolean isAbsolute() {
        return fs.isAbsolute(this);
    }
    
    public String getAbsolutePath() {
        return fs.resolve(this);
    }
    
    public OFile getAbsoluteFile() {
        String absPath = getAbsolutePath();
        return new OFile(absPath, fs.prefixLength(absPath));
    }*/
 /*   
    public String getCanonicalPath() throws IOException {
        if (isInvalid()) {
            throw new IOException("Invalid file path");
        }
        return fs.canonicalize(fs.resolve(this));
    }
    
    public OFile getCanonicalFile() throws IOException {
        String canonPath = getCanonicalPath();
        return new OFile(canonPath, fs.prefixLength(canonPath));
    }
*/
    /*
    private static String slashify(String path, boolean isDirectory) {
        String p = path;
        if (OFile.separatorChar != '/')
            p = p.replace(OFile.separatorChar, '/');
        if (!p.startsWith("/"))
            p = "/" + p;
        if (!p.endsWith("/") && isDirectory)
            p = p + "/";
        return p;
    }*/
    
/*    @Deprecated
    public URL toURL() throws MalformedURLException {
        if (isInvalid()) {
            throw new MalformedURLException("Invalid file path");
        }
        return new URL("file", "", slashify(getAbsolutePath(), isDirectory()));
    }
    
    
    public URI toURI() {
        try {
            File f = getAbsoluteFile();
            String sp = slashify(f.getPath(), f.isDirectory());
            if (sp.startsWith("//"))
                sp = "//" + sp;
            return new URI("file", null, sp, null);
        } catch (URISyntaxException x) {
            throw new Error(x);         // Can't happen
        }
    }*/
    
    /*
    public boolean canRead() {
        SecurityManager security = System.getSecurityManager();
        if (security != null) {
            security.checkRead(path);
        }
        if (isInvalid()) {
            return false;
        }
        return fs.checkAccess(this, OFileSystem.ACCESS_READ);
    }
    
    public boolean canWrite() {
        SecurityManager security = System.getSecurityManager();
        if (security != null) {
            security.checkWrite(path);
        }
        if (isInvalid()) {
            return false;
        }
        return fs.checkAccess(this, OFileSystem.ACCESS_WRITE);
    }
    
    public boolean exists() {
        SecurityManager security = System.getSecurityManager();
        if (security != null) {
            security.checkRead(path);
        }
        if (isInvalid()) {
            return false;
        }
        return ((fs.getBooleanAttributes(this) & OFileSystem.BA_EXISTS) != 0);
    }
    
    public boolean isDirectory() {
        SecurityManager security = System.getSecurityManager();
        if (security != null) {
            security.checkRead(path);
        }
        if (isInvalid()) {
            return false;
        }
        return ((fs.getBooleanAttributes(this) & OFileSystem.BA_DIRECTORY)
                != 0);
    }
    
    public boolean isFile() {
        SecurityManager security = System.getSecurityManager();
        if (security != null) {
            security.checkRead(path);
        }
        if (isInvalid()) {
            return false;
        }
        return ((fs.getBooleanAttributes(this) & OFileSystem.BA_REGULAR) != 0);
    }
    
    public boolean isHidden() {
        SecurityManager security = System.getSecurityManager();
        if (security != null) {
            security.checkRead(path);
        }
        if (isInvalid()) {
            return false;
        }
        return ((fs.getBooleanAttributes(this) & OFileSystem.BA_HIDDEN) != 0);
    }
    
    public long lastModified() {
        SecurityManager security = System.getSecurityManager();
        if (security != null) {
            security.checkRead(path);
        }
        if (isInvalid()) {
            return 0L;
        }
        return fs.getLastModifiedTime(this);
    }
    
    public long length() {
        SecurityManager security = System.getSecurityManager();
        if (security != null) {
            security.checkRead(path);
        }
        if (isInvalid()) {
            return 0L;
        }
        return fs.getLength(this);
    }*/
    
    public boolean createNewFile() throws IOException {
        if (isInvalid()) {
            throw new IOException("Invalid file path");
        }
        return fs.createFileExclusively(path);
        
    }
    
    public boolean delete() {
        if (isInvalid()) {
            return false;
        }
        return fs.delete(this);
    }
    
    public boolean isAbsolute() {
        return this.path.startsWith("/") || (this.path.length()>2 && this.path.charAt(1)==':');
    }

    
    /*public void deleteOnExit() {
        SecurityManager security = System.getSecurityManager();
        if (security != null) {
            security.checkDelete(path);
        }
        if (isInvalid()) {
            return;
        }
        DeleteOnExitHook.add(path);
    }*/
    
    /*public String[] list() {
        SecurityManager security = System.getSecurityManager();
        if (security != null) {
            security.checkRead(path);
        }
        if (isInvalid()) {
            return null;
        }
        return fs.list(this);
    }*/
    
   /* public String[] list(FilenameFilter filter) {
        String names[] = list();
        if ((names == null) || (filter == null)) {
            return names;
        }
        List<String> v = new ArrayList<>();
        for (int i = 0 ; i < names.length ; i++) {
            if (filter.accept(this, names[i])) {
                v.add(names[i]);
            }
        }
        return v.toArray(new String[v.size()]);
    }*/
    
   /* public OFile[] listFiles() {
        String[] ss = list();
        if (ss == null) return null;
        int n = ss.length;
        OFile[] fs = new OFile[n];
        for (int i = 0; i < n; i++) {
            fs[i] = new OFile(ss[i], this);
        }
        return fs;
    }*/
    
    /*public OFile[] listFiles(FilenameFilter filter) {
        String ss[] = list();
        if (ss == null) return null;
        ArrayList<OFile> files = new ArrayList<>();
        for (String s : ss)
            if ((filter == null) || filter.accept(this, s))
                files.add(new OFile(s, this));
        return files.toArray(new OFile[files.size()]);
    }
    
    public OFile[] listFiles(FileFilter filter) {
        String ss[] = list();
        if (ss == null) return null;
        ArrayList<OFile> files = new ArrayList<>();
        for (String s : ss) {
            OFile f = new OFile(s, this);
            if ((filter == null) || filter.accept(f))
                files.add(f);
        }
        return files.toArray(new OFile[files.size()]);
    }*/
    
    /*public boolean mkdir() {
        SecurityManager security = System.getSecurityManager();
        if (security != null) {
            security.checkWrite(path);
        }
        if (isInvalid()) {
            return false;
        }
        return fs.createDirectory(this);
    }*/
    
    /*public boolean mkdirs() {
        if (exists()) {
            return false;
        }
        if (mkdir()) {
            return true;
        }
        OFile canonFile = null;
        try {
            canonFile = getCanonicalFile();
        } catch (IOException e) {
            return false;
        }

        OFile parent = canonFile.getParentFile();
        return (parent != null && (parent.mkdirs() || parent.exists()) &&
                canonFile.mkdir());
    }*/
    
    public boolean renameTo(OFile dest) {
        return fs.rename(this, dest);
    }
    
    /*public boolean setLastModified(long time) {
        if (time < 0) throw new IllegalArgumentException("Negative time");
        SecurityManager security = System.getSecurityManager();
        if (security != null) {
            security.checkWrite(path);
        }
        if (isInvalid()) {
            return false;
        }
        return fs.setLastModifiedTime(this, time);
    }
    
    public boolean setReadOnly() {
        SecurityManager security = System.getSecurityManager();
        if (security != null) {
            security.checkWrite(path);
        }
        if (isInvalid()) {
            return false;
        }
        return fs.setReadOnly(this);
    }
    
    public boolean setWritable(boolean writable, boolean ownerOnly) {
        SecurityManager security = System.getSecurityManager();
        if (security != null) {
            security.checkWrite(path);
        }
        if (isInvalid()) {
            return false;
        }
        return fs.setPermission(this, OFileSystem.ACCESS_WRITE, writable, ownerOnly);
    }
    
    public boolean setWritable(boolean writable) {
        return setWritable(writable, true);
    }
    
    public boolean setReadable(boolean readable, boolean ownerOnly) {
        SecurityManager security = System.getSecurityManager();
        if (security != null) {
            security.checkWrite(path);
        }
        if (isInvalid()) {
            return false;
        }
        return fs.setPermission(this, OFileSystem.ACCESS_READ, readable, ownerOnly);
    }
    
    public boolean setReadable(boolean readable) {
        return setReadable(readable, true);
    }
    
    public boolean setExecutable(boolean executable, boolean ownerOnly) {
        SecurityManager security = System.getSecurityManager();
        if (security != null) {
            security.checkWrite(path);
        }
        if (isInvalid()) {
            return false;
        }
        return fs.setPermission(this, OFileSystem.ACCESS_EXECUTE, executable, ownerOnly);
    }
    
    public boolean setExecutable(boolean executable) {
        return setExecutable(executable, true);
    }
    
    public boolean canExecute() {
        SecurityManager security = System.getSecurityManager();
        if (security != null) {
            security.checkExec(path);
        }
        if (isInvalid()) {
            return false;
        }
        return fs.checkAccess(this, OFileSystem.ACCESS_EXECUTE);
    }
    
    public static OFile[] listRoots() {
        return fs.listRoots();
    }
    
    public long getTotalSpace() {
        SecurityManager sm = System.getSecurityManager();
        if (sm != null) {
            sm.checkPermission(new RuntimePermission("getFileSystemAttributes"));
            sm.checkRead(path);
        }
        if (isInvalid()) {
            return 0L;
        }
        return fs.getSpace(this, OFileSystem.SPACE_TOTAL);
    }
    
    public long getFreeSpace() {
        SecurityManager sm = System.getSecurityManager();
        if (sm != null) {
            sm.checkPermission(new RuntimePermission("getFileSystemAttributes"));
            sm.checkRead(path);
        }
        if (isInvalid()) {
            return 0L;
        }
        return fs.getSpace(this, OFileSystem.SPACE_FREE);
    }
    
    public long getUsableSpace() {
        SecurityManager sm = System.getSecurityManager();
        if (sm != null) {
            sm.checkPermission(new RuntimePermission("getFileSystemAttributes"));
            sm.checkRead(path);
        }
        if (isInvalid()) {
            return 0L;
        }
        return fs.getSpace(this, OFileSystem.SPACE_USABLE);
    } */
    
    public int compareTo(OFile pathname) {
        return fs.compare(this, pathname);
    }
    
    public boolean equals(Object obj) {
        if ((obj != null) && (obj instanceof OFile)) {
            return compareTo((OFile)obj) == 0;
        }
        return false;
    }
    
    public int hashCode() {
        return fs.hashCode(this);
    }
    
    public String toString() {
        return getPath();
    }

	public boolean isInvalid() {
		return false;
	}
    
/*    private Path filePath;
    
    public Path toPath() {
        Path result = filePath;
        if (result == null) {
            synchronized (this) {
                result = filePath;
                if (result == null) {
                    result = FileSystems.getDefault().getPath(path);
                    filePath = result;
                }
            }
        }
        return result;
    }*/


}
