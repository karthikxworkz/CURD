package com.xworkz.list.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionMethods {
	
	public static void main(String[] args) {
		
		Collection<String> collection=new ArrayList<String>();
		collection.add("A");
		collection.add("B");
		collection.add("C");
		System.out.println("collection are:"+collection.toString());
		
		//size
		System.out.println("Size is:"+collection.size());
		//isEmpty
		System.out.println("Checking is Empty:"+collection.isEmpty());
		//Contains
		System.out.println("Checking contains:"+collection.contains("A"));
		
//		Collection<String> listOfCollection=new ArrayList<String>();
//		System.out.println(listOfCollection);
//		
		Iterator<String> listofIterator=collection.iterator();
		System.out.println(listofIterator);
		
		//ToArray()
		System.out.println(collection.toArray());
		
		//toArray[T]
		System.out.println(collection.toArray());
		
//		System.out.println(collection.toArray("a"));
		
        collection.add("K");
        collection.remove("c");
        collection.addAll(collection);
        collection.containsAll(collection);
//        collection.removeAll(collection);
        collection.removeIf(null);
        collection.retainAll(collection);
        collection.equals(listofIterator);
        collection.hashCode();
        collection.clear();
        collection.spliterator();
        collection.stream();
	}

}
