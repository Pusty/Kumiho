package pusty.f0xC.lang.x86.overrides;

import java.util.ArrayList;

import pusty.f0xC.F0xC;
import pusty.f0xC.F0xUtil;
import pusty.f0xC.lang.OverrideHandler.OverrideTranslation;
import pusty.f0xC.lang.x86.Parser86;
import pusty.f0xC.nodes.NodeCustom;

public class x86Internal {
	
	
	@OverrideTranslation(override = "pusty/f0xC/imports/Internal.getNextAddress")
	public static void getNextAddress(F0xC fox, Parser86 parser, ArrayList<String> list, NodeCustom node) {
		list.add("mov reg0, [regS]");
	}
	
	@OverrideTranslation(override = "pusty/f0xC/imports/Internal.getFramePointer")
	public static void getFramePointer(F0xC fox, Parser86 parser, ArrayList<String> list, NodeCustom node) {
		list.add("mov reg0, regB");
	}
	
	@OverrideTranslation(override = "pusty/f0xC/imports/Internal.addrStringTable")
	public static void addrStringTable(F0xC fox, Parser86 parser, ArrayList<String> list, NodeCustom node) {
		list.add("lea reg0, [stringTable]");
	}
	
	@OverrideTranslation(override = "pusty/f0xC/imports/Internal.addrStringTableData")
	public static void addrStringTableData(F0xC fox, Parser86 parser, ArrayList<String> list, NodeCustom node) {
		list.add("lea reg0, [stringTableData]");
	}
	
	@OverrideTranslation(override = "pusty/f0xC/imports/Internal.rawMemoryWriteByte")
	public static void rawMemoryWriteByte(F0xC fox, Parser86 parser, ArrayList<String> list, NodeCustom node) {
		list.add("mov reg0, "+F0xUtil.argS(0, 2)); //address
		list.add("mov reg1, "+F0xUtil.argS(1, 2)); //data
		list.add("mov [reg0], reg1b");
	}
	
	@OverrideTranslation(override = "pusty/f0xC/imports/Internal.rawMemoryWriteInt")
	public static void rawMemoryWriteInt(F0xC fox, Parser86 parser, ArrayList<String> list, NodeCustom node) {
		list.add("mov reg0, "+F0xUtil.argS(0, 2)); //address
		list.add("mov reg1, "+F0xUtil.argS(1, 2)); //data
		list.add("mov [reg0], reg1");
	}
	
	@OverrideTranslation(override = "pusty/f0xC/imports/Internal.rawMemoryReadInt")
	public static void rawMemoryReadInt(F0xC fox, Parser86 parser, ArrayList<String> list, NodeCustom node) {
		list.add("mov reg0, "+F0xUtil.argS(0, 1)); //address
		list.add("mov reg0, [reg0]");
	}
	
}
