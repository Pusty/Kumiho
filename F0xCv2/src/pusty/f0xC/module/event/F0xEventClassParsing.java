package pusty.f0xC.module.event;

import java.util.ArrayList;

import pusty.f0xC.ContextClass;
import pusty.f0xC.F0xC;

public class F0xEventClassParsing extends F0xEventParsing {
	
	private ContextClass classContext;
	
	public F0xEventClassParsing(F0xC fox, ArrayList<String> current, ContextClass classContext) {
		super(fox, current);
		this.classContext = classContext;
	}
	
	/**
	 * Returns the context this event operates in
	 * @return the class context of the event types associated with this
	 */
	public ContextClass getClassContext() {
		return classContext;
	}

	
}
