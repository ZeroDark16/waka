package com.tahadonuk.restaurantmanagementsystem.dto;

import lombok.Data;

import javax.persistence.Embeddable;

@Embeddable
@Data
public class Address {
    private String addressLine;
    private String details;

    public Address(String addressLine, String details) {
        this.addressLine = addressLine;
        this.details = details;
    }

    public Address() {

    }

	public String getAddressLine() {
		return addressLine;
	}

	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}
    
    
}

