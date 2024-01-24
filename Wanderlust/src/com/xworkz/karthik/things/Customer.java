package com.xworkz.karthik.things;

public class Customer {
	//single level inhertiance
	private String nameOfCustomer;
	private int noOfCustomer;

	public Customer() {
		System.out.println("No argument constructor");
	}

	public Customer(String nameOfCustomer, int noOfCustomer) {
		super();
		System.out.println("Paramertised constructor");
		this.nameOfCustomer = nameOfCustomer;
		this.noOfCustomer = noOfCustomer;
	}

	public String getNameOfCustomer() {
		return nameOfCustomer;
	}

	public void setNameOfCustomer(String nameOfCustomer) {
		this.nameOfCustomer = nameOfCustomer;
	}

	public int getNoOfCustomer() {
		return noOfCustomer;
	}

	public void setNoOfCustomer(int noOfCustomer) {
		this.noOfCustomer = noOfCustomer;
	}
	
	
}
