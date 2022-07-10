package com.tahadonuk.restaurantmanagementsystem.dto;

import com.tahadonuk.restaurantmanagementsystem.data.entity.Product;
import lombok.Data;

@Data
public class OrderItemDTO {
    private Product product;
    private int quantity;
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public OrderItemDTO(Product product, int quantity) {
		super();
		this.product = product;
		this.quantity = quantity;
	}
    
	
    
}
