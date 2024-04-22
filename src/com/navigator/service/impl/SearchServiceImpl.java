package com.navigator.service.impl;

import com.navigator.entity.Course;
import com.navigator.entity.Professor;
import com.navigator.entity.Sort;
import com.navigator.entity.comparator.sortByCourseCode;
import com.navigator.entity.comparator.sortByProfessorName;
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
    public List<Course> searchCourses(String keyword, Integer campusId, Sort sort) {
        // search courses in database
        Set<Course> courses = new HashSet<Course>();
        courses.addAll(courseRepository.searchCourseByName(keyword));
        courses.addAll(courseRepository.searchCourseByCode(keyword));
        List<Course> courseList = new ArrayList<>(courses);
        switch (sort){
            case CourseCode:
                Collections.sort(courseList, new sortByCourseCode());
                break;
            default:
                break;
        }
        if(campusId == null){
            return courseList;
        }else{
            List<Course> coursesByCampus = courseList.stream()
                    .filter(course -> course.getCampusId().equals(campusId))
                    .collect(Collectors.toList());
            return coursesByCampus;
            }
    }

    @Override
    public List<Professor> searchProfessors(String keyword, Integer campusId, Sort sort) {
        // search professors in database
        Set<Professor> professors = new HashSet<>();
        professors.addAll(professorRepository.searchProfessorByName(keyword));
        List<Professor> professorList = new ArrayList<>(professors);
        switch (sort){
            case ProfessorName:
                Collections.sort(professorList, new sortByProfessorName());
                break;
            default:
                break;
        }
        if(campusId == null){
            return professorList;
        }else{
            List<Professor> professorsByCampus = professorList.stream()
                    .filter(professor -> professor.getCampusId().equals(campusId))
                    .collect(Collectors.toList());
            return professorsByCampus;
        }
    }

}
