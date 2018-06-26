package pusty.f0xC.module.event;

import java.util.ArrayList;

import pusty.f0xC.ContextClass;
import pusty.f0xC.ContextFunction;
import pusty.f0xC.F0xC;
import pusty.f0xC.nodes.Node;

public class F0xEventNodeParsing extends F0xEventParsing {
	
	private Node node;
	private ContextFunction functionContext;
	private ContextClass classContext;
	
	public F0xEventNodeParsing(F0xC fox, ArrayList<String> current, ContextClass classContext, ContextFunction functionContext, Node node) {
		super(fox, current);
		this.node = node;
		this.classContext = classContext;
		this.functionContext = functionContext;
	}
	
	/**
	 * Returns the Node this event is about
	 * @return the node this event is associated with this
	 */
	public Node getGenericNode() {
		return node;
	}
	
	/**
	 * Returns the context this event operates in
	 * @return the class context of the event types associated with this
	 */
	public ContextClass getClassContext() {
		return classContext;
	}

	
	/**
	 * Returns the context this event operates in
	 * @return the function context of the event types associated with this
	 */
	public ContextFunction getFunctionContext() {
		return functionContext;
	}

	
}
