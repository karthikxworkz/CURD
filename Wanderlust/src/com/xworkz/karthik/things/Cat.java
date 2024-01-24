package com.xworkz.karthik.things;

public class Cat extends AnimalA{
	
	private String Name;
	private String sound;
	
	public Cat() {
		super("elephant",4);
		System.out.println(super.getAnimalName());
		System.out.println(super.getNoOfLegs());
	}
	
	

}
