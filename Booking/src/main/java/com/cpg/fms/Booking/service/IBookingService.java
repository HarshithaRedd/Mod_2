package com.cpg.fms.Booking.service;

import java.util.List;

import com.cpg.fms.Booking.model.Booking;
import com.cpg.fms.Booking.model.Passenger;

public interface IBookingService{
	
	Booking addBooking(Booking booking) ;
	Booking viewBookingByBookingId(long bookingId);
	List<Booking> viewAllBookings();
	Booking modifyBooking(Booking booking);
	boolean deleteBooking(long bookingId);
	
	boolean validateBookingId(long bookingId);
	boolean validateUserId(long id);
	boolean validateNoOfPAssengers(int noOfPassengers);
	
	void validateBooking(Booking booking);
	void validatePassenger(Passenger passenger);
	
}
