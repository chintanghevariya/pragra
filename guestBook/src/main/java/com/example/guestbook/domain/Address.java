package com.example.guestbook.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Address {
    private int addressId;
    private String city;
    private String postalCode;

    public Address(int addressId, String city, String postalCode) {
        this.addressId = addressId;
        this.city = city;
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return  ", city='" + city;
    }
}
