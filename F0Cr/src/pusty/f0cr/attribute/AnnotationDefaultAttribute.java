package pusty.f0cr.attribute;

import java.io.DataInputStream;

import pusty.f0cr.ClassReader;
import pusty.f0cr.data.ElementValue;

public class AnnotationDefaultAttribute extends Attribute {
	protected ElementValue default_value;
	
	public AnnotationDefaultAttribute(ClassReader classReader, DataInputStream s, int l) throws Exception {
		super(classReader, s, l);
	}

	@Override
	public void read(DataInputStream s) throws Exception {
		default_value = new ElementValue(classReader, s);
	}
	
	public ElementValue getDefaultValue() { return default_value; }

}
