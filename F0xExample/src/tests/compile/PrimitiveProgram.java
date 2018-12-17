package tests.compile;

public class PrimitiveProgram {

	public boolean instVarBoolean;
	public byte instVarByte;
	public char instVarChar;
	public short instVarShort;
	public int instVarInt;
	public long instVarLong;
	public float instVarFloat;
	public double instVarDouble;

	public static boolean varBoolean;
	public static byte varByte;
	public static char varChar;
	public static short varShort;
	public static int varInt;
	public static long varLong;
	public static float varFloat;
	public static double varDouble;

	// Static getters

	public static boolean getStaticBoolean() {
		return varBoolean;
	}

	public static byte getStaticByte() {
		return varByte;
	}

	public static char getStaticChar() {
		return varChar;
	}

	public static short getStaticShort() {
		return varShort;
	}

	public static int getStaticInt() {
		return varInt;
	}

	public static long getStaticLong() {
		return varLong;
	}

	public static float getStaticFloat() {
		return varFloat;
	}

	public static double getStaticDouble() {
		return varDouble;
	}

	// Static Setters

	public static void setStaticBoolean(boolean i) {
		varBoolean = i;
	}

	public static void setStaticByte(byte i) {
		varByte = i;
	}

	public static void setStaticChar(char i) {
		varChar = i;
	}

	public static void setStaticShort(short i) {
		varShort = i;
	}

	public static void setStaticInt(int i) {
		varInt = i;
	}

	public static void setStaticLong(long i) {
		varLong = i;
	}

	public static void setStaticFloat(float i) {
		varFloat = i;
	}

	public static void setStaticDouble(long i) {
		varDouble = i;
	}

	// Static getters

	public boolean getBoolean() {
		return instVarBoolean;
	}

	public byte getByte() {
		return instVarByte;
	}

	public char getChar() {
		return instVarChar;
	}

	public short getShort() {
		return instVarShort;
	}

	public int getInt() {
		return instVarInt;
	}

	public long getLong() {
		return instVarLong;
	}

	public float getFloat() {
		return instVarFloat;
	}

	public double getDouble() {
		return instVarDouble;
	}

	// Non Static Setters

	public void setBoolean(boolean i) {
		instVarBoolean = i;
	}

	public void setByte(byte i) {
		instVarByte = i;
	}

	public void setChar(char i) {
		instVarChar = i;
	}

	public void setShort(short i) {
		instVarShort = i;
	}

	public void setInt(int i) {
		instVarInt = i;
	}

	public void setLong(long i) {
		instVarLong = i;
	}

	public void setFloat(float i) {
		instVarFloat = i;
	}

	public void setDouble(long i) {
		instVarDouble = i;
	}

	// Math:

	public static int minusByte(byte a) {
		return (-a);
	}

	public static int notByte(byte a) {
		return (~a);
	}

	public static int addByteByte(byte a, byte b) {
		return (a + b);
	}

	public static int addByteChar(byte a, char b) {
		return (a + b);
	}

	public static int addByteShort(byte a, short b) {
		return (a + b);
	}

	public static int addByteInt(byte a, int b) {
		return (a + b);
	}

	public static long addByteLong(byte a, long b) {
		return (a + b);
	}

	public static float addByteShort(byte a, float b) {
		return (a + b);
	}

	public static double addByteInt(byte a, double b) {
		return (a + b);
	}

	public static int subByteByte(byte a, byte b) {
		return (a - b);
	}

	public static int subByteChar(byte a, char b) {
		return (a - b);
	}

	public static int subByteShort(byte a, short b) {
		return (a - b);
	}

	public static int subByteInt(byte a, int b) {
		return (a - b);
	}

	public static long subByteLong(byte a, long b) {
		return (a - b);
	}

	public static float subByteShort(byte a, float b) {
		return (a - b);
	}

	public static double subByteInt(byte a, double b) {
		return (a - b);
	}

	public static int mulByteByte(byte a, byte b) {
		return (a * b);
	}

	public static int mulByteChar(byte a, char b) {
		return (a * b);
	}

	public static int mulByteShort(byte a, short b) {
		return (a * b);
	}

	public static int mulByteInt(byte a, int b) {
		return (a * b);
	}

