package com.tahadonuk.restaurantmanagementsystem.data.entity;

import com.sun.istack.NotNull;
import com.tahadonuk.restaurantmanagementsystem.data.TableStatus;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mesas")
@Data
public class RestaurantTable {
    @NotNull
    @Id
    @Column(name = "TABLE_ID")
    private long tableId;

    @Column(name = "TABLE_CAPACITY")
    private int capacity;

    @Column(name = "TABLE_STATUS")
    private TableStatus status;

	public long getTableId() {
		return tableId;
	}

	public void setTableId(long tableId) {
		this.tableId = tableId;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public TableStatus getStatus() {
		return status;
	}

	public void setStatus(TableStatus status) {
		this.status = status;
	}

	public RestaurantTable(long tableId, int capacity, TableStatus status) {
		super();
		this.tableId = tableId;
		this.capacity = capacity;
		this.status = status;
	}

	public RestaurantTable() {
		super();
	}
    
    
}
