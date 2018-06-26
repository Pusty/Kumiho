#include "windows.h"

int main(int argc, char* argv[]) {
	if(argc<3) return 0;
	unsigned int value = 0;
	HMODULE hModule = LoadLibrary(argv[1]);
    LPVOID lpAddress = GetProcAddress(hModule, argv[2]);
	FreeLibrary(hModule);
	if(argc > 3)
		value = (unsigned int) (((unsigned long long)lpAddress) >> 32);
	else
		value = (unsigned int) lpAddress;
	//printf("%x", value); //DEBUG
	return value;
}