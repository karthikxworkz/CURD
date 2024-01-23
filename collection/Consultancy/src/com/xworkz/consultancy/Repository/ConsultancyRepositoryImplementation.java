package com.xworkz.consultancy.Repository;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.consultancy.Dto.ConsultancyDto;

public class ConsultancyRepositoryImplementation implements ConsultancyRepository{
	
	List<ConsultancyDto> listOfConsultancyDto=new ArrayList<ConsultancyDto>();

	@Override
	public boolean onSave(ConsultancyDto consultancyDto) {
		System.out.println("On Save method ");
		if(listOfConsultancyDto!=null) {
			listOfConsultancyDto.add(consultancyDto);
			System.out.println("List of ConsultancyDto is not null");
			 return true;	
			}else {
				System.out.println("List of ConsultancyDto is null");
		}
		return false;
	}

	@Override
	public List<ConsultancyDto> readAll() {
		System.out.println("Reading all");
		return listOfConsultancyDto;
	}

}
