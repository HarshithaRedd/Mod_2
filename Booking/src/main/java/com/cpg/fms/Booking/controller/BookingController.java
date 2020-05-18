package com.cpg.fms.Booking.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cpg.fms.Booking.model.Booking;
import com.cpg.fms.Booking.service.IBookingService;


@RestController
@RequestMapping("/booking")
@CrossOrigin(origins = "http://localhost:4200")
public class BookingController {
	
	@Autowired
	IBookingService service;

	@GetMapping("/id/{bookingId}")
	public ResponseEntity<Booking> viewBooking(@PathVariable long bookingId) {
		Booking booking=service.viewBookingByBookingId(bookingId);
		
		if(!service.validateBookingId(bookingId)) {
			return new ResponseEntity<Booking>(HttpStatus.NOT_FOUND);
			}
		else
			return new ResponseEntity<Booking>(booking,HttpStatus.OK);
		
	}
	
	
	@GetMapping("/all")
	public ResponseEntity<List<Booking>> getAllBooking(){
		List<Booking> all= service.viewAllBookings();
		return new ResponseEntity<List<Booking>>(all, HttpStatus.OK);	
	}
	
	@PostMapping("/add")
	public ResponseEntity<Booking> addBooking(@RequestBody Booking booking) {
		
	      booking=service.addBooking(booking); 
	      if(booking == null) 
	    	  return new ResponseEntity<Booking>(HttpStatus.BAD_REQUEST);
				
			else 
				return new ResponseEntity<Booking>(booking,HttpStatus.OK);	      
		
	}

	@PutMapping("/modify")
	public ResponseEntity<Booking> modifyBooking(Booking booking) {
		booking=service.modifyBooking(booking);
		return new ResponseEntity<Booking>(booking, HttpStatus.OK);
	} 
	
	@DeleteMapping("/delete/{bookingId}")
	public ResponseEntity<Booking> deleteBooking(@PathVariable long bookingId) {

		if(service.validateBookingId(bookingId)) {
		   
			if(!service.deleteBooking(bookingId)) {return new ResponseEntity<Booking>(HttpStatus.NOT_FOUND); }
			else {return new ResponseEntity<Booking>(HttpStatus.OK);}
		 
		}
		return new ResponseEntity<Booking>(HttpStatus.NOT_FOUND);
	}
	
}
