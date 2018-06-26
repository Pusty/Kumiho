package pusty.f0xdc.weaver;

import pusty.f0xdc.pe.ExecutableReader;
import pusty.f0xdc.payload.Payload;

public abstract class Weaver {
	protected ExecutableReader reader;
	protected Payload payload;
	public void run(ExecutableReader reader, Payload payload) {
		this.payload = payload;
		this.reader = reader;
	}
	public ExecutableReader getReader() {
		return reader;
	}
	public Payload getPayload() {
		return payload;
	}
}
