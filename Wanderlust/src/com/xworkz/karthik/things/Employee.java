package com.xworkz.karthik.things;

public class Employee extends Company {
	public Employee() {
		super("Google",150,7,true);
		System.out.println(super.getName());
		System.out.println(super.getNoOfEmployee());
		System.out.println(super.getCompanyPackage());
System.out.println(super.isAnyPressure());
	}

}