	public static long mulByteLong(byte a, long b) {
		return (a * b);
	}

	public static float mulByteShort(byte a, float b) {
		return (a * b);
	}

	public static double mulByteInt(byte a, double b) {
		return (a * b);
	}

	public static int divByteByte(byte a, byte b) {
		return (a / b);
	}

	public static int divByteChar(byte a, char b) {
		return (a / b);
	}

	public static int divByteShort(byte a, short b) {
		return (a / b);
	}

	public static int divByteInt(byte a, int b) {
		return (a / b);
	}

	public static long divByteLong(byte a, long b) {
		return (a / b);
	}

	public static float divByteShort(byte a, float b) {
		return (a / b);
	}

	public static double divByteInt(byte a, double b) {
		return (a / b);
	}

	public static int modByteByte(byte a, byte b) {
		return (a % b);
	}

	public static int modByteChar(byte a, char b) {
		return (a % b);
	}

	public static int modByteShort(byte a, short b) {
		return (a % b);
	}

	public static int modByteInt(byte a, int b) {
		return (a % b);
	}

	public static long modByteLong(byte a, long b) {
		return (a % b);
	}

	public static float modByteShort(byte a, float b) {
		return (a % b);
	}

	public static double modByteInt(byte a, double b) {
		return (a % b);
	}

	public static int shlByteByte(byte a, byte b) {
		return (a << b);
	}

	public static int shlByteChar(byte a, char b) {
		return (a << b);
	}

	public static int shlByteShort(byte a, short b) {
		return (a << b);
	}

	public static int shlByteInt(byte a, int b) {
		return (a << b);
	}

	public static long shlByteLong(byte a, long b) {
		return (a << b);
	}

	public static int sarByteByte(byte a, byte b) {
		return (a >> b);
	}

	public static int sarByteChar(byte a, char b) {
		return (a >> b);
	}

	public static int sarByteShort(byte a, short b) {
		return (a >> b);
	}

	public static int sarByteInt(byte a, int b) {
		return (a >> b);
	}

	public static long sarByteLong(byte a, long b) {
		return (a >> b);
	}

	public static int shrByteByte(byte a, byte b) {
		return (a >>> b);
	}

	public static int shrByteChar(byte a, char b) {
		return (a >>> b);
	}

	public static int shrByteShort(byte a, short b) {
		return (a >>> b);
	}

	public static int shrByteInt(byte a, int b) {
		return (a >>> b);
	}

	public static long shrByteLong(byte a, long b) {
		return (a >>> b);
	}

	public static int orByteByte(byte a, byte b) {
		return (a | b);
	}

	public static int orByteChar(byte a, char b) {
		return (a | b);
	}

	public static int orByteShort(byte a, short b) {
		return (a | b);
	}

	public static int orByteInt(byte a, int b) {
		return (a | b);
	}

	public static long orByteLong(byte a, long b) {
		return (a | b);
	}

	public static int andByteByte(byte a, byte b) {
		return (a & b);
	}

	public static int andByteChar(byte a, char b) {
		return (a & b);
	}

	public static int andByteShort(byte a, short b) {
		return (a & b);
	}

	public static int andByteInt(byte a, int b) {
		return (a & b);
	}

	public static long andByteLong(byte a, long b) {
		return (a & b);
	}

	public static int xorByteByte(byte a, byte b) {
		return (a ^ b);
	}

	public static int xorByteChar(byte a, char b) {
		return (a ^ b);
	}

	public static int xorByteShort(byte a, short b) {
		return (a ^ b);
	}

	public static int xorByteInt(byte a, int b) {
		return (a ^ b);
	}

	public static long xorByteLong(byte a, long b) {
		return (a ^ b);
	}

	public static int minusChar(char a) {
		return (-a);
	}

	public static int notChar(char a) {
		return (~a);
	}

	public static int addCharByte(char a, byte b) {
		return (a + b);
	}

	public static int addCharChar(char a, char b) {
		return (a + b);
	}

	public static int addCharShort(char a, short b) {
		return (a + b);
	}

	public static int addCharInt(char a, int b) {
		return (a + b);
	}

	public static long addCharLong(char a, long b) {
		return (a + b);
	}

