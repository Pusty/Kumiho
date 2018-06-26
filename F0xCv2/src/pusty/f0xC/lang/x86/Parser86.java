package pusty.f0xC.lang.x86;

import java.util.ArrayList;
import java.util.List;
import pusty.f0xC.ContextClass;
import pusty.f0xC.ContextFunction;
import pusty.f0xC.F0xC;
import pusty.f0xC.lang.OverrideHandler;
import pusty.f0xC.lang.Parser;
import pusty.f0xC.lang.x86.overrides.*;
import pusty.f0xC.nodes.*;
import pusty.f0xC.rt.lang.*;
import pusty.f0xC.rt.lang.throwable.*;
import pusty.f0xC.rt.io.*;
import pusty.f0xC.rt.util.*;

public class Parser86 extends Parser {

	OverrideHandler overrideHandler;
	public Parser86() {
		super();
		registerOverrides();
	}
	
	@Override
	public void simplify(F0xC fox) {
		List<String> content = new ArrayList<String>();
		content.addAll(fox.getResult());
		
		//if(!F0xC.DEBUG_MODE) {
			System.out.println("[#] Optimization Start (Size: "+content.size()+")");
			int roundNr = 0;
			int lastSize = 0;
			int newSize  = 0;
			do {
				lastSize = content.size();
				content = Optimizer86.optimizeLabel(content);
			    content = Optimizer86.optimizeVTable(content);
				//content = Optimizer86.optimizeStack(content);
				newSize = content.size();
				roundNr++;
				System.out.println("[#] Done with Round "+roundNr+" (Size: "+newSize+")");
			}while(newSize < lastSize && roundNr < 6);
		//}
		
		fox.getResult().clear();
		fox.getResult().addAll(content);
	}
	
	@Override
	public String getLanguageName() {
		return "x86";
	}
	
	@Override
	public OverrideHandler getOverrideHandler() {
		return overrideHandler;
	}
	
	public void registerOverrides() {
		overrideHandler = new OverrideHandler();
		
		overrideHandler.registerOverride(OClass.class);
		overrideHandler.registerOverride(OObject.class);

		
		overrideHandler.registerOverride(OThrowable.class);
		overrideHandler.registerOverride(OException.class);
		overrideHandler.registerOverride(ORuntimeException.class);
		overrideHandler.registerOverride(OIllegalArgumentException.class);
		overrideHandler.registerOverride(ONumberFormatException.class);
		overrideHandler.registerOverride(ONullPointerException.class);
		overrideHandler.registerOverride(OIndexOutOfBoundsException.class);
		overrideHandler.registerOverride(OArrayIndexOutOfBoundsException.class);
		overrideHandler.registerOverride(OStringIndexOutOfBoundsException.class);
		overrideHandler.registerOverride(OError.class);
		overrideHandler.registerOverride(OVirtualMachineError.class);
		overrideHandler.registerOverride(OOutOfMemoryError.class);

		overrideHandler.registerOverride(ONumber.class);
		overrideHandler.registerOverride(OByte.class);
		overrideHandler.registerOverride(OCharacter.class);
		overrideHandler.registerOverride(OInteger.class);
		overrideHandler.registerOverride(OLong.class);
		overrideHandler.registerOverride(OFloat.class);
		overrideHandler.registerOverride(ODouble.class);
		overrideHandler.registerOverride(OString.class);
		overrideHandler.registerOverride(OCharSequence.class);
		overrideHandler.registerOverride(OStringBuilder.class);
		overrideHandler.registerOverride(OSystem.class);
		overrideHandler.registerOverride(OMath.class);
		
		overrideHandler.registerOverride(OFile.class);
		overrideHandler.registerOverride(OFileInputStream.class);
		overrideHandler.registerOverride(OFileDescriptor.class);
		overrideHandler.registerOverride(OFileSystem.class);
		overrideHandler.registerOverride(OIOException.class);
		overrideHandler.registerOverride(OEOFException.class);
		overrideHandler.registerOverride(OUTFDataFormatException.class);
		overrideHandler.registerOverride(OFileNotFoundException.class);
		overrideHandler.registerOverride(ODataInputStream.class);
		overrideHandler.registerOverride(OFilterInputStream.class);
		overrideHandler.registerOverride(OInputStream.class);
		overrideHandler.registerOverride(ODataInput.class);
		overrideHandler.registerOverride(OOutputStream.class);
		overrideHandler.registerOverride(NativeOutputStream.class);
		overrideHandler.registerOverride(OPrintStream.class);
		
		
		overrideHandler.registerOverride(OList.class);
		overrideHandler.registerOverride(OArrayList.class);
		overrideHandler.registerOverride(OCollection.class);
		overrideHandler.registerOverride(OIterable.class);
		overrideHandler.registerOverride(OIterator.class);
		overrideHandler.registerOverride(OListIterator.class);
		overrideHandler.registerOverride(OArrays.class);

		overrideHandler.registerOverride(x86Internal.class);
		overrideHandler.registerOverride(x86InternalObject.class);
		
		overrideHandler.process();
	}
	
