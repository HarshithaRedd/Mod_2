package com.cpg.fms.Booking.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity

public class Booking {
	 
		@Id
		private long bookingId;
	    private long userId;                  //private User userId;
	    @JsonFormat(pattern="yyyy-MM-dd")
		private LocalDate bookingDate;
		@ElementCollection
		private List<String> passengerList;     //private List<Passenger> passengerList;
		private double ticketCost;
		private long flightNumber;            //private Flight flight;
		private int noOfPassengers;

		public Booking() {
			super();
		}
		
		public Booking(long bookingId, long userId, LocalDate bookingDate, List<String> passengerList, double ticketCost,
				long flightNumber, int noOfPassengers) {
			super();
			this.bookingId = bookingId;
			this.userId = userId;
			this.bookingDate = bookingDate;
			this.passengerList = passengerList;
			this.ticketCost = ticketCost;
			this.flightNumber = flightNumber;
			this.noOfPassengers = noOfPassengers;
		}

		public long getBookingId() {
			return bookingId;
		}

		public void setBookingId(long bookingId) {
			this.bookingId = bookingId;
		}

	    public long getUserId() {
			return userId;
		}

		public void setUserId(long userId) {
			this.userId = userId;
		}

		public LocalDate getBookingDate() {
			return bookingDate;
		}

		public void setBookingDate(LocalDate bookingDate) {
			this.bookingDate = bookingDate;
		}

		public List<String> getPassengerList() {
			return passengerList;
		}
		
		public void setPassengerList(List<String> passengerList) {
			this.passengerList = passengerList;
		}
		
		public double getTicketCost() {
			return ticketCost;
		}


		public void setTicketCost(double ticketCost) {
			this.ticketCost = ticketCost;
		}

		
		public long getFlightNumber() {
			return flightNumber;
		}

		public void setFlightNumber(long flightNumber) {
			this.flightNumber = flightNumber;
		}

		public int getNoOfPassengers() {
			return noOfPassengers;
		}

		public void setNoOfPassengers(int noOfPassengers) {
			this.noOfPassengers = noOfPassengers;
		}

		@Override
		public String toString() {
			return "Booking [bookingId=" + bookingId + ", userId=" + userId + ", bookingDate=" + bookingDate
					+ ", passengerList=" + passengerList + ", ticketCost=" + ticketCost + ", flightNumber=" + flightNumber
					+ ", noOfPassengers=" + noOfPassengers + "]";
		}

}
