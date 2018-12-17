package pusty.f0xC.x86.overrides;

import java.util.ArrayList;

import pusty.f0xC.F0xC;
import pusty.f0xC.F0xUtil;
import pusty.f0xC.lang.OverrideHandler.OverrideTranslation;
import pusty.f0xC.nodes.NodeCustom;
import pusty.f0xC.x86.Parser86;
import pusty.f0xC.x86.StringConfig86;

public class x86Internal {
	
	
	@OverrideTranslation(override = StringConfig86.class_Internal+".getNextAddress")
	public static void getNextAddress(F0xC fox, Parser86 parser, ArrayList<String> list, NodeCustom node) {
		list.add("mov reg0, [regB+addrsize]");
	}
	
	@OverrideTranslation(override = StringConfig86.class_Internal+".getFramePointer")
	public static void getFramePointer(F0xC fox, Parser86 parser, ArrayList<String> list, NodeCustom node) {
		list.add("mov reg0, regB");
	}
	
	@OverrideTranslation(override = StringConfig86.class_Internal+".addrStringTable")
	public static void addrStringTable(F0xC fox, Parser86 parser, ArrayList<String> list, NodeCustom node) {
		list.add("lea reg0, [stringTable]");
	}
	
	@OverrideTranslation(override = StringConfig86.class_Internal+".addrStringTableData")
	public static void addrStringTableData(F0xC fox, Parser86 parser, ArrayList<String> list, NodeCustom node) {
		list.add("lea reg0, [stringTableData]");
	}
	
	@OverrideTranslation(override = StringConfig86.class_Internal+".rawMemoryWriteByte")
	public static void rawMemoryWriteByte(F0xC fox, Parser86 parser, ArrayList<String> list, NodeCustom node) {
		list.add("mov reg0, "+F0xUtil.argS(0, 2)); //address
		list.add("mov reg1, "+F0xUtil.argS(1, 2)); //data
		list.add("mov [reg0], reg1b");
	}
	
	@OverrideTranslation(override = StringConfig86.class_Internal+".rawMemoryWriteInt")
	public static void rawMemoryWriteInt(F0xC fox, Parser86 parser, ArrayList<String> list, NodeCustom node) {
		list.add("mov reg0, "+F0xUtil.argS(0, 2)); //address
		list.add("mov reg1, "+F0xUtil.argS(1, 2)); //data
		list.add("mov [reg0], reg1");
	}
	
	@OverrideTranslation(override = StringConfig86.class_Internal+".rawMemoryReadInt")
	public static void rawMemoryReadInt(F0xC fox, Parser86 parser, ArrayList<String> list, NodeCustom node) {
		list.add("mov reg0, "+F0xUtil.argS(0, 1)); //address
		list.add("mov reg0, [reg0]");
	}
	
	@OverrideTranslation(override = StringConfig86.class_Internal+".staticReadInt")
	public static void staticReadInt(F0xC fox, Parser86 parser, ArrayList<String> list, NodeCustom node) {
		list.add("mov reg0, "+F0xUtil.argS(0, 1)); //address
		list.add("mov reg0, [reg0]");
	}
	
	@OverrideTranslation(override = StringConfig86.class_Internal+".breakpoint")
	public static void breakpoint(F0xC fox, Parser86 parser, ArrayList<String> list, NodeCustom node) {
		list.add("int3"); 
	}
	
	@OverrideTranslation(override = StringConfig86.class_Internal+".setReturnAddress")
	public static void setReturnAddress(F0xC fox, Parser86 parser, ArrayList<String> list, NodeCustom node) {
		list.add("mov reg0, "+F0xUtil.argS(0, 1)); 
		list.add("mov [regB+addrsize], reg0"); 
	}
}
