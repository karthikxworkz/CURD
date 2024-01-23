package com.xworkz.hotel.Repository;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.hotel.Dto.HotelDto;

public class HotelRepositoryImplementation implements HotelRepository{
	
	List<HotelDto> listOfHotelDto=new ArrayList<HotelDto>();

	@Override
	public boolean onSave(HotelDto hotelDto) {
		if(listOfHotelDto!=null) {
			listOfHotelDto.add(hotelDto);
			System.out.println("List Dto is not null");
			return true;
		}else {
			System.out.println("List Dto is null");
		}
		return false;
	}

	@Override
	public List<HotelDto> readAll() {
		System.out.println("Reading All");
		return listOfHotelDto;
	}

}
