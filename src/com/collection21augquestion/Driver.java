package com.collection21augquestion;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


class Product implements Comparable<Product> {
	int productId;
	String name;
	int price;
	String status;
	public Product(int productId, String name, int price, String status) {
		super();
		this.productId = productId;
		this.name = name;
		this.price = price;
		this.status = status;
	}
	@Override
	public int compareTo(Product o) {
		
		int result = Integer.compare(this.price, o.price);
		System.out.println(this.price +","+ o.price +" and result is:"+result);
		if(result==0) {
			
			return Integer.compare(this.productId, o.productId);
		}
		return result;
		
	}
	
	@Override
	  public int hashCode() {
	  
	  return Integer.hashCode(this.productId) ;
	  
	 }
	@Override
	public boolean equals(Object obj) {
		
		Product prod = (Product) obj;
		
		return this.productId == prod.productId;
		
	}
}

public class Driver {

	public static void main(String[] args) {
		
		Set<Product> products = new HashSet<Product>();
		
		Product p1 = new Product(12, "iron", 100, "available");
		Product p2 = new Product(11, "fan", 20, "store");
		Product p3 = new Product(12, "iron", 10, "available");
		Product p4 = new Product(17, "light", 130, "notavailable");
		
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		
		
		Set<Product> pro = new TreeSet<Product>();
		
		Iterator<Product> itr = pro.iterator();
		
		while(itr.hasNext()) {
			
			Product product = itr.next();
			System.out.println(
	                product.productId + " "
	                + product.name + " "
	                + product.price + " "
	                + product.status
	            );

		}
		
	}

}
