
package com.xworkz.karthik.things;

public class Movie {
	private String name;
	private int price;
	private boolean isReleased;
	private String threaterName;
	 
	public Movie() {
		System.out.println("No argument contructor");
	}

	public Movie(String name, int price, boolean isReleased, String threaterName) {
		System.out.println("Paramertised contructor");
		this.name = name;
		this.price = price;
		this.isReleased = isReleased;
		this.threaterName = threaterName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean isReleased() {
		return isReleased;
	}

	public void setReleased(boolean isReleased) {
		this.isReleased = isReleased;
	}

	public String getThreaterName() {
		return threaterName;
	}

	public void setThreaterName(String threaterName) {
		this.threaterName = threaterName;
	}
	
}
