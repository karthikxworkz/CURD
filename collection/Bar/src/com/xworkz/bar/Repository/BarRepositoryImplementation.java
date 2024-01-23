package com.xworkz.bar.Repository;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.bar.Dto.BarDto;

public class BarRepositoryImplementation implements BarRepository{
	
	List<BarDto> listOfBarDto=new ArrayList<BarDto>();

	@Override
	public boolean onSave(BarDto barDto) {
		if(listOfBarDto!=null) {
			listOfBarDto.add(barDto);
			System.out.println("List Dto is not null");
			return true;
		}else {
			System.out.println("List Dto is null");
		}
    	return false;
	}

	@Override
	public List<BarDto> readAll() {
		System.out.println("Reading all");
		return null;
	}

}
