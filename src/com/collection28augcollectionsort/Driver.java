package com.collection28augcollectionsort;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Driver 
{
	public static void main(String[] args) {
		Map<String, Integer> Pprice = new HashMap<String, Integer>();
		
		Pprice.put("Iphone", 100000);
		Pprice.put("Samsung", 12000);
		Pprice.put("LG", 200100);
		Pprice.put("Nokia", 30000);
	
		Map<String,Integer > PpriceSync = Collections.synchronizedMap(Pprice);
		PpriceSync.put("Samsung", 29000);
		PpriceSync.put("LG", 76000);
		System.out.println(PpriceSync);
		
		
	}
}
