package com.xworkz.hotel.Service;

import com.xworkz.hotel.Dto.HotelDto;

public interface HotelService {

	boolean validateAndSave(HotelDto hotelDto);
	void read();
}
