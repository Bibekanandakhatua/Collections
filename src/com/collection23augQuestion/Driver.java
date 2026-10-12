package com.collection23augQuestion;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeSet;

class Account implements Comparable<Account> {

	int productId;
	int price;

	public Account(int productId, int price) {
		super();
		this.productId = productId;
		this.price = price;
	}

	@Override
	public int compareTo(Account o) {

		int result = Integer.compare(this.price, o.price);
		System.out.println(this.price + "," + o.price + " and result is:" + result);
		if (result == 0) {
			return Integer.compare(this.productId, o.productId);
		}
		return result;
	}

	@Override
	public int hashCode() {
		return Integer.hashCode(this.productId);
	}

	@Override
	public boolean equals(Object obj) {

		Account account = (Account) obj;
		return this.productId == account.productId;
	}

//	@Override
//	public String toString() {
//		return "Account [productId=" + productId + ", price=" + price + "]";
//	}

}

public class Driver {

	public static void main(String[] args) {

		Set<Account> acc = new LinkedHashSet<Account>();

		Account count1 = new Account(12, 100);
		Account count2 = new Account(13, 200);
		Account count6 = new Account(16, 400);
		Account count3 = new Account(14, 300);
		Account count4 = new Account(15, 500);
		Account count5 = new Account(15, 400);

		acc.add(count1);
		acc.add(count2);
		acc.add(count3);
		acc.add(count4);
		acc.add(count5);
		acc.add(count6);

		Set<Account> account = new TreeSet<Account>();

		account.addAll(acc);

		Iterator<Account> itr = account.iterator();

		while (itr.hasNext()) {
			Account a = itr.next();
			System.out.println(a.productId +" , "+a.price);
		}

	}

}
