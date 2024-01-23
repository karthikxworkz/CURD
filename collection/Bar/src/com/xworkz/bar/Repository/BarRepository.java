package com.xworkz.bar.Repository;

import java.util.List;

import com.xworkz.bar.Dto.BarDto;

public interface BarRepository {
	
	boolean onSave(BarDto barDto);
	List<BarDto> readAll();
	

}
