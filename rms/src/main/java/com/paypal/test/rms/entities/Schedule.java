package com.paypal.test.rms.entities;

import java.util.Date;

public class Schedule {
    private Train train;
    private Date date;
    public Train getTrain() {
        return train;
    }
    public void setTrain(Train train) {
        this.train = train;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    
    
}
