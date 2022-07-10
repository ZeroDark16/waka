package com.tahadonuk.restaurantmanagementsystem.dto.stat;

import lombok.Data;

@Data
public class TableStats extends Stats{
    private int fullCount;
    private int availableCount;
    private int outOfServiceCount;

    public double getAvailablePercent() {
        double percent = ( (double) this.availableCount /  (double) getTotalCount()) * 100;

        return percent;
    }

    public double getOutOfServicePercent() {
        double percent = ( (double) this.outOfServiceCount /  (double) getTotalCount()) * 100;

        return percent;
    }

    public double getFullPercent() {
        double percent = ( (double) this.fullCount /  (double) getTotalCount()) * 100;

        return percent;
    }

	public int getFullCount() {
		return fullCount;
	}

	public void setFullCount(int fullCount) {
		this.fullCount = fullCount;
	}

	public int getAvailableCount() {
		return availableCount;
	}

	public void setAvailableCount(int availableCount) {
		this.availableCount = availableCount;
	}

	public int getOutOfServiceCount() {
		return outOfServiceCount;
	}

	public void setOutOfServiceCount(int outOfServiceCount) {
		this.outOfServiceCount = outOfServiceCount;
	}

	public TableStats(int fullCount, int availableCount, int outOfServiceCount) {
		super();
		this.fullCount = fullCount;
		this.availableCount = availableCount;
		this.outOfServiceCount = outOfServiceCount;
	}

	public TableStats() {
		super();
	}
    
    
}
