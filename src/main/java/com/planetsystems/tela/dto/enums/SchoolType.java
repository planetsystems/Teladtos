package com.planetsystems.tela.dto.enums;

public enum SchoolType {
  
	BOARDING("Boarding"), DAY("Day"), BOTH("Both");

	private String type;

	SchoolType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public static SchoolType getSchoolType(String type) {
		for (SchoolType schoolType : SchoolType.values()) {
			if (schoolType.getType().equalsIgnoreCase(type)) {
				return schoolType;
			}
		}
		return null;
	}


}