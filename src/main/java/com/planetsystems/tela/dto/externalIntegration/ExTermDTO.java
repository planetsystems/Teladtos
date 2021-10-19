package com.planetsystems.tela.dto.externalIntegration;

import java.io.Serializable;

public class ExTermDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String code;
	private String name;
	private String startDate;
	private String endDate;
	private String yearCode;

	public ExTermDTO() {

	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getYearCode() {
		return yearCode;
	}

	public void setYearCode(String yearCode) {
		this.yearCode = yearCode;
	}

}
