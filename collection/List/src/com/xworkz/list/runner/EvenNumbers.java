package com.xworkz.list.runner;

import java.util.ArrayList;
import java.util.List;

public class EvenNumbers{
	
	public static void main(String[] args) {
		List list=new ArrayList();
		list.add(0);
		list.add(2);
		list.add(4);
		list.add(6);
		list.add(8);
		list.add(10);
		
		System.out.println("List:"+list);
		System.out.println("Size is:"+list.size());
		//sort
		list.sort(null);;
		System.out.println("SOrting");
		//
		list.contains("8");
		System.out.println("It contains");
	}
}
