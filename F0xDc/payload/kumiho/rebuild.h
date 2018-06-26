#ifndef __REBUILD_H__
#define __REBUILD_H__

BOOL MemoryMapPayload(LPVOID lpDest, LPVOID lpPayload, PIMAGE_DOS_HEADER pidh, PIMAGE_NT_HEADERS pinh);
BOOL RebuildImportTable(LPVOID lpBaseAddress, PIMAGE_NT_HEADERS pinh);

#endif
