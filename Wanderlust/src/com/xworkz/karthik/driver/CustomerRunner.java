package com.xworkz.karthik.driver;

import com.xworkz.karthik.things.Product;

public class CustomerRunner {
	public static void main(String[] args) {
		Product product=new Product();
		product.setNameOfCustomer("Rohit");
		product.setNoOfCustomer(45);
      
		String name=product.getNameOfCustomer();
		int number=product.getNoOfCustomer();
		
		
		
	}

}
