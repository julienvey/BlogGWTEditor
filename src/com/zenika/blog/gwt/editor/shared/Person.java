package com.zenika.blog.gwt.editor.shared;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Person implements Serializable {

    private String firstName;

    private String lastName;

    private String phoneNumber;

    private Address address;

    private String company;

    private String hiddenField;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(final String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(final Address address) {
        this.address = address;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(final String company) {
        this.company = company;
    }

    public String getHiddenField() {
        return hiddenField;
    }

    public void setHiddenField(final String hiddenField) {
        this.hiddenField = hiddenField;
    }
}
