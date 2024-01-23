package com.xworkz.bar.Dto;

public class BarDto {
	
	private String barName;
	private int noOfServers;
	private String location;
	private int noOfBrands;
	private int noOfProfit;
	
	public BarDto() {
		System.out.println("No args constructor");
	}

	public BarDto(String barName, int noOfServers, String location, int noOfBrands, int noOfProfit) {
		super();
		this.barName = barName;
		this.noOfServers = noOfServers;
		this.location = location;
		this.noOfBrands = noOfBrands;
		this.noOfProfit = noOfProfit;
	}

	public String getBarName() {
		return barName;
	}

	public void setBarName(String barName) {
		this.barName = barName;
	}

	public int getNoOfServers() {
		return noOfServers;
	}

	public void setNoOfServers(int noOfServers) {
		this.noOfServers = noOfServers;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getNoOfBrands() {
		return noOfBrands;
	}

	public void setNoOfBrands(int noOfBrands) {
		this.noOfBrands = noOfBrands;
	}

	public int getNoOfProfit() {
		return noOfProfit;
	}

	public void setNoOfProfit(int noOfProfit) {
		this.noOfProfit = noOfProfit;
	}

	@Override
	public String toString() {
		return "BarDto [barName=" + barName + ", noOfServers=" + noOfServers + ", location=" + location
				+ ", noOfBrands=" + noOfBrands + ", noOfProfit=" + noOfProfit + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((barName == null) ? 0 : barName.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + noOfBrands;
		result = prime * result + noOfProfit;
		result = prime * result + noOfServers;
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
		BarDto other = (BarDto) obj;
		if (barName == null) {
			if (other.barName != null)
				return false;
		} else if (!barName.equals(other.barName))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (noOfBrands != other.noOfBrands)
			return false;
		if (noOfProfit != other.noOfProfit)
			return false;
		if (noOfServers != other.noOfServers)
			return false;
		return true;
	}
	

}