	public static float addCharShort(char a, float b) {
		return (a + b);
	}

	public static double addCharInt(char a, double b) {
		return (a + b);
	}

	public static int subCharByte(char a, byte b) {
		return (a - b);
	}

	public static int subCharChar(char a, char b) {
		return (a - b);
	}

	public static int subCharShort(char a, short b) {
		return (a - b);
	}

	public static int subCharInt(char a, int b) {
		return (a - b);
	}

	public static long subCharLong(char a, long b) {
		return (a - b);
	}

	public static float subCharShort(char a, float b) {
		return (a - b);
	}

	public static double subCharInt(char a, double b) {
		return (a - b);
	}

	public static int mulCharByte(char a, byte b) {
		return (a * b);
	}

	public static int mulCharChar(char a, char b) {
		return (a * b);
	}

	public static int mulCharShort(char a, short b) {
		return (a * b);
	}

	public static int mulCharInt(char a, int b) {
		return (a * b);
	}

	public static long mulCharLong(char a, long b) {
		return (a * b);
	}

	public static float mulCharShort(char a, float b) {
		return (a * b);
	}

	public static double mulCharInt(char a, double b) {
		return (a * b);
	}

	public static int divCharByte(char a, byte b) {
		return (a / b);
	}

	public static int divCharChar(char a, char b) {
		return (a / b);
	}

	public static int divCharShort(char a, short b) {
		return (a / b);
	}

	public static int divCharInt(char a, int b) {
		return (a / b);
	}

	public static long divCharLong(char a, long b) {
		return (a / b);
	}

	public static float divCharShort(char a, float b) {
		return (a / b);
	}

	public static double divCharInt(char a, double b) {
		return (a / b);
	}

	public static int modCharByte(char a, byte b) {
		return (a % b);
	}

	public static int modCharChar(char a, char b) {
		return (a % b);
	}

	public static int modCharShort(char a, short b) {
		return (a % b);
	}

	public static int modCharInt(char a, int b) {
		return (a % b);
	}

	public static long modCharLong(char a, long b) {
		return (a % b);
	}

	public static float modCharShort(char a, float b) {
		return (a % b);
	}

	public static double modCharInt(char a, double b) {
		return (a % b);
	}

	public static int shlCharByte(char a, byte b) {
		return (a << b);
	}

	public static int shlCharChar(char a, char b) {
		return (a << b);
	}

	public static int shlCharShort(char a, short b) {
		return (a << b);
	}

	public static int shlCharInt(char a, int b) {
		return (a << b);
	}

	public static long shlCharLong(char a, long b) {
		return (a << b);
	}

	public static int sarCharByte(char a, byte b) {
		return (a >> b);
	}

	public static int sarCharChar(char a, char b) {
		return (a >> b);
	}

	public static int sarCharShort(char a, short b) {
		return (a >> b);
	}

	public static int sarCharInt(char a, int b) {
		return (a >> b);
	}

	public static long sarCharLong(char a, long b) {
		return (a >> b);
	}

	public static int shrCharByte(char a, byte b) {
		return (a >>> b);
	}

	public static int shrCharChar(char a, char b) {
		return (a >>> b);
	}

	public static int shrCharShort(char a, short b) {
		return (a >>> b);
	}

	public static int shrCharInt(char a, int b) {
		return (a >>> b);
	}

	public static long shrCharLong(char a, long b) {
		return (a >>> b);
	}

	public static int orCharByte(char a, byte b) {
		return (a | b);
	}

	public static int orCharChar(char a, char b) {
		return (a | b);
	}

	public static int orCharShort(char a, short b) {
		return (a | b);
	}

	public static int orCharInt(char a, int b) {
		return (a | b);
	}

	public static long orCharLong(char a, long b) {
		return (a | b);
	}

	public static int andCharByte(char a, byte b) {
		return (a & b);
	}

	public static int andCharChar(char a, char b) {
		return (a & b);
	}

	public static int andCharShort(char a, short b) {
		return (a & b);
	}

	public static int andCharInt(char a, int b) {
		return (a & b);
	}

	public static long andCharLong(char a, long b) {
		return (a & b);
	}

	public static int xorCharByte(char a, byte b) {
		return (a ^ b);
	}

