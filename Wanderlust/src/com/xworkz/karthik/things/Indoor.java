package com.xworkz.karthik.things;

public class Indoor extends Sports {
     public Indoor() {
    	 super("Cricket",11,true,"RohitSharma");
    	 
    	 System.out.println(super.getNameOfSport());
    	 System.out.println(super.getNoOfPlayers());
    	 System.out.println(super.isInteresting());
    	 System.out.println(super.getCoachName());
     }
}
