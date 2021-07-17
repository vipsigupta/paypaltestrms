package com.paypal.test.rms.entities;

import com.paypal.test.rms.config.SeatType;

public class TrainSeatReservation {
    private SeatType seat;
    private boolean isbooked;
    private int seatId;
    private int bookSourceId;
    private int bookDestinationId;
    public SeatType getSeat() {
        return seat;
    }
    public void setSeat(SeatType seat) {
        this.seat = seat;
    }
    public boolean isIsbooked() {
        return isbooked;
    }
    public void setIsbooked(boolean isbooked) {
        this.isbooked = isbooked;
    }
    public int getSeatId() {
        return seatId;
    }
    public void setSeatId(int seatId) {
        this.seatId = seatId;
    }
    public int getBookSourceId() {
        return bookSourceId;
    }
    public void setBookSourceId(int bookSourceId) {
        this.bookSourceId = bookSourceId;
    }
    public int getBookDestinationId() {
        return bookDestinationId;
    }
    public void setBookDestinationId(int bookDestinationId) {
        this.bookDestinationId = bookDestinationId;
    }
    
    
}
