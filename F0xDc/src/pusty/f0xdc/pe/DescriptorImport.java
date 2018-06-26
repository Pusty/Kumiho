package pusty.f0xdc.pe;

import java.io.IOException;
import java.util.ArrayList;

import pusty.f0xdc.pe.ExecutableReader;
import pusty.f0xdc.ExecutableStream;
import pusty.f0xdc.ReadableObject;
import pusty.f0xdc.location.Address;

public class DescriptorImport extends ReadableObject {

	protected IMAGE_IMPORT_DESCRIPTOR[] importArray;
	
	
	public DescriptorImport(ExecutableReader reader)
			throws Exception {
		super(reader);
	}
	

	@Override
	public void read(ExecutableStream s) throws Exception {
		ArrayList<IMAGE_IMPORT_DESCRIPTOR> imports = new ArrayList<IMAGE_IMPORT_DESCRIPTOR>();
		IMAGE_IMPORT_DESCRIPTOR tempDesc = new IMAGE_IMPORT_DESCRIPTOR(reader);
		while(!tempDesc.isEmpy()) { //While the entry isn't empty read new ones
			imports.add(tempDesc);
			tempDesc = new IMAGE_IMPORT_DESCRIPTOR(reader);
		}
		importArray = imports.toArray(new IMAGE_IMPORT_DESCRIPTOR[imports.size()]);
	
	}
	
	public IMAGE_IMPORT_DESCRIPTOR[] getImports() {
		return importArray;
	}
	
	public static class IMAGE_IMPORT_DESCRIPTOR extends ReadableObject {
		//UNION
		protected int Characteristics;
		protected int OriginalFirstThunk;
		//UNION END
	    
		protected int TimeDateStamp;
		protected int ForwarderChain;
		protected int Name;
		protected int FirstThunk;
	    
		//IMAGE_IMPORT_DESCRIPTORs
		public IMAGE_IMPORT_DESCRIPTOR(ExecutableReader reader)
				throws Exception {
			super(reader);
		}
		
		@Override
		public void read(ExecutableStream s) throws Exception {
			Characteristics = s.readAddrInt();
			s.setIndex(s.getIndex()-4);
			OriginalFirstThunk = s.readAddrInt(); //RVA to list of pointers (RVAs) to IMAGE_IMPORT_BY_NAME
	
		    TimeDateStamp = s.readAddrInt(); //Date when file was build
		    ForwarderChain = s.readAddrInt(); //Index within Thunks to forward to another DLL
		    Name = s.readAddrInt(); //RVA to Null-Terminated ASCII String
		    FirstThunk = s.readAddrInt(); //RVA to IMAGE_THUNK_DATA
		}
		
		public String getDLLName() throws IOException {
			return reader.getStream().getString(reader.rva2offset(new Address(this.getName())));
		}
		
		public IMAGE_THUNK_DATA[] parseHintNameTable() throws Exception {
			return parseTableAt(this.getOriginalFirstThunkOffset());
		}
		public IMAGE_THUNK_DATA[] parseImportTable() throws Exception {
			return parseTableAt(this.getFirstThunkOffset());
		}
		
		public IMAGE_THUNK_DATA[] parseTableAt(int firstThunkOffset) throws Exception {
			ArrayList<IMAGE_THUNK_DATA> table = new ArrayList<IMAGE_THUNK_DATA>();
			int temp = reader.getStream().getIndex();
			reader.getStream().setIndex(firstThunkOffset); //RVA to RVA Table
			IMAGE_THUNK_DATA data;
			while(true) {
				data = IMAGE_THUNK_DATA.readImageThunk(reader);
				if(data.isNull()) break;
				table.add(data);
			}
			reader.getStream().setIndex(temp);
			return table.toArray(new IMAGE_THUNK_DATA[table.size()]);
		}
		
		public int getOriginalFirstThunkOffset() {
			return reader.rva2offset(new Address(getOriginalFirstThunk()));
		}
		
