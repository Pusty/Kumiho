package pusty.f0xC.rt.windows;

import pusty.f0xC.imports.InternalObject;
import pusty.f0xC.imports.LibC;
import pusty.f0xC.lang.OverrideHandler.ExternalProperty;
import pusty.f0xC.lang.OverrideHandler.TranslationProperty;
import pusty.f0xC.rt.windows.WinStruct.*;

public class Kernel32 {
	
    // Process Creation flags
    public static final int DEBUG_PROCESS = 0x00000001;
    public static final int DEBUG_ONLY_THIS_PROCESS = 0x00000002;
    public static final int CREATE_SUSPENDED = 0x00000004;
    public static final int DETACHED_PROCESS = 0x00000008;
    public static final int CREATE_NEW_CONSOLE = 0x00000010;
    public static final int CREATE_NEW_PROCESS_GROUP = 0x00000200;
    public static final int CREATE_UNICODE_ENVIRONMENT = 0x00000400;
    public static final int CREATE_SEPARATE_WOW_VDM = 0x00000800;
    public static final int CREATE_SHARED_WOW_VDM = 0x00001000;
    public static final int CREATE_FORCEDOS = 0x00002000;
    public static final int INHERIT_PARENT_AFFINITY = 0x00010000;
    public static final int CREATE_PROTECTED_PROCESS = 0x00040000;
    public static final int EXTENDED_STARTUPINFO_PRESENT = 0x00080000;
    public static final int CREATE_BREAKAWAY_FROM_JOB = 0x01000000;
    public static final int CREATE_PRESERVE_CODE_AUTHZ_LEVEL = 0x02000000;
    public static final int CREATE_DEFAULT_ERROR_MODE = 0x04000000;
    public static final int CREATE_NO_WINDOW = 0x08000000;
    
    
    public static final int DELETE = 0x00010000;
    public static final int READ_CONTROL = 0x00020000;
    public static final int WRITE_DAC = 0x00040000;
    public static final int WRITE_OWNER = 0x00080000;
    public static final int SYNCHRONIZE = 0x00100000;
    public static final int PROCESS_VM_WRITE = 0x0020;
	public static final int PROCESS_SYNCHRONIZE = 0x00100000;
	public static final int PROCESS_QUERY_INFORMATION = 0x0400;
    public static final  int PROCESS_QUERY_LIMITED_INFORMATION = 0x1000;
    public static final int PROCESS_VM_OPERATION = 0x0008;
	public static final int PROCESS_VM_READ = 0x0010;
    public static final int PROCESS_CREATE_PROCESS = 0x0080;
	public static final int PROCESS_CREATE_THREAD = 0x0002;
    public static final int PROCESS_DUP_HANDLE = 0x0040;
    public static final int PROCESS_SET_INFORMATION = 0x0200;
    public static final int PROCESS_SET_QUOTA = 0x0100;
    public static final int PROCESS_SUSPEND_RESUME = 0x0800;
    public static final int PROCESS_TERMINATE = 0x00000001;
    public static final int STANDARD_RIGHTS_REQUIRED = 0x000F0000;
    public static final int STANDARD_RIGHTS_READ = READ_CONTROL;
    public static final int STANDARD_RIGHTS_WRITE = READ_CONTROL;
    public static final int STANDARD_RIGHTS_EXECUTE = READ_CONTROL;
    public static final int STANDARD_RIGHTS_ALL = 0x001F0000;
    
    public static final int PAGE_READONLY = 2;
    public static final int PAGE_READWRITE  = 4;
   	public static final int PAGE_WRITECOPY  = 8;
    public static final int PAGE_EXECUTE = 16;
    public static final int PAGE_EXECUTE_READ   = 32;
    public static final int PAGE_EXECUTE_READWRITE  = 64;
    public static final int PAGE_EXECUTE_WRITECOPY  = 128;
    public static final int PAGE_GUARD  = 256;
    public static final int PAGE_NOACCESS   = 1;
    public static final int PAGE_NOCACHE    = 512;
    public static final int MEM_COMMIT  = 4096;
    public static final int MEM_FREE    = 65536;
    public static final int MEM_RESERVE = 8192;
    public static final int MEM_IMAGE   = 16777216;
    public static final int MEM_MAPPED  = 262144;
    public static final int MEM_PRIVATE = 131072;
    public static final int MEM_DECOMMIT =  16384;
    public static final int MEM_RELEASE =32768;
    public static final int MEM_TOP_DOWN =  1048576;
    
