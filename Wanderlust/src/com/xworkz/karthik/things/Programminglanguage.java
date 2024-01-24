package com.xworkz.karthik.things;

public class Programminglanguage {
	private String languageName;
	private int noOfLanguage;
	private boolean isinteresting;

	public Programminglanguage() {
		System.out.println("No argument contructor");
	}

	public Programminglanguage(String languageName, int noOfLanguage, boolean isinteresting) {
		System.out.println("Paramertised contractor");
		this.languageName = languageName;
		this.noOfLanguage = noOfLanguage;
		this.isinteresting = isinteresting;
	}

	public String getLanguageName() {
		return languageName;
	}

	public void setLanguageName(String languageName) {
		this.languageName = languageName;
	}

	public int getNoOfLanguage() {
		return noOfLanguage;
	}

	public void setNoOfLanguage(int noOfLanguage) {
		this.noOfLanguage = noOfLanguage;
	}

	public boolean isIsinteresting() {
		return isinteresting;
	}

	public void setIsinteresting(boolean isinteresting) {
		this.isinteresting = isinteresting;
	}
	

}
