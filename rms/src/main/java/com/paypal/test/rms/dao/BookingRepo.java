package com.paypal.test.rms.dao;

import org.springframework.stereotype.Repository;

import com.paypal.test.rms.dto.ReservationInfo;
import com.paypal.test.rms.entities.Train;

@Repository
public abstract class BookingRepo {
    public abstract boolean bookTicket(Train train,String reservationId,String name,Double price);
    public abstract ReservationInfo getbooking(String reservationId);
}
