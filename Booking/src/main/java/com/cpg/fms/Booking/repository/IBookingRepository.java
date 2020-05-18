package com.cpg.fms.Booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cpg.fms.Booking.model.Booking;
@Repository
public interface IBookingRepository extends JpaRepository<Booking, Long>{

	
}