package pusty.f0cr;

import java.io.DataInputStream;
import pusty.f0cr.types.*;

public class ConstantPool {
	public static final int UTF_8 = 1, INTEGER = 3, FLOAT = 4, LONG = 5, DOUBLE = 6, CLASS_REFERENCE = 7
			, STRING_REFERENCE = 8, FIELD_REFERENCE = 9, METHOD_REFERENCE = 10, INTERFACE_REFERENCE = 11, NAME_AND_TYPE = 12
			, METHOD_HANDLE = 15, METHOD_TYPE = 16, INVOKE_DYNAMIC = 18;
	
	protected int poolSize;
	protected Object[] poolContent;
	protected ClassReader classReader;
	public ConstantPool(ClassReader classReader, DataInputStream s) throws Exception {
		this.classReader = classReader;
		read(s);
	}

	@SuppressWarnings("deprecation")
	public void read(DataInputStream s) throws Exception {
		poolSize = s.readShort();
		poolContent = new Object[poolSize];
		for(int i=0;i<poolSize-1;i++) {
			int tag = s.readByte();
			int size = getTagSize(tag);		
			if(size == 0) //TAG READING ERROR
				throw new Exception("Error Reading Constant Pool ("+tag+")");		
			if(tag == UTF_8) //READ UTF_8 STRING
				poolContent[i+1] = s.readUTF();
			else if(tag == INTEGER)
				poolContent[i+1] = new Integer(s.readInt());
			else if(tag == FLOAT)
				poolContent[i+1] = new Float(s.readFloat());
			else if(tag == LONG) {
				poolContent[i+1] = new Long(s.readLong());
				i++;
			}else if(tag == DOUBLE) {
				poolContent[i+1] = new Double(s.readDouble());
				i++;
			}else if(tag == CLASS_REFERENCE)
				poolContent[i+1] = new ClassReference(poolContent, s.readShort());
			else if(tag == STRING_REFERENCE)
				poolContent[i+1] = new StringReference(poolContent, s.readShort());
			else if(tag == FIELD_REFERENCE)
				poolContent[i+1] = new FieldReference(poolContent, s.readShort(),s.readShort());
			else if(tag == METHOD_REFERENCE)
				poolContent[i+1] = new MethodReference(poolContent, s.readShort(),s.readShort());
			else if(tag == INTERFACE_REFERENCE)
				poolContent[i+1] = new InterfaceMethodReference(poolContent, s.readShort(),s.readShort());
			else if(tag == NAME_AND_TYPE)
				poolContent[i+1] = new NameAndTypeDescriptor(poolContent, s.readShort(),s.readShort());
			else if(tag == METHOD_HANDLE)
				poolContent[i+1] = new MethodHandle(poolContent, s.readByte(),s.readShort());
			else if(tag == METHOD_TYPE)
				poolContent[i+1] = new MethodType(poolContent, s.readShort());
			else if(tag == INVOKE_DYNAMIC)
				poolContent[i+1] = new InvokeDynamic(poolContent, s.readShort(), s.readShort());
			else {
				throw new Exception("Can't handle tag "+tag);
			}
		}
	}
	
	public static  String getTagName(int i) {
		switch(i) {
			case UTF_8: return "UTF_8"; //UTF-8 String
			case INTEGER: return "INTEGER"; //Integer 
			case FLOAT: return "FLOAT"; //IEEE 754 floating-point number
			case LONG: return "LONG"; //Long (takes two slots in the constant pool table)
			case DOUBLE: return "DOUBLE"; //IEEE 754 floating-point number (takes two slots in the constant pool table)
			case CLASS_REFERENCE: return "CLASS_REFERENCE"; //Class reference (index)
			case STRING_REFERENCE: return "STRING_REFERENCE"; //String reference (index)
			case FIELD_REFERENCE: return "FIELD_REFERENCE"; //Field reference (2 indexes)
			case METHOD_REFERENCE: return "METHOD_REFERENCE"; //Method reference (2 indexes)
			case INTERFACE_REFERENCE: return "INTERFACE_REFERENCE"; //Interface method reference
			case NAME_AND_TYPE: return "NAME_AND_TYPE"; //Name and type descriptor
			case METHOD_HANDLE: return "METHOD_HANDLE"; //Method handle
			case METHOD_TYPE: return "METHOD_TYPE"; //Method type
			case INVOKE_DYNAMIC: return "INVOKE_DYNAMIC"; //InvokeDynamic
			default: return null;
		}
	}

	public static int getTagSize(int i) {
		switch(i) {
			case UTF_8: return -1; //UTF-8 String
			case INTEGER: return 4; //Integer 
			case FLOAT: return 4; //IEEE 754 floating-point number
			case LONG: return 8; //Long (takes two slots in the constant pool table)
			case DOUBLE: return 8; //IEEE 754 floating-point number (takes two slots in the constant pool table)
			case CLASS_REFERENCE: return 2; //Class reference (index)
			case STRING_REFERENCE: return 2; //String reference (index)
			case FIELD_REFERENCE: return 4; //Field reference (2 indexes)
			case METHOD_REFERENCE: return 4; //Method reference (2 indexes)
			case INTERFACE_REFERENCE: return 4; //Interface method reference
			case NAME_AND_TYPE: return 4; //Name and type descriptor
			case METHOD_HANDLE: return 3; //Method handle
			case METHOD_TYPE: return 2; //Method type
			case INVOKE_DYNAMIC: return 4; //InvokeDynamic
			default: return 0;
		}
	}

	public Object get(int index) {
		return poolContent[index&0xFFFF];
	}
	public Object[] getPool() {
		return poolContent;
	}
	public int getSize() {
		return poolSize;
	}
	public ClassReader getReader() {
		return classReader;
	}
}