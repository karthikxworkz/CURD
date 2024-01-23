package com.xworkz.voterId.Repository;

import com.xworkz.voterId.Dto.VoterIdDto;

public class VoterIdRepositoryImplementation implements VoterIdRepository {
	
       private VoterIdDto[] dtos=new VoterIdDto[5];
       private int index=0;
	@Override
	public boolean onSave(VoterIdDto voterIdDto) {
		if(index<dtos.length) {
			dtos[index]=voterIdDto;
			index++;
			return true;
		}
		return false;
	}
	@Override
	public VoterIdDto[] read() {
		return dtos;
	}

}
