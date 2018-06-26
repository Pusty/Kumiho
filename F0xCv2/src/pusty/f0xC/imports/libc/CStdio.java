package pusty.f0xC.imports.libc;

import pusty.f0xC.imports.Internal;
import pusty.f0xC.imports.InternalObject;
import pusty.f0xC.imports.LibC;
import pusty.f0xC.lang.OverrideHandler.ExternalProperty;
import pusty.f0xC.lang.OverrideHandler.TranslationProperty;

public class CStdio {

	public static final int NULL = 0;
	public static final int _IOFBF = 0; /* full buffered */
	public static final int _IOLBF = 0x40; /* line buffered */
	public static final int _IONBF = 0x04; /* not buffered */
	public static final int EOF = -1;
	public static final int FOPEN_MAX = 20;
	public static final int FILENAME_MAX = 260;
	public static final int L_tmpnam = 16;
	public static final int SEEK_SET = 0;
	public static final int SEEK_CUR = 1;
	public static final int SEEK_END = 2;
	public static final int TMP_MAX = 32767;

	public static class FILE {
		private int fd;

		public FILE(int fd) {
			this.fd = fd;
		}

		public int getFD() {
			return this.fd;
		}

		public void setFD(int fd) {
			this.fd = fd;
		}
	}

	@TranslationProperty(property = TranslationProperty.EXTERNAL_CCALL)
	@ExternalProperty(property = ExternalProperty.IMPORT, parent = "msvcrt", key = "fclose")
	public static native int native_fclose(int fd);
	
	public static int fclose(FILE file) {
		return native_fclose(file.getFD());
	}

	@TranslationProperty(property = TranslationProperty.EXTERNAL_CCALL)
	@ExternalProperty(property = ExternalProperty.IMPORT, parent = "msvcrt", key = "clearerr")
	public static native void native_clearerr(int fd);
	
	public static void clearerr(FILE file) {
		native_clearerr(file.getFD());
	}

	@TranslationProperty(property = TranslationProperty.EXTERNAL_CCALL)
	@ExternalProperty(property = ExternalProperty.IMPORT, parent = "msvcrt", key = "feof")
	public static native boolean native_feof(int fd);
	
	public static boolean feof(FILE file) {
		return native_feof(file.getFD());
	}

	@TranslationProperty(property = TranslationProperty.EXTERNAL_CCALL)
	@ExternalProperty(property = ExternalProperty.IMPORT, parent = "msvcrt", key = "ferror")
	public static native int native_ferror(int fd);

	public static int ferror(FILE file) {
		return native_ferror(file.getFD());
	}
	
	@TranslationProperty(property = TranslationProperty.EXTERNAL_CCALL)
	@ExternalProperty(property = ExternalProperty.IMPORT, parent = "msvcrt", key = "fflush")
	public static native int native_fflush(int fd);

	public static int fflush(FILE file) {
		return native_fflush(file.getFD());
	}
	
	@TranslationProperty(property = TranslationProperty.EXTERNAL_CCALL)
	@ExternalProperty(property = ExternalProperty.IMPORT, parent = "msvcrt", key = "fseek")
	public static native int native_fseek(int whence, int offset ,int fd);

	public static int fseek(FILE file, int offset, int whence) {
		return native_fseek(whence,offset,file.getFD());
	}
	
	@TranslationProperty(property = TranslationProperty.EXTERNAL_CCALL)
	@ExternalProperty(property = ExternalProperty.IMPORT, parent = "msvcrt", key = "fsetpos")
	public static native int native_fsetpos(int addr_fpos ,int fd);

	public static int fsetpos(FILE file, Integer fpos) {
		return native_fsetpos(InternalObject.con2int(fpos),file.getFD());
	}
	
	
	@TranslationProperty(property = TranslationProperty.EXTERNAL_CCALL)
	@ExternalProperty(property = ExternalProperty.IMPORT, parent = "msvcrt", key = "fgetpos")
	public static native int native_fgetpos(int addr_fpos ,int fd);

