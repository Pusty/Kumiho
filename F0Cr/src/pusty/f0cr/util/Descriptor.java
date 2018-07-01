package pusty.f0cr.util;

public class Descriptor {
	// VOID = V
	// BOOLEAN = Z
	// CHAR = C
	// BYTE = B
	// SHORT = S
	// INT = I
	// FLOAT = F
	// LONG = J
	// DOUBLE = D
	// ARRAY= []
	// OBJECT = L<class>;
	// ELSE METHOD
	public static Class<?> getType(String str) {
		if(str.equalsIgnoreCase("V")) return void.class;
		else if(str.equalsIgnoreCase("Z")) return boolean.class;
		else if(str.equalsIgnoreCase("C")) return char.class;
		else if(str.equalsIgnoreCase("B")) return byte.class;
		else if(str.equalsIgnoreCase("S")) return short.class;
		else if(str.equalsIgnoreCase("I")) return int.class;
		else if(str.equalsIgnoreCase("F")) return float.class;
		else if(str.equalsIgnoreCase("J")) return long.class;
		else if(str.equalsIgnoreCase("D")) return double.class;
		else if(str.startsWith("[")) {
			try {
				return Class.forName(str.replace('/', '.'));
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
				return null;
			}
		}
		else if(str.startsWith("L")) {
			String n = str.substring(1, str.length()).split(";")[0].replace('/', '.');
			try {
				return Class.forName(n);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
				return null;
			}
		}
		return null;
	}
//	public static 
}
