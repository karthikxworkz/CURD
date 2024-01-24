package com.xworkz.karthik.things;

public class Sports {
	private String nameOfSport;
	private int noOfPlayers;
	private boolean isInteresting;
	private String coachName;
	
	public Sports() {
		System.out.println("No argument constructor");
	}

	public Sports(String nameOfSport, int noOfPlayers, boolean isInteresting, String coachName) {
		System.out.println("Paramertised constuctor");
		this.nameOfSport = nameOfSport;
		this.noOfPlayers = noOfPlayers;
		this.isInteresting = isInteresting;
		this.coachName = coachName;
	}

	public String getNameOfSport() {
		return nameOfSport;
	}

	public void setNameOfSport(String nameOfSport) {
		this.nameOfSport = nameOfSport;
	}

	public int getNoOfPlayers() {
		return noOfPlayers;
	}

	public void setNoOfPlayers(int noOfPlayers) {
		this.noOfPlayers = noOfPlayers;
	}

	public boolean isInteresting() {
		return isInteresting;
	}

	public void setInteresting(boolean isInteresting) {
		this.isInteresting = isInteresting;
	}

	public String getCoachName() {
		return coachName;
	}

	public void setCoachName(String coachName) {
		this.coachName = coachName;
	}
	

}
