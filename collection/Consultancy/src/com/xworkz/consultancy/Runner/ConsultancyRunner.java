package com.xworkz.consultancy.Runner;

import com.xworkz.consultancy.Dto.ConsultancyDto;
import com.xworkz.consultancy.Repository.ConsultancyRepository;
import com.xworkz.consultancy.Repository.ConsultancyRepositoryImplementation;
import com.xworkz.consultancy.Service.ConsultancyService;
import com.xworkz.consultancy.Service.ConsultancyServiceImplementation;

public class ConsultancyRunner {
	public static void main(String[] args) {
		ConsultancyDto consultancyDto=new ConsultancyDto();
		consultancyDto.setConsultancyNames("Richwave Infotech Private Limited");
		consultancyDto.setNoOfConsultancies(1000);
		consultancyDto.setNoOfStudents(101010);
		consultancyDto.setNoOfTranieers(150);
		System.out.println(consultancyDto.toString());
		
		ConsultancyRepository repository=new ConsultancyRepositoryImplementation(); 
		ConsultancyService service=new ConsultancyServiceImplementation(repository);
		service.validateOnSave(consultancyDto);
		service.read();
	}
}
