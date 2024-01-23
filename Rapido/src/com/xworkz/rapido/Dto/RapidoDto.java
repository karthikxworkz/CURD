package com.xworkz.rapido.Dto;

public class RapidoDto {
	
	private String userName;
	private long phoneNumber;
	private String email;
	private String nameOfBike;
	private int salary;
	
	public RapidoDto() {
		System.out.println("No args constructor");	
	}

	public RapidoDto(String userName, long phoneNumber, String email, String nameOfBike, int salary) {
		this.userName = userName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.nameOfBike = nameOfBike;
		this.salary = salary;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNameOfBike() {
		return nameOfBike;
	}

	public void setNameOfBike(String nameOfBike) {
		this.nameOfBike = nameOfBike;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "RapidoDto [userName=" + userName + ", phoneNumber=" + phoneNumber + ", email=" + email + ", nameOfBike="
				+ nameOfBike + ", salary=" + salary + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((nameOfBike == null) ? 0 : nameOfBike.hashCode());
		result = prime * result + (int) (phoneNumber ^ (phoneNumber >>> 32));
		result = prime * result + salary;
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
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
		RapidoDto other = (RapidoDto) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (nameOfBike == null) {
			if (other.nameOfBike != null)
				return false;
		} else if (!nameOfBike.equals(other.nameOfBike))
			return false;
		if (phoneNumber != other.phoneNumber)
			return false;
		if (salary != other.salary)
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}
   
}
