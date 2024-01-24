package com.xworkz.karthik.things;

public class Product extends Customer {
	public Product() {
		super("Rohit",45);
		System.out.println(super.getNameOfCustomer());
		System.out.println(super.getNoOfCustomer());
	}
	

}
