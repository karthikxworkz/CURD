package com.xworkz.karthik.driver;

import com.xworkz.karthik.things.Dog;

public class AnimalRunner {
	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.setNameOfAnimal("Dog");
		dog.setNoOfLegs(4);
		dog.setGender('M');
		dog.setAgeLimit(20);
		
		String Name=dog.getNameOfAnimal();
		int legs=dog.getNoOfLegs();
		char gender=dog.getGender();
		int age=dog.getAgeLimit();
	}
}