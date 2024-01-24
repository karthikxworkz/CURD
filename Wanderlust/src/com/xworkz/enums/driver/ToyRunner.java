package com.xworkz.enums.driver;

import com.xworkz.enums.constant.Toy;

public class ToyRunner {
	public static void main(String[] args) {
	    Toy toy = new Toy();
	    Toy toy1=new Toy();
	    toy1.toyName="Truck";
	    System.out.println(toy.getClass().toString());
	    System.out.println(toy.toString());
	    System.out.println(toy.equals(toy1));
	
	}

}
