package test;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
		//ClassName objName = new ClassName();     
		ArrayList<String> all = new ArrayList<String>();
		
		all.add("Selenium");
		all.add("QC");
		all.add("Jira");
		all.add("TestLine");
		all.add("TestRail");
		
		System.out.println(all.size());
		System.out.println(all.get(0));
		System.out.println(all.get(1));
		
		all.add("postman");
		System.out.println(all.size());
		all.remove(2);
		System.out.println(all.size());
		System.out.println(all.get(2));
		
		//for(int i=0;i<all.size();i++) {
		//	System.out.println((all.get(i)));
		//}
		for(String a : all) {
			System.out.println(a);
		}

	}

}
