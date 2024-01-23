package com.xworkz.consultancy.Repository;

import java.util.List;

import com.xworkz.consultancy.Dto.ConsultancyDto;

public interface ConsultancyRepository {

	boolean onSave(ConsultancyDto consultancyDto);
	List<ConsultancyDto> readAll();
	

}
