package com.microservicesrest.microservices.limitsservice.pojos;

public class Limits {

    public Integer minimum;
    public Integer maximum;


    //Contructors

    public Limits() {
    }

    public Limits(Integer minimum, Integer maximum) {
        this.minimum = minimum;
        this.maximum = maximum;
    }

    //Getters and Setters
    public Integer getMinimum() {
        return minimum;
    }

    public void setMinimum(Integer minimum) {
        this.minimum = minimum;
    }

    public Integer getMaximum() {
        return maximum;
    }

    public void setMaximum(Integer maximum) {
        this.maximum = maximum;
    }
}
