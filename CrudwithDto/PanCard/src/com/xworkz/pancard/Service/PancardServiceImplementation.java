package com.xworkz.pancard.Service;

import com.xworkz.pancard.Dto.PancardDto;
import com.xworkz.pancard.Repository.PancardRepository;

public class PancardServiceImplementation implements PancardService {

	private PancardRepository repository;

	public PancardServiceImplementation(PancardRepository repository) {
		this.repository = repository;
	}

	@Override
	public boolean validateAndsave(PancardDto pancardDto) {

		boolean validateName = true;
		boolean validateNumber = true;
		boolean validateEmail = true;
		boolean validateContactNumber = true;
		boolean validatePresentAddress = true;
		boolean validatePanNumber = true;
		boolean validatePassword = true;

		if (pancardDto != null) {
			if (pancardDto.getUserName() == null || pancardDto.getUserName().equals("null")
					|| pancardDto.getUserName().length() > 2) {
				System.out.println("Validating the condition of length of pancard username");
				validateName = false;
			}
			if (pancardDto.getAadharNumber() == 0 || pancardDto.getAadharNumber() == 12) {
				System.out.println("Validating the condition of length of aadharnumber");
				validateNumber = false;
			}
			if (pancardDto.getEmail() == null || pancardDto.getEmail().equals("null")
					|| pancardDto.getEmail().length() > 2 || pancardDto.getEmail().contains("@")) {
				System.out.println("Validating the condition of email");
				validateEmail = false;
			}
			if (pancardDto.getContactNumber() == 0 || pancardDto.getContactNumber() == 10) {
				System.out.println("Validating the condition of contact number");
				validateContactNumber = false;
			}
			if (pancardDto.getPresentAddress() == null || pancardDto.getPresentAddress().equals("null")
					|| pancardDto.getPresentAddress().length() > 5) {
				System.out.println("Validate the condition of present address");
				validatePresentAddress = false;
			}
			if (pancardDto.getPanNumber() == null || pancardDto.getPanNumber().equals("null")
					|| pancardDto.getPanNumber().length() == 10 || pancardDto.getPanNumber().endsWith(null)
					|| pancardDto.getPanNumber().startsWith("null")) {
				System.out.println("Validate the condition of present pan number");
				validatePanNumber = false;
			}
			if (pancardDto.getPassword() == null || pancardDto.getPassword().equals(null)
					|| pancardDto.getPassword().length() > 8 && pancardDto.getPassword().length() < 16
					|| pancardDto.getPassword().toUpperCase().startsWith("null")
							&& pancardDto.getPassword().contains("1") && pancardDto.getPassword().contains("@")
							&& pancardDto.getPassword().contains("#") && pancardDto.getPassword().contains("!")) {
				System.out.println("Validate the condition of present password");
				validatePassword = false;
			}

		}
		if (validateName == true && validateNumber == true && validateEmail == true && validateContactNumber == true
				&& validatePresentAddress == true && validatePanNumber == true && validatePassword == true) {
			boolean save = repository.onSave(pancardDto);
			System.out.println("Element is :" + save);
		}
		return false;
	}

	@Override
	public PancardDto[] read() {
		PancardDto[] pancardDto = repository.read();
		for (PancardDto name : pancardDto) {
			System.out.println(name);
		}
		return pancardDto;
	}

	@Override
	public boolean isExist(PancardDto pancardDto) {
		PancardDto[] dtos = repository.read();
		if (dtos != null) {
			for (PancardDto name : dtos) {
				if (name != null) {
					if (name.equals(name)) {
						return true;
					}
				}
			}
		}
		return false;
	}

}
