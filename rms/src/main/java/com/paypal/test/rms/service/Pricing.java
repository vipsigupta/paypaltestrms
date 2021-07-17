package com.paypal.test.rms.service;

import org.springframework.stereotype.Service;

import com.paypal.test.rms.config.SeatType;
import com.paypal.test.rms.config.TrainType;
import com.paypal.test.rms.dto.BookingInfo;
import com.paypal.test.rms.entities.Coach;

@Service
public abstract class Pricing {
    public abstract boolean validFor(Coach coach,TrainType train,SeatType seatType);
    public abstract Double calculatePricing(BookingInfo info);
}
