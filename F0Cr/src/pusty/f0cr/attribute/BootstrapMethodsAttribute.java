package pusty.f0cr.attribute;

import java.io.DataInputStream;

import pusty.f0cr.ClassReader;
import pusty.f0cr.data.BootstrapMethods;

public class BootstrapMethodsAttribute extends Attribute {
	protected short num_bootstrap_methods;
	protected BootstrapMethods[] bootstrap_methods;
	
	public BootstrapMethodsAttribute(ClassReader classReader, DataInputStream s, int l) throws Exception {
		super(classReader, s, l);
	}

	@Override
	public void read(DataInputStream s) throws Exception {
		num_bootstrap_methods = s.readShort();
		bootstrap_methods = new BootstrapMethods[num_bootstrap_methods];
		for(int i=0;i<num_bootstrap_methods;i++)
			bootstrap_methods[i] = new BootstrapMethods(classReader, s);
	}
	
	public short getNumBootstrapMethods() { return num_bootstrap_methods; }
	public BootstrapMethods[] getBootstrapMethods() { return bootstrap_methods; }
}
