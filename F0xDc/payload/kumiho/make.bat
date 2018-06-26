@echo off

echo [*] Building stub.o

nasm -fwin32 -o stub.o stub.s

echo [*] Building main.o

gcc -std=c99 -fno-asynchronous-unwind-tables -O2 -c -o main.o main.c

REM echo [*] Building deobfuscate.o

REM gcc -fno-asynchronous-unwind-tables -O2 -c -o deobfuscate.o deobfuscate.c

REM echo [*] Building rc4.o

REM gcc -fno-asynchronous-unwind-tables -O2 -c -o rc4.o rc4.c

REM echo [*] Building quicklz.o

REM gcc -fno-asynchronous-unwind-tables -O2 -c -o quicklz.o quicklz.c

echo [*] Building rebuild.o

gcc -std=c99 -fno-asynchronous-unwind-tables -O2 -c -o rebuild.o rebuild.c

echo [*] Building stub.exe

ld -mi386pe --subsystem windows -O2 -s -o stub.exe stub.o main.o rebuild.o -L"C:\MinGW\lib" -lkernel32 -lmsvcrt

Del stub.o

REM del deobfuscate.o

REM del rc4.o

REM del quicklz.o

del rebuild.o

del main.o

echo [*] Done

pause >NUL