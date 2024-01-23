package com.xworkz.TicketBooking.Repository;

import com.xworkz.TicketBooking.Dto.TicketBookingDto;

public interface TicketBookingRepository {
	
	boolean onSave( TicketBookingDto ticketBookingDto);

}
