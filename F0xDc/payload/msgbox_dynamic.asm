;nasm -fbin -in %s.asm -o %s
bits 32
pushad
call routine
routine:
pop ebp
sub ebp, routine
push 0
lea eax, [ebp + szCaption]
push eax
lea eax, [ebp + szText]
push eax
push 0
mov eax, 0xAAAAAAAA
call eax
popad

call dynamic
dynamic:
pop ebp
sub ebp, dynamic
sub ebp, 0xBBBBBBBB
add ebp, 0xAAAAAAAA		
push    ebp ; OEP
ret
			
szCaption db "Plain Code",0
szText db "Random Text",0
db 0,0