package com.xworkz.pancard.Dto;

public class PancardDto {
	
	private String userName;
	private int aadharNumber;
	private String email;
	private long contactNumber;
	private String presentAddress;
	private String panNumber;
	private String password;
	
	public PancardDto() {
		System.out.println("No args constructor");
	}

	public PancardDto(String userName, int aadharNumber, String email, long contactNumber, String presentAddress,
			String panNumber, String password) {
		this.userName = userName;
		this.aadharNumber = aadharNumber;
		this.email = email;
		this.contactNumber = contactNumber;
		this.presentAddress = presentAddress;
		this.panNumber = panNumber;
		this.password = password;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + aadharNumber;
		result = prime * result + (int) (contactNumber ^ (contactNumber >>> 32));
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((panNumber == null) ? 0 : panNumber.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((presentAddress == null) ? 0 : presentAddress.hashCode());
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
		PancardDto other = (PancardDto) obj;
		if (aadharNumber != other.aadharNumber)
			return false;
		if (contactNumber != other.contactNumber)
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (panNumber == null) {
			if (other.panNumber != null)
				return false;
		} else if (!panNumber.equals(other.panNumber))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (presentAddress == null) {
			if (other.presentAddress != null)
				return false;
		} else if (!presentAddress.equals(other.presentAddress))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PancardDto [userName=" + userName + ", aadharNumber=" + aadharNumber + ", email=" + email
				+ ", contactNumber=" + contactNumber + ", presentAddress=" + presentAddress + ", panNumber=" + panNumber
				+ ", password=" + password + "]";
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(int aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getPresentAddress() {
		return presentAddress;
	}

	public void setPresentAddress(String presentAddress) {
		this.presentAddress = presentAddress;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}