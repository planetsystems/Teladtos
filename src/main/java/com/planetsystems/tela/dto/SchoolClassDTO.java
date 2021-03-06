package com.planetsystems.tela.dto;

public class SchoolClassDTO extends ParentDTO {
    private String code;
    private String name;
    private SchoolDTO schoolDTO;
    private AcademicTermDTO  academicTermDTO;
 

    public SchoolClassDTO() {
    }

    public SchoolClassDTO(String id) {
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

    public SchoolDTO getSchoolDTO() {
        return schoolDTO;
    }

    public void setSchoolDTO(SchoolDTO schoolDTO) {
        this.schoolDTO = schoolDTO;
    }

    public AcademicTermDTO getAcademicTermDTO() {
        return academicTermDTO;
    }

    public void setAcademicTermDTO(AcademicTermDTO academicTermDTO) {
        this.academicTermDTO = academicTermDTO;
    }


    @Override
    public String toString() {
        return "SchoolClassDTO{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", schoolDTO=" + schoolDTO +
                ", academicTermDTO=" + academicTermDTO +
                '}';
    }
}
