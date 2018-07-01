package pusty.f0cr.util;

import java.util.ArrayList;

import pusty.f0cr.FieldTable;
import pusty.f0cr.data.FieldInfo;

public class StaticStruct {
	protected FieldTable fieldTable;
	protected FieldInfo[] fieldInfos;
	public StaticStruct(FieldTable table) {
		fieldTable = table;
		ArrayList<FieldInfo> fieldList = new ArrayList<FieldInfo>();
		for(FieldInfo f:fieldTable.getIndexes()) {
			if((AccessFlags.isStatic(f.getAccessFlags()) || AccessFlags.isFinal(f.getAccessFlags())))
				fieldList.add(f);
		}
		fieldInfos = fieldList.toArray(new FieldInfo[fieldList.size()]);
	}
	public FieldInfo[] getVariables() {
		return fieldInfos;
	}
	public void printOut(String pre) {
		for(FieldInfo field:fieldInfos) {
			System.out.println(pre+"SVar: ["+AccessFlags.getFlags(field.getAccessFlags())+"]"+field.getName()+" "+field.getDescription());
		}
	}
}