	public static String getStringVarName(String str) {
		return "stringmap_"+Integer.toHexString(str.hashCode());
	}

	@Override
	public ArrayList<String> startParsing(F0xC fox) { 
		ArrayList<String> list = super.startParsing(fox);
		return adjust(null, list);
	}
	
	@Override
	public ArrayList<String> stopParsing(F0xC fox) {
	    ArrayList<String> list = super.stopParsing(fox);
		return adjust(null, list);
	}
	
	@Override
	public ArrayList<String> startClass(F0xC fox, ContextClass c)  {
		ArrayList<String> list = super.startClass(fox, c);
		return list;
	}
	
	@Override
	public ArrayList<String> stopClass(F0xC fox, ContextClass c)  {
		ArrayList<String> list = super.stopClass(fox, c);
		return list;
	}

	@Override
	public ArrayList<String> startFunction(F0xC fox, ContextFunction f) {
		ArrayList<String> list = super.startFunction(fox, f);
		return adjust(f, list);
	}
	
	@Override
	public ArrayList<String> stopFunction(F0xC fox, ContextFunction f)  {
		ArrayList<String> list = super.stopFunction(fox, f);
		return adjust(f, list);
	}
	
	@Override
	public ArrayList<String> parseNode(F0xC fox, ContextClass c, ContextFunction f, Node raw) {
		ArrayList<String> list = super.parseNode(fox, c, f, raw);
		return adjust(f, list);
	}
	
	public static ArrayList<String> adjust(ContextFunction f, ArrayList<String> list) {
		ArrayList<String> listPost = new ArrayList<String>();
		for(String str:list) {
			str = str
					 .replace("reg0b", "al")
					 .replace("reg0s", "ax")
					 .replace("reg0", "eax")
					 .replace("reg1b", "bl")
					 .replace("reg1s", "bx")
					 .replace("reg1", "ebx")
					 .replace("reg2b", "cl")
					 .replace("reg2s", "cx")
					 .replace("reg2", "ecx")
					 .replace("reg3b", "dl")
					 .replace("reg3s", "dx")
					 .replace("reg3", "edx")
					 .replace("regI", "esi")
					 .replace("regO", "edi")
					 .replace("regCb", "cl")
					 .replace("regC", "ecx")
					 .replace("regS", "esp")
					 .replace("regB", "ebp")
					 .replace("regA", "eax")
					 .replace("regE", "edx")
					 .replace("refsize", "8")
					 .replace("storeref", "dd")
					 .replace("addrsize", "4")
					 .replace("addrname", "dword");
			if(f != null) {
				String labelName = (f.getClassName()+"_"+f.getSanitizedFullName()).replace('/', '_').replace('.', '_').replace('<', '$').replace('>', '$');
			//	System.err.println("Parser: "+labelName);
				str = str.replace("label_", "function_"+ ContextFunction.hashFunctionName(labelName)+"_line_");
			}
			str = str.replace('<', '$').replace('>', '$');
			listPost.add(str);
		}
		return listPost;
	}
	
	@Override
	public int getAddressSize() { return 4; }

}
