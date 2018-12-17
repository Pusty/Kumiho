package pusty.f0xC.x86.modules;

import pusty.f0xC.module.F0xEventSubscription;
import pusty.f0xC.module.F0xModule;
import pusty.f0xC.ContextClass;
import pusty.f0xC.ContextFunction;
import pusty.f0xC.F0xUtil;
import pusty.f0xC.lang.Parser;
import pusty.f0xC.module.F0xEvent.F0xEventPriority;
import pusty.f0xC.module.F0xEvent.F0xEventType;
import pusty.f0xC.module.event.F0xEventNodeCompareParsing;
import pusty.f0xC.module.event.F0xEventNodeConstParsing;
import pusty.f0xC.module.event.F0xEventNodeMathParsing;
import pusty.f0xC.module.event.F0xEventNodeStackParsing;
import pusty.f0xC.module.event.F0xEventNodeVarFixParsing;
import pusty.f0xC.module.event.F0xEventParsing;
import pusty.f0xC.x86.StringConfig86;

public class x86ModuleInteger extends F0xModule {

	@Override
	public String uniqueIdentifier() {
		return "x86Integer";
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeCompareINTEQUAL, priority=F0xEventPriority.NORMAL)
	public void nodeCOMPARE_EQUAL(F0xEventNodeCompareParsing event) {
		event.getCurrentList().add("cmp reg0d, reg1d");
	}

