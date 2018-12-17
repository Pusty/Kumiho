package pusty.f0xC.x64.modules;

import pusty.f0xC.module.F0xEventSubscription;
import pusty.f0xC.F0xUtil;
import pusty.f0xC.module.F0xEvent.F0xEventPriority;
import pusty.f0xC.module.F0xEvent.F0xEventType;
import pusty.f0xC.module.event.F0xEventNodeCompareParsing;
import pusty.f0xC.module.event.F0xEventNodeConstParsing;
import pusty.f0xC.module.event.F0xEventNodeMathParsing;
import pusty.f0xC.module.event.F0xEventNodeStackParsing;
import pusty.f0xC.module.event.F0xEventNodeVarFixParsing;
import pusty.f0xC.x86.modules.x86ModuleFloat;

public class x64ModuleFloat extends x86ModuleFloat {

	@Override
	public String uniqueIdentifier() {
		return "x64Float";
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeCompareFLOATEQUAL, priority=F0xEventPriority.NORMAL)
	public void nodeCOMPARE_EQUAL(F0xEventNodeCompareParsing event) {
		event.getCurrentList().add("push reg0");
		event.getCurrentList().add("fld dword [regS]");
		event.getCurrentList().add("push reg1");
		event.getCurrentList().add("fld dword [regS]");
		event.getCurrentList().add("mov reg0, -1");
		event.getCurrentList().add("xor reg1, reg1");
		event.getCurrentList().add("mov reg2, 1");
		event.getCurrentList().add("fcomip st0, st1");
		event.getCurrentList().add("cmovc reg0, reg2");
		event.getCurrentList().add("cmovz reg0, reg1");
		event.getCurrentList().add("fstp dword [regS]");
		event.getCurrentList().add("pop reg1");
		event.getCurrentList().add("pop reg1");
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeConstFLOAT, priority=F0xEventPriority.NORMAL)
	public void nodeCONST_FLOAT(F0xEventNodeConstParsing event) {
		float value = ((float)event.getNode().getValue());
		addFloatVar(value);
		event.getCurrentList().add("mov reg0, addrname ["+F0xUtil.getFloatVarName(value)+"]");
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeMathADDFLOAT, priority=F0xEventPriority.NORMAL)
	public void nodeADD_FLOAT(F0xEventNodeMathParsing event) {
		event.getCurrentList().add("push reg0");
		event.getCurrentList().add("fld dword [regS]");
		event.getCurrentList().add("push reg1");
		event.getCurrentList().add("fld dword [regS]");
		event.getCurrentList().add("faddp st1, st0");
		event.getCurrentList().add("fstp dword [regS]");
		event.getCurrentList().add("pop reg0");
		event.getCurrentList().add("pop reg3");
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeMathSUBFLOAT, priority=F0xEventPriority.NORMAL)
	public void nodeSUB_FLOAT(F0xEventNodeMathParsing event) {
		event.getCurrentList().add("push reg0");
		event.getCurrentList().add("fld dword [regS]");
		event.getCurrentList().add("push reg1");
		event.getCurrentList().add("fld dword [regS]");
		event.getCurrentList().add("fsubp st1, st0");
		event.getCurrentList().add("fstp dword [regS]");
		event.getCurrentList().add("pop reg0");
		event.getCurrentList().add("pop reg3");
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeMathMULFLOAT, priority=F0xEventPriority.NORMAL)
	public void nodeMUL_FLOAT(F0xEventNodeMathParsing event) {
		event.getCurrentList().add("push reg0");
		event.getCurrentList().add("fld dword [regS]");
		event.getCurrentList().add("push reg1");
		event.getCurrentList().add("fld dword [regS]");
		event.getCurrentList().add("fmulp st1, st0");
		event.getCurrentList().add("fstp dword [regS]");
		event.getCurrentList().add("pop reg0");
		event.getCurrentList().add("pop reg3");
	}

