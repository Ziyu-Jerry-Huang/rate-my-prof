package com.navigator.repository;

public interface CourseRepository {
    void addCourse(String courseName, Integer professorId, String courseCode, Integer campusId);
}
