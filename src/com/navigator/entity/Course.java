package com.navigator.entity;

import java.util.Objects;

public class Course {
    private Integer courseId;
    private String courseName;
    private String courseCode;
    private Integer professorId;
    private String professorName;
    private Integer campusId;

    public Course(Integer courseId, String courseName, String courseCode, Integer professorId, String professorName, Integer campusId) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.professorId = professorId;
        this.professorName = professorName;
        this.campusId = campusId;
    }

    public Integer getCampusId() {
        return campusId;
    }

    public void setCampusId(Integer campusId) {
        this.campusId = campusId;
    }

    public String getProfessorName() {
        return professorName;
    }

    public void setProfessorName(String professorName) {
        this.professorName = professorName;
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

    @Override
    public int hashCode() {
        return Objects.hash(courseName, courseCode, professorId);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Course course = (Course) obj;
        return Objects.equals(courseName, course.courseName)
                && Objects.equals(courseCode, course.courseCode) && Objects.equals(professorId, course.professorId);
    }
}
