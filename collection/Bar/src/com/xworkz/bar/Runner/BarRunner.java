package com.xworkz.bar.Runner;

import com.xworkz.bar.Dto.BarDto;
import com.xworkz.bar.Repository.BarRepository;
import com.xworkz.bar.Repository.BarRepositoryImplementation;
import com.xworkz.bar.Service.BarService;
import com.xworkz.bar.Service.BarServiceImplementation;

public class BarRunner {
	
	public static void main(String[] args) {
	 BarDto	barDto =new BarDto();
	 barDto.setBarName("Hot Chipps");
	 barDto.setLocation("Manipal");
	 barDto.setNoOfBrands(121);
	 barDto.setNoOfProfit(75);
	 barDto.setNoOfServers(45);
	System.out.println("Dto Lists are:"+barDto.toString());
	
	
	BarRepository repository=new BarRepositoryImplementation();
	BarService service=new BarServiceImplementation(repository);
	service.validateAndsave(barDto);
	service.read();
	}
}
