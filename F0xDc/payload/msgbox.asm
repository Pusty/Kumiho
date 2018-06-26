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
push 0xAAAAAAAA
ret
szCaption db "dTm Wuz h3re",0
szText db "HaXX0r3d by dTm",0
db 0,0