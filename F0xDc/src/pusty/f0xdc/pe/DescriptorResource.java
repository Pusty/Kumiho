package pusty.f0xdc.pe;

import java.io.IOException;
import pusty.f0xdc.pe.ExecutableReader;
import pusty.f0xdc.ExecutableStream;
import pusty.f0xdc.ReadableObject;

public class DescriptorResource extends ReadableObject{

	protected IMAGE_RESOURCE_DIRECTORY root;
	public DescriptorResource(ExecutableReader reader)
			throws Exception {
		super(reader);
	}
	

	@Override
	public void read(ExecutableStream s) throws Exception {
		root = new IMAGE_RESOURCE_DIRECTORY(reader);
		root.parse();
	}
	
	public IMAGE_RESOURCE_DIRECTORY getRoot() {
		return root;
	}

	public static class IMAGE_RESOURCE_DIRECTORY extends ReadableObject {
		
		protected int Characteristics;
		protected int TimeDateStamp;
		protected int MajorVersion;
		protected int MinorVersion;
		protected int NumberOfNamedEntries;
		protected int NumberOfIdEntries;
		
	
		protected IMAGE_RESOURCE_DIRECTORY_ENTRY[] entries;
		
		public IMAGE_RESOURCE_DIRECTORY(ExecutableReader reader) throws Exception {
			super(reader);
		}

		@Override
		public void read(ExecutableStream s) throws Exception {
		    Characteristics = s.readAddrInt();
		    TimeDateStamp = s.readAddrInt();
		    MajorVersion = s.readAddrShort();
		    MinorVersion = s.readAddrShort();
		    NumberOfNamedEntries = s.readAddrShort();
		    NumberOfIdEntries = s.readAddrShort();
		}
		
		//Different function to not modify size of structure
		public void parse() throws Exception {
			entries = new IMAGE_RESOURCE_DIRECTORY_ENTRY[this.getNumberOfEntries()];
		    for(int i=0;i<entries.length;i++) {
		    	entries[i] = new IMAGE_RESOURCE_DIRECTORY_ENTRY(reader);
		    	entries[i].parse();
		    }
		}

		public IMAGE_RESOURCE_DIRECTORY_ENTRY[] getEntires() {
			return entries;
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

		public short getMajorVersion() {
			try {
				return reader.getStream().getShort(MajorVersion);
			} catch (IOException e) {
				e.printStackTrace();
				return 0;
			}
		}

		public void setMajorVersion(short majorVersion) {
			try {
				reader.getStream().setShort(MajorVersion, majorVersion);
			} catch (IOException e) {
				e.printStackTrace();
				return;
			}
		}

		public short getMinorVersion() {
			try {
				return reader.getStream().getShort(MinorVersion);
			} catch (IOException e) {
				e.printStackTrace();
				return 0;
			}
		}

		public void setMinorVersion(short minorVersion) {
			try {
				reader.getStream().setShort(MinorVersion, minorVersion);
			} catch (IOException e) {
				e.printStackTrace();
				return;
			}
		}

		public short getNumberOfNamedEntries() {
			try {
				return reader.getStream().getShort(NumberOfNamedEntries);
			} catch (IOException e) {
				e.printStackTrace();
				return 0;
			}
		}

		public void setNumberOfNamedEntries(short numberOfNamedEntries) {
			try {
				reader.getStream().setShort(NumberOfNamedEntries, numberOfNamedEntries);
			} catch (IOException e) {
				e.printStackTrace();
				return;
			}
		}

		public short getNumberOfIdEntries() {
			try {
				return reader.getStream().getShort(NumberOfIdEntries);
			} catch (IOException e) {
				e.printStackTrace();
				return 0;
			}
		}

		public void setNumberOfIdEntries(short numberOfIdEntries) {
			try {
				reader.getStream().setShort(NumberOfIdEntries, numberOfIdEntries);
			} catch (IOException e) {
				e.printStackTrace();
				return;
			}
		}
		
		public int getNumberOfEntries() {
			return getNumberOfIdEntries() + getNumberOfNamedEntries();
		}
		
	}
	public static class IMAGE_RESOURCE_DIRECTORY_ENTRY extends ReadableObject {
		public static int IMAGE_ORDINAL_FLAG32 = 0x80000000;
	    protected int Name;
	    protected int OffsetToData;
	    
	    protected IMAGE_RESOURCE_DATA_ENTRY data_entry = null;
	    protected IMAGE_RESOURCE_DIRECTORY  dir_entry  = null;
	    
	    
		public IMAGE_RESOURCE_DIRECTORY_ENTRY(ExecutableReader reader) throws Exception {
			super(reader);
		}

		@Override
		public void read(ExecutableStream s) throws Exception {
		    Name = s.readAddrInt();
		    OffsetToData = s.readAddrInt();
		}
		
