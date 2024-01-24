package com.xworkz.karthik.driver;

import com.xworkz.karthik.things.Employee;

public class CompanyRunner {
	public static void main(String[] args) {
		Employee employee	=new Employee();
		employee.setName("Google");
		employee.setNoOfEmployee(150);
		employee.setCompanyPackage(7);
		employee.setAnyPressure(true);
		
		String Name=employee.getName();
		int Employee=employee.getNoOfEmployee();
		int salarypackage=employee.getNoOfEmployee();
		boolean anypressure=employee.isAnyPressure();
	
	
	}

}
