package pusty.f0cr.util;

import java.io.DataInputStream;
import java.io.IOException;

public class CountingInputStream  {
	/**
	 * Stream to read from
	 */
	DataInputStream in;
	/**
	 * Index in Bytes
	 */
	int currentIndex;
	public CountingInputStream(DataInputStream in) {
		this.in = in;
		currentIndex = 0;
	}

    public boolean readBoolean() throws IOException {
    	boolean t = in.readBoolean();
    	currentIndex=currentIndex+1;
    	return t;
    }
    
    public byte readByte() throws IOException {
    	byte t = in.readByte();
    	currentIndex=currentIndex+1;
    	return t;
    }
    
    public short readShort() throws IOException {
    	short t = in.readShort();
    	currentIndex=currentIndex+2;
    	return t;
    }
    
    public int readInt() throws IOException {
    	int t = in.readInt();
    	currentIndex=currentIndex+4;
    	return t;
    }
    
    public int available() throws IOException {
    	return in.available();
    }
    
    public int getIndex() {
    	return currentIndex;
    }
    
    public DataInputStream getStream() {
    	return in;
    }
    
    
}
