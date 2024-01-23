package com.xworkz.contentcreator.Dto;

public class ContentCreatorDto {
	
	private String userName;
	private String password;
	private String email;
	private String website;
	private int pages;
	private String contentType;
	private int contentLength;
	private int amountPaid;
	
	public ContentCreatorDto() {
		System.out.println("No args constructor");
	}

	public ContentCreatorDto(String userName, String password, String email, String website, int pages,
			String contentType, int contentLength, int amountPaid) {
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.website = website;
		this.pages = pages;
		this.contentType = contentType;
		this.contentLength = contentLength;
		this.amountPaid = amountPaid;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public int getContentLength() {
		return contentLength;
	}

	public void setContentLength(int contentLength) {
		this.contentLength = contentLength;
	}

	public int getAmountPaid() {
		return amountPaid;
	}

	public void setAmountPaid(int amountPaid) {
		this.amountPaid = amountPaid;
	}

	@Override
	public String toString() {
		return "ContentCreatorDto [userName=" + userName + ", password=" + password + ", email=" + email + ", website="
				+ website + ", pages=" + pages + ", contentType=" + contentType + ", contentLength=" + contentLength
				+ ", amountPaid=" + amountPaid + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + amountPaid;
		result = prime * result + contentLength;
		result = prime * result + ((contentType == null) ? 0 : contentType.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + pages;
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		result = prime * result + ((website == null) ? 0 : website.hashCode());
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
		ContentCreatorDto other = (ContentCreatorDto) obj;
		if (amountPaid != other.amountPaid)
			return false;
		if (contentLength != other.contentLength)
			return false;
		if (contentType == null) {
			if (other.contentType != null)
				return false;
		} else if (!contentType.equals(other.contentType))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (pages != other.pages)
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		if (website == null) {
			if (other.website != null)
				return false;
		} else if (!website.equals(other.website))
			return false;
		return true;
	}
    
}