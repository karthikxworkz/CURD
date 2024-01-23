package com.xworkz.rapido.Service;

import com.xworkz.rapido.Dto.RapidoDto;
import com.xworkz.rapido.Repository.RapidoRepository;

public class RapidoServiceImplementation implements RapidoService {
	
	private RapidoRepository repository;
	
	public RapidoServiceImplementation(RapidoRepository repository) {
		this.repository = repository;
	}


	@Override
	public boolean validateAndSave(RapidoDto rapidoDto) {
		if(rapidoDto!=null) {
			System.out.println("Dto is not null");
			if(repository.onSave(rapidoDto)) {
				System.out.println("Saved successfully");
				return true;
			}else {
				System.out.println("not Saved successfully");
				return false;
			}
		}else {
			System.out.println("Dto is null");
		}
		return false;
	}


	@Override
	public void read() {
		System.out.println("Reading the service implemenetation");
	}

}
