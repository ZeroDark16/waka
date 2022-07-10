package com.tahadonuk.restaurantmanagementsystem.dto.stat;

import lombok.Data;

@Data
public abstract class Stats {
    private long totalCount;

	public long getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(long totalCount) {
		this.totalCount = totalCount;
	}
    
    
}
