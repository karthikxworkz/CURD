package com.xworkz.malpe.Repository;

import java.util.List;

import com.xworkz.malpe.Dto.MalpeDto;

public interface MalpeRepository {
	
	boolean onSave(MalpeDto malpeDto);
	List<MalpeDto> readAll();

}
