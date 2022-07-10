package com.tahadonuk.restaurantmanagementsystem.dto;

import com.tahadonuk.restaurantmanagementsystem.data.entity.RestaurantTable;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class OrderDTO {
    private List<OrderItemDTO> items;
    private double totalPrice;
    private RestaurantTable table;
    private Date orderDate;
	public OrderDTO(List<OrderItemDTO> items, double totalPrice, RestaurantTable table, Date orderDate) {
		super();
		this.items = items;
		this.totalPrice = totalPrice;
		this.table = table;
		this.orderDate = orderDate;
	}
	public List<OrderItemDTO> getItems() {
		return items;
	}
	public void setItems(List<OrderItemDTO> items) {
		this.items = items;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public RestaurantTable getTable() {
		return table;
	}
	public void setTable(RestaurantTable table) {
		this.table = table;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
    
    
}
