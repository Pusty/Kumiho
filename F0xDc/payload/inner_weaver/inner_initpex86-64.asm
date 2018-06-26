;START UP CODE FOR INNER WEAVER MODULE
;0xAAAAAAAAAAAAAAAA = $PART_1
;0xBBBBBBBBBBBBBBBB = $VARTABLE
bits 64
;no push and pop savity! :O
start:
call init
VARTABLE dd 0xBBBBBBBB ; $VARTABLE
init:
pop rbp
movsxd r15, dword [rbp] ;size of push and return
add rbp, r15
add rbp, (VARTABLE-start-1) ;?
jmp (0xAAAAAAAA+5+$) ;jump to PART1