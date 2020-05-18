
package com.cpg.fms.Booking.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.cpg.fms.Booking.Exceptions.BookingIdNotFoundException;


public class BookingIdNotFoundException extends RuntimeException {

	public BookingIdNotFoundException(String message) {
		super(message);
	}
	}

