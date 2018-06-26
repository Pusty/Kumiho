package pusty.f0cr.data;

import java.io.DataInputStream;

import pusty.f0cr.ClassReader;

public class VerificationTypeInfo {

	/*
union verification_type_info {
    Top_variable_info;
    Integer_variable_info;
    Float_variable_info;
    Long_variable_info;
    Double_variable_info;
    Null_variable_info;
    UninitializedThis_variable_info;
    Object_variable_info;
    Uninitialized_variable_info;
}
    */
    
	protected byte tag;
	protected short cpool_index;
	protected short offset;
	
	protected ClassReader classReader;
	
	public VerificationTypeInfo(ClassReader classReader, DataInputStream s) throws Exception {
		this.classReader = classReader;
		read(s);
	}
	public final static int ITEM_Top=0,ITEM_Integer=1,ITEM_Float=2,ITEM_Long=4,ITEM_Double=3,ITEM_Null=5,ITEM_UninitializedThis=6,ITEM_Object=7,ITEM_Uninitialized=8;
	public void read(DataInputStream s) throws Exception {
		tag = s.readByte();
		switch(tag) {
			case ITEM_Top: /* Top_variable_info */
			case ITEM_Integer: /* Integer_variable_info */
			case ITEM_Float: /* Float_variable_info */
			case ITEM_Long: /* Long_variable_info */
				break;
			case ITEM_Double: /* Double_variable_info */
				break;
			case ITEM_Null: /* Null_variable_info */ 
				break;
			case ITEM_UninitializedThis: /* UninitializedThis_variable_info */
				break;
			case ITEM_Object: /* Object_variable_info */ 
				cpool_index = s.readShort();
				break;
			case ITEM_Uninitialized: /* Uninitialized_variable_info */
				offset = s.readShort();
				break;
		}
	}
	
	public byte getTag() {
		return tag;
	}
	public short getCPoolIndex() { return cpool_index; } /* Object_variable_info only */
	public short getOffset() { return offset; } /* Uninitialized_variable_info only */

}
