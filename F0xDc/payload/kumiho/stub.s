[BITS 32]

global _start
global _call_oep

extern _stubmain

section .text

_start:
	call 	_stubmain
	push 	eax								; dwOEP
	ret										; jmp
