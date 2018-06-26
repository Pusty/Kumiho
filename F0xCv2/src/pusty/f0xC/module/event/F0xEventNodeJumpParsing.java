package pusty.f0xC.module.event;

import java.util.ArrayList;

import pusty.f0xC.ContextClass;
import pusty.f0xC.ContextFunction;
import pusty.f0xC.F0xC;
import pusty.f0xC.nodes.NodeJump;

public class F0xEventNodeJumpParsing extends F0xEventNodeParsing {
	
	public F0xEventNodeJumpParsing(F0xC fox, ArrayList<String> current, ContextClass classContext, ContextFunction functionContext, NodeJump node) {
		super(fox, current, classContext, functionContext, node);
	}
	
	/**
	 * Returns the Node this event is about
	 * @return the node this event is associated with this
	 */
	public NodeJump getNode() {
		return (NodeJump)getGenericNode();
	}
	
	
}
