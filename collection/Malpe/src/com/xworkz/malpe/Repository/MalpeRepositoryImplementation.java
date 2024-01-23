package com.xworkz.malpe.Repository;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.malpe.Dto.MalpeDto;

public class MalpeRepositoryImplementation implements MalpeRepository{
	
	
	List<MalpeDto> listOfMalpeDto=new ArrayList<MalpeDto>();

	@Override
	public boolean onSave(MalpeDto malpeDto) {
		if(listOfMalpeDto!=null) {
			listOfMalpeDto.add(malpeDto);
			System.out.println("List of malpeDto is not equal to null");
			return true;
		}else {
			System.out.println("List of malpeDto is null");
		}
		return false;
	}

	@Override
	public List<MalpeDto> readAll() {
   System.out.println("Reading all");
		return listOfMalpeDto;
	}

}