    //From thelp32
    public static final int TH32CS_SNAPHEAPLIST	= 0x1;
    public static final int TH32CS_SNAPPROCESS	= 0x2;
    public static final int TH32CS_SNAPTHREAD	= 0x4;
    public static final int TH32CS_SNAPMODULE	= 0x8;
    public static final int TH32CS_SNAPALL	= (TH32CS_SNAPHEAPLIST|TH32CS_SNAPPROCESS|TH32CS_SNAPTHREAD|TH32CS_SNAPMODULE);
    public static final int TH32CS_INHERIT	= 0x80000000;
    
    
    //From winNT
    public static final int SIZE_OF_80387_REGISTERS = 80;
    public static final int CONTEXT_i386	=   0x10000;
    public static final int CONTEXT_i486    =   0x10000;
    public static final int CONTEXT_CONTROL = (CONTEXT_i386|0x00000001);
    public static final int CONTEXT_INTEGER =	  (CONTEXT_i386|0x00000002);
    public static final int CONTEXT_SEGMENTS =	  (CONTEXT_i386|0x00000004);
    public static final int CONTEXT_FLOATING_POINT =	  (CONTEXT_i386|0x00000008);
    public static final int CONTEXT_DEBUG_REGISTERS =	  (CONTEXT_i386|0x00000010);
    public static final int CONTEXT_EXTENDED_REGISTERS =  (CONTEXT_i386|0x00000020);
    public static final int CONTEXT_FULL =	(CONTEXT_CONTROL|CONTEXT_INTEGER|CONTEXT_SEGMENTS);
    public static final int MAXIMUM_SUPPORTED_EXTENSION		     =  512;
    public static final int DLL_PROCESS_DETACH = 0;
    public static final int DLL_PROCESS_ATTACH = 1;
    public static final int DLL_THREAD_ATTACH = 2;
    public static final int DLL_THREAD_DETACH = 3;
    public static final int DBG_CONTINUE = 0x10002;
    public static final int DBG_TERMINATE_THREAD = 0x40010003;
    public static final int DBG_TERMINATE_PROCESS = 0x40010004;
    public static final int DBG_CONTROL_C = 0x40010005;
    public static final int DBG_CONTROL_BREAK = 0x40010008;
    public static final int DBG_EXCEPTION_NOT_HANDLED = 0x80010001;
    
    //from winbase
    public static final int EXCEPTION_DEBUG_EVENT = 1;
    public static final int CREATE_THREAD_DEBUG_EVENT = 2;
    public static final int CREATE_PROCESS_DEBUG_EVENT = 3;
    public static final int EXIT_THREAD_DEBUG_EVENT = 4;
    public static final int EXIT_PROCESS_DEBUG_EVENT = 5;
    public static final int LOAD_DLL_DEBUG_EVENT = 6;
    public static final int UNLOAD_DLL_DEBUG_EVENT = 7;
    public static final int OUTPUT_DEBUG_STRING_EVENT = 8;
    public static final int RIP_EVENT = 9;
    
    // STARTUPINFO flags
    public static final int STARTF_USESHOWWINDOW = 0x001;
    public static final int STARTF_USESIZE = 0x002;
    public static final int STARTF_USEPOSITION = 0x004;
    public static final int STARTF_USECOUNTCHARS = 0x008;
    public static final int STARTF_USEFILLATTRIBUTE = 0x010;
    public static final int STARTF_RUNFULLSCREEN = 0x020;
    public static final  int STARTF_FORCEONFEEDBACK = 0x040;
    public static final int STARTF_FORCEOFFFEEDBACK = 0x080;
    public static final int STARTF_USESTDHANDLES = 0x100;
  
