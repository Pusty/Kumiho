package pusty.f0cr.data;

import java.io.DataInputStream;

import pusty.f0cr.ClassReader;

public class BootstrapMethods {

	protected short bootstrap_method_ref;
    protected short num_bootstrap_arguments;
    protected short[] bootstrap_arguments;
    
	protected ClassReader classReader;
	
	public BootstrapMethods(ClassReader classReader, DataInputStream s) throws Exception {
		this.classReader = classReader;
		read(s);
	}
	public void read(DataInputStream s) throws Exception {
		bootstrap_method_ref = s.readShort();
		num_bootstrap_arguments = s.readShort();
		bootstrap_arguments = new short[num_bootstrap_arguments];
		for(int i=0;i<num_bootstrap_arguments;i++)
			bootstrap_arguments[i] = s.readShort();
	}
	public int getBootstrapMethodRef() { return bootstrap_method_ref; }
	public int getNumBootstrapArguments() { return num_bootstrap_arguments; }
	public short[] getBootstrapArguments() { return bootstrap_arguments; }

}
