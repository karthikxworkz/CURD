package com.xworkz.karthik.things;

public class Bank {
	private String Name;
	private int depositAmount;
	private long phoneNum;
	private char gender;
	
	public Bank() {
		System.out.println("No argument constructor");
	}

	public Bank(String name, int depositAmount, long phoneNum, char gender) {
		System.out.println("Paramertised constuctor");
		Name = name;
		this.depositAmount = depositAmount;
		this.phoneNum = phoneNum;
		this.gender = gender;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getDepositAmount() {
		return depositAmount;
	}

	public void setDepositAmount(int depositAmount) {
		this.depositAmount = depositAmount;
	}

	public long getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(long phoneNum) {
		this.phoneNum = phoneNum;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
	

}
