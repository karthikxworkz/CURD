package com.xworkz.rapido.Repository;

import java.util.List;

import com.xworkz.rapido.Dto.RapidoDto;

public interface RapidoRepository {

	boolean onSave(RapidoDto rapidoDto);
	List<RapidoDto> readAll();
	
	}
