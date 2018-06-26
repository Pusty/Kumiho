package pusty.f0xdc.pe;

import java.io.IOException;

import pusty.f0xdc.pe.ExecutableReader;
import pusty.f0xdc.ExecutableStream;
import pusty.f0xdc.ReadableObject;

public class IMAGE_DOS_HEADER extends ReadableObject {

	protected int e_magic; // Magic number
	protected int e_cblp; // Bytes on last page of file
	protected int e_cp; // Pages in file
	protected int e_crlc; // Relocations
	protected int e_cparhdr; // Size of header in paragraphs
	protected int e_minalloc; // Minimum extra paragraphs needed
	protected int e_maxalloc; // Maximum extra paragraphs needed
	protected int e_ss; // Initial (relative) SS value
	protected int e_sp; // Initial SP value
	protected int e_csum; // Checksum
	protected int e_ip; // Initial IP value
	protected int e_cs; // Initial (relative) CS value
	protected int e_lfarlc; // File address of relocation table
	protected int e_ovno; // Overlay number
	protected int[] e_res = new int[4]; // Reserved words
	protected int e_oemid; // OEM identifier (for e_oeminfo)
	protected int e_oeminfo; // OEM information; e_oemid specific
	protected int[] e_res2 = new int[10]; // Reserved words
	protected int e_lfanew; // File address of new exe header

	public IMAGE_DOS_HEADER(ExecutableReader reader)
			throws Exception {
		super(reader);
	}

	public void read(ExecutableStream s) throws Exception {
		e_magic = s.readAddrShort(); // Magic number
		if(s.getShort(e_magic) != 0x5a4d) return; //MZ Header
		e_cblp = s.readAddrShort(); // Bytes on last page of file
		e_cp = s.readAddrShort(); // Pages in file
		e_crlc = s.readAddrShort(); // Relocations
		e_cparhdr = s.readAddrShort(); // Size of header in paragraphs
		e_minalloc = s.readAddrShort(); // Minimum extra paragraphs needed
		e_maxalloc = s.readAddrShort(); // Maximum extra paragraphs needed
		e_ss = s.readAddrShort(); // Initial (relative) SS value
		e_sp = s.readAddrShort(); // Initial SP value
		e_csum = s.readAddrShort(); // Checksum
		e_ip = s.readAddrShort(); // Initial IP value
		e_cs = s.readAddrShort(); // Initial (relative) CS value
		e_lfarlc = s.readAddrShort(); // File address of relocation table
		e_ovno = s.readAddrShort(); // Overlay number
		e_res = new int[4]; // Reserved words
		for (int i = 0; i < e_res.length; i++)
			e_res[i] = s.readAddrShort();
		e_oemid = s.readAddrShort(); // OEM identifier (for e_oeminfo)
		e_oeminfo = s.readAddrShort(); // OEM information; e_oemid specific
		e_res2 = new int[10]; // Reserved words
		for (int i = 0; i < e_res2.length; i++)
			e_res2[i] = s.readAddrShort();
		e_lfanew = s.readAddrInt(); // File address of new exe header
	}
	
	public int getE_lfanewAddr() {
		return e_lfanew;
	}

