package com.collection27augcollectionsort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Product implements Comparable<Product>{
	
	int productId;
	String productName;
	public Product(int productId, String productName) {
		super();
		this.productId = productId;
		this.productName = productName;
	}
	@Override
	public int compareTo(Product o) {
		
		int result = Integer.compare(this.productId,o.productId);
		return result;
	}
	
}

public class Driver {

	public static void main(String[] args) {
		
		Product p = new Product(100,"nokia");
		Product p1 = new Product(99,"mi");
		Product p2 = new Product(12,"nothing");
		Product p3 = new Product(1,"samsung");
		Product p4 = new Product(1004,"iphone16");
		
		List<Product> products = new ArrayList<Product>();
		products.add(p);
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		
		Collections.sort(products);
		
		for (int i = 0; i < products.size(); i++) {
			Product pro = products.get(i);
			System.out.println(pro.productId +","+pro.productName);
			
			
		}
	}
}
