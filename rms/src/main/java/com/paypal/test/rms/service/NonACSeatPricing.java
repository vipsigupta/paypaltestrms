package com.paypal.test.rms.service;

import org.springframework.stereotype.Service;

import com.paypal.test.rms.config.SeatType;
import com.paypal.test.rms.config.TrainType;
import com.paypal.test.rms.dto.BookingInfo;
import com.paypal.test.rms.entities.Coach;

@Service
public class NonACSeatPricing extends Pricing{
    @Override
    public boolean validFor(Coach coach, TrainType train, SeatType seatType) {
        // TODO Auto-generated method stub
        return false;
    }
    
    @Override
    public Double calculatePricing(BookingInfo info) {
        // TODO Auto-generated method stub
        return null;
    }
}
