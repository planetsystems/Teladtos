package com.planetsystems.tela.dto.reports.outputs;

import java.io.Serializable;
import java.util.List;

public class SchoolEndWeekTimeOnSiteReport implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String academicYear;
	private String school;
	private String district;
	private String term;
	private String month;

	private String fromDate;
	private String toDate;
	private String ot; // overall total

	private List<SchoolEndWeekTimeOnSiteReportInput> mrow_inputs;

	public SchoolEndWeekTimeOnSiteReport() {

	}

	public String getAcademicYear() {
		return academicYear;
	}

	public void setAcademicYear(String academicYear) {
		this.academicYear = academicYear;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getTerm() {
		return term;
	}

	public void setTerm(String term) {
		this.term = term;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getFromDate() {
		return fromDate;
	}

	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}

	public String getToDate() {
		return toDate;
	}

	public void setToDate(String toDate) {
		this.toDate = toDate;
	}

	public List<SchoolEndWeekTimeOnSiteReportInput> getMrow_inputs() {
		return mrow_inputs;
	}

	public void setMrow_inputs(List<SchoolEndWeekTimeOnSiteReportInput> mrow_inputs) {
		this.mrow_inputs = mrow_inputs;
	}

	public String getOt() {
		return ot;
	}

	public void setOt(String ot) {
		this.ot = ot;
	}

}
