package com.collection20augTreeset;

import java.util.Set;
import java.util.TreeSet;


class Emplyoee{
	
	String name;
	int age;
	
	public Emplyoee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
}

public class Driver1 {

	public static void main(String[] args) {
		
		Set<Emplyoee> emplyoees = new TreeSet<Emplyoee>();
		
		emplyoees.add(new Emplyoee("bibek", 17));
		emplyoees.add(new Emplyoee("udit", 45));
		emplyoees.add(new Emplyoee("ayushi", 27));
		emplyoees.add(new Emplyoee("bikash", 18));
		
		System.out.println(emplyoees);
		
		
		

	}

}