	@F0xEventSubscription(event=F0xEventType.ParseNodeMathDIVFLOAT, priority=F0xEventPriority.NORMAL)
	public void nodeDIV_FLOAT(F0xEventNodeMathParsing event) {
		event.getCurrentList().add("push reg0");
		event.getCurrentList().add("fld dword [regS]");
		event.getCurrentList().add("push reg1");
		event.getCurrentList().add("fld dword [regS]");
		event.getCurrentList().add("fdivp st1, st0");
		event.getCurrentList().add("fstp dword [regS]");
		event.getCurrentList().add("pop reg0");
		event.getCurrentList().add("pop reg3");
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeMathREMFLOAT, priority=F0xEventPriority.NORMAL)
	public void nodeREM_FLOAT(F0xEventNodeMathParsing event) {
		event.getCurrentList().add("push reg0");
		event.getCurrentList().add("fld dword [regS]");
		event.getCurrentList().add("push reg1");
		event.getCurrentList().add("fld dword [regS]");
		event.getCurrentList().add("fxch");
		event.getCurrentList().add("fprem");
		event.getCurrentList().add("fabs");
		event.getCurrentList().add("fxch");
		event.getCurrentList().add("fstp dword [regS]");
		event.getCurrentList().add("fstp dword [regS]");
		event.getCurrentList().add("pop reg0");
		event.getCurrentList().add("pop reg3");
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeMathNEGFLOAT, priority=F0xEventPriority.NORMAL)
	public void nodeNEG_FLOAT(F0xEventNodeMathParsing event) {
		event.getCurrentList().add("push reg0");
		event.getCurrentList().add("fld  dword [regS]");
		event.getCurrentList().add("fchs");
		event.getCurrentList().add("fstp dword [regS]");
		event.getCurrentList().add("pop reg0");
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeStackPUSHFLOAT, priority=F0xEventPriority.NORMAL)
	public void nodeSTACK_PUSHFLOAT(F0xEventNodeStackParsing event) {
		event.getCurrentList().add("push reg"+event.getIndex());
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeStackPOPFLOAT, priority=F0xEventPriority.NORMAL)
	public void nodeSTACK_POPFLOAT(F0xEventNodeStackParsing event) {
		event.getCurrentList().add("pop reg"+event.getIndex());
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeStackF2I, priority=F0xEventPriority.NORMAL)
	public void nodeSTACK_F2I(F0xEventNodeStackParsing event) {
		event.getCurrentList().add("push reg0");
		event.getCurrentList().add("fld   dword [regS]");
		event.getCurrentList().add("fisttp dword [regS]");
		event.getCurrentList().add("pop reg0");
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeStackI2F, priority=F0xEventPriority.NORMAL)
	public void nodeSTACK_I2F(F0xEventNodeStackParsing event) {
		event.getCurrentList().add("push reg0");
		event.getCurrentList().add("fild dword [regS]");
		event.getCurrentList().add("fstp dword [regS]");
		event.getCurrentList().add("pop reg0");
	}
	
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeVarFixLocalLoadFLOAT, priority=F0xEventPriority.NORMAL)
	public void nodeVARFIX_LOCALLOADFLOAT(F0xEventNodeVarFixParsing event) { x64ModuleInteger.nodeVARFIX_LOCALLOAD(event); }
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeVarFixLocalStoreFLOAT, priority=F0xEventPriority.NORMAL)
	public void nodeVARFIX_LOCALSTOREFLOAT(F0xEventNodeVarFixParsing event) { x64ModuleInteger.nodeVARFIX_LOCALSTORE(event); }
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeVarFixGlobalLoadFLOAT, priority=F0xEventPriority.NORMAL)
	public void nodeVARFIX_GLOBALLOADFLOAT(F0xEventNodeVarFixParsing event) { x64ModuleInteger.nodeVARFIX_GLOBALLOAD(event); }
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeVarFixGlobalStoreFLOAT, priority=F0xEventPriority.NORMAL)
	public void nodeVARFIX_GLOBALSTOREFLOAT(F0xEventNodeVarFixParsing event) { x64ModuleInteger.nodeVARFIX_GLOBALSTORE(event); }
	
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeVarFixObjectLoadFLOAT, priority=F0xEventPriority.NORMAL)
	public void nodeVARFIX_OBJECTLOADFLOAT(F0xEventNodeVarFixParsing event) {
		event.getCurrentList().add("mov reg0d, [reg1+"+x64ModuleInteger.nodeVARFIX_OBJECTOFFSET(event)+"]");
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeVarFixObjectStoreFLOAT, priority=F0xEventPriority.NORMAL)
	public void nodeVARFIX_OBJECTSTOREFLOAT(F0xEventNodeVarFixParsing event) {
		event.getCurrentList().add("mov [reg1+"+x64ModuleInteger.nodeVARFIX_OBJECTOFFSET(event)+"], reg0d");
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeVarFixArrayLoadFLOAT, priority=F0xEventPriority.NORMAL)
	public void nodeVARFIX_ARRAYLOADFLOAT(F0xEventNodeVarFixParsing event) {
		x64ModuleInteger.nodeVARFIX_ARRAYLOAD(event);
		event.getCurrentList().add("mov reg0d, [reg1]");
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeVarFixArrayStoreFLOAT, priority=F0xEventPriority.NORMAL)
	public void nodeVARFIX_ARRAYSTOREFLOAT(F0xEventNodeVarFixParsing event) { 
		x64ModuleInteger.nodeVARFIX_ARRAYSTORE(event); 
		event.getCurrentList().add("mov [reg1], reg0d");
	}
}
