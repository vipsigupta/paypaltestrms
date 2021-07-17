package com.paypal.test.rms.entities;

import java.util.List;

public abstract class Coach {
    
    private int id;
    
    private List<TrainSeatReservation> seats;

    public List<TrainSeatReservation> getSeats() {
        return seats;
    }

    public void setSeats(List<TrainSeatReservation> seats) {
        this.seats = seats;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
}
