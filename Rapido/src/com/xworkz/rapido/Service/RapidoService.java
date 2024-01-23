package com.xworkz.rapido.Service;

import com.xworkz.rapido.Dto.RapidoDto;

public interface RapidoService {
	
	boolean validateAndSave(RapidoDto rapidoDto);
	void read();

}
