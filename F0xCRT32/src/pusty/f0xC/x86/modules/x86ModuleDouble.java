package pusty.f0xC.x86.modules;

import java.util.HashMap;
import java.util.Map.Entry;

import pusty.f0xC.module.F0xEventSubscription;
import pusty.f0xC.module.F0xModule;
import pusty.f0xC.F0xUtil;
import pusty.f0xC.module.F0xEvent.F0xEventPriority;
import pusty.f0xC.module.F0xEvent.F0xEventType;
import pusty.f0xC.module.event.F0xEventNodeCompareParsing;
import pusty.f0xC.module.event.F0xEventNodeConstParsing;
import pusty.f0xC.module.event.F0xEventNodeMathParsing;
import pusty.f0xC.module.event.F0xEventNodeStackParsing;
import pusty.f0xC.module.event.F0xEventNodeVarFixParsing;
import pusty.f0xC.module.event.F0xEventParsing;

public class x86ModuleDouble extends F0xModule {

	@Override
	public String uniqueIdentifier() {
		return "x86Double";
	}
	
	private HashMap<String,Double> doublemap = new HashMap<String,Double>();
	
	public HashMap<String,Double> getDoubleMap() {
		return doublemap;
	}
	
	public void addDoubleVar(double d) {
		doublemap.put(F0xUtil.getDoubleVarName(d), d);
	}
	
	@F0xEventSubscription(event=F0xEventType.Data)
	public void createDoubleTable(F0xEventParsing event) {
		if(getInvokes() == 0) return;
		event.getCurrentList().add("");
		event.getCurrentList().add(";Static Double Map");   
	    for(Entry<String,Double> e:getDoubleMap().entrySet())
	    	event.getCurrentList().add(e.getKey()+": dq "+e.getValue());
	}


	
	@F0xEventSubscription(event=F0xEventType.ParseNodeCompareDOUBLEEQUAL, priority=F0xEventPriority.NORMAL)
	public void nodeCOMPARE_EQUAL(F0xEventNodeCompareParsing event) {
		event.getCurrentList().add("push reg0");
		event.getCurrentList().add("push reg3");
		event.getCurrentList().add("fld qword [regS]");
		event.getCurrentList().add("push reg1");
		event.getCurrentList().add("push reg2");
		event.getCurrentList().add("fld qword [regS]");
		event.getCurrentList().add("mov reg0, -1");
		event.getCurrentList().add("xor reg1, reg1");
		event.getCurrentList().add("mov reg2, 1");
		event.getCurrentList().add("fcomip st0, st1");
		event.getCurrentList().add("cmovc reg0, reg2");
		event.getCurrentList().add("cmovz reg0, reg1");
		event.getCurrentList().add("fstp qword [regS]");
		event.getCurrentList().add("add regS, addrsize*4");
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeConstDOUBLE, priority=F0xEventPriority.NORMAL)
	public void nodeCONST_DOUBLE(F0xEventNodeConstParsing event) {
		double value = ((double)event.getNode().getValue());
		addDoubleVar(value);
		event.getCurrentList().add("mov reg3, addrname ["+F0xUtil.getDoubleVarName(value)+"]");
		event.getCurrentList().add("mov reg0, addrname ["+F0xUtil.getDoubleVarName(value)+"+addrsize]");
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeMathADDDOUBLE, priority=F0xEventPriority.NORMAL)
	public void nodeADD_DOUBLE(F0xEventNodeMathParsing event) {
		event.getCurrentList().add("push reg0");
		event.getCurrentList().add("push reg3");
		event.getCurrentList().add("fld qword [regS]");
		event.getCurrentList().add("push reg1");
		event.getCurrentList().add("push reg2");
		event.getCurrentList().add("fld qword [regS]");
		event.getCurrentList().add("faddp st1, st0");
		event.getCurrentList().add("fstp qword [regS]");
		event.getCurrentList().add("pop reg3");
		event.getCurrentList().add("pop reg0");
		event.getCurrentList().add("add regS, addrsize*2");
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeMathSUBDOUBLE, priority=F0xEventPriority.NORMAL)
	public void nodeSUB_DOUBLE(F0xEventNodeMathParsing event) {
		event.getCurrentList().add("push reg0");
		event.getCurrentList().add("push reg3");
		event.getCurrentList().add("fld qword [regS]");
		event.getCurrentList().add("push reg1");
		event.getCurrentList().add("push reg2");
		event.getCurrentList().add("fld qword [regS]");
		event.getCurrentList().add("fsubp st1, st0");
		event.getCurrentList().add("fstp qword [regS]");
		event.getCurrentList().add("pop reg3");
		event.getCurrentList().add("pop reg0");
		event.getCurrentList().add("add regS, addrsize*2");
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeMathMULDOUBLE, priority=F0xEventPriority.NORMAL)
	public void nodeMUL_DOUBLE(F0xEventNodeMathParsing event) {
		event.getCurrentList().add("push reg0");
		event.getCurrentList().add("push reg3");
		event.getCurrentList().add("fld qword [regS]");
		event.getCurrentList().add("push reg1");
		event.getCurrentList().add("push reg2");
		event.getCurrentList().add("fld qword [regS]");
		event.getCurrentList().add("fmulp st1, st0");
		event.getCurrentList().add("fstp qword [regS]");
		event.getCurrentList().add("pop reg3");
		event.getCurrentList().add("pop reg0");
		event.getCurrentList().add("add regS, addrsize*2");
	}

