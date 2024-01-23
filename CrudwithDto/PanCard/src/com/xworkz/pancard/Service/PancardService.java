package com.xworkz.pancard.Service;

import com.xworkz.pancard.Dto.PancardDto;

public interface PancardService {
	
	boolean validateAndsave(PancardDto pancardDto);
	boolean isExist(PancardDto pancardDto);
	PancardDto[] read();

}
