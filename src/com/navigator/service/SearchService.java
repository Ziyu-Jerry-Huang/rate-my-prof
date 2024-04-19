package com.navigator.service;

import com.navigator.entity.Course;
import com.navigator.entity.Professor;

import java.util.List;
import java.util.Set;

public interface SearchService {
    Set<Course> searchCourses(String keyword);

    Set<Professor> searchProfessors(String keyword);

}
