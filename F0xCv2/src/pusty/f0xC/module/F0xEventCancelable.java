package pusty.f0xC.module;

import pusty.f0xC.F0xC;

public abstract class F0xEventCancelable extends F0xEvent {
	private F0xEventStatus status;
	
	public F0xEventCancelable(F0xC f0x) {
		super(f0x);
		status = F0xEventStatus.NORMAL;
	}
	
	public void setStatus(F0xEventStatus s) {
		this.status = s;
	}
	
	public void cancel() {
		this.status = F0xEventStatus.CANCELLED;
	}
	
	public F0xEventStatus getStatus() {
		return status;
	}
}
