package com.navigator.repository;

import com.navigator.entity.Professor;

import java.util.List;

public interface ProfessorRepository {

    /**
     * add professor to database
     * @param name the name of the professor
     * @param campusId the id of the campus where the professor works
     */
    void addProfessor(String name, Integer campusId);

    /**
     * search for professor by name
     * @param name the name of the professor to search for
     * @return
     */
    List<Professor> searchProfessorByName(String name);
    /**
     * Get the professor by course id.
     * @param courseId the id of the professor to search for
     */
    Integer getProfessorIdByCourseId(Integer courseId);

    void updateRating(Integer professorId);
}