    public static final int THREAD_ALL_ACCESS = STANDARD_RIGHTS_REQUIRED | SYNCHRONIZE | 0x3FF;  
    public static final int PROCESS_ALL_ACCESS = PROCESS_CREATE_PROCESS
            | PROCESS_CREATE_THREAD
            | PROCESS_DUP_HANDLE
            | PROCESS_QUERY_INFORMATION
            | PROCESS_QUERY_LIMITED_INFORMATION
            | PROCESS_SET_INFORMATION
            | PROCESS_SET_QUOTA
            | PROCESS_SUSPEND_RESUME
            | PROCESS_SYNCHRONIZE
            | PROCESS_TERMINATE
            | PROCESS_VM_OPERATION
            | PROCESS_VM_READ
            | PROCESS_VM_WRITE
            | DELETE
            | READ_CONTROL
            | WRITE_DAC
            | WRITE_OWNER
            | SYNCHRONIZE;
    
	@TranslationProperty(property=TranslationProperty.EXTERNAL_STDCALL)
	@ExternalProperty(property=ExternalProperty.IMPORT, parent="kernel32", key="Sleep")
	public static native void Sleep(int time);
	
	@TranslationProperty(property=TranslationProperty.EXTERNAL_STDCALL)
	@ExternalProperty(property=ExternalProperty.IMPORT, parent="kernel32", key="GetLastError")
	public static native int GetLastError();
	
	@TranslationProperty(property=TranslationProperty.EXTERNAL_STDCALL)
	@ExternalProperty(property=ExternalProperty.IMPORT, parent="kernel32", key="CloseHandle")
	public static native boolean _CloseHandle(int handle);
	
	public static boolean CloseHandle(HANDLE handle) {
		return _CloseHandle(handle.handle);
	}
	
	@TranslationProperty(property=TranslationProperty.EXTERNAL_STDCALL)
	@ExternalProperty(property=ExternalProperty.IMPORT, parent="kernel32", key="OpenProcess")
	public static native int _OpenProcess(int IDProcess, boolean fInherit, int fdwAccess);
	
	public static HANDLE OpenProcess(int fdwAccess, boolean bInheritHandle, int IDProcess) {
		return new HANDLE(_OpenProcess(IDProcess, bInheritHandle, fdwAccess));
	}
	
	@TranslationProperty(property=TranslationProperty.EXTERNAL_STDCALL)
	@ExternalProperty(property=ExternalProperty.IMPORT, parent="kernel32", key="OpenThread")
	public static native int _OpenThread(int dwThreadId, boolean bInheritHandle, int dwDesiredAccess);
	
	public static HANDLE OpenThread(int dwDesiredAccess, boolean bInheritHandle, int dwThreadId) {
		return new HANDLE(_OpenThread(dwThreadId, bInheritHandle, dwDesiredAccess));
	}
	
	@TranslationProperty(property=TranslationProperty.EXTERNAL_STDCALL)
	@ExternalProperty(property=ExternalProperty.IMPORT, parent="kernel32", key="CreateProcessA")
	public static native boolean _CreateProcessA(int lpProcessInformation, int lpStartupInfo, int lpCurrentDirectory, int lpEnvironment, int dwCreationFlags, boolean bInheritHandles, int lpThreadAttributes, int lpProcessAttributes,int lpCommandLine,int lpApplicationName);
	
	public static boolean CreateProcess(String lpApplicationName, String lpCommandLine, SECURITY_ATTRIBUTES lpProcessAttributes, SECURITY_ATTRIBUTES lpThreadAttributes, boolean bInheritHandles, int dwCreationFlags, int lpEnvironment, String lpCurrentDirectory, STARTUPINFO lpStartupInfo, PROCESS_INFORMATION lpProcessInformation) {
		return _CreateProcessA(
				InternalObject.con2int(lpProcessInformation),
			    InternalObject.con2int(lpStartupInfo),
			    InternalObject.arr2int(LibC.JString2CString(lpCurrentDirectory)),
			    lpEnvironment,
			    dwCreationFlags,
			    bInheritHandles,
			    InternalObject.con2int(lpThreadAttributes),
			    InternalObject.con2int(lpProcessAttributes),
			    InternalObject.arr2int(LibC.JString2CString(lpCommandLine)),
			    InternalObject.arr2int(LibC.JString2CString(lpApplicationName))
				);
	}
	
