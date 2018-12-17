package pusty.f0xC.x64.libc;

import pusty.f0xC.lang.OverrideHandler.ExternalProperty;
import pusty.f0xC.lang.OverrideHandler.OverrideTranslation;
import pusty.f0xC.lang.OverrideHandler.TranslationProperty;
import pusty.f0xC.libc.LibC;
import pusty.f0xC.x64.internal.Internal;
import pusty.f0xC.x64.internal.InternalObject;

@OverrideTranslation(override = "pusty/f0xC/libc/CStdio")
public class OCStdio {

	public static final int NULL = 0;
	public static final int _IOFBF = 0; /* full buffered */
	public static final int _IOLBF = 0x40; /* line buffered */
	public static final int _IONBF = 0x04; /* not buffered */
	public static final int EOF = -1;
	public static final int FOPEN_MAX = 20;
	public static final int OCFileNAME_MAX = 260;
	public static final int L_tmpnam = 16;
	public static final int SEEK_SET = 0;
	public static final int SEEK_CUR = 1;
	public static final int SEEK_END = 2;
	public static final int TMP_MAX = 32767;

	@TranslationProperty(property = TranslationProperty.EXTERNAL_CCALL)
	@ExternalProperty(property = ExternalProperty.IMPORT, parent = "msvcrt", key = "fclose")
	public static native int native_fclose(long fd);
	
	public static int fclose(OCFile file) {
		return native_fclose(file.getFD());
	}

	@TranslationProperty(property = TranslationProperty.EXTERNAL_CCALL)
	@ExternalProperty(property = ExternalProperty.IMPORT, parent = "msvcrt", key = "clearerr")
	public static native void native_clearerr(long fd);
	
	public static void clearerr(OCFile file) {
		native_clearerr(file.getFD());
	}

	@TranslationProperty(property = TranslationProperty.EXTERNAL_CCALL)
	@ExternalProperty(property = ExternalProperty.IMPORT, parent = "msvcrt", key = "feof")
	public static native boolean native_feof(long fd);
	
	public static boolean feof(OCFile file) {
		return native_feof(file.getFD());
	}

	@TranslationProperty(property = TranslationProperty.EXTERNAL_CCALL)
	@ExternalProperty(property = ExternalProperty.IMPORT, parent = "msvcrt", key = "ferror")
	public static native int native_ferror(long fd);

	public static int ferror(OCFile file) {
		return native_ferror(file.getFD());
	}
	
	@TranslationProperty(property = TranslationProperty.EXTERNAL_CCALL)
	@ExternalProperty(property = ExternalProperty.IMPORT, parent = "msvcrt", key = "fflush")
	public static native int native_fflush(long fd);

	public static int fflush(OCFile file) {
		return native_fflush(file.getFD());
	}
	
	@TranslationProperty(property = TranslationProperty.EXTERNAL_CCALL)
	@ExternalProperty(property = ExternalProperty.IMPORT, parent = "msvcrt", key = "fseek")
	public static native int native_fseek(int whence, int offset ,long fd);

	public static int fseek(OCFile file, int offset, int whence) {
		return native_fseek(whence,offset,file.getFD());
	}
	
	@TranslationProperty(property = TranslationProperty.EXTERNAL_CCALL)
	@ExternalProperty(property = ExternalProperty.IMPORT, parent = "msvcrt", key = "fsetpos")
	public static native int native_fsetpos(long addr_fpos ,long fd);

	public static int fsetpos(OCFile file, Long fpos) {
		return native_fsetpos(InternalObject.con2long(fpos),file.getFD());
	}
	
	
	@TranslationProperty(property = TranslationProperty.EXTERNAL_CCALL)
	@ExternalProperty(property = ExternalProperty.IMPORT, parent = "msvcrt", key = "fgetpos")
	public static native int native_fgetpos(long addr_fpos ,long fd);

	public static int fgetpos(OCFile file, Long fpos) {
		return native_fgetpos(InternalObject.con2long(fpos),file.getFD());
	}
		
	@TranslationProperty(property = TranslationProperty.EXTERNAL_CCALL)
	@ExternalProperty(property = ExternalProperty.IMPORT, parent = "msvcrt", key = "fopen")
	public static native long native_fopen(long mode ,long filename);
	

	public static OCFile fopen(String filename, String mode) {
		return new OCFile(native_fopen(InternalObject.arr2long(LibC.JString2CString(mode)),
									 InternalObject.arr2long(LibC.JString2CString(filename))));
	}

	@TranslationProperty(property = TranslationProperty.EXTERNAL_CCALL)
	@ExternalProperty(property = ExternalProperty.IMPORT, parent = "msvcrt", key = "fread")
	public static native int native_fread(long fd,int nmemb,int size, long dest_arr);
	
