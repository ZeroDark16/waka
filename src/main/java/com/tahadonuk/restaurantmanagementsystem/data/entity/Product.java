package com.tahadonuk.restaurantmanagementsystem.data.entity;

import com.tahadonuk.restaurantmanagementsystem.data.ItemType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "platos")
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PRODUCT_ID")
    private long productId;

    @Column(name = "PRODUCT_NAME")
    private String name;

    @Column(name = "PRODUCT_DESCRIPTION")
    private String description;

    @Column(name = "STOCK")
    private int stock = 0;

    @Column(name = "PRODUCT_PRICE")
    private double price;

    @Column(name = "PRODUCT_TYPE")
    private ItemType itemType;

    @Column(name = "STOCK_REQUIRED")
    private boolean isStockRequired = false;

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

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

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public ItemType getItemType() {
		return itemType;
	}

	public void setItemType(ItemType itemType) {
		this.itemType = itemType;
	}

	public boolean isStockRequired() {
		return isStockRequired;
	}

	public void setStockRequired(boolean isStockRequired) {
		this.isStockRequired = isStockRequired;
	}

	public Product(long productId, String name, String description, int stock, double price, ItemType itemType,
			boolean isStockRequired) {
		super();
		this.productId = productId;
		this.name = name;
		this.description = description;
		this.stock = stock;
		this.price = price;
		this.itemType = itemType;
		this.isStockRequired = isStockRequired;
	}

	public Product() {
		super();
	}

	}
    
    

