package pusty.f0xC.module.event;

import java.util.ArrayList;

import pusty.f0xC.ContextClass;
import pusty.f0xC.ContextFunction;
import pusty.f0xC.F0xC;
import pusty.f0xC.nodes.NodeCompare;

public class F0xEventNodeCompareParsing extends F0xEventNodeParsing {
	
	public F0xEventNodeCompareParsing(F0xC fox, ArrayList<String> current, ContextClass classContext, ContextFunction functionContext, NodeCompare node) {
		super(fox, current, classContext, functionContext, node);
	}
	
	/**
	 * Returns the Node this event is about
	 * @return the node this event is associated with this
	 */
	public NodeCompare getNode() {
		return (NodeCompare)getGenericNode();
	}
	
	
}
