package com.collection26augcollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Driver {

	public static void main(String[] args) {
		
		ArrayList<String> cities = new ArrayList<String>();
		
		cities.add("BLR");
		cities.add("DL");
		cities.add("KOL");
		cities.add("CHE");
		cities.add("AHM");
		cities.add("HYD");
		
		System.out.println(cities);
		
		Collections.sort(cities);
		
		System.out.println(cities);

//		List<String> unlist = Collections.unmodifiableList(cities);
//		unlist.add("BBSR");
//		System.out.println(unlist);
		Collections.reverse(cities);
		System.out.println(cities);
		

	}

}
