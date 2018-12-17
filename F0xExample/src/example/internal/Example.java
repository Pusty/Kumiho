package example.internal;

import java.util.HashMap;

//import java.io.DataInputStream;
//import java.io.FileInputStream;

public class Example {

	public static void main(String[] args) {
		/*Template temp  = Template.create();
		OverNorm norm = new OverNorm();
		temp.runMe();
		norm.runMe();
		System.out.println(temp.original);
		System.out.println(norm.original);
		System.out.println(norm.newvar);
		temp.original = 123;
		norm.original = 321;
		norm.newvar = 1337;
		System.out.println(temp.original);
		System.out.println(norm.original);
		System.out.println(norm.newvar);
		System.out.println("==================");*/
		/*System.out.println(temp.original);
		Template temp2 = new OverNorm();
		temp2.runMe();
		Template temp3 = new Template() {
			public void runMe() {
				System.out.println("overwrote!");
				a();
			}
			public void a() {
				System.out.println(":D");
			}
		};
		temp3.runMe();
		
		OverNorm norm = new OverNorm();
		System.out.println(norm.original);
		System.out.println(norm.newvar);
		norm.meanFunction();*/
		
		/*ArrayList<String> testList = new ArrayList<String>();
		testList.add("oh");
		testList.add("noes!");
		testList.add("!!!");
		for(String test:testList) {
			System.out.println(test);
		}
		System.out.println(testList.contains("oh"));
		System.out.println(testList.contains("noes?"));
		System.out.println(testList.toString());*/
		//System.out.println("==================");
		//norm.meanestFunction();
		
		/*try {
			FileInputStream fis = new FileInputStream("make.bat");
			DataInputStream dis = new DataInputStream(fis);
			String str = null;
			while((str=dis.readLine())!=null)
				System.out.println(str);
			dis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		
		/*ArrayList<Integer> inL = new ArrayList<Integer>();
		for(int i=0;i<1000;i++)
			inL.add(i);
		System.out.println(inL);
		
		String tmp = " rmb,rb";
		System.out.println(tmp);
		System.out.println(Arrays.toString(tmp.split(",")));
		
		System.out.println(Integer.toHexString(0xABCDEF12));
		System.out.println(Long.toHexString(0x13371337F000BAAAL));
		System.out.println(-1337L);
		System.out.println(Long.parseLong("FE",16));
		System.out.println(Long.parseLong("fe",16));
	
		int[] arr = {1,2,3};
		for(int i=0;i<4;i++)
		System.out.println(arr[i]);*/
		
		//for(int i=-1;i<3;i++)
		//	System.out.println(sw(i));
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("oh", "noes");
		map.put("noes", "oh");
		System.out.println(map.get("oh"));
		System.out.println(map.get("noes"));
		System.out.println(map.size());
		System.out.println(map.entrySet());
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.toString());
		
	}
	
	/*public static int sw(int i) {
		switch(i) {
		case 0: 
			return i*4;
		case 1:
			System.out.println("OH NOES");
			return i*8;
		case 2: i = 27;
		case 3:
			System.out.println("RANDOM CODE");
			return i*32;
		default: return i*64;
		}
	}*/

	
}
