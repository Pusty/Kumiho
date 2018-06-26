bits 32
push 0
nop ;using nop as seperator
mov eax, [ebp + 0]
nop
add eax, ebp
nop
push eax
nop
mov eax, [ebp + 4]
nop
add eax, ebp
nop
push eax
nop
push 0
nop
mov eax, 0xAAAAAAAA
nop
call eax
dd 0xDEADDA7A
szCaption db "Connected Code",0,0xCC
nop
szText db "Random Text",0,0xCC