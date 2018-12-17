package pusty.f0x86;

import java.util.ArrayList;
import java.util.Arrays;

public class Instruction {
	private static boolean DEBUG = false;
	
	public static int systemSize = Register.REG32; // Switch this on mode
	
	
	byte[]    prefix;
	String mnemonic;
	String[] mnemonic_params;
	byte[]    opcode;
	String[] opcode_params;
	
	public Instruction(String line) {
		try {
			String prefix = line.substring(0, 2);
			
			if(prefix.equalsIgnoreCase("RW")) {
				this.prefix = new byte[] {0x66};
			}else if(prefix.equalsIgnoreCase("RQ")) {
				this.prefix = new byte[] {0x48};
			}else if(prefix.equalsIgnoreCase("RX")) {
				this.prefix = new byte[] {(byte) 0xFF};
			}else {
				this.prefix = null;
			}
			
			line = line.substring(3);
			String mnemonics = line.split(";")[1].trim();
			if(mnemonics.indexOf(' ') == -1) {
				this.mnemonic = mnemonics.trim().toLowerCase();
				this.mnemonic_params = new String[] {};
			}else {
				this.mnemonic = mnemonics.substring(0, mnemonics.indexOf(' ')).trim().toLowerCase();
				this.mnemonic_params = mnemonics.substring(mnemonics.indexOf(' ')).split(",");
			}
			for(int i=0;i<this.mnemonic_params.length;i++) this.mnemonic_params[i] = this.mnemonic_params[i].trim().toLowerCase();
			String[] opcodes   = line.split(";")[0].trim().split(" ");
			ArrayList<Byte> opcode = new ArrayList<Byte>();
			for(int i=0;i<opcodes.length;i++) {
				try {
					opcode.add((byte) Integer.parseInt(opcodes[i], 16));
				}catch(Exception e) {
					break;
				}
			}
			this.opcode = new byte[opcode.size()];
			for(int i=0;i<opcode.size();i++)
				this.opcode[i] = opcode.get(i);
			this.opcode_params = new String[opcodes.length-opcode.size()];
			for(int i=0;i<this.opcode_params.length;i++) this.opcode_params[i] = opcodes[i+opcode.size()].trim().toLowerCase();
		}catch(Exception e) {
			System.err.println("Error parsing line: '"+line+'"');
			e.printStackTrace();
		}
	}
	
	public static boolean confirmREGinMODRM(int i, int reg) {
		return ((i>>>3)&7)==reg;
	}
	
	public static int writeMODRM(int rm, int reg, int mod) {
		return (((mod&3)<<6)|((reg&7)<<3)|(rm&7))&0xFF;
	}
	public static int writeSIB(int sc, int in, int ba) {
		return (((sc&3)<<6)|((in&7)<<3)|(ba&7))&0xFF;
	}
	
	//Classify value into a type
	public String classifyValue(String input) {
		String output = null;
		//Check if the parameter is a pure register
		if(Register.getRegister(input) != null) {
			Register reg = Register.getRegister(input);
			if(reg.is8bit()) {
				output = "rb";
			}else if(reg.is16bit()) {
				output = "rw";
			}else if(reg.is32bit()) {
				output = "rd";
			}else if(reg.is64bit()) {
				output = "rq";
			}else
				if(DEBUG)
					System.err.println("Instruction.java@classifyValue: Unknown Register Type");
			return output;
		}
		int size = 0;
		if(input.contains(" ")) {
			String keyword = input.substring(0, input.indexOf(" "));
			if(keyword.equalsIgnoreCase("PTR")) {
				keyword = input.substring(4, input.length()).trim();
				keyword = keyword.substring(0, keyword.indexOf(" "));
			}
			if(keyword.equalsIgnoreCase("byte"))
				size = MASK_SIZE_BYTE;
			else if(keyword.equalsIgnoreCase("word"))
				size = MASK_SIZE_WORD;
			else if(keyword.equalsIgnoreCase("dword"))
				size = MASK_SIZE_DWORD;
			else if(keyword.equalsIgnoreCase("qword"))
				size = MASK_SIZE_QWORD;
			while(input.indexOf(" ") != -1)
				input = input.substring(input.indexOf(" ")+1);
		}
		if(input.charAt(0) == '[' && input.charAt(input.length()-1) == ']') {
			if(size == MASK_SIZE_BYTE)
				return "mb";
			else if(size == MASK_SIZE_WORD)
				return "mw";
			else if(size == MASK_SIZE_DWORD)
				return "md";
			else if(size == MASK_SIZE_QWORD)
				return "mq";
			else if(size == 0)
				return "mu";
		}
		
		//if(input.matches("-?(0x|0X)?[\\da-f]+(h|H|O|o|b|B)?")) { //open for a better regex here
			try {
				long value = parseNumber(input); //if this becomes a problem again, try with a lenght based approach instead
				if(value <= 0xFF && value >= -0x7F)
					output = "ib";
				else if(value <= 0xFFFF && value >= -0x7FFF)
					output = "iw";
				else if(value <= 0xFFFFFFFFL && value >= -0x7FFFFFFFL)
					output = "id";
				else if(value <= 0x7FFFFFFFFFFFFFFFL && value >= -0x7FFFFFFFFFFFFFFFL)
					output = "iq";
				else
					if(DEBUG)
						System.err.println("Instruction.java@classifyValue: Unknown Immediate Value");
				return output;
			}catch(Exception e) {}
		//}
		
		return output;
	}
	