	public static int fgetpos(FILE file, Integer fpos) {
		return native_fgetpos(InternalObject.con2int(fpos),file.getFD());
	}
		
	@TranslationProperty(property = TranslationProperty.EXTERNAL_CCALL)
	@ExternalProperty(property = ExternalProperty.IMPORT, parent = "msvcrt", key = "fopen")
	public static native int native_fopen(int mode ,int filename);
	

	public static FILE fopen(String filename, String mode) {
		return new FILE(native_fopen(InternalObject.arr2int(LibC.JString2CString(mode)),
									 InternalObject.arr2int(LibC.JString2CString(filename))));
	}

	@TranslationProperty(property = TranslationProperty.EXTERNAL_CCALL)
	@ExternalProperty(property = ExternalProperty.IMPORT, parent = "msvcrt", key = "fread")
	public static native int native_fread(int fd,int nmemb,int size, int dest_arr);
	
	public static int fread(byte[] dest_arr, int size, int nmemb, FILE fd) {
		return native_fread(fd.getFD(), nmemb, size, InternalObject.arr2int(dest_arr));
	}

	@TranslationProperty(property = TranslationProperty.EXTERNAL_CCALL)
	@ExternalProperty(property = ExternalProperty.IMPORT, parent = "msvcrt", key = "freopen")
	public static native int native_freopen(int fd, int mode, int filename);
	
	public static FILE freopen(String filename, String mode, FILE fd) {
		fd.setFD(native_freopen(fd.getFD(),InternalObject.arr2int(LibC.JString2CString(mode)),
				InternalObject.arr2int(LibC.JString2CString(filename))));
		return fd;
	}

	@TranslationProperty(property = TranslationProperty.EXTERNAL_CCALL)
	@ExternalProperty(property = ExternalProperty.IMPORT, parent = "msvcrt", key = "fwrite")
	public static native int  native_fwrite(int fd,int nmemb, int size, int src_arr);
	
	public static int fwrite(byte[] src_arr, int size, int nmemb, FILE fd) {
		return native_fwrite(fd.getFD(), nmemb, size, InternalObject.arr2int(src_arr));
	}

	@TranslationProperty(property = TranslationProperty.EXTERNAL_CCALL)
	@ExternalProperty(property = ExternalProperty.IMPORT, parent = "msvcrt", key = "remove")
	public static native int  native_remove(int filename);
	
	public static int remove(String str) {
		return native_remove(InternalObject.arr2int(LibC.JString2CString(str)));
	}

	@TranslationProperty(property = TranslationProperty.EXTERNAL_CCALL)
	@ExternalProperty(property = ExternalProperty.IMPORT, parent = "msvcrt", key = "rename")
	public static native int  native_rename(int old_filename, int new_filename);
	
	public static int rename(String old_filename, String new_filename) {
		return native_rename(InternalObject.arr2int(LibC.JString2CString(old_filename)),
							 InternalObject.arr2int(LibC.JString2CString(new_filename)));
	}
	
	@TranslationProperty(property = TranslationProperty.EXTERNAL_CCALL)
	@ExternalProperty(property = ExternalProperty.IMPORT, parent = "msvcrt", key = "rewind")
	public static native void native_rewind(int fd);
	
	public static void rewind(FILE fd) {
		 native_rewind(fd.getFD());
	}
	
	@TranslationProperty(property = TranslationProperty.EXTERNAL_CCALL)
	@ExternalProperty(property = ExternalProperty.IMPORT, parent = "msvcrt", key = "tmpfile")
	public static native int  native_tmpfile();
	
	public static FILE tmpfile() {
		 return new FILE(native_tmpfile());
	}
	
	
	@TranslationProperty(property = TranslationProperty.EXTERNAL_CCALL)
	@ExternalProperty(property = ExternalProperty.IMPORT, parent = "msvcrt", key = "ftell")
	public static native int native_ftell(int fd);
	
