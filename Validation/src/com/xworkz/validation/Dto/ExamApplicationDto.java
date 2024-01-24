package com.xworkz.validation.Dto;

public class ExamApplicationDto {
	private String applicationID;
	private String name;
	private String email;
    private String password;
    private long contactNumber;
    private String modeOfExam;
    
    public ExamApplicationDto() {
    	System.out.println("No args constructot");
    }

	public ExamApplicationDto(String applicationID, String name, String email, String password, long contactNumber,
			String modeOfExam) {
		this.applicationID = applicationID;
		this.name = name;
		this.email = email;
		this.password = password;
		this.contactNumber = contactNumber;
		this.modeOfExam = modeOfExam;
	}
	

	public String getApplicationID() {
		return applicationID;
	}

	public void setApplicationID(String applicationID) {
		this.applicationID = applicationID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getModeOfExam() {
		return modeOfExam;
	}

	public void setModeOfExam(String modeOfExam) {
		this.modeOfExam = modeOfExam;
	}

	@Override
	public String toString() {
		return "ExamApplicationDto [applicationID=" + applicationID + ", name=" + name + ", email=" + email
				+ ", password=" + password + ", contactNumber=" + contactNumber + ", modeOfExam=" + modeOfExam + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((applicationID == null) ? 0 : applicationID.hashCode());
		result = prime * result + (int) (contactNumber ^ (contactNumber >>> 32));
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((modeOfExam == null) ? 0 : modeOfExam.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
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
		ExamApplicationDto other = (ExamApplicationDto) obj;
		if (applicationID == null) {
			if (other.applicationID != null)
				return false;
		} else if (!applicationID.equals(other.applicationID))
			return false;
		if (contactNumber != other.contactNumber)
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (modeOfExam == null) {
			if (other.modeOfExam != null)
				return false;
		} else if (!modeOfExam.equals(other.modeOfExam))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		return true;
	}

}
