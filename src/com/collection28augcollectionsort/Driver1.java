package com.collection28augcollectionsort;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Driver1 {

	public static void main(String[] args) {
		Map<String, Integer> productP = new ConcurrentHashMap<String, Integer>();
		productP.put("Iphone16", 12000);
		productP.put("Iphone15", 1100);
		productP.put("Iphone14", 130);
		productP.put("Iphone13", 45);
		productP.put("Iphone12", 78);
		productP.put("Iphone11", 12);
		
		System.out.println(productP);

	}

}