	public static int ftell(FILE fd) {
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
	public static native int  native_fgetc(int fd);
	
	public static int fgetc(FILE fd) {
		return native_fgetc(fd.getFD());
	}
	
	@TranslationProperty(property = TranslationProperty.EXTERNAL_CCALL)
	@ExternalProperty(property = ExternalProperty.IMPORT, parent = "msvcrt", key = "fgets")
	public static native int  native_fgets(int fd, int n, int dest_arr);
	
	public static int fgets(byte[] dest_arr, int n, FILE fd) {
		return native_fgets(InternalObject.arr2int(dest_arr), n, fd.getFD());
	}
	
	@TranslationProperty(property = TranslationProperty.EXTERNAL_CCALL)
	@ExternalProperty(property = ExternalProperty.IMPORT, parent = "msvcrt", key = "fputc")
	public static native int  native_fputc(int fd, int c);
	
	public static int fputc(int c,FILE fd) {
		return native_fputc(fd.getFD(), c);
	}
	
	@TranslationProperty(property = TranslationProperty.EXTERNAL_CCALL)
	@ExternalProperty(property = ExternalProperty.IMPORT, parent = "msvcrt", key = "fputs")
	public static native int  native_fputs(int fd, int src_arr);
	
	public static int fputs(byte[] dest_arr, FILE fd) {
		return native_fputs(fd.getFD(), InternalObject.arr2int(dest_arr));
	}
	
	@TranslationProperty(property = TranslationProperty.EXTERNAL_CCALL)
	@ExternalProperty(property = ExternalProperty.IMPORT, parent = "msvcrt", key = "getchar")
	public static native int  getchar();

	
	@TranslationProperty(property = TranslationProperty.EXTERNAL_CCALL)
	@ExternalProperty(property = ExternalProperty.IMPORT, parent = "msvcrt", key = "gets")
	public static native int  native_gets(int desc_arr);
	
	public static int gets(byte[] dest_arr) {
		return native_gets(InternalObject.arr2int(dest_arr));
	}

	@TranslationProperty(property = TranslationProperty.EXTERNAL_CCALL)
	@ExternalProperty(property = ExternalProperty.IMPORT, parent = "msvcrt", key = "putc")
	public static native int  native_putc(int fd, int c);
	
	public static int putc(int c, FILE fd) {
		return native_putc(c, fd.getFD());
	}
	
	@TranslationProperty(property = TranslationProperty.EXTERNAL_CCALL)
	@ExternalProperty(property = ExternalProperty.IMPORT, parent = "msvcrt", key = "putchar")
	public static native int putchar(int c);

	@TranslationProperty(property = TranslationProperty.EXTERNAL_CCALL)
	@ExternalProperty(property = ExternalProperty.IMPORT, parent = "msvcrt", key = "puts")
	public static native int native_puts(int str);
	
	public static int puts(String str) {
		return native_puts(InternalObject.arr2int(LibC.JString2CString(str)));
	}
	
	@TranslationProperty(property = TranslationProperty.EXTERNAL_CCALL)
	@ExternalProperty(property = ExternalProperty.IMPORT, parent = "msvcrt", key = "perror")
	public static native void native_perror(int str);
	
	public static void perror(String str) {
		native_perror(InternalObject.arr2int(LibC.JString2CString(str)));
	}
	
	
	@TranslationProperty(property = TranslationProperty.EXTERNAL_CCALL)
	@ExternalProperty(property = ExternalProperty.IMPORT, parent = "msvcrt", key = "vprintf")
	public static native void native_vprintf(int args,int format);
	
	public static void printf(String format, Object... args) {
		//TODO: make this ... -> array convert function more general
		int[] argsI = new int[args.length];
		byte[][] dummy = new byte[args.length][]; //this is used to store temporary objects (so they don't get freed before the final call)
		for(int i=0;i<args.length;i++) {
			//TODO: add support for further structures
			if(args[i] instanceof String) {
				dummy[i] = LibC.JString2CString((String)args[i]);
				argsI[i] = InternalObject.arr2int(dummy[i]);
			}else
				argsI[i] = Internal.rawMemoryReadInt(InternalObject.con2int(args[i]));
		}
		native_vprintf(InternalObject.arr2int(argsI), InternalObject.arr2int(LibC.JString2CString(format)));
	}
	
}
