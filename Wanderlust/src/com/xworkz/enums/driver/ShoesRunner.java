package com.xworkz.enums.driver;

import com.xworkz.enums.constant.Shoes;

public class ShoesRunner {
	public static void main(String[] args) {
		Shoes shoes=new Shoes();
		Shoes shoes1=new Shoes();
		shoes.shoesName="gucchi";
		System.out.println(shoes.getClass().toString());
		System.out.println(shoes.toString());
		System.out.println(shoes.equals(shoes1));
	}
}
