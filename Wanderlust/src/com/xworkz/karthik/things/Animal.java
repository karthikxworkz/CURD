package com.xworkz.karthik.things;

public class Animal {
	private String nameOfAnimal;
	private int noOfLegs;
	private char gender;
	private int ageLimit;
	
	public Animal() {
		System.out.println("no argument constructor");
	}

	public Animal(String nameOfAnimal, int noOfLegs, char gender, int ageLimit) {
		super();
		System.out.println("Paramertised constructor");
		this.nameOfAnimal = nameOfAnimal;
		this.noOfLegs = noOfLegs;
		this.gender = gender;
		this.ageLimit = ageLimit;
	}

	public String getNameOfAnimal() {
		return nameOfAnimal;
	}

	public void setNameOfAnimal(String nameOfAnimal) {
		this.nameOfAnimal = nameOfAnimal;
	}

	public int getNoOfLegs() {
		return noOfLegs;
	}

	public void setNoOfLegs(int noOfLegs) {
		this.noOfLegs = noOfLegs;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getAgeLimit() {
		return ageLimit;
	}

	public void setAgeLimit(int ageLimit) {
		this.ageLimit = ageLimit;
	}
	

}