	//Confirm that this is a valid type
	public boolean isType(String type) {
	    char f = Character.toLowerCase(type.charAt(0));
		char l = Character.toLowerCase(type.charAt(type.length()-1));
	    if(f == 'r' || f == 'm' || f == 'i') {
	    	if(type.length() == 2 || (f == 'r' && type.length() == 3 && Character.toLowerCase(type.charAt(1)) == 'm'))
	    		if(l == 'b' || l == 'w' || l == 'd' || l == 'q') 
	    			return true;
	    		else if(l == 'u' && f == 'm')
	    			return true;
	    }
		//if(type.equalsIgnoreCase("rb") || type.equalsIgnoreCase("rw")  || type.equalsIgnoreCase("rd") || type.equalsIgnoreCase("rq")) return true;
		//if(type.equalsIgnoreCase("rmb")|| type.equalsIgnoreCase("rmw") || type.equalsIgnoreCase("rmd") || type.equalsIgnoreCase("rmq")) return true;
		//if(type.equalsIgnoreCase("mb") || type.equalsIgnoreCase("mw")  || type.equalsIgnoreCase("md") || type.equalsIgnoreCase("mq") || type.equalsIgnoreCase("mu")) return true; //DOES THIS EVEN EXIST?
		//if(type.equalsIgnoreCase("ib") || type.equalsIgnoreCase("iw")  || type.equalsIgnoreCase("id") || type.equalsIgnoreCase("iq")) return true;
		return false;
	}
	
	//Create a bitmask out of a type
	public static final int MASK_SIZE_BYTE = 1;
	public static final int MASK_SIZE_WORD = 2;
	public static final int MASK_SIZE_DWORD = 4;
	public static final int MASK_SIZE_QWORD = 8;
	public static final int MASK_SIZE = 15;
	public static final int MASK_ALLOW = ~15;
	public static final int MASK_ALLOW_MEMORY = 16;
	public static final int MASK_ALLOW_REGISTER = 32;
	public static final int MASK_ALLOW_IMMEDIATE = 64;
	
	public String maskToString(int mask) {
		StringBuilder output = new StringBuilder();
		if((mask&MASK_SIZE_BYTE) != 0)
			output.append("BYTE|");
		if((mask&MASK_SIZE_WORD) != 0)
			output.append("WORD|");
		if((mask&MASK_SIZE_DWORD) != 0)
			output.append("DWORD|");
		if((mask&MASK_SIZE_QWORD) != 0)
			output.append("QWORD|");
		if((mask&MASK_ALLOW_MEMORY) != 0)
			output.append("MEMORY|");
		if((mask&MASK_ALLOW_REGISTER) != 0)
			output.append("REGISTER|");
		if((mask&MASK_ALLOW_IMMEDIATE) != 0)
			output.append("IMMEDIATE|");
		if(output.charAt(output.length()-1) == '|')
			return output.substring(0, output.length()-1);
		return output.toString();
	}
	
