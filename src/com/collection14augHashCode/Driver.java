package com.collection14augHashCode;

import java.util.HashSet;

class Delivary{
	
	
}
public class Driver {

	public static void main(String[] args) {
		
		String s1 = "blr";
		
		int hash1  = "cblr".hashCode();
		
		int spreadHash = hash1 ^ (hash1>>>16);
		
		int bucket1 = spreadHash & (16-1);
		
		System.out.println(" The Hash Code is :"+hash1);
		
		System.out.println(" The bucket is :"+bucket1);
		
		
		
		
		
		
		//HashSet<String> set = new HashSet<String>();
		
		//set.add("BLR");
		
		int hash = "BLR".hashCode();
		
		int bucket = hash & (16-1);
		
		System.out.println(" The Hash Code is :"+hash);
		
		System.out.println(" The bucket is :"+bucket);
		
		
		
		System.out.println(" Hash code is :"+s1.hashCode());
		
		
		Delivary d1 = new Delivary();
		Delivary d2 = new Delivary();
		System.out.println(d1.hashCode() + " and "+d2.hashCode());

	}

}
