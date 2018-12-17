package pusty.f0xC.rt.lang;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import pusty.f0xC.lang.OverrideHandler.OverrideTranslation;

@OverrideTranslation(override = "java/lang/ProcessBuilder")
public class OProcessBuilder {
    private List<String> command;
    private File directory;
    private Map<String,String> environment;
    private boolean redirectErrorStream;
    //private Redirect[] redirects;
    
    public OProcessBuilder(List<String> command) {
        if (command == null)
            throw new NullPointerException();
        this.command = command;
    }
    
    public OProcessBuilder(String... command) {
        this.command = new ArrayList<>(command.length);
        for (String arg : command)
            this.command.add(arg);
    }
    
    public OProcessBuilder command(List<String> command) {
        if (command == null)
            throw new NullPointerException();
        this.command = command;
        return this;
    }
    
    public OProcessBuilder command(String... command) {
        this.command = new ArrayList<>(command.length);
        for (String arg : command)
            this.command.add(arg);
        return this;
    }
    
    public List<String> command() {
        return command;
    }
    
    public Map<String,String> environment() {
        //if (environment == null)
        //    environment = ProcessEnvironment.environment();
        return environment;
    }
    
    public OProcessBuilder environment(String[] envp) {
        if (envp != null) {
            /*//environment = ProcessEnvironment.emptyEnvironment(envp.length);
            for (String envstring : envp) {
                // Before 1.5, we blindly passed invalid envstrings
                // to the child process.
                // We would like to throw an exception, but do not,
                // for compatibility with old broken code.

                // Silently discard any trailing junk.
                if (envstring.indexOf(0) != -1)
                    envstring = envstring.replaceFirst(((char)0)+".*", "");
                int eqlsign = envstring.indexOf('=', ProcessEnvironment.MIN_NAME_LENGTH);
                // Silently ignore envstrings lacking the required `='.
                if (eqlsign != -1)
                    environment.put(envstring.substring(0,eqlsign),envstring.substring(eqlsign+1));
            }*/
        }
        return this;
    }
    
    public File directory() {
        return directory;
    }
    
    public OProcessBuilder directory(File directory) {
        this.directory = directory;
        return this;
    }
    
    /*static class NullInputStream extends InputStream {
        static final NullInputStream INSTANCE = new NullInputStream();
        private NullInputStream() {}
        public int read()      { return -1; }
        public int available() { return 0; }
    }
    
    static class NullOutputStream extends OutputStream {
        static final NullOutputStream INSTANCE = new NullOutputStream();
        private NullOutputStream() {}
        public void write(int b) throws IOException {
            throw new IOException("Stream closed");
        }
    }*/
    
    /*
    public static abstract class Redirect {
        public enum Type {
            PIPE,
            INHERIT,
            READ,
            WRITE,
            APPEND
        };
        public abstract Type type();
        public static final Redirect PIPE = new Redirect() {
            public Type type() { return Type.PIPE; }
            public String toString() { return type().toString(); }};
           
        public static final Redirect INHERIT = new Redirect() {
            public Type type() { return Type.INHERIT; }
            public String toString() { return type().toString(); }};
            
        public File file() { return null; }
        
        boolean append() {
            throw new UnsupportedOperationException();
        }
        
        public static Redirect from(final File file) {
            if (file == null)
                throw new NullPointerException();
            return new Redirect() {
                    public Type type() { return Type.READ; }
                    public File file() { return file; }
                    public String toString() {
                        return "redirect to read from file \"" + file + "\"";
                    }
                };
        }
        
        public static Redirect to(final File file) {
            if (file == null)
                throw new NullPointerException();
            return new Redirect() {
                    public Type type() { return Type.WRITE; }
                    public File file() { return file; }
                    public String toString() {
                        return "redirect to write to file \"" + file + "\"";
                    }
                    boolean append() { return false; }
                };
        }
        
        public static Redirect appendTo(final File file) {
            if (file == null)
                throw new NullPointerException();
            return new Redirect() {
                    public Type type() { return Type.APPEND; }
                    public File file() { return file; }
                    public String toString() {
                        return "redirect to append to file \"" + file + "\"";
                    }
                    boolean append() { return true; }
                };
        }
        
        public boolean equals(Object obj) {
            if (obj == this)
                return true;
            if (! (obj instanceof Redirect))
                return false;
            Redirect r = (Redirect) obj;
            if (r.type() != this.type())
                return false;
            assert this.file() != null;
            return this.file().equals(r.file());
        }
        
        public int hashCode() {
            File file = file();
            if (file == null)
                return super.hashCode();
            else
                return file.hashCode();
        }
        
        private Redirect() {}
    }*/
    /*
    private Redirect[] redirects() {
        if (redirects == null)
            redirects = new Redirect[] {
                Redirect.PIPE, Redirect.PIPE, Redirect.PIPE
            };
        return redirects;
    }
    
    
    public OProcessBuilder redirectInput(Redirect source) {
        if (source.type() == Redirect.Type.WRITE ||
            source.type() == Redirect.Type.APPEND)
            throw new IllegalArgumentException(
                "Redirect invalid for reading: " + source);
        redirects()[0] = source;
        return this;
    }
    
    public OProcessBuilder redirectOutput(Redirect destination) {
        if (destination.type() == Redirect.Type.READ)
            throw new IllegalArgumentException(
                "Redirect invalid for writing: " + destination);
        redirects()[1] = destination;
        return this;
    }
    
    public OProcessBuilder redirectError(Redirect destination) {
        if (destination.type() == Redirect.Type.READ)
            throw new IllegalArgumentException(
                "Redirect invalid for writing: " + destination);
        redirects()[2] = destination;
        return this;
    }
    
    public OProcessBuilder redirectInput(File file) {
        return redirectInput(Redirect.from(file));
    }
    
    public OProcessBuilder redirectOutput(File file) {
        return redirectOutput(Redirect.to(file));
    }
    
    public OProcessBuilder redirectError(File file) {
        return redirectError(Redirect.to(file));
    }
    
    public Redirect redirectInput() {
        return (redirects == null) ? Redirect.PIPE : redirects[0];
    }
    
    public Redirect redirectOutput() {
        return (redirects == null) ? Redirect.PIPE : redirects[1];
    }
    
    public Redirect redirectError() {
        return (redirects == null) ? Redirect.PIPE : redirects[2];
    }
    
    public OProcessBuilder inheritIO() {
        Arrays.fill(redirects(), Redirect.INHERIT);
        return this;
    }*/
    
    public boolean redirectErrorStream() {
        return redirectErrorStream;
    }
    
    public OProcessBuilder redirectErrorStream(boolean redirectErrorStream) {
        this.redirectErrorStream = redirectErrorStream;
        return this;
    }
    
    public Process start() throws IOException {
        // Must convert to array first -- a malicious user-supplied
        // list might try to circumvent the security check.
        String[] cmdarray = command.toArray(new String[command.size()]);
        
        for (String arg : cmdarray)
            if (arg == null)
                throw new NullPointerException();
        // Throws IndexOutOfBoundsException if command is empty
        String prog = cmdarray[0];
        String dir = directory == null ? null : directory.toString();

        try {
           /* return ProcessImpl.start(cmdarray,
                                     environment,
                                     dir,
                                     redirects,
                                     redirectErrorStream);*/
        	return OProcessImpl.start(cmdarray, environment,dir);
        } catch (Exception e) {
            String exceptionInfo = ": " + e.getMessage();
            throw new IOException(
                "Cannot run program \"" + prog + "\""
                + (dir == null ? "" : " (in directory \"" + dir + "\")")
                + exceptionInfo);
        }
    }
}
