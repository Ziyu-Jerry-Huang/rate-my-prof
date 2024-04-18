package com.navigator.service.impl;

import com.navigator.repository.CourseRepository;
import com.navigator.repository.impl.CourseRepositoryImpl;
import com.navigator.service.CourseService;

public class CourseServiceImpl implements CourseService {
  private CourseRepository courseRepository = new CourseRepositoryImpl();

    @Override
    public void addCourse(String courseName, Integer professorId, String courseCode, Integer campusId) {
        // add course to database
        courseRepository.addCourse(courseName, professorId, courseCode, campusId);
    }
}
