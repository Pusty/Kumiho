package pusty.f0xdc.payload;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import pusty.f0xdc.ExecutableStream;

public class EditablePayload extends Payload{
	public EditablePayload(byte[] d) {		
		payload = d;
	}
	public short getShort(int index) {
		try {
			ByteArrayInputStream bais = new ByteArrayInputStream(payload);
			ExecutableStream ex = new ExecutableStream(bais);
			short value = ex.getShort(index);
			bais.close();
			return value;
		} catch (Exception e) {
			e.printStackTrace();
		} return -1;
	}	
	public byte getByte(int index) {
		try {
			ByteArrayInputStream bais = new ByteArrayInputStream(payload);
			ExecutableStream ex = new ExecutableStream(bais);
			byte value = ex.getByte(index);
			bais.close();
			return value;
		} catch (Exception e) {
			e.printStackTrace();
		} return -1;
	}
	public long getLong(int index) {
		try {
			ByteArrayInputStream bais = new ByteArrayInputStream(payload);
			ExecutableStream ex = new ExecutableStream(bais);
			long value = ex.getLong(index);
			bais.close();
			return value;
		} catch (Exception e) {
			e.printStackTrace();
		} return -1;
	}
	public void setByte(int index, byte value) {
		try {
			ByteArrayInputStream bais = new ByteArrayInputStream(payload);
			ExecutableStream ex = new ExecutableStream(bais);
			ex.setByte(index, value);
			bais.close();
			payload = ex.getData();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
	public void setShort(int index, short value) {
		try {
			ByteArrayInputStream bais = new ByteArrayInputStream(payload);
			ExecutableStream ex = new ExecutableStream(bais);
			ex.setShort(index, value);
			bais.close();
			payload = ex.getData();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
	public void setInt(int index, int value) {
		try {
			ByteArrayInputStream bais = new ByteArrayInputStream(payload);
			ExecutableStream ex = new ExecutableStream(bais);
			ex.setInt(index, value);
			bais.close();
			payload = ex.getData();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void setLong(int index, long value) {
		try {
			ByteArrayInputStream bais = new ByteArrayInputStream(payload);
			ExecutableStream ex = new ExecutableStream(bais);
			ex.setLong(index, value);
			bais.close();
			payload = ex.getData();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public int findInt(int find) {
		return findInt(find, 0, payload.length);
	}
	public int findInt(int find,int start, int end) {
		int SEARCHSIZE = 4;
		try {
			ByteArrayInputStream bais = new ByteArrayInputStream(payload);
			ExecutableStream ex = new ExecutableStream(bais);
			for (int i = start; i < end-SEARCHSIZE+1; i++) {
					if(ex.getInt(i)==find) {
						bais.close();
						return i;
					}				
			}
			bais.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1;
	}
	public int findLong(long find) {
		return findLong(find, 0, payload.length);
	}
	public int findLong(long find,int start, int end) {
		int SEARCHSIZE = 8;
		try {
			ByteArrayInputStream bais = new ByteArrayInputStream(payload);
			ExecutableStream ex = new ExecutableStream(bais);
			for (int i = start; i < end-SEARCHSIZE+1; i++) {
					if(ex.getLong(i)==find) {
						bais.close();
						return i;
					}				
			}
			bais.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1;
	}
	public int findShort(short find) {
		return findShort(find, 0, payload.length);
	}
	public int findShort(short find,int start, int end) {
		int SEARCHSIZE = 2;
		try {
			ByteArrayInputStream bais = new ByteArrayInputStream(payload);
			ExecutableStream ex = new ExecutableStream(bais);
			for (int i = start; i < end-SEARCHSIZE+1; i++) {
					if(ex.getShort(i)==find) {
						bais.close();
						return i;
					}				
			}
			bais.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1;
	}
	public int findByte(byte find) {
		return findByte(find, 0, payload.length);
	}
	public int findByte(byte find,int start, int end) {
		int SEARCHSIZE = 1;
		try {
			ByteArrayInputStream bais = new ByteArrayInputStream(payload);
			ExecutableStream ex = new ExecutableStream(bais);
			for (int i = start; i < end-SEARCHSIZE+1; i++) {
					if(ex.getByte(i)==find) {
						bais.close();
						return i;
					}				
			}
			bais.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1;
	}
	public static EditablePayload clone(Payload p) {
		return fromBytes(p.getPayload());
	}
	public static EditablePayload fromFile(File file) {
		try {
			FileInputStream fis = new FileInputStream(file);
			byte[] data = new byte[fis.available()];
			fis.read(data);
			fis.close();
			EditablePayload payload = new EditablePayload(data);
			return payload ;
		} catch (Exception e) {
			e.printStackTrace();
		} return null;
	}
	public static EditablePayload fromBytes(byte[] data) {
		EditablePayload payload = new EditablePayload(data);
		return payload ;

	}
}