	public static int xorCharChar(char a, char b) {
		return (a ^ b);
	}

	public static int xorCharShort(char a, short b) {
		return (a ^ b);
	}

	public static int xorCharInt(char a, int b) {
		return (a ^ b);
	}

	public static long xorCharLong(char a, long b) {
		return (a ^ b);
	}

	public static int minusShort(short a) {
		return (-a);
	}

	public static int notShort(short a) {
		return (~a);
	}

	public static int addShortByte(short a, byte b) {
		return (a + b);
	}

	public static int addShortChar(short a, char b) {
		return (a + b);
	}

	public static int addShortShort(short a, short b) {
		return (a + b);
	}

	public static int addShortInt(short a, int b) {
		return (a + b);
	}

	public static long addShortLong(short a, long b) {
		return (a + b);
	}

	public static float addShortShort(short a, float b) {
		return (a + b);
	}

	public static double addShortInt(short a, double b) {
		return (a + b);
	}

	public static int subShortByte(short a, byte b) {
		return (a - b);
	}

	public static int subShortChar(short a, char b) {
		return (a - b);
	}

	public static int subShortShort(short a, short b) {
		return (a - b);
	}

	public static int subShortInt(short a, int b) {
		return (a - b);
	}

	public static long subShortLong(short a, long b) {
		return (a - b);
	}

	public static float subShortShort(short a, float b) {
		return (a - b);
	}

	public static double subShortInt(short a, double b) {
		return (a - b);
	}

	public static int mulShortByte(short a, byte b) {
		return (a * b);
	}

	public static int mulShortChar(short a, char b) {
		return (a * b);
	}

	public static int mulShortShort(short a, short b) {
		return (a * b);
	}

	public static int mulShortInt(short a, int b) {
		return (a * b);
	}

	public static long mulShortLong(short a, long b) {
		return (a * b);
	}

	public static float mulShortShort(short a, float b) {
		return (a * b);
	}

	public static double mulShortInt(short a, double b) {
		return (a * b);
	}

	public static int divShortByte(short a, byte b) {
		return (a / b);
	}

	public static int divShortChar(short a, char b) {
		return (a / b);
	}

	public static int divShortShort(short a, short b) {
		return (a / b);
	}

	public static int divShortInt(short a, int b) {
		return (a / b);
	}

	public static long divShortLong(short a, long b) {
		return (a / b);
	}

	public static float divShortShort(short a, float b) {
		return (a / b);
	}

	public static double divShortInt(short a, double b) {
		return (a / b);
	}

	public static int modShortByte(short a, byte b) {
		return (a % b);
	}

	public static int modShortChar(short a, char b) {
		return (a % b);
	}

	public static int modShortShort(short a, short b) {
		return (a % b);
	}

	public static int modShortInt(short a, int b) {
		return (a % b);
	}

	public static long modShortLong(short a, long b) {
		return (a % b);
	}

	public static float modShortShort(short a, float b) {
		return (a % b);
	}

	public static double modShortInt(short a, double b) {
		return (a % b);
	}

	public static int shlShortByte(short a, byte b) {
		return (a << b);
	}

	public static int shlShortChar(short a, char b) {
		return (a << b);
	}

	public static int shlShortShort(short a, short b) {
		return (a << b);
	}

	public static int shlShortInt(short a, int b) {
		return (a << b);
	}

	public static long shlShortLong(short a, long b) {
		return (a << b);
	}

	public static int sarShortByte(short a, byte b) {
		return (a >> b);
	}

	public static int sarShortChar(short a, char b) {
		return (a >> b);
	}

	public static int sarShortShort(short a, short b) {
		return (a >> b);
	}

	public static int sarShortInt(short a, int b) {
		return (a >> b);
	}

	public static long sarShortLong(short a, long b) {
		return (a >> b);
	}

	public static int shrShortByte(short a, byte b) {
		return (a >>> b);
	}

	public static int shrShortChar(short a, char b) {
		return (a >>> b);
	}

	public static int shrShortShort(short a, short b) {
		return (a >>> b);
	}

	public static int shrShortInt(short a, int b) {
		return (a >>> b);
	}

	public static long shrShortLong(short a, long b) {
		return (a >>> b);
	}

