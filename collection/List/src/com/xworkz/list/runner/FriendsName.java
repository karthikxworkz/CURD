package com.xworkz.list.runner;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FriendsName {
	
	public static void main(String[] args) {
		
		List friendNList=new ArrayList();
		friendNList.add("Ramesh");
		friendNList.add("Ram");
		friendNList.add("Vinayak");
		friendNList.add("Suppi");
		
		System.out.println("Listed are :"+friendNList);
		System.out.println("size of the lists are:"+friendNList.size());
		System.out.println("subset of the lists are :"+friendNList.subList(1, 3));
		
		friendNList.forEach((Ram)->System.out.println(Ram));
		System.out.println("For each:"+friendNList);
		
		//iterator
		Iterator<String> iterator=friendNList.iterator();
		System.out.println(iterator);
		
		//hasnext
//		while(iterator.hasNext()) {
//			System.out.println(":"+iterator.next());
//		}
//		
//		//remove
//		iterator.remove();
//		System.out.println("Removing");
		
		//foreachremainig
		iterator.forEachRemaining((S)->System.out.println("ELements from iterator:"+S));
		
		//sort
	friendNList.sort(null);
	System.out.println("Sorting:"+friendNList
			);
		
		
		
		
		
		
		
		
		
		
		
	}
}