	public short getE_magic() {
		try {
			return reader.getStream().getShort(e_magic);
		} catch (IOException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public void setE_magic(short e_magic) {
		try {
			reader.getStream().setShort(this.e_magic, e_magic);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
	}

	public short getE_cblp() {
		try {
			return reader.getStream().getShort(e_cblp);
		} catch (IOException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public void setE_cblp(short e_cblp) {
		try {
			reader.getStream().setShort(this.e_cblp, e_cblp);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
	}

	public short getE_cp() {
		try {
			return reader.getStream().getShort(e_cp);
		} catch (IOException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public void setE_cp(short e_cp) {
		try {
			reader.getStream().setShort(this.e_cp, e_cp);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
	}

	public short getE_crlc() {
		try {
			return reader.getStream().getShort(e_crlc);
		} catch (IOException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public void setE_crlc(short e_crlc) {
		try {
			reader.getStream().setShort(this.e_crlc, e_crlc);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
	}

	public short getE_cparhdr() {
		try {
			return reader.getStream().getShort(e_cparhdr);
		} catch (IOException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public void setE_cparhdr(short e_cparhdr) {
		try {
			reader.getStream().setShort(this.e_cparhdr, e_cparhdr);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
	}

	public short getE_minalloc() {
		try {
			return reader.getStream().getShort(e_minalloc);
		} catch (IOException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public void setE_minalloc(short e_minalloc) {
		try {
			reader.getStream().setShort(this.e_minalloc, e_minalloc);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
	}

	public short getE_maxalloc() {
		try {
			return reader.getStream().getShort(e_maxalloc);
		} catch (IOException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public void setE_maxalloc(short e_maxalloc) {
		try {
			reader.getStream().setShort(this.e_maxalloc, e_maxalloc);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
	}

	public short getE_ss() {
		try {
			return reader.getStream().getShort(e_ss);
		} catch (IOException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public void setE_ss(short e_ss) {
		try {
			reader.getStream().setShort(this.e_ss, e_ss);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
	}

	public short getE_sp() {
		try {
			return reader.getStream().getShort(e_sp);
		} catch (IOException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public void setE_sp(short e_sp) {
		try {
			reader.getStream().setShort(this.e_sp, e_sp);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
	}

	public short getE_csum() {
		try {
			return reader.getStream().getShort(e_csum);
		} catch (IOException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public void setE_csum(short e_csum) {
		try {
			reader.getStream().setShort(this.e_csum, e_csum);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
	}

	public short getE_ip() {
		try {
			return reader.getStream().getShort(e_ip);
		} catch (IOException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public void setE_ip(short e_ip) {
		try {
			reader.getStream().setShort(this.e_ip, e_ip);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
	}

	public short getE_cs() {
		try {
			return reader.getStream().getShort(e_cs);
		} catch (IOException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public void setE_cs(short e_cs) {
		try {
			reader.getStream().setShort(this.e_cs, e_cs);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
	}

	public short getE_lfarlc() {
		try {
			return reader.getStream().getShort(e_lfarlc);
		} catch (IOException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public void setE_lfarlc(short e_lfarlc) {
		try {
			reader.getStream().setShort(this.e_lfarlc, e_lfarlc);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
	}

	public short getE_ovno() {
		try {
			return reader.getStream().getShort(e_ovno);
		} catch (IOException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public void setE_ovno(short e_ovno) {
		try {
			reader.getStream().setShort(this.e_ovno, e_ovno);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
	}

	public short[] getE_res() {
		try {
			short[] output = new short[this.e_res.length];
			for(int i=0;i<this.e_res.length;i++)
				output[i] = reader.getStream().getShort(this.e_res[i]);
			return output;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	public void setE_res(short[] e_res) {
		try {
			for(int i=0;i<this.e_res.length;i++)
				reader.getStream().setShort(this.e_res[i], e_res[i]);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
	}

	public short getE_oemid() {
		try {
			return reader.getStream().getShort(e_oemid);
		} catch (IOException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public void setE_oemid(short e_oemid) {
		try {
			reader.getStream().setShort(this.e_oemid, e_oemid);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
	}

	public short getE_oeminfo() {
		try {
			return reader.getStream().getShort(e_oeminfo);
		} catch (IOException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public void setE_oeminfo(short e_oeminfo) {
		try {
			reader.getStream().setShort(this.e_oeminfo, e_oeminfo);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
	}

	public short[] getE_res2() {
		try {
			short[] output = new short[this.e_res2.length];
			for(int i=0;i<this.e_res2.length;i++)
				output[i] = reader.getStream().getShort(this.e_res2[i]);
			return output;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	public void setE_res2(short[] e_res2) {
		try {
			for(int i=0;i<this.e_res2.length;i++)
				reader.getStream().setShort(this.e_res2[i], e_res2[i]);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
	}

	public int getE_lfanew() {
		try {
			return reader.getStream().getInt(e_lfanew);
		} catch (IOException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public void setE_lfanew(int e_lfanew) {
		try {
			reader.getStream().setInt(this.e_lfanew, e_lfanew);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
	}

}
