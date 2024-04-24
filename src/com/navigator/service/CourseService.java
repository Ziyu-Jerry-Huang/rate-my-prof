package com.navigator.service;

import com.navigator.entity.Course;

import java.util.List;

public interface CourseService {
    void addCourse(String courseName, String name, String courseCode, Integer campusId);
    List<Course> searchCourseByName(String name);
    List<Course> searchCourseByCode(String code);
    void deleteCourse(Integer courseId);
}
