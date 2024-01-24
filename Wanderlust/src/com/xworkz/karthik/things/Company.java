package com.xworkz.karthik.things;

public class Company {
	private String Name;
	private int noOfEmployee;
	private int companyPackage;
	private boolean anyPressure;
	
	public Company() {
		System.out.println("No argument constructor");
	}

	public Company(String name, int noOfEmployee, int companyPackage, boolean anyPressure) {
		System.out.println("Paramertised constructor");
		Name = name;
		this.noOfEmployee = noOfEmployee;
		this.companyPackage = companyPackage;
		this.anyPressure = anyPressure;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getNoOfEmployee() {
		return noOfEmployee;
	}

	public void setNoOfEmployee(int noOfEmployee) {
		this.noOfEmployee = noOfEmployee;
	}

	public int getCompanyPackage() {
		return companyPackage;
	}

	public void setCompanyPackage(int companyPackage) {
		this.companyPackage = companyPackage;
	}

	public boolean isAnyPressure() {
		return anyPressure;
	}

	public void setAnyPressure(boolean anyPressure) {
		this.anyPressure = anyPressure;
	}
	
	

	 
	
	
	
}
