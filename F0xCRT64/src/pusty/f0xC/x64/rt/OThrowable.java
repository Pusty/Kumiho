package pusty.f0xC.x64.rt;

import java.io.PrintStream;

import pusty.f0xC.lang.OverrideHandler.OverrideTranslation;
import pusty.f0xC.x64.internal.Internal;


@OverrideTranslation(override = "java/lang/Throwable")
public class OThrowable {

	private long backtrace;
	private String detailMessage;
	private OThrowable cause = this;

	private static final String CAUSE_CAPTION = "Caused by: ";
	 
	public OThrowable() {
		fillInStackTrace();
	}
	
	public OThrowable(String message) {
		fillInStackTrace();
		detailMessage = message;
	}
	
    public OThrowable(String message, OThrowable cause) {
    	fillInStackTrace();
        detailMessage = message;
        this.cause = cause;
    }
    
    public OThrowable(OThrowable cause) {
    	fillInStackTrace();
        detailMessage = (cause==null ? null : cause.toString());
        this.cause = cause;
    }
    
    public OThrowable fillInStackTrace() {
    	backtrace = Internal.getMarkedAddress();
    	return this;
    }
    
    public OThrowable initCause(OThrowable cause) {
        this.cause = cause;
        return this;
    }
    
    public String toString() {
        String s = getClass().getName();
        String message = getLocalizedMessage();
        return (message != null) ? (s + ": " + message) : s;
    }
    
    public void printStackTrace() {
        printStackTrace(System.out);
    }
    
    private void printStackTrace(PrintStream s) {
        s.println(this);
        if(backtrace != 0)
        	s.println("    at address 0x"+Long.toHexString(backtrace));
        OThrowable ourCause = getCause();
        if (ourCause != null) {
            s.println(CAUSE_CAPTION);
            ourCause.printStackTrace(s);
        }
    }
	
	public String getMessage() {
	    return detailMessage;
	}
	
    public String getLocalizedMessage() {
        return getMessage();
    }
    
    public OThrowable getCause() {
        return (cause==this ? null : cause);
    }
}
