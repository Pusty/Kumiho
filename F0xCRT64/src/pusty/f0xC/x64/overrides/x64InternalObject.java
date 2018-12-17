package pusty.f0xC.x64.overrides;

import java.util.ArrayList;

import pusty.f0xC.ContextClass;
import pusty.f0xC.F0xC;
import pusty.f0xC.F0xUtil;
import pusty.f0xC.lang.OverrideHandler.OverrideTranslation;
import pusty.f0xC.nodes.NodeCustom;
import pusty.f0xC.x64.Parser64;
import pusty.f0xC.x64.StringConfig64;

public class x64InternalObject {
	
	//InternalObject
	
	@OverrideTranslation(override = StringConfig64.class_InternalObject+".getRef")
	public static void getRef(F0xC fox, Parser64 parser, ArrayList<String> list, NodeCustom node) {
		list.add("mov reg1, "+F0xUtil.argS(0,1));
		list.add("xor reg0, reg0");
		list.add("mov reg0s, [reg1+"+ContextClass.dummyReference(parser.getAddressSize())+"]");
	}
	
	@OverrideTranslation(override = StringConfig64.class_InternalObject+".getSize")
	public static void getSize(F0xC fox, Parser64 parser, ArrayList<String> list, NodeCustom node) {
		list.add("mov reg1, "+F0xUtil.argS(0,1));
		list.add("xor reg0, reg0");
		list.add("mov reg0s, [reg1+"+ContextClass.dummySize(parser.getAddressSize())+"]");
	}
	
	@OverrideTranslation(override = StringConfig64.class_InternalObject+".getID")
	public static void getID(F0xC fox, Parser64 parser, ArrayList<String> list, NodeCustom node) {
		list.add("mov reg1, "+F0xUtil.argS(0,1));
		list.add("mov reg0, [reg1+"+ContextClass.dummyID(parser.getAddressSize())+"]");
	}
	
	@OverrideTranslation(override = StringConfig64.class_InternalObject+".getMem")
	public static void getMem(F0xC fox, Parser64 parser, ArrayList<String> list, NodeCustom node) {
		list.add("mov reg1, "+F0xUtil.argS(0,2));
		list.add("add reg1, "+F0xUtil.argS(1,2));
		list.add("xor reg0, reg0");
		list.add("mov reg0b, [reg1]");
	}
	
	@OverrideTranslation(override = StringConfig64.class_InternalObject+".getClassName")
	public static void getClassName(F0xC fox, Parser64 parser, ArrayList<String> list, NodeCustom node) {
		list.add("mov reg1, "+F0xUtil.argS(0,1));
		list.add("mov reg0, [reg1+addrsize]"); //offset to name structure
	}
	
	@OverrideTranslation(override = StringConfig64.class_InternalObject+".setRef")
	public static void setRef(F0xC fox, Parser64 parser, ArrayList<String> list, NodeCustom node) {
		list.add("mov reg1, "+F0xUtil.argS(0,2));
		list.add("mov reg2, "+F0xUtil.argS(1,2));
		list.add("mov [reg1+"+ContextClass.dummyReference(parser.getAddressSize())+"], reg2s");
	}
	
	@OverrideTranslation(override = StringConfig64.class_InternalObject+".setSize")
	public static void setSize(F0xC fox, Parser64 parser, ArrayList<String> list, NodeCustom node) {
		list.add("mov reg1, "+F0xUtil.argS(0,2));
		list.add("mov reg2, "+F0xUtil.argS(1,2));
		list.add("mov [reg1+"+ContextClass.dummySize(parser.getAddressSize())+"], reg2s");
	}
	
	@OverrideTranslation(override = StringConfig64.class_InternalObject+".setID")
	public static void setID(F0xC fox, Parser64 parser, ArrayList<String> list, NodeCustom node) {
		list.add("mov reg1, "+F0xUtil.argS(0,2));
		list.add("mov reg2, "+F0xUtil.argS(1,2));
		list.add("mov [reg1+"+ContextClass.dummyID(parser.getAddressSize())+"], reg2");
	}
	
	@OverrideTranslation(override = StringConfig64.class_InternalObject+".setMem")
	public static void setMem(F0xC fox, Parser64 parser, ArrayList<String> list, NodeCustom node) {
		list.add("mov reg0, "+F0xUtil.argS(0,3));
		list.add("add reg0, "+F0xUtil.argS(1,3));
		list.add("mov reg1, "+F0xUtil.argS(2,3));
		list.add("mov [reg0], reg1b");
	}
	
	@OverrideTranslation(override = StringConfig64.class_InternalObject+".destroy")
	public static void destroy(F0xC fox, Parser64 parser, ArrayList<String> list, NodeCustom node) {
		list.add("mov reg0, "+F0xUtil.argB(0,1));
		list.add("push reg0");
		list.add("mov reg0, [reg0+"+ContextClass.dummyID(parser.getAddressSize())+"]");
		list.add("call addrname [reg0+addrsize*0]");
		list.add("add regS, 4");
	}
	
	@OverrideTranslation(override = StringConfig64.class_InternalObject+".long2obj")
	public static void long2obj(F0xC fox, Parser64 parser, ArrayList<String> list, NodeCustom node) {
		list.add("mov reg0, "+F0xUtil.argS(0,1));
	}
	
	@OverrideTranslation(override = StringConfig64.class_InternalObject+".obj2long")
	public static void obj2long(F0xC fox, Parser64 parser, ArrayList<String> list, NodeCustom node) {
		list.add("mov reg0, "+F0xUtil.argS(0,1));
	}
	
	@OverrideTranslation(override = StringConfig64.class_InternalObject+".obj2str")
	public static void obj2str(F0xC fox, Parser64 parser, ArrayList<String> list, NodeCustom node) {
		list.add("mov reg1, "+F0xUtil.argS(0,1));
		list.add("mov reg0, [reg1+"+ContextClass.dummyID(parser.getAddressSize())+"]");
		list.add("mov reg0, [reg0+addrsize*1]");
	}
	
	@OverrideTranslation(override = StringConfig64.class_InternalObject+".con2long")
	public static void con2long(F0xC fox, Parser64 parser, ArrayList<String> list, NodeCustom node) {
		list.add("mov reg1, "+F0xUtil.argS(0,1));
		list.add("cmp reg1, 0");
		list.add("je _generic_return");
		list.add("lea reg0, [reg1+"+ContextClass.dummyOffset(parser.getAddressSize())+"]");
	}
	
	@OverrideTranslation(override = StringConfig64.class_InternalObject+".arr2long")
	public static void arr2long(F0xC fox, Parser64 parser, ArrayList<String> list, NodeCustom node) {
		list.add("mov reg1, "+F0xUtil.argS(0,1));
		list.add("cmp reg1, 0");
		list.add("je _generic_return");
		list.add("lea reg0, [reg1+"+ContextClass.arrayOffset(parser.getAddressSize())+"]");
	}
	
	
	@OverrideTranslation(override = StringConfig64.class_InternalObject+".getContentSize")
	public static void getContentSize(F0xC fox, Parser64 parser, ArrayList<String> list, NodeCustom node) {
		list.add("mov reg1, "+F0xUtil.argS(0,1));
		list.add("xor reg0, reg0");
		list.add("mov reg0s, [reg1+"+ContextClass.dummySize(parser.getAddressSize())+"]");
		list.add("sub reg0, "+ContextClass.dummyOffset(parser.getAddressSize()));
	}
}
