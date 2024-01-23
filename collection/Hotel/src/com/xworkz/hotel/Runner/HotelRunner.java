package com.xworkz.hotel.Runner;

import com.xworkz.hotel.Dto.HotelDto;
import com.xworkz.hotel.Repository.HotelRepository;
import com.xworkz.hotel.Repository.HotelRepositoryImplementation;
import com.xworkz.hotel.Service.HotelService;
import com.xworkz.hotel.Service.HotelServiceImplementation;

public class HotelRunner {
	
	public static void main(String[] args) {
		
      HotelDto hotelDto=new HotelDto();
      hotelDto.setNameOfHotel("Udupi Hotel");
      hotelDto.setLocation("Udupi");
      hotelDto.setTypeOfFood(21);
      hotelDto.setNoOfServers(7);
      hotelDto.setRatings(9.0f);
      System.out.println("Dto list are:"+hotelDto.toString());
      
      HotelRepository repository=new HotelRepositoryImplementation();
      HotelService service=new HotelServiceImplementation(repository);
      service.validateAndSave(hotelDto);
      service.read();
	}
	

}