	public static int orShortByte(short a, byte b) {
		return (a | b);
	}

	public static int orShortChar(short a, char b) {
		return (a | b);
	}

	public static int orShortShort(short a, short b) {
		return (a | b);
	}

	public static int orShortInt(short a, int b) {
		return (a | b);
	}

	public static long orShortLong(short a, long b) {
		return (a | b);
	}

	public static int andShortByte(short a, byte b) {
		return (a & b);
	}

	public static int andShortChar(short a, char b) {
		return (a & b);
	}

	public static int andShortShort(short a, short b) {
		return (a & b);
	}

	public static int andShortInt(short a, int b) {
		return (a & b);
	}

	public static long andShortLong(short a, long b) {
		return (a & b);
	}

	public static int xorShortByte(short a, byte b) {
		return (a ^ b);
	}

	public static int xorShortChar(short a, char b) {
		return (a ^ b);
	}

	public static int xorShortShort(short a, short b) {
		return (a ^ b);
	}

	public static int xorShortInt(short a, int b) {
		return (a ^ b);
	}

	public static long xorShortLong(short a, long b) {
		return (a ^ b);
	}

	public static int minusInt(int a) {
		return (-a);
	}

	public static int notInt(int a) {
		return (~a);
	}

	public static int addIntByte(int a, byte b) {
		return (a + b);
	}

	public static int addIntChar(int a, char b) {
		return (a + b);
	}

	public static int addIntShort(int a, short b) {
		return (a + b);
	}

	public static int addIntInt(int a, int b) {
		return (a + b);
	}

	public static long addIntLong(int a, long b) {
		return (a + b);
	}

	public static float addIntShort(int a, float b) {
		return (a + b);
	}

	public static double addIntInt(int a, double b) {
		return (a + b);
	}

	public static int subIntByte(int a, byte b) {
		return (a - b);
	}

	public static int subIntChar(int a, char b) {
		return (a - b);
	}

	public static int subIntShort(int a, short b) {
		return (a - b);
	}

	public static int subIntInt(int a, int b) {
		return (a - b);
	}

	public static long subIntLong(int a, long b) {
		return (a - b);
	}

	public static float subIntShort(int a, float b) {
		return (a - b);
	}

	public static double subIntInt(int a, double b) {
		return (a - b);
	}

	public static int mulIntByte(int a, byte b) {
		return (a * b);
	}

	public static int mulIntChar(int a, char b) {
		return (a * b);
	}

	public static int mulIntShort(int a, short b) {
		return (a * b);
	}

	public static int mulIntInt(int a, int b) {
		return (a * b);
	}

	public static long mulIntLong(int a, long b) {
		return (a * b);
	}

	public static float mulIntShort(int a, float b) {
		return (a * b);
	}

	public static double mulIntInt(int a, double b) {
		return (a * b);
	}

	public static int divIntByte(int a, byte b) {
		return (a / b);
	}

	public static int divIntChar(int a, char b) {
		return (a / b);
	}

	public static int divIntShort(int a, short b) {
		return (a / b);
	}

	public static int divIntInt(int a, int b) {
		return (a / b);
	}

	public static long divIntLong(int a, long b) {
		return (a / b);
	}

	public static float divIntShort(int a, float b) {
		return (a / b);
	}

	public static double divIntInt(int a, double b) {
		return (a / b);
	}

	public static int modIntByte(int a, byte b) {
		return (a % b);
	}

	public static int modIntChar(int a, char b) {
		return (a % b);
	}

	public static int modIntShort(int a, short b) {
		return (a % b);
	}

	public static int modIntInt(int a, int b) {
		return (a % b);
	}

	public static long modIntLong(int a, long b) {
		return (a % b);
	}

	public static float modIntShort(int a, float b) {
		return (a % b);
	}

	public static double modIntInt(int a, double b) {
		return (a % b);
	}

	public static int shlIntByte(int a, byte b) {
		return (a << b);
	}

	public static int shlIntChar(int a, char b) {
		return (a << b);
	}

	public static int shlIntShort(int a, short b) {
		return (a << b);
	}

	public static int shlIntInt(int a, int b) {
		return (a << b);
	}

