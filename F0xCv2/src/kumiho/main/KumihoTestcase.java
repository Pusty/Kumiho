package kumiho.main;

import java.util.Arrays;

import pusty.f0xC.imports.Internal;
import pusty.f0xC.imports.LibC;
import pusty.f0xC.rt.windows.Kernel32;
import pusty.f0xC.rt.windows.WinStruct.HANDLE;

public class KumihoTestcase {

	
	public static void main(String[] args) {
		loadIncluded();
		System.out.println();
		Kumiho.callOut(jumpOut); //jumping/calling the included executable here means that the packer/protector will stay active
	}
	public static void loadIncluded() {
		System.out.println("Hash of Data: "+Integer.toHexString(Arrays.hashCode(Kumiho.rawFile))); //this doesn't free correctly!
		HANDLE hObj = Kernel32.GetModuleHandle(null);

		KumihoPEReader peIncl = new KumihoPEReader(Kumiho.rawFile); //parse the included 32bit PE header
		//KumihoPEReader peThis = new KumihoPEReader(hObj.handle); //parse the header of the executable itself
		
		Integer oldProtect = Integer.valueOf(0); //save the old protection into here
		//make the whole image readable, writeable and executable (this is not actually needed if the section is read write executable already)
		Kernel32.VirtualProtect(hObj.handle, peIncl.SizeOfImage, Kernel32.PAGE_EXECUTE_READWRITE, oldProtect);
		
		//Copy physical data to virtual positions thus loading the image
		for(int i=0;i<peIncl.NumberOfSections;i++) {
			for(int t=0;t<peIncl.SizeOfRawData[i];t++)
				Internal.rawMemoryWriteByte(hObj.handle+peIncl.VirtualAddress[i]+t, Kumiho.rawFile[peIncl.PointerToRawData[i]+t]);
		}
		
		System.out.println("Finished rebuilding sections..");
		
		//Copy new header to current position (for example resource gathering needs this)
		for(int i=0;i<peIncl.SizeOfHeaders;i++)
			Internal.rawMemoryWriteByte(hObj.handle+i, Kumiho.rawFile[i]);
		//TODO: some header scrambling would be nice to prevent dumps
		
		//Import rebuilding
		if(peIncl.ImageDirectoryEntryImport != 0) {
			int pImportDescriptor = hObj.handle+peIncl.ImageDirectoryEntryImport;
			while(Internal.rawMemoryReadInt(pImportDescriptor+0xC) != 0) {
				int pName = Internal.rawMemoryReadInt(pImportDescriptor+0xC); //read the Name field of the import descriptor
				int lpLibrary = hObj.handle+pName;
				String lpLibraryName = LibC.CString2JString(lpLibrary);
				int hLibModule = Kernel32._GetModuleHandleA(lpLibrary); //check if library is already imported
				if(hLibModule == 0)
					hLibModule = Kernel32._LoadLibraryA(lpLibrary); //load if not already done
				int pNameRef = Internal.rawMemoryReadInt(pImportDescriptor); //read original first thunk
				int lpThunk = hObj.handle+Internal.rawMemoryReadInt(pImportDescriptor+0x10); //read first thunk
				if(pNameRef == 0)
					pNameRef = lpThunk;
				else
					pNameRef += hObj.handle; //normally original thunks are preferred, but they are not mandatory	
				while(Internal.rawMemoryReadInt(pNameRef) != 0) { //last thunk entry is empty so read until empty
					int nameRef = Internal.rawMemoryReadInt(pNameRef);
					if((nameRef & 0x80000000)!=0) { //import by ordinal
						Internal.rawMemoryWriteInt(lpThunk, Kernel32._GetProcAddress(nameRef^0x80000000,hLibModule)); //remove the ordinal bit from the import
					}else { //import by name 
						String lpAddressName = LibC.CString2JString(hObj.handle+nameRef+2);
						if(lpLibraryName.equalsIgnoreCase("kernel32.dll") && lpAddressName.equalsIgnoreCase("ExitProcess")) {
							System.out.println("Hooking... "+lpLibraryName+'@'+lpAddressName);
							Internal.rawMemoryWriteInt(lpThunk, Kumiho.hookExitProcessAddr());
						}else
							Internal.rawMemoryWriteInt(lpThunk, Kernel32._GetProcAddress(hObj.handle+nameRef+2,hLibModule)); //offset by 2 because of the "Hint" field
					}
					pNameRef += 0x4; //read next entry
					lpThunk += 0x4;
				}		
				pImportDescriptor = pImportDescriptor + 0x14; //IMPORT_DESCRIPTOR structure is 20 bytes for 32bit binaries
			}
			System.out.println("Finished importing..");
		}
		Kumiho.freeFile();
		
		//Kumiho.jumpOut(hObj.handle+peIncl.AddressOfEntryPoint);
		jumpOut = hObj.handle+peIncl.AddressOfEntryPoint;
		//Kernel32.VirtualProtect(hObj.handle, peIncl.SizeOfImage, oldProtect, 0);
		
		if(peIncl.ImageDirectoryEntryTLS != 0) { //check if a TLS table exists
			int ptls = hObj.handle+peIncl.ImageDirectoryEntryTLS;
			int dwCallback = Internal.rawMemoryReadInt(ptls+0xC); //Get AddressOfCallBacks
			if(dwCallback != 0) {
			    while(Internal.rawMemoryReadInt(dwCallback) != 0) { //check if the callback is null
			        Kumiho.callTLS(Internal.rawMemoryReadInt(dwCallback), hObj.handle, 1, 0); //execute if it isn't
			    	dwCallback+=4;
			    }
			}
			System.out.println("TLS loaded...");
		}
		
    }
	
	public static int jumpOut;
   
    
}
