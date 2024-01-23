package com.xworkz.malpe.Service;

import com.xworkz.malpe.Dto.MalpeDto;

public interface MalpeService {
 
	boolean validateAndSave(MalpeDto malpeDto);
	void read();
}
