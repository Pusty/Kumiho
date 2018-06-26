#include <Windows.h>

//#include "deobfuscate.h"
#include "rebuild.h"

void ExecutePayload(PIMAGE_OPTIONAL_HEADER pioh) {
	// check if .tls section exists
	if (pioh->DataDirectory[IMAGE_DIRECTORY_ENTRY_TLS].VirtualAddress && pioh->DataDirectory[IMAGE_DIRECTORY_ENTRY_TLS].Size) {
		// parse and call each function
		PIMAGE_TLS_DIRECTORY ptls = (PIMAGE_TLS_DIRECTORY)(pioh->ImageBase + pioh->DataDirectory[IMAGE_DIRECTORY_ENTRY_TLS].VirtualAddress);
		LPDWORD dwCallback = (LPDWORD)(ptls->AddressOfCallBacks);
		// execute each address of callback
		while (dwCallback) {
			// HINSTANCE hInstance = (HINSTANCE)pioh->ImageBase;
			// __asm {
			// 	push	0
			// 	push	DLL_PROCESS_ATTACH
			// 	push	hInstance
			// 	call	dwCallback
			// }
			VOID (*callback)(HINSTANCE hInstance, DWORD fdwReason, LPVOID lpvReserved) = (VOID(*)(HINSTANCE hInstance, DWORD fdwReason, LPVOID lpvReserved))(*dwCallback);
			callback((HINSTANCE)pioh->ImageBase, DLL_PROCESS_ATTACH, 0);
			dwCallback++;
		}
	}

	// calculate OEP and jump
	DWORD dwOEP = pioh->ImageBase + pioh->AddressOfEntryPoint;
	// __asm push dwOEP;
	// __asm ret;
	void (*oep)() = (void(*)())dwOEP;
	oep();
}

void stubmain(void) {
	DWORD dwImageBase = (DWORD)GetModuleHandle(NULL);

	PIMAGE_DOS_HEADER pidhStub = (PIMAGE_DOS_HEADER)dwImageBase;
	PIMAGE_NT_HEADERS pinhStub = (PIMAGE_NT_HEADERS)(dwImageBase + pidhStub->e_lfanew);

	// find payload
	PIMAGE_SECTION_HEADER pFirst = IMAGE_FIRST_SECTION(pinhStub);
	PIMAGE_SECTION_HEADER pSecond = (PIMAGE_SECTION_HEADER)((DWORD)pFirst + sizeof(IMAGE_SECTION_HEADER));

	// allocate heap for payload (first section's virtual size indicates original size)
	HANDLE hHeap = GetProcessHeap();
	LPVOID lpPayload = HeapAlloc(hHeap, HEAP_ZERO_MEMORY, pSecond->SizeOfRawData);

	// copy payload to heap
	CopyMemory(lpPayload, (LPVOID)(dwImageBase + pSecond->VirtualAddress), pSecond->SizeOfRawData);
    
    //Make a copy of PE Headers for further use after rewriting
    LPVOID lpCopy = HeapAlloc(hHeap, HEAP_ZERO_MEMORY, pinhStub->OptionalHeader.SizeOfHeaders);
    //Copy original headers into heap
    CopyMemory(lpCopy, (LPVOID)(pinhStub), pinhStub->OptionalHeader.SizeOfHeaders);
    //Change pointer to heap copy
    pinhStub = (PIMAGE_NT_HEADERS)lpCopy;
    pFirst = IMAGE_FIRST_SECTION(pinhStub);
    pSecond = (PIMAGE_SECTION_HEADER)((DWORD)pFirst + sizeof(IMAGE_SECTION_HEADER));

/* * * * * * * * * * * * * * * * * * * * * *
 *				Deobfuscation			   *
 * * * * * * * * * * * * * * * * * * * * * */

	// decrypt payload
	//decrypt();

	// decompress payload
	//decompress();

/* * * * * * * * * * * * * * * * * * * * * *
*				Restoration 			   *
* * * * * * * * * * * * * * * * * * * * * */

	// restore payload to correct position
	PIMAGE_DOS_HEADER pidh = (PIMAGE_DOS_HEADER)lpPayload;
	PIMAGE_NT_HEADERS pinh = (PIMAGE_NT_HEADERS)(lpPayload + pidh->e_lfanew);

	// TODO: ADD SUPPORT FOR RELOCATION TABLE

	// restore payload headers
	DWORD flOldProtect = 0;
	// unprotect header
	if (!VirtualProtect((LPVOID)pinhStub->OptionalHeader.ImageBase, pinh->OptionalHeader.SizeOfHeaders, PAGE_READWRITE, &flOldProtect))
		goto err;

	// copy headers
	CopyMemory((LPVOID)pinhStub->OptionalHeader.ImageBase, lpPayload, pinh->OptionalHeader.SizeOfHeaders);

	// reprotect headers
	if (!VirtualProtect((LPVOID)pinhStub->OptionalHeader.ImageBase, pinh->OptionalHeader.SizeOfHeaders, flOldProtect, &flOldProtect))
		goto err;

	// restore payload
	// unprotect first section
	if (!VirtualProtect((LPVOID)(pinhStub->OptionalHeader.ImageBase + pFirst->VirtualAddress), pFirst->Misc.VirtualSize, PAGE_EXECUTE_READWRITE, &flOldProtect))
		goto err;
    
    //Loads original stub
    pinhStub = (PIMAGE_NT_HEADERS)(dwImageBase + pidhStub->e_lfanew);
    
    
	// emulate image loader and map pe file into memory
	MemoryMapPayload((LPVOID)pinhStub->OptionalHeader.ImageBase, (LPVOID)lpPayload, pidh, pinh);

	// rebuild IAT
	RebuildImportTable((LPVOID)pinhStub->OptionalHeader.ImageBase, pinh);

	// walk payload section headers and reprotect each section accordingly
	// for (int i = 0; i < pinh->FileHeader.NumberOfSections; i++) {
	// 	// get section header
	// 	PIMAGE_SECTION_HEADER pish = IMAGE_FIRST_SECTION(pinh) + sizeof(IMAGE_SECTION_HEADER) * i;
	// 	// get Characteristics and determine protection type
	// 	DWORD c = pish->Characteristics;
	// 	DWORD flNewProtect = 0;
	// 	if (c & IMAGE_SCN_MEM_EXECUTE)
	// 		flNewProtect |= PAGE_EXECUTE;
	// 	if (c & IMAGE_SCN_MEM_READ)
	// 		flNewProtect |= PAGE_READ
	// 	// reprotect
	//
	// }
	IMAGE_OPTIONAL_HEADER ioh;
	CopyMemory(&ioh, &pinh->OptionalHeader, sizeof(IMAGE_OPTIONAL_HEADER));

	HeapFree(hHeap, 0, lpPayload);
    HeapFree(hHeap, 0, lpCopy);

/* * * * * * * * * * * * * * * * * * * * * *
*				Execution	 			   *
* * * * * * * * * * * * * * * * * * * * * */

	// execute tls and return OEP for execution
	ExecutePayload(&ioh);

err:
	ExitProcess(0);
}