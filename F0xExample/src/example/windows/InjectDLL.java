package example.windows;

import pusty.f0xC.rt.windows.Kernel32;
import pusty.f0xC.rt.windows.User32;
import pusty.f0xC.rt.windows.WinStruct.*;

public class InjectDLL {
	public static void main(String[] args) {
		//Some testing..
		if(injectProcess("Hack, Slash, Loot.","hack02.dll"))
			System.out.println("Injected DLL!");
		else
			System.out.println("An Error Accured while injecting...");
	}
	public static boolean injectProcess(String lpWindowName, String lpRelativeDllPath) {
		HANDLE wHandle = getWindowProccessHandle(lpWindowName, Kernel32.PROCESS_ALL_ACCESS);
		if(wHandle.handle==0) return false;
		System.out.println("Opened Process!");
		return injectDLL(wHandle, lpRelativeDllPath);
	}
	
	public static HANDLE getWindowProccessHandle(String lpWindowName, int dwDesiredAccess) {
		Integer dwProcessId = 0;
		HWND hFindWnd = User32.FindWindow(null, lpWindowName);
		if(hFindWnd.handle == 0) return new HANDLE(0);
		System.out.println("Found Window!");
		User32.GetWindowThreadProcessId(hFindWnd, dwProcessId);
		return Kernel32.OpenProcess(dwDesiredAccess, false, dwProcessId.intValue());
	}
	
	public static boolean injectDLL(HANDLE hProcess, String lpRelativeDllPath) {
		Integer dwWritten = 0;
		int lpBaseAddress = Kernel32.VirtualAllocEx(hProcess, 0, lpRelativeDllPath.length()+1, Kernel32.MEM_COMMIT|Kernel32.MEM_RESERVE, Kernel32.PAGE_EXECUTE_READWRITE);
		Kernel32.WriteProcessMemory(hProcess, lpBaseAddress, lpRelativeDllPath.getBytes(), dwWritten);
		System.out.println("Written to: "+Integer.toHexString(lpBaseAddress));
		HANDLE hModule = Kernel32.GetModuleHandle("kernel32.dll");
		int lpStartAddress = Kernel32.GetProcAddress(hModule, "LoadLibraryA");
		System.out.println("Starting function: "+Integer.toHexString(lpBaseAddress));
		int resultOf = Kernel32.CreateRemoteThread(hProcess, null, 0, lpStartAddress, lpBaseAddress, 0, 0);
		return resultOf != 0;
	}

}
