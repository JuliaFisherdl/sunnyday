package com.detroitlabs.sunnyday.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Temperature {
    double temp;
    int humidity;

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }


    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }


}
