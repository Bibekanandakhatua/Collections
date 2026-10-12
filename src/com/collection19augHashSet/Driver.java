package com.collection19augHashSet;

import java.util.HashSet;
import java.util.Set;

class Holiday {

	private String nameOfHoliday;

	public Holiday(String nameOfHoliday) {
		super();
		this.nameOfHoliday = nameOfHoliday;
		
	}
	@Override
	public int hashCode() {
		
		return this.nameOfHoliday.hashCode();
		
	}
	
	@Override
	public boolean equals(Object obj) {
		
		Holiday holi =(Holiday) obj;
		
		return this.nameOfHoliday.equals(holi.nameOfHoliday);
	}
}


public class Driver {

	public static void main(String[] args) {
		
		Set<Holiday> holidays = new HashSet<Holiday>();
		
		/*
		 * holidays.add(new Holiday("Durga Puja")); holidays.add(new
		 * Holiday("Durga Puja"));
		 */
		
		
		Holiday h1 = new Holiday("Durga Puja");
		Holiday h2 = new Holiday("Durga Puja");
		
		holidays.add(h1);
		holidays.add(h2);
		
		
		
		
		System.out.println(" h1 :"+h1.hashCode() +" h2 :"+h2.hashCode());
		
		System.out.println(h1.equals(h2));
		
	}
	
}
