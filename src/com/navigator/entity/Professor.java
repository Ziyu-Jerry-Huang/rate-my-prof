package com.navigator.entity;

public class Professor {
    private Integer professorId;
    private String name;
    private Integer campusId;

    public Professor(Integer professorId, String name, Integer campusId) {
        this.professorId = professorId;
        this.name = name;
        this.campusId = campusId;
    }
    public Professor(String name, Integer campusId) {
        this.professorId = null;
        this.name = name;
        this.campusId = campusId;
    }

    public Integer getProfessorId() {
        return professorId;
    }

    public String getName() {
        return name;
    }

    public Integer getCampusId() {
        return campusId;
    }

    public void setProfessorId(Integer professorId) {
        this.professorId = professorId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCampusId(Integer campusId) {
        this.campusId = campusId;
    }
}
