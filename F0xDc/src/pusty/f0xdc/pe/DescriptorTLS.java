package pusty.f0xdc.pe;

import java.io.IOException;

import pusty.f0xdc.location.Address;
import pusty.f0xdc.pe.ExecutableReader;
import pusty.f0xdc.ExecutableStream;
import pusty.f0xdc.ReadableObject;

public class DescriptorTLS extends ReadableObject{

	protected IMAGE_TLS_DIRECTORY tls;
	protected Address[] callbacks;
	
	public DescriptorTLS(ExecutableReader reader)
			throws Exception {
		super(reader);
	}

	@Override
	public void read(ExecutableStream s) throws Exception {
		if(reader.is32bit()) {
			tls = new IMAGE_TLS_DIRECTORY32(reader);
			int addr = reader.addr2offset(tls.getAddressOfCallBacks());
			int offset = 0;
			int size = 0;
			for(offset=0;reader.getStream().getInt(addr+offset) != 0;offset+=4,size++);
			callbacks = new Address[size];
			for(offset=0;offset < size*4;offset+=4)
				callbacks[offset/4] = new Address(reader.getStream().getInt(addr+offset));
		} else {
			tls = new IMAGE_TLS_DIRECTORY64(reader);
			int addr = reader.addr2offset(tls.getAddressOfCallBacks());
			int offset = 0;
			int size = 0;
			for(offset=0;reader.getStream().getLong(addr+offset) != 0;offset+=8,size++);
			callbacks = new Address[size];
			for(offset=0;offset < size*8;offset+=8)
				callbacks[offset/8] = new Address(reader.getStream().getLong(addr+offset));
		}
	}
	
	/**
	 * Returns the callbacks noted in the TLS (addresses not RVAs or offsets)
	 * @return the callbacks of the tls
	 */
	public Address[] getTLSCallbacks() {
		return callbacks;
	}
	
	public IMAGE_TLS_DIRECTORY getTLS() {
		return tls;
	}

	public static abstract class IMAGE_TLS_DIRECTORY extends ReadableObject {

		protected int StartAddressOfRawData;
		protected int EndAddressOfRawData;
		protected int AddressOfIndex;
		protected int AddressOfCallBacks;
		protected int SizeOfZeroFill;
		protected int Characteristics;
		  
		public IMAGE_TLS_DIRECTORY(ExecutableReader reader) throws Exception {
			super(reader);
		}
		
		
		
		public abstract Address getStartAddressOfRawData();
		public abstract void setStartAddressOfRawData(Address startAddressOfRawData);
		public abstract Address getEndAddressOfRawData();
		public abstract void setEndAddressOfRawData(Address endAddressOfRawData);
		public abstract Address getAddressOfIndex();
		public abstract void setAddressOfIndex(Address addressOfIndex);
		public abstract Address getAddressOfCallBacks();
		public abstract void setAddressOfCallBacks(Address addressOfCallBacks);


		public int getSizeOfZeroFill() {
			try {
				return reader.getStream().getInt(SizeOfZeroFill);
			} catch (IOException e) {
				e.printStackTrace();
				return 0;
			}
		}



		public void setSizeOfZeroFill(int sizeOfZeroFill) {
			try {
				reader.getStream().setInt(SizeOfZeroFill, sizeOfZeroFill);
			} catch (IOException e) {
				e.printStackTrace();
				return;
			}
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
		
	}

	public static class IMAGE_TLS_DIRECTORY32 extends IMAGE_TLS_DIRECTORY {

		public IMAGE_TLS_DIRECTORY32(ExecutableReader reader) throws Exception {
			super(reader);
		}
		
		@Override
		public void read(ExecutableStream s) throws Exception {
			StartAddressOfRawData = s.readAddrInt();
			EndAddressOfRawData   = s.readAddrInt();
			AddressOfIndex        = s.readAddrInt();
			AddressOfCallBacks    = s.readAddrInt();
			SizeOfZeroFill        = s.readAddrInt();
			Characteristics       = s.readAddrInt();
		}
		
		public int getStartAddressOfRawData32() {
			try {
				return reader.getStream().getInt(StartAddressOfRawData);
			} catch (IOException e) {
				e.printStackTrace();
				return 0;
			}
		}

		public void setStartAddressOfRawData32(int startAddressOfRawData) {
			try {
				reader.getStream().setInt(StartAddressOfRawData, startAddressOfRawData);
			} catch (IOException e) {
				e.printStackTrace();
				return;
			}
		}

		@Override
		public Address getStartAddressOfRawData() {
			return new Address(getStartAddressOfRawData32());
		}

		@Override
		public void setStartAddressOfRawData(Address startAddressOfRawData) {
			setStartAddressOfRawData32(startAddressOfRawData.getAddr32());
		}

		public int getEndAddressOfRawData32() {
			try {
				return reader.getStream().getInt(EndAddressOfRawData);
			} catch (IOException e) {
				e.printStackTrace();
				return 0;
			}
		}

		public void setEndAddressOfRawData32(int endAddressOfRawData) {
			try {
				reader.getStream().setInt(EndAddressOfRawData, endAddressOfRawData);
			} catch (IOException e) {
				e.printStackTrace();
				return;
			}
		}

