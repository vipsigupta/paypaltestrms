package com.paypal.test.rms.entities;

import java.util.List;

import com.paypal.test.rms.config.TrainType;

public class Train {
    
    private Integer id;
    private Destination source;
    private Destination destination;
    private List<Destination> path;
    private TrainLayout layout;
    private TrainType type;
    
    public Destination getSource() {
        return source;
    }
    public void setSource(Destination source) {
        this.source = source;
    }
    public Destination getDestination() {
        return destination;
    }
    public void setDestination(Destination destination) {
        this.destination = destination;
    }
    public List<Destination> getPath() {
        return path;
    }
    public void setPath(List<Destination> path) {
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