	public int numberfyType(String type) {
		if(!isType(type)) return -1;
		int mask = 0;
		char first = Character.toLowerCase(type.charAt(0));
		char last = Character.toLowerCase(type.charAt(type.length()-1));
		if(last == 'b') mask = mask | MASK_SIZE_BYTE;
		else if(last == 'w') mask = mask | MASK_SIZE_WORD;
		else if(last == 'd') mask = mask | MASK_SIZE_DWORD;
		else if(last == 'q') mask = mask | MASK_SIZE_QWORD;	
		if(type.contains("m") || type.contains("M")) 	  mask = mask | MASK_ALLOW_MEMORY;
		if(first == 'r')	  mask = mask | MASK_ALLOW_REGISTER;
		if(first == 'i')	  mask = mask | MASK_ALLOW_IMMEDIATE;
		return mask;
	}
	//Checks if value/type main includes value/type sub
	public boolean includes(String main, String sub, boolean strict) {
		if(isType(main)) {
			int m = numberfyType(main);
			int s = isType(sub)?numberfyType(sub):numberfyType(classifyValue(sub));
			if(!strict)
				return ((m&MASK_SIZE) >= (s&MASK_SIZE) && ((s&MASK_ALLOW)&(m&MASK_ALLOW)) != 0); //has equal or bigger size and at least same modes
			else {
				if((s&MASK_ALLOW_MEMORY) != 0 && (s&MASK_SIZE) == 0)
					if(systemSize == Register.REG8)
						s = s | MASK_SIZE_BYTE;
					else if(systemSize == Register.REG16)
						s = s | MASK_SIZE_WORD;
					else if(systemSize == Register.REG32)
						s = s | MASK_SIZE_DWORD;
					else if(systemSize == Register.REG64)
						s = s | MASK_SIZE_QWORD;
				if((m&MASK_ALLOW_IMMEDIATE) != 0 || (m&MASK_SIZE) == 0 || (s&MASK_SIZE) == 0)
					return ((m&MASK_SIZE) >= (s&MASK_SIZE) && ((s&MASK_ALLOW)&(m&MASK_ALLOW)) != 0); //has equal or bigger size and at least same modes
				else
					return ((m&MASK_SIZE) == (s&MASK_SIZE) && ((s&MASK_ALLOW)&(m&MASK_ALLOW)) != 0);
			}
		}else {
			if(isType(sub)) return false;
			return main.equalsIgnoreCase(sub);
		}
	}
	
	public static long parseNumber(String input) throws Exception {
		char last = input.charAt(input.length()-1);
		int offset = (input.charAt(0) == '-' ||  input.charAt(0) == '+')?1:0;
		if(input.length() > 1 && input.charAt(0+offset) == '0' && (input.charAt(1+offset) == 'x' || input.charAt(1+offset) == 'X')) {
			return Long.parseLong((offset>0?input.charAt(0):"")+input.substring(2+offset),16);
		}else if(last == 'h' || last == 'H') {
			return Long.parseLong(input.substring(0, input.length()-1),16);
		}else if(last == 'b' || last == 'B') {
			return Long.parseLong(input.substring(0, input.length()-1),2);
		}else if(last == 'o' || last == 'O') {
			return Long.parseLong(input.substring(0, input.length()-1),8);
		}else
			return Long.parseLong(input, 10);
	}
	
	public String outputNumber(long value) {
		return "0x"+Long.toHexString(value);
	}
	
