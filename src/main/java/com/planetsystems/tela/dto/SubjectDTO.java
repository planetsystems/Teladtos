package com.planetsystems.tela.dto;

public class SubjectDTO extends  ParentDTO {
    private String code;
    private String name;
    private SubjectCategoryDTO subjectCategory;

    public SubjectDTO() {
    }

    public SubjectDTO(String id) {
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

    public SubjectCategoryDTO getSubjectCategory() {
        return subjectCategory;
    }

    public void setSubjectCategory(SubjectCategoryDTO subjectCategory) {
        this.subjectCategory = subjectCategory;
    }

    @Override
    public String toString() {
        return "SubjectDTO{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", subjectCategory=" + subjectCategory +
                '}';
    }
}
