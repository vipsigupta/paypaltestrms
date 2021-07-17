package com.paypal.test.rms.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.paypal.test.rms.dto.BookingInfo;
import com.paypal.test.rms.service.TrainBookingService;

@RestController
public class RMSControllerV1 {

    @Autowired
    private TrainBookingService bookingService;
    
    @RequestMapping(value = "/ping", method = RequestMethod.GET)
    public String ping() {
        return "Hello World";
    }
    
    @RequestMapping(value = "/book", method = RequestMethod.GET)
    public String book(@RequestParam(name = "source") String source,
        @RequestParam(name = "destination") String destination,@RequestParam(name = "date")String date,@RequestParam(name = "personname") String name) {
        String reservationId = bookingService.bookTrain(source,destination,date,name);
        return reservationId;
    }
    
    @RequestMapping(value = "/getReservationInfo", method = RequestMethod.GET)
    public BookingInfo book(@RequestParam(name = "reservationId") String reservationId) {
        BookingInfo info = bookingService.getReservationInfo(reservationId);
        return info;
    }
    
}