	public static long shlIntLong(int a, long b) {
		return (a << b);
	}

	public static int sarIntByte(int a, byte b) {
		return (a >> b);
	}

	public static int sarIntChar(int a, char b) {
		return (a >> b);
	}

	public static int sarIntShort(int a, short b) {
		return (a >> b);
	}

	public static int sarIntInt(int a, int b) {
		return (a >> b);
	}

	public static long sarIntLong(int a, long b) {
		return (a >> b);
	}

	public static int shrIntByte(int a, byte b) {
		return (a >>> b);
	}

	public static int shrIntChar(int a, char b) {
		return (a >>> b);
	}

	public static int shrIntShort(int a, short b) {
		return (a >>> b);
	}

	public static int shrIntInt(int a, int b) {
		return (a >>> b);
	}

	public static long shrIntLong(int a, long b) {
		return (a >>> b);
	}

	public static int orIntByte(int a, byte b) {
		return (a | b);
	}

	public static int orIntChar(int a, char b) {
		return (a | b);
	}

	public static int orIntShort(int a, short b) {
		return (a | b);
	}

	public static int orIntInt(int a, int b) {
		return (a | b);
	}

	public static long orIntLong(int a, long b) {
		return (a | b);
	}

	public static int andIntByte(int a, byte b) {
		return (a & b);
	}

	public static int andIntChar(int a, char b) {
		return (a & b);
	}

	public static int andIntShort(int a, short b) {
		return (a & b);
	}

	public static int andIntInt(int a, int b) {
		return (a & b);
	}

	public static long andIntLong(int a, long b) {
		return (a & b);
	}

	public static int xorIntByte(int a, byte b) {
		return (a ^ b);
	}

	public static int xorIntChar(int a, char b) {
		return (a ^ b);
	}

	public static int xorIntShort(int a, short b) {
		return (a ^ b);
	}

	public static int xorIntInt(int a, int b) {
		return (a ^ b);
	}

	public static long xorIntLong(int a, long b) {
		return (a ^ b);
	}

	public static long minusLong(long a) {
		return (-a);
	}

	public static long notLong(long a) {
		return (~a);
	}

	public static long addLongByte(long a, byte b) {
		return (a + b);
	}

	public static long addLongChar(long a, char b) {
		return (a + b);
	}

	public static long addLongShort(long a, short b) {
		return (a + b);
	}

	public static long addLongInt(long a, int b) {
		return (a + b);
	}

	public static long addLongLong(long a, long b) {
		return (a + b);
	}

	public static float addLongShort(long a, float b) {
		return (a + b);
	}

	public static double addLongInt(long a, double b) {
		return (a + b);
	}

	public static long subLongByte(long a, byte b) {
		return (a - b);
	}

	public static long subLongChar(long a, char b) {
		return (a - b);
	}

	public static long subLongShort(long a, short b) {
		return (a - b);
	}

	public static long subLongInt(long a, int b) {
		return (a - b);
	}

	public static long subLongLong(long a, long b) {
		return (a - b);
	}

	public static float subLongShort(long a, float b) {
		return (a - b);
	}

	public static double subLongInt(long a, double b) {
		return (a - b);
	}

	public static long mulLongByte(long a, byte b) {
		return (a * b);
	}

	public static long mulLongChar(long a, char b) {
		return (a * b);
	}

	public static long mulLongShort(long a, short b) {
		return (a * b);
	}

	public static long mulLongInt(long a, int b) {
		return (a * b);
	}

	public static long mulLongLong(long a, long b) {
		return (a * b);
	}

	public static float mulLongShort(long a, float b) {
		return (a * b);
	}

	public static double mulLongInt(long a, double b) {
		return (a * b);
	}

	public static long divLongByte(long a, byte b) {
		return (a / b);
	}

	public static long divLongChar(long a, char b) {
		return (a / b);
	}

	public static long divLongShort(long a, short b) {
		return (a / b);
	}

	public static long divLongInt(long a, int b) {
		return (a / b);
	}

	public static long divLongLong(long a, long b) {
		return (a / b);
	}

	public static float divLongShort(long a, float b) {
		return (a / b);
	}

	public static double divLongInt(long a, double b) {
		return (a / b);
	}

