package com.xworkz.karthik.driver;

import com.xworkz.karthik.things.Accounts;

public class BankRunner {
	public static void main(String[] args) {
		Accounts accounts=new Accounts();
		accounts.setName("SBI");
		accounts.setDepositAmount(4500);
		accounts.setPhoneNum(34567890l);
		accounts.setGender('M');
		
		String Name=accounts.getName();
		int deposit=accounts.getDepositAmount();
		long phonenumber=accounts.getPhoneNum();
		char gender=accounts.getGender();
		
	}

}
