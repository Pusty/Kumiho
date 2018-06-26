package pusty.f0x86;

import java.io.File;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

//Main class for assembling code
public class Assembler {
	public static class Node {
		protected String line;
		protected int    lineNr;
		public Node(String line, int lineNr) {this.line=line;this.lineNr=lineNr;}
		public byte[] getData() { return new byte[] {}; }
		public String getLine() { return line; }
		public void throwError(String reason) {
			System.err.println("Error@Line "+lineNr+" ("+line+") ["+reason+"]");
		}
		public String toString() {
			return "Generic Node '"+line+"'";
		}
		public int getSize() { return getData().length; }
	}
	public static class NodeLabel extends Node {
		public NodeLabel(String line, int lineNr) {
			super(line, lineNr);
		}
		public String getLabel() {
			return line;
		}
		public boolean isFixed() {
			return false;
		}
		public int getAddress() {
			return 0;
		}
		public String toString() {
			return "Label Node '"+line+"'";
		}
	}
	public static class NodeAddress extends NodeLabel {
		protected int address;
		public NodeAddress(String line, int address) {
			super(line, -1);
			this.address = address;
		}
		public int getAddress() {
			return address;
		}
		public boolean isFixed() {
			return true;
		}
		public String toString() {
			return "Address Node '"+line+"'";
		}
	}
	public static class NodeInst extends Node {
		byte[] data;
		boolean processed;
		public NodeInst(String line, int lineNr) {
			super(line, lineNr);
			data = new byte[] {};
			processed = false;
		}
		public String toString() {
			return "Instruction Node '"+line+"'";
		}
		//Pretty generalized, but there is no relative instruction with more than one parameter
		public boolean isRelative() {
			return !(line.contains(",") || line.contains("["));
		}
		public void assemble(F0x86 fox) { assemble(fox, line); }
		public void assemble(F0x86 fox, String l) {
			processed = true;
			Instruction result = fox.assembleInst(l);
			if(result == null) {
				throwError("Instruction not found");
				processed = false;
				return;
			}
			data = result.encode(l, false);
		}
		public boolean isProcessed() {
			return processed;
		}
		public byte[] getData() { return data; }
		public int getSize() { 
			if(isProcessed())
				return getData().length; 
			return 4; //approximate value if not assembled yet
		}
		
	}
	public static class NodeMacro extends Node {
		protected Assembler assembler;
		public NodeMacro(Assembler asm,String line, int lineNr) {
			super(line, lineNr);
			assembler = asm;
			parse();
		}
		public void parse() {
			throwError("Macro not found");
			//assembler.content.add(new NodeAddress("MessageBoxA", 0x1000));
		}
		public String toString() {
			return "Macro Node '"+line+"'";
		}
		
	}
	protected F0x86 fox;
	protected ArrayList<Node> content;
	public Assembler(F0x86 fox) {
		this.fox = fox;
		content = new ArrayList<Node>();
	}
	
	
	//Adds file to content list in node format
	public void parseFile(File file) {
		try {
			List<String> l = Files.readAllLines(file.toPath(), Charset.defaultCharset());
			String fileContent = "";
			for(String line:l)
				fileContent += line + "\n";
			String[] lines = fileContent.split("\n");		
			for(int i=0;i<lines.length;i++) {
				String line = lines[i].trim();
				line = line.split(";")[0].trim();
				if(line.equals("")) continue;
				if(line.contains(":")) {
					content.add(new NodeLabel(line.split(":")[0].trim(),i));
					if(line.split(":").length == 2)
						content.add(new NodeInst(line.split(":")[1].trim(),i));
					else if(line.split(":").length > 2)
						System.err.println("Error@Line"+i+" at more than one ':'");
					continue;
				}
				if(line.startsWith("#")) {
					content.add(new NodeMacro(this, line.substring(1),i));
					continue;
				}
				content.add(new NodeInst(line,i));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void processNodes(int codeBase) {
		for(Node node:content) {
			if(node instanceof NodeInst) {
				NodeInst nodeI = (NodeInst)node;
				if(containsLabel(nodeI)) {
					//Process Node with guessed values
					nodeI.assemble(fox, calculateLabels(nodeI, codeBase));
				}else {
					nodeI.assemble(fox);
				}
			}
		}
		for(Node node:content) {
			if(node instanceof NodeInst) {
				NodeInst nodeI = (NodeInst)node;
				int sizeBefore = nodeI.getSize();
				if(!nodeI.isProcessed()) continue;
				if(containsLabel(nodeI)) {
					//Process Node with precise values
					nodeI.assemble(fox, calculateLabels(nodeI, codeBase));
				}else {
					nodeI.assemble(fox);
				}
				if(nodeI.getSize() != sizeBefore)
					nodeI.throwError("[Size changed]");
			}
		}
	}
	
	public String calculateLabels(NodeInst node, int base) {
		String line = node.getLine();
		for(Node n:content)
			if(n instanceof NodeLabel && node.getLine().contains(((NodeLabel)n).getLabel())) {
				int node_position = getNodePosition(node) + node.getSize();
				int label_position = getNodePosition(n);
				int value = 0;
				String replace = "";
				
				if(node.isRelative() ) {
					if(((NodeLabel)n).isFixed()) {
						value = ((NodeLabel)n).getAddress();
						replace = "dword [0x"+Integer.toHexString(value)+"]";
					}else {
						value = label_position - node_position;
						if(value < -32767)
							value &= 0xFFFFFFFF;
						else if(value < -127)
							value &= 0xFFFF;
						else if(value < 0)
							value &= 0xFF;
						replace = "0x"+Integer.toHexString(value);
					}
				}else{
					if(((NodeLabel)n).isFixed())
						value = ((NodeLabel)n).getAddress();
					else
						value = label_position + base;
					replace = "0x"+Integer.toHexString(value);
				}
				line = line.replaceAll(((NodeLabel)n).getLabel(), replace);
			}
		return line;
	}
	
	public int getNodePosition(Node node) {
		int offset = 0;
		for(Node n:content) {
			if(n == node)
				return offset;
			offset += n.getSize();
		}
		node.throwError("[Position not found]");
		return 0;
	}
	
	public boolean containsLabel(NodeInst node) {
		for(Node n:content)
			if(n instanceof NodeLabel && node.getLine().contains(((NodeLabel)n).getLabel()))
				return true;
		return false;
	}
	
	
	public int getSize() {
		int size = 0;
		for(Node n:content)
			size += n.getSize();
		return size;
	}
	public byte[] assemble() {
		byte[] data = new byte[getSize()];
		int currentWriting = 0;
		for(Node n:content)
			for(byte b:n.getData())
				data[currentWriting++] = b;
		return data;
	}
	public String hexify() {
		byte[] data = assemble();
		String output = "";
		for(byte d:data) {
			String h = Integer.toHexString(d&0xFF);
			if(h.length() == 1) h = "0"+h;
			output+=h;
		}
		return output;
	}
	
	public String toString() {
		return "Assembler with "+content.size()+" Nodes: "+hexify();
	}
	
}
