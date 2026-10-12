package com.collection11aug;

import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {
		
		CityService cityService = new CityService();
		
	
		ArrayList<String> city = cityService.getcities();
		
		//city.add(3, "Jaipur");
		//System.out.println(city.remove(0));
		//System.out.println(city.size());
		//System.out.println(city.get(2));
		//System.out.println(city.contains("Mumbai"));
		System.out.println(city.add("Cuttack"));
		

	}

}
