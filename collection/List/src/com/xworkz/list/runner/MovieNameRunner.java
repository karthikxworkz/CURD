package com.xworkz.list.runner;

import java.util.ArrayList;
import java.util.List;

public class MovieNameRunner {
	
	public static void main(String[] args) {
		List list=new ArrayList();
		list.add("A");
		list.add("Uppi");
		list.add("Upendra");
		list.add("Uppi2");
		list.add("UI");
		list.add("Money heist");
		list.add("Locked up");
		list.add("Into the Wild");
		list.add("KGf chapter 1");
		list.add("KGF chapter 2");
		list.add("KGF chapter 3");
		list.add("Leo");
		list.add("Vikram");
		list.add("Master");
		list.add("Persit of happiness");
		list.add("Karate Kid");
		list.add("Breaking bad");
		list.add("Cast Away");
		list.add("Wild");
		list.add("Into the Woods");
		list.add("Inception");
		list.add("Karnan");
		list.add("Vada Chennai");
		list.add("3");
		list.add("Super Delexe");
		list.add("Indian 1");
		list.add("Roja");
		list.add("Neendae na");
		list.add("Aramani");
		list.add("Kaithi");
		list.add("Mission Impossible 1");
		list.add("Mission Impossible 2");
		list.add("Mission Impossible 3");
		list.add("Mission Impossible 4");
		list.add("Mission Impossible 5");
		list.add("Top Mavtchrich");
		list.add("Titanic");
		list.add("Robin Hood");
		list.add("Mission Impossible 6");
		list.add("Peaky Blinders");
		list.add("Kiccha");
		list.add("Extraction 1");
		list.add("Extraction 2");
		list.add("John Wick1");
		list.add("John Wick2");
		list.add("John Wick3");
		list.add("Bettada Hoovu");
		list.add("Appu");
		list.add("Bigil");
		list.add("Chennai Express");
		list.add("Dil se");
		list.add("pk");
		list.add("Tamasha");
		list.add("Hey Jawanni Hey dewanni");
		list.add("Zindagi na milaega dovra");
		
		System.out.println("List collections are:"+list);
		System.out.println("size is:"+list.size());
		//subset
		System.out.println(list.subList(15, 45));
         //foreach	
		list.forEach((salaga)->System.out.println(salaga));
		System.out.println(list);				
	}

}
