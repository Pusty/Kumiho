package example.internal;

import java.util.ArrayList;
import java.util.Arrays;

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
		
		ArrayList<Integer> inL = new ArrayList<Integer>();
		for(int i=0;i<1000;i++)
			inL.add(i);
		System.out.println(inL);
		
		String tmp = " rmb,rb";
		System.out.println(tmp);
		System.out.println(Arrays.toString(tmp.split(",")));
	}

	
}
