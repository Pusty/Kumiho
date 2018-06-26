package pusty.f0cr.inst;

import pusty.f0cr.ConstantPool;

public class Opcodes {
    public static final int NOP = 0; 
    public static final int ACONST_NULL = 1; //CONSTANT
    public static final int ICONST_M1 = 2; //CONSTANT
    public static final int ICONST_0 = 3; //CONSTANT
    public static final int ICONST_1 = 4; //CONSTANT
    public static final int ICONST_2 = 5; //CONSTANT
    public static final int ICONST_3 = 6; //CONSTANT
    public static final int ICONST_4 = 7; //CONSTANT
    public static final int ICONST_5 = 8; //CONSTANT
    public static final int LCONST_0 = 9; //CONSTANT
    public static final int LCONST_1 = 10; //CONSTANT
    public static final int FCONST_0 = 11; //CONSTANT
    public static final int FCONST_1 = 12; //CONSTANT
    public static final int FCONST_2 = 13; //CONSTANT
    public static final int DCONST_0 = 14; //CONSTANT
    public static final int DCONST_1 = 15; //CONSTANT
    public static final int BIPUSH = 16; //CONSTANT
    public static final int SIPUSH = 17; //CONSTANT
    public static final int LDC = 18; //CONSTANT
    public static final int LDC_W = 19; //CONSTANT
    public static final int LDC2_W = 20; //CONSTANT
    public static final int ILOAD = 21; //LOCALVAR
    public static final int LLOAD = 22;  //LOCALVAR
    public static final int FLOAD = 23; //LOCALVAR
    public static final int DLOAD = 24; //LOCALVAR
    public static final int ALOAD = 25; //LOCALVAR
    public static final int ILOAD_0 = 26; //LOCALVAR
    public static final int ILOAD_1 = 27; //LOCALVAR
    public static final int ILOAD_2 = 28; //LOCALVAR
    public static final int ILOAD_3 = 29; //LOCALVAR
    public static final int LLOAD_0 = 30; //LOCALVAR
    public static final int LLOAD_1 = 31; //LOCALVAR
    public static final int LLOAD_2 = 32; //LOCALVAR
    public static final int LLOAD_3 = 33; //LOCALVAR
    public static final int FLOAD_0 = 34; //LOCALVAR
    public static final int FLOAD_1 = 35; //LOCALVAR
    public static final int FLOAD_2 = 36; //LOCALVAR
    public static final int FLOAD_3 = 37; //LOCALVAR
    public static final int DLOAD_0 = 38; //LOCALVAR
    public static final int DLOAD_1 = 39; //LOCALVAR
    public static final int DLOAD_2 = 40; //LOCALVAR
    public static final int DLOAD_3 = 41; //LOCALVAR
    public static final int ALOAD_0 = 42; //LOCALVAR
    public static final int ALOAD_1 = 43; //LOCALVAR
    public static final int ALOAD_2 = 44; //LOCALVAR
    public static final int ALOAD_3 = 45; //LOCALVAR
    public static final int IALOAD = 46; //AVAR
    public static final int LALOAD = 47; //AVAR
    public static final int FALOAD = 48; //AVAR
    public static final int DALOAD = 49; //AVAR
    public static final int AALOAD = 50; //AVAR
    public static final int BALOAD = 51; //AVAR
    public static final int CALOAD = 52; //AVAR
    public static final int SALOAD = 53; //AVAR
    public static final int ISTORE = 54; //LOCALVAR
    public static final int LSTORE = 55; //LOCALVAR
    public static final int FSTORE = 56; //LOCALVAR
    public static final int DSTORE = 57; //LOCALVAR
    public static final int ASTORE = 58; //LOCALVAR
    public static final int ISTORE_0 = 59; //LOCALVAR
    public static final int ISTORE_1 = 60; //LOCALVAR
    public static final int ISTORE_2 = 61; //LOCALVAR
    public static final int ISTORE_3 = 62; //LOCALVAR
    public static final int LSTORE_0 = 63; //LOCALVAR
    public static final int LSTORE_1 = 64; //LOCALVAR
    public static final int LSTORE_2 = 65; //LOCALVAR
    public static final int LSTORE_3 = 66; //LOCALVAR
    public static final int FSTORE_0 = 67; //LOCALVAR
    public static final int FSTORE_1 = 68; //LOCALVAR
    public static final int FSTORE_2 = 69; //LOCALVAR
    public static final int FSTORE_3 = 70; //LOCALVAR
    public static final int DSTORE_0 = 71; //LOCALVAR
    public static final int DSTORE_1 = 72; //LOCALVAR
    public static final int DSTORE_2 = 73; //LOCALVAR
    public static final int DSTORE_3 = 74; //LOCALVAR
    public static final int ASTORE_0 = 75; //LOCALVAR
    public static final int ASTORE_1 = 76; //LOCALVAR
    public static final int ASTORE_2 = 77; //LOCALVAR
    public static final int ASTORE_3 = 78; //LOCALVAR
    public static final int IASTORE = 79; //AVAR
    public static final int LASTORE = 80; //AVAR
    public static final int FASTORE = 81; //AVAR
    public static final int DASTORE = 82; //AVAR
    public static final int AASTORE = 83; //AVAR
    public static final int BASTORE = 84; //AVAR
    public static final int CASTORE = 85; //AVAR
    public static final int SASTORE = 86; //AVAR
    public static final int POP = 87; //STACK
    public static final int POP2 = 88; //STACK
    public static final int DUP = 89; //STACK
    public static final int DUP_X1 = 90; //STACK
    public static final int DUP_X2 = 91; //STACK
    public static final int DUP2 = 92; //STACK
    public static final int DUP2_X1 = 93; //STACK
    public static final int DUP2_X2 = 94; //STACK
    public static final int SWAP = 95; //STACK
    public static final int IADD = 96;  //MATH
    public static final int LADD = 97; //MATH
    public static final int FADD = 98; //MATH
    public static final int DADD = 99; //MATH
    public static final int ISUB = 100; //MATH
    public static final int LSUB = 101; //MATH
    public static final int FSUB = 102; //MATH
    public static final int DSUB = 103; //MATH
    public static final int IMUL = 104; //MATH
    public static final int LMUL = 105; //MATH
    public static final int FMUL = 106; //MATH
    public static final int DMUL = 107; //MATH
    public static final int IDIV = 108; //MATH
    public static final int LDIV = 109; //MATH
    public static final int FDIV = 110; //MATH
    public static final int DDIV = 111; //MATH
    public static final int IREM = 112; //MATH
    public static final int LREM = 113; //MATH
    public static final int FREM = 114; //MATH
    public static final int DREM = 115; //MATH
    public static final int INEG = 116; //MATH
    public static final int LNEG = 117; //MATH
    public static final int FNEG = 118; //MATH
    public static final int DNEG = 119; //MATH
    public static final int ISHL = 120; //MATH
    public static final int LSHL = 121; //MATH
    public static final int ISHR = 122; //MATH
    public static final int LSHR = 123; //MATH
    public static final int IUSHR = 124; //MATH
    public static final int LUSHR = 125; //MATH
    public static final int IAND = 126; //MATH
    public static final int LAND = 127; //MATH
    public static final int IOR = 128; //MATH
    public static final int LOR = 129; //MATH
    public static final int IXOR = 130; //MATH
    public static final int LXOR = 131; //MATH
    public static final int IINC = 132; //MATH
    public static final int I2L = 133; //CONVERT
    public static final int I2F = 134; //CONVERT
    public static final int I2D = 135; //CONVERT
    public static final int L2I = 136; //CONVERT
    public static final int L2F = 137; //CONVERT
    public static final int L2D = 138; //CONVERT
    public static final int F2I = 139; //CONVERT
    public static final int F2L = 140; //CONVERT
    public static final int F2D = 141; //CONVERT
    public static final int D2I = 142; //CONVERT
    public static final int D2L = 143; //CONVERT
    public static final int D2F = 144; //CONVERT
    public static final int I2B = 145; //CONVERT
    public static final int I2C = 146; //CONVERT
    public static final int I2S = 147; //CONVERT
    public static final int LCMP = 148; //COMPARE
    public static final int FCMPL = 149; //COMPARE
    public static final int FCMPG = 150; //COMPARE
    public static final int DCMPL = 151; //COMPARE
    public static final int DCMPG = 152; //COMPARE
    public static final int IFEQ = 153; //BRANCH
    public static final int IFNE = 154; //BRANCH
    public static final int IFLT = 155; //BRANCH
    public static final int IFGE = 156; //BRANCH
    public static final int IFGT = 157; //BRANCH
    public static final int IFLE = 158; //BRANCH
    public static final int IF_ICMPEQ = 159; //BRANCH
    public static final int IF_ICMPNE = 160; //BRANCH
    public static final int IF_ICMPLT = 161; //BRANCH
    public static final int IF_ICMPGE = 162; //BRANCH
    public static final int IF_ICMPGT = 163; //BRANCH
    public static final int IF_ICMPLE = 164; //BRANCH
    public static final int IF_ACMPEQ = 165; //BRANCH
    public static final int IF_ACMPNE = 166; //BRANCH
    public static final int GOTO = 167; //BRANCH
    public static final int JSR = 168; //BRANCH
    public static final int RET = 169; //BRANCH
    public static final int TABLESWITCH = 170; /**TODO: TABLE STUFF*/
    public static final int LOOKUPSWITCH = 171; 
    public static final int IRETURN = 172; //BRANCH /**TODO: MAYBE SPLIT BRANCH AND RETURN */
    public static final int LRETURN = 173; //BRANCH
    public static final int FRETURN = 174; //BRANCH
    public static final int DRETURN = 175; //BRANCH
    public static final int ARETURN = 176; //BRANCH
    public static final int RETURN = 177; //BRANCH
    public static final int GETSTATIC = 178; //VAR
    public static final int PUTSTATIC = 179; //VAR
    public static final int GETFIELD = 180; //VAR
    public static final int PUTFIELD = 181; //VAR
    public static final int INVOKEVIRTUAL = 182; //BRANCH
    public static final int INVOKESPECIAL = 183; //BRANCH
    public static final int INVOKESTATIC = 184; //BRANCH
    public static final int INVOKEINTERFACE = 185; //BRANCH
    public static final int INVOKEDYNAMIC = 186; //BRANCH
    public static final int NEW = 187; 
    public static final int NEWARRAY = 188; 
    public static final int ANEWARRAY = 189; 
    public static final int ARRAYLENGTH = 190;
    public static final int ATHROW = 191; //STACK
    public static final int CHECKCAST = 192; 
    public static final int INSTANCEOF = 193; //COMPARE
    public static final int MONITORENTER = 194; 
    public static final int MONITOREXIT = 195; 
    public static final int WIDE = 196;
    public static final int MULTIANEWARRAY = 197; 
    public static final int IFNULL = 198; //BRANCH
    public static final int IFNONNULL = 199; //BRANCH
    public static final int GOTO_W = 200; //BRANCH
    public static final int JSR_W = 201; //BRANCH
    
