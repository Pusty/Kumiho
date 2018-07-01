package kumiho.main;

public class KumihoTestcase {
	//note that "freed memory" value is wrong the moment an array with a size > 65k is initialized
	//this is more of a "stress" test
    public static void testRC4() {
        RC4 rc4 = new RC4();
    	/*byte[] dataBuffer = new byte[1000];
    	for(int i=0;i<dataBuffer.length;i++) dataBuffer[i] =(byte)(0x40+(i%24));
    	byte[] crypt = rc4.encryptMessage(new String(dataBuffer), "This is pretty long key");
        String msg = rc4.decryptMessage(crypt, "This is pretty long key");
        System.out.println(msg); */
        String message = "Hello, World!";
        String key = "This is pretty long key";
        byte[] crypt = rc4.encryptMessage(message, key);
        String msg = rc4.decryptMessage(crypt, key);
        System.out.println(message+" == "+msg);
    }
    public static String b128Key = "0123456789ABCDEF";
    public static String b128Data = "Hello, World!!!1";
	public static byte[] bufferEnc = new byte[8*2];
	public static byte[] bufferDec = new byte[8*2];
	
    public static void testXTEA() {
    	XTEA xtea = new XTEA();
    	xtea.setKey(b128Key.getBytes());
    	xtea.encrypt(b128Data.getBytes(), bufferEnc, 0, 8*2);
    	xtea.decrypt(bufferEnc, bufferDec, 0, 8*2);
    	System.out.println(b128Data+" == "+new String(bufferDec));
    }
   /* public static void testBlowfish() {
    	Blowfish blowfish = new Blowfish();
    	blowfish.setKey(b128Key.getBytes());
    	blowfish.encrypt(b128Data.getBytes(), bufferEnc, 0, 8*2);
    	blowfish.decrypt(bufferEnc, bufferDec, 0, 8*2);
    	System.out.println(b128Data+" == "+new String(bufferDec));
    }*/
    /*public static void testAES() {
    	AES aesEnc = new AES();
    	AES aesDec = new AES();
    	aesEnc.setKey(b128Key.getBytes(), true);
    	aesDec.setKey(b128Key.getBytes(), false);
    	aesEnc.encrypt(b128Data.getBytes(), bufferEnc, 0, 16);
    	aesDec.decrypt(bufferEnc, bufferDec, 0, 16);
    	System.out.println(b128Data+" == "+new String(bufferDec));
    }*/
    
    //there is a bug somewhere causing this to crash from a specific size on... (>=10000)
    public static void testQuickLZ() {
    	byte[] dataBuffer = new byte[1000];
    	for(int i=0;i<dataBuffer.length;i++) dataBuffer[i] =(byte)(0x40+(i%24));
    	byte[] data1 = QuickLZ.compress(dataBuffer, 1);
    	byte[] data3 = QuickLZ.compress(dataBuffer, 3);
    	System.out.println("Data Size: (0)["+dataBuffer.length+"] (1)["+data1.length+"] (3)["+data3.length+"]");
    	System.out.println(new String(QuickLZ.decompress(data1))+" == "+new String(QuickLZ.decompress(data3)));
    }
	public static void main(String[] args) {
		//for(int i=0;i<10;i++)
		//	System.out.print((char)Kumiho.rawFile[i]);
    	//testRC4(); //2.5KB binary size, 2KB Heap
    	//testXTEA(); //2.5KB binary size, 2KB Heap
    	//testBlowfish(); //4KB heap not freed -> works, adds about 40KB binary size
    	//testAES(); //crashes, I think it's because of the 'gigantic' (100KB) lookup table
    	//testQuickLZ(); //500KB Heap, 14KB Binary size
    }
   
    
}
