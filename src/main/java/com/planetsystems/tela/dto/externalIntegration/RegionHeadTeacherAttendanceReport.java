package com.planetsystems.tela.dto.externalIntegration;

import java.io.Serializable;

public class RegionHeadTeacherAttendanceReport implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int numberOfTimesPresent;
	private String term;
	private String year;
	private String region;
	
	public RegionHeadTeacherAttendanceReport() {
		
	}

	public int getNumberOfTimesPresent() {
		return numberOfTimesPresent;
	}

	public void setNumberOfTimesPresent(int numberOfTimesPresent) {
		this.numberOfTimesPresent = numberOfTimesPresent;
	}

	public String getTerm() {
		return term;
	}

	public void setTerm(String term) {
		this.term = term;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}
	
	

}
