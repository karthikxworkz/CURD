package com.xworkz.hotel.Dto;

public class HotelDto {
	
	private String nameOfHotel;
	private String location;
	private int typeOfFood;
	private int noOfServers;
	private float ratings;
	
	public HotelDto() {
		System.out.println("No args constructor");
	}

	public HotelDto(String nameOfHotel, String location, int typeOfFood, int noOfServers, float ratings) {
		super();
		this.nameOfHotel = nameOfHotel;
		this.location = location;
		this.typeOfFood = typeOfFood;
		this.noOfServers = noOfServers;
		this.ratings = ratings;
	}

	public String getNameOfHotel() {
		return nameOfHotel;
	}

	public void setNameOfHotel(String nameOfHotel) {
		this.nameOfHotel = nameOfHotel;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getTypeOfFood() {
		return typeOfFood;
	}

	public void setTypeOfFood(int typeOfFood) {
		this.typeOfFood = typeOfFood;
	}

	public int getNoOfServers() {
		return noOfServers;
	}

	public void setNoOfServers(int noOfServers) {
		this.noOfServers = noOfServers;
	}

	public float getRatings() {
		return ratings;
	}

	public void setRatings(float ratings) {
		this.ratings = ratings;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((nameOfHotel == null) ? 0 : nameOfHotel.hashCode());
		result = prime * result + noOfServers;
		result = prime * result + Float.floatToIntBits(ratings);
		result = prime * result + typeOfFood;
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
		HotelDto other = (HotelDto) obj;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (nameOfHotel == null) {
			if (other.nameOfHotel != null)
				return false;
		} else if (!nameOfHotel.equals(other.nameOfHotel))
			return false;
		if (noOfServers != other.noOfServers)
			return false;
		if (Float.floatToIntBits(ratings) != Float.floatToIntBits(other.ratings))
			return false;
		if (typeOfFood != other.typeOfFood)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "HotelDto [nameOfHotel=" + nameOfHotel + ", location=" + location + ", typeOfFood=" + typeOfFood
				+ ", noOfServers=" + noOfServers + ", ratings=" + ratings + "]";
	}

}
