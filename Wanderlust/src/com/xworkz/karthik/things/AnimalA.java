package com.xworkz.karthik.things;

public class AnimalA {
	private String animalName;
	private int noOfLegs;
	
	public AnimalA() {
		System.out.println("No argument constructor");
	}
	public AnimalA(String animalName, int noOfLegs) {
		super();
		this.animalName = animalName;
		this.noOfLegs = noOfLegs;
	}
	public String getAnimalName() {
		return animalName;
	}
	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}
	public int getNoOfLegs() {
		return noOfLegs;
	}
	public void setNoOfLegs(int noOfLegs) {
		this.noOfLegs = noOfLegs;
	}
	
	

}