	//formating memory reference expressions (f.e. "PTR BYTE [EBX*4+ECX-7]"), results in byte stream (first byte must be  MOD-RM byte)
	public byte[] formatExpression(String input) {
		if(input.contains(" ")) {
			String keyword = input.substring(0, input.indexOf(" "));
			if(keyword.equalsIgnoreCase("PTR")) {
				keyword = input.substring(4, input.length()).trim();
				keyword = keyword.substring(0, keyword.indexOf(" "));
			}
		}
		while(input.indexOf(" ") != -1)
			input = input.substring(input.indexOf(" ")+1);
		input = input.substring(1, input.length()-1);	
		
		ArrayList<String> parts = new ArrayList<String>();
		String current = "";
		for(char c:input.toCharArray()) {
			if((c == '+' || c == '-') && current.length()!=0) {
				parts.add(current);
				current = "";
				if(c == '-')
					current = "-"+current;
			}else
				current = current + c;
		}parts.add(current);
		int displacement = 0;
		String register1 = null;
		String register2 = null;
		int multiply = 0;
		for(String p:parts) {
			boolean found = false;		
			if(!found) {
				try {
					displacement = (int) (displacement + parseNumber(p));
					found = true;
				}catch(Exception e){}
			}
			if(!found && Register.getRegister(p)!=null) {
				if(register1 == null) register1 = p;
				else if(register2 == null) register2 = p;
				else if(DEBUG) System.err.println("Instruction.java@formatExpression: Too many registers referenced ("+p+")");
				found = true;
			}
			if(!found && p.contains("*")) {
				String partA = p.substring(0, p.indexOf('*'));
				String partB = p.substring(p.indexOf('*')+1, p.length());
				if(Register.getRegister(partA)!=null) {
					try {
						if(multiply != 0) if(DEBUG) System.err.println("Instruction.java@formatExpression: Too much multiplication ("+p+")");
						multiply = (int) parseNumber(partB);
						if(register1 == null) register1 = partA;
						else if(register2 == null) {
							String registerT = register1;
							register1 = partA;
							register2 = registerT;
						}
						else if(DEBUG) System.err.println("Instruction.java@formatExpression: Too many registers referenced ("+p+")");
						found = true;
					}catch(Exception e) {}
				}else if(Register.getRegister(partB)!=null){
					try {
						if(multiply != 0) if(DEBUG) System.err.println("Instruction.java@formatExpression: Too much multiplication ("+p+")");
						multiply = (int) parseNumber(partA);
						if(register1 == null) register1 = partB;
						else if(register2 == null) {
							String registerT = register1;
							register1 = partB;
							register2 = registerT;
						}
						else if(DEBUG) System.err.println("Instruction.java@formatExpression: Too many registers referenced ("+p+")");
						found = true;
					}catch(Exception e) {}
				}
			}
			if(!found) if(DEBUG) System.err.println("Instruction.java@formatExpression: Junk expression ("+p+")");
			
		}
		if(register1 != null && Register.getRegister(register1).getEncoded() == Register.ESP.getEncoded()) {
			if(multiply!=0) if(DEBUG)
				 System.err.println("Instruction.java@formatExpression: TRYING TO MULTIPLY ESP (NOT POSSIBLE)");
			String registerT = register2;
			register2 = register1;
			register1 = registerT;
		}
		//MULTIPLY OPTIMISATION
		if(multiply!=0){
			if(multiply>9 || multiply<0) {
				 if(DEBUG)
				 System.err.println("Instruction.java@formatExpression: MULTIPLYING BY ("+multiply+") NOT POSSIBLE");
				 multiply = (multiply%10)&15;
			}
			if(multiply == 6) {
				 if(DEBUG)
				 System.err.println("Instruction.java@formatExpression: MULTIPLYING BY 6");
				 multiply = 5;
			}
			if(multiply == 3) {
				multiply = 2;
				if(register2 != null) if(DEBUG) System.err.println("Instruction.java@formatExpression: MULTIPLYING BY 3 NOT POSSIBLE WITH 2 REGISTER");
				else register2 = register1;
			}else if(multiply == 5) {
				multiply = 4;
				if(register2 != null) if(DEBUG) System.err.println("Instruction.java@formatExpression: MULTIPLYING BY 5 NOT POSSIBLE WITH 2 REGISTER");
				else register2 = register1;
			}else if(multiply == 9) {
				multiply = 8;
				if(register2 != null) if(DEBUG) System.err.println("Instruction.java@formatExpression: MULTIPLYING BY 8 NOT POSSIBLE WITH 2 REGISTER");
				else register2 = register1;
			}
		}
		if(register1 != null && register2 == null && multiply == 0) {
			//Normal displacement behavior
			if(displacement == 0 && (Register.getRegister(register1).getEncoded() != Register.EBP.getEncoded())) {
				return new byte[] {(byte)writeMODRM(Register.getRegister(register1).getEncoded(),0,0)};
			}else if(displacement <= 0xFF && displacement >= -0xEF){
				return new byte[] {(byte)writeMODRM(Register.getRegister(register1).getEncoded(),0,1),((byte)(displacement&0xFF))};
			}else if(displacement <= 0xFFFFFFFFL && displacement >= -0xEFFFFFFFL){
				return new byte[] {(byte)writeMODRM(Register.getRegister(register1).getEncoded(),0,2),((byte)((displacement>>>0)&0xFF)),((byte)((displacement>>>8)&0xFF)),((byte)((displacement>>>16)&0xFF)),((byte)((displacement>>24)&0xFF))};
			}else if(DEBUG) System.err.println("Instruction.java@formatExpression: Displacement out of 32bit range ("+displacement+")");
		}else if(register1 == null && register2 == null && multiply == 0) {
			//Only 32bit displacement behavior
			return new byte[] {(byte)writeMODRM(Register.EBP.getEncoded(),0,0),((byte)((displacement)&0xFF)),((byte)((displacement>>>8)&0xFF)),((byte)((displacement>>>16)&0xFF)),((byte)((displacement>>>24)&0xFF))};
		}else if((register2 != null || multiply != 0)) {
			if(multiply == 0) multiply = 1;
			int m = 0;
			if(multiply == 1) m = 0;
			else if(multiply == 2) m = 1;
			else if(multiply == 4) m = 2;
			else if(multiply == 8) m = 3;
			

			if(register1 == null) register1 = Register.ESP.getName();
			if(register2 == null) register2 = Register.EBP.getName();
			if(displacement == 0 && (Register.getRegister(register2).getEncoded() != Register.EBP.getEncoded())) {
				return new byte[] {(byte)writeMODRM(Register.ESP.getEncoded(),0,0),(byte)writeSIB(m,Register.getRegister(register1).getEncoded(),Register.getRegister(register2).getEncoded())};
			}else if(Register.getRegister(register2).getEncoded() == Register.EBP.getEncoded()){
				return new byte[] {(byte)writeMODRM(Register.ESP.getEncoded(),0,0),(byte)writeSIB(m,Register.getRegister(register1).getEncoded(),Register.getRegister(register2).getEncoded()),((byte)((displacement)&0xFF)),((byte)((displacement>>>8)&0xFF)),((byte)((displacement>>>16)&0xFF)),((byte)((displacement>>>24)&0xFF))};
			}else if(displacement <= 0xFF && displacement >= -0xEF){
				return new byte[] {(byte)writeMODRM(Register.ESP.getEncoded(),0,1),(byte)writeSIB(m,Register.getRegister(register1).getEncoded(),Register.getRegister(register2).getEncoded()),((byte)(displacement&0xFF))};
			}else if(displacement <= 0xFFFFFFFFL && displacement >= -0xEFFFFFFFL){
				return new byte[] {(byte)writeMODRM(Register.ESP.getEncoded(),0,2),(byte)writeSIB(m,Register.getRegister(register1).getEncoded(),Register.getRegister(register2).getEncoded()),((byte)((displacement)&0xFF)),((byte)((displacement>>>8)&0xFF)),((byte)((displacement>>>16)&0xFF)),((byte)((displacement>>>24)&0xFF))};
			}else if(DEBUG) System.err.println("Instruction.java@formatExpression: Displacement out of 32bit range ("+displacement+")");
		}
		return null;
	}
	