    public static int getSize(byte b) {
    	int value = b&0xFF;
    	switch(value) {
    		case ALOAD:
    		case ASTORE:
    		case BIPUSH:
    		case DLOAD:
    		case DSTORE:
    		case FLOAD:
    		case FSTORE:
    		case ILOAD:
    		case ISTORE:
    		case LDC:
    		case LLOAD:
    		case LSTORE:
    		case NEWARRAY:
    		case RET:
    			return 1;
    		case ANEWARRAY:
    		case CHECKCAST:
    		case GETFIELD:
    		case GETSTATIC:
    		case GOTO:
    		case IFEQ:
 	        case IFNE:
 	        case IFLT:
 	        case IFGE:
 	        case IFGT:
 	        case IFLE:
 	        case IF_ICMPEQ:
 	        case IF_ICMPNE:
 	        case IF_ICMPLT:
 	        case IF_ICMPGE:
 	        case IF_ICMPGT:
 	        case IF_ICMPLE:
 	        case IF_ACMPEQ:
 	        case IF_ACMPNE:
	        case IFNULL:
	        case IFNONNULL: 
	        case IINC:
	        case INSTANCEOF:
	        case INVOKESPECIAL:
	        case INVOKESTATIC:
	        case INVOKEVIRTUAL:
	        case JSR:
	        case LDC_W:
	        case LDC2_W:
	        case NEW:
	        case PUTFIELD:
	        case PUTSTATIC:
	        case SIPUSH:
    			return 2;
    		case MULTIANEWARRAY:
    			return 3;
    		case GOTO_W:
    		case INVOKEDYNAMIC:
    		case INVOKEINTERFACE:
    		case JSR_W:
    			return 4;
    		default: return 0;
    	}
    }
    
