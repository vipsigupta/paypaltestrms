package com.paypal.test.rms.dto;

public class BookingInfo {
    private Integer trainId;
    private Integer coachId;
    private Integer seatId;
    private Double price;
    public Integer getTrainId() {
        return trainId;
    }
    public void setTrainId(Integer trainId) {
        this.trainId = trainId;
    }
    public Integer getCoachId() {
        return coachId;
    }
    public void setCoachId(Integer coachId) {
        this.coachId = coachId;
    }
    public Integer getSeatId() {
        return seatId;
    }
    public void setSeatId(Integer seatId) {
        this.seatId = seatId;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    
    
}
