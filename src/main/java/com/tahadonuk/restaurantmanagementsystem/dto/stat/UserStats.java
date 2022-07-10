package com.tahadonuk.restaurantmanagementsystem.dto.stat;

import lombok.Data;

@Data
public class UserStats extends Stats{
    private int userCount;
    private int employeeCount;
    private int managerCount;
    private int adminCount;

    public double getUserPercent() {
        double percent = ((double) userCount / (double) getTotalCount()) * 100;

        return percent;
    }

    public double getEmployeePercent() {
        double percent = ((double) employeeCount / (double) getTotalCount()) * 100;

        return percent;
    }

    public double getManagerPercent() {
        double percent = ((double) managerCount / (double) getTotalCount()) * 100;

        return percent;
    }

    public double getAdminPercent() {
        double percent = ((double) adminCount / (double) getTotalCount()) * 100;

        return percent;
    }

	public int getUserCount() {
		return userCount;
	}

	public void setUserCount(int userCount) {
		this.userCount = userCount;
	}

	public int getEmployeeCount() {
		return employeeCount;
	}

	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
	}

	public int getManagerCount() {
		return managerCount;
	}

	public void setManagerCount(int managerCount) {
		this.managerCount = managerCount;
	}

	public int getAdminCount() {
		return adminCount;
	}

	public void setAdminCount(int adminCount) {
		this.adminCount = adminCount;
	}

	public UserStats(int userCount, int employeeCount, int managerCount, int adminCount) {
		super();
		this.userCount = userCount;
		this.employeeCount = employeeCount;
		this.managerCount = managerCount;
		this.adminCount = adminCount;
	}

	public UserStats() {
		super();
	}
    
    
}
