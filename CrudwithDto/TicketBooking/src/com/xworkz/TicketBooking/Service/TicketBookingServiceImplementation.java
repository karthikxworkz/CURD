package com.xworkz.TicketBooking.Service;

import com.xworkz.TicketBooking.Dto.TicketBookingDto;

public class TicketBookingServiceImplementation implements TicketBookingService {

	@Override
	public boolean validateAndSave(TicketBookingDto ticketBookingDto) {
	
		boolean validateName=true;
		boolean validateEmailId=true;
		boolean validateFrom=true;
		
		if(ticketBookingDto!=null) {
			if(ticketBookingDto.getName()==null||ticketBookingDto.getName().length()>3&&ticketBookingDto.getName().length()<25) {
				System.out.println("Validate and condition of name");
				validateName=false;
			}
			if(ticketBookingDto.getEmailId()==null||ticketBookingDto.getEmailId().contains("@")) {
				System.out.println("Validate and condition of email");
				validateEmailId=false;
			}
			if(ticketBookingDto.getFrom()==null) {
				System.out.println("Validate and condition of from ticket booking");
				validateFrom=false;
			}
		}
		
		
		
		
		return false;
	}

}
