package kumiho.main;

import java.util.ArrayList;

import pusty.f0xC.F0xC;
import pusty.f0xC.lang.OverrideHandler.OverrideTranslation;
import pusty.f0xC.lang.x86.Parser86;
import pusty.f0xC.nodes.NodeCustom;

public class x86Kumiho {
	
	@OverrideTranslation(override = "kumiho/main/Kumiho.addrIncludeLen")
	public static void addIncludeLen(F0xC fox, Parser86 parser, ArrayList<String> list, NodeCustom node) {
		list.add("lea reg0, [includedFileLen]");
	}
	
	@OverrideTranslation(override = "kumiho/main/Kumiho.addrInclude")
	public static void addInclude(F0xC fox, Parser86 parser, ArrayList<String> list, NodeCustom node) {
		list.add("lea reg0, [includedFile]");
	}
	
	
}
