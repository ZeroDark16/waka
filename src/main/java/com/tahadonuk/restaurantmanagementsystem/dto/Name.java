package com.tahadonuk.restaurantmanagementsystem.dto;

import lombok.Data;

import javax.persistence.Embeddable;

@Data
@Embeddable
public class Name {
    String firstName;
    String lastName;

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Name() {}

    @Override
    public String toString() {
        return firstName+" "+lastName;
    }

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

    
}
