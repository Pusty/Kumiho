package pusty.f0cr.inst;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;

import pusty.f0cr.ClassReader;
import pusty.f0cr.inst.types.Instruction;
import pusty.f0cr.inst.types.InstructionHandler;

public class InstructionReader {
	protected byte[] data;
	protected Instruction[] instructions;
	protected ClassReader classReader;
	public InstructionReader(ClassReader classReader, byte[] data) throws Exception {
		this.classReader = classReader;
		this.data = data;
		ByteArrayInputStream bis = new ByteArrayInputStream(this.data);
		DataInputStream dis = new DataInputStream(bis);
		read(dis);
		try { bis.close(); }
		catch (IOException e) { e.printStackTrace(); }
	}
	public void read(DataInputStream d) throws Exception {
		ArrayList<Instruction> instructionList = new ArrayList<Instruction>();
		byte b;
		while(d.available()>0) {
			b = d.readByte();
			int v = b&0xFF;
			if(v == Opcodes.LOOKUPSWITCH) {
				//Same as Tableswitch. Needs rework
				//Padding stuff and things.
				//Is kinda buggy, will break if npar1 goes into its 4th byte so this needs reworking
				byte[] data = new byte[8];
				for(int i=0;i<data.length;i++)
					data[i] = d.readByte();
				boolean c = false;
				int index = 0;
				for(int i=0;i<data.length;i++) {
					if(data[i]!=0 && c==false)c=true;
					if(data[i]==0 && c==true){c=false;index=i-1;break;}
				}
				byte[] data2 = new byte[4];
				for(int i=0;i<data2.length;i++) {
					if(index+1+i >= data.length)
						data2[i] = d.readByte();
					else
						data2[i] = data[index+1+i];
				}			
				int amount = (data2[0] << 24) | (data2[1] << 16) | (data2[2] << 8) | data2[3];
				byte[] realData = new byte[8+amount*8];
				for(int i=0;i<4;i++) //Default Branch
					realData[0+i] = data[index-3+i];
				for(int i=0;i<4;i++) //Amount
					realData[4+i] = data2[i];		
				for(int i=0;i<amount*8;i++)
					realData[8+i]=d.readByte();
				instructionList.add(new Instruction(b, realData));				
			}else if(v == Opcodes.TABLESWITCH) {
				//Padding stuff and things.
				//Is kinda buggy, will break if npar1 goes into its 4th byte so this needs reworking
				byte[] data = new byte[8];
				for(int i=0;i<data.length;i++)
					data[i] = d.readByte();
				boolean c = false;
				int index = 0;
				for(int i=0;i<data.length;i++) {
					if(data[i]!=0 && c==false)c=true;
					if(data[i]==0 && c==true){c=false;index=i-1;break;}
				}
				byte[] data2 = new byte[4];
				for(int i=0;i<data2.length;i++) {
					if(index+1+i >= data.length)
						data2[i] = d.readByte();
					else
						data2[i] = data[index+1+i];
				}			
				int start = (data2[0] << 24) | (data2[1] << 16) | (data2[2] << 8) | data2[3];
				byte[] data3 = new byte[4];
				for(int i=0;i<4;i++)
					data3[i] = d.readByte();
				int end = (data3[0] << 24) | (data3[1] << 16) | (data3[2] << 8) | data3[3];
				byte[] realData = new byte[12+(end-start+1)*4];
				for(int i=0;i<4;i++) //Default Branch
					realData[0+i] = data[index-3+i];
				for(int i=0;i<4;i++) //Start
					realData[4+i] = data2[i];
				for(int i=0;i<4;i++) //Start
					realData[8+i] = data3[i];			
				for(int i=0;i<(end-start+1)*4;i++)
					realData[12+i]=d.readByte();
				instructionList.add(new Instruction(b, realData));
			}else if(v == Opcodes.WIDE) {
				
				byte inst = d.readByte();
				if(inst  == Opcodes.IINC) {
					byte[] data = new byte[5];
					instructionList.add(new Instruction(b, data));
				}else {
					byte[] data = new byte[3];
					instructionList.add(new Instruction(b, data));
				}
			}else {
				int dataSize = Opcodes.getSize(b);
				byte[] data = new byte[dataSize];
				for(int i=0;i<dataSize;i++)
					data[i] = d.readByte();
				instructionList.add(InstructionHandler.createInstruction(classReader.getPool(), b, data));
			}
		}
		instructions = instructionList.toArray(new Instruction[instructionList.size()]);
	}
	public byte[] getData() { return data; }
	public Instruction[] getInstructions() { return instructions; }
	public String toString() {
		String output = "";
		for(int i=0;i<instructions.length;i++) {
			String line = Opcodes.getName(instructions[i].getInstruction())+" ";
			line = line + Opcodes.formatData(classReader.getPool(), instructions[i].getInstruction(), instructions[i].getData());
			output = output + line + "\n";
		}
		return output;
	}
	
	public void printOut(String pre) {
		for(int li=0;li<getInstructions().length;li++) {
			Instruction l = getInstructions()[li];
			System.out.println(pre+l.getClass()+": "+l.getName()+" >> "+l.toString());
		}
	}
}
