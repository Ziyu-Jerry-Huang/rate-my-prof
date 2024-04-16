package com.navigator.entity;

public class Course {
    private Integer courseId;
    private String courseName;
    private String courseCode;
    private Integer professorId;

    public Course(Integer courseId, String courseName, String courseCode, Integer professorId) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.professorId = professorId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
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
