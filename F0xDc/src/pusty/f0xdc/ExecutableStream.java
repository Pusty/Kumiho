package pusty.f0xdc;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public class ExecutableStream {

	private byte[] inputData;
	private int inputIndex;
	
	public ExecutableStream(InputStream is) {
		try {
			int available = is.available();
			inputData = new byte[available];
			is.read(inputData); //this is fast, wow
		} catch (IOException e) {
			e.printStackTrace();
		}
		inputIndex = 0;
	}
	
	public byte[] getData() {
		return inputData;
	}
	
	public int getSize() {
		return inputData.length;
	}
	
	public void reset() {
		inputIndex = 0;
	}
	
	public int readAddrShort() throws IOException {
		int temp = inputIndex;
		inputIndex=inputIndex+2;
		if(inputIndex > inputData.length) throw new EOFException();
        return temp;
	}
	
	public int readAddrInt() throws IOException {
		int temp = inputIndex;
		inputIndex=inputIndex+4;
		if(inputIndex > inputData.length) throw new EOFException();
        return temp;
	}
	
	
	public int readAddrLong() throws IOException {
		int temp = inputIndex;
		inputIndex=inputIndex+8;
		if(inputIndex > inputData.length) throw new EOFException();
        return temp;
	}
	
	public int readAddrChar() throws IOException {
		int temp = inputIndex;
		inputIndex=inputIndex+2;
		if(inputIndex > inputData.length) throw new EOFException();
        return temp;
	}

	public int readAddrByte() throws IOException {
		int temp = inputIndex;
		inputIndex=inputIndex+1;
		if(inputIndex > inputData.length) throw new EOFException();
        return temp;
	}
	
	public void setIndex(int index) {
		inputIndex = index;
	}
	public int getIndex() {
		return inputIndex;
	}
	public int read() throws IOException {
		int value = inputData[inputIndex]&0xFF;
		inputIndex++;
		if(inputIndex > inputData.length) throw new EOFException();
		return value;
	}
	
	public void write(int v) throws IOException {
		inputData[inputIndex] = (byte) (v&0xFF);
		inputIndex++;
		if(inputIndex > inputData.length) throw new EOFException();
	}
	
	public short getShort(int addr) throws IOException {
		int temp = inputIndex;
		inputIndex = addr;
        int ch1 = read();
        int ch2 = read();
        inputIndex=temp;
        return (short)((ch2 << 8) + (ch1 << 0));
	}
	
    public int getInt(int addr) throws IOException {
		int temp = inputIndex;
		inputIndex = addr;
        int ch1 = read();
        int ch2 = read();
        int ch3 = read();
        int ch4 = read();
        inputIndex=temp;
        return ((ch4 << 24) + (ch3 << 16) + (ch2 << 8) + (ch1 << 0));
    }
    public long getLong(int addr) throws IOException {
		int temp = inputIndex;
		inputIndex = addr;
		long result = 0;
		for(int i=0;i<8;i++)
			result = (result | (((long)read()) << i*8L));
        inputIndex=temp;
        
        return result;
    }
    public char getChar(int addr) throws IOException {
		int temp = inputIndex;
		inputIndex = addr;
        int ch1 = read();
        int ch2 = read();
        inputIndex=temp;
        return (char)((ch2 << 8) + (ch1 << 0));
    }

    public byte getByte(int addr) throws IOException {
		int temp = inputIndex;
		inputIndex = addr;
        int ch = read();
        inputIndex=temp;
        return (byte)(ch);
    }
    
	public String getString(int addr) throws IOException {
		String result = "";
		for(int offset=0;;offset++) {
			byte b = getByte(addr+offset);
			if(b == 0) break;
			result = result + (char)b;
		}
		return result;
	}
	
	public void writeString(String str) throws IOException {
		for(int i=0;i<str.length();i++)
			this.setByte(this.getIndex()+i, (byte)str.charAt(i));
		this.setByte(this.getIndex()+str.length(),(byte) 0);
		this.setIndex(this.getIndex()+str.length()+1);
	}
	
	public String getUnicodeString(int addr) throws IOException {
		String result = "";
		for(int offset=0;;offset=offset+2) {
			short b = getShort(addr+offset);
			if(b == 0) break;
			result = result + (char)b;
		}
		return result;
	}
    
	public void setShort(int addr, int v) throws IOException {
		int temp = inputIndex;
		inputIndex = addr;
		write(v >> 0);
		write(v >> 8);
        inputIndex=temp;
	}
	
    public void setInt(int addr, int v) throws IOException {
		int temp = inputIndex;
		inputIndex = addr;
		write(v >> 0);
		write(v >> 8);
		write(v >> 16);
		write(v >> 24);
        inputIndex=temp;
    }
    
    public void setLong(int addr, long v) throws IOException {
		int temp = inputIndex;
		inputIndex = addr;
		for(int i=0;i<8;i++)
			write((int)(v >> 8*i));
        inputIndex=temp;
    }
    public void setChar(int addr, char v) throws IOException {
		int temp = inputIndex;
		inputIndex = addr;
		write(v >> 0);
		write(v >> 8);
        inputIndex=temp;
    }

    public void setByte(int addr, byte v) throws IOException {
		int temp = inputIndex;
		inputIndex = addr;
		write(v);
        inputIndex=temp;
    }



}
