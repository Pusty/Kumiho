package pusty.f0xC.rt.lang;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.StringTokenizer;

import pusty.f0xC.lang.OverrideHandler.OverrideTranslation;

@OverrideTranslation(override = "java/lang/Runtime")
public class ORuntime {
	private static ORuntime currentRuntime = new ORuntime();
	
    public static ORuntime getRuntime() {
        return currentRuntime;
    }
    
    private ORuntime() {}
    
    public void exit(int status) {
    	//need to call hooks
        System.exit(status);
    }
    
    public void addShutdownHook(Thread hook) {
    	throw new UnsupportedOperationException();
       // ApplicationShutdownHooks.add(hook);
    }
    
    public boolean removeShutdownHook(Thread hook) {
        //return ApplicationShutdownHooks.remove(hook);
    	throw new UnsupportedOperationException();
    }
    
    public void halt(int status) {
    	System.exit(status);
    }
    
    public static void runFinalizersOnExit(boolean value) {
       // Shutdown.setRunFinalizersOnExit(value);
        throw new UnsupportedOperationException();
    }
    
    public Process exec(String command) throws IOException {
        return exec(command, null, null);
    }
    
    public Process exec(String command, String[] envp) throws IOException {
        return exec(command, envp, null);
    }
    
    public Process exec(String command, String[] envp, File dir)
            throws IOException {
            if (command.length() == 0)
                throw new IllegalArgumentException("Empty command");
            StringTokenizer st = new StringTokenizer(command);
            String[] cmdarray = new String[st.countTokens()];
            for (int i = 0; st.hasMoreTokens(); i++)
                cmdarray[i] = st.nextToken();
            return exec(cmdarray, envp, dir);
       }
    
    public Process exec(String cmdarray[]) throws IOException {
        return exec(cmdarray, null, null);
    }
    
    public Process exec(String[] cmdarray, String[] envp) throws IOException {
        return exec(cmdarray, envp, null);
    }
    
    public Process exec(String[] cmdarray, String[] envp, File dir)
            throws IOException {
            return new ProcessBuilder(cmdarray)
 //               .environment(envp)
                .directory(dir)
                .start();
        }
    
    public int availableProcessors() {
    	throw new UnsupportedOperationException();
    }
    
    public long freeMemory() {
    	throw new UnsupportedOperationException();
    }
    
    public long totalMemory() {
    	throw new UnsupportedOperationException();
    }
    
    public long maxMemory() {
    	throw new UnsupportedOperationException();
    }
    
    public void gc() {
    	throw new UnsupportedOperationException();
    }
    
    public void runFinalization() {
    	throw new UnsupportedOperationException();
    }
    
    public native void traceInstructions(boolean on);
    
    public native void traceMethodCalls(boolean on);
    
    public void load(String filename) {
        if (!(new File(filename).isAbsolute())) {
            throw new UnsatisfiedLinkError(
                "Expecting an absolute path of the library: " + filename);
        }
        load0(filename,true);
    }

    private void load0(String filename, boolean fullPath) {
        //ClassLoader.loadLibrary(null, filename, fullPath);
    	throw new UnsupportedOperationException();
    }
    
    public void loadLibrary(String libname) {
        if (libname.indexOf((int)File.separatorChar) != -1) {
            throw new UnsatisfiedLinkError("Directory separator should not appear in library name: " + libname);
        }
    	load0(libname, false);
    }
    
    public InputStream getLocalizedInputStream(InputStream in) {
        return in;
    }
    
    public OutputStream getLocalizedOutputStream(OutputStream out) {
        return out;
    }
    
    
}
