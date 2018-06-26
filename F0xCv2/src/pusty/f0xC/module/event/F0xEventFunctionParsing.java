package pusty.f0xC.module.event;

import java.util.ArrayList;

import pusty.f0xC.ContextFunction;
import pusty.f0xC.F0xC;

public class F0xEventFunctionParsing extends F0xEventParsing {
	
	private ContextFunction functionContext;
	
	public F0xEventFunctionParsing(F0xC fox, ArrayList<String> current, ContextFunction functionContext) {
		super(fox, current);
		this.functionContext = functionContext;
	}
	
	/**
	 * Returns the context this event operates in
	 * @return the function context of the event types associated with this
	 */
	public ContextFunction getFunctionContext() {
		return functionContext;
	}

	
}
