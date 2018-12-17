package pusty.f0xC.x64;

import java.util.ArrayList;
import java.util.Arrays;

import pusty.f0xC.rt.ClassConfigRT;
import pusty.f0xC.x64.internal.*;
import pusty.f0xC.x64.libc.*;
import pusty.f0xC.x64.rt.*;
import pusty.f0xC.x64.overrides.*;

public class ClassConfig64 {
	
	public static final Class<?>[] INTERNAL = {
		GarbageCollector.class,
		Internal.class,
		InternalObject.class
	};
	
	public static final Class<?>[] LIBC = {
			OLibC.class,
			OCStdio.class,
			OCStdlib.class,
			OCFile.class
	};
	
	public static final Class<?>[] RUNTIME = {
			OClass.class,
			OObject.class,
			OThrowable.class,
			x64Math.class,
			OSystem.class
	};
	
	public static final Class<?>[] OVERRIDE = {
			x64Internal.class,
			x64InternalObject.class
	};
	
	private static Class<?>[] DEFAULT = null;
	public static Class<?>[] getDefault() {
		if(DEFAULT == null) {
			ArrayList<Class<?>> tmp = new ArrayList<Class<?>>();
			tmp.addAll(Arrays.asList(RUNTIME));
			tmp.addAll(Arrays.asList(INTERNAL));
			tmp.addAll(Arrays.asList(ClassConfigRT.getRuntime()));
			tmp.addAll(Arrays.asList(LIBC));
			tmp.addAll(Arrays.asList(OVERRIDE));
			DEFAULT = tmp.toArray(new Class<?>[tmp.size()]);
		}
		return DEFAULT;
	}
}
