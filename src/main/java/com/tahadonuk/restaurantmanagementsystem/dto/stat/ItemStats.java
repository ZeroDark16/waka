package com.tahadonuk.restaurantmanagementsystem.dto.stat;

import lombok.Data;

@Data
public class ItemStats extends Stats{
    private int beverageCount;
    private int totalBeverageStocks;

    private int mealCount;
    private int totalMealStocks;

    private int dessertCount;
    private int totalDessertStocks;

    public double getBeveragePercent() {
        double percent = ((double) beverageCount / (double) getTotalCount()) * 100;

        return percent;
    }
    public double getMealPercent() {
        double percent = ((double) mealCount / (double) getTotalCount()) * 100;

        return percent;
    }
    public double getDessertPercent() {
        double percent = ((double) dessertCount / (double) getTotalCount()) * 100;

        return percent;
    }

    public double getTotalStocks() {
        int stocks = totalBeverageStocks + totalDessertStocks + totalMealStocks;
        return stocks;
    }
	public int getBeverageCount() {
		return beverageCount;
	}
	public void setBeverageCount(int beverageCount) {
		this.beverageCount = beverageCount;
	}
	public int getTotalBeverageStocks() {
		return totalBeverageStocks;
	}
	public void setTotalBeverageStocks(int totalBeverageStocks) {
		this.totalBeverageStocks = totalBeverageStocks;
	}
	public int getMealCount() {
		return mealCount;
	}
	public void setMealCount(int mealCount) {
		this.mealCount = mealCount;
	}
	public int getTotalMealStocks() {
		return totalMealStocks;
	}
	public void setTotalMealStocks(int totalMealStocks) {
		this.totalMealStocks = totalMealStocks;
	}
	public int getDessertCount() {
		return dessertCount;
	}
	public void setDessertCount(int dessertCount) {
		this.dessertCount = dessertCount;
	}
	public int getTotalDessertStocks() {
		return totalDessertStocks;
	}
	public void setTotalDessertStocks(int totalDessertStocks) {
		this.totalDessertStocks = totalDessertStocks;
	}
	public ItemStats(int beverageCount, int totalBeverageStocks, int mealCount, int totalMealStocks, int dessertCount,
			int totalDessertStocks) {
		super();
		this.beverageCount = beverageCount;
		this.totalBeverageStocks = totalBeverageStocks;
		this.mealCount = mealCount;
		this.totalMealStocks = totalMealStocks;
		this.dessertCount = dessertCount;
		this.totalDessertStocks = totalDessertStocks;
	}
	public ItemStats() {
		super();
	}
    
    
}
