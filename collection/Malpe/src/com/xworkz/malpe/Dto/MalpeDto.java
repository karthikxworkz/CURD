package com.xworkz.malpe.Dto;

public class MalpeDto {
	
	private String presidentName;
	private int noOfBoats;
	private String location;
	private int typeOfFishes;
	
	public MalpeDto() {
		System.out.println("No args constructor");
	}

	public MalpeDto(String presidentName, int noOfBoats, String location, int typeOfFishes) {
		this.presidentName = presidentName;
		this.noOfBoats = noOfBoats;
		this.location = location;
		this.typeOfFishes = typeOfFishes;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + noOfBoats;
		result = prime * result + ((presidentName == null) ? 0 : presidentName.hashCode());
		result = prime * result + typeOfFishes;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MalpeDto other = (MalpeDto) obj;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (noOfBoats != other.noOfBoats)
			return false;
		if (presidentName == null) {
			if (other.presidentName != null)
				return false;
		} else if (!presidentName.equals(other.presidentName))
			return false;
		if (typeOfFishes != other.typeOfFishes)
			return false;
		return true;
	}

	public String getPresidentName() {
		return presidentName;
	}

	public void setPresidentName(String presidentName) {
		this.presidentName = presidentName;
	}

	public int getNoOfBoats() {
		return noOfBoats;
	}

	public void setNoOfBoats(int noOfBoats) {
		this.noOfBoats = noOfBoats;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getTypeOfFishes() {
		return typeOfFishes;
	}

	public void setTypeOfFishes(int typeOfFishes) {
		this.typeOfFishes = typeOfFishes;
	}

	@Override
	public String toString() {
		return "MalpeDto [presidentName=" + presidentName + ", noOfBoats=" + noOfBoats + ", location=" + location
				+ ", typeOfFishes=" + typeOfFishes + "]";
	}
	
    
}
