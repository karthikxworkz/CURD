package com.xworkz.contentcreator.Repository;

import com.xworkz.contentcreator.Dto.ContentCreatorDto;

public interface ContentCreatorRepository {
	
	boolean onSave(ContentCreatorDto contentCreatorDto);
	ContentCreatorDto[] read();
}
