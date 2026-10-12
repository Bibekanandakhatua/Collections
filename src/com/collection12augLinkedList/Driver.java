package com.collection12augLinkedList;

import java.util.LinkedList;

public class Driver {

	public static void main(String[] args) {
		
		LinkedList<String> linkedList = new LinkedList<String>();
		
		linkedList.add("BLR");
		linkedList.add("CHE");
		linkedList.add("HYD");
		linkedList.add("MUM");
		linkedList.add("HYD");
		linkedList.add("DEL");
		
		System.out.println(linkedList);
		
		System.out.println(linkedList.remove("HYD"));
		
		System.out.println(linkedList);
		
		
		//System.out.println(linkedList.getFirst());
		
		//System.out.println(linkedList.getLast());
		
		//System.out.println(linkedList.get(4));
	}

}
