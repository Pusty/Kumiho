package pusty.f0xdc.payload;

public class Payload {
	protected byte[] payload;
	public Payload() {

	}
	public int getSize() {
		return payload.length;
	}
	public byte[] getPayload() {
		return payload;
	}
	public void setPayload(byte[] data) {
		payload = data;
	}
	
}
