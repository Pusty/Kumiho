;nasm -fbin -in %s.asm -o %s
bits 32
pushad
call routine
routine:
pop ebp
sub ebp, routine

;Load Kernel32
	mov ebx, [fs : 0x30] ;Pointer to PEB
	mov ebx, [ebx + 0x0C] ;get PEB->Ldr
	mov ebx, [ebx + 0x14] ;get PEB->Ldr.InMemoryOrderModuleList.Flink (1st entry) [This Executable]
	mov ebx, [ebx] ;2nd Entry [ntdll]
	mov ebx, [ebx] ;3rd Entry [kernel32]
	mov ebx, [ebx + 0x10] ;Get Kernel32 Base (DllBase is here)
	mov [ebp+dllBase] , ebx ;Saves KernelBase
;Loading of Function (can be shortend)
	mov esi, ebx
	add esi, [ebx+0x3C] ;Offset of NT HEADER, e_lfanew => ESI = PE HEAD
	add esi, 0x18 ; DWORD + IMAGE_FILE_HEADER => OptionHeader
	add esi, 0x60 ; 0x60  RVA of export dir (within OptionalHeader)
	mov esi, [esi]  ; VirtualAddress => RVA
	add esi, ebx  ; Add Offset to Virutal Adress, now we are in the Export table
;LOADS IMAGE_EXPORT_DIRECTORY->Name into ecx
	mov edx, [esi+0x18] ;EDX = NumberOfNames
	mov eax, [esi+0x20] ;EAX = AddressOfNames
	add eax, [ebp+dllBase]
;SEARCH FOR getProcAddress ADDRESS
loopThroughExport:
	test edx, edx ;test if NumberOfNames == 0
		jz oop ;if yes exit
	mov ebx, [eax] ;Set EBX = Addres of a name
	add ebx, [ebp+dllBase] ;VirtualAddress -> Real
	lea edi, [ebp+GetProcAddressStr] ;EDI = getProcAddress String	
	compare:
	 mov cl, byte [ebx]
	 mov ch, byte [edi]
	 cmp cl, ch 
		 jne next
	 cmp ch, 0  ;Compare chars with eachother till GetProcAddress ends
		  je found
	 add ebx, 1
		 add edi, 1
		jmp compare
	found:
	 mov eax, [esi+0x18] ;Eax = NumberOfNames
	 sub eax, edx ;EAX = Index of Found
	 mov edx, 2 
	 mul edx ;EDX:EAX = EAX* 2 to make an address out of it
	 mov edx, eax ;EDX = EAX so EDX == 0 => not found EDX!=0 => found
	 jmp oop
	next:
	add eax, 4 ;Next Address
	sub edx, 1 ;loop -1
	jmp loopThroughExport ;loop -1
oop:
	 test edx, edx ;loop -1
 	jz FAILED ;exit jump to not break executable, also you can now asume that everything works
 mov eax, [esi+0x24] ;EAX = AddressOfNameOrdinals , get Ordinal by index to get Addres
 add eax, edx ;AddressOfNameOrdinals + Index*4 => Ordinal of Function VAddr
 add eax, [ebp+dllBase] ;VAddr + dllBase = rAddr
 mov ax, word [eax] ;EAX = Ordinal
 cwde ;AX => EAX
 mov edx, 4 ;4 because , Address = 4 bytes
    mul edx ;EDX:EAX = EAX* 4 to make an address out of it
 mov edx,  [esi+0x1C] ;edx = AddressOfFunctions VAddr
 add edx, [ebp+dllBase] ;VAddr + dllBase = rAddr
 add edx, eax ;rAddr + Offset => Funtion Addr
 mov edx, [edx] ;edx = VAddr of Function
 add edx, [ebp+dllBase] ;VAddr + dllBase = rAddr
 mov [ebp+GetProcAddress], edx ;Save Addr
;Load User32 and Function
			 mov eax, [ebp+GetProcAddress]
			 mov ebx, [ebp+dllBase]
			 lea ecx, [ebp+LoadLibraryStr]
			 push ecx
			 push ebx
			 call eax
			 mov [ebp+LoadLibrary], eax

			 mov eax, [ebp+GetProcAddress]
			 mov ebx, [ebp+dllBase]
			 lea ecx, [ebp+FreeLibraryStr]
			 push ecx
			 push ebx
			 call eax
			 mov [ebp+FreeLibrary], eax

			 mov eax, [ebp+LoadLibrary]
			 lea ecx, [ebp+USER32Str]
			 push ecx
			 call eax
			 mov [ebp+USER32], eax

			 mov eax, [ebp+GetProcAddress]
			 mov ebx, [ebp+USER32]
			 lea ecx, [ebp+MessageBoxStr]
			 push ecx
			 push ebx
			 call eax
			 mov [ebp+MessageBox], eax


;DLL Name into ECX for debugging porpuse
			 mov ecx, [esi+0xC]
			 add ecx, [ebp+dllBase]

;MessageBox
            push    0 ; MB_OK
            push    ecx
            lea     eax, [ebp + szText]
            push    eax ; lpText
            push    0 ; hWnd
            mov    eax, [ebp + MessageBox]
            call    eax ; MessageBoxA

;FREE USER32
			 mov eax, [ebp+FreeLibrary]
			 mov ebx, [ebp+USER32]
			 push ebx
			 call eax

;END CODE
FAILED: ;Just incase exit jump
            popad
			
			call dynamic
			dynamic:
			pop ebp
			sub ebp, dynamic
			sub ebp, 0xBBBBBBBB
			add ebp, 0xAAAAAAAA		
            push    ebp ; OEP
            ret
			
dllBase dd 0
LoadLibrary dd 0
MessageBox dd 0
FreeLibrary dd 0
GetProcAddress dd 0
USER32 dd 0
LoadLibraryStr db "LoadLibraryA",0
MessageBoxStr db "MessageBoxA",0
FreeLibraryStr db "FreeLibrary",0
USER32Str db "user32.dll",0
GetProcAddressStr db "GetProcAddress",0
szText db "This Box shouldn't be here -Leeky",0
db 2