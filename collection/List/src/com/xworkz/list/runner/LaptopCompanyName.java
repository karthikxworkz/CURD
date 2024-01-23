package com.xworkz.list.runner;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LaptopCompanyName {
       
	public static void main(String[] args) {
		
		List laptopCName=new ArrayList();
		laptopCName.add("Dell");
		laptopCName.add("Hp");
		laptopCName.add("Apple");
		laptopCName.add("isus");
		
		System.out.println("Listed are:"+laptopCName);
		System.out.println("SIze is :"+laptopCName.size());
		
		List<List<List<String>>> laptopCName1=new ArrayList();
		System.out.println("One list:"+laptopCName1.addAll(laptopCName1));
		
		//Iterator
		Iterator<List<List<String>>> iterator=laptopCName1.iterator();
		System.out.println(iterator);
		
		//while loop
		while(iterator.hasNext()) {
			System.out.println("Element:"+iterator.next());
		}
		
		//remove
		System.out.println("Using remove from iterator");
		iterator.remove();
//		while(iterator.hasNext()) {
//			System.out.println("Element:"+iterator.next());
//		}
		
		//foreachremaining
		iterator.forEachRemaining((s)->System.out.println("Element from iterator:"+s));
		
	}
	
}
