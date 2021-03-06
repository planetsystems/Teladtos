package com.planetsystems.tela.dto.AppDTO;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AppFeedBack implements Serializable {

	private static final long serialVersionUID = 1L;

	private boolean response; 
	private String message;

	private List<SyncTeacher> teachers;

	private SyncSchoolDTO school;

	private List<SyncTimetable> timetables;

	private List<SyncSchoolClassDTO> schoolClasses;

	private SyncTeacher teacher;

	private SyncTimetable syncTimetable;

	private AcademicTermDTO academicTermDTO;

	private SyncSchoolClassDTO schoolClass;
	
	

	public AppFeedBack() {

	}

	public boolean isResponse() {
		return response;
	}

	public void setResponse(boolean response) {
		this.response = response;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<SyncTeacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(List<SyncTeacher> teachers) {
		this.teachers = teachers;
	}

	public SyncSchoolDTO getSchool() {
		return school;
	}

	public void setSchool(SyncSchoolDTO school) {
		this.school = school;
	}

	public List<SyncTimetable> getTimetables() {
		return timetables;
	}

	public void setTimetables(List<SyncTimetable> timetables) {
		this.timetables = timetables;
	}

	public List<SyncSchoolClassDTO> getSchoolClasses() {
		return schoolClasses;
	}

	public void setSchoolClasses(List<SyncSchoolClassDTO> schoolClasses) {
		this.schoolClasses = schoolClasses;
	}

	public SyncTeacher getTeacher() {
		return teacher;
	}

	public void setTeacher(SyncTeacher teacher) {
		this.teacher = teacher;
	}

	public SyncTimetable getSyncTimetable() {
		return syncTimetable;
	}

	public void setSyncTimetable(SyncTimetable syncTimetable) {
		this.syncTimetable = syncTimetable;
	}

	public AcademicTermDTO getAcademicTermDTO() {
		return academicTermDTO;
	}

	public void setAcademicTermDTO(AcademicTermDTO academicTermDTO) {
		this.academicTermDTO = academicTermDTO;
	}

	public SyncSchoolClassDTO getSchoolClass() {
		return schoolClass;
	}

	public void setSchoolClass(SyncSchoolClassDTO schoolClass) {
		this.schoolClass = schoolClass;
	}

}
