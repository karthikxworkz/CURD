package com.xworkz.TicketBooking.Service;

import com.xworkz.TicketBooking.Dto.TicketBookingDto;

public interface TicketBookingService {

	boolean validateAndSave(TicketBookingDto ticketBookingDto);
}
