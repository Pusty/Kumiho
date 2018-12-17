package pusty.f0xC.libc;


public class CStdio {

	public static final int NULL = 0;
	public static final int _IOFBF = 0; /* full buffered */
	public static final int _IOLBF = 0x40; /* line buffered */
	public static final int _IONBF = 0x04; /* not buffered */
	public static final int EOF = -1;
	public static final int FOPEN_MAX = 20;
	public static final int CFileNAME_MAX = 260;
	public static final int L_tmpnam = 16;
	public static final int SEEK_SET = 0;
	public static final int SEEK_CUR = 1;
	public static final int SEEK_END = 2;
	public static final int TMP_MAX = 32767;

	public static int fclose(CFile file) {return 0;}
	public static void clearerr(CFile file) {return;}
	public static boolean feof(CFile file) {return false;}
	public static int ferror(CFile file) {return 0;}
	public static int fflush(CFile file) {return 0;}
	public static int fseek(CFile file, int offset, int whence) {return 0;}
	public static int fsetpos(CFile file, Long fpos) {return 0;}
	public static int fgetpos(CFile file, Long fpos) {return 0;}
	public static CFile fopen(String filename, String mode) {return null;}
	public static int fread(byte[] dest_arr, int size, int nmemb, CFile fd) {return 0;}
	public static CFile freopen(String filename, String mode, CFile fd) { return null; }
	public static int fwrite(byte[] src_arr, int size, int nmemb, CFile fd) { return 0; }
	public static int remove(String str) {return 0;}
	public static int rename(String old_filename, String new_filename) { return 0; }
	public static void rewind(CFile fd) { return; }
	public static CFile tmpfile() { return null; }
	public static int ftell(CFile fd) { return 0;}
	public static int fgetc(CFile fd) { return 0;}
	public static int fgets(byte[] dest_arr, int n, CFile fd) { return 0; }
	public static int fputc(int c,CFile fd) { return 0; }
	public static int fputs(byte[] dest_arr, CFile fd) {return 0;}
	public static int getchar() {return 0;}
	public static int gets(byte[] dest_arr) {return 0;}
	public static int putc(int c, CFile fd) {return 0;}
	public static int putchar(int c) { return 0; }
	public static int puts(String str) { return 0; }
	public static void perror(String str) { return; }
	public static void printf(String format, Object... args) { return; }
	
}
