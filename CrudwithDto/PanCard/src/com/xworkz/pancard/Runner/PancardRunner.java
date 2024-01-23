package com.xworkz.pancard.Runner;

import com.xworkz.pancard.Dto.PancardDto;
import com.xworkz.pancard.Repository.PancardRepository;
import com.xworkz.pancard.Repository.PancardRepositoryImplementation;
import com.xworkz.pancard.Service.PancardService;
import com.xworkz.pancard.Service.PancardServiceImplementation;

public class PancardRunner {
	public static void main(String[] args) {
		PancardDto dto=new PancardDto();
		dto.setUserName("Christan");
		dto.setAadharNumber(7867);
		dto.setEmail("you.emial@gmail.com");
		dto.setContactNumber(9742491678l);
		dto.setPanNumber("Afhy778890");
		dto.setPresentAddress("Benglore");
		dto.setPassword("kjk@!89");
		System.out.println(dto.toString());
		
		PancardRepository repository=new PancardRepositoryImplementation();
		PancardService service=new PancardServiceImplementation(repository);
		service.validateAndsave(dto);
		service.read();
		
		String PancardDto="";
		
		
		
	}

}