	@TranslationProperty(property=TranslationProperty.EXTERNAL_STDCALL)
	@ExternalProperty(property=ExternalProperty.IMPORT, parent="kernel32", key="WriteProcessMemory")
	public static native boolean _WriteProcessMemory(int lpNumberOfBytesWritten,int nSize,int lpBuffer,int lpBaseAddress,int hProcess);
	
	public static boolean WriteProcessMemory(HANDLE hProcess,int lpBaseAddress,byte[] lpBuffer,Integer lpNumberOfBytesWritten) {
		return _WriteProcessMemory(
				InternalObject.con2int(lpNumberOfBytesWritten),
				lpBuffer.length,
				InternalObject.arr2int(lpBuffer),
				lpBaseAddress,
				hProcess.handle
		);
	}
	
	@TranslationProperty(property=TranslationProperty.EXTERNAL_STDCALL)
	@ExternalProperty(property=ExternalProperty.IMPORT, parent="kernel32", key="GetModuleHandleA")
	public static native int _GetModuleHandleA(int lpModuleName);
	
	public static HANDLE GetModuleHandle(String lpModuleName) {
		return new HANDLE(_GetModuleHandleA(InternalObject.arr2int(LibC.JString2CString(lpModuleName))));
	}
	
	@TranslationProperty(property=TranslationProperty.EXTERNAL_STDCALL)
	@ExternalProperty(property=ExternalProperty.IMPORT, parent="kernel32", key="LoadLibraryA")
	public static native int _LoadLibraryA(int lpModuleName);
	
	public static HANDLE LoadLibrary(String lpModuleName) {
		return new HANDLE(_GetModuleHandleA(InternalObject.arr2int(LibC.JString2CString(lpModuleName))));
	}
	
	@TranslationProperty(property=TranslationProperty.EXTERNAL_STDCALL)
	@ExternalProperty(property=ExternalProperty.IMPORT, parent="kernel32", key="GetProcAddress")
	public static native int _GetProcAddress(int lpProcName, int hModule);
	
	public static int GetProcAddress(HANDLE hModule, String lpProcName) {
		return (_GetProcAddress(InternalObject.arr2int(LibC.JString2CString(lpProcName)), hModule.handle));
	}
	
	@TranslationProperty(property=TranslationProperty.EXTERNAL_STDCALL)
	@ExternalProperty(property=ExternalProperty.IMPORT, parent="kernel32", key="CreateRemoteThread")
	public static native int _CreateRemoteThread(int lpThreadId, int dwCreationFlags, int lpParameter, int lpStartAddress,int dwStackSize, int lpThreadAttributes, int hProcess);
	
	public static int CreateRemoteThread(HANDLE hProcess, SECURITY_ATTRIBUTES lpThreadAttributes, int dwStackSize, int lpStartAddress, int lpParameter, int dwCreationFlags, Integer lpThreadId) {
		return _CreateRemoteThread(
				lpThreadId,
				dwCreationFlags,
				lpParameter,
				lpStartAddress,
				dwStackSize,
				InternalObject.con2int(lpThreadAttributes),
				hProcess.handle
				);
	}
	

	@TranslationProperty(property=TranslationProperty.EXTERNAL_STDCALL)
	@ExternalProperty(property=ExternalProperty.IMPORT, parent="kernel32", key="VirtualAllocEx")
	public static native int _VirtualAllocEx(int flProtect, int flAllocationType, int dwSize, int lpAddress, int hProcess);
	
	public static int VirtualAllocEx(HANDLE hProcess, int lpAddress, int dwSize, int flAllocationType, int flProtect) {
		return _VirtualAllocEx(
				flProtect,
				flAllocationType,
				dwSize,
				lpAddress,
				hProcess.handle
				);
	}
	
	@TranslationProperty(property=TranslationProperty.EXTERNAL_STDCALL)
	@ExternalProperty(property=ExternalProperty.IMPORT, parent="kernel32", key="GetThreadContext")
	public static native boolean _GetThreadContext(int context, int h_thread);
	