		public int getFirstThunkOffset() {
			return reader.rva2offset(new Address(getFirstThunk()));
		}
	
		public int getCharacteristics() {
			try {
				return reader.getStream().getInt(Characteristics);
			} catch (IOException e) {
				e.printStackTrace();
				return 0;
			}
		}
	
		public void setCharacteristics(int characteristics) {
			try {
				reader.getStream().setInt(Characteristics, characteristics);
			} catch (IOException e) {
				e.printStackTrace();
				return;
			}
		}
	
		public int getOriginalFirstThunk() {
			try {
				return reader.getStream().getInt(OriginalFirstThunk);
			} catch (IOException e) {
				e.printStackTrace();
				return 0;
			}
		}
	
		public void setOriginalFirstThunk(int originalFirstThunk) {
			try {
				reader.getStream().setInt(OriginalFirstThunk, originalFirstThunk);
			} catch (IOException e) {
				e.printStackTrace();
				return;
			}
		}
	
		public int getTimeDateStamp() {
			try {
				return reader.getStream().getInt(TimeDateStamp);
			} catch (IOException e) {
				e.printStackTrace();
				return 0;
			}
		}
	
		public void setTimeDateStamp(int timeDateStamp) {
			try {
				reader.getStream().setInt(TimeDateStamp, timeDateStamp);
			} catch (IOException e) {
				e.printStackTrace();
				return;
			}
		}
	
		public int getForwarderChain() {
			try {
				return reader.getStream().getInt(ForwarderChain);
			} catch (IOException e) {
				e.printStackTrace();
				return 0;
			}
		}
	
		public void setForwarderChain(int forwarderChain) {
			try {
				reader.getStream().setInt(ForwarderChain, forwarderChain);
			} catch (IOException e) {
				e.printStackTrace();
				return;
			}
		}
	
		public int getName() {
			try {
				return reader.getStream().getInt(Name);
			} catch (IOException e) {
				e.printStackTrace();
				return 0;
			}
		}
	
		public void setName(int name) {
			try {
				reader.getStream().setInt(Name, name);
			} catch (IOException e) {
				e.printStackTrace();
				return;
			}
		}
	
		public int getFirstThunk() {
			try {
				return reader.getStream().getInt(FirstThunk);
			} catch (IOException e) {
				e.printStackTrace();
				return 0;
			}
		}
	
		public void setFirstThunk(int firstThunk) {
			try {
				reader.getStream().setInt(FirstThunk, firstThunk);
			} catch (IOException e) {
				e.printStackTrace();
				return;
			}
		}
	}
	
	public static class IMAGE_IMPORT_BY_NAME extends ReadableObject{
		protected int Hint;
		protected int Name;
		protected String NameStr;

		public IMAGE_IMPORT_BY_NAME(ExecutableReader reader)
				throws Exception {
			super(reader);
		}

		public void read(ExecutableStream s) throws Exception {
			Hint = s.readAddrShort();
			Name = s.getIndex();
			NameStr = s.getString(Name);
			s.setIndex(Name+NameStr.length()+1);
		}
		
		public String getName() {
			return NameStr;
		}

