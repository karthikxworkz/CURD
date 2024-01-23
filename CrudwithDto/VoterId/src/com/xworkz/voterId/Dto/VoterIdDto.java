package com.xworkz.voterId.Dto;

public class VoterIdDto {
	
	private String aadharName;
	private int aadharNumber;
	
	public VoterIdDto() {
		System.out.println("No args constructor");
	}
	public VoterIdDto(String aadharName, int aadharNumber) {
		this.aadharName = aadharName;
		this.aadharNumber = aadharNumber;
	}
	public String getAadharName() {
		return aadharName;
	}
	public void setAadharName(String aadharName) {
		this.aadharName = aadharName;
	}
	public int getAadharNumber() {
		return aadharNumber;
	}
	public void setAadharNumber(int aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	@Override
	public String toString() {
		return "VoterIdDto [aadharName=" + aadharName + ", aadharNumber=" + aadharNumber + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aadharName == null) ? 0 : aadharName.hashCode());
		result = prime * result + aadharNumber;
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
		VoterIdDto other = (VoterIdDto) obj;
		if (aadharName == null) {
			if (other.aadharName != null)
				return false;
		} else if (!aadharName.equals(other.aadharName))
			return false;
		if (aadharNumber != other.aadharNumber)
			return false;
		return true;
	}
	
	
}