		public boolean isDirectory() {
			return (getOffsetToData()&IMAGE_ORDINAL_FLAG32)!=0;
		}
		public void parse() throws Exception {
			int tmp = reader.getStream().getIndex();
			int offset = (getOffsetToData()&~IMAGE_ORDINAL_FLAG32)+reader.getOptionalHeader().getResourceOffset();
			reader.getStream().setIndex(offset);
			if(isDirectory()) {
				dir_entry = new IMAGE_RESOURCE_DIRECTORY(reader);
				dir_entry.parse();
			}else{
				data_entry = new IMAGE_RESOURCE_DATA_ENTRY(reader);
			}
			reader.getStream().setIndex(tmp);
		}
		public IMAGE_RESOURCE_DIRECTORY getDir() {
			if(!isDirectory()) return null;
			return dir_entry;
		}
		public IMAGE_RESOURCE_DATA_ENTRY getData() {
			if(isDirectory()) return null;
			return data_entry;
		}
		public boolean isOrdinal() {
			return (getName()&IMAGE_ORDINAL_FLAG32)==0;
		}
		public int getID() {
			if(!isOrdinal()) return -1;
			return getName();
		}
		public String getNameStr() {
			if(isOrdinal()) return null;
			int offset = (getName()&~IMAGE_ORDINAL_FLAG32);
			offset = offset + reader.getOptionalHeader().getResourceOffset();
			try {
				int size = reader.getStream().getShort(offset); //This is a IMAGE_RESOURCE_DIR_STRING_U structure
				char[] str = new char[size];                //I don't think it's necessary to create that as a new class
				for(int i=0;i<size;i++)
					str[i] = (char) reader.getStream().getShort(offset+2+2*i);
				return new String(str);
			} catch (IOException e) {
				e.printStackTrace();
				return null;
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

		public int getOffsetToData() {
			try {
				return reader.getStream().getInt(OffsetToData);
			} catch (IOException e) {
				e.printStackTrace();
				return 0;
			}
		}

		public void setOffsetToData(int offsetToData) {
			try {
				reader.getStream().setInt(OffsetToData, offsetToData);
			} catch (IOException e) {
				e.printStackTrace();
				return;
			}
		}

		
	}
	public static class IMAGE_RESOURCE_DATA_ENTRY extends ReadableObject {

	    protected int OffsetToData;
	    protected int Size;
	    protected int CodePage;
	    protected int Reserved;
	    
		public IMAGE_RESOURCE_DATA_ENTRY(ExecutableReader reader) throws Exception {
			super(reader);
		}
		
		@Override
		public void read(ExecutableStream s) throws Exception {
		    OffsetToData = s.readAddrInt();
		    Size = s.readAddrInt();
		    CodePage = s.readAddrInt();
		    Reserved = s.readAddrInt();
		}
		public byte[] getData() throws IOException {
			byte[] data = new byte[getSize()];
			//what the hell
			//why do I have to subtract the VIRTUAL ADDRESS of this offset?
			//and why do I only have to do this for the data entry?!
			int offset = getOffsetToData() - reader.offset2rva(reader.getOptionalHeader().getResourceOffset()).getAddr32() +reader.getOptionalHeader().getResourceOffset();
			for(int i=0;i<data.length;i++)
				data[i] = reader.getStream().getByte(offset+i);
			return data;
		}
		

		public int getOffsetToData() {
			try {
				return reader.getStream().getInt(OffsetToData);
			} catch (IOException e) {
				e.printStackTrace();
				return 0;
			}
		}

		public void setOffsetToData(int offsetToData) {
			try {
				reader.getStream().setInt(OffsetToData, offsetToData);
			} catch (IOException e) {
				e.printStackTrace();
				return;
			}
		}

		public int getSize() {
			try {
				return reader.getStream().getInt(Size);
			} catch (IOException e) {
				e.printStackTrace();
				return 0;
			}
		}

		public void setSize(int size) {
			try {
				reader.getStream().setInt(Size, size);
			} catch (IOException e) {
				e.printStackTrace();
				return;
			}
		}

		public int getCodePage() {
			try {
				return reader.getStream().getInt(CodePage);
			} catch (IOException e) {
				e.printStackTrace();
				return 0;
			}
		}

		public void setCodePage(int codePage) {
			try {
				reader.getStream().setInt(CodePage, codePage);
			} catch (IOException e) {
				e.printStackTrace();
				return;
			}
		}

		public int getReserved() {
			try {
				return reader.getStream().getInt(Reserved);
			} catch (IOException e) {
				e.printStackTrace();
				return 0;
			}
		}

		public void setReserved(int reserved) {
			try {
				reader.getStream().setInt(Reserved, reserved);
			} catch (IOException e) {
				e.printStackTrace();
				return;
			}
		}

	}
}
