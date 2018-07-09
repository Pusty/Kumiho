package kumiho.main;

import java.util.Arrays;

import pusty.f0xC.imports.Internal;
import pusty.f0xC.rt.windows.Kernel32;
import pusty.f0xC.rt.windows.WinStruct.HANDLE;

public class KumihoTestcase {

	public static void main(String[] args) {
		System.out.println("Starting...");
		System.out.println("Hash of Data: "+Integer.toHexString(Arrays.hashCode(Kumiho.rawFile))); //this doesn't free correctly!
		HANDLE hObj = Kernel32.GetModuleHandle(null);

		KumihoPEReader peIncl = new KumihoPEReader(Kumiho.rawFile);
		//KumihoPEReader peThis = new KumihoPEReader(hObj.handle);
		
		Integer oldProtect = Integer.valueOf(0);
		Kernel32.VirtualProtect(hObj.handle, peIncl.SizeOfImage, Kernel32.PAGE_EXECUTE_READWRITE, oldProtect);
		
		//Copy physical data to virtual positions
		for(int i=0;i<peIncl.NumberOfSections;i++) {
			for(int t=0;t<peIncl.SizeOfRawData[i];t++)
				Internal.rawMemoryWriteByte(hObj.handle+peIncl.VirtualAddress[i]+t, Kumiho.rawFile[peIncl.PointerToRawData[i]+t]);
		}
		
		System.out.println("Finished rebuilding sections..");
		
		//Import rebuilding
		if(peIncl.ImageDirectoryEntryImport != 0) {
			int pImportDescriptor = hObj.handle+peIncl.ImageDirectoryEntryImport;
			while(Internal.rawMemoryReadInt(pImportDescriptor+0xC) != 0) {
				int pName = Internal.rawMemoryReadInt(pImportDescriptor+0xC);
				int lpLibrary = hObj.handle+pName;
				int hLibModule = Kernel32._GetModuleHandleA(lpLibrary);
				if(hLibModule == 0)
					hLibModule = Kernel32._LoadLibraryA(lpLibrary);
		
				int pNameRef = hObj.handle+Internal.rawMemoryReadInt(pImportDescriptor);
				int lpThunk = hObj.handle+Internal.rawMemoryReadInt(pImportDescriptor+0x10);
				
				while(Internal.rawMemoryReadInt(pNameRef) != 0) {
					int nameRef = Internal.rawMemoryReadInt(pNameRef);
					if((nameRef & 0x80000000)!=0) {
						Internal.rawMemoryWriteInt(lpThunk, Kernel32._GetProcAddress(nameRef^0x80000000,hLibModule));
					}else {
						Internal.rawMemoryWriteInt(lpThunk, Kernel32._GetProcAddress(hObj.handle+nameRef+2,hLibModule));
					}
					pNameRef += 0x4;
					lpThunk += 0x4;
				}
				
				pImportDescriptor = pImportDescriptor + 0x14;
			}
			
		}

		System.out.println("Finished importing..");
		System.out.println();
		//Kumiho.jumpOut(hObj.handle+peIncl.AddressOfEntryPoint);
		jumpOut = hObj.handle+peIncl.AddressOfEntryPoint;
		//Kernel32.VirtualProtect(hObj.handle, peIncl.SizeOfImage, oldProtect, 0);
		
    }
	
	public static int jumpOut;
   
    
}
