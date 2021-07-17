package com.paypal.test.rms.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.paypal.test.rms.dto.BookingInfo;

@Repository
public class BookingRepo {
    static Map<String,BookingInfo> bookingStatus  = new HashMap<String, BookingInfo>();
    public boolean bookTicket(String reservationId,BookingInfo bookingInfo) {
        bookingStatus.put(reservationId,bookingInfo);
        return true;
    }
    public BookingInfo getbooking(String reservationId) {
        return bookingStatus.get(reservationId);
    }
}
