package pusty.f0xC;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;

import pusty.f0xC.nodes.Node;

public class F0xUtil {
	
	
	/**
	 * TODO: Move this to a x86 specific location
	 * Returns a string containing the assembly parameter format for referencing a stack value through the frame pointer
	 * @param index the index of the stack value relative to the frame pointer
	 * @param count the amount of arguments for the current function on the stack
	 * @return a string referencing the stack memory
	 */
	public static String argB(int index,int count) {
		return "[regB+addrsize*"+((count-index)+1)+"]";
	}
	
	/**
	 * TODO: Move this to a x86 specific location
	 * Returns a string containing the assembly parameter format for referencing a stack value through the stack pointer
	 * @param index the index of the stack value relative to the stack pointer
	 * @param count the amount of arguments for the current function on the stack
	 * @return a string referencing the stack memory
	 */
	public static String argS(int index,int count) {
		return "[regS+addrsize*"+((count-index))+"]";
	}
	
	public static int convertedSize(String desc, int addrSize) {
		return convertedSize(convertedType(convertDescriptor(desc.charAt(0))),addrSize);
	}
	/**
	 * Convert Node Sizes to actual data sizes (size apply for JVM)
	 * @param i the size in node format
	 * @param addrSize the address size for this parser
	 * @return the new size in integer format
	 */
	public static int convertedSize(int i, int addrSize) {
		if(i == Node.ADDR) return addrSize;
		else if(i == Node.INT8) return 1;
		else if(i == Node.INT16) return 2;
		else if(i == Node.INT32) return 4;
		else if(i == Node.INT64) return 8;
		else if(i == Node.FLOAT) return 4;
		else if(i == Node.DOUBLE) return 8;
		else return 0;
	}
	
	
    public static final int ARRAY_TYPE_BOOLEAN = 4;
    public static final int ARRAY_TYPE_CHAR    = 5;
    public static final int ARRAY_TYPE_FLOAT   = 6;
    public static final int ARRAY_TYPE_DOUBLE  = 7;
    public static final int ARRAY_TYPE_BYTE    = 8;
    public static final int ARRAY_TYPE_SHORT   = 9;
    public static final int ARRAY_TYPE_INT     = 10;
    public static final int ARRAY_TYPE_LONG    = 11;
    public static final int ARRAY_TYPE_VOID    = 12;
	  
    
	public static int convertArrayType(int type) {
		if(type == ARRAY_TYPE_VOID)
			return Node.ADDR;
		if(type == ARRAY_TYPE_BOOLEAN)
			return Node.INT8;
		if(type == ARRAY_TYPE_BYTE)
			return Node.INT8;
		if(type == ARRAY_TYPE_CHAR)
			return Node.INT8;
		if(type == ARRAY_TYPE_SHORT)
			return Node.INT16;
		if(type == ARRAY_TYPE_INT)
			return Node.INT32;
		if(type == ARRAY_TYPE_LONG)
			return Node.INT64;
		if(type == ARRAY_TYPE_FLOAT)
			return Node.FLOAT;
		if(type == ARRAY_TYPE_DOUBLE)
			return Node.DOUBLE;
		return Node.UNKNOWN;
	}
	public static int convertedType(Class<?> c) {
		if(c == null) return Node.ADDR;
		else if(c == byte.class) return Node.INT8;
		else if(c == char.class) return Node.INT8;
		else if(c == boolean.class) return Node.INT8;
		else if(c == short.class) return Node.INT16;
		else if(c == int.class) return Node.INT32;
		else if(c == long.class) return Node.INT64;
		else if(c == float.class) return Node.FLOAT;
		else if(c == double.class) return Node.DOUBLE;
		else if(c == Array.class) return Node.ADDR;
		else if(c == Object.class) return Node.ADDR;
		else return Node.UNKNOWN;
	}
	
	public static int convertedType(Object o) {
		if(o == null) return Node.ADDR;
		else if(o instanceof Boolean) return Node.INT8;
		else if(o instanceof Byte) return Node.INT8;
		else if(o instanceof Character) return Node.INT8;
		else if(o instanceof Short) return Node.INT16;
		else if(o instanceof Integer) return Node.INT32;
		else if(o instanceof Long) return Node.INT64;
		else if(o instanceof Float) return Node.FLOAT;
		else if(o instanceof Double) return Node.DOUBLE;
		else if(o instanceof Array) return Node.ADDR;
		else if(o instanceof Object) return Node.ADDR;
		else return Node.ADDR;
	}
	
	public static Class<?> convertDescriptor(char desc) {
		if(desc == 'V') return null;
		else if(desc == 'Z') return boolean.class;
		else if(desc == 'C') return char.class;
		else if(desc == 'B') return byte.class;
		else if(desc == 'S') return short.class;
		else if(desc == 'I') return int.class;
		else if(desc == 'F') return float.class;
		else if(desc == 'J') return long.class;
		else if(desc == 'D') return double.class;
		else if(desc == '[') return Array.class;
		else if(desc == 'L') return Object.class;
		else return Method.class;
	}
	
	public static Class<?>[] convertFunctionDescriptor(String desc) {
		String variables = desc.split("\\x28")[1].split("\\x29")[0];
		String output = desc.split("\\x29")[1];
		ArrayList<Class<?>> list = new ArrayList<Class<?>>();
		for(int i=0;i<variables.length();i++) {
			if(variables.charAt(i) == '[') {
				list.add(convertDescriptor(variables.charAt(i)));
				if(variables.charAt(i+1) == 'L') {
					while(variables.charAt(i) != ';')
						i++;
				}else
					i++;
			}else if(variables.charAt(i) == 'L') {
				list.add(convertDescriptor(variables.charAt(i)));
				while(variables.charAt(i) != ';')
					i++;
			}else
				list.add(convertDescriptor(variables.charAt(i)));
		}
		list.add(convertDescriptor(output.charAt(0)));
		return list.toArray(new Class<?>[list.size()]);
	}
	
	public static int calcSizeDescriptor(Class<?>[] cl, int addrsize) {
		ArrayList<Integer> ilist = new ArrayList<Integer>();
		for(int i=0;i<cl.length-1;i++)
			ilist.add(F0xUtil.convertedType(cl[i]));
		return calcSize(ilist, addrsize, ilist.size());
	}
	public static int calcSize(ArrayList<Integer> li, int addrsize, int index) {
		int o = 0;
		for(int i=0;i<index;i++) {
			int le = li.get(i);
			o += le/addrsize;
			if(le%addrsize != 0)
				o += 1;
		}
		return o;
	}
	
	//helper function to reverse offsets to index
	//used to convert Java's fixed offsets to "sizeless" offsets that can be converted
	public static int calcIndex(ArrayList<Integer> li1,ArrayList<Integer> li2, int addrsize, int offset) {
		int o = 0;
		for(int i=0;i<li1.size();i++) {
			if(o == offset) return i;
			//int le = li1.get(i);
			o += 1;//le>=addrsize?le/addrsize:1;
		}
		for(int i=0;i<li2.size();i++) {
			if(o == offset) return li1.size()+i;
			//int le = li2.get(i);
			o += 1;//le>=addrsize?le/addrsize:1;
		}
		if(o == offset) return li1.size()+li2.size();
		System.err.println("F0xUtil@calcIndex something went wrong: "+li1+" "+li2+" <- "+offset+"("+o+")");
		return -1;
	}
	
}
