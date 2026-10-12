package com.collection10aug;

import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {
		
		ArrayList<String> empNames = new ArrayList<String>();
		
		empNames.add("Bibek");
		empNames.add("vasu");
 		empNames.add("kamala");
		empNames.add("udit");
		empNames.add("Bibek");
		
		System.out.println(empNames);
		
		System.out.println(empNames.remove("Bibek"));
		
		System.out.println(empNames);
		
		
		//System.out.println(empNames.get(1));
		
		//for(int index=0;index<empNames.size();index++) {
			
		//	String name = empNames.get(index);
			
			//if(name.startsWith("B")) {
			//	System.out.println(name);
		//	}
		//}
		

	}

}
