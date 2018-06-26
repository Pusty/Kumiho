@ECHO OFF
fasm -s output.fas output.asm
x64dbg_dd output.fas output.exe.dd32