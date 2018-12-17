package pusty.f0xC.x64.rt;


import pusty.f0xC.lang.OverrideHandler.OverrideTranslation;
import pusty.f0xC.x64.internal.InternalObject;
import pusty.f0xC.x64.internal.Internal;

@OverrideTranslation(override = "java/lang/Class")
public class OClass<T>  {
	
    private String name;
    private long structAddr;
    
    //result of obj2int
	public OClass(long l) {
		structAddr = l; //read id struct
	}
	
    public String toString() {
        return ("class "+ getName());
    }
    
    //public boolean isInstance(Object obj);
    //public boolean isAssignableFrom(Class<?> cls);
    //public boolean isArray();
    
    public String getName() {
        String name = this.name;
        if (name == null)
            this.name = name = getName0();
        return name;
    }
    
    private String getName0() {
    	String name = "";
		long strAddr = InternalObject.getClassName(structAddr);
		char lastRead = 1;
		for(int index=0;;index++) {
			lastRead = (char)Internal.staticReadByte(strAddr+index);
			if(lastRead == 0) break;
			if(lastRead == '/')
				lastRead = '.';
			name += lastRead;
		}
    	return name;
    }
    
   // public Class<? super T> getSuperclass();

	
}