    public static String getName(byte b) {
    	int value = b&0xFF;
    	switch(value) {
	        case NOP: return "NOP";  
	        case ACONST_NULL: return "ACONST_NULL";  
	        case ICONST_M1: return "ICONST_M1";  
	        case ICONST_0: return "ICONST_0";  
	        case ICONST_1: return "ICONST_1";  
	        case ICONST_2: return "ICONST_2";  
	        case ICONST_3: return "ICONST_3";  
	        case ICONST_4: return "ICONST_4";  
	        case ICONST_5: return "ICONST_5";  
	        case LCONST_0: return "LCONST_0";  
	        case LCONST_1: return "LCONST_1";  
	        case FCONST_0: return "FCONST_0";  
	        case FCONST_1: return "FCONST_1";  
	        case FCONST_2: return "FCONST_2";  
	        case DCONST_0: return "DCONST_0";  
	        case DCONST_1: return "DCONST_1";  
	        case BIPUSH: return "BIPUSH";  
	        case SIPUSH: return "SIPUSH";  
	        case LDC: return "LDC";  
	        case LDC_W: return "LDC_W";  
	        case LDC2_W: return "LDC2_W";  
	        case ILOAD: return "ILOAD";  
	        case LLOAD: return "LLOAD";  
	        case FLOAD: return "FLOAD";  
	        case DLOAD: return "DLOAD";  
	        case ALOAD: return "ALOAD";  
	        case ILOAD_0: return "ILOAD_0";  
	        case ILOAD_1: return "ILOAD_1";  
	        case ILOAD_2: return "ILOAD_2";  
	        case ILOAD_3: return "ILOAD_3";  
	        case LLOAD_0: return "LLOAD_0";  
	        case LLOAD_1: return "LLOAD_1";  
	        case LLOAD_2: return "LLOAD_2";  
	        case LLOAD_3: return "LLOAD_3";  
	        case FLOAD_0: return "FLOAD_0";  
	        case FLOAD_1: return "FLOAD_1";  
	        case FLOAD_2: return "FLOAD_2";  
	        case FLOAD_3: return "FLOAD_3";  
	        case DLOAD_0: return "DLOAD_0";  
	        case DLOAD_1: return "DLOAD_1";  
	        case DLOAD_2: return "DLOAD_2";  
	        case DLOAD_3: return "DLOAD_3";  
	        case ALOAD_0: return "ALOAD_0";  
	        case ALOAD_1: return "ALOAD_1";  
	        case ALOAD_2: return "ALOAD_2";  
	        case ALOAD_3: return "ALOAD_3";  
	        case IALOAD: return "IALOAD";  
	        case LALOAD: return "LALOAD";  
	        case FALOAD: return "FALOAD";  
	        case DALOAD: return "DALOAD";  
	        case AALOAD: return "AALOAD";  
	        case BALOAD: return "BALOAD";  
	        case CALOAD: return "CALOAD";  
	        case SALOAD: return "SALOAD";  
	        case ISTORE: return "ISTORE";  
	        case LSTORE: return "LSTORE";  
	        case FSTORE: return "FSTORE";  
	        case DSTORE: return "DSTORE";  
	        case ASTORE: return "ASTORE";  
	        case ISTORE_0: return "ISTORE_0";  
	        case ISTORE_1: return "ISTORE_1";  
	        case ISTORE_2: return "ISTORE_2";  
	        case ISTORE_3: return "ISTORE_3";  
	        case LSTORE_0: return "LSTORE_0";  
	        case LSTORE_1: return "LSTORE_1";  
	        case LSTORE_2: return "LSTORE_2";  
	        case LSTORE_3: return "LSTORE_3";  
	        case FSTORE_0: return "FSTORE_0";  
	        case FSTORE_1: return "FSTORE_1";  
	        case FSTORE_2: return "FSTORE_2";  
	        case FSTORE_3: return "FSTORE_3";  
	        case DSTORE_0: return "DSTORE_0";  
	        case DSTORE_1: return "DSTORE_1";  
	        case DSTORE_2: return "DSTORE_2";  
	        case DSTORE_3: return "DSTORE_3";  
	        case ASTORE_0: return "ASTORE_0";  
	        case ASTORE_1: return "ASTORE_1";  
	        case ASTORE_2: return "ASTORE_2";  
	        case ASTORE_3: return "ASTORE_3";  
	        case IASTORE: return "IASTORE";  
	        case LASTORE: return "LASTORE";  
	        case FASTORE: return "FASTORE";  
	        case DASTORE: return "DASTORE";  
	        case AASTORE: return "AASTORE";  
	        case BASTORE: return "BASTORE";  
	        case CASTORE: return "CASTORE";  
	        case SASTORE: return "SASTORE";  
	        case POP: return "POP";  
	        case POP2: return "POP2";  
	        case DUP: return "DUP";  
	        case DUP_X1: return "DUP_X1";  
	        case DUP_X2: return "DUP_X2";  
	        case DUP2: return "DUP2";  
	        case DUP2_X1: return "DUP2_X1";  
	        case DUP2_X2: return "DUP2_X2";  
	        case SWAP: return "SWAP";  
	        case IADD: return "IADD";  
	        case LADD: return "LADD";  
	        case FADD: return "FADD";  
	        case DADD: return "DADD";  
	        case ISUB: return "ISUB";  
	        case LSUB: return "LSUB";  
	        case FSUB: return "FSUB";  
	        case DSUB: return "DSUB";  
	        case IMUL: return "IMUL";  
	        case LMUL: return "LMUL";  
	        case FMUL: return "FMUL";  
	        case DMUL: return "DMUL";  
	        case IDIV: return "IDIV";  
	        case LDIV: return "LDIV";  
	        case FDIV: return "FDIV";  
	        case DDIV: return "DDIV";  
	        case IREM: return "IREM";  
	        case LREM: return "LREM";  
	        case FREM: return "FREM";  
	        case DREM: return "DREM";  
	        case INEG: return "INEG";  
	        case LNEG: return "LNEG";  
	        case FNEG: return "FNEG";  
	        case DNEG: return "DNEG";  
	        case ISHL: return "ISHL";  
	        case LSHL: return "LSHL";  
	        case ISHR: return "ISHR";  
	        case LSHR: return "LSHR";  
	        case IUSHR: return "IUSHR";  
	        case LUSHR: return "LUSHR";  
	        case IAND: return "IAND";  
	        case LAND: return "LAND";  
	        case IOR: return "IOR";  
	        case LOR: return "LOR";  
	        case IXOR: return "IXOR";  
	        case LXOR: return "LXOR";  
	        case IINC: return "IINC"; 
	        case I2L: return "I2L";  
	        case I2F: return "I2F";  
	        case I2D: return "I2D";  
	        case L2I: return "L2I";  
	        case L2F: return "L2F";  
	        case L2D: return "L2D";  
	        case F2I: return "F2I";  
	        case F2L: return "F2L";  
	        case F2D: return "F2D";  
	        case D2I: return "D2I";  
	        case D2L: return "D2L";  
	        case D2F: return "D2F";  
	        case I2B: return "I2B";  
	        case I2C: return "I2C";  
	        case I2S: return "I2S"; 
	        case LCMP: return "LCMP";  
	        case FCMPL: return "FCMPL";  
	        case FCMPG: return "FCMPG";  
	        case DCMPL: return "DCMPL";  
	        case DCMPG: return "DCMPG";  
	        case IFEQ: return "IFEQ";  
	        case IFNE: return "IFNE";  
	        case IFLT: return "IFLT";  
	        case IFGE: return "IFGE";  
	        case IFGT: return "IFGT";  
	        case IFLE: return "IFLE";  
	        case IF_ICMPEQ: return "IF_ICMPEQ";  
	        case IF_ICMPNE: return "IF_ICMPNE"; 
	        case IF_ICMPLT: return "IF_ICMPLT";  
	        case IF_ICMPGE: return "IF_ICMPGE";  
	        case IF_ICMPGT: return "IF_ICMPGT";  
	        case IF_ICMPLE: return "IF_ICMPLE";  
	        case IF_ACMPEQ: return "IF_ACMPEQ";  
	        case IF_ACMPNE: return "IF_ACMPNE";  
	        case GOTO: return "GOTO";  
	        case JSR: return "JSR";  
	        case RET: return "RET";  
	        case TABLESWITCH: return "TABLESWITCH";  
	        case LOOKUPSWITCH: return "LOOKUPSWITCH";  
	        case IRETURN: return "IRETURN";  
	        case LRETURN: return "LRETURN";  
	        case FRETURN: return "FRETURN";  
	        case DRETURN: return "DRETURN";  
	        case ARETURN: return "ARETURN";  
	        case RETURN: return "RETURN";  
	        case GETSTATIC: return "GETSTATIC";  
	        case PUTSTATIC: return "PUTSTATIC";  
	        case GETFIELD: return "GETFIELD";  
	        case PUTFIELD: return "PUTFIELD";  
	        case INVOKEVIRTUAL: return "INVOKEVIRTUAL";  
	        case INVOKESPECIAL: return "INVOKESPECIAL";  
	        case INVOKESTATIC: return "INVOKESTATIC";  
	        case INVOKEINTERFACE: return "INVOKEINTERFACE";  
	        case INVOKEDYNAMIC: return "INVOKEDYNAMIC";  
	        case NEW: return "NEW";  
	        case NEWARRAY: return "NEWARRAY";  
	        case ANEWARRAY: return "ANEWARRAY";  
	        case ARRAYLENGTH: return "ARRAYLENGTH";  
	        case ATHROW: return "ATHROW";  
	        case CHECKCAST: return "CHECKCAST";  
	        case INSTANCEOF: return "INSTANCEOF";  
	        case MONITORENTER: return "MONITORENTER";  
	        case MONITOREXIT: return "MONITOREXIT";  
	        case WIDE: return "WIDE"; 
	        case MULTIANEWARRAY: return "MULTIANEWARRAY";  
	        case IFNULL: return "IFNULL";  
	        case IFNONNULL: return "IFNONNULL";  
	        case GOTO_W: return "GOTO_W";  
	        case JSR_W: return "JSR_W"; 
	        default: return "UNKNOWN";
    	}
    }

