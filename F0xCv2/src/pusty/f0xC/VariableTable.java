package pusty.f0xC;


import java.util.HashMap;
import java.util.Map.Entry;

public class VariableTable {
	
	private HashMap<Integer, String> nameTable;
	private HashMap<Integer, String> odescTable;
	private HashMap<Integer, Integer> offsetTable;
	private HashMap<Integer, Integer> indexTable;
	private int currentIndex;
	private int currentSize;
	private ContextClass owner;
	
	public VariableTable(ContextClass owner) {
		nameTable = new HashMap<Integer, String>();
		odescTable = new HashMap<Integer, String>();
		offsetTable = new HashMap<Integer, Integer>();
		indexTable = new HashMap<Integer, Integer>();
		currentIndex = 0;
		currentSize = 0;
		this.owner = owner;
	}
	public void registerVariable(String name, String desc) {
		int id = name.hashCode();
		if(!nameTable.containsKey(id)) {
			nameTable.put(id ,name);
			odescTable.put(id, desc);
			indexTable.put(currentIndex, id);
			currentIndex++;
		}
	}
	public void registerTable(VariableTable externaltable) {
		registerTable(externaltable, true);
	}
	
	public void registerTable(VariableTable externaltable, boolean sameIndex) {
		if(externaltable == this) return;
		for(Entry<Integer, Integer> idIndex:externaltable.indexTable.entrySet()) {
			if(indexTable.containsValue(idIndex.getValue()))
				continue;
			if(sameIndex && currentIndex != idIndex.getKey())
				System.err.println("Different Id assigned "+currentIndex+"-"+idIndex.getKey()+" -> "+owner.getClassName()+" ["+externaltable.nameTable.get(idIndex.getValue())+"] {This: "+this+"}{External: "+externaltable+"}");
			registerVariable(externaltable.nameTable.get(idIndex.getValue()), externaltable.odescTable.get(idIndex.getValue()));
		}
	}
	
	public String toString() {
		HashMap<String, Integer> tstr = new HashMap<String, Integer>();
		for(int i=0;i<indexTable.size();i++) {
			if(!indexTable.containsKey(i)) {break;}
			int id = indexTable.get(i);
			tstr.put(nameTable.get(id), offsetTable.get(id));
		}
		return "VariableTable: "+tstr.toString();
	}
	public void calculate(int addrSize) {
		for(int i=0;i<indexTable.size();i++) {
			if(!indexTable.containsKey(i)) {
				System.err.println("Error calculating variable table");
				return;
			}
			int id = indexTable.get(i);
			offsetTable.put(id, currentSize);
			currentSize += F0xUtil.convertedSize(odescTable.get(id), addrSize);
		}
	}
	public int getSize() {
		return currentSize;
	}
	public int getOffset(String str) {
		if(!nameTable.containsKey(str.hashCode())) { 
			System.err.println("Requested unknown variable '"+str+"'");
			return -1;
		}
		if(!offsetTable.containsKey(str.hashCode())) { 
			System.err.println("Offset requested but not calculated yet");
			return -1;
		}
		return offsetTable.get(str.hashCode());
	}
	public String getDesc(String str) {
		if(!nameTable.containsKey(str.hashCode())) { 
			System.err.println("Requested unknown variable '"+str+"'");
			return null;
		}
		if(!odescTable.containsKey(str.hashCode())) { 
			System.err.println("Description requested but not converted yet");
			return null;
		}
		return odescTable.get(str.hashCode());
	}
	
	public HashMap<Integer, String> getNameTable() {
		return nameTable;
	}
}