	public static long modLongByte(long a, byte b) {
		return (a % b);
	}

	public static long modLongChar(long a, char b) {
		return (a % b);
	}

	public static long modLongShort(long a, short b) {
		return (a % b);
	}

	public static long modLongInt(long a, int b) {
		return (a % b);
	}

	public static long modLongLong(long a, long b) {
		return (a % b);
	}

	public static float modLongShort(long a, float b) {
		return (a % b);
	}

	public static double modLongInt(long a, double b) {
		return (a % b);
	}

	public static long shlLongByte(long a, byte b) {
		return (a << b);
	}

	public static long shlLongChar(long a, char b) {
		return (a << b);
	}

	public static long shlLongShort(long a, short b) {
		return (a << b);
	}

	public static long shlLongInt(long a, int b) {
		return (a << b);
	}

	public static long shlLongLong(long a, long b) {
		return (a << b);
	}

	public static long sarLongByte(long a, byte b) {
		return (a >> b);
	}

	public static long sarLongChar(long a, char b) {
		return (a >> b);
	}

	public static long sarLongShort(long a, short b) {
		return (a >> b);
	}

	public static long sarLongInt(long a, int b) {
		return (a >> b);
	}

	public static long sarLongLong(long a, long b) {
		return (a >> b);
	}

	public static long shrLongByte(long a, byte b) {
		return (a >>> b);
	}

	public static long shrLongChar(long a, char b) {
		return (a >>> b);
	}

	public static long shrLongShort(long a, short b) {
		return (a >>> b);
	}

	public static long shrLongInt(long a, int b) {
		return (a >>> b);
	}

	public static long shrLongLong(long a, long b) {
		return (a >>> b);
	}

	public static long orLongByte(long a, byte b) {
		return (a | b);
	}

	public static long orLongChar(long a, char b) {
		return (a | b);
	}

	public static long orLongShort(long a, short b) {
		return (a | b);
	}

	public static long orLongInt(long a, int b) {
		return (a | b);
	}

	public static long orLongLong(long a, long b) {
		return (a | b);
	}

	public static long andLongByte(long a, byte b) {
		return (a & b);
	}

	public static long andLongChar(long a, char b) {
		return (a & b);
	}

	public static long andLongShort(long a, short b) {
		return (a & b);
	}

	public static long andLongInt(long a, int b) {
		return (a & b);
	}

	public static long andLongLong(long a, long b) {
		return (a & b);
	}

	public static long xorLongByte(long a, byte b) {
		return (a ^ b);
	}

	public static long xorLongChar(long a, char b) {
		return (a ^ b);
	}

	public static long xorLongShort(long a, short b) {
		return (a ^ b);
	}

	public static long xorLongInt(long a, int b) {
		return (a ^ b);
	}

	public static long xorLongLong(long a, long b) {
		return (a ^ b);
	}

	public static float minusFloat(float a) {
		return (-a);
	}

	public static float addFloatByte(float a, byte b) {
		return (a + b);
	}

	public static float addFloatChar(float a, char b) {
		return (a + b);
	}

	public static float addFloatShort(float a, short b) {
		return (a + b);
	}

	public static float addFloatInt(float a, int b) {
		return (a + b);
	}

	public static float addFloatLong(float a, long b) {
		return (a + b);
	}

	public static float addFloatShort(float a, float b) {
		return (a + b);
	}

	public static double addFloatInt(float a, double b) {
		return (a + b);
	}

	public static float subFloatByte(float a, byte b) {
		return (a - b);
	}

	public static float subFloatChar(float a, char b) {
		return (a - b);
	}

	public static float subFloatShort(float a, short b) {
		return (a - b);
	}

	public static float subFloatInt(float a, int b) {
		return (a - b);
	}

	public static float subFloatLong(float a, long b) {
		return (a - b);
	}

	public static float subFloatShort(float a, float b) {
		return (a - b);
	}

	public static double subFloatInt(float a, double b) {
		return (a - b);
	}

	public static float mulFloatByte(float a, byte b) {
		return (a * b);
	}

	public static float mulFloatChar(float a, char b) {
		return (a * b);
	}

	public static float mulFloatShort(float a, short b) {
		return (a * b);
	}

