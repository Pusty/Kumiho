package kumiho.modified;

import java.util.ArrayList;

import pusty.f0xC.F0xC;
import pusty.f0xC.F0xUtil;
import pusty.f0xC.lang.OverrideHandler.OverrideTranslation;
import pusty.f0xC.lang.x86.Parser86;
import pusty.f0xC.nodes.NodeCustom;

public class x86InternalXOR {
	
	public static int XOR_KEY = 0;

	@OverrideTranslation(override = "pusty/f0xC/imports/Internal.staticReadInt")
	public static void rawMemoryReadInt(F0xC fox, Parser86 parser, ArrayList<String> list, NodeCustom node) {
		list.add("mov reg0, "+F0xUtil.argS(0, 1)); //address
		list.add("mov reg0, [reg0]");
		list.add("xor reg0, "+(XOR_KEY));
	}
}
