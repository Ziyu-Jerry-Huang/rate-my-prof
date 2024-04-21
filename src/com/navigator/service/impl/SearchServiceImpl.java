package com.navigator.service.impl;

import com.navigator.entity.Course;
import com.navigator.entity.Professor;
import com.navigator.repository.CourseRepository;
import com.navigator.repository.ProfessorRepository;
import com.navigator.repository.impl.CourseRepositoryImpl;
import com.navigator.repository.impl.ProfessorRepositoryImpl;
import com.navigator.service.SearchService;

import java.util.*;
import java.util.stream.Collectors;

public class SearchServiceImpl implements SearchService {
    private CourseRepository courseRepository = new CourseRepositoryImpl();
    private ProfessorRepository professorRepository = new ProfessorRepositoryImpl();

    @Override
    public Set<Course> searchCourses(String keyword, Integer campusId) {
        // search courses in database
        Set<Course> courses = new HashSet<Course>();
        courses.addAll(courseRepository.searchCourseByName(keyword));
        courses.addAll(courseRepository.searchCourseByCode(keyword));
        if(campusId == null){
            return courses;
        }else{
            Set<Course> coursesByCampus = courses.stream()
                    .filter(course -> course.getCampusId().equals(campusId))
                    .collect(Collectors.toSet());
            return coursesByCampus;
            }
    }

    @Override
    public Set<Professor> searchProfessors(String keyword, Integer campusId) {
        // search professors in database
        Set<Professor> professors = new HashSet<>();
        professors.addAll(professorRepository.searchProfessorByName(keyword));
        if(campusId == null){
            return professors;
        }else{
            Set<Professor> professorsByCampus = professors.stream()
                    .filter(professor -> professor.getCampusId().equals(campusId))
                    .collect(Collectors.toSet());
            return professorsByCampus;
        }
    }

    @Override
    public <T extends Comparable<T>> List<T> sortByAlphabet(Set<T> set) {
        // sort set by alphabet
        List<T> list = new ArrayList<>(set);
        Collections.sort(list);
        return list;
    }
}