	@F0xEventSubscription(event=F0xEventType.ParseNodeMathDIVDOUBLE, priority=F0xEventPriority.NORMAL)
	public void nodeDIV_DOUBLE(F0xEventNodeMathParsing event) {
		event.getCurrentList().add("push reg0");
		event.getCurrentList().add("push reg3");
		event.getCurrentList().add("fld qword [regS]");
		event.getCurrentList().add("push reg1");
		event.getCurrentList().add("push reg2");
		event.getCurrentList().add("fld qword [regS]");
		event.getCurrentList().add("fdivp st1, st0");
		event.getCurrentList().add("fstp qword [regS]");
		event.getCurrentList().add("pop reg3");
		event.getCurrentList().add("pop reg0");
		event.getCurrentList().add("add regS, addrsize*2");
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeMathREMDOUBLE, priority=F0xEventPriority.NORMAL)
	public void nodeREM_DOUBLE(F0xEventNodeMathParsing event) {
		event.getCurrentList().add("push reg0");
		event.getCurrentList().add("push reg3");
		event.getCurrentList().add("fld qword [regS]");
		event.getCurrentList().add("push reg1");
		event.getCurrentList().add("push reg2");
		event.getCurrentList().add("fld qword [regS]");
		event.getCurrentList().add("fxch");
		event.getCurrentList().add("fprem");
		event.getCurrentList().add("fabs");
		event.getCurrentList().add("fxch");
		event.getCurrentList().add("fstp qword [regS]");
		event.getCurrentList().add("fstp qword [regS]");
		event.getCurrentList().add("pop reg3");
		event.getCurrentList().add("pop reg0");
		event.getCurrentList().add("add regS, addrsize*2");
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeMathNEGDOUBLE, priority=F0xEventPriority.NORMAL)
	public void nodeNEG_DOUBLE(F0xEventNodeMathParsing event) {
		event.getCurrentList().add("push reg0");
		event.getCurrentList().add("push reg3");
		event.getCurrentList().add("fld  qword [regS]");
		event.getCurrentList().add("fchs");
		event.getCurrentList().add("fstp qword [regS]");
		event.getCurrentList().add("pop reg3");
		event.getCurrentList().add("pop reg0");
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeStackPUSHDOUBLE, priority=F0xEventPriority.NORMAL)
	public void nodeSTACK_PUSHDOUBLE(F0xEventNodeStackParsing event) {
		if(event.getIndex() == 0) {
			event.getCurrentList().add("push reg0");
			event.getCurrentList().add("push reg3");
		}else {
			event.getCurrentList().add("push reg1");
			event.getCurrentList().add("push reg2");
		}
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeStackPOPDOUBLE, priority=F0xEventPriority.NORMAL)
	public void nodeSTACK_POPDOUBLE(F0xEventNodeStackParsing event) {
		if(event.getIndex() == 0) {
			event.getCurrentList().add("pop  reg3");
			event.getCurrentList().add("pop  reg0");
		}else {
			event.getCurrentList().add("pop  reg2");
			event.getCurrentList().add("pop  reg1");
		}
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeStackF2D, priority=F0xEventPriority.NORMAL)
	public void nodeSTACK_F2D(F0xEventNodeStackParsing event) {
		event.getCurrentList().add("push reg3");
		event.getCurrentList().add("push reg0");
		event.getCurrentList().add("fld dword  [regS]");
		event.getCurrentList().add("fstp qword [regS]");
		event.getCurrentList().add("pop reg3");
		event.getCurrentList().add("pop reg0");
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeStackD2F, priority=F0xEventPriority.NORMAL)
	public void nodeSTACK_D2F(F0xEventNodeStackParsing event) {
		event.getCurrentList().add("push reg0");
		event.getCurrentList().add("push reg3");
		event.getCurrentList().add("fld qword  [regS]");
		event.getCurrentList().add("fstp dword [regS]");
		event.getCurrentList().add("pop reg0");
		event.getCurrentList().add("pop reg3");
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeStackL2D, priority=F0xEventPriority.NORMAL)
	public void nodeSTACK_L2D(F0xEventNodeStackParsing event) {
		event.getCurrentList().add("push reg0");
		event.getCurrentList().add("push reg3");
		event.getCurrentList().add("fild qword [regS]");
		event.getCurrentList().add("fstp qword [regS]");
		event.getCurrentList().add("pop reg3");
		event.getCurrentList().add("pop reg0");
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeStackD2L, priority=F0xEventPriority.NORMAL)
	public void nodeSTACK_D2L(F0xEventNodeStackParsing event) {
		event.getCurrentList().add("push reg0");
		event.getCurrentList().add("push reg3");
		event.getCurrentList().add("fld   qword [regS]");
		event.getCurrentList().add("fisttp qword [regS]");
		event.getCurrentList().add("pop reg3");
		event.getCurrentList().add("pop reg0");
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeVarFixLocalLoadDOUBLE, priority=F0xEventPriority.NORMAL)
	public void nodeVARFIX_LOCALLOADDOUBLE(F0xEventNodeVarFixParsing event) { x86ModuleLong.nodeVARFIX_LOCALLOAD(event); }
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeVarFixLocalStoreDOUBLE, priority=F0xEventPriority.NORMAL)
	public void nodeVARFIX_LOCALSTOREDOUBLE(F0xEventNodeVarFixParsing event) { x86ModuleLong.nodeVARFIX_LOCALSTORE(event); }
	
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeVarFixGlobalLoadDOUBLE, priority=F0xEventPriority.NORMAL)
	public void nodeVARFIX_GLOBALLOADDOUBLE(F0xEventNodeVarFixParsing event) { x86ModuleLong.nodeVARFIX_GLOBALLOAD(event); }
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeVarFixGlobalStoreDOUBLE, priority=F0xEventPriority.NORMAL)
	public void nodeVARFIX_GLOBALSTOREDOUBLE(F0xEventNodeVarFixParsing event) { x86ModuleLong.nodeVARFIX_GLOBALSTORE(event); }
	
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeVarFixObjectLoadDOUBLE, priority=F0xEventPriority.NORMAL)
	public void nodeVARFIX_OBJECTLOADDOUBLE(F0xEventNodeVarFixParsing event) {
		int offset = x86ModuleInteger.nodeVARFIX_OBJECTOFFSET(event);
		event.getCurrentList().add("mov reg0, addrname [reg1+"+offset+"+addrsize]");
		event.getCurrentList().add("mov reg3, addrname [reg1+"+offset+"]");
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeVarFixObjectStoreDOUBLE, priority=F0xEventPriority.NORMAL)
	public void nodeVARFIX_OBJECTSTOREDOUBLE(F0xEventNodeVarFixParsing event) {
		int offset = x86ModuleInteger.nodeVARFIX_OBJECTOFFSET(event);
		event.getCurrentList().add("mov addrname [reg1+"+offset+"+addrsize], reg0");
		event.getCurrentList().add("mov addrname [reg1+"+offset+"], reg3");
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeVarFixArrayLoadDOUBLE, priority=F0xEventPriority.NORMAL)
	public void nodeVARFIX_ARRAYLOADDOUBLE(F0xEventNodeVarFixParsing event) {
		x86ModuleInteger.nodeVARFIX_ARRAYLOAD(event);
		event.getCurrentList().add("mov reg3, [reg1]");
		event.getCurrentList().add("mov reg0, [reg1+addrsize]");
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeVarFixArrayStoreDOUBLE, priority=F0xEventPriority.NORMAL)
	public void nodeVARFIX_ARRAYSTOREDOUBLE(F0xEventNodeVarFixParsing event) { 
		x86ModuleInteger.nodeVARFIX_ARRAYSTORE(event); 
		event.getCurrentList().add("mov [reg1], reg3");
		event.getCurrentList().add("mov [reg1+addrsize], reg0");
	}
}
