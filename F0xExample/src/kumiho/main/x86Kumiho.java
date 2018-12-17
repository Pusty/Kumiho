package kumiho.main;

import java.util.ArrayList;

import pusty.f0xC.F0xC;
import pusty.f0xC.F0xUtil;
import pusty.f0xC.lang.OverrideHandler.OverrideTranslation;
import pusty.f0xC.nodes.NodeCustom;
import pusty.f0xC.x86.Parser86;

public class x86Kumiho {
	
	@OverrideTranslation(override = "kumiho/main/Kumiho.addrIncludeLen")
	public static void addIncludeLen(F0xC fox, Parser86 parser, ArrayList<String> list, NodeCustom node) {
		list.add("lea reg0, [includedFileLen]");
	}
	
	@OverrideTranslation(override = "kumiho/main/Kumiho.addrInclude")
	public static void addInclude(F0xC fox, Parser86 parser, ArrayList<String> list, NodeCustom node) {
		list.add("lea reg0, [includedFile]");
	}
	
	@OverrideTranslation(override = "kumiho/main/Kumiho.addrStartFree")
	public static void addrStartFree(F0xC fox, Parser86 parser, ArrayList<String> list, NodeCustom node) {
		list.add("lea reg0, [start_function_diag]");
	}
	
	@OverrideTranslation(override = "kumiho/main/Kumiho.jumpOut")
	public static void jumpOut(F0xC fox, Parser86 parser, ArrayList<String> list, NodeCustom node) {
		list.add("mov reg0, "+F0xUtil.argS(0, 1)); //address
		list.add("jmp reg0");
	}
	
	@OverrideTranslation(override = "kumiho/main/Kumiho.callOut")
	public static void callOut(F0xC fox, Parser86 parser, ArrayList<String> list, NodeCustom node) {
		list.add("mov reg0, "+F0xUtil.argS(0, 1)); //address
		list.add("call reg0");
	}
	
	
	@OverrideTranslation(override = "kumiho/main/Kumiho.callTLS")
	public static void callTLS(F0xC fox, Parser86 parser, ArrayList<String> list, NodeCustom node) {
		list.add("mov reg0, "+F0xUtil.argS(0, 4)); //address
		list.add("push addrname "+F0xUtil.argS(3, 4)); //resv
		list.add("push addrname "+F0xUtil.argS(2, 4)); //type of tls call
		list.add("push addrname "+F0xUtil.argS(1, 4)); //base
		list.add("call reg0");
	}
	
	@OverrideTranslation(override = "kumiho/main/Kumiho.hookExitProcessAddr")
	public static void hookExitProcessAddr(F0xC fox, Parser86 parser, ArrayList<String> list, NodeCustom node) {
		list.add("lea reg0, [function_kumiho_main_Kumiho_hookExitProcess_I_V_line_start]");
	}
	
	
}