	public byte[] encodeParameter(String param, String[] input) {
		int[] types = new int[input.length];
		for(int i=0;i<types.length;i++) {
			types[i] = numberfyType(classifyValue(input[i]));
		}
		if(param.startsWith("i")) {
			//Immediate
			int t = numberfyType(param);
			byte[] output = new byte[t&MASK_SIZE];
			for(int i=0;i<types.length;i++) {
				if((types[i]&MASK_ALLOW_IMMEDIATE) != 0) {
					try {
						Long l = parseNumber(input[i]);
						for(int j=0;j<output.length;j++)
							output[j] = (byte) ((l>>>8*j)&0xFF);
					}catch(Exception e) { e.printStackTrace(); }
					break;
				}
			}
			return output;
		}else if(param.startsWith("/")) {
			if((types[0]&MASK_SIZE)==0) types[0] = types[0] | (types[1]&MASK_SIZE);
			if(types.length > 1 && (types[1]&MASK_SIZE)==0) types[1] = types[1] | (types[0]&MASK_SIZE);
			int rm;
			for(rm=0;rm<this.mnemonic_params.length;rm++)
				if(mnemonic_params[rm].contains("m") || mnemonic_params[rm].contains("M"))
					break;
			int nrm = (rm==0)?1:0;
			
			//MOD-RM
				//encode normal
			if((types[rm]&MASK_ALLOW_MEMORY)==0) {
				//Register only addressing
				byte[] output = new byte[1];
				if((types.length > nrm && (types[nrm]&MASK_ALLOW_IMMEDIATE)!=0) || Character.isDigit(param.charAt(1)))
					output[0] = (byte) writeMODRM(Register.getRegister(input[rm]).getEncoded(),Integer.parseInt(param.substring(1)),3);
				else if(types.length > nrm)
					output[0] = (byte) writeMODRM(Register.getRegister(input[rm]).getEncoded(),Register.getRegister(input[nrm]).getEncoded(),3);
				return output;
			}else if((types[rm]&MASK_ALLOW_MEMORY)!=0) {
				//Memory addressing
				byte[] output = formatExpression(input[rm]);
				int regValue = 0;
				if((types.length > nrm && (types[nrm]&MASK_ALLOW_IMMEDIATE)!=0) || Character.isDigit(param.charAt(1)))
					regValue = writeMODRM(0,Integer.parseInt(param.substring(1)),0);
				else if(types.length > nrm)
					regValue = writeMODRM(0,Register.getRegister(input[nrm]).getEncoded(),0);
				output[0] = (byte) (output[0] | regValue);
				return output;
			}else if(DEBUG)
				System.err.println("Instruction.java@encodeParameter: Parser confused ["+types[rm]+","+types[nrm]+"]");
		}
		return null;
	}
	
