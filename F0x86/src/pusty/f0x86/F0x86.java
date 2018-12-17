package pusty.f0x86;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class F0x86 {
	Instruction[] instructions;
	public F0x86() {
		parseFile("base");
	}
	
	public void parseFile(String name) {
		ArrayList<Instruction> arrayList = new ArrayList<Instruction>();
		BufferedReader reader = new BufferedReader(new InputStreamReader(F0x86.class.getResourceAsStream(name)));
		try {
			String line;
			while((line = reader.readLine()) != null) {
				if(line.startsWith("#") || line.trim().length()==0) continue;
				Instruction inst = new Instruction(line);
				arrayList.add(inst);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		try { reader.close(); }catch(Exception e){ e.printStackTrace(); }
		instructions = arrayList.toArray(new Instruction[arrayList.size()]);
	}
	
	
	//Iterates over all possible encodings
	public Instruction assembleInstFull(String str) {
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
	
	
	//Stops after first possible encoding, still sucks and can be improved MASSIVLY by some smarty pants algorithm
	public Instruction assembleInstLazy(String str) {
		for(Instruction inst:instructions) {
			try {
				byte[] data_encode = inst.encode(str, false); //fetch instructions in strict mode
				if(data_encode != null) {
					return inst;
				}
			}catch(Exception e){e.printStackTrace();System.err.println(inst);System.err.println(str);System.exit(1);}
		}
		return null;
	}
	
	
	public Instruction assembleInst(String str) {
		//System.out.println(str);
		return assembleInstLazy(str);
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
	
	public String disassembleHexString(String str) {
		if(str.length()%2 != 0) {
			System.err.println("Can't work with odd length hex string");
			return null;
		}
		if(str.length() == 0) {
			System.err.println("Can't work with empty string");
			return null;
		}
		byte[] data = new byte[str.length()/2];
		for(int i=0;i<data.length;i++)
			data[i] = (byte) Integer.parseInt(str.substring(i*2, i*2+2), 16);
		return disassemble(data);
	}
	

	public static void testParsingFile() {
		F0x86 fox = new F0x86();
		Assembler assembler = new Assembler(fox);
		assembler.parseFile(new File("test.asm"));
		assembler.processNodes(0x401000);
		System.out.println(assembler.hexify());
	}
	
	public static void testAssembleLine() {
		F0x86 fox = new F0x86();
		System.out.println(fox.assembleHexString("xchg [123], eax"));
	}
	
	public static void testDisassembleLine() {
		F0x86 fox = new F0x86();
		System.out.println(fox.disassembleHexString("c644484569"));
	}
	
	public static void main(String[] args) {
		testParsingFile();
		testAssembleLine();
		testDisassembleLine();
	}
}
