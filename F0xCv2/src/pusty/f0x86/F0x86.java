package pusty.f0x86;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;

public class F0x86 {
	Instruction[] instructions;
	public F0x86() {
		parseFile("base");
	}
	
	@SuppressWarnings("deprecation")
	public void parseFile(String name) {
		ArrayList<Instruction> arrayList = new ArrayList<Instruction>();
		try {
		File file = new File(name);
		FileInputStream fstream = new FileInputStream(file);
		DataInputStream reader = new DataInputStream(fstream);
			String line;
			while((line = reader.readLine()) != null) {
				if(line.startsWith("#") || line.trim().length()==0) continue;
				Instruction inst = new Instruction(line);
				arrayList.add(inst);
			}
		reader.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		instructions = arrayList.toArray(new Instruction[arrayList.size()]);
	}
	public Instruction assembleInst(String str) {
		ArrayList<Instruction> list_inst = new ArrayList<Instruction>();
		ArrayList<Integer>     list_int  = new ArrayList<Integer>();
		for(Instruction inst:instructions) {
			try {
				byte[] data_encode = inst.encode(str, true); //fetch instructions in strict mode
				if(data_encode != null) {
					list_inst.add(inst);
					list_int.add(data_encode.length);
				}
			}catch(Exception e){}
		}
		if(list_inst.size() == 0) {
			try {
				for(Instruction inst:instructions) {
					byte[] data_encode = inst.encode(str, false); //fetch instructions without strict mode
					if(data_encode != null) {
						list_inst.add(inst);
						list_int.add(data_encode.length);
					}
				}
			}catch(Exception e){}
		}
		if(list_inst.size() == 0)
			return null;	
		int smallest = 0;
		int smallest_size = Integer.MAX_VALUE;
		for(int i=0;i<list_int.size();i++) {
			if(list_int.get(i) < smallest_size) {
				smallest = i;
				smallest_size = list_int.get(i);
			}
		}
		return list_inst.get(smallest);
	}
	public byte[] assemble(String str) {
		return assembleInst(str).encode(str, false);
	}
	public String assembleHexString(String str) {
		return assembleInst(str).encodeHexString(str);
	}
	public String disassemble(byte[] data) {
		if(data == null) return null;
		for(Instruction inst:instructions) {
			try {
			String disasm = inst.decodeInstruction(data);
			if(disasm != null) 
				return disasm;
			}catch(Exception e){}
		} return null;
	}

	
	public static void main(String[] args) {
		F0x86 fox = new F0x86();
		Assembler assembler = new Assembler(fox);
		assembler.parseFile(new File("test.asm"));
		assembler.processNodes(0x401000);	
		System.out.println(assembler.hexify());
		//System.out.println(fox.assembleFile(new File("test.asm")));
		//System.out.println(fox.assembleHexString("xchg [123], eax"));
		//System.out.println(fox.disassemble(fox.assemble("xchg [123], eax")));
	}
}
