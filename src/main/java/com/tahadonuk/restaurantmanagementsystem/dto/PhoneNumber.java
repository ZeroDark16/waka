package com.tahadonuk.restaurantmanagementsystem.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Data
@Embeddable
@AllArgsConstructor
@NoArgsConstructor
public class PhoneNumber {
    private String title;
    private String number;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public PhoneNumber(String title, String number) {
		super();
		this.title = title;
		this.number = number;
	}
	public PhoneNumber() {
		super();
	}
	
	
    
    
}
