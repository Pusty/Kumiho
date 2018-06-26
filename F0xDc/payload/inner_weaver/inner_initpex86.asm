;START UP CODE FOR INNER WEAVER MODULE
;0xAAAAAAAA = $PART_1
;0xBBBBBBBB = $VARTABLE
bits 32
start:
;pushad
call init
VARTABLE dd 0xBBBBBBBB ; $VARTABLE
init:
pop ebp
mov eax, [ebp] ;size of push and return
add ebp, eax
add ebp, (VARTABLE-start-1) ;?
jmp (0xAAAAAAAA+5+$) ;jump to PART1