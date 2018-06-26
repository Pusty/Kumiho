package pusty.f0xC.module;

import pusty.f0xC.F0xC;

public abstract class F0xEvent {
	
	protected F0xC f0x;
	public F0xEvent(F0xC f0x) {
		this.f0x = f0x;
	}
	
	public F0xEventType getType() {
		return F0xEventType.None;
	}
	
	public F0xEventStatus getStatus() {
		return F0xEventStatus.NORMAL;
	}
	
	public F0xC getF0xC() {
		return f0x;
	}
	
	public enum F0xEventStatus {
		NORMAL, CANCELLED
	}
	
	public enum F0xEventPriority {
		HIGH, NORMAL, LOW 
	}
	
	public enum F0xEventType {
		//Those are the must have events
		Data, //This is a special event as it doesn't overwrite but is stored in a list (to have lots of data adding events)
		Init, //Special event for initializing at start
		Free, //Special event for freeing after function processing is done
		Code, //Special event for extra code that gets appended to the section
		None, StartParsingCode, StopParsingCode, StartParsingData, ParseImport, StopParsingData, StartParsingClass, StopParsingClass, StartParsingFunction, StopParsingFunction, ParseNodeGeneric,
		ParseNodeCompareGeneric, ParseNodeCompareSAMEREFERENCE, ParseNodeCompareINSTANCEOF, ParseNodeCompareCHECKCAST, ParseNodeCompareNULL, ParseNodeCompareINTEQUAL, ParseNodeCompareLONGEQUAL, ParseNodeCompareFLOATEQUAL,ParseNodeCompareDOUBLEEQUAL,
		ParseNodeConstGeneric, ParseNodeConstBYTE,ParseNodeConstSHORT,ParseNodeConstINT,ParseNodeConstLONG,ParseNodeConstFLOAT,ParseNodeConstDOUBLE,ParseNodeConstADDR,
		ParseNodeJumpGeneric, ParseNodeJumpAlways, ParseNodeJumpEqual, ParseNodeJumpNotEqual, ParseNodeJumpLessThan, ParseNodeJumpLessEqual, ParseNodeJumpGreaterThan, ParseNodeJumpGreaterEqual, ParseNodeJumpReturn,
		ParseNodeMathGeneric, ParseNodeMathADDGeneric, ParseNodeMathSUBGeneric, ParseNodeMathMULGeneric, ParseNodeMathDIVGeneric, ParseNodeMathREMGeneric, ParseNodeMathNEGGeneric, ParseNodeMathSHLGeneric, ParseNodeMathSHRGeneric, ParseNodeMathUSHRGeneric, ParseNodeMathANDGeneric, ParseNodeMathORGeneric, ParseNodeMathXORGeneric,
		ParseNodeMathINT, ParseNodeMathADDINT, ParseNodeMathSUBINT, ParseNodeMathMULINT, ParseNodeMathDIVINT, ParseNodeMathREMINT, ParseNodeMathNEGINT, ParseNodeMathSHLINT, ParseNodeMathSHRINT, ParseNodeMathUSHRINT, ParseNodeMathANDINT, ParseNodeMathORINT, ParseNodeMathXORINT,
		ParseNodeMathLONG, ParseNodeMathADDLONG, ParseNodeMathSUBLONG, ParseNodeMathMULLONG, ParseNodeMathDIVLONG, ParseNodeMathREMLONG, ParseNodeMathNEGLONG, ParseNodeMathSHLLONG, ParseNodeMathSHRLONG, ParseNodeMathUSHRLONG, ParseNodeMathANDLONG, ParseNodeMathORLONG, ParseNodeMathXORLONG,
		ParseNodeMathFLOAT, ParseNodeMathADDFLOAT, ParseNodeMathSUBFLOAT, ParseNodeMathMULFLOAT, ParseNodeMathDIVFLOAT, ParseNodeMathREMFLOAT, ParseNodeMathNEGFLOAT,
		ParseNodeMathDOUBLE, ParseNodeMathADDDOUBLE, ParseNodeMathSUBDOUBLE, ParseNodeMathMULDOUBLE, ParseNodeMathDIVDOUBLE, ParseNodeMathREMDOUBLE, ParseNodeMathNEGDOUBLE,
		ParseNodeStackGeneric, ParseNodeStackPUSHGeneric, ParseNodeStackPOPGeneric, ParseNodeStackPUSHINT, ParseNodeStackPOPINT, ParseNodeStackPUSHLONG, ParseNodeStackPOPLONG,
		ParseNodeStackPUSHFLOAT, ParseNodeStackPOPFLOAT, ParseNodeStackPUSHDOUBLE, ParseNodeStackPOPDOUBLE,  ParseNodeStackPUSHSHORT, ParseNodeStackPOPSHORT,  ParseNodeStackPUSHBYTE, ParseNodeStackPOPBYTE,  ParseNodeStackPUSHADDR, ParseNodeStackPOPADDR,
		ParseNodeStackD2F, ParseNodeStackD2L, ParseNodeStackF2D, ParseNodeStackF2I, ParseNodeStackI2F, ParseNodeStackI2L, ParseNodeStackL2D, ParseNodeStackL2I, ParseNodeStackTHROW,
		ParseNodeObjectGeneric, ParseNodeObjectNEWOBJECT, ParseNodeObjectNEWARRAY, ParseNodeObjectFREE, ParseNodeObjectDESTROY, ParseNodeObjectCLDESTROY, ParseNodeObjectREFERENCE, ParseNodeObjectARRAYLENGTH,
		ParseNodeInvokeGeneric, ParseNodeInvokeSTATIC, ParseNodeInvokeOBJECT, ParseNodeInvokeSPECIAL,
		ParseNodeVarFixGeneric,
		ParseNodeVarFixLocalLoadGeneric,ParseNodeVarFixLocalStoreGeneric,ParseNodeVarFixGlobalLoadGeneric,ParseNodeVarFixGlobalStoreGeneric,ParseNodeVarFixObjectLoadGeneric,ParseNodeVarFixObjectStoreGeneric,ParseNodeVarFixArrayLoadGeneric,ParseNodeVarFixArrayStoreGeneric,
		ParseNodeVarFixLocalLoadBYTE,   ParseNodeVarFixLocalStoreBYTE,   ParseNodeVarFixGlobalLoadBYTE,   ParseNodeVarFixGlobalStoreBYTE,   ParseNodeVarFixObjectLoadBYTE,   ParseNodeVarFixObjectStoreBYTE,   ParseNodeVarFixArrayLoadBYTE,   ParseNodeVarFixArrayStoreBYTE,
		ParseNodeVarFixLocalLoadSHORT,  ParseNodeVarFixLocalStoreSHORT,  ParseNodeVarFixGlobalLoadSHORT,  ParseNodeVarFixGlobalStoreSHORT,  ParseNodeVarFixObjectLoadSHORT,  ParseNodeVarFixObjectStoreSHORT,  ParseNodeVarFixArrayLoadSHORT,  ParseNodeVarFixArrayStoreSHORT,
		ParseNodeVarFixLocalLoadINT,    ParseNodeVarFixLocalStoreINT,    ParseNodeVarFixGlobalLoadINT,    ParseNodeVarFixGlobalStoreINT,    ParseNodeVarFixObjectLoadINT,    ParseNodeVarFixObjectStoreINT,    ParseNodeVarFixArrayLoadINT,    ParseNodeVarFixArrayStoreINT,
		ParseNodeVarFixLocalLoadLONG,   ParseNodeVarFixLocalStoreLONG,   ParseNodeVarFixGlobalLoadLONG,   ParseNodeVarFixGlobalStoreLONG,   ParseNodeVarFixObjectLoadLONG,   ParseNodeVarFixObjectStoreLONG,   ParseNodeVarFixArrayLoadLONG,   ParseNodeVarFixArrayStoreLONG,
		ParseNodeVarFixLocalLoadADDR,   ParseNodeVarFixLocalStoreADDR,   ParseNodeVarFixGlobalLoadADDR,   ParseNodeVarFixGlobalStoreADDR,   ParseNodeVarFixObjectLoadADDR,   ParseNodeVarFixObjectStoreADDR,   ParseNodeVarFixArrayLoadADDR,   ParseNodeVarFixArrayStoreADDR,
		ParseNodeVarFixLocalLoadFLOAT,  ParseNodeVarFixLocalStoreFLOAT,  ParseNodeVarFixGlobalLoadFLOAT,  ParseNodeVarFixGlobalStoreFLOAT,  ParseNodeVarFixObjectLoadFLOAT,  ParseNodeVarFixObjectStoreFLOAT,  ParseNodeVarFixArrayLoadFLOAT,  ParseNodeVarFixArrayStoreFLOAT,
		ParseNodeVarFixLocalLoadDOUBLE, ParseNodeVarFixLocalStoreDOUBLE, ParseNodeVarFixGlobalLoadDOUBLE, ParseNodeVarFixGlobalStoreDOUBLE, ParseNodeVarFixObjectLoadDOUBLE, ParseNodeVarFixObjectStoreDOUBLE, ParseNodeVarFixArrayLoadDOUBLE, ParseNodeVarFixArrayStoreDOUBLE,
		//The next ones are recommended to implement for a proper language implementation but not called from the abstract types
		GCRegister, GCCollect, GCCollectKeepFlags, GCEnable, GCDisable,
		Diagnostic
	}

}
