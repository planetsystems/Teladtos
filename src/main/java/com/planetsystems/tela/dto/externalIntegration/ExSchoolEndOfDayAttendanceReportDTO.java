package com.planetsystems.tela.dto.externalIntegration;

import java.io.Serializable;

@SuppressWarnings("serial")
public class ExSchoolEndOfDayAttendanceReportDTO implements Serializable {

	private String staffName;
	private String staffCode;
	private String clockInDay;
	private String clockInDate;
	private String clockInTime;
	private String clockOutTime;

	private double totalWorkHours;
	private double expectedHours;
	private double percentage;
	private double balance;

	public ExSchoolEndOfDayAttendanceReportDTO() {

	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public String getStaffCode() {
		return staffCode;
	}

	public void setStaffCode(String staffCode) {
		this.staffCode = staffCode;
	}

	public String getClockInDay() {
		return clockInDay;
	}

	public void setClockInDay(String clockInDay) {
		this.clockInDay = clockInDay;
	}

	public String getClockInDate() {
		return clockInDate;
	}

	public void setClockInDate(String clockInDate) {
		this.clockInDate = clockInDate;
	}

	public String getClockInTime() {
		return clockInTime;
	}

	public void setClockInTime(String clockInTime) {
		this.clockInTime = clockInTime;
	}

	public String getClockOutTime() {
		return clockOutTime;
	}

	public void setClockOutTime(String clockOutTime) {
		this.clockOutTime = clockOutTime;
	}

	public double getTotalWorkHours() {
		return totalWorkHours;
	}

	public void setTotalWorkHours(double totalWorkHours) {
		this.totalWorkHours = totalWorkHours;
	}

	public double getExpectedHours() {
		return expectedHours;
	}

	public void setExpectedHours(double expectedHours) {
		this.expectedHours = expectedHours;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
