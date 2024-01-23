package com.xworkz.voterId.Service;

import com.xworkz.voterId.Dto.VoterIdDto;
import com.xworkz.voterId.Repository.VoterIdRepository;

public class VoterIdServiceImplementation implements VoterIdService {
	private VoterIdRepository repository;

	public VoterIdServiceImplementation(VoterIdRepository repository) {
		this.repository = repository;
	}

	@Override
	public boolean validateAndSave(VoterIdDto voterIdDto) {
		boolean validateName = true;
		boolean validateNumber=true;

		if (voterIdDto != null) {
			if (voterIdDto.getAadharName() == null || voterIdDto.getAadharName().equals("null")
			|| voterIdDto.getAadharName().length() < 3 && voterIdDto.getAadharName().length() > 12) {
				System.out.println("Validating the length of voterId name ");
			return validateName;
			}

			if(voterIdDto.getAadharNumber()==0||voterIdDto.getAadharNumber()<0) {
				System.out.println("Validating the length of voterId name");
			return validateNumber;	
			}
		}
		
		if(validateName==true&&validateNumber==true) {
			boolean save=repository.onSave(voterIdDto);
			System.out.println("Elements are:"+save);
		}
		
		return false;
	}
	
	
	
	
}
