package com.collection18augHashSet;

import java.util.HashSet;

public class Driver {

	public static void main(String[] args) {
		
		HashSet<String> pro = new HashSet<String>();
		
		pro.add("Splender");
		pro.add("Cd-delux");
		pro.add("Apese200");
		pro.add("CBZ180");
		pro.add("Bulet220");
		
		int hash = "Splender".hashCode();
		int spresdhash = hash ^ (hash>>>16);
		int bucket = spresdhash & (16-1);
		System.out.println(" The bucket is : "+bucket);

	}

}
