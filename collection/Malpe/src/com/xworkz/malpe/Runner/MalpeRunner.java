    package com.xworkz.malpe.Runner;

import com.xworkz.malpe.Dto.MalpeDto;
import com.xworkz.malpe.Repository.MalpeRepository;
import com.xworkz.malpe.Repository.MalpeRepositoryImplementation;
import com.xworkz.malpe.Service.MalpeService;
import com.xworkz.malpe.Service.MalpeServiceImplementation;

public class MalpeRunner {
	
	public static void main(String[] args) {
		MalpeDto malpeDto=new MalpeDto();
		malpeDto.setPresidentName("Richard Antony");
		malpeDto.setLocation("Udupi");
		malpeDto.setNoOfBoats(300);
		malpeDto.setTypeOfFishes(10);
		System.out.println(malpeDto.toString());
		
		MalpeRepository repository=new MalpeRepositoryImplementation();
		MalpeService service=new MalpeServiceImplementation(repository);
		service.validateAndSave(malpeDto);
		service.read();
	}

}
