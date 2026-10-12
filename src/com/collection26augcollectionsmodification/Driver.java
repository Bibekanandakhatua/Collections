package com.collection26augcollectionsmodification;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;


public class Driver {

	public static void main(String[] args) {

		CopyOnWriteArrayList<String> cities = new CopyOnWriteArrayList();

		cities.add("BLR");
		cities.add("DL");
		cities.add("KOL");
		cities.add("CHE");
		cities.add("AHM");
		cities.add("HYD");

		System.out.println(cities);
		
		Iterator<String> itr = cities.iterator();
		
		while(itr.hasNext()) {
			
			String ele = (String) itr.next();
			System.out.println(ele);
			
			
			if(ele.equalsIgnoreCase("HYD")) {
			System.out.println("Driver.main()");
			cities.remove(3);
			}
		}

	}

}
