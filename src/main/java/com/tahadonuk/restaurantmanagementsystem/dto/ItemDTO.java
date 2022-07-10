package com.tahadonuk.restaurantmanagementsystem.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ItemDTO {
    private String name;
    private String description;
    private String type;
    private double price;
    private int stock;
    @JsonProperty
    private boolean isStockRequired;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public boolean isStockRequired() {
		return isStockRequired;
	}
	public void setStockRequired(boolean isStockRequired) {
		this.isStockRequired = isStockRequired;
	}
	public ItemDTO(String name, String description, String type, double price, int stock, boolean isStockRequired) {
		super();
		this.name = name;
		this.description = description;
		this.type = type;
		this.price = price;
		this.stock = stock;
		this.isStockRequired = isStockRequired;
	}
	public ItemDTO() {
		super();
	}
    
	
    
}
