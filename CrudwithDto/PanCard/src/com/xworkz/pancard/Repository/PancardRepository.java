package com.xworkz.pancard.Repository;

import com.xworkz.pancard.Dto.PancardDto;

public interface PancardRepository {
	
	boolean onSave(PancardDto pancardDto);
	PancardDto[] read();

}
