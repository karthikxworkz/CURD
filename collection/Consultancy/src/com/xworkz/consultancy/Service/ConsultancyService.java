package com.xworkz.consultancy.Service;

import com.xworkz.consultancy.Dto.ConsultancyDto;

public interface ConsultancyService {
     
	boolean validateOnSave(ConsultancyDto consultancyDto);
	void read();
}
