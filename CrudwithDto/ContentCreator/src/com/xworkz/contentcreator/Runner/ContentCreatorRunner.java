package com.xworkz.contentcreator.Runner;

import com.xworkz.contentcreator.Dto.ContentCreatorDto;
import com.xworkz.contentcreator.Repository.ContentCreatorRepository;
import com.xworkz.contentcreator.Repository.ContentCreatorRepositoryImplementation;
import com.xworkz.contentcreator.Service.ContentCreatorService;
import com.xworkz.contentcreator.Service.ContentCreatorServiceImplementation;

public class ContentCreatorRunner {
	
	public static void main(String[] args) {
		ContentCreatorDto contentCreatorDto = new ContentCreatorDto();
		contentCreatorDto.setUserName("null");
		contentCreatorDto.setPassword("null");
		contentCreatorDto.setEmail("null");
		contentCreatorDto.setAmountPaid(0);
		contentCreatorDto.setContentLength(0);
		contentCreatorDto.setWebsite(null);
		contentCreatorDto.setContentType(null);
		System.out.println(contentCreatorDto.toString());
		
		ContentCreatorRepository repository=new ContentCreatorRepositoryImplementation();
		ContentCreatorService service=new ContentCreatorServiceImplementation(repository);
		service.validateAndsave(contentCreatorDto);
		service.read();
		
	}

}
