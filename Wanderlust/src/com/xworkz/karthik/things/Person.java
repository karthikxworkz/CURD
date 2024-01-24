package com.xworkz.karthik.things;

public class Person extends Dancer{
      public  Person() {
    	  super("Punneth",17,9.7f,5000);
    	  
    	  System.out.println(super.getDancerName());
    	  System.out.println(super.getNoOfDancers());
    	  System.out.println(super.getRatings());
    	  System.out.println(super.getEntryfee());
    	  
      }
}
