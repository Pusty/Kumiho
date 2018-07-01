package pusty.f0cr.data;

import java.io.DataInputStream;

import pusty.f0cr.ClassReader;
import pusty.f0cr.attribute.*;

public class AttributeInfo {

	protected short attribute_name_index; //u2
    protected int attribute_length; //u4
    protected Attribute attribute; //different for different attributes; replace this later with a AttributeType
    protected ClassReader classReader;
	public AttributeInfo(ClassReader classReader, DataInputStream s) throws Exception {
		this.classReader = classReader;
		read(s);
	}
	String attributeType;
	public void read(DataInputStream s) throws Exception {
		attribute_name_index = s.readShort();
		attribute_length = s.readInt();
		
		attributeType = classReader.getPool().get(attribute_name_index).toString();
		if(attributeType.equals("Code"))
			attribute = new CodeAttribute(classReader,s, attribute_length);
		else if(attributeType.equals("SourceFile"))
			attribute = new SourceFileAttribute(classReader,s, attribute_length);
		else if(attributeType.equals("LineNumberTable"))
			attribute = new LineNumberTableAttribute(classReader,s, attribute_length);
		else if(attributeType.equals("LocalVariableTable"))
			attribute = new LocalVariableTableAttribute(classReader,s, attribute_length);
		else if(attributeType.equals("ConstantValue"))
			attribute = new ConstantValueAttribute(classReader,s, attribute_length);
		else if(attributeType.equals("Exceptions"))
			attribute = new ExceptionsAttribute(classReader,s, attribute_length);
		else if(attributeType.equals("InnerClasses"))
			attribute = new InnerClassesAttribute(classReader,s, attribute_length);
		else if(attributeType.equals("EnclosingMethod"))
			attribute = new EnclosingMethodAttribute(classReader,s, attribute_length);
		else if(attributeType.equals("Synthetic"))
			attribute = new SyntheticAttribute(classReader,s, attribute_length);
		else if(attributeType.equals("Signature"))
			attribute = new SignatureAttribute(classReader,s, attribute_length);
		else if(attributeType.equals("SourceDebugExtension"))
			attribute = new SourceDebugExtensionAttribute(classReader,s, attribute_length);
		else if(attributeType.equals("LocalVariableTypeTable"))
			attribute = new LocalVariableTypeTableAttribute(classReader,s, attribute_length);
		else if(attributeType.equals("Deprecated"))
			attribute = new DeprecatedAttribute(classReader,s, attribute_length);
		else if(attributeType.equals("RuntimeVisibleAnnotations"))
			attribute = new RuntimeVisibleAnnotationsAttribute(classReader,s, attribute_length);
		else if(attributeType.equals("RuntimeInvisibleAnnotations"))
			attribute = new RuntimeInvisibleAnnotationsAttribute(classReader,s, attribute_length);
		else if(attributeType.equals("RuntimeVisibleParameterAnnotations"))
			attribute = new RuntimeVisibleParameterAnnotationsAttribute(classReader,s, attribute_length);
		else if(attributeType.equals("RuntimeInvisibleParameterAnnotations"))
			attribute = new RuntimeInvisibleParameterAnnotationsAttribute(classReader,s, attribute_length);
		else if(attributeType.equals("AnnotationDefault"))
			attribute = new AnnotationDefaultAttribute(classReader,s, attribute_length);
		else if(attributeType.equals("BootstrapMethods"))
			attribute = new BootstrapMethodsAttribute(classReader,s, attribute_length);
		else if(attributeType.equals("StackMapTable"))
			attribute = new StackMapTableAttribute(classReader,s, attribute_length);
		
		else{
			System.err.println("Unknown Attribute: "+attributeType);
			attribute = new Attribute(classReader,s, attribute_length);
		}
	}
	public String getAttribute() { return attributeType; }
	public short getAttributeNameIndex() { return attribute_name_index; }
	public int getAttributeLength() { return attribute_length; }
	public Attribute getInfo() { return attribute; }
}
