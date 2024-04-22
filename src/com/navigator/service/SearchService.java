package com.navigator.service;

import com.navigator.entity.Course;
import com.navigator.entity.Professor;
import com.navigator.entity.Sort;

import java.util.List;
import java.util.Set;

public interface SearchService {
    List<Course> searchCourses(String keyword, Integer campusId, Sort sort);

    List<Professor> searchProfessors(String keyword,Integer campusId, Sort sort);

}
