package pusty.f0xC.x64.modules;

import pusty.f0xC.F0xUtil;
import pusty.f0xC.module.F0xEventSubscription;
import pusty.f0xC.module.F0xEvent.F0xEventPriority;
import pusty.f0xC.module.F0xEvent.F0xEventType;
import pusty.f0xC.module.event.F0xEventNodeCompareParsing;
import pusty.f0xC.module.event.F0xEventNodeConstParsing;
import pusty.f0xC.module.event.F0xEventNodeMathParsing;
import pusty.f0xC.module.event.F0xEventNodeStackParsing;
import pusty.f0xC.module.event.F0xEventNodeVarFixParsing;
import pusty.f0xC.x86.modules.x86ModuleLong;

public class x64ModuleLong extends x86ModuleLong {

	@Override
	public String uniqueIdentifier() {
		return "x64Long";
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeCompareLONGEQUAL, priority=F0xEventPriority.NORMAL)
	public void nodeCOMPARE_EQUAL(F0xEventNodeCompareParsing event) {
		event.getCurrentList().add("xor reg3, reg3");
		event.getCurrentList().add("dec reg3");

		event.getCurrentList().add("xor reg2, reg2");
		event.getCurrentList().add("cmp reg1, reg0");
		event.getCurrentList().add("cmovz reg3, reg2");
		
		event.getCurrentList().add("inc reg2");
		event.getCurrentList().add("cmp reg1, reg0");
		event.getCurrentList().add("cmovl reg3, reg2");
		event.getCurrentList().add("mov reg0, reg3");
	}

	@F0xEventSubscription(event=F0xEventType.ParseNodeConstLONG, priority=F0xEventPriority.NORMAL)
	public void nodeCONST_INT64(F0xEventNodeConstParsing event) {
		long value = (long)event.getNode().getValue();
		if(value == 0) {
			event.getCurrentList().add("xor reg0, reg0");
		}else if(((value>>>32)&0xFFFFFFFFL) != 0) {
			event.getCurrentList().add("mov reg0, 0x"+Long.toHexString((value>>>32)&0xFFFFFFFFL));
			event.getCurrentList().add("mov reg1, 0x"+Long.toHexString(value&0xFFFFFFFFL));
			event.getCurrentList().add("shl reg0, 32");
			event.getCurrentList().add("or reg0, reg1");
		}else {
			event.getCurrentList().add("mov reg0, "+Long.toString(value&0xFFFFFFFFL));
		}
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeMathADDLONG, priority=F0xEventPriority.NORMAL)
	public void nodeADD_LONG(F0xEventNodeMathParsing event) {
		event.getCurrentList().add("add reg0, reg1");
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeMathSUBLONG, priority=F0xEventPriority.NORMAL)
	public void nodeSUB_LONG(F0xEventNodeMathParsing event) {
		event.getCurrentList().add("sub reg0, reg1");
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeMathMULLONG, priority=F0xEventPriority.NORMAL)
	public void nodeMUL_LONG(F0xEventNodeMathParsing event) {
		event.getCurrentList().add("imul reg0, reg1");
	}

