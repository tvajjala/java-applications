package com.tvajjala.domain;

import javax.persistence.Embeddable;

@Embeddable
public class CAddress {

    private String city;

    private String state;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

}
