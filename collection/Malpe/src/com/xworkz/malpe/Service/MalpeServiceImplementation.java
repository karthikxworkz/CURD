package com.xworkz.malpe.Service;

import com.xworkz.malpe.Dto.MalpeDto;
import com.xworkz.malpe.Repository.MalpeRepository;

public class MalpeServiceImplementation implements MalpeService{
	
	public MalpeRepository repository;
	
	public MalpeServiceImplementation(MalpeRepository repository) {
		this.repository = repository;
	}

	@Override
	public boolean validateAndSave(MalpeDto malpeDto) {
		if(malpeDto!=null) {
			System.out.println("Dto is not null");
//			boolean save=repository.onSave(malpeDto);
			if(repository.onSave(malpeDto)) {
				System.out.println("Saved succesffully");
				return true;
			} else {
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
	   System.out.println("Reading the service dto");
		
	}

}