	public static int fread(byte[] dest_arr, int size, int nmemb, OCFile fd) {
		return native_fread(fd.getFD(), nmemb, size, InternalObject.arr2long(dest_arr));
	}

	@TranslationProperty(property = TranslationProperty.EXTERNAL_CCALL)
	@ExternalProperty(property = ExternalProperty.IMPORT, parent = "msvcrt", key = "freopen")
	public static native int native_freopen(long fd, long mode, long filename);
	
	public static OCFile freopen(String filename, String mode, OCFile fd) {
		fd.setFD(native_freopen(fd.getFD(),InternalObject.arr2long(LibC.JString2CString(mode)),
				InternalObject.arr2long(LibC.JString2CString(filename))));
		return fd;
	}

	@TranslationProperty(property = TranslationProperty.EXTERNAL_CCALL)
	@ExternalProperty(property = ExternalProperty.IMPORT, parent = "msvcrt", key = "fwrite")
	public static native int  native_fwrite(long fd,int nmemb, int size, long src_arr);
	
	public static int fwrite(byte[] src_arr, int size, int nmemb, OCFile fd) {
		return native_fwrite(fd.getFD(), nmemb, size, InternalObject.arr2long(src_arr));
	}

	@TranslationProperty(property = TranslationProperty.EXTERNAL_CCALL)
	@ExternalProperty(property = ExternalProperty.IMPORT, parent = "msvcrt", key = "remove")
	public static native int  native_remove(long filename);
	
	public static int remove(String str) {
		return native_remove(InternalObject.arr2long(LibC.JString2CString(str)));
	}

	@TranslationProperty(property = TranslationProperty.EXTERNAL_CCALL)
	@ExternalProperty(property = ExternalProperty.IMPORT, parent = "msvcrt", key = "rename")
	public static native int  native_rename(long old_filename, long new_filename);
	
	public static int rename(String old_filename, String new_filename) {
		return native_rename(InternalObject.arr2long(LibC.JString2CString(old_filename)),
							 InternalObject.arr2long(LibC.JString2CString(new_filename)));
	}
	
	@TranslationProperty(property = TranslationProperty.EXTERNAL_CCALL)
	@ExternalProperty(property = ExternalProperty.IMPORT, parent = "msvcrt", key = "rewind")
	public static native void native_rewind(long fd);
	
	public static void rewind(OCFile fd) {
		 native_rewind(fd.getFD());
	}
	
	@TranslationProperty(property = TranslationProperty.EXTERNAL_CCALL)
	@ExternalProperty(property = ExternalProperty.IMPORT, parent = "msvcrt", key = "tmpfile")
	public static native long  native_tmpfile();
	
	public static OCFile tmpfile() {
		 return new OCFile(native_tmpfile());
	}
	
	
	@TranslationProperty(property = TranslationProperty.EXTERNAL_CCALL)
	@ExternalProperty(property = ExternalProperty.IMPORT, parent = "msvcrt", key = "ftell")
	public static native int native_ftell(long fd);
	
	public static int ftell(OCFile fd) {
		 return native_ftell(fd.getFD());
	}
	/*
	
	@TranslationProperty(property = TranslationProperty.EXTERNAL_CCALL)
	@ExternalProperty(property = ExternalProperty.IMPORT, parent = "msvcrt", key = "vprintf")
	public static native int native_vprintf(int va_list, int format);
	*/
	//TODO: implement a c wrapper for functions like fprintf, printf, (different parameters)
	
	/*
	 
	@TranslationProperty(property = TranslationProperty.EXTERNAL_CCALL)
	@ExternalProperty(property = ExternalProperty.IMPORT, parent = "msvcrt", key = "vfprintf")
	public static native int  native_vfprintf(int va_list,int format, int fd);
	
	@TranslationProperty(property = TranslationProperty.EXTERNAL_CCALL)
	@ExternalProperty(property = ExternalProperty.IMPORT, parent = "msvcrt", key = "vsprintf")
	public static native int  native_vsprintf(int va_list, int format, int desc_arr);
	
	@TranslationProperty(property = TranslationProperty.EXTERNAL_CCALL)
	@ExternalProperty(property = ExternalProperty.IMPORT, parent = "msvcrt", key = "vfscanf")
	public static native int  native_vfscanf(int va_list, int format, int fd);
	
	@TranslationProperty(property = TranslationProperty.EXTERNAL_CCALL)
	@ExternalProperty(property = ExternalProperty.IMPORT, parent = "msvcrt", key = "vscanf")
	public static native int  native_vscanf(int va_list, int format);
	
	@TranslationProperty(property = TranslationProperty.EXTERNAL_CCALL)
	@ExternalProperty(property = ExternalProperty.IMPORT, parent = "msvcrt", key = "vsscanf")
	public static native int  native_vsscanf(int va_list, int format, int desc_arr);
	
	*/
	
