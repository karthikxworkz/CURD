package com.xworkz.karthik.things;

public class Accounts extends Bank{
      public Accounts() {
    	  super("SBI",4500,7896789889l,'M');
    	  System.out.println(super.getName());
    	  System.out.println(super.getDepositAmount());
    	  System.out.println(super.getPhoneNum());
    	  System.out.println(super.getGender());
      }
}
