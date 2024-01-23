package com.xworkz.hotel.Repository;

import java.util.List;

import com.xworkz.hotel.Dto.HotelDto;

public interface HotelRepository {
	
	boolean onSave(HotelDto hotelDto);
	List<HotelDto> readAll();

}
