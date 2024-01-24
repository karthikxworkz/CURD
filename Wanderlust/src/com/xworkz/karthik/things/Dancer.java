package com.xworkz.karthik.things;

public class Dancer {
	private String dancerName;
	private int noOfDancers;
	private float ratings;
	private int entryfee;
	
	public Dancer() {
		System.out.println("no argument constructor");
	}

	public Dancer(String dancerName, int noOfDancers, float ratings, int entryfee) {
		System.out.println("Paramertersied contructor");
		this.dancerName = dancerName;
		this.noOfDancers = noOfDancers;
		this.ratings = ratings;
		this.entryfee = entryfee;
	}

	public String getDancerName() {
		return dancerName;
	}

	public void setDancerName(String dancerName) {
		this.dancerName = dancerName;
	}

	public int getNoOfDancers() {
		return noOfDancers;
	}

	public void setNoOfDancers(int noOfDancers) {
		this.noOfDancers = noOfDancers;
	}

	public float getRatings() {
		return ratings;
	}

	public void setRatings(float ratings) {
		this.ratings = ratings;
	}

	public int getEntryfee() {
		return entryfee;
	}

	public void setEntryfee(int entryfee) {
		this.entryfee = entryfee;
	}
	


}
