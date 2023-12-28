package com.xworkz.googleApps.Runner;

import com.xworkz.googleApps.Dto.GoogleApplicationDto;
import com.xworkz.googleApps.Repository.GoogleApplicationRepository;
import com.xworkz.googleApps.Repository.GoogleApplicationRepositoryImplementation;
import com.xworkz.googleApps.Service.GoogleApplicationService;
import com.xworkz.googleApps.Service.GoogleApplicationServiceImplementation;

public class GoogleApplicationRunner {
	public static void main(String[] args) {
		GoogleApplicationDto googleApplicationDto = new GoogleApplicationDto();
		googleApplicationDto.setApplicationID("G001");
		googleApplicationDto.setApplicationName("Gmail");
		googleApplicationDto.setApplicationCost("355");
		googleApplicationDto.setApplicationVersion("G009");
		googleApplicationDto.setApplicationStorage(5);
		googleApplicationDto.setApplicationLimit(15);
		System.out.println(googleApplicationDto.toString());
		
		GoogleApplicationRepository repository=new GoogleApplicationRepositoryImplementation();
		GoogleApplicationService service=new GoogleApplicationServiceImplementation(repository);
		service.validateAndsave(googleApplicationDto);
		service.read();
		
	
		
		
	}

}

	