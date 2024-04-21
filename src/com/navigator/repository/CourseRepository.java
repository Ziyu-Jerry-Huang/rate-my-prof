package com.navigator.repository;

import com.navigator.entity.Course;

import java.util.List;

public interface CourseRepository {
    void addCourse(String courseName, Integer professorId, String courseCode, Integer campusId);
    List<Course> searchCourseByName(String name);
    List<Course> searchCourseByCode(String code);
    void updateRating(Integer courseId);
}
