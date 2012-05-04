package com.zenika.blog.gwt.editor.shared;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Address implements Serializable {

    private String street;

    private String zipCode;

    private String city;

    private String country;

    public String getStreet() {
        return street;
    }

    public void setStreet(final String street) {
        this.street = street;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(final String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(final String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(final String country) {
        this.country = country;
    }
}
