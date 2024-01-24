package com.xworkz.karthik.driver;

import com.xworkz.karthik.things.Sports;

public class SportsRunner {
	public static void main(String[] args) {
		Sports sports=new Sports();
		sports.setNameOfSport("Cricket");
		sports.setNoOfPlayers(11);
		sports.setInteresting(true);
		sports.setCoachName("RohitSharma");

		String Name=sports.getNameOfSport();
		int players=sports.getNoOfPlayers();
		boolean intersting=sports.isInteresting();
		String caoach=sports.getCoachName();
	}

}
