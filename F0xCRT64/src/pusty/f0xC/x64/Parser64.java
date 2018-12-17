package pusty.f0xC.x64;

import java.util.ArrayList;
import java.util.List;
import pusty.f0xC.ContextClass;
import pusty.f0xC.ContextFunction;
import pusty.f0xC.F0xC;
import pusty.f0xC.lang.Parser;
import pusty.f0xC.nodes.*;

public class Parser64 extends Parser {

	public Parser64() {
		super(ClassConfig64.getDefault());
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
				content = Optimizer64.optimizeLabel(content);
			    content = Optimizer64.optimizeVTable(content);
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
		return "x64";
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
					 .replace("reg0d", "eax")
					 .replace("reg0", "rax")
					 .replace("reg1b", "bl")
					 .replace("reg1s", "bx")
					 .replace("reg1d", "ebx")
					 .replace("reg1", "rbx")
					 .replace("reg2b", "cl")
					 .replace("reg2s", "cx")
					 .replace("reg2d", "ecx")
					 .replace("reg2", "rcx")
					 .replace("reg3b", "dl")
					 .replace("reg3s", "dx")
					 .replace("reg3d", "edx")
					 .replace("reg3", "rdx")
					 .replace("regI", "rsi")
					 .replace("regO", "rdi")
					 .replace("regCb", "cl")
					 .replace("regCd", "ecx")
					 .replace("regC", "rcx")
					 .replace("regS", "rsp")
					 .replace("regB", "rbp")
					 .replace("regA", "rax")
					 .replace("regE", "rdx")
					 .replace("r8", "r8")
					 .replace("r9", "r9")
					 .replace("storeref", "dq")
					 .replace("addrsize", "8")
					 .replace("addrname", "qword");
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
	public int getAddressSize() { return 8; }

}
