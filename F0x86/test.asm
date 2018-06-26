;#import MessageBoxA kernel32.dll MessageBoxA

data: db 0xFE

main:
mov ecx, 0x10
mov esi, [data]
inc eax
xor ebx, ebx ;test
	loopMe:
	mov edx, eax
	add eax, ebx
	mov ebx, edx
	loop loopMe
end:

