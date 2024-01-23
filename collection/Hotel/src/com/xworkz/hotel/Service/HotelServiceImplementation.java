package com.xworkz.hotel.Service;

import com.xworkz.hotel.Dto.HotelDto;
import com.xworkz.hotel.Repository.HotelRepository;

public class HotelServiceImplementation implements HotelService{
	
	private HotelRepository repository;

	public HotelServiceImplementation(HotelRepository repository) {
		this.repository = repository;
	}

	@Override
	public boolean validateAndSave(HotelDto hotelDto) {
		if(hotelDto!=null) {
			System.out.println("Dto is not null");
			if(repository.onSave(hotelDto)) {
				System.out.println("Saved Successfully");
				return true;
			}else {
				System.out.println("Not saved successfully");
				return false;
			}
		}else {
			System.out.println("Dto is null");
		}
		return false;
	}

	@Override
	public void read() {
		System.out.println("Reading");	
	}

}
