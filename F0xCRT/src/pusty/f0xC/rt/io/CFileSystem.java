package pusty.f0xC.rt.io;

import pusty.f0xC.imports.libc.CStdio;

public class CFileSystem extends OFileSystem {
    private char slash;
  //  private char altSlash;
    private char semicolon;

    public CFileSystem() {
        slash = '/';
        semicolon = ';';
 //       altSlash = (this.slash == '\\') ? '/' : '\\';
    }
    /*
    private boolean isSlash(char c) {
        return (c == '\\') || (c == '/');
    }

    private boolean isLetter(char c) {
        return ((c >= 'a') && (c <= 'z')) || ((c >= 'A') && (c <= 'Z'));
    }

    private String slashify(String p) {
        if ((p.length() > 0) && (p.charAt(0) != slash)) return slash + p;
        else return p;
    }*/
    
    public char getSeparator() {
        return slash;
    }

    public char getPathSeparator() {
        return semicolon;
    }
 
 /*   public native int getBooleanAttributes(File f);
    public native boolean checkAccess(File f, int access);
    public native long getLastModifiedTime(File f);
    public native long getLength(File f);
    public native boolean setPermission(File f, int access, boolean enable, boolean owneronly);
*/
    
    public boolean delete(OFile f) {
    	return CStdio.remove(f.getPath()) == 0;
    }
    //public native String[] list(File f);
    //public native boolean createDirectory(OFile f);
    public boolean rename(OFile f1, OFile f2) {
    	return CStdio.rename(f1.getPath(), f2.getPath())==0;
    }
    
    public int compare(OFile f1, OFile f2) {
        return f1.getPath().compareToIgnoreCase(f2.getPath());
    }
    
    public int hashCode(OFile f) {
        return f.getPath().toLowerCase().hashCode() ^ 1234321;
    }

    


}
