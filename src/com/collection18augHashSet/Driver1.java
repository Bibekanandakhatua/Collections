package com.collection18augHashSet;

import java.util.HashSet;

public class Driver1 {

	public static void main(String[] args) {
		
		HashSet<String> prod = new HashSet<String>();

		prod.add("Splender");
		prod.add("Cd-delux");
		prod.add("Apese200");
		prod.add("CBZ180");
		prod.add("Bulet220");
		prod.add("karizm ");
		prod.add("ktm ");
		prod.add("cbr");
		prod.add("ninja");
		prod.add("kawasaki");
		prod.add("honda");
//		prod.add("hero");
//		prod.add("bajaj");
		//prod.add("BMW");
		/*
		 * prod.add("s100"); prod.add("Activa"); prod.add("shine"); prod.add("duke");
		 * prod.add("rc"); prod.add("adv"); prod.add("himalyan"); prod.add("meteor");
		 * prod.add("hunter"); prod.add("interceptor"); prod.add("gt650");
		 * prod.add("himalyan450");
		 */
		
		
		int hash = "ktm".hashCode();

		int spreadHash = hash ^ (hash >>> 16);

		int bucket = spreadHash & 15;
		
		System.out.println(bucket);
		

	}

}
