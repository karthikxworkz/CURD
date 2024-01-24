package com.xworkz.karthik.driver;

import com.xworkz.karthik.things.Vegetable;

public class FoodRunner extends Vegetable{
  
	public static void main(String[] args) {
		Vegetable vegetable=new Vegetable();
		vegetable.getFoodInfo();
		vegetable.getItemInfo();
		
		FoodRunner food=new FoodRunner();
		System.out.println("access property");
		System.out.println(food);
		
	}
}
