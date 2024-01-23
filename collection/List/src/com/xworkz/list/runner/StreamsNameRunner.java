package com.xworkz.list.runner;

import java.util.ArrayList;
import java.util.List;

public class StreamsNameRunner {
	public static void main(String[] args) {
		
		List streamList=new ArrayList();
		streamList.add("Filter");
		streamList.add("map");
		streamList.add("Sort");
		streamList.add("Max");
		streamList.add("min");
		streamList.add("Count");
		streamList.add("lambda");
		streamList.add("alpha");
		streamList.add("beta");
		streamList.add("gamma");
		
		System.out.println("Listed are:"+streamList);
		System.out.println("Size of the listes are:"+streamList.size());
//		System.out.println("Storing in one list:"+streamList.s);
		
		streamList.forEach((StadPro)->System.out.println(StadPro));
		System.out.println(streamList);
		
		
		
		
		
		}

}
