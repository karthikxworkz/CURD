package com.xworkz.consultancy.Service;

import com.xworkz.consultancy.Dto.ConsultancyDto;
import com.xworkz.consultancy.Repository.ConsultancyRepository;

public class ConsultancyServiceImplementation implements ConsultancyService {

	private ConsultancyRepository repository;

	
	public ConsultancyServiceImplementation(ConsultancyRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public boolean validateOnSave(ConsultancyDto consultancyDto) {
	   if(consultancyDto!=null) {
		   System.out.println("Dto is not null");
		   if(repository.onSave(consultancyDto)) {
			   System.out.println("Saved successfully");
			   return true;
		   }else {
			   System.out.println("Not Saved successfully");
			   return false;
		   }
	   }else {
		   System.out.println("Dto is null");
	   }
		return false;
	}

	@Override
	public void read() {
		System.out.println("Reading the service implementation");
		
	}

}
