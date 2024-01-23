package com.xworkz.TicketBooking.Repository;

import com.xworkz.TicketBooking.Dto.TicketBookingDto;

public class TicketBookingRepositoryimplementation implements TicketBookingRepository {
	
	private String[] dtos=new String[3];
	private int index=0;
	
	@Override
	public boolean onSave(TicketBookingDto ticketBookingDto) {
		if(ticketBookingDto!=null) {
		if(index<this.dtos.length) {
			dtos[index]=ticketBookingDto;
			index++;
			return true;
		}
		return false;
	}

	}
}