	@F0xEventSubscription(event=F0xEventType.ParseNodeConstBYTE, priority=F0xEventPriority.NORMAL)
	public void nodeCONST_INT8(F0xEventNodeConstParsing event) {
		event.getCurrentList().add("mov reg0, "+Integer.toString(((byte)event.getNode().getValue())&0xFF));
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeConstSHORT, priority=F0xEventPriority.NORMAL)
	public void nodeCONST_INT16(F0xEventNodeConstParsing event) {
		event.getCurrentList().add("mov reg0, "+Integer.toString(((short)event.getNode().getValue())&0xFFFF));
	}	
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeConstINT, priority=F0xEventPriority.NORMAL)
	public void nodeCONST_INT32(F0xEventNodeConstParsing event) {
		event.getCurrentList().add("mov reg0, "+Integer.toString((int)event.getNode().getValue()));
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeMathADDINT, priority=F0xEventPriority.NORMAL)
	public void nodeADD_INT(F0xEventNodeMathParsing event) {
		event.getCurrentList().add("add reg0d, reg1d");
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeMathSUBINT, priority=F0xEventPriority.NORMAL)
	public void nodeSUB_INT(F0xEventNodeMathParsing event) {
		event.getCurrentList().add("sub reg0d, reg1d");
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeMathMULINT, priority=F0xEventPriority.NORMAL)
	public void nodeMUL_INT(F0xEventNodeMathParsing event) {
		event.getCurrentList().add("imul reg0d, reg1d");
	}

	@F0xEventSubscription(event=F0xEventType.ParseNodeMathDIVINT, priority=F0xEventPriority.NORMAL)
	public void nodeDIV_INT(F0xEventNodeMathParsing event) {
		//event.getCurrentList().add("mov regA, reg0d");
		event.getCurrentList().add("cdq");
		event.getCurrentList().add("idiv reg1d");
		//event.getCurrentList().add("mov reg0, regAd");
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeMathREMINT, priority=F0xEventPriority.NORMAL)
	public void nodeREM_INT(F0xEventNodeMathParsing event) {
		//event.getCurrentList().add("mov regA, reg0d");
		event.getCurrentList().add("cdq");
		event.getCurrentList().add("idiv reg1d");
		event.getCurrentList().add("mov reg0d, reg3d");
		//event.getCurrentList().add("mov reg0, regEd");
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeMathNEGINT, priority=F0xEventPriority.NORMAL)
	public void nodeNEG_INT(F0xEventNodeMathParsing event) {
		event.getCurrentList().add("neg reg0d");
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeMathSHLINT, priority=F0xEventPriority.NORMAL)
	public void nodeSHL_INT(F0xEventNodeMathParsing event) {
		event.getCurrentList().add("mov regCb, reg1b");
		event.getCurrentList().add("shl reg0d, regCb");
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeMathSHRINT, priority=F0xEventPriority.NORMAL)
	public void nodeSHR_INT(F0xEventNodeMathParsing event) {
		event.getCurrentList().add("mov regCb, reg1b");
		event.getCurrentList().add("sar reg0d, regCb");
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeMathUSHRINT, priority=F0xEventPriority.NORMAL)
	public void nodeUSHR_INT(F0xEventNodeMathParsing event) {
		event.getCurrentList().add("mov regCb, reg1b");
		event.getCurrentList().add("shr reg0d, regCb");
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeMathANDINT, priority=F0xEventPriority.NORMAL)
	public void nodeAND_INT(F0xEventNodeMathParsing event) {
		event.getCurrentList().add("and reg0d, reg1d");
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeMathORINT, priority=F0xEventPriority.NORMAL)
	public void nodeOR_INT(F0xEventNodeMathParsing event) {
		event.getCurrentList().add("or reg0d, reg1d");
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeMathXORINT, priority=F0xEventPriority.NORMAL)
	public void nodeXOR_INT(F0xEventNodeMathParsing event) {
		event.getCurrentList().add("xor reg0d, reg1d");
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeStackPUSHBYTE, priority=F0xEventPriority.NORMAL)
	public void nodeSTACK_PUSHBYTE(F0xEventNodeStackParsing event) {
		event.getCurrentList().add("movsx reg"+event.getIndex()+", reg"+event.getIndex()+"b");
		event.getCurrentList().add("push reg"+event.getIndex());
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeStackPUSHSHORT, priority=F0xEventPriority.NORMAL)
	public void nodeSTACK_PUSHSHORT(F0xEventNodeStackParsing event) {
		event.getCurrentList().add("movsx reg"+event.getIndex()+", reg"+event.getIndex()+"s");
		event.getCurrentList().add("push reg"+event.getIndex());
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeStackPUSHINT, priority=F0xEventPriority.NORMAL)
	public void nodeSTACK_PUSHINT(F0xEventNodeStackParsing event) {
		event.getCurrentList().add("push reg"+event.getIndex());
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeStackPOPBYTE, priority=F0xEventPriority.NORMAL)
	public void nodeSTACK_POPBYTE(F0xEventNodeStackParsing event) {
		event.getCurrentList().add("pop reg"+event.getIndex());
		event.getCurrentList().add("and reg"+event.getIndex()+", 0xFF");
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeStackPOPSHORT, priority=F0xEventPriority.NORMAL)
	public void nodeSTACK_POPSHORT(F0xEventNodeStackParsing event) {
		event.getCurrentList().add("pop reg"+event.getIndex());
		event.getCurrentList().add("and reg"+event.getIndex()+", 0xFFFF");
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeStackPOPINT, priority=F0xEventPriority.NORMAL)
	public void nodeSTACK_POPINT(F0xEventNodeStackParsing event) {
		event.getCurrentList().add("pop reg"+event.getIndex());
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeVarFixGlobalLoadBYTE, priority=F0xEventPriority.NORMAL)
	public void nodeVARFIX_GLOBALLOADBYTE(F0xEventNodeVarFixParsing event) { nodeVARFIX_GLOBALLOAD(event); }
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeVarFixGlobalLoadSHORT, priority=F0xEventPriority.NORMAL)
	public void nodeVARFIX_GLOBALLOADSHORT(F0xEventNodeVarFixParsing event) { nodeVARFIX_GLOBALLOAD(event); }
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeVarFixGlobalLoadINT, priority=F0xEventPriority.NORMAL)
	public void nodeVARFIX_GLOBALLOADINT(F0xEventNodeVarFixParsing event) { nodeVARFIX_GLOBALLOAD(event); }
	
	public static void nodeVARFIX_GLOBALLOAD(F0xEventNodeVarFixParsing event) {
		event.getCurrentList().add("mov reg0, addrname ["+F0xUtil.formatVariable(event.getNode().refferedBy())+"]");
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeVarFixGlobalStoreBYTE, priority=F0xEventPriority.NORMAL)
	public void nodeVARFIX_GLOBALSTOREBYTE(F0xEventNodeVarFixParsing event) { 
		event.getCurrentList().add("mov  ["+F0xUtil.formatVariable(event.getNode().refferedBy())+"], reg0b");
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeVarFixGlobalStoreSHORT, priority=F0xEventPriority.NORMAL)
	public void nodeVARFIX_GLOBALSTORESHORT(F0xEventNodeVarFixParsing event) {
		event.getCurrentList().add("mov  ["+F0xUtil.formatVariable(event.getNode().refferedBy())+"], reg0s");
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeVarFixGlobalStoreINT, priority=F0xEventPriority.NORMAL)
	public void nodeVARFIX_GLOBALSTOREINT(F0xEventNodeVarFixParsing event) {
		event.getCurrentList().add("mov  ["+F0xUtil.formatVariable(event.getNode().refferedBy())+"], reg0d");
	}
	
	public static void nodeVARFIX_GLOBALSTORE(F0xEventNodeVarFixParsing event) {
		event.getCurrentList().add("mov addrname ["+F0xUtil.formatVariable(event.getNode().refferedBy())+"], reg0");
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeVarFixObjectLoadBYTE, priority=F0xEventPriority.NORMAL)
	public void nodeVARFIX_OBJECTLOADBYTE(F0xEventNodeVarFixParsing event) { 
		event.getCurrentList().add("xor reg0, reg0");
		event.getCurrentList().add("mov reg0b, [reg1+"+nodeVARFIX_OBJECTOFFSET(event)+"]");
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeVarFixObjectLoadSHORT, priority=F0xEventPriority.NORMAL)
	public void nodeVARFIX_OBJECTLOADSHORT(F0xEventNodeVarFixParsing event) {
		event.getCurrentList().add("xor reg0, reg0");
		event.getCurrentList().add("mov reg0s, [reg1+"+nodeVARFIX_OBJECTOFFSET(event)+"]");
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeVarFixObjectLoadINT, priority=F0xEventPriority.NORMAL)
	public void nodeVARFIX_OBJECTLOADINT(F0xEventNodeVarFixParsing event) {
		event.getCurrentList().add("xor reg0, reg0");
		event.getCurrentList().add("mov reg0d, [reg1+"+nodeVARFIX_OBJECTOFFSET(event)+"]");
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeVarFixObjectStoreBYTE, priority=F0xEventPriority.NORMAL)
	public void nodeVARFIX_OBJECTSTOREBYTE(F0xEventNodeVarFixParsing event) {
		event.getCurrentList().add("mov [reg1+"+nodeVARFIX_OBJECTOFFSET(event)+"], reg0b");
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeVarFixObjectStoreSHORT, priority=F0xEventPriority.NORMAL)
	public void nodeVARFIX_OBJECTSTORESHORT(F0xEventNodeVarFixParsing event) {
		event.getCurrentList().add("mov [reg1+"+nodeVARFIX_OBJECTOFFSET(event)+"], reg0s");
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeVarFixObjectStoreINT, priority=F0xEventPriority.NORMAL)
	public void nodeVARFIX_OBJECTSTOREINT(F0xEventNodeVarFixParsing event) {
		event.getCurrentList().add("mov [reg1+"+nodeVARFIX_OBJECTOFFSET(event)+"], reg0d");
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeVarFixLocalLoadBYTE, priority=F0xEventPriority.NORMAL)
	public void nodeVARFIX_LOCALLOADBYTE(F0xEventNodeVarFixParsing event) { nodeVARFIX_LOCALLOAD(event); }
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeVarFixLocalLoadSHORT, priority=F0xEventPriority.NORMAL)
	public void nodeVARFIX_LOCALLOADSHORT(F0xEventNodeVarFixParsing event) { nodeVARFIX_LOCALLOAD(event); }
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeVarFixLocalLoadINT, priority=F0xEventPriority.NORMAL)
	public void nodeVARFIX_LOCALLOADINT(F0xEventNodeVarFixParsing event) { nodeVARFIX_LOCALLOAD(event); }
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeVarFixLocalStoreBYTE, priority=F0xEventPriority.NORMAL)
	public void nodeVARFIX_LOCALSTOREBYTE(F0xEventNodeVarFixParsing event) { nodeVARFIX_LOCALSTORE(event); }
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeVarFixLocalStoreSHORT, priority=F0xEventPriority.NORMAL)
	public void nodeVARFIX_LOCALSTORESHORT(F0xEventNodeVarFixParsing event) { nodeVARFIX_LOCALSTORE(event); }
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeVarFixLocalStoreINT, priority=F0xEventPriority.NORMAL)
	public void nodeVARFIX_LOCALSTOREINT(F0xEventNodeVarFixParsing event) { nodeVARFIX_LOCALSTORE(event); }
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeVarFixArrayLoadBYTE, priority=F0xEventPriority.NORMAL)
	public void nodeVARFIX_ARRAYLOADBYTE(F0xEventNodeVarFixParsing event) {
		nodeVARFIX_ARRAYLOAD(event);
		event.getCurrentList().add("xor reg0, reg0");
		event.getCurrentList().add("mov reg0b, [reg1]");
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeVarFixArrayLoadSHORT, priority=F0xEventPriority.NORMAL)
	public void nodeVARFIX_ARRAYLOADSHORT(F0xEventNodeVarFixParsing event) {
		nodeVARFIX_ARRAYLOAD(event); 
		event.getCurrentList().add("xor reg0, reg0");
		event.getCurrentList().add("mov reg0s, [reg1]");
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeVarFixArrayLoadINT, priority=F0xEventPriority.NORMAL)
	public void nodeVARFIX_ARRAYLOADINT(F0xEventNodeVarFixParsing event) {
		nodeVARFIX_ARRAYLOAD(event);
		event.getCurrentList().add("xor reg0, reg0");
		event.getCurrentList().add("mov reg0d, [reg1]");
	}

	@F0xEventSubscription(event=F0xEventType.ParseNodeVarFixArrayStoreBYTE, priority=F0xEventPriority.NORMAL)
	public void nodeVARFIX_ARRAYSTOREBYTE(F0xEventNodeVarFixParsing event) {
		nodeVARFIX_ARRAYSTORE(event); 
		event.getCurrentList().add("mov [reg1], reg0b");
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeVarFixArrayStoreSHORT, priority=F0xEventPriority.NORMAL)
	public void nodeVARFIX_ARRAYSTORESHORT(F0xEventNodeVarFixParsing event) {
		nodeVARFIX_ARRAYSTORE(event); 
		event.getCurrentList().add("mov [reg1], reg0s");
	}
	
	@F0xEventSubscription(event=F0xEventType.ParseNodeVarFixArrayStoreINT, priority=F0xEventPriority.NORMAL)
	public void nodeVARFIX_ARRAYSTOREINT(F0xEventNodeVarFixParsing event) { 
		nodeVARFIX_ARRAYSTORE(event); 
		event.getCurrentList().add("mov [reg1], reg0d");
	}
	
	public static int nodeVARFIX_OBJECTOFFSET(F0xEventNodeVarFixParsing event) {
		String cRef = event.getNode().refferedBy().split("\\.")[0].replace('/', '_');
		ContextClass cClass = event.getF0xC().getClass(cRef);
		if(cClass == null) {
			System.err.println("Error Loading Class '"+cRef+"'");
			return 0;
		}
		String varName = event.getNode().refferedBy().split("\\.")[1];
		if(cClass.getObjectIndex(varName) == -1) {
			System.err.println("Error Loading Variable '"+varName+"' from '"+cRef+"'");
			return 0;
		}
		int offset = cClass.getObjectIndex(varName);
		return offset;
	}
	
	
	public static void nodeVARFIX_LOCALLOAD(F0xEventNodeVarFixParsing event) {
		int index = Integer.parseInt(event.getNode().refferedBy());
		ContextFunction f = event.getFunctionContext();
		Parser parser = event.getF0xC().getParser();
		int parameterSize = f.getParameterSize(parser.getAddressSize());
		if(index >= parameterSize) {
			event.getCurrentList().add("mov reg0, addrname [regB-addrsize*"+(f.getLocalVariableOffset(index-parameterSize, parser.getAddressSize())+1)+"]");
		}else {
			event.getCurrentList().add("mov reg0, addrname [regB+addrsize*"+(parameterSize-index+1)+"]");
		}
	}
	
	public static void nodeVARFIX_LOCALSTORE(F0xEventNodeVarFixParsing event) {
		int index = Integer.parseInt(event.getNode().refferedBy());
		ContextFunction f = event.getFunctionContext();
		Parser parser = event.getF0xC().getParser();
		int parameterSize = f.getParameterSize(parser.getAddressSize());
		if(index >= parameterSize)
			event.getCurrentList().add("mov addrname [regB-addrsize*"+(f.getLocalVariableOffset(index-parameterSize, parser.getAddressSize())+1)+"], reg0");
		else
			event.getCurrentList().add("mov addrname [regB+addrsize*"+(parameterSize-index+1)+"], reg0");
	}
	
	
	public static void nodeVARFIX_ARRAYLOAD(F0xEventNodeVarFixParsing event) {
		int size = F0xUtil.convertedSize(event.getNode().getSize(), event.getF0xC().getParser().getAddressSize());
		
		//reg2 = index
		//reg1 = array obj
		//This is an optional bounds check
		event.getCurrentList().add("call "+F0xUtil.formatFunction("array_checkBounds"));
		
		event.getCurrentList().add("imul reg2, reg2, "+size);
		event.getCurrentList().add("add reg1, reg2");
		event.getCurrentList().add("add reg1, "+ContextClass.arrayOffset(event.getF0xC().getParser().getAddressSize())); //offset of destructor, size and references + index
	}
	
	public static void nodeVARFIX_ARRAYSTORE(F0xEventNodeVarFixParsing event) {
		int size = F0xUtil.convertedSize(event.getNode().getSize(), event.getF0xC().getParser().getAddressSize());
		
		//reg2 = index
		//reg1 = array obj
		//This is an optional bounds check
		event.getCurrentList().add("call "+F0xUtil.formatFunction("array_checkBounds"));
		
		event.getCurrentList().add("imul reg2, reg2, "+size);
		event.getCurrentList().add("add reg1, reg2");
		event.getCurrentList().add("add reg1, "+ContextClass.arrayOffset(event.getF0xC().getParser().getAddressSize())); //offset of destructor, size and references + index
	}
	
	@F0xEventSubscription(event=F0xEventType.Code)
	public void arrayCheck(F0xEventParsing event) {
		event.getCurrentList().add(F0xUtil.formatFunction("array_checkBounds")+":");
		event.getCurrentList().add("cmp reg2d, [reg1+"+ContextClass.arrayLength(event.getF0xC().getParser().getAddressSize())+"]");
		event.getCurrentList().add("jl "+F0xUtil.formatFunction("array_checkBounds_ok"));
		event.getCurrentList().add("push reg1");
		event.getCurrentList().add("push reg2");
		event.getCurrentList().add("call "+F0xUtil.formatFunction(StringConfig86.strInternalOutOfBounds()));
		event.getCurrentList().add("pop reg2");
		event.getCurrentList().add("pop reg1");
		event.getCurrentList().add("ret");
		event.getCurrentList().add(F0xUtil.formatFunction("array_checkBounds_ok")+":");
		event.getCurrentList().add("ret");
	}

}
