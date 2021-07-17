package com.paypal.test.rms.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paypal.test.rms.dao.BookingRepo;
import com.paypal.test.rms.dao.TrainRepo;
import com.paypal.test.rms.dto.BookingInfo;
import com.paypal.test.rms.dto.ReservationInfo;
import com.paypal.test.rms.entities.Train;


@Service
public class TrainBookingService {

    @Autowired
    private TrainRepo trainRepo;
    
    @Autowired
    private BookingRepo bookingRepo;
    
    @Autowired
    Pricing pricing; 
    
    public String bookTrain(String source, String destination, Date date, String name) {
        String reservation  = "";
        Train train = trainRepo.getTrain(source, destination, date);
        if(train!=null) {
           BookingInfo bookingInfo =  trainRepo.bookTrain(train.getId());
           
           if(bookingInfo!=null) {
                reservation = randomNumber();
                Double price = pricing.calculatePricing(bookingInfo);
                bookingRepo.bookTicket(train, reservation, name, price);
           }
        }
       return reservation; 
    }
    
    public ReservationInfo getReservationInfo(String reservationId) {
        return bookingRepo.getbooking(reservationId);
    }
    
    private String randomNumber() {
        String text = "";
        String possible = "123456789";
        for (int i = 0; i < 10; i++) {
          Integer sup = (int)Math.round(Math.floor(Math.random() * 9));
          text += i > 0 && sup == i ? "0" : possible.charAt(sup);
        }
        return text;
      }
    
    

    
}
