package com.paypal.test.rms.entities;

import java.util.List;

import com.paypal.test.rms.config.TrainType;

public class Train {
    
    private Integer id;
    private Integer source;
    private Integer destination;
    private List<Integer> path;
    private TrainLayout layout;
    private TrainType type;
    
    public Integer getSource() {
        return source;
    }
    public void setSource(Integer source) {
        this.source = source;
    }
    public Integer getDestination() {
        return destination;
    }
    public void setDestination(Integer destination) {
        this.destination = destination;
    }
    public List<Integer> getPath() {
        return path;
    }
    public void setPath(List<Integer> path) {
        this.path = path;
    }
    public TrainLayout getLayout() {
        return layout;
    }
    public void setLayout(TrainLayout layout) {
        this.layout = layout;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public TrainType getType() {
        return type;
    }
    public void setType(TrainType type) {
        this.type = type;
    }
    
}
