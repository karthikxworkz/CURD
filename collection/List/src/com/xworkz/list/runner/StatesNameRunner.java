package com.xworkz.list.runner;

import java.util.ArrayList;
import java.util.List;

public class StatesNameRunner {
	
	public static void main(String[] args) {
		
		List list=new ArrayList();
		list.add("AndhraPradesh");
		list.add("ArunchalPradesh");
		list.add("Assam");
		list.add("Bihar");
		list.add("Chattishgrad");
		list.add("Goa");
		list.add("HimachalPradesh");
		list.add("Jammu Kashmir");
		list.add("Karnataka");
		list.add("Kerala");
		list.add("Jharakhnad");
		list.add("MadhyaPradesh");
		list.add("Maharshatra");
		list.add("Manipur");
		list.add("Megalaya");
		list.add("Mizoram");
		list.add("Nagaland");
		list.add("Odisha");
		list.add("Punjab");
		list.add("TamilNadu");
		list.add("Telagana");
		list.add("WestBengal");
		list.add("UttarPradesh");
		list.add("Rajasthan");
		list.add("Uttarkhnad");
		list.add("Sikkim");
		list.add("Gujarat");
//		list.add("Harayana");)
		
		System.out.println("States names are as:"+list);
		System.out.println("It contains Karnataka:"+list.contains("Karnataka"));
		System.out.println("Removing tamilNadu:"+list.remove("TamilNadu"));
		System.out.println("Size of the lists are:"+list.size());
		
		
		
	}

}
