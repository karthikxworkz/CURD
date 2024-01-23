package com.xworkz.voterId.Runner;

import com.xworkz.voterId.Dto.VoterIdDto;
import com.xworkz.voterId.Repository.VoterIdRepository;
import com.xworkz.voterId.Repository.VoterIdRepositoryImplementation;
import com.xworkz.voterId.Service.VoterIdService;
import com.xworkz.voterId.Service.VoterIdServiceImplementation;

public class VoterIdRunner {
	public static void main(String[] args) {
		
		VoterIdDto voterIdDto=new VoterIdDto();
		voterIdDto.setAadharName("NarshimaRaju");
		voterIdDto.setAadharNumber(80999);
		
//		VoterIdRepository repository=new VoterIdRepositoryImplementation();
//		VoterIdService service=new VoterIdServiceImplementation(repository);
//		service.
	}

}