		@Override
		public Address getEndAddressOfRawData() {
			return new Address(getEndAddressOfRawData32());
		}

		@Override
		public void setEndAddressOfRawData(Address endAddressOfRawData) {
			setEndAddressOfRawData32(endAddressOfRawData.getAddr32());
		}
		
		
		public int getAddressOfIndex32() {
			try {
				return reader.getStream().getInt(AddressOfIndex);
			} catch (IOException e) {
				e.printStackTrace();
				return 0;
			}
		}

		public void setAddressOfIndex32(int addressOfIndex) {
			try {
				reader.getStream().setInt(AddressOfIndex, addressOfIndex);
			} catch (IOException e) {
				e.printStackTrace();
				return;
			}
		}

		@Override
		public Address getAddressOfIndex() {
			return new Address(getAddressOfIndex32());
		}

		@Override
		public void setAddressOfIndex(Address addressOfIndex) {
			setAddressOfIndex32(addressOfIndex.getAddr32());
		}
		
		public int getAddressOfCallBacks32() {
			try {
				return reader.getStream().getInt(AddressOfCallBacks);
			} catch (IOException e) {
				e.printStackTrace();
				return 0;
			}
		}

		public void setAddressOfCallBacks32(int addressOfCallBacks) {
			try {
				reader.getStream().setInt(AddressOfCallBacks, addressOfCallBacks);
			} catch (IOException e) {
				e.printStackTrace();
				return;
			}
		}

		@Override
		public Address getAddressOfCallBacks() {
			return new Address(getAddressOfCallBacks32());
		}

		@Override
		public void setAddressOfCallBacks(Address addressOfCallBacks) {
			setAddressOfCallBacks32(addressOfCallBacks.getAddr32());
		}


	}
	
	public static class IMAGE_TLS_DIRECTORY64 extends IMAGE_TLS_DIRECTORY {

		public IMAGE_TLS_DIRECTORY64(ExecutableReader reader) throws Exception {
			super(reader);
		}
		
		@Override
		public void read(ExecutableStream s) throws Exception {
			StartAddressOfRawData = s.readAddrLong();
			EndAddressOfRawData   = s.readAddrLong();
			AddressOfIndex        = s.readAddrLong();
			AddressOfCallBacks    = s.readAddrLong();
			SizeOfZeroFill        = s.readAddrInt();
			Characteristics       = s.readAddrInt();
		}
		
		public long getStartAddressOfRawData64() {
			try {
				return reader.getStream().getLong(StartAddressOfRawData);
			} catch (IOException e) {
				e.printStackTrace();
				return 0;
			}
		}

		public void setStartAddressOfRawData64(long startAddressOfRawData) {
			try {
				reader.getStream().setLong(StartAddressOfRawData, startAddressOfRawData);
			} catch (IOException e) {
				e.printStackTrace();
				return;
			}
		}

		@Override
		public Address getStartAddressOfRawData() {
			return new Address(getStartAddressOfRawData64());
		}

		@Override
		public void setStartAddressOfRawData(Address startAddressOfRawData) {
			setStartAddressOfRawData64(startAddressOfRawData.getAddr64());
		}

		public long getEndAddressOfRawData64() {
			try {
				return reader.getStream().getLong(EndAddressOfRawData);
			} catch (IOException e) {
				e.printStackTrace();
				return 0;
			}
		}

		public void setEndAddressOfRawData64(long endAddressOfRawData) {
			try {
				reader.getStream().setLong(EndAddressOfRawData, endAddressOfRawData);
			} catch (IOException e) {
				e.printStackTrace();
				return;
			}
		}

		@Override
		public Address getEndAddressOfRawData() {
			return new Address(getEndAddressOfRawData64());
		}

		@Override
		public void setEndAddressOfRawData(Address endAddressOfRawData) {
			setEndAddressOfRawData64(endAddressOfRawData.getAddr64());
		}
		
		
		public long getAddressOfIndex64() {
			try {
				return reader.getStream().getLong(AddressOfIndex);
			} catch (IOException e) {
				e.printStackTrace();
				return 0;
			}
		}

		public void setAddressOfIndex64(long addressOfIndex) {
			try {
				reader.getStream().setLong(AddressOfIndex, addressOfIndex);
			} catch (IOException e) {
				e.printStackTrace();
				return;
			}
		}

		@Override
		public Address getAddressOfIndex() {
			return new Address(getAddressOfIndex64());
		}

		@Override
		public void setAddressOfIndex(Address addressOfIndex) {
			setAddressOfIndex64(addressOfIndex.getAddr64());
		}
		
		public long getAddressOfCallBacks64() {
			try {
				return reader.getStream().getLong(AddressOfCallBacks);
			} catch (IOException e) {
				e.printStackTrace();
				return 0;
			}
		}

		public void setAddressOfCallBacks64(long addressOfCallBacks) {
			try {
				reader.getStream().setLong(AddressOfCallBacks, addressOfCallBacks);
			} catch (IOException e) {
				e.printStackTrace();
				return;
			}
		}

		@Override
		public Address getAddressOfCallBacks() {
			return new Address(getAddressOfCallBacks64());
		}

		@Override
		public void setAddressOfCallBacks(Address addressOfCallBacks) {
			setAddressOfCallBacks64(addressOfCallBacks.getAddr64());
		}


	}
}
