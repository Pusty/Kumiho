package pusty.f0xC.lang.x86;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Optimizer86 {
	
	public static List<String> optimizeVTable(List<String> content2) {
		ArrayList<String> virtualFunctionCalled = new ArrayList<String>();
		StringBuilder content = fromList(content2);
		
		for(String str:content2) {
			//search for virtual function calls
			if(str.contains(";VFC:")) {
				String func = str.split(";VFC:")[1];
				if(!virtualFunctionCalled.contains(func))
					virtualFunctionCalled.add(func);
			}
			//remove virtual table entries
			else if(str.contains(";VFT:")) {
				String func = str.split(";VFT:")[1];
				if(!virtualFunctionCalled.contains(func)) {
					int index = content.indexOf(str);
					content.replace(index, index+str.length(), str.split(" ")[0] + " 0");
				}
			}
		}
		
		
		return Arrays.asList(content.toString().split("\n"));
	}
	
	private static StringBuilder fromList(List<String> l) {
		Object[] strA = l.toArray();
		StringBuilder b = new StringBuilder();
		for (int i = 0; i<strA.length; i++) {
            b.append(String.valueOf(strA[i]));
            b.append("\n");
        }
		return b;
	}
	
	public static List<String> optimizeLabel(List<String> content2) {
		
		StringBuilder content = fromList(content2);
		
		for(String str:content2) {
			if(str.endsWith("_start:")) { //Label Code
				String label = str.split(":")[0].replace(":", "").trim();
				int found = -1;
			    int start = content.indexOf(str);
				int i = content.indexOf(label);
				while(i != -1) { // search for other occurences of the label
					i = content.indexOf(label, i+1);
					found++;
				}
				if(found <= 0) {
					if(str.contains("_start:")) {
					  int end   = content.indexOf("ret\n", start);
					  if(start != -1 && end != -1)
						  content = content.replace(start, end+3, "");
					}else if(start != -1) {
						content = content.replace(start, start+str.length(), "");
					}
				}
			}
		}
		return Arrays.asList(content.toString().split("\n"));
	}
	
	public static List<String> optimizeLabelOld(List<String> content2) {
		String content = "";
		for(String str:content2)
			content += str + "\n";
		
		for(String str:content2) {
			if(str.trim().endsWith(":")) { //Label Code
				String label = str.split(":")[0].replace(":", "").trim();
				int found = -1;
				int i = content.indexOf(label);
				while(i != -1) { // search for other occurences of the label
					i = content.indexOf(label, i+1);
					found++;
				}
				if(found <= 0) {
					if(str.contains("_start:")) {
					  int start = content.indexOf(str);
					  int end   = content.indexOf("ret", start);
					  if(start != -1 && end != -1)
						  content = content.substring(0, start) + content.substring(end+5, content.length());
					}else
					  content = content.replace(str+"\n", "");
				}
			}
		}
		return Arrays.asList(content.split("\n"));
	}
	
	public static List<String> optimizeStack(List<String> content) {
		List<String> newArray = new ArrayList<String>();
		
		List<String> workCopy = new ArrayList<String>();
		workCopy.addAll(content);
		
		String[] regList = {"eax","ebx","ecx","edx","esi","edi","ebp","esp"};
		String[] pushList = {"push eax","push ebx","push ecx","push edx","push esi","push edi","push ebp", "push esp"};
		String[] popList =  {"pop eax","pop ebx","pop ecx","pop edx","pop esi","pop edi","pop ebp", "pop esp"};

		for(int i=0;i<workCopy.size();i++) {
			String line = workCopy.get(i).trim();
			for(int pui=0;pui<pushList.length;pui++) {
				String push = pushList[pui];
				if(line.equalsIgnoreCase(push)) {
					//search for matching pop
					int pushIndex = 0;
					for(int j=i+1;j<workCopy.size();j++) {
						String match = workCopy.get(j).trim();
						boolean canContinue = false;
						for(int poi=0;poi<popList.length;poi++) {
							String pop = popList[poi];
							if(match.equalsIgnoreCase(pop)) {
								if(pushIndex > 0) {
									pushIndex--;
									canContinue = true;
									break;
								}
								if(poi == pui) //if push and pop are identical empty
									workCopy.set(i, "[]");
								else //optimize push pop to mov
									workCopy.set(i, "mov "+regList[poi]+", "+regList[pui]);
								workCopy.set(j, "[]");
								break;
							}
						}
						for(String push2:pushList) {
							if(match.equalsIgnoreCase(push2)) {
								pushIndex++;
								canContinue = true;
								break;
							}
						}
						if(!canContinue) break;
					}
					break;
				}
			}
		}
		
		for(String str:workCopy)
			if(!str.equalsIgnoreCase("[]"))
				newArray.add(str);
	
		return newArray;
	}
}
