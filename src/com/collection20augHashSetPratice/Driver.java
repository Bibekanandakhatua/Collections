package com.collection20augHashSetPratice;

import java.util.HashSet;

class Account {

	private String name;
	private int age;

	public Account(String name,int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public int hashCode() {
		return this.name.hashCode() + this.age;
		
	}
	@Override
	public boolean equals(Object obj) {
		
		Account acc =(Account) obj;
		return this.name.equals(acc.name) & this.age == acc.age;
	}

}

public class Driver {

	public static void main(String[] args) {

		HashSet<Account> h1 = new HashSet<Account>();

		
		  Account a1 = new Account("Bibek",34); 
		  Account a2 = new Account("Bibek",34);
		  
		  System.out.println(" hashcode a1 :"+a1.hashCode()+" hashcode a1 :"+a2.
		  hashCode());
		  
		  boolean r1=h1.add(a1);
		  boolean r2=h1.add(a2);
		  
		  System.out.println(r1);
		  System.out.println(r2);
		 

	}

}
