; Random protector code
; mostly just contains not used code 

bits 32 ;x86

call init
main:
pushad ;save context
mov ecx, 0xAAAAAAAA ; ecx = Amount of bytes
sub esi, ecx; esi = start of code
sub si, 5 ;off by 5 bytes because of pushad and mov
;shr ecx, 2 ; ecx = ecx / 4
lea edi, [esi] ;input and output = same
mov edx, 1
xor ebx, ebx

crypt:
	lodsb
	xadd edx, ebx ;this currently does nothing :/
	mov ebx, 0xCC
	dec eax      ;I tried lots of stuff but simple subtraction/additions is the only thing I got working :/
	cmp al, 0xC3
	;cmove eax, ebx
	stosb
loop crypt


popad ;reload context
jmp 0xBBBBBBBB+$+5 ; return to old entry point
init:
	pop esi
	jmp main



;Anti Virtual box default settings
mov eax, 0x1
cpuid
sub eax, eax
and ebx, 0xFF0000
shr ebx, 0x10
sub ebx, 1 ;checks if the amount of logical processors/cores is 1 or lower
setle al ;this removes support for single core processors but I don't think anyone uses something for Windows software lol


;Anti debugging macro [Windows]
mov ebx , [fs:0x18] ;TEB
mov ebx , [ebx+0x30] ;PEB
sub eax, eax
mov al, byte [ebx+0x02] ;isDebugged


;Jump Macro
xor eax, eax
jz 0
jnz 0

;offsets instructions for debugger
db 0xEB,0xFF,0xC0,0x48 ;jmp 1 ;inc eax ; dec eax
;offsets function bounderies
db 0xE8,0x00,0x00,0x00,0x00,0xC3 ;call 5; ret