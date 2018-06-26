package pusty.f0xdc.weaver;

import java.util.ArrayList;

import pusty.f0xdc.pe.ExecutableReader;
import pusty.f0xdc.location.MemorySection;
import pusty.f0xdc.location.SectionSearcher;

public class WeaverUtil {
	// Queries all Code Caves with a given size and sort them after usability
	public static ArrayList<MemorySection> querySorted(ExecutableReader reader, int minSize) {
		return querySortedFiltered(reader, minSize, null, SectionSearcher.MODE_NORMAL);
	}
	// Queries all Code Caves with a given size and sorts them after usability but applies a filter (only those mentioned)
	public static ArrayList<MemorySection> querySortedFiltered(ExecutableReader reader, int minSize, String[] filter, int searcherMode) {
		SectionSearcher searcher = new SectionSearcher(minSize, searcherMode);
		searcher.search(reader);
		ArrayList<MemorySection> result = new ArrayList<MemorySection>();
		
		//2 Class Quering
		
		//1st Class => .text
		ArrayList<MemorySection> class1 = new ArrayList<MemorySection>();
		String[] class1_str = { ".text" };
		//Last Class => other
		ArrayList<MemorySection> classLast = new ArrayList<MemorySection>();
		//Maybe more classes?
		
		for (int i = 0; i < searcher.getResults().length; i++) {
			if (searcher.getResults()[i].getSize() < minSize)
				continue;
			boolean found = false;
			//Applies a filter
			if(filter != null) {
				for(String fi:filter)
					if (searcher.getResults()[i].getSection().getName() .startsWith(fi))
						found = true;
			}else
				found = true;
			if(!found)
				continue;
			found = false;			
			//This code goes for every privilege class for a given section
			for(String startsWith:class1_str)
				if (searcher.getResults()[i].getSection().getName() .startsWith(startsWith)) {
					class1.add(searcher.getResults()[i]);
					found = true;
					break;
				}
			if(found) continue;
			//End of privilege code
					
			classLast.add(searcher.getResults()[i]);
		}
		result.addAll(class1);
		result.addAll(classLast);
		return result;
	}
	//Looks closest memory section to a specific size and filter
	public static int closestToSize(ArrayList<MemorySection> list, int size, String[] filter) {
		int found = -1;
		int bigger = Integer.MAX_VALUE;
		for(int i=0;i<list.size();i++) {
			MemorySection ms = list.get(i);
			if(filter != null) {
				boolean ok = true;
				for(String s:filter)
					if(!ms.getSection().getName().startsWith(s))
						ok = false;
				if(!ok) continue;
				
			}
			if(ms.getSize() >= size) {
				if(ms.getSize()-size == 0) return i;
				int big = ms.getSize()-size;
				if(big < bigger) {
					bigger = big;
					found = i;
				}
			}
		}
		return found;
	}
	
	
}
