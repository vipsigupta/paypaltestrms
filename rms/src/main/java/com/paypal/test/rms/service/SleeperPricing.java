package com.paypal.test.rms.service;

import com.paypal.test.rms.config.SeatType;
import com.paypal.test.rms.config.TrainType;
import com.paypal.test.rms.dto.BookingInfo;
import com.paypal.test.rms.entities.Coach;

public class SleeperPricing extends Pricing{
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
