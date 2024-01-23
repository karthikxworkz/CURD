package com.xworkz.bar.Service;

import com.xworkz.bar.Dto.BarDto;
import com.xworkz.bar.Repository.BarRepository;

public class BarServiceImplementation implements BarService{
	
	private BarRepository repository;

	public BarServiceImplementation(BarRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public boolean validateAndsave(BarDto barDto) {
		if(barDto!=null) {
			System.out.println("Dto is not null");
			if(repository.onSave(barDto)) {
				System.out.println("Saved successfully");
				return true;
			}else {
				System.out.println("Not Saved sucessfully");
				return false;
			}
		}else {
			System.out.println("Dto is null");
		}
		return false;
	}

	@Override
	public void read() {
		System.out.println("Reading");
	}

}
