package pusty.f0xC.lang.x86.modules.core;

import pusty.f0xC.ContextFunction;
import pusty.f0xC.lang.Parser;
import pusty.f0xC.module.F0xEventSubscription;
import pusty.f0xC.module.F0xModule;
import pusty.f0xC.module.F0xEvent.F0xEventPriority;
import pusty.f0xC.module.F0xEvent.F0xEventType;
import pusty.f0xC.module.event.F0xEventNodeCompareParsing;
import pusty.f0xC.module.event.F0xEventNodeConstParsing;
import pusty.f0xC.module.event.F0xEventNodeMathParsing;
import pusty.f0xC.module.event.F0xEventNodeStackParsing;
import pusty.f0xC.module.event.F0xEventNodeVarFixParsing;

public class x86ModuleLong extends F0xModule {

	@Override
	public String uniqueIdentifier() {
		return "x86Long";
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeCompareLONGEQUAL, priority=F0xEventPriority.NORMAL)
	public void nodeCOMPARE_EQUAL(F0xEventNodeCompareParsing event) {
		event.getCurrentList().add("push reg3");
		event.getCurrentList().add("push reg0");
		event.getCurrentList().add("fild qword [regS]");
		event.getCurrentList().add("push reg2");
		event.getCurrentList().add("push reg1");
		event.getCurrentList().add("fild qword [regS]");
		event.getCurrentList().add("mov reg0, -1");
		event.getCurrentList().add("xor reg1, reg1");
		event.getCurrentList().add("mov reg2, 1");
		event.getCurrentList().add("fcomip st0, st1");
		event.getCurrentList().add("cmovc reg0, reg2");
		event.getCurrentList().add("cmovz reg0, reg1");
		event.getCurrentList().add("fistp qword [regS]");
		event.getCurrentList().add("add regS, addrsize*4");
	}

	@F0xEventSubscription(event=F0xEventType.ParseNodeConstLONG, priority=F0xEventPriority.NORMAL)
	public void nodeCONST_INT64(F0xEventNodeConstParsing event) {
		long value = (long)event.getNode().getValue();
		event.getCurrentList().add("mov reg0, "+Long.toString(value&0xFFFFFFFFL));
		event.getCurrentList().add("mov reg3, "+Long.toString((value>>32L)&0xFFFFFFFFL));
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeMathADDLONG, priority=F0xEventPriority.NORMAL)
	public void nodeADD_LONG(F0xEventNodeMathParsing event) {
		event.getCurrentList().add("add reg0, reg1");
		event.getCurrentList().add("adc reg3, reg2");
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeMathSUBLONG, priority=F0xEventPriority.NORMAL)
	public void nodeSUB_LONG(F0xEventNodeMathParsing event) {
		event.getCurrentList().add("sub reg0, reg1");
		event.getCurrentList().add("sbb reg3, reg2");
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeMathMULLONG, priority=F0xEventPriority.NORMAL)
	public void nodeMUL_LONG(F0xEventNodeMathParsing event) {
		event.getCurrentList().add("push reg3");
		event.getCurrentList().add("push reg0");
		event.getCurrentList().add("fild qword [regS]");
		event.getCurrentList().add("push reg2");
		event.getCurrentList().add("push reg1");
		event.getCurrentList().add("fild qword [regS]");
		event.getCurrentList().add("fmulp st1, st0");
		event.getCurrentList().add("fistp qword [regS]");
		event.getCurrentList().add("pop reg0");
		event.getCurrentList().add("pop reg3");
		event.getCurrentList().add("add regS, addrsize*2");
	}

