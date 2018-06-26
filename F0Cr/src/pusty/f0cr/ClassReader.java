package pusty.f0cr;

import java.io.DataInputStream;
import java.io.InputStream;

import pusty.f0cr.data.AttributeInfo;

/**
 * Reads a class as an object
 */
public class ClassReader {
	
	protected int magicNumber;
	protected int minorVersion;
	protected int majorVersion;
	protected ConstantPool constantPool;
	protected int accessFlags;
	protected int thisClassIndex;
	protected int superClassIndex;
	protected InterfaceTable interfaceTable;
	protected FieldTable fieldTable;
	protected MethodTable methodTable;
	protected AttributeTable attributeTable;
	/**
	 * Creates a new instance of class reading object
	 * @param is the input stream to read from
	 * @throws Exception reading from stream wasn't successful
	 */
	public ClassReader(InputStream is) throws Exception {
		DataInputStream dis = new DataInputStream(is);
		read(dis);
	}
	//TODO: add counter for current alignment to be able to check for switch statements
	/**
	 * Reads the input stream as content of this object
	 * @param s the data stream to read from
	 * @throws Exception an exception if f.e. the file hasn't the right magical number
	 */
	public void read(DataInputStream s) throws Exception {
		magicNumber = s.readInt();
		if(magicNumber!=0xCAFEBABE)throw new Exception("File isn't in class file format");
		minorVersion = s.readShort();
		majorVersion = s.readShort();
		constantPool = new ConstantPool(this, s);
		accessFlags = s.readShort();
		thisClassIndex = s.readShort();
		superClassIndex = s.readShort();
		interfaceTable = new InterfaceTable(this, s);
		fieldTable = new FieldTable(this, s);
		methodTable = new MethodTable(this, s);
		attributeTable = new AttributeTable(this, s);
	}
	/**
	 * Returns the minor version of this class
	 * @return the minor version this class was compiled with
	 */
	public int getMinorVersion() {
		return minorVersion;
	}
	/**
	 * Returns the major version of this class
	 * @return the major version this class was compiled with
	 */
	public int getMajorVersion() {
		return majorVersion;
	}
	/**
	 * Returns the access flags for this class
	 * @return the access flags for this class
	 */
	public int getAccessFlags() {
		return accessFlags;
	}
	/**
	 * Returns the constant pool index of this class
	 * @return a index within the constant pool which represents the this class
	 */
	public int getThisClassIndex() {
		return thisClassIndex;
	}
	
	/**
	 * Returns the constant pool index of the super class
	 * @return a index within the constant pool which represents the super class
	 */
	public int getSuperClassIndex() {
		return superClassIndex;
	}

	/**
	 * Returns a table containing all interfaces of this class
	 * @return a table containing all inferfaces this class
	 */
	public InterfaceTable getInterfaceTable() {
		return interfaceTable;
	}
	
	/**
	 * Returns a table containing all fields of this class
	 * @return a table containing all global variables this class
	 */
	public FieldTable getFieldTable() {
		return fieldTable;
	}
	/**
	 * Returns a table containing all attributes of this class
	 * @return a table containing all meta data about this class
	 */
	public AttributeTable getAttributeTable() {
		return attributeTable;
	}
	/**
	 * Returns the method table of this class
	 * @return a table containing all functions/methods of this class
	 */
	public MethodTable getMethodTable() {
		return methodTable;
	}
	/**
	 * Returns Source File Name if found
	 * @return the name of the source file of this class (SourceFileAttribute)
	 */
	public String getSourceFile() {
		for(int i=0;i<attributeTable.getSize();i++) {
			AttributeInfo at = attributeTable.getIndexes()[i];
			if(constantPool.get(at.getAttributeNameIndex()).toString().equals("SourceFile"))
				return at.getInfo().toString();
		} return null;
	}
	/**
	 * Returns Class Path to this class
	 * @return returns content off thisClassIndex element within the constant pool
	 */
	public String getClassName() {
		return constantPool.get(thisClassIndex).toString();
	}
	/**
	 * Returns the constant pool of this class
	 * @return an object containing all relevant data of this class
	 */
	public ConstantPool getPool() {
		return constantPool;
	}
}
