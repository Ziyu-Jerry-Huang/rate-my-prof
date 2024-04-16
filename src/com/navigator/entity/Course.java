package com.navigator.entity;

public class Course {
    private Integer courseId;
    private String name;
    private String courseCode;
    private Integer professorId;

    public Course(Integer courseId, String name, String courseCode, Integer professorId) {
        this.courseId = courseId;
        this.name = name;
        this.courseCode = courseCode;
        this.professorId = professorId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public Integer getProfessorId() {
        return professorId;
    }

    public void setProfessorId(Integer professorId) {
        this.professorId = professorId;
    }
}
