package com.tahadonuk.restaurantmanagementsystem.data.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "orden_plato")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ITEM_ID")
    private long itemId;

    @ManyToOne
    private Product product;

    @ManyToOne
    private Order order;

    @Column(name = "QUANTITY")
    private int quantity;

	public long getItemId() {
		return itemId;
	}

	public void setItemId(long itemId) {
		this.itemId = itemId;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Item(long itemId, Product product, Order order, int quantity) {
		super();
		this.itemId = itemId;
		this.product = product;
		this.order = order;
		this.quantity = quantity;
	}

	public Item() {
		super();
	}

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", product=" + product + ", order=" + order + ", quantity=" + quantity + "]";
	}
	
	
    
    
}