	@F0xEventSubscription(event=F0xEventType.ParseNodeMathDIVLONG, priority=F0xEventPriority.NORMAL)
	public void nodeDIV_LONG(F0xEventNodeMathParsing event) {
		event.getCurrentList().add("cqo");
		event.getCurrentList().add("idiv reg1");
		//event.getCurrentList().add("mov reg0, reg0");
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeMathREMLONG, priority=F0xEventPriority.NORMAL)
	public void nodeREM_LONG(F0xEventNodeMathParsing event) {
		event.getCurrentList().add("cqo");
		event.getCurrentList().add("idiv reg1");
		event.getCurrentList().add("mov reg0, reg3");
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeMathNEGLONG, priority=F0xEventPriority.NORMAL)
	public void nodeNEG_LONG(F0xEventNodeMathParsing event) {
		event.getCurrentList().add("neg reg0");
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeMathSHLLONG, priority=F0xEventPriority.NORMAL)
	public void nodeSHL_LONG(F0xEventNodeMathParsing event) {
		event.getCurrentList().add("mov reg2b, reg1b");
		event.getCurrentList().add("shl reg0, reg2b");
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeMathSHRLONG, priority=F0xEventPriority.NORMAL)
	public void nodeSHR_LONG(F0xEventNodeMathParsing event) {
		event.getCurrentList().add("mov reg2b, reg1b");
		event.getCurrentList().add("sar reg0, reg2b");
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeMathUSHRLONG, priority=F0xEventPriority.NORMAL)
	public void nodeUSHR_LONG(F0xEventNodeMathParsing event) {
		event.getCurrentList().add("mov reg2b, reg1b");
		event.getCurrentList().add("shr reg0, reg2b");
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeMathANDLONG, priority=F0xEventPriority.NORMAL)
	public void nodeAND_LONG(F0xEventNodeMathParsing event) {
		event.getCurrentList().add("and reg0, reg1");
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeMathORLONG, priority=F0xEventPriority.NORMAL)
	public void nodeOR_LONG(F0xEventNodeMathParsing event) {
		event.getCurrentList().add("or reg0, reg1");
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeMathXORLONG, priority=F0xEventPriority.NORMAL)
	public void nodeXOR_LONG(F0xEventNodeMathParsing event) {
		event.getCurrentList().add("xor reg0, reg1");
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeStackPUSHLONG, priority=F0xEventPriority.NORMAL)
	public void nodeSTACK_PUSHLONG(F0xEventNodeStackParsing event) {
		if(event.getIndex() == 0) {
			event.getCurrentList().add("push reg0");
		}else {
			event.getCurrentList().add("push reg1");
		}
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeStackPOPLONG, priority=F0xEventPriority.NORMAL)
	public void nodeSTACK_POPLONG(F0xEventNodeStackParsing event) {
		if(event.getIndex() == 0) {
			event.getCurrentList().add("pop  reg0");
		}else {
			event.getCurrentList().add("pop  reg1");
		}
	}
	
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeStackI2L, priority=F0xEventPriority.NORMAL)
	public void nodeI2L(F0xEventNodeStackParsing event) {
		event.getCurrentList().add("cdqe");
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeStackL2I, priority=F0xEventPriority.NORMAL)
	public void nodeL2I(F0xEventNodeStackParsing event) {
		//long to integer => do nothing
	//	event.getCurrentList().add("mov reg0d, reg0d");
	//	event.getCurrentList().add("cdqe");
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeVarFixLocalLoadLONG, priority=F0xEventPriority.NORMAL)
	public void nodeVARFIX_LOCALLOADLONG(F0xEventNodeVarFixParsing event) { x64ModuleInteger.nodeVARFIX_LOCALLOAD(event); }
	
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeVarFixLocalStoreLONG, priority=F0xEventPriority.NORMAL)
	public void nodeVARFIX_LOCALSTORELONG(F0xEventNodeVarFixParsing event) { x64ModuleInteger.nodeVARFIX_LOCALSTORE(event); }
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeVarFixGlobalLoadLONG, priority=F0xEventPriority.NORMAL)
	public void nodeVARFIX_GLOBALLOADLONG(F0xEventNodeVarFixParsing event) { nodeVARFIX_GLOBALLOAD(event); }
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeVarFixGlobalStoreLONG, priority=F0xEventPriority.NORMAL)
	public void nodeVARFIX_GLOBALSTORELONG(F0xEventNodeVarFixParsing event) { nodeVARFIX_GLOBALSTORE(event); }
	
	public static void nodeVARFIX_GLOBALLOAD(F0xEventNodeVarFixParsing event) {
		event.getCurrentList().add("mov reg0, addrname ["+F0xUtil.formatVariable(event.getNode().refferedBy())+"]");
	}
	
	public static void nodeVARFIX_GLOBALSTORE(F0xEventNodeVarFixParsing event) {
		event.getCurrentList().add("mov addrname ["+F0xUtil.formatVariable(event.getNode().refferedBy())+"], reg0");
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeVarFixObjectLoadLONG, priority=F0xEventPriority.NORMAL)
	public void nodeVARFIX_OBJECTLOADLONG(F0xEventNodeVarFixParsing event) {
		int offset = x64ModuleInteger.nodeVARFIX_OBJECTOFFSET(event);
		event.getCurrentList().add("mov reg0, addrname [reg1+"+offset+"]");
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeVarFixObjectStoreLONG, priority=F0xEventPriority.NORMAL)
	public void nodeVARFIX_OBJECTSTORELONG(F0xEventNodeVarFixParsing event) {
		int offset = x64ModuleInteger.nodeVARFIX_OBJECTOFFSET(event);
		event.getCurrentList().add("mov addrname [reg1+"+offset+"], reg0");
	}
	
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeVarFixArrayLoadLONG, priority=F0xEventPriority.NORMAL)
	public void nodeVARFIX_ARRAYLOADLONG(F0xEventNodeVarFixParsing event) {
		x64ModuleInteger.nodeVARFIX_ARRAYLOAD(event);
		event.getCurrentList().add("mov reg0, [reg1]");
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeVarFixArrayStoreLONG, priority=F0xEventPriority.NORMAL)
	public void nodeVARFIX_ARRAYSTORELONG(F0xEventNodeVarFixParsing event) { 
		x64ModuleInteger.nodeVARFIX_ARRAYSTORE(event); 
		event.getCurrentList().add("mov [reg1], reg0");
	}
	
}
