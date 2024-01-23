package com.xworkz.contentcreator.Service;

import com.xworkz.contentcreator.Dto.ContentCreatorDto;
import com.xworkz.contentcreator.Repository.ContentCreatorRepository;

public class ContentCreatorServiceImplementation implements ContentCreatorService {

	private ContentCreatorRepository repository;

	public ContentCreatorServiceImplementation(ContentCreatorRepository repository) {
		this.repository = repository;
	}

	@Override
	public boolean validateAndsave(ContentCreatorDto contentCreatorDto) {
		boolean validateUsername = true;
		boolean validatePassword = true;
		boolean validateEmail = true;
		boolean validateWebsite = true;
		boolean validatePages = true;
		boolean validateContentLength = true;
		boolean validateAmountPaid = true;

		if (contentCreatorDto != null) {
			if (contentCreatorDto.getUserName() == null || contentCreatorDto.getUserName().equals("null")
					|| contentCreatorDto.getUserName().length() < 2
					|| contentCreatorDto.getUserName().isEmpty() 
					|| contentCreatorDto.getUserName().isBlank()) {
				System.out.println("Valiadting the condition in username");
				validateUsername = false;
			}
			if (contentCreatorDto.getPassword() == null || contentCreatorDto.getPassword().equals("null")
					|| contentCreatorDto.getPassword().length() > 8 
					&& contentCreatorDto.getPassword().length() < 16
					|| !(contentCreatorDto.getPassword().contains("@")) 
					|| contentCreatorDto.getPassword().isEmpty()
					|| contentCreatorDto.getPassword().isBlank()) {
				char ch = contentCreatorDto.getPassword().charAt(0);
				if (Character.isUpperCase(ch)) {
					System.out.println("is upper case:" + ch);
				} else {
					System.out.println("is upper case:" + ch);
				}

				System.out.println("Validating the condition of password");
				validatePassword = false;
			}
			if (contentCreatorDto.getEmail() == null || contentCreatorDto.getEmail().equals(null)
					|| contentCreatorDto.getEmail().length() > 3 || !contentCreatorDto.getEmail().contains("@")
					|| contentCreatorDto.getEmail().isBlank() || contentCreatorDto.getEmail().isBlank()) {
				System.out.println("Valiadting the condition of email");
				validateEmail = false;
			}
			if (contentCreatorDto.getWebsite() == null || contentCreatorDto.getWebsite().equals(null)
					|| contentCreatorDto.getWebsite().isEmpty() || contentCreatorDto.getWebsite().isBlank()) {
				System.out.println("Vlaidating the condition of website");
				validateWebsite = false;
			}
			if (contentCreatorDto.getPages() == 0 || contentCreatorDto.getPages() < 1) {
				System.out.println("Validating the condition of pages");
				validatePages = false;
			}
			if (contentCreatorDto.getContentLength() == 0
					|| contentCreatorDto.getContentLength() < 30 && contentCreatorDto.getContentLength() > 100) {
				System.out.println("Validating the condition of contant lenghth");
				validateContentLength = false;
			}
			if (contentCreatorDto.getAmountPaid() == 0
					|| contentCreatorDto.getAmountPaid() < 100 && contentCreatorDto.getAmountPaid() > 1000) {
				System.out.println("Validating the condition of amount paid");
			}

			if (validateUsername == true && validatePassword == true && validateEmail == true && validateWebsite == true
					&& validatePages == true && validateContentLength == true && validateAmountPaid == true) {
				boolean save = repository.onSave(contentCreatorDto);
				System.out.println("Elements are:" + save);
			}
		}

		return false;
	}

	@Override
	public void read() {
		ContentCreatorDto[] contentCreatorDto = repository.read();
		for (ContentCreatorDto name : contentCreatorDto) {
			System.out.println("name is:" + name);
		}
	}

	@Override
	public boolean isExists(ContentCreatorDto contentCreatorDto) {
		ContentCreatorDto[] dtos = repository.read();
		if (dtos != null) {
			for (ContentCreatorDto arrayDto : dtos) {
				if (arrayDto.equals(contentCreatorDto)) {
					return true;
				}
			}
		}
		return false;
	}

	// @Override
	public boolean isExistsCheck(String userName) {
		ContentCreatorDto[] dtos = repository.read();
		if (dtos != null) {
			for (ContentCreatorDto arrayDto : dtos) {
				if (arrayDto != null) {
					if (arrayDto.getUserName().equals(userName)) {
						return true;
					}
				}
			}
		}
		return false;
	}

}
