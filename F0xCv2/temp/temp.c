#include <windows.h>
#include <tlhelp32.h>
#include <stdio.h>

void main() {
        HANDLE hSnapshot = CreateToolhelp32Snapshot(TH32CS_SNAPTHREAD, 0);
		printf("%08X\n", hSnapshot);
        THREADENTRY32 te;
        te.dwSize = sizeof(THREADENTRY32);
		printf("%08X\n", te.dwSize);
        printf("%08X\n", (Thread32First(hSnapshot, &te)));
}