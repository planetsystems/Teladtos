package com.planetsystems.tela.dto;

public class SchoolCategoryDTO extends ParentDTO {
    private String code;
    private String name;

    public SchoolCategoryDTO() {
    }

    public SchoolCategoryDTO(String id) {
        super(id);
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

    @Override
    public String toString() {
        return "SchoolCategoryDTO{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
