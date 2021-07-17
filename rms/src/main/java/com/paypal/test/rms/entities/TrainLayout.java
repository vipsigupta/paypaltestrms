package com.paypal.test.rms.entities;

import java.util.List;

public abstract class TrainLayout {
    private List<Coach> coaches;

    public List<Coach> getCoaches() {
        return coaches;
    }

    public void setCoaches(List<Coach> coaches) {
        this.coaches = coaches;
    }
    
    
}
