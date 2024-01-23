package com.xworkz.contentcreator.Service;

import com.xworkz.contentcreator.Dto.ContentCreatorDto;

public interface ContentCreatorService {
	
	boolean validateAndsave(ContentCreatorDto contentCreatorDto);
	void read();
	boolean isExists(ContentCreatorDto contentCreatorDto);

}
