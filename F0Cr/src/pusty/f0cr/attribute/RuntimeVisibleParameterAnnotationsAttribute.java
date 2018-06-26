package pusty.f0cr.attribute;

import java.io.DataInputStream;

import pusty.f0cr.ClassReader;
import pusty.f0cr.data.RuntimeParameterAnnotations;

public class RuntimeVisibleParameterAnnotationsAttribute extends Attribute {

	protected byte num_parameters;
	protected RuntimeParameterAnnotations[] parameter_annotations;
	
	public RuntimeVisibleParameterAnnotationsAttribute(ClassReader classReader, DataInputStream s, int l) throws Exception {
		super(classReader, s, l);
	}

	@Override
	public void read(DataInputStream s) throws Exception {
		num_parameters = s.readByte();
		parameter_annotations = new RuntimeParameterAnnotations[num_parameters];
		for(int i=0;i<num_parameters;i++)
			parameter_annotations[i] = new RuntimeParameterAnnotations(classReader, s);
	}
	
	public byte getNumParameters() { return num_parameters; }
	public RuntimeParameterAnnotations[] getAttributeTable() { return parameter_annotations; }

}
