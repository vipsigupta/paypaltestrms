package com.paypal.test.rms.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.paypal.test.rms.dto.BookingInfo;
import com.paypal.test.rms.entities.Schedule;
import com.paypal.test.rms.entities.Train;

@Repository
public abstract class TrainRepo {
    static List<Schedule> trains = new ArrayList<Schedule>();
    
    public abstract Train getTrain(String source,String des,Date date);
    
    public abstract BookingInfo bookTrain(Integer id);
}