	public static String formatData(ConstantPool pool, byte b, byte[] data) {
		int value = b&0xFF;
		String temp = "";
    	switch(value) {
    		case LDC:
    			return pool.get(data[0]&0xFF).toString();
    		case ALOAD:
    		case ASTORE:
    		case DLOAD:
    		case DSTORE:
    		case FLOAD:
    		case FSTORE:
    		case ILOAD:
    		case ISTORE:
    		case NEWARRAY:
    		case BIPUSH:
    		case LLOAD:
    		case LSTORE:
    		case RET:
    			return Integer.toString(data[0]&0xFF);
    		case ANEWARRAY:
    		case CHECKCAST:
    		case GETFIELD:
    		case GETSTATIC:
	        case INSTANCEOF:
	        case INVOKESPECIAL:
	        case INVOKESTATIC:
	        case INVOKEVIRTUAL:
	        case LDC_W:
	        case LDC2_W:
	        case NEW:
	        case PUTFIELD:
	        case PUTSTATIC:
    			return pool.get(((data[0]&0xFF) << 8)+(data[1]&0xFF)).toString();
	        case SIPUSH:
	        	return Integer.toString(((data[0]&0xFF) << 8) + data[1]&0xFF);
	        case JSR:
	   		case GOTO:
    		case IFEQ:
 	        case IFNE:
 	        case IFLT:
 	        case IFGE:
 	        case IFGT:
 	        case IFLE:
 	        case IF_ICMPEQ:
 	        case IF_ICMPNE:
 	        case IF_ICMPLT:
 	        case IF_ICMPGE:
 	        case IF_ICMPGT:
 	        case IF_ICMPLE:
 	        case IF_ACMPEQ:
 	        case IF_ACMPNE:
	        case IFNULL:
	        case IFNONNULL:
	        	return "Line: "+Integer.toString(((data[0]&0xFF) << 8) + data[1]&0xFF);
	        case IINC:
	        	return (data[0]&0xFF)+" "+(data[1]&0xFF);
    		case MULTIANEWARRAY:
    			return pool.get(((data[0]&0xFF) << 8) + data[1]&0xFF).toString()+" "+(data[2]&0xFF);
    		case INVOKEDYNAMIC:
    		case INVOKEINTERFACE:
    			return  pool.get(((data[0]&0xFF) << 8) + data[1]&0xFF).toString()+" "+(data[2]&0xFF)+" "+(data[3]&0xFF);
    		case JSR_W:
    		case GOTO_W:
    			return  "Line: "+Integer.toString(((data[0]&0xFF) << 24) + ((data[1]&0xFF) << 16) + ((data[2]&0xFF) << 8) + data[3]&0xFF);
    		case LOOKUPSWITCH:
    			temp = "{ \n";
    			temp = temp+"	default: "+Integer.toString((data[0] << 24) + (data[1] << 16) + (data[2] << 8) + data[3])+"\n";
    			temp = temp+"		count: "+Integer.toString((data[4+0] << 24) + (data[4+1] << 16) + (data[4+2] << 8) + data[4+3])+"\n";
    			for(int i=0;i<((data[4+0] << 24) + (data[4+1] << 16) + (data[4+2] << 8) + data[4+3]);i++) {
    				temp = temp+"		  "+((data[8+0+i*8] << 24) + (data[8+1+i*8] << 16) + (data[8+2+i*8] << 8) + data[8+3+i*8])+": "+((data[8+4+i*8] << 24) + (data[8+5+i*8] << 16) + (data[8+6+i*8] << 8) + data[8+7+i*8])+"\n";
    			}
    			temp = temp + "}";
    			return temp;
    		case TABLESWITCH:
    			temp = "{ \n";
    			temp = temp+"	default: "+Integer.toString((data[0] << 24) + (data[1] << 16) + (data[2] << 8) + data[3])+"\n";
    			temp = temp+"		min: "+Integer.toString((data[4+0] << 24) + (data[4+1] << 16) + (data[4+2] << 8) + data[4+3])+"\n";
    			temp = temp+"		max: "+Integer.toString((data[8+0] << 24) + (data[8+1] << 16) + (data[8+2] << 8) + data[8+3])+"\n";
    			for(int i=0;i<((data.length-12)/4);i++) {
    				temp = temp+"		  "+(((data[4+0] << 24) + (data[4+1] << 16) + (data[4+2] << 8) + data[4+3])+i)+": "+Integer.toString((data[12+i*4+0] << 24) + (data[12+i*4+1] << 16) + (data[12+i*4+2] << 8) + data[12+i*4+3])+"\n";
    			}
    			temp = temp + "}";
    			return temp;
    		case WIDE:
    			if(data[0]==Opcodes.IINC)
    				return getName(data[0])+" "+Short.toString((short) ((data[1] << 8) + data[2]))+" "+Short.toString((short) ((data[3] << 8) + data[4]));
    			else
    				return getName(data[0])+" "+Short.toString((short) ((data[1] << 8) + data[2]));
    		default: return "";
    	}
	}
}
