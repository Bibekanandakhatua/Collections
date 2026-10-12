package com.collection19augTreefify;

import java.util.HashSet;
import java.util.Set;

class Employee{
	
	private String name;

	public Employee(String name) {
		super();
		this.name = name;
	}
	@Override
	public int hashCode() {
		
		return 3453555;
	}
	
}

public class Driver {

	public static void main(String[] args) {
		
		Set<Employee> employees = new HashSet<Employee>(64);
		
		Employee e1 = new Employee("Kodewala");
		Employee e2 = new Employee("Kodewala");
		Employee e3 = new Employee("Kodewala");
		Employee e4 = new Employee("Kodewala");
		Employee e5 = new Employee("Kodewala");
		Employee e6 = new Employee("Kodewala");
		Employee e7 = new Employee("Kodewala");
		Employee e8 = new Employee("Kodewala");
		Employee e9 = new Employee("Kodewala");
		
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		employees.add(e5);
		employees.add(e6);
		employees.add(e7);
		employees.add(e8);
		employees.add(e9);
		
		System.out.println(employees);
		

	}

}
