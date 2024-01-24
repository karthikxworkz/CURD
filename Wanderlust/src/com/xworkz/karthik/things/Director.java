package com.xworkz.karthik.things;



public class Director extends Movie {
   public Director() {
	   super("SSE",500,true,"veersesh");
	   
	   System.out.println(super.getName());
	   System.out.println(super.getPrice());
	   System.out.println(super.isReleased());
	   System.out.println(super.getThreaterName());
	   
   }
}