	public byte[] encode(String parse, boolean strict) {
		String   mnemonics = parse.toLowerCase();
		String   mnemonic = null;
		String[] mnemonic_params = null;
		int iOS = mnemonics.indexOf(' ');
		if(iOS != -1) {
			mnemonic        = mnemonics.substring(0, iOS).trim();
			mnemonic_params = mnemonics.substring(iOS).split(",");
		}else {
			mnemonic = mnemonics.trim();
			mnemonic_params = new String[] {};
		}
		for(int i=0;i<mnemonic_params.length;i++) mnemonic_params[i] = mnemonic_params[i].trim();
		if(this.mnemonic_params.length != mnemonic_params.length) return null;
		if(!this.mnemonic.equals(mnemonic)) return null;
		boolean[] matches = new boolean[mnemonic_params.length];
		for(int i=0;i<mnemonic_params.length;i++)
			matches[i] = includes(this.mnemonic_params[i], mnemonic_params[i], strict);
		boolean match = true;
		for(int i=0;i<matches.length;i++)
			match = match && matches[i];
		if(!match) return null;
		if(DEBUG) {
			StringBuilder matchingFormat = new StringBuilder();
			for(int i=0;i<mnemonic_params.length;i++) {
				int m = numberfyType(this.mnemonic_params[i]);
				int s = isType(mnemonic_params[i])?numberfyType(mnemonic_params[i]):numberfyType(classifyValue(mnemonic_params[i]));
				matchingFormat.append(maskToString(m)+" / "+maskToString(s)+" ; ");
			}
			System.out.println(Arrays.toString(this.mnemonic_params) + " => "+mnemonic + " - "+Arrays.toString(mnemonic_params));
			System.out.println("Matching: "+Arrays.toString(matches)+ " => "+matchingFormat.toString());
		}
		byte[] output = new byte[16];
		int outputIndex = 0;
		if(this.prefix != null) {
			for(int i=0;i<this.prefix.length;i++)
				output[outputIndex+i] = this.prefix[i];
			outputIndex += this.prefix.length;
			}
		for(int i=0;i<this.opcode.length;i++)
			output[outputIndex+i] = this.opcode[i];
		outputIndex += this.opcode.length;
		for(int i=0;i<this.opcode_params.length;i++) {
			byte[] a = encodeParameter(opcode_params[i], mnemonic_params);
			if(a != null) {
				System.arraycopy(a, 0, output, outputIndex, a.length);
			}else {
				if(DEBUG)
				System.err.println("Failed at opcode_parameter "+opcode_params[i]+" in "+toString());
				return null;
			}
			outputIndex = outputIndex + a.length;
		}
		byte[] returnValue = new byte[outputIndex];
		System.arraycopy(output, 0, returnValue, 0, outputIndex);
		return returnValue;
	}
	
