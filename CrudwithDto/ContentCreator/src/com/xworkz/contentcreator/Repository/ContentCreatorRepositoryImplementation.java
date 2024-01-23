package com.xworkz.contentcreator.Repository;

import com.xworkz.contentcreator.Dto.ContentCreatorDto;

public class ContentCreatorRepositoryImplementation implements ContentCreatorRepository {
           
	   private ContentCreatorDto[] dtos=new ContentCreatorDto[5]; 
	   private int index=0;
	
	@Override
	public boolean onSave(ContentCreatorDto contentCreatorDto) {
		if(index<dtos.length) {
			dtos[index]=contentCreatorDto;
			index++;
			return true;	
		}
		return false;
	}

	@Override
	public ContentCreatorDto[] read() {
		return dtos;
	}
	
	
	

}
