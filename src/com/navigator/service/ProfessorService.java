package com.navigator.service;

import com.navigator.entity.Professor;

public interface ProfessorService {
    /**
     * Add a new professor to the database.
     * @param name the name of the professor
     * @param campusId the id of the campus where the professor works
     */
    void addProfessor(String name, Integer campusId);

    /**
     * Search for a professor by name.
     * @param name the name of the professor to search for
     */
    Professor searchProfessorByName(String name);

}
