package pusty.f0cr.inst;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

import pusty.f0cr.ClassReader;
import pusty.f0cr.inst.types.Instruction;
import pusty.f0cr.inst.types.InstructionHandler;
import pusty.f0cr.util.CountingInputStream;

public class InstructionReader {
	protected byte[] data;
	protected HashMap<Integer, Instruction> instructionHash;
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
	public void read(DataInputStream dis) throws Exception {
		instructionHash = new HashMap<Integer, Instruction>();
		CountingInputStream d = new CountingInputStream(dis);
		byte b;
		int indexOfInst;
		while(d.available()>0) {
			indexOfInst = d.getIndex();
			b = d.readByte();
			int v = b&0xFF;
			if(v == Opcodes.LOOKUPSWITCH) {
				if((indexOfInst+1)%4 != 0)
					for(int t=0;t<4-((indexOfInst+1)%4);t++) //PADDING
						d.readByte();			
				byte[] data = new byte[8];
				for(int i=0;i<data.length;i++)
					data[i] = d.readByte();
				int amount = InstructionHandler.readInt(data, 4);
				///((data[4]&0xFF) << 24) + ((data[5]&0xFF) << 16) + ((data[6]&0xFF) << 8) + (data[7]&0xFF);
				byte[] realData = new byte[8+amount*8];
				for(int i=0;i<4;i++) //Default Branch
					realData[0+i] = data[i];
				for(int i=0;i<4;i++) //Amount
					realData[4+i] = data[4+i];		
				for(int i=0;i<amount*8;i++)
					realData[8+i]=d.readByte();
				instructionHash.put(indexOfInst, InstructionHandler.createInstruction(this, b, realData));
			}else if(v == Opcodes.TABLESWITCH) {
				//Padding
				if((indexOfInst+1)%4 != 0)
					for(int t=0;t<4-((indexOfInst+1)%4);t++) //PADDING
						d.readByte();
				byte[] data = new byte[12];
				for(int i=0;i<data.length;i++)
					data[i] = d.readByte();
			
				int start = InstructionHandler.readInt(data, 4);
				//(((data[4]&0xFF) << 24) | ((data[5]&0xFF) << 16) | ((data[6]&0xFF) << 8) | (data[7]&0xFF));
				int end   = InstructionHandler.readInt(data, 8);
				//(((data[8]&0xFF) << 24) | ((data[9]&0xFF) << 16) | ((data[10]&0xFF) << 8) | (data[11]&0xFF));
				byte[] realData = new byte[12+(end-start+1)*4];
				for(int i=0;i<4;i++) //Default Branch
					realData[0+i] = data[i];
				for(int i=0;i<4;i++) //Minimum
					realData[4+i] = data[4+i];
				for(int i=0;i<4;i++) //Maximum
					realData[8+i] = data[8+i];			
				for(int i=0;i<(end-start+1)*4;i++)
					realData[12+i]=d.readByte();
				instructionHash.put(indexOfInst, InstructionHandler.createInstruction(this, b, realData));
			}else if(v == Opcodes.WIDE) {
				
				byte inst = d.readByte();
				System.err.println("WIDE isn't properly implemented yet");
				if(inst  == Opcodes.IINC) {
					byte[] data = new byte[5];
					data[0] = d.readByte();
					for(int i=0;i<4;i++)
						data[1+i] = d.readByte();
					instructionHash.put(indexOfInst, InstructionHandler.createInstruction(this, b, data));
				}else {
					byte[] data = new byte[3];
					data[0] = d.readByte();
					for(int i=0;i<3;i++)
						data[1+i] = d.readByte();
					instructionHash.put(indexOfInst, InstructionHandler.createInstruction(this, b, data));
				}
			}else {
				int dataSize = Opcodes.getSize(b);
				byte[] data = new byte[dataSize];
				for(int i=0;i<dataSize;i++)
					data[i] = d.readByte();
				instructionHash.put(indexOfInst, InstructionHandler.createInstruction(this, b, data));
			}
		}
	}
	
	public ClassReader getReader() { return classReader; }
	public byte[] getData() { return data; }
	/**
	 * Outputs an array of instructions
	 * @return returns array of instructions for legacy reasons
	 */
	@Deprecated
	public Instruction[] getInstructions() { 
		return instructionHash.values().toArray(new Instruction[instructionHash.size()]);
	}
	public HashMap<Integer, Instruction> getInstructionMap() {
		return instructionHash;
	}
	public String toString() {
		String output = "";
		Integer[] array = instructionHash.keySet().toArray(new Integer[instructionHash.size()]);
		Arrays.sort(array);
		for(Integer index:array) {
			String line = Opcodes.getName(instructionHash.get(index).getInstruction())+" ";
			line = line + Opcodes.formatData(classReader.getPool(), instructionHash.get(index).getInstruction(),instructionHash.get(index).getData());
			output = output + line + "\n";
		}
		return output;
	}
	
	public void printOut(String pre) {
		Integer[] array = instructionHash.keySet().toArray(new Integer[instructionHash.size()]);
		Arrays.sort(array);
		for(Integer index:array) {
			Instruction l = instructionHash.get(index);
			System.out.println(pre+"["+index+"]"+l.getClass().getSimpleName()+": "+l.getName()+" >> "+l.toString());
		}
	}
	
	public int getPosition(Instruction inst, int off) {
		if(!instructionHash.containsValue(inst)) return 0;
		int pos = 0;
		for(Entry<Integer, Instruction> entry:instructionHash.entrySet()) {
			if(entry.getValue()==inst) {
				pos = entry.getKey();
				break;
			}
		}
		if(!instructionHash.containsKey(pos+off)) {
			try {
				throw new Exception("Couldn't resolve offset position "+pos+"(+"+off+")");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		//	System.err.println("Couldn't resolve offset position "+pos+"(+"+off+")"); return 0;
		}
		return pos+off;
	}
	public Instruction getInstruction(int pos) {
		if(!instructionHash.containsKey(pos)) return null;
		return instructionHash.get(pos);
	}
}