	@TranslationProperty(property = TranslationProperty.EXTERNAL_CCALL)
	@ExternalProperty(property = ExternalProperty.IMPORT, parent = "msvcrt", key = "fgetc")
	public static native int  native_fgetc(long fd);
	
	public static int fgetc(OCFile fd) {
		return native_fgetc(fd.getFD());
	}
	
	@TranslationProperty(property = TranslationProperty.EXTERNAL_CCALL)
	@ExternalProperty(property = ExternalProperty.IMPORT, parent = "msvcrt", key = "fgets")
	public static native int  native_fgets(long fd, int n, long dest_arr);
	
	public static int fgets(byte[] dest_arr, int n, OCFile fd) {
		return native_fgets(InternalObject.arr2long(dest_arr), n, fd.getFD());
	}
	
	@TranslationProperty(property = TranslationProperty.EXTERNAL_CCALL)
	@ExternalProperty(property = ExternalProperty.IMPORT, parent = "msvcrt", key = "fputc")
	public static native int  native_fputc(long fd, int c);
	
	public static int fputc(int c,OCFile fd) {
		return native_fputc(fd.getFD(), c);
	}
	
	@TranslationProperty(property = TranslationProperty.EXTERNAL_CCALL)
	@ExternalProperty(property = ExternalProperty.IMPORT, parent = "msvcrt", key = "fputs")
	public static native int  native_fputs(long fd, long src_arr);
	
	public static int fputs(byte[] dest_arr, OCFile fd) {
		return native_fputs(fd.getFD(), InternalObject.arr2long(dest_arr));
	}
	
	@TranslationProperty(property = TranslationProperty.EXTERNAL_CCALL)
	@ExternalProperty(property = ExternalProperty.IMPORT, parent = "msvcrt", key = "getchar")
	public static native int  native_getchar();
	
	public static int  getchar() {
		return native_getchar();
	}

	
	@TranslationProperty(property = TranslationProperty.EXTERNAL_CCALL)
	@ExternalProperty(property = ExternalProperty.IMPORT, parent = "msvcrt", key = "gets")
	public static native int  native_gets(long desc_arr);
	
	public static int gets(byte[] dest_arr) {
		return native_gets(InternalObject.arr2long(dest_arr));
	}

	@TranslationProperty(property = TranslationProperty.EXTERNAL_CCALL)
	@ExternalProperty(property = ExternalProperty.IMPORT, parent = "msvcrt", key = "putc")
	public static native int  native_putc(int c, long fd);
	
	public static int putc(int c, OCFile fd) {
		return native_putc(c, fd.getFD());
	}
	
	@TranslationProperty(property = TranslationProperty.EXTERNAL_CCALL)
	@ExternalProperty(property = ExternalProperty.IMPORT, parent = "msvcrt", key = "putchar")
	public static native int native_putchar(int c);
	
	public static int putchar(int c) {
		return native_putchar(c);
	}
	

	@TranslationProperty(property = TranslationProperty.EXTERNAL_CCALL)
	@ExternalProperty(property = ExternalProperty.IMPORT, parent = "msvcrt", key = "puts")
	public static native int native_puts(long str);
	
	public static int puts(String str) {
		return native_puts(InternalObject.arr2long(LibC.JString2CString(str)));
	}
	
	@TranslationProperty(property = TranslationProperty.EXTERNAL_CCALL)
	@ExternalProperty(property = ExternalProperty.IMPORT, parent = "msvcrt", key = "perror")
	public static native void native_perror(long str);
	
	public static void perror(String str) {
		native_perror(InternalObject.arr2long(LibC.JString2CString(str)));
	}
	
	
	@TranslationProperty(property = TranslationProperty.EXTERNAL_CCALL)
	@ExternalProperty(property = ExternalProperty.IMPORT, parent = "msvcrt", key = "vprintf")
	public static native void native_vprintf(long args,long format);
	
	public static void printf(String format, Object... args) {
		//TODO: make this ... -> array convert function more general
		long[] argsI = new long[args.length];
		byte[][] dummy = new byte[args.length][]; //this is used to store temporary objects (so they don't get freed before the final call)
		for(int i=0;i<args.length;i++) {
			//TODO: add support for further structures
			if(args[i] instanceof String) {
				dummy[i] = LibC.JString2CString((String)args[i]);
				argsI[i] = InternalObject.arr2long(dummy[i]);
			}else
				argsI[i] = Internal.rawMemoryReadLong(InternalObject.con2long(args[i]));
		}
		native_vprintf(InternalObject.arr2long(argsI), InternalObject.arr2long(LibC.JString2CString(format)));
	}
	
}
