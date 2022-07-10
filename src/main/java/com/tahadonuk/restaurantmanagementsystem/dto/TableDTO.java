package com.tahadonuk.restaurantmanagementsystem.dto;

import lombok.Data;

@Data
public class TableDTO {
    private long tableId;

    private int capacity;

    private String status;

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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public TableDTO(long tableId, int capacity, String status) {
		super();
		this.tableId = tableId;
		this.capacity = capacity;
		this.status = status;
	}
    
	public TableDTO() {}
}
