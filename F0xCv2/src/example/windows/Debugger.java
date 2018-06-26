package example.windows;

import java.util.ArrayList;

import pusty.f0xC.rt.windows.Kernel32;
import pusty.f0xC.rt.windows.WinStruct.*;

public class Debugger {
	HANDLE o_h_process;
	int o_pid;
	boolean o_debugger_active;
	
	public static void main(String args[]) {
	    Debugger debugger = new Debugger();
    	debugger.loadProcess("C:\\Windows\\System32\\calc.exe");
		debugger.run();
		System.out.println("Done...");
    	ArrayList<Integer> list = debugger.enumerateThreads();
    	System.out.println("Enumerated... "+list.size());
		for(Integer thread:list) {
			CONTEXT thread_context = debugger.getThreadContext(thread);
			System.out.println( "[*] Dumping registers for thread ID: "+ Integer.toHexString(thread));
			System.out.println( "[**] EIP "+ Integer.toHexString(thread_context.Eip));
			System.out.println( "[**] ESP: "+ Integer.toHexString(thread_context.Esp));
			System.out.println( "[**] EBP: "+ Integer.toHexString(thread_context.Ebp));
			System.out.println( "[**] EAX: "+ Integer.toHexString(thread_context.Eax));
			System.out.println( "[**] EBX: "+ Integer.toHexString(thread_context.Ebx));
			System.out.println( "[**] ECX: "+ Integer.toHexString(thread_context.Ecx));
			System.out.println( "[**] EDX: "+ Integer.toHexString(thread_context.Edx));
			System.out.println( "[*] END DUMP");
		}
	}
	
	public void loadProcess(String path_to_exe) {
		int creation_flags = Kernel32.DEBUG_PROCESS;
		STARTUPINFO startupinfo = new STARTUPINFO();
		startupinfo.wShowWindow = Kernel32.STARTF_USESHOWWINDOW;
		PROCESS_INFORMATION process_information = new PROCESS_INFORMATION();
		if (Kernel32.CreateProcess(path_to_exe, null, null, null,
				false, creation_flags, 0, null, startupinfo,
				process_information)) {
			System.out
					.println("[*] We have successfully launched the process!");
			System.out.println("[*] PID: "
					+ Integer.toHexString(process_information.dwProcessId));
			o_pid = process_information.dwProcessId;
			o_h_process = openProcess(process_information.dwProcessId);
			o_debugger_active = true;
		} else {
			System.out.println("[*] Error: " + Kernel32.GetLastError());
			return;
		}
	}
	
	public HANDLE openProcess(int pid) {
		HANDLE h_process = Kernel32.OpenProcess(Kernel32.PROCESS_ALL_ACCESS, false, pid);
		if (h_process.handle != 0)
			return h_process;
		else
			System.out.println("[*] Could not obtain a valid process handle.");
		return new HANDLE(0);
	}
	

	public HANDLE openThread(int tid) {
		HANDLE h_thread = Kernel32.OpenThread(Kernel32.THREAD_ALL_ACCESS, false, tid);
		if (h_thread.handle != 0)
			return h_thread;
		else
			System.out.println("[*] Could not obtain a valid thread handle.");
		return new HANDLE(0);
	}
	
	public ArrayList<Integer> enumerateThreads() {
		THREADENTRY32 thread_entry = new THREADENTRY32();
		ArrayList<Integer> thread_list = new ArrayList<Integer>();
		HANDLE snapshot = Kernel32.CreateToolhelp32Snapshot(Kernel32.TH32CS_SNAPTHREAD, o_pid);
		if (snapshot != null) {
			boolean success = Kernel32.Thread32First(snapshot,
					thread_entry);
			while (success) {
				if (thread_entry.th32OwnerProcessID == o_pid) {
					thread_list.add(thread_entry.th32ThreadID);
				}
				success = Kernel32.Thread32Next(snapshot,
						thread_entry);
			}
			Kernel32.CloseHandle(snapshot);
			return thread_list;
		} else
			return null;
	}
	
	public CONTEXT getThreadContext(int tid) {
		CONTEXT context = new CONTEXT();
		context.ContextFlags = Kernel32.CONTEXT_FULL|Kernel32.CONTEXT_EXTENDED_REGISTERS|Kernel32.CONTEXT_FLOATING_POINT|Kernel32.CONTEXT_DEBUG_REGISTERS;
		HANDLE h_thread = openThread(tid);
		Kernel32.SuspendThread(h_thread);
		boolean success = Kernel32.GetThreadContext(h_thread, context);
		Kernel32.ResumeThread(h_thread);
		if (success) {
			Kernel32.CloseHandle(h_thread);
			return context;
		} else
			return null;
	}

	public void attach(int pid) {
		o_h_process = openProcess(pid);
		if (Kernel32.DebugActiveProcess(pid)) {
			o_debugger_active = true;
			o_pid = pid;
		} else {
			System.out.println("[*] Unable to attach to the process. (pid="+pid+")");
		}
	}
	
	public void getDebugEvent() {
		DEBUG_EVENT debug_event = new DEBUG_EVENT();
		int continue_status = Kernel32.DBG_CONTINUE;
		
		if (Kernel32.WaitForDebugEvent(debug_event, 0x100)) {
			o_debugger_active = true;
			//System.out.println("DEBUG EVENT: "+debug_event.dwDebugEventCode);
			Kernel32.ContinueDebugEvent(debug_event.dwProcessId,
					debug_event.dwThreadId, continue_status);
		}else
			o_debugger_active = false;
	}

	public boolean detach() {
		if (Kernel32.DebugActiveProcessStop(o_pid)) {
			System.out.println("[*] Finished debugging. Exiting...");
			return true;
		} else {
			System.out.println("There was an error");
			return false;
		}
	}

	
	public void run() {
		while (o_debugger_active) {
			getDebugEvent();
		}
		System.out.println("...Done Running");
	}
	
}