	public static float mulFloatInt(float a, int b) {
		return (a * b);
	}

	public static float mulFloatLong(float a, long b) {
		return (a * b);
	}

	public static float mulFloatShort(float a, float b) {
		return (a * b);
	}

	public static double mulFloatInt(float a, double b) {
		return (a * b);
	}

	public static float divFloatByte(float a, byte b) {
		return (a / b);
	}

	public static float divFloatChar(float a, char b) {
		return (a / b);
	}

	public static float divFloatShort(float a, short b) {
		return (a / b);
	}

	public static float divFloatInt(float a, int b) {
		return (a / b);
	}

	public static float divFloatLong(float a, long b) {
		return (a / b);
	}

	public static float divFloatShort(float a, float b) {
		return (a / b);
	}

	public static double divFloatInt(float a, double b) {
		return (a / b);
	}

	public static float modFloatByte(float a, byte b) {
		return (a % b);
	}

	public static float modFloatChar(float a, char b) {
		return (a % b);
	}

	public static float modFloatShort(float a, short b) {
		return (a % b);
	}

	public static float modFloatInt(float a, int b) {
		return (a % b);
	}

	public static float modFloatLong(float a, long b) {
		return (a % b);
	}

	public static float modFloatShort(float a, float b) {
		return (a % b);
	}

	public static double modFloatInt(float a, double b) {
		return (a % b);
	}

	public static double minusDouble(double a) {
		return (-a);
	}

	public static double addDoubleByte(double a, byte b) {
		return (a + b);
	}

	public static double addDoubleChar(double a, char b) {
		return (a + b);
	}

	public static double addDoubleShort(double a, short b) {
		return (a + b);
	}

	public static double addDoubleInt(double a, int b) {
		return (a + b);
	}

	public static double addDoubleLong(double a, long b) {
		return (a + b);
	}

	public static double addDoubleShort(double a, float b) {
		return (a + b);
	}

	public static double addDoubleInt(double a, double b) {
		return (a + b);
	}

	public static double subDoubleByte(double a, byte b) {
		return (a - b);
	}

	public static double subDoubleChar(double a, char b) {
		return (a - b);
	}

	public static double subDoubleShort(double a, short b) {
		return (a - b);
	}

	public static double subDoubleInt(double a, int b) {
		return (a - b);
	}

	public static double subDoubleLong(double a, long b) {
		return (a - b);
	}

	public static double subDoubleShort(double a, float b) {
		return (a - b);
	}

	public static double subDoubleInt(double a, double b) {
		return (a - b);
	}

	public static double mulDoubleByte(double a, byte b) {
		return (a * b);
	}

	public static double mulDoubleChar(double a, char b) {
		return (a * b);
	}

	public static double mulDoubleShort(double a, short b) {
		return (a * b);
	}

	public static double mulDoubleInt(double a, int b) {
		return (a * b);
	}

	public static double mulDoubleLong(double a, long b) {
		return (a * b);
	}

	public static double mulDoubleShort(double a, float b) {
		return (a * b);
	}

	public static double mulDoubleInt(double a, double b) {
		return (a * b);
	}

	public static double divDoubleByte(double a, byte b) {
		return (a / b);
	}

	public static double divDoubleChar(double a, char b) {
		return (a / b);
	}

	public static double divDoubleShort(double a, short b) {
		return (a / b);
	}

	public static double divDoubleInt(double a, int b) {
		return (a / b);
	}

	public static double divDoubleLong(double a, long b) {
		return (a / b);
	}

	public static double divDoubleShort(double a, float b) {
		return (a / b);
	}

	public static double divDoubleInt(double a, double b) {
		return (a / b);
	}

	public static double modDoubleByte(double a, byte b) {
		return (a % b);
	}

	public static double modDoubleChar(double a, char b) {
		return (a % b);
	}

	public static double modDoubleShort(double a, short b) {
		return (a % b);
	}

	public static double modDoubleInt(double a, int b) {
		return (a % b);
	}

	public static double modDoubleLong(double a, long b) {
		return (a % b);
	}

	public static double modDoubleShort(double a, float b) {
		return (a % b);
	}

	public static double modDoubleInt(double a, double b) {
		return (a % b);
	}

}
