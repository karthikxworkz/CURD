package com.xworkz.pancard.Repository;

import com.xworkz.pancard.Dto.PancardDto;

public class PancardRepositoryImplementation implements PancardRepository {
	
	private PancardDto[] Dtos=new PancardDto[5];
	private int index=0;

	@Override
	public boolean onSave(PancardDto pancardDto) {
		if(index<Dtos.length) {
			Dtos[index]=pancardDto;
			index++;
			return true;
		}
			
		return false;
	}

	@Override
	public PancardDto[] read() {
		return Dtos;
	}

}
