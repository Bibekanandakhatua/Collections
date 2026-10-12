package com.collection20augLinkedHashset;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Driver {

	public static void main(String[] args) {
		
		Set<String> electronics = new LinkedHashSet<String>();
		
		electronics.add("Refrigerator");
		electronics.add("Iron");
		electronics.add("Fan");
		electronics.add("Washingmachine");
		
		System.out.println(electronics);
		
		Set<String> electronics1 = new HashSet<String>();
		
		electronics1.add("Refrigerator");
		electronics1.add("Iron");
		electronics1.add("Fan");
		electronics1.add("Washingmachine");
		
		System.out.println(electronics1);
		
		Set<String> cities = new TreeSet<String>();
		
		cities.add("BLR");
		cities.add("BBSR");
		cities.add("KOL");
		cities.add("MUM");
		cities.add("GGN");
		cities.add("DL");
		cities.add("AMD");
		cities.add("HYD");
		
		System.out.println(cities);
		

	}

}
