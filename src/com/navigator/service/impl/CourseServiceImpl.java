package com.navigator.service.impl;

import com.navigator.entity.Course;
import com.navigator.repository.CourseRepository;
import com.navigator.repository.impl.CourseRepositoryImpl;
import com.navigator.service.CourseService;

import java.util.List;

public class CourseServiceImpl implements CourseService {
  private CourseRepository courseRepository = new CourseRepositoryImpl();

    @Override
    public void addCourse(String courseName, Integer professorId, String courseCode, Integer campusId) {
        // add course to database
        courseRepository.addCourse(courseName, professorId, courseCode, campusId);
    }

    @Override
    public List<Course> searchCourseByName(String name) {
        // search course by name
        return courseRepository.searchCourseByName(name);
    }

    @Override
    public List<Course> searchCourseByCode(String code) {
        // search course by code
        return courseRepository.searchCourseByCode(code);
    }
}
