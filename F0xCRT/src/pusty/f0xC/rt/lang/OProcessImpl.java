package pusty.f0xC.rt.lang;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

import pusty.f0xC.lang.OverrideHandler.OverrideTranslation;
import pusty.f0xC.libc.CStdlib;

@OverrideTranslation(override = "java/lang/ProcessImpl")
public class OProcessImpl extends Process {

	@Override
	public void destroy() {
		//terminateProcess(handle); 
	}

	private int exitCode = 0;
	@Override
	public int exitValue() {
//        int exitCode = getExitCodeProcess(handle);
//        if (exitCode == STILL_ACTIVE)
//            throw new IllegalThreadStateException("process has not exited");
//        return exitCode;
		return exitCode;
	}

	@Override
	public InputStream getErrorStream() {
		return null;
	}

	@Override
	public InputStream getInputStream() {
		return null;
	}

	@Override
	public OutputStream getOutputStream() {
		return null;
	}

	@Override
	public int waitFor() throws InterruptedException {
		return 0;
	}
	
	public static OProcessImpl start(String cmdarray[], Map<String,String> environment, String dir) {
		return new OProcessImpl(cmdarray, null, dir);
	}
	
	private OProcessImpl(String cmd[], String envblock, String path) {
		System.out.println("Executing "+cmd[0]+" @ "+path);
		StringBuilder builder = new StringBuilder();
		for(int i=0;i<cmd.length;i++) {
			builder.append(cmd[i]);
			builder.append(" ");
		}
		String command = builder.toString().trim();
		exitCode = CStdlib.system(path+"/"+command);
	}
}
