package com.xworkz.consultancy.Dto;

public class ConsultancyDto {
	
	private String ConsultancyNames;
	private int noOfConsultancies;
	private int noOfStudents;
	private int noOfTranieers;
	
	public ConsultancyDto() {
	System.out.println("No args constructor");
	}

	public ConsultancyDto(String consultancyNames, int noOfConsultancies, int noOfStudents, int noOfTranieers) {
		ConsultancyNames = consultancyNames;
		this.noOfConsultancies = noOfConsultancies;
		this.noOfStudents = noOfStudents;
		this.noOfTranieers = noOfTranieers;
	}

	public String getConsultancyNames() {
		return ConsultancyNames;
	}

	public void setConsultancyNames(String consultancyNames) {
		ConsultancyNames = consultancyNames;
	}

	public int getNoOfConsultancies() {
		return noOfConsultancies;
	}

	public void setNoOfConsultancies(int noOfConsultancies) {
		this.noOfConsultancies = noOfConsultancies;
	}

	public int getNoOfStudents() {
		return noOfStudents;
	}

	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}

	public int getNoOfTranieers() {
		return noOfTranieers;
	}

	public void setNoOfTranieers(int noOfTranieers) {
		this.noOfTranieers = noOfTranieers;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ConsultancyNames == null) ? 0 : ConsultancyNames.hashCode());
		result = prime * result + noOfConsultancies;
		result = prime * result + noOfStudents;
		result = prime * result + noOfTranieers;
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
		ConsultancyDto other = (ConsultancyDto) obj;
		if (ConsultancyNames == null) {
			if (other.ConsultancyNames != null)
				return false;
		} else if (!ConsultancyNames.equals(other.ConsultancyNames))
			return false;
		if (noOfConsultancies != other.noOfConsultancies)
			return false;
		if (noOfStudents != other.noOfStudents)
			return false;
		if (noOfTranieers != other.noOfTranieers)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ConsultancyDto [ConsultancyNames=" + ConsultancyNames + ", noOfConsultancies=" + noOfConsultancies
				+ ", noOfStudents=" + noOfStudents + ", noOfTranieers=" + noOfTranieers + "]";
	}
	
}
