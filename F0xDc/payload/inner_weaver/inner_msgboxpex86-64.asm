bits 64
sub rsp, 0x28
nop
xor rcx, rcx
nop ;using nop as seperator
movsxd r8, dword [rbp + 0]
nop
add r8, rbp
nop
movsxd rdx, dword [rbp + 4]
nop
add rdx, rbp
nop
xor r9, r9
nop
mov rax, 0xAAAAAAAAAAAAAAAA
nop
call rax
nop
add rsp, 0x28
nop
dd 0xDEADDA7A
szCaption db "Connected Code",0,0xCC
nop
szText db "Random Text",0,0xCC

;00007FF822A9FBE0
;00007FF722A9FBE0

;00007FF822A9FBE0
;00007FF6A2A9FBE0