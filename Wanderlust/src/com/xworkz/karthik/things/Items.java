package com.xworkz.karthik.things;

public class Items extends Food {
	protected String itemName;
	protected int price;
	protected int noOfItems;
	protected String itemColour;

	public void getFoodInfo() {
		super.foodName="Idli-vada";
		super.price=50;
		super.isItTasty=true;
		super.origin="Karnataka";
		System.out.println("Name of the Food:"+super.foodName);
	     System.out.println("Price of the food:"+super.price);
	     System.out.println("It is tasty:"+super.isItTasty);
	     System.out.println("Origin Of the food is:"+super.origin);
	
	
	
	}
	
	
	
	
	
	
}
