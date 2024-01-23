package com.xworkz.rapido.Runner;

import com.xworkz.rapido.Dto.RapidoDto;
import com.xworkz.rapido.Repository.RapidoRepository;
import com.xworkz.rapido.Repository.RapidoRepositoryImplementation;
import com.xworkz.rapido.Service.RapidoService;
import com.xworkz.rapido.Service.RapidoServiceImplementation;

public class RapidoRunner {
	
	public static void main(String[] args) {
		
		RapidoDto rapidoDto=new RapidoDto();
		rapidoDto.setUserName("Karthik reddy");
		rapidoDto.setEmail("kr@gmail.com");
		rapidoDto.setNameOfBike("S1 Electric");
		rapidoDto.setPhoneNumber(87676687678l);
		rapidoDto.setSalary(2000);
		System.out.println("Dto are:"+rapidoDto.toString());
		
		RapidoDto rapidoDto1=new RapidoDto();
		rapidoDto1.setUserName("Karthik reddy");
		rapidoDto1.setEmail("kr@gmail.com");
		rapidoDto1.setNameOfBike("S1 Electric");
		rapidoDto1.setPhoneNumber(87676687678l);
		rapidoDto1.setSalary(2000);
		
		RapidoRepository repository=new RapidoRepositoryImplementation();
		RapidoService service=new RapidoServiceImplementation(repository);
		service.validateAndSave(rapidoDto);
		service.validateAndSave(rapidoDto1);
		service.read();
	}

}
