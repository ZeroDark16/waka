package com.tahadonuk.restaurantmanagementsystem.dto.stat;

import lombok.Data;

@Data
public class OrderStats extends Stats{
    private long orderCountToday;
    private long orderCountYesterday;
    private long orderCountCurrentWeek;
    private long orderCountLastWeek;
    private long orderCountLastMonth;
    private long orderCountCurrentMonth;
    private double cashToday;
    private double cashYesterday;
    private double cashCurrentWeek;
    private double cashCurrentMonth;
    private double cashLastWeek;
    private double cashLastMonth;

    public String getTodayPercentToYesterday() {
        if(orderCountYesterday == 0) return "+0%";

        double percent = ((double) (orderCountToday - orderCountYesterday) /  (double) orderCountYesterday) * 100;
        if(percent >= 0) {
            return "+" + String.format("%.2f",percent) + "%";
        } else {
            return String.format("%.2f", percent) + "%";
        }
    }

    public String getCurrentWeekRatioToCurrentMonth() {
        double percent = ((double) (orderCountCurrentWeek) /  (double) orderCountCurrentMonth) * 100;

        return String.format("%.2f", percent) + "%";
    }

    public String getLastWeekRatioToCurrentMonth() {
        double percent = ((double) (orderCountLastWeek) /  (double) orderCountCurrentMonth) * 100;

        return String.format("%.2f"+"%", percent);
    }

    public String getCurrentWeekRatioToLastWeek() {
        if(orderCountLastWeek == 0) return "+0%";

        double percent = ((double) (orderCountCurrentWeek - orderCountLastWeek) /  (double) orderCountLastWeek) * 100;
        if(percent >= 0) {
            return "+" + String.format("%.2f",percent) + "%";
        } else {
            return String.format("%.2f", percent) + "%";
        }
    }

    public String getCurrentMonthRatioToLastMonth() {
        if(orderCountLastMonth == 0) return "+0%";

        double percent = ((double) (orderCountCurrentMonth - orderCountLastMonth) /  (double) orderCountLastMonth) * 100;
        if(percent >= 0) {
            return "+" + String.format("%.2f",percent) + "%";
        } else {
            return String.format("%.2f", percent) + "%";
        }
    }

	public long getOrderCountToday() {
		return orderCountToday;
	}

	public void setOrderCountToday(long orderCountToday) {
		this.orderCountToday = orderCountToday;
	}

	public long getOrderCountYesterday() {
		return orderCountYesterday;
	}

	public void setOrderCountYesterday(long orderCountYesterday) {
		this.orderCountYesterday = orderCountYesterday;
	}

	public long getOrderCountCurrentWeek() {
		return orderCountCurrentWeek;
	}

	public void setOrderCountCurrentWeek(long orderCountCurrentWeek) {
		this.orderCountCurrentWeek = orderCountCurrentWeek;
	}

	public long getOrderCountLastWeek() {
		return orderCountLastWeek;
	}

	public void setOrderCountLastWeek(long orderCountLastWeek) {
		this.orderCountLastWeek = orderCountLastWeek;
	}

	public long getOrderCountLastMonth() {
		return orderCountLastMonth;
	}

	public void setOrderCountLastMonth(long orderCountLastMonth) {
		this.orderCountLastMonth = orderCountLastMonth;
	}

	public long getOrderCountCurrentMonth() {
		return orderCountCurrentMonth;
	}

	public void setOrderCountCurrentMonth(long orderCountCurrentMonth) {
		this.orderCountCurrentMonth = orderCountCurrentMonth;
	}

	public double getCashToday() {
		return cashToday;
	}

	public void setCashToday(double cashToday) {
		this.cashToday = cashToday;
	}

	public double getCashYesterday() {
		return cashYesterday;
	}

	public void setCashYesterday(double cashYesterday) {
		this.cashYesterday = cashYesterday;
	}

	public double getCashCurrentWeek() {
		return cashCurrentWeek;
	}

	public void setCashCurrentWeek(double cashCurrentWeek) {
		this.cashCurrentWeek = cashCurrentWeek;
	}

	public double getCashCurrentMonth() {
		return cashCurrentMonth;
	}

	public void setCashCurrentMonth(double cashCurrentMonth) {
		this.cashCurrentMonth = cashCurrentMonth;
	}

	public double getCashLastWeek() {
		return cashLastWeek;
	}

	public void setCashLastWeek(double cashLastWeek) {
		this.cashLastWeek = cashLastWeek;
	}

	public double getCashLastMonth() {
		return cashLastMonth;
	}

	public void setCashLastMonth(double cashLastMonth) {
		this.cashLastMonth = cashLastMonth;
	}

	public OrderStats(long orderCountToday, long orderCountYesterday, long orderCountCurrentWeek,
			long orderCountLastWeek, long orderCountLastMonth, long orderCountCurrentMonth, double cashToday,
			double cashYesterday, double cashCurrentWeek, double cashCurrentMonth, double cashLastWeek,
			double cashLastMonth) {
		super();
		this.orderCountToday = orderCountToday;
		this.orderCountYesterday = orderCountYesterday;
		this.orderCountCurrentWeek = orderCountCurrentWeek;
		this.orderCountLastWeek = orderCountLastWeek;
		this.orderCountLastMonth = orderCountLastMonth;
		this.orderCountCurrentMonth = orderCountCurrentMonth;
		this.cashToday = cashToday;
		this.cashYesterday = cashYesterday;
		this.cashCurrentWeek = cashCurrentWeek;
		this.cashCurrentMonth = cashCurrentMonth;
		this.cashLastWeek = cashLastWeek;
		this.cashLastMonth = cashLastMonth;
	}

	public OrderStats() {
		super();
	}
    
    
}