		public void setString(String str) {
			try {
				//Empty old string
				if(getName() != null)
					for(int i=0;i<getName().length()+1;i++)
						reader.getStream().setByte(Name+i, (byte)0);
				//Write in the new string
				for(int i=0;i<str.length();i++)
						reader.getStream().setByte(Name+i, (byte)(str.charAt(i)&0xFF));
				//Zero terminate the new string
				reader.getStream().setByte(Name+str.length(), (byte)0);
				NameStr = reader.getStream().getString(Name);
				reader.getStream().setIndex(Name+NameStr.length()+1);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		public short getHint() {
			try {
				return reader.getStream().getShort(Hint);
			} catch (IOException e) {
				e.printStackTrace();
				return 0;
			}
		}

		public void setHint(short hint) {
			try {
				reader.getStream().setShort(Hint, hint);
			} catch (IOException e) {
				e.printStackTrace();
				return;
			}
		}

		
		
		
	}
	
	
	public static abstract class IMAGE_THUNK_DATA extends ReadableObject {
		//UNION
	    public int ForwarderString;
	    public int Function;
	    public int Ordinal;
	    public int AddressOfData;
	    //UNION END
		public IMAGE_THUNK_DATA(ExecutableReader reader)
				throws Exception {
			super(reader);
		}
		public abstract boolean isOrdinal();
		public abstract int getOrdinal();
		public abstract int getNameOffset();
		public abstract IMAGE_IMPORT_BY_NAME getImportByName() throws Exception;
		public abstract String getName();	
		public abstract void setOrdinal(int i);
		public abstract void setNameOffset(int o);
		public abstract void setNameOffsetRaw(int o);		
		public abstract int getNameOffsetRaw();
		public boolean isNull() {
			if(isOrdinal()) return false;
			return (getNameOffset()==0);
		}
		public static IMAGE_THUNK_DATA readImageThunk(ExecutableReader reader) {
			try {
				if(reader.is32bit()) {
					return new IMAGE_THUNK_DATA32(reader);
				}else {
					return new IMAGE_THUNK_DATA64(reader);
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
			return null;
		}
	}
	public static class IMAGE_THUNK_DATA32 extends IMAGE_THUNK_DATA{
		public static int IMAGE_ORDINAL_FLAG32 = 0x80000000;
		public IMAGE_THUNK_DATA32(ExecutableReader reader)
				throws Exception {
			super(reader);
		}
		public void read(ExecutableStream s) throws Exception {
	        ForwarderString = s.readAddrInt();
	        s.setIndex(s.getIndex()-4);
	        Function = s.readAddrInt();
	        s.setIndex(s.getIndex()-4);
	        Ordinal = s.readAddrInt();
	        s.setIndex(s.getIndex()-4);
	        AddressOfData = s.readAddrInt();
	        //If read value &IMAGE_ORDINAL_FLAG == 1 => ordinal else rva to import by name
		}
		
		public int getGenericValue() {
			try {
				return reader.getStream().getInt(Ordinal);
			} catch (IOException e) {
				e.printStackTrace();
				return 0;
			}
		}
		public void setGenericValue(int l) {
			try {
				reader.getStream().setInt(Ordinal, l);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		public boolean isOrdinal() {
			try {
				return (reader.getStream().getInt(Ordinal)&IMAGE_ORDINAL_FLAG32)!=0;
			} catch (IOException e) {
				e.printStackTrace();
				return false;
			}
		}
		public int getOrdinal() {
			if(!isOrdinal()) return -1;
			try {
				return (int) (reader.getStream().getInt(Ordinal)&(~IMAGE_ORDINAL_FLAG32));
			} catch (IOException e) {
				e.printStackTrace();
				return -1;
			}
		}
		public int getNameOffset() {
			if(isOrdinal()) return -1;
			try {
				return reader.rva2offset(new Address(reader.getStream().getInt(ForwarderString)));
			} catch (IOException e) {
				e.printStackTrace();
				return -1;
			}
		}
		public IMAGE_IMPORT_BY_NAME getImportByName() throws Exception {
			if(isOrdinal()) return null;
			int temp = reader.getStream().getIndex();
			reader.getStream().setIndex(getNameOffset());
			IMAGE_IMPORT_BY_NAME iibn = new IMAGE_IMPORT_BY_NAME(reader);
			reader.getStream().setIndex(temp);
			return iibn;
		}
		public String getName() {
			if(isOrdinal()) return null;
			try {
				return getImportByName().getName();
			}catch(Exception e) {
				e.printStackTrace();
				return null;
			}
		}
		public void setOrdinal(int i) {
			try {
				reader.getStream().setInt(Ordinal, i|IMAGE_ORDINAL_FLAG32);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		public void setNameOffset(int o) {
			try {
				reader.getStream().setInt(ForwarderString, reader.offset2rva(o).getAddr32());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}	
		
		public void setNameOffsetRaw(int o) {
			if(isOrdinal()) return;
			try {
				reader.getStream().setInt(ForwarderString, o);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}		
		public int getNameOffsetRaw() {
			if(isOrdinal()) return -1;
			try {
				return reader.getStream().getInt(ForwarderString);
			} catch (IOException e) {
				e.printStackTrace();
				return -1;
			}
		}
		
	}
	public static class IMAGE_THUNK_DATA64 extends IMAGE_THUNK_DATA{
		public static long IMAGE_ORDINAL_FLAG64 = 0x8000000000000000L;
		public IMAGE_THUNK_DATA64(ExecutableReader reader)
				throws Exception {
			super(reader);
		}

		public void read(ExecutableStream s) throws Exception {
	        ForwarderString = s.readAddrLong();
	        s.setIndex(s.getIndex()-8);
	        Function = s.readAddrLong();
	        s.setIndex(s.getIndex()-8);
	        Ordinal = s.readAddrLong();
	        s.setIndex(s.getIndex()-8);
	        AddressOfData = s.readAddrLong();
	       //If read value &IMAGE_ORDINAL_FLAG == 1 => ordinal else rva to import by name
		}
		public long getGenericValue() {
			try {
				return reader.getStream().getLong(Ordinal);
			} catch (IOException e) {
				e.printStackTrace();
				return 0;
			}
		}
		public void setGenericValue(long l) {
			try {
				reader.getStream().setLong(Ordinal, l);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		public boolean isOrdinal() {
			try {
				return (reader.getStream().getLong(Ordinal)&IMAGE_ORDINAL_FLAG64)!=0;
			} catch (IOException e) {
				e.printStackTrace();
				return false;
			}
		}
		public int getOrdinal() {
			if(!isOrdinal()) return -1;
			try {
				return (int) (reader.getStream().getLong(Ordinal)&(~IMAGE_ORDINAL_FLAG64));
			} catch (IOException e) {
				e.printStackTrace();
				return -1;
			}
		}
		public int getNameOffset() {
			if(isOrdinal()) return -1;
			try {
				return reader.rva2offset(new Address(reader.getStream().getLong(ForwarderString)));
			} catch (IOException e) {
				e.printStackTrace();
				return -1;
			}
		}
		public IMAGE_IMPORT_BY_NAME getImportByName() throws Exception {
			if(isOrdinal()) return null;
			int temp = reader.getStream().getIndex();
			reader.getStream().setIndex(getNameOffset());
			IMAGE_IMPORT_BY_NAME iibn = new IMAGE_IMPORT_BY_NAME(reader);
			reader.getStream().setIndex(temp);
			return iibn;
		}
		public String getName() {
			if(isOrdinal()) return null;
			try {
				return getImportByName().getName();
			}catch(Exception e) {
				e.printStackTrace();
				return null;
			}
		}
		public void setOrdinal(int i) {
			try {
				reader.getStream().setLong(Ordinal, i|IMAGE_ORDINAL_FLAG64);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		public void setNameOffset(int o) {
			try {
				reader.getStream().setLong(ForwarderString, reader.offset2rva(o).getAddr64());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}		
			
		public void setNameOffsetRaw(int o) {
			if(isOrdinal()) return;
			try {
				reader.getStream().setLong(ForwarderString, o);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}		
		public int getNameOffsetRaw() {
			if(isOrdinal()) return -1;
			try {
				return (int)reader.getStream().getLong(ForwarderString);
			} catch (IOException e) {
				e.printStackTrace();
				return -1;
			}
		}
		
	}	
}
