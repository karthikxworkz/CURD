package com.xworkz.list.runner;

import java.util.ArrayList;
import java.util.List;

public class FoodNameRunner {
	public static void main(String[] args) {
		
		List list=new ArrayList();
		list.add("Edli");
		list.add("Dosa");
		list.add("Palav");
		list.add("TomatoBath");
		list.add("JeeraRice");
		list.add("Hogli");
		list.add("Uppam");
		list.add("TomatoUppam");
		list.add("BisliBellae Bath");
		list.add("Chapathi");
		list.add("Roti");
		list.add("Mundii");
		list.add("Puliograe");
		list.add("Jamuna");
		list.add("AkkiRoti");
		list.add("FishUta");
		list.add("biryani");
		list.add("MuttonBiryani");
		list.add("VegBiryani");
		list.add("ChickenBiryani");
		
		System.out.println("List are:"+list);
		System.out.println("It contains dosa:"+list.contains("Dosa"));
		System.out.println("It removes the 20 th element:"+list.remove(19));
		System.out.println("Checking the size:"+list.size());	   
	}
}