	@F0xEventSubscription(event=F0xEventType.ParseNodeMathDIVLONG, priority=F0xEventPriority.NORMAL)
	public void nodeDIV_LONG(F0xEventNodeMathParsing event) {
		event.getCurrentList().add("push reg3");
		event.getCurrentList().add("push reg0");
		event.getCurrentList().add("fild qword [regS]");
		event.getCurrentList().add("push reg2");
		event.getCurrentList().add("push reg1");
		event.getCurrentList().add("fild qword [regS]");
		event.getCurrentList().add("fdivp st1, st0");
		event.getCurrentList().add("fistp qword [regS]");
		event.getCurrentList().add("pop reg0");
		event.getCurrentList().add("pop reg3");
		event.getCurrentList().add("add regS, addrsize*2");
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeMathREMLONG, priority=F0xEventPriority.NORMAL)
	public void nodeREM_LONG(F0xEventNodeMathParsing event) {
		event.getCurrentList().add("push reg3");
		event.getCurrentList().add("push reg0");
		event.getCurrentList().add("fild qword [regS]");
		event.getCurrentList().add("push reg2");
		event.getCurrentList().add("push reg1");
		event.getCurrentList().add("fild qword [regS]");
		event.getCurrentList().add("fxch");
		event.getCurrentList().add("fprem");
		event.getCurrentList().add("fabs");
		event.getCurrentList().add("fxch");
		event.getCurrentList().add("fistp qword [regS]");
		event.getCurrentList().add("fistp qword [regS]");
		event.getCurrentList().add("pop reg0");
		event.getCurrentList().add("pop reg3");
		event.getCurrentList().add("add regS, addrsize*2");
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeMathNEGLONG, priority=F0xEventPriority.NORMAL)
	public void nodeNEG_LONG(F0xEventNodeMathParsing event) {
		event.getCurrentList().add("neg reg0");
		event.getCurrentList().add("adc reg3, 0");
		event.getCurrentList().add("neg reg3"); 
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeMathSHLLONG, priority=F0xEventPriority.NORMAL)
	public void nodeSHL_LONG(F0xEventNodeMathParsing event) {
		event.getCurrentList().add("mov reg2b, reg1b");
		event.getCurrentList().add("shld reg3, reg0, reg2b");
		event.getCurrentList().add("shl reg0, reg2b");
		
		event.getCurrentList().add("xor reg1, reg1");
		event.getCurrentList().add("test reg2b, 0x20");
		event.getCurrentList().add("cmovne reg3, reg0");
		event.getCurrentList().add("cmovne reg0, reg1");     
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeMathSHRLONG, priority=F0xEventPriority.NORMAL)
	public void nodeSHR_LONG(F0xEventNodeMathParsing event) {
		event.getCurrentList().add("mov reg2b, reg1b");
		event.getCurrentList().add("shrd reg0, reg3, reg2b");
		event.getCurrentList().add("sar reg3, reg2b");
		
		event.getCurrentList().add("mov reg1, reg3");
		event.getCurrentList().add("sar reg1, 0x1F");
		event.getCurrentList().add("test reg2b, 0x20");
		event.getCurrentList().add("cmovne reg0, reg3");
		event.getCurrentList().add("cmovne reg3, reg1");
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeMathUSHRLONG, priority=F0xEventPriority.NORMAL)
	public void nodeUSHR_LONG(F0xEventNodeMathParsing event) {
		event.getCurrentList().add("mov reg2b, reg1b");
		event.getCurrentList().add("shrd reg0, reg3, reg2b");
		event.getCurrentList().add("shr reg3, reg2b");
		
		event.getCurrentList().add("xor reg1, reg1");
		event.getCurrentList().add("test reg2b, 0x20");
		event.getCurrentList().add("cmovne reg0, reg3");
		event.getCurrentList().add("cmovne reg3, reg1");
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeMathANDLONG, priority=F0xEventPriority.NORMAL)
	public void nodeAND_LONG(F0xEventNodeMathParsing event) {
		event.getCurrentList().add("and reg0, reg1");
		event.getCurrentList().add("and reg3, reg2");
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeMathORLONG, priority=F0xEventPriority.NORMAL)
	public void nodeOR_LONG(F0xEventNodeMathParsing event) {
		event.getCurrentList().add("or reg0, reg1");
		event.getCurrentList().add("or reg3, reg2");
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeMathXORLONG, priority=F0xEventPriority.NORMAL)
	public void nodeXOR_LONG(F0xEventNodeMathParsing event) {
		event.getCurrentList().add("xor reg0, reg1");
		event.getCurrentList().add("xor reg3, reg2");
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeStackPUSHLONG, priority=F0xEventPriority.NORMAL)
	public void nodeSTACK_PUSHLONG(F0xEventNodeStackParsing event) {
		if(event.getIndex() == 0) {
			event.getCurrentList().add("push reg0");
			event.getCurrentList().add("push reg3");
		}else {
			event.getCurrentList().add("push reg1");
			event.getCurrentList().add("push reg2");
		}
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeStackPOPLONG, priority=F0xEventPriority.NORMAL)
	public void nodeSTACK_POPLONG(F0xEventNodeStackParsing event) {
		if(event.getIndex() == 0) {
			event.getCurrentList().add("pop  reg3");
			event.getCurrentList().add("pop  reg0");
		}else {
			event.getCurrentList().add("pop  reg2");
			event.getCurrentList().add("pop  reg1");
		}
	}
	
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeStackI2L, priority=F0xEventPriority.NORMAL)
	public void nodeI2L(F0xEventNodeStackParsing event) {
		event.getCurrentList().add("xor reg3, reg3");
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeStackL2I, priority=F0xEventPriority.NORMAL)
	public void nodeL2I(F0xEventNodeStackParsing event) {
		//long to integer => do nothing
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeVarFixLocalLoadLONG, priority=F0xEventPriority.NORMAL)
	public void nodeVARFIX_LOCALLOADLONG(F0xEventNodeVarFixParsing event) { nodeVARFIX_LOCALLOAD(event); }
	
	public static void nodeVARFIX_LOCALLOAD(F0xEventNodeVarFixParsing event) {
		int index = Integer.parseInt(event.getNode().refferedBy());
		ContextFunction f = event.getFunctionContext();
		Parser parser = event.getF0xC().getParser();
		int parameterSize = f.getParameterSize(parser.getAddressSize());
		if(index >= parameterSize) {
			event.getCurrentList().add("mov reg0, addrname [regB-addrsize*"+(f.getLocalVariableOffset(index-parameterSize, parser.getAddressSize())+1)+"]");
			event.getCurrentList().add("mov reg3, addrname [regB-addrsize*"+(f.getLocalVariableOffset(index-parameterSize, parser.getAddressSize())+1+1)+"]");
		}else {
			event.getCurrentList().add("mov reg0, addrname [regB+addrsize*"+(parameterSize-index+1)+"]");
			event.getCurrentList().add("mov reg3, addrname [regB+addrsize*"+(parameterSize-index+1-1)+"]");
		}
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeVarFixLocalStoreLONG, priority=F0xEventPriority.NORMAL)
	public void nodeVARFIX_LOCALSTORELONG(F0xEventNodeVarFixParsing event) { nodeVARFIX_LOCALSTORE(event); }
	
	public static void nodeVARFIX_LOCALSTORE(F0xEventNodeVarFixParsing event) {
		int index = Integer.parseInt(event.getNode().refferedBy());
		ContextFunction f = event.getFunctionContext();
		Parser parser = event.getF0xC().getParser();
		int parameterSize = f.getParameterSize(parser.getAddressSize());
		if(index >= parameterSize) {
			event.getCurrentList().add("mov addrname [regB-addrsize*"+(f.getLocalVariableOffset(index-parameterSize, parser.getAddressSize())+1)+"], reg0");
			event.getCurrentList().add("mov addrname [regB-addrsize*"+(f.getLocalVariableOffset(index-parameterSize, parser.getAddressSize())+1+1)+"], reg3");
		}else {
			event.getCurrentList().add("mov addrname [regB+addrsize*"+(parameterSize-index+1)+"], reg0");
			event.getCurrentList().add("mov addrname [regB+addrsize*"+(parameterSize-index+1-1)+"], reg3");
		}
	}
	@F0xEventSubscription(event=F0xEventType.ParseNodeVarFixGlobalLoadLONG, priority=F0xEventPriority.NORMAL)
	public void nodeVARFIX_GLOBALLOADLONG(F0xEventNodeVarFixParsing event) { nodeVARFIX_GLOBALLOAD(event); }
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeVarFixGlobalStoreLONG, priority=F0xEventPriority.NORMAL)
	public void nodeVARFIX_GLOBALSTORELONG(F0xEventNodeVarFixParsing event) { nodeVARFIX_GLOBALSTORE(event); }
	
	public static void nodeVARFIX_GLOBALLOAD(F0xEventNodeVarFixParsing event) {
		event.getCurrentList().add("mov reg0, addrname ["+x86ModuleInteger.formatVariable(event.getNode().refferedBy())+"+addrsize]");
		event.getCurrentList().add("mov reg3, addrname ["+x86ModuleInteger.formatVariable(event.getNode().refferedBy())+"]");
	}
	
	public static void nodeVARFIX_GLOBALSTORE(F0xEventNodeVarFixParsing event) {
		event.getCurrentList().add("mov addrname ["+x86ModuleInteger.formatVariable(event.getNode().refferedBy())+"+addrsize], reg0");
		event.getCurrentList().add("mov addrname ["+x86ModuleInteger.formatVariable(event.getNode().refferedBy())+"], reg3");
		
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeVarFixObjectLoadLONG, priority=F0xEventPriority.NORMAL)
	public void nodeVARFIX_OBJECTLOADLONG(F0xEventNodeVarFixParsing event) {
		int offset = x86ModuleInteger.nodeVARFIX_OBJECTOFFSET(event);
		event.getCurrentList().add("mov reg0, addrname [reg1+"+offset+"+addrsize]");
		event.getCurrentList().add("mov reg3, addrname [reg1+"+offset+"]");
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeVarFixObjectStoreLONG, priority=F0xEventPriority.NORMAL)
	public void nodeVARFIX_OBJECTSTORELONG(F0xEventNodeVarFixParsing event) {
		int offset = x86ModuleInteger.nodeVARFIX_OBJECTOFFSET(event);
		event.getCurrentList().add("mov addrname [reg1+"+offset+"+addrsize], reg0");
		event.getCurrentList().add("mov addrname [reg1+"+offset+"], reg3");
	}
	
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeVarFixArrayLoadLONG, priority=F0xEventPriority.NORMAL)
	public void nodeVARFIX_ARRAYLOADLONG(F0xEventNodeVarFixParsing event) {
		x86ModuleInteger.nodeVARFIX_ARRAYLOAD(event);
		event.getCurrentList().add("mov reg3, [reg1]");
		event.getCurrentList().add("mov reg0, [reg1+addrsize]");
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeVarFixArrayStoreLONG, priority=F0xEventPriority.NORMAL)
	public void nodeVARFIX_ARRAYSTORELONG(F0xEventNodeVarFixParsing event) { 
		x86ModuleInteger.nodeVARFIX_ARRAYSTORE(event); 
		event.getCurrentList().add("mov [reg1], reg3");
		event.getCurrentList().add("mov [reg1+addrsize], reg0");
	}
	
}
