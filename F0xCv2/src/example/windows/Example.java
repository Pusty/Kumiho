package example.windows;

import pusty.f0xC.imports.libc.CStdio;

public class Example {
	public static void main(String[] args) {
		/*FILE read = CStdio.fopen("make.bat", "rb");
		byte[] data = new byte[10];
		Sys.output(read.getFD());
		Sys.output(CStdio.fread(data, 1, data.length, read));
		for(int i=0;i<10;i++)
			System.out.print((char)CStdio.fgetc(read));
		System.out.print((char)CStdio.getchar());
		CStdio.perror("ping pong!");
		System.out.println(new String(data));
		CStdio.freopen("temp.txt", "wb", read);
		CStdio.fputc((int)'o', read);
		CStdio.fputs(new byte[] {(byte)'h', (byte)'n', (byte)'o'}, read);
		CStdio.fclose(read);*/
		
		//Kernel32.Sleep(1000);
		//WindowsImportUtil.MessageBox(0, "oh", "noes", 1);
		CStdio.printf("%s - %d - %s - %08X\n", "test", 123, "no!", 0xDEADFACE);
		//char[] arg = new char[32];
	}
}
