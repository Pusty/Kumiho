#include <Windows.h>

/*
 * Map PE file into memory
 */
BOOL MemoryMapPayload(LPVOID lpDest, LPVOID lpPayload, PIMAGE_DOS_HEADER pidh, PIMAGE_NT_HEADERS pinh) {
	// copy section headers
	//CopyMemory(lpDest, lpPayload, pinh->OptionalHeader.SizeOfHeaders);

	// copy each section individually at virtual address
	for (int i = 0; i < pinh->FileHeader.NumberOfSections; i++) {
		PIMAGE_SECTION_HEADER pish = (PIMAGE_SECTION_HEADER)((DWORD)lpPayload + pidh->e_lfanew + sizeof(IMAGE_NT_HEADERS) + sizeof(IMAGE_SECTION_HEADER) * i);
		CopyMemory((LPVOID)(lpDest + pish->VirtualAddress), (LPVOID)(lpPayload + pish->PointerToRawData), pish->SizeOfRawData);
	}

	return TRUE;
}

/*
* Walk the import table and fix the addresses
*/
BOOL RebuildImportTable(LPVOID lpBaseAddress, PIMAGE_NT_HEADERS pinh) {
	// parse import table if size != 0
	if (pinh->OptionalHeader.DataDirectory[IMAGE_DIRECTORY_ENTRY_IMPORT].Size) {
		// https://stackoverflow.com/questions/34086866/loading-an-executable-into-current-processs-memory-then-executing-it
		PIMAGE_IMPORT_DESCRIPTOR pImportDescriptor = (PIMAGE_IMPORT_DESCRIPTOR)((DWORD)(lpBaseAddress)+pinh->OptionalHeader.DataDirectory[IMAGE_DIRECTORY_ENTRY_IMPORT].VirtualAddress);

		// Walk until you reached an empty IMAGE_IMPORT_DESCRIPTOR
		while (pImportDescriptor->Name) {
			// get the name of each DLL
			LPSTR lpLibrary = (PCHAR)((DWORD)(lpBaseAddress) + pImportDescriptor->Name);

			HMODULE hLibModule = GetModuleHandleA(lpLibrary);
			if (!hLibModule)
				hLibModule = LoadLibraryA(lpLibrary);

			PIMAGE_THUNK_DATA nameRef = (PIMAGE_THUNK_DATA)((DWORD)(lpBaseAddress)+pImportDescriptor->Characteristics);
			PIMAGE_THUNK_DATA symbolRef = (PIMAGE_THUNK_DATA)((DWORD)(lpBaseAddress)+pImportDescriptor->FirstThunk);
			PIMAGE_THUNK_DATA lpThunk = (PIMAGE_THUNK_DATA)((DWORD)(lpBaseAddress)+pImportDescriptor->FirstThunk);
			for (; nameRef->u1.AddressOfData; nameRef++, symbolRef++, lpThunk++) {
				// fix addresses
				// check if import by ordinal
				if (nameRef->u1.AddressOfData & IMAGE_ORDINAL_FLAG)
					*(FARPROC *)lpThunk = GetProcAddress(hLibModule, MAKEINTRESOURCEA(nameRef->u1.AddressOfData));
				else {
					PIMAGE_IMPORT_BY_NAME thunkData = (PIMAGE_IMPORT_BY_NAME)((DWORD)(lpBaseAddress)+nameRef->u1.AddressOfData);
					*(FARPROC *)lpThunk = GetProcAddress(hLibModule, (LPCSTR)(&thunkData->Name));
				}
			}
			//FreeLibrary(hLibModule);
			// advance to next IMAGE_IMPORT_DESCRIPTOR
			pImportDescriptor++;
		}
	}

	return TRUE;
}

/*
* Walk the relocation table and fix the location
* of data with the delta offset
* https://stackoverflow.com/questions/34086866/loading-an-executable-into-current-processs-memory-then-executing-it
*/
// BOOL BaseRelocate(LPVOID lpBaseAddress, PIMAGE_NT_HEADERS pinh, DWORD dwDelta) {
// 	// check if relocation table exists
// 	if (!pinh->OptionalHeader.DataDirectory[IMAGE_DIRECTORY_ENTRY_BASERELOC].VirtualAddress || !pinh->OptionalHeader.DataDirectory[IMAGE_DIRECTORY_ENTRY_BASERELOC].Size)
// 		return FALSE;
//
// 	IMAGE_BASE_RELOCATION *r = (IMAGE_BASE_RELOCATION *)((DWORD)(lpBaseAddress)+pinh->OptionalHeader.DataDirectory[IMAGE_DIRECTORY_ENTRY_BASERELOC].VirtualAddress); //The address of the first I_B_R struct
// 	IMAGE_BASE_RELOCATION *r_end = (IMAGE_BASE_RELOCATION *)((DWORD_PTR)(r)+pinh->OptionalHeader.DataDirectory[IMAGE_DIRECTORY_ENTRY_BASERELOC].Size - sizeof(IMAGE_BASE_RELOCATION)); //The addr of the last
// 	for (; r < r_end; r = (IMAGE_BASE_RELOCATION *)((DWORD_PTR)(r)+r->SizeOfBlock)) {
// 		WORD *reloc_item = (WORD *)(r + 1);
// 		DWORD num_items = (r->SizeOfBlock - sizeof(IMAGE_BASE_RELOCATION)) / sizeof(WORD);
//
// 		for (DWORD i = 0; i < num_items; ++i, ++reloc_item) {
// 			switch (*reloc_item >> 12) {
// 				case IMAGE_REL_BASED_ABSOLUTE:
// 					break;
// 				case IMAGE_REL_BASED_HIGHLOW:
// 					*(DWORD_PTR *)((DWORD)(lpBaseAddress)+r->VirtualAddress + (*reloc_item & 0xFFF)) += dwDelta;
// 					break;
// 				default:
// 					return FALSE;
// 			}
// 		}
// 	}
//
// 	return TRUE;
// }