	//TODO: Return a parsed instruction object instead of a string
	public String decodeInstruction(byte[] data) {
		String output = "";
		int opFound = 0;
		int opcode_index = 0;
		int mnemonic_index = 0;
		int bytesUnused = data.length;
		int defaultSize = Register.REG32;

		String[] decodedParameter = new String[this.mnemonic_params.length];
		for(int i=0;i<mnemonic_params.length;i++)
			decodedParameter[i] = mnemonic_params[i];
		
		for(int increase=0;increase>=0;increase--)
			if(mnemonic_index < this.mnemonic_params.length)
				for(Register reg01:Register.getRegisters())
					if(mnemonic_params[mnemonic_index].equalsIgnoreCase(reg01.getName())) {
						mnemonic_index++;
						increase++;
						break;
					}
		
		
		boolean prefixFound = false;
		for(int i=0;i<data.length;i++) {
			if(opFound == 0 && data[i] != this.opcode[0]) {
				//TODO: Add a regex list
				//Regex parsing here
				prefixFound = true;
				if((data[i]&0xFF) == 0x66) {
					if(prefix!=null && prefix.length > 0 && prefix[0] != 0x66) return null; //TODO: REPLACE WITH REGEX LIST
					defaultSize = Register.REG16;
					bytesUnused--;
					continue;
				}else if((data[i]&0xFF) == 0x48) {
					if(prefix!=null && prefix.length > 0 &&  prefix[0] != 0x48) return null; //TODO: REPLACE WITH REGEX LIST
					defaultSize = Register.REG64;
					bytesUnused--;
					continue;
				}else {
					return null; //Not regex before opcode or not correct opcode
				}
			}
			if(opFound < this.opcode.length) {
				if(data[i] == opcode[opFound]) {
					opFound++;
					bytesUnused--;
					continue;
				}else {
					return null; //Wrong opcodes
				}
			}
			if(opcode_index < this.opcode_params.length) {
				if(opcode_params[opcode_index].charAt(0)=='/') { // /r or /<0-9>
					boolean mi = (mnemonic_params[mnemonic_index].contains("m") || mnemonic_params[mnemonic_index].contains("M"));
					boolean num = Character.isDigit(opcode_params[opcode_index].charAt(1));
					int mod = (data[i]>>>6)&3;
					int reg = (data[i]>>>3)&7;
					int rm  = data[i]&7;			
					String target = "";
					String source = null;
					if(!num)
						source = Register.getRegister(reg, defaultSize).getName();
					if(mod == 3) { //direct register addressing (ah,ax,eax,rax)
						target = Register.getRegister(rm, defaultSize).getName();
					}else if(rm == 4) { //SIB
						//displacement after SIB
						int scale = (data[i+1]>>>6)&3;
						if(scale == 0)
							scale = 1;
						else if(scale == 1)
							scale = 2;
						else if(scale == 2)
							scale = 4;
						else if(scale == 3)
							scale = 8;
						int index = (data[i+1]>>>3)&7;
						int base  = data[i+1]&7;
						if(mod == 0 && base == 5) {
							long value =  ((int)((((long)(data[i+2]&0xFF)))+(((long)(data[i+3]&0xFF))<<(8*1)) +(((long)(data[i+4]&0xFF))<<(8*2))+(((long)(data[i+5]&0xFF))<<(8*3)))); 
							target = Register.getNameOfType(defaultSize)+" ["+Register.getRegister(index, systemSize).getName();
							if(scale > 1)
								target += "*"+scale;
							target+= (value>=0?"+":"")+outputNumber(value);
							target+="]";
							bytesUnused-=5;
							i+=5;
						}else if(mod == 0) {
							target = Register.getNameOfType(defaultSize)+" ["+Register.getRegister(base, systemSize).getName();
							if(Register.getRegister(index, systemSize).getEncoded() != Register.ESP.getEncoded()) {
								target += "+"+Register.getRegister(index, systemSize).getName();
								if(scale > 1)
									target += "*"+scale;
							}
							target+="]";
							bytesUnused-=1;
							i+=1;
						}else if(mod == 1) {
							long value = ((long)data[i+2]);
							target = Register.getNameOfType(defaultSize)+" ["+Register.getRegister(base, systemSize).getName();
							if(Register.getRegister(index, systemSize).getEncoded() != Register.ESP.getEncoded()) {
								target += "+"+Register.getRegister(index, systemSize).getName();
								if(scale > 1)
									target += "*"+scale;
							}
							target+= (value>=0?"+":"")+outputNumber(value);
							target+="]";
							bytesUnused-=2;
							i+=2;
						}else if(mod == 2) {
							long value =  ((int)((((long)(data[i+2]&0xFF)))+(((long)(data[i+3]&0xFF))<<(8*1)) +(((long)(data[i+4]&0xFF))<<(8*2))+(((long)(data[i+5]&0xFF))<<(8*3)))); 
							target = Register.getNameOfType(defaultSize)+" ["+Register.getRegister(base, systemSize).getName();
							if(Register.getRegister(index, systemSize).getEncoded() != Register.ESP.getEncoded()) {
								target += "+"+Register.getRegister(index, systemSize).getName();
								if(scale > 1)
									target += "*"+scale;
							}
							target+= (value>=0?"+":"")+outputNumber(value);
							target+="]";
							bytesUnused-=5;
							i+=5;
						}
					}else if(mod == 0 && rm == 5){
						long value =  ((int)((((long)(data[i+1]&0xFF)))+(((long)(data[i+2]&0xFF))<<(8*1)) +(((long)(data[i+3]&0xFF))<<(8*2))+(((long)(data[i+4]&0xFF))<<(8*3)))); 
						target = Register.getNameOfType(defaultSize)+" ["+outputNumber(value)+"]";
						bytesUnused-=4;
						i+=4;
					}else if(mod == 0) {
						target = Register.getNameOfType(defaultSize)+" ["+Register.getRegister(rm, systemSize).getName()+"]";
					}else if(mod == 1) {
						long value = ((long)data[i+1]);
						target = Register.getNameOfType(defaultSize)+" ["+Register.getRegister(rm, systemSize).getName()+(value>=0?"+":"")+outputNumber(value)+"]";
						bytesUnused--;
						i+=1;
					}else if(mod == 2) {
						long value =  ((int)((((long)(data[i+1]&0xFF)))+(((long)(data[i+2]&0xFF))<<(8*1)) +(((long)(data[i+3]&0xFF))<<(8*2))+(((long)(data[i+4]&0xFF))<<(8*3)))); 
						target = Register.getNameOfType(defaultSize)+" ["+Register.getRegister(rm, systemSize).getName()+(value>=0?"+":"")+outputNumber(value)+"]";
						bytesUnused-=4;
						i+=4;
					}
					decodedParameter[mnemonic_index+(mi?0:1)] = target;
					if(source!=null)
						decodedParameter[mnemonic_index+(mi?1:0)] = source;	
					bytesUnused--;
					opcode_index++;
					if(num)
						mnemonic_index++;
					else
						mnemonic_index+=2;
				}else if(opcode_params[opcode_index].charAt(0)=='i') {
					if((opcode_params[opcode_index].charAt(1) == 'b' || opcode_params[opcode_index].charAt(1) == 'B') && (data.length-i)>=1) {
						long value = (((long)data[i]&0xFF));
						decodedParameter[mnemonic_index] = outputNumber(value);
						bytesUnused-=1;
						opcode_index++;
						mnemonic_index++;
						i+=0;
					}else if((opcode_params[opcode_index].charAt(1) == 'w' || opcode_params[opcode_index].charAt(1) == 'W') && (data.length-i)>=2) {
						long value = (((long)data[i]&0xFF))+(((long)data[i+1]&0xFF)<<(8*1));
						decodedParameter[mnemonic_index] = outputNumber(value);
						bytesUnused-=2;
						opcode_index++;
						mnemonic_index++;
						i+=1;
					}else if((opcode_params[opcode_index].charAt(1) == 'd' || opcode_params[opcode_index].charAt(1) == 'D') && (data.length-i)>=4) {
						long value = (((long)data[i]&0xFF))+(((long)data[i+1]&0xFF)<<(8*1))+(((long)data[i+2]&0xFF)<<(8*2))+(((long)data[i+3]&0xFF)<<(8*3));
						decodedParameter[mnemonic_index] = outputNumber(value);
						bytesUnused-=4;
						opcode_index++;
						mnemonic_index++;
						i+=3;
					}else if((opcode_params[opcode_index].charAt(1) == 'q' || opcode_params[opcode_index].charAt(1) == 'Q') && (data.length-i)>=8) {
						long value = (((long)data[i]&0xFF))+(((long)data[i+1]&0xFF)<<(8*1))+(((long)data[i+2]&0xFF)<<(8*2))+(((long)data[i+3]&0xFF)<<(8*3))+(((long)data[i+4]&0xFF)<<(8*4))+(((long)data[i+5]&0xFF)<<(8*5))+(((long)data[i+6]&0xFF)<<(8*6))+(((long)data[i+7]&0xFF)<<(8*7));
						decodedParameter[mnemonic_index] = outputNumber(value);
						bytesUnused-=8;
						opcode_index++;
						mnemonic_index++;
						i+=7;
					}
				}
			}
			for(int increase=0;increase>=0;increase--)
				if(mnemonic_index < this.mnemonic_params.length)
					for(Register reg01:Register.getRegisters())
						if(mnemonic_params[mnemonic_index].equalsIgnoreCase(reg01.getName())) {
							mnemonic_index++;
							increase++;
							break;
						}
		}
		
		if(!prefixFound && this.prefix != null)
			return null;
		
		if(opFound == opcode.length && bytesUnused == 0 && opcode_index == this.opcode_params.length && mnemonic_index == this.mnemonic_params.length) {
			output += this.mnemonic + " ";
			for(String dP:decodedParameter)
				output += dP+", ";
			if(output.endsWith(", "))
				output = output.substring(0,output.length()-2);
			if(DEBUG)
				System.out.println(this.toString());
			return output;
		}else
			if(DEBUG) {
				System.out.println("["+(opFound-opcode.length)+"]"+(opFound == opcode.length) +" && [" + bytesUnused +"]"+ (bytesUnused == 0) +" && [" + (opcode_index-this.opcode_params.length) +"]"+ (opcode_index == this.opcode_params.length) +" &&  [" + (mnemonic_index-this.mnemonic_params.length) +"]"+ (mnemonic_index == this.mnemonic_params.length) +" => "+this.toString());
			}
		return null;
	}
	
	public String encodeHexString(String parse) {
		byte[] output = encode(parse, false);
		if(output==null) return null;
		String returnValue = "";
		for(int i=0;i<output.length;i++) {
			String h = Integer.toHexString(output[i]&0xFF);
			if(h.length() == 1) h = "0"+h;
			returnValue=returnValue+h;
		}
		return returnValue;
	}
	
	public static String toHexString(byte[] array) {
		String result = "[";
		for(byte b:array) {
			if(result.length() != 1) {
				result = result +" ,";
			}
			result = result + Integer.toHexString(b&0xFF);
		}
		result = result + "]";
		return result;
	}
	public String toString() {
		return toHexString(this.opcode) + " - "+Arrays.toString(opcode_params) + " = " + mnemonic + " - "+Arrays.toString(mnemonic_params);
	}
}
