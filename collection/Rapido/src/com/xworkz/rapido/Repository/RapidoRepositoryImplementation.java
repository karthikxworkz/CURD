package com.xworkz.rapido.Repository;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.rapido.Dto.RapidoDto;

public class RapidoRepositoryImplementation implements RapidoRepository{

	List<RapidoDto> listOfRapidoDto=new ArrayList<RapidoDto>();

	@Override
	public boolean onSave(RapidoDto rapidoDto) {
		if(listOfRapidoDto!=null) {
			listOfRapidoDto.add(rapidoDto);
			System.out.println("List of Dto is not null");
			return true;
		}else {
			System.out.println("List of dto is null");
		}
		return false;
	}

	@Override
	public List<RapidoDto> readAll() {
		System.out.println("Reading all");
		return listOfRapidoDto;
	}

	
}