	public static boolean GetThreadContext(HANDLE h_thread, CONTEXT context) {
		return _GetThreadContext(InternalObject.con2int(context),h_thread.handle);
	}
	
	@TranslationProperty(property=TranslationProperty.EXTERNAL_STDCALL)
	@ExternalProperty(property=ExternalProperty.IMPORT, parent="kernel32", key="Thread32First")
	public static native boolean _Thread32First(int thread_entry, int snapshot);
	
	public static boolean Thread32First(HANDLE snapshot, THREADENTRY32 thread_entry) {
		return _Thread32First(InternalObject.con2int(thread_entry), snapshot.handle);
	}
	
	@TranslationProperty(property=TranslationProperty.EXTERNAL_STDCALL)
	@ExternalProperty(property=ExternalProperty.IMPORT, parent="kernel32", key="Thread32Next")
	public static native boolean _Thread32Next(int thread_entry, int snapshot);
	
	public static boolean Thread32Next(HANDLE snapshot, THREADENTRY32 thread_entry) {
		return _Thread32Next(InternalObject.con2int(thread_entry),snapshot.handle);
	}
	
	@TranslationProperty(property=TranslationProperty.EXTERNAL_STDCALL)
	@ExternalProperty(property=ExternalProperty.IMPORT, parent="kernel32", key="CreateToolhelp32Snapshot")
	public static native int _CreateToolhelp32Snapshot(int th32ProcessID, int dwFlags);
	
	public static HANDLE CreateToolhelp32Snapshot(int dwFlags, int th32ProcessID) {
		return new HANDLE(_CreateToolhelp32Snapshot(th32ProcessID, dwFlags));
	}
	
	@TranslationProperty(property=TranslationProperty.EXTERNAL_STDCALL)
	@ExternalProperty(property=ExternalProperty.IMPORT, parent="kernel32", key="ContinueDebugEvent")
	public static native void _ContinueDebugEvent(int cs, int dwThreadId, int dwProcessId);
	
	public static void ContinueDebugEvent(int dwProcessId, int dwThreadId, int cs) {
		 _ContinueDebugEvent(cs, dwThreadId, dwProcessId);
	}
	
	
	@TranslationProperty(property=TranslationProperty.EXTERNAL_STDCALL)
	@ExternalProperty(property=ExternalProperty.IMPORT, parent="kernel32", key="WaitForDebugEvent")
	public static native boolean _WaitForDebugEvent(int wait, int debug_event);
	
	public static boolean WaitForDebugEvent(DEBUG_EVENT debug_event, int wait) {
		return _WaitForDebugEvent(wait, InternalObject.con2int(debug_event));
	}
	
	@TranslationProperty(property=TranslationProperty.EXTERNAL_STDCALL)
	@ExternalProperty(property=ExternalProperty.IMPORT, parent="kernel32", key="DebugActiveProcess")
	public static native boolean _DebugActiveProcess(int pid);
	
	public static boolean DebugActiveProcess(int pid) {
		return _DebugActiveProcess(pid);
	}
	
	@TranslationProperty(property=TranslationProperty.EXTERNAL_STDCALL)
	@ExternalProperty(property=ExternalProperty.IMPORT, parent="kernel32", key="DebugActiveProcessStop")
	public static native boolean _DebugActiveProcessStop(int pid);
	
	public static boolean DebugActiveProcessStop(int pid) {
		return _DebugActiveProcessStop(pid);
	}
	
	@TranslationProperty(property=TranslationProperty.EXTERNAL_STDCALL)
	@ExternalProperty(property=ExternalProperty.IMPORT, parent="kernel32", key="SuspendThread")
	public static native boolean _SuspendThread(int h_thread);
	
	public static boolean SuspendThread(HANDLE h_thread) {
		return _SuspendThread(h_thread.handle);
	}
	
	@TranslationProperty(property=TranslationProperty.EXTERNAL_STDCALL)
	@ExternalProperty(property=ExternalProperty.IMPORT, parent="kernel32", key="ResumeThread")
	public static native boolean _ResumeThread(int h_thread);
	
	public static boolean ResumeThread(HANDLE h_thread) {
		return _ResumeThread(h_thread.handle);
	}
	
	
}
