package pusty.f0xC.module;

public abstract class F0xModule {
	
	private int invokeCount;
	/**
	 * A unique identifier for he given module
	 * @return the unique identifier of the module
	 */
	public abstract String uniqueIdentifier();
	
	public void invokeModule() { invokeCount++; }
	public int  getInvokes() { return invokeCount; }

}
