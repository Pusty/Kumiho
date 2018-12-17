package pusty.f0xC.rt;

import java.util.ArrayList;
import java.util.Arrays;

import pusty.f0xC.rt.io.*;
import pusty.f0xC.rt.lang.*;
import pusty.f0xC.rt.lang.throwable.*;
import pusty.f0xC.rt.util.*;

public class ClassConfigRT {
	public static final Class<?>[] IO = {
			OByteArrayInputStream.class,
			ODataInput.class,
			ODataInputStream.class,
			OFile.class,
			OFileDescriptor.class,
			OFileInputStream.class,
			OFileSystem.class,
			OFileInputStream.class,
			OFileOutputStream.class,
			OInputStream.class,
			OOutputStream.class,
			OPrintStream.class
	};
	
	public static final Class<?>[] LANG = {
			OBoolean.class,
			OByte.class,
			OCharacter.class,
			OCharSequence.class,
			ODouble.class,
			OFloat.class,
			OInteger.class,
			OLong.class,
			ONumber.class,
			OString.class,
			OStringBuilder.class,
			ORuntime.class,
			OProcess.class,
			OProcessBuilder.class,
			OProcessImpl.class,
			OMath.class
	};
	
	public static final Class<?>[] THROWABLE = {
			OArrayIndexOutOfBoundsException.class,
			OEOFException.class,
			OError.class,
			OException.class,
			OFileNotFoundException.class,
			OIllegalArgumentException.class,
			OIllegalStateException.class,
			OIndexOutOfBoundsException.class,
			OIOException.class,
			ONullPointerException.class,
			ONumberFormatException.class,
			OOutOfMemoryError.class,
			ORuntimeException.class,
			OStringIndexOutOfBoundsException.class,
			OUTFDataFormatException.class,
			OVirtualMachineError.class,
			OUnsupportedOperationException.class,
			OLinkageError.class,
			OUnsatisfiedLinkError.class,
			ONoSuchElementException.class
	};
	
	public static final Class<?>[] UTIL = {
			HashEntry.class,
			MapEntry.class,
			HashEntrySet.class,
			HashKeySet.class,
			HashValues.class,
			OArrayList.class,
			OArrays.class,
			OCollection.class,
			OIterable.class,
			OIterator.class,
			OList.class,
			OListIterator.class,
			OSet.class,
			OAbstractSet.class,
			OAbstractMap.class,
			OMap.class,
			OAbstractCollection.class,
			OHashMap.class,
			OObjects.class,
			OEnumeration.class,
			OStringTokenizer.class
	};
	
	//THIS DOESN'T INCLUDE ARCHITECTURE SPECIFIC CLASSES (Class.class, Math.class, Object.class, System.class, Throwable.class)
	
	private static Class<?>[] DEFAULT = null;
	public static Class<?>[] getRuntime() {
		if(DEFAULT == null) {
			ArrayList<Class<?>> tmp = new ArrayList<Class<?>>();
			tmp.addAll(Arrays.asList(IO));
			tmp.addAll(Arrays.asList(LANG));
			tmp.addAll(Arrays.asList(THROWABLE));
			tmp.addAll(Arrays.asList(UTIL));
			DEFAULT = tmp.toArray(new Class<?>[tmp.size()]);
		}
		return DEFAULT;
	}
}
