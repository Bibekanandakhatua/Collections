package com.collection21augTreesetCompare;

import java.util.Set;
import java.util.TreeSet;

class Account implements Comparable<Account> {

	String name;

	public Account(String name) {
		super();
		this.name = name;
	}

	@Override
	public int compareTo(Account o) {

		int result = this.name.compareTo(o.name);
		System.out.println(this.name + "," + o.name + " and result is" + result);
		return result;
	}

}

public class Driver {

	public static void main(String[] args) {

		Set<Account> acc = new TreeSet<Account>();

		Account a1 = new Account("ase");
		Account a2 = new Account("bft");
		Account a3 = new Account("vgt");
		Account a4 = new Account("hyt");
		Account a5 = new Account("kio");

		acc.add(a1);
		acc.add(a2);
		acc.add(a3);
		acc.add(a4);
		acc.add(a5);

		
		  for (Account account : acc) {
		  
		  System.out.println(account.name);
		  
		  }
		 

	}

}
