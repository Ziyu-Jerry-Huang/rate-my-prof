package com.navigator.service;

import com.navigator.entity.Course;
import com.navigator.entity.Professor;

import java.util.List;

public interface SearchService {
    List<Course> searchCourses(String keyword);

}
