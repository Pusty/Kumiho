package pusty.f0xC.rt.io;

import pusty.f0xC.lang.OverrideHandler.OverrideTranslation;


//This is a very stripped down version of PrintStream just for writing to stdout
@OverrideTranslation(override = "java/io/PrintStream")
public class OPrintStream {
	
	private OOutputStream out;
	
	public OPrintStream(OOutputStream out) {
		this.out = out;
    }
	
	public void flush() {
		 out.flush();
	}
	
    public void write(int b) {
        out.write(b);
        if (b == '\n')
            out.flush();
    }
    
    public void write(byte buf[], int off, int len) {
        out.write(buf, off, len);
        out.flush();
    }
    
    private void write(char buf[]) {
    	for(int i=0;i<buf.length;i++)
    		out.write(buf[i]);
        for (int i = 0; i < buf.length; i++)
            if (buf[i] == '\n')
                out.flush();
    }

    private void write(String s) {
    	for(int i=0;i<s.length();i++)
    		out.write(s.charAt(i));
        if(s.indexOf('\n') >= 0)
        	out.flush();
    }

    private void newLine() {
        out.write('\n');
        out.flush();
    }

    public void print(boolean b) {
        write(b ? "true" : "false");
    }
    
    public void print(char c) {
        write(String.valueOf(c));
    }
    
    public void print(int i) {
        write(String.valueOf(i));
    }
    
    public void print(long l) {
        write(String.valueOf(l));
    }
    
    public void print(float f) {
        write(String.valueOf(f));
    }
    
    public void print(double d) {
        write(String.valueOf(d));
    }
    
    public void print(char s[]) {
        write(s);
    }
    
    public void print(String s) {
        if (s == null) {
            s = "null";
        }
        write(s);
    }
    
    public void print(Object obj) {
        write(String.valueOf(obj));
    }
    
    public void println() {
        newLine();
    }
    
    public void println(boolean x) {
        print(x);
        newLine();
    }
    
    public void println(char x) {
        print(x);
        newLine();
    }
    
    public void println(int x) {
        print(x);
        newLine();
    }
    
    public void println(long x) {
        print(x);
        newLine();
    }
    
    public void println(float x) {
        print(x);
        newLine();
    }
    
    public void println(double x) {
        print(x);
        newLine();
    }
    
    public void println(char x[]) {
        print(x);
        newLine();
    }
    
    public void println(String x) {
        print(x);
        newLine();
    }
    
    public void println(Object x) {
        String s = String.valueOf(x);
        print(s);
        newLine();
    }
    
}
