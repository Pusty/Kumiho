package pusty.f0cr;

import java.io.File;
import java.io.FileInputStream;

import pusty.f0cr.attribute.CodeAttribute;
import pusty.f0cr.data.AttributeInfo;
import pusty.f0cr.data.MethodInfo;

public class TestClass {
	public static void main(String[] args) throws Exception {
//		Test test = new Test();
		File file = new File("C:/Users/Hertha/workspace/F0Cr/bin/pusty/f0cr/Test.class");
		FileInputStream fis = new FileInputStream(file);		
		ClassReader reader = new ClassReader(fis);
		fis.close();
		
		//ATTRIBUTES
		System.out.println(reader.getClassName()+":");
		for(int i=0;i<reader.attributeTable.getSize();i++) {
			AttributeInfo at = reader.attributeTable.getIndexes()[i];
			System.out.println("	Attribute: "+reader.constantPool.get(at.getAttributeNameIndex())+" => "+at.getInfo());
		}
		for(int i=0;i<reader.methodTable.getSize();i++) {
			MethodInfo info = reader.methodTable.getIndexes()[i];
			System.out.println("Method: "+info.getName());
//			info.getInfo().printOut("   ");
			CodeAttribute code = info.getCode();
			code.getLocalVariableTable().printOut("   ");
			code.getInst().printOut("  >");
		}
//		System.out.println(constantPool.get(methodTable.getMethod(constantPool, "main").getDescriptorIndex()));
//		System.out.println(constantPool.get(superClassIndex));
	}
}
