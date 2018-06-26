package pusty.f0xC.module.event;

import java.util.ArrayList;

import pusty.f0xC.ContextClass;
import pusty.f0xC.ContextFunction;
import pusty.f0xC.F0xC;
import pusty.f0xC.nodes.NodeStack;

public class F0xEventNodeStackParsing extends F0xEventNodeParsing {
	
	private int index;
	public F0xEventNodeStackParsing(F0xC fox, ArrayList<String> current, ContextClass classContext, ContextFunction functionContext, NodeStack node, int index) {
		super(fox, current, classContext, functionContext, node);
		this.index = index;
	}
	
	/**
	 * Returns the index this stack operation has (only usable for PUSH and POP)
	 * @return the index this event is associated with (if applicable)
	 */
	public int getIndex() {
		return index;
	}
	
	/**
	 * Returns the Node this event is about
	 * @return the node this event is associated with this
	 */
	public NodeStack getNode() {
		return (NodeStack)getGenericNode();
	}
	
	
}
