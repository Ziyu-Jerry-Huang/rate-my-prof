package com.navigator.service.impl;

import com.navigator.entity.Course;
import com.navigator.entity.Professor;
import com.navigator.repository.CourseRepository;
import com.navigator.repository.ProfessorRepository;
import com.navigator.repository.impl.CourseRepositoryImpl;
import com.navigator.repository.impl.ProfessorRepositoryImpl;
import com.navigator.service.SearchService;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SearchServiceImpl implements SearchService {
    private CourseRepository courseRepository = new CourseRepositoryImpl();
    private ProfessorRepository professorRepository = new ProfessorRepositoryImpl();

    @Override
    public Set<Course> searchCourses(String keyword) {
        // search courses in database
        Set<Course> courses = new HashSet<Course>();
        courses.addAll(courseRepository.searchCourseByName(keyword));
        courses.addAll(courseRepository.searchCourseByCode(keyword));
        return courses;
    }

    @Override
    public Set<Professor> searchProfessors(String keyword) {
        // search professors in database
        Set<Professor> professors = new HashSet<>();
        professors.addAll(professorRepository.searchProfessorByName(keyword));
        return professors;
    }
}
