package pusty.f0xC.lang;

import java.util.ArrayList;
import pusty.f0xC.ContextClass;
import pusty.f0xC.ContextFunction;
import pusty.f0xC.F0xC;
import pusty.f0xC.F0xUtil;
import pusty.f0xC.lang.OverrideHandler.TranslationProperty;
import pusty.f0xC.module.F0xEvent.F0xEventType;
import pusty.f0xC.module.event.F0xEventClassParsing;
import pusty.f0xC.module.event.F0xEventFunctionParsing;
import pusty.f0xC.module.event.F0xEventNodeCompareParsing;
import pusty.f0xC.module.event.F0xEventNodeConstParsing;
import pusty.f0xC.module.event.F0xEventNodeInvokeParsing;
import pusty.f0xC.module.event.F0xEventNodeJumpParsing;
import pusty.f0xC.module.event.F0xEventNodeMathParsing;
import pusty.f0xC.module.event.F0xEventNodeObjectParsing;
import pusty.f0xC.module.event.F0xEventNodeParsing;
import pusty.f0xC.module.event.F0xEventNodeStackParsing;
import pusty.f0xC.module.event.F0xEventNodeVarFixParsing;
import pusty.f0xC.module.event.F0xEventParsing;
import pusty.f0xC.nodes.Node;
import pusty.f0xC.nodes.NodeCompare;
import pusty.f0xC.nodes.NodeConst;
import pusty.f0xC.nodes.NodeCustom;
import pusty.f0xC.nodes.NodeInvoke;
import pusty.f0xC.nodes.NodeJump;
import pusty.f0xC.nodes.NodeLabel;
import pusty.f0xC.nodes.NodeMath;
import pusty.f0xC.nodes.NodeObject;
import pusty.f0xC.nodes.NodeStack;
import pusty.f0xC.nodes.NodeVarFix;

public abstract class Parser {
	public abstract String getLanguageName();
	public void simplify(F0xC fox) {}
	
