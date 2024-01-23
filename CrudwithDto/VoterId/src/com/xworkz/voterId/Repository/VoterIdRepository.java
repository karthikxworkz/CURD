package com.xworkz.voterId.Repository;

import com.xworkz.voterId.Dto.VoterIdDto;

public interface VoterIdRepository {
	
	boolean onSave(VoterIdDto voterIdDto);
	VoterIdDto[] read();

}