	public ArrayList<String> parseNode(F0xC fox, ContextClass c, ContextFunction f, Node raw) {
		ArrayList<String> list = new ArrayList<String>();
		if(f.containsProperty(TranslationProperty.NATIVE)) return list;
		fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeGeneric, new F0xEventNodeParsing(fox, list, c, f, raw));
		if(raw instanceof NodeCompare) {
			NodeCompare node = (NodeCompare)raw;
			F0xEventNodeCompareParsing event = new F0xEventNodeCompareParsing(fox, list, c, f, node);
			nodeCompare(fox,node,event);
		}else if(raw instanceof NodeConst) {
			NodeConst node = (NodeConst)raw;
			F0xEventNodeConstParsing event = new F0xEventNodeConstParsing(fox, list, c, f, node);
			nodeConst(fox,node,event);
		}else if(raw instanceof NodeJump) {
			NodeJump node = (NodeJump)raw;
			F0xEventNodeJumpParsing event = new F0xEventNodeJumpParsing(fox, list, c, f, node);
			nodeJump(fox,node,event);
		}else if(raw instanceof NodeMath) {
			NodeMath node = (NodeMath)raw;
			F0xEventNodeMathParsing event = new F0xEventNodeMathParsing(fox, list, c, f, node);
			nodeMath(fox,node,event);
		}else if(raw instanceof NodeInvoke) {
			NodeInvoke node = (NodeInvoke)raw;
			F0xEventNodeInvokeParsing event = new F0xEventNodeInvokeParsing(fox, list, c, f, node);
			nodeInvoke(fox,node,event);
		}else if(raw instanceof NodeStack) {
			NodeStack node = (NodeStack)raw;
			F0xEventNodeStackParsing event = new F0xEventNodeStackParsing(fox, list, c, f, node, nodeStackIndex(node));
			nodeStack(fox,node,event);
		}else if(raw instanceof NodeVarFix) {
			NodeVarFix node = (NodeVarFix)raw;
			F0xEventNodeVarFixParsing event = new F0xEventNodeVarFixParsing(fox, list, c, f, node);
			nodeVarFix(fox,node,event);
		}else if(raw instanceof NodeObject) {
			NodeObject node = (NodeObject)raw;
			F0xEventNodeObjectParsing event = new F0xEventNodeObjectParsing(fox, list, c, f, node);
			nodeObject(fox,node,event);
		}else if(raw instanceof NodeLabel) {
			if(((NodeLabel)raw).getIndex() == -1) {
				//SPECIAL CASE FOR END
				list.add("label_exit:");
			}else {
				list.add("label_"+((NodeLabel)raw).getIndex()+":");
				f.setNodeIndex(((NodeLabel)raw).getIndex());
			}
		}else if(raw instanceof NodeCustom) {
			try {
				((NodeCustom)raw).customMethod().invoke(null, fox, this, list, ((NodeCustom)raw));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	
	public ArrayList<String> startParsing(F0xC fox) {
		ArrayList<String> list = new ArrayList<String>();
		fox.getEventHandler().triggerEvent(F0xEventType.StartParsingCode, new F0xEventParsing(fox, list));
		return list; 
	}
	public ArrayList<String> stopParsing(F0xC fox) {
		ArrayList<String> list = new ArrayList<String>();
		fox.getEventHandler().triggerEvent(F0xEventType.Code, new F0xEventParsing(fox, list));
	    fox.getEventHandler().triggerEvent(F0xEventType.StopParsingCode, new F0xEventParsing(fox, list));
	    fox.getEventHandler().triggerEvent(F0xEventType.StartParsingData, new F0xEventParsing(fox, list));
	    fox.getEventHandler().triggerEvent(F0xEventType.Data, new F0xEventParsing(fox, list));
	    fox.getEventHandler().triggerEvent(F0xEventType.ParseImport, new F0xEventParsing(fox, list));
	    fox.getEventHandler().triggerEvent(F0xEventType.StopParsingData, new F0xEventParsing(fox, list));
		return list; 
	}
	public ArrayList<String> startFunction(F0xC fox, ContextFunction function) {
		ArrayList<String> list = new ArrayList<String>();
		fox.getEventHandler().triggerEvent(F0xEventType.StartParsingFunction, new F0xEventFunctionParsing(fox, list, function));
		return list; 
	}
	public ArrayList<String> stopFunction(F0xC fox, ContextFunction function)  {
		ArrayList<String> list = new ArrayList<String>();
		fox.getEventHandler().triggerEvent(F0xEventType.StopParsingFunction, new F0xEventFunctionParsing(fox, list, function));
		return list; 
	}
	public ArrayList<String> startClass(F0xC fox, ContextClass function) {
		ArrayList<String> list = new ArrayList<String>();
		fox.getEventHandler().triggerEvent(F0xEventType.StartParsingClass, new F0xEventClassParsing(fox, list, function));
		return list; 
	}
	public ArrayList<String> stopClass(F0xC fox, ContextClass function)  {
		ArrayList<String> list = new ArrayList<String>();
		fox.getEventHandler().triggerEvent(F0xEventType.StopParsingClass, new F0xEventClassParsing(fox, list, function));
		return list;
	}
	public int getAddressSize() { return 0; } //Used for computing class and object size
	public OverrideHandler getOverrideHandler() { return null; }
	
	private static int nodeStackIndex(NodeStack node) {
		switch(node.getType()) {
			case NodeStack.PUSH_0: return 0;
			case NodeStack.PUSH_1: return 1;
			case NodeStack.PUSH_2: return 2;
			case NodeStack.PUSH_3: return 3;
			case NodeStack.POP_0: return 0;
			case NodeStack.POP_1: return 1;
			case NodeStack.POP_2: return 2;
			case NodeStack.POP_3: return 3;
		}
		return -1;
	}
	private static void nodeStack(F0xC fox, NodeStack node, F0xEventNodeStackParsing event) {
		switch(node.getType()) {
			case NodeStack.PUSH_0:
			case NodeStack.PUSH_1:
			case NodeStack.PUSH_2:
			case NodeStack.PUSH_3:
				switch(node.getSize()) {
					case Node.INT8:
						fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeStackPUSHBYTE, event);
						break;
					case Node.INT16:
						fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeStackPUSHSHORT, event);
						break;
					case Node.INT32:
						fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeStackPUSHINT, event);
						break;
					case Node.INT64:
						fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeStackPUSHLONG, event);
						break;
					case Node.ADDR:
						fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeStackPUSHADDR, event);
						break;
					case Node.FLOAT:
						fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeStackPUSHFLOAT, event);
						break;
					case Node.DOUBLE:
						fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeStackPUSHDOUBLE, event);
						break;
				}
				fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeStackPUSHGeneric, event);
				break;
			case NodeStack.POP_0:
			case NodeStack.POP_1:
			case NodeStack.POP_2:
			case NodeStack.POP_3:
				switch(node.getSize()) {
					case Node.INT8:
						fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeStackPOPBYTE,  event);
						break;
					case Node.INT16:
						fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeStackPOPSHORT, event);
						break;
					case Node.INT32:
						fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeStackPOPINT,   event);
						break;
					case Node.INT64:
						fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeStackPOPLONG,  event);
						break;
					case Node.ADDR:
						fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeStackPOPADDR,  event);
						break;
					case Node.FLOAT:
						fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeStackPOPFLOAT, event);
						break;
					case Node.DOUBLE:
						fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeStackPOPDOUBLE,event);
						break;
				}
				fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeStackPOPGeneric, event);
				break;
			case NodeStack.D2F:
				fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeStackD2F, event);
				break;
			case NodeStack.D2L:
				fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeStackD2L, event);
				break;
			case NodeStack.F2D:
				fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeStackF2D, event);
				break;
			case NodeStack.F2I:
				fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeStackF2I, event);
				break;
			case NodeStack.I2F:
				fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeStackI2F, event);
				break;
			case NodeStack.I2L:
				fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeStackI2L, event);
				break;
			case NodeStack.L2D:
				fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeStackL2D, event);
				break;
			case NodeStack.L2I:
				fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeStackL2I, event);
				break;
			case NodeStack.THROW:
				fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeStackTHROW, event);
				break;
		}
		fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeStackGeneric, event);
	}
	
	private static void nodeVarFix(F0xC fox, NodeVarFix node, F0xEventNodeVarFixParsing event) {
		switch(node.getScope()) {
			case NodeVarFix.LOCAL:
				if(node.getOpType() == NodeVarFix.LOAD) {
					switch(node.getSize()) {
						case Node.INT8:
							fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeVarFixLocalLoadBYTE, event);
							break;
						case Node.INT16:
							fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeVarFixLocalLoadSHORT, event);
							break;
						case Node.INT32:
							fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeVarFixLocalLoadINT, event);
							break;
						case Node.INT64:
							fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeVarFixLocalLoadLONG, event);
							break;
						case Node.FLOAT:
							fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeVarFixLocalLoadFLOAT, event);
							break;
						case Node.DOUBLE:
							fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeVarFixLocalLoadDOUBLE, event);
							break;
						case Node.ADDR:
							fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeVarFixLocalLoadADDR, event);
							break;
					}
					fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeVarFixLocalLoadGeneric, event);
				}else if(node.getOpType() == NodeVarFix.SAVE) {
					switch(node.getSize()) {
						case Node.INT8:
							fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeVarFixLocalStoreBYTE, event);
							break;
						case Node.INT16:
							fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeVarFixLocalStoreSHORT, event);
							break;
						case Node.INT32:
							fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeVarFixLocalStoreINT, event);
							break;
						case Node.INT64:
							fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeVarFixLocalStoreLONG, event);
							break;
						case Node.FLOAT:
							fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeVarFixLocalStoreFLOAT, event);
							break;
						case Node.DOUBLE:
							fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeVarFixLocalStoreDOUBLE, event);
							break;
						case Node.ADDR:
							fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeVarFixLocalStoreADDR, event);
							break;
					}
					fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeVarFixLocalStoreGeneric, event);
				}
				break;
			case NodeVarFix.GLOBAL:
				if(node.getOpType() == NodeVarFix.LOAD) {
					switch(node.getSize()) {
						case Node.INT8:
							fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeVarFixGlobalLoadBYTE, event);
							break;
						case Node.INT16:
							fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeVarFixGlobalLoadSHORT, event);
							break;
						case Node.INT32:
							fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeVarFixGlobalLoadINT, event);
							break;
						case Node.INT64:
							fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeVarFixGlobalLoadLONG, event);
							break;
						case Node.FLOAT:
							fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeVarFixGlobalLoadFLOAT, event);
							break;
						case Node.DOUBLE:
							fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeVarFixGlobalLoadDOUBLE, event);
							break;
						case Node.ADDR:
							fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeVarFixGlobalLoadADDR, event);
							break;
					}
					fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeVarFixGlobalLoadGeneric, event);
				}else if(node.getOpType() == NodeVarFix.SAVE) {
					switch(node.getSize()) {
						case Node.INT8:
							fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeVarFixGlobalStoreBYTE, event);
							break;
						case Node.INT16:
							fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeVarFixGlobalStoreSHORT, event);
							break;
						case Node.INT32:
							fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeVarFixGlobalStoreINT, event);
							break;
						case Node.INT64:
							fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeVarFixGlobalStoreLONG, event);
							break;
						case Node.FLOAT:
							fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeVarFixGlobalStoreFLOAT, event);
							break;
						case Node.DOUBLE:
							fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeVarFixGlobalStoreDOUBLE, event);
							break;
						case Node.ADDR:
							fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeVarFixGlobalStoreADDR, event);
							break;
					}
					fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeVarFixGlobalStoreGeneric, event);
				}
				break;
			case NodeVarFix.OBJECT:
				if(node.getOpType() == NodeVarFix.LOAD) {
					switch(node.getSize()) {
						case Node.INT8:
							fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeVarFixObjectLoadBYTE, event);
							break;
						case Node.INT16:
							fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeVarFixObjectLoadSHORT, event);
							break;
						case Node.INT32:
							fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeVarFixObjectLoadINT, event);
							break;
						case Node.INT64:
							fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeVarFixObjectLoadLONG, event);
							break;
						case Node.FLOAT:
							fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeVarFixObjectLoadFLOAT, event);
							break;
						case Node.DOUBLE:
							fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeVarFixObjectLoadDOUBLE, event);
							break;
						case Node.ADDR:
							fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeVarFixObjectLoadADDR, event);
							break;
					}
					fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeVarFixObjectLoadGeneric, event);
				}else if(node.getOpType() == NodeVarFix.SAVE) {
					switch(node.getSize()) {
						case Node.INT8:
							fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeVarFixObjectStoreBYTE, event);
							break;
						case Node.INT16:
							fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeVarFixObjectStoreSHORT, event);
							break;
						case Node.INT32:
							fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeVarFixObjectStoreINT, event);
							break;
						case Node.INT64:
							fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeVarFixObjectStoreLONG, event);
							break;
						case Node.FLOAT:
							fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeVarFixObjectStoreFLOAT, event);
							break;
						case Node.DOUBLE:
							fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeVarFixObjectStoreDOUBLE, event);
							break;
						case Node.ADDR:
							fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeVarFixObjectStoreADDR, event);
							break;
					}
					fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeVarFixObjectStoreGeneric, event);
				}
				break;
			case NodeVarFix.ARRAY:
				if(node.getOpType() == NodeVarFix.LOAD) {
					switch(node.getSize()) {
						case Node.INT8:
							fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeVarFixArrayLoadBYTE, event);
							break;
						case Node.INT16:
							fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeVarFixArrayLoadSHORT, event);
							break;
						case Node.INT32:
							fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeVarFixArrayLoadINT, event);
							break;
						case Node.INT64:
							fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeVarFixArrayLoadLONG, event);
							break;
						case Node.FLOAT:
							fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeVarFixArrayLoadFLOAT, event);
							break;
						case Node.DOUBLE:
							fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeVarFixArrayLoadDOUBLE, event);
							break;
						case Node.ADDR:
							fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeVarFixArrayLoadADDR, event);
							break;
					}
					fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeVarFixArrayLoadGeneric, event);
				}else if(node.getOpType() == NodeVarFix.SAVE) {
					switch(node.getSize()) {
						case Node.INT8:
							fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeVarFixArrayStoreBYTE, event);
							break;
						case Node.INT16:
							fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeVarFixArrayStoreSHORT, event);
							break;
						case Node.INT32:
							fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeVarFixArrayStoreINT, event);
							break;
						case Node.INT64:
							fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeVarFixArrayStoreLONG, event);
							break;
						case Node.FLOAT:
							fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeVarFixArrayStoreFLOAT, event);
							break;
						case Node.DOUBLE:
							fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeVarFixArrayStoreDOUBLE, event);
							break;
						case Node.ADDR:
							fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeVarFixArrayStoreADDR, event);
							break;
					}
					fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeVarFixArrayStoreGeneric, event);
				}
				break;
			default:
				System.err.println("Wasn't able to handle node: "+node.toString());
		}
		fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeVarFixGeneric, event);
	}
	

	private static void nodeMath(F0xC fox, NodeMath node, F0xEventNodeMathParsing event) {
		switch(node.getType()) {
			case NodeMath.ADD:
				switch(node.getSize()) {
					case Node.INT32:
						fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeMathADDINT, event);
						break;
					case Node.INT64:
						fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeMathADDLONG, event);
						break;
					case Node.FLOAT:
						fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeMathADDFLOAT, event);
						break;
					case Node.DOUBLE:
						fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeMathADDDOUBLE, event);
						break;
				}
				fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeMathADDGeneric, event);
				break;
			case NodeMath.SUB:
				switch(node.getSize()) {
					case Node.INT32:
						fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeMathSUBINT, event);
						break;
					case Node.INT64:
						fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeMathSUBLONG, event);
						break;
					case Node.FLOAT:
						fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeMathSUBFLOAT, event);
						break;
					case Node.DOUBLE:
						fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeMathSUBDOUBLE, event);
						break;
				}
				fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeMathSUBGeneric, event);
				break;
			case NodeMath.MUL:
				switch(node.getSize()) {
					case Node.INT32:
						fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeMathMULINT, event);
						break;
					case Node.INT64:
						fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeMathMULLONG, event);
						break;
					case Node.FLOAT:
						fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeMathMULFLOAT, event);
						break;
					case Node.DOUBLE:
						fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeMathMULDOUBLE, event);
						break;
				}
				fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeMathMULGeneric, event);
				break;
			case NodeMath.DIV:
				switch(node.getSize()) {
					case Node.INT32:
						fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeMathDIVINT, event);
						break;
					case Node.INT64:
						fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeMathDIVLONG, event);
						break;
					case Node.FLOAT:
						fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeMathDIVFLOAT, event);
						break;
					case Node.DOUBLE:
						fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeMathDIVDOUBLE, event);
						break;
				}
				fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeMathDIVGeneric, event);
				break;
			case NodeMath.REM:
				switch(node.getSize()) {
					case Node.INT32:
						fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeMathREMINT, event);
						break;
					case Node.INT64:
						fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeMathREMLONG, event);
						break;
					case Node.FLOAT:
						fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeMathREMFLOAT, event);
						break;
					case Node.DOUBLE:
						fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeMathREMDOUBLE, event);
						break;
				}
				fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeMathREMGeneric, event);
				break;
			case NodeMath.NEG:
				switch(node.getSize()) {
					case Node.INT32:
						fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeMathNEGINT, event);
						break;
					case Node.INT64:
						fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeMathNEGLONG, event);
						break;
					case Node.FLOAT:
						fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeMathNEGFLOAT, event);
						break;
					case Node.DOUBLE:
						fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeMathNEGDOUBLE, event);
						break;
				}
				fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeMathNEGGeneric, event);
				break;
			case NodeMath.SHL:
				switch(node.getSize()) {
					case Node.INT32:
						fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeMathSHLINT, event);
						break;
					case Node.INT64:
						fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeMathSHLLONG, event);
						break;
				}
				fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeMathSHLGeneric, event);
				break;
			case NodeMath.SHR:
				switch(node.getSize()) {
					case Node.INT32:
						fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeMathSHRINT, event);
						break;
					case Node.INT64:
						fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeMathSHRLONG, event);
						break;
				}
				fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeMathSHRGeneric, event);
				break;
			case NodeMath.USHR:
				switch(node.getSize()) {
					case Node.INT32:
						fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeMathUSHRINT, event);
						break;
					case Node.INT64:
						fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeMathUSHRLONG, event);
						break;
				}
				fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeMathUSHRGeneric, event);
				break;
			case NodeMath.AND:
				switch(node.getSize()) {
					case Node.INT32:
						fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeMathANDINT, event);
						break;
					case Node.INT64:
						fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeMathANDLONG, event);
						break;
				}
				fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeMathANDGeneric, event);
				break;
			case NodeMath.OR:
				switch(node.getSize()) {
					case Node.INT32:
						fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeMathORINT, event);
						break;
					case Node.INT64:
						fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeMathORLONG, event);
						break;
				}
				fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeMathORGeneric, event);
				break;
			case NodeMath.XOR:
				switch(node.getSize()) {
					case Node.INT32:
						fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeMathXORINT, event);
						break;
					case Node.INT64:
						fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeMathXORLONG, event);
						break;
				}
				fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeMathXORGeneric, event);
				break;
			default:
				System.err.println("Wasn't able to handle node: "+node.toString());
		}
		fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeMathGeneric, event);
	}
	
	private static void nodeInvoke(F0xC fox, NodeInvoke node, F0xEventNodeInvokeParsing event) {
		switch(node.getInvokeType()) {
		case NodeInvoke.INVOKE_STATIC:
		case NodeInvoke.INVOKE_DYNAMIC:
				fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeInvokeSTATIC, event);
				break;
		case NodeInvoke.INVOKE_SPECIAL:
				fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeInvokeSPECIAL, event);
				break;
		case NodeInvoke.INVOKE_VIRTUAL:
		case NodeInvoke.INVOKE_INTERFACE:
				fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeInvokeOBJECT, event);
				break;
			default:
				System.err.println("Wasn't able to handle node: "+node.toString());
		}
		fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeInvokeGeneric, event);
	}
	
	private static void nodeObject(F0xC fox, NodeObject node, F0xEventNodeObjectParsing event) {
		switch(node.getType()) {
			case NodeObject.NEW_OBJECT:
				fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeObjectNEWOBJECT, event);
				break;
			case NodeObject.NEW_ARRAY:
				fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeObjectNEWARRAY, event);
				break;
			case NodeObject.FREE:
				fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeObjectFREE, event);
				break;
			case NodeObject.DESTROY:
				fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeObjectDESTROY, event);
				break;
			case NodeObject.CLDESTROY:
				fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeObjectCLDESTROY, event);
				break;
			case NodeObject.REFERENCE:
				fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeObjectREFERENCE, event);
				break;
			case NodeObject.ARRAYLENGTH:
				fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeObjectARRAYLENGTH, event);
				break;
			default:
				System.err.println("Wasn't able to handle node: "+node.toString());
		}
		fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeObjectGeneric, event);
	}
	
	private static void nodeJump(F0xC fox, NodeJump node, F0xEventNodeJumpParsing event) {
		switch(node.getJumpCondition()) {
			case NodeJump.JUMP_ALWAYS:
				fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeJumpAlways, event);
				break;
			case NodeJump.JUMP_EQUALS:
				fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeJumpEqual, event);
				break;
			case NodeJump.JUMP_NOTEQUALS:
				fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeJumpNotEqual, event);
				break;
			case NodeJump.JUMP_LESSTHAN:
				fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeJumpLessThan, event);
				break;
			case NodeJump.JUMP_LESSEQUALS:
				fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeJumpLessEqual, event);
				break;
			case NodeJump.JUMP_GREATERTHAN:
				fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeJumpGreaterThan, event);
				break;
			case NodeJump.JUMP_GREATEREQUALS:
				fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeJumpGreaterEqual, event);
				break;
			case NodeJump.JUMP_RETURN:
				fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeJumpReturn, event);
				break;
			default:
				System.err.println("Wasn't able to handle node: "+node.toString());
		}
		fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeJumpGeneric, event);
	}
	
	private static void nodeConst(F0xC fox, NodeConst node, F0xEventNodeConstParsing event) {
		switch(F0xUtil.convertedType(node.getValue())) {
			case Node.INT8:
				fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeConstBYTE, event);
				break;
			case Node.INT16:
				fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeConstSHORT, event);
				break;
			case Node.INT32:
				fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeConstINT, event);
				break;
			case Node.INT64:
				fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeConstLONG, event);
				break;
			case Node.FLOAT:
				fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeConstFLOAT, event);
				break;
			case Node.DOUBLE:
				fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeConstDOUBLE, event);
				break;
			case Node.ADDR:
				fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeConstADDR, event);
				break;
			default:
				System.err.println("Wasn't able to handle node: "+node.toString());
		}
		fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeConstGeneric, event);
	}

	private static void nodeCompare(F0xC fox, NodeCompare node, F0xEventNodeCompareParsing event) {
		switch(node.getCompareType()) {
			case NodeCompare.COMPARE_EQUAL:
				switch(node.getSize()) {
					case Node.INT32:
						fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeCompareINTEQUAL, event);
						break;
					case Node.INT64:
						fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeCompareLONGEQUAL, event);
						break;
					case Node.FLOAT:
						fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeCompareFLOATEQUAL, event);
						break;
					case Node.DOUBLE:
						fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeCompareDOUBLEEQUAL, event);
						break;
					default:
						System.err.println("Wasn't able to handle node: "+node.toString());
				}
				break;
			case NodeCompare.COMPARE_NULL:
				fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeCompareNULL, event);
				break;
			case NodeCompare.COMPARE_CHECKCAST:
				fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeCompareCHECKCAST, event);
				break;
			case NodeCompare.COMPARE_INSTANCEOF:
				fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeCompareINSTANCEOF, event);
				break;
			case NodeCompare.COMPARE_SAMEREFERENCE:
				fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeCompareSAMEREFERENCE, event);
				break;
			default:
				System.err.println("Wasn't able to handle node: "+node.toString());
		}
		fox.getEventHandler().triggerEvent(F0xEventType.ParseNodeCompareGeneric, event);
	}
}
