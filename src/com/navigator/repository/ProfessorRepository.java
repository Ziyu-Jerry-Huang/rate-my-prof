package com.navigator.repository;

import com.navigator.entity.Professor;

public interface ProfessorRepository {
    //add professor to database
    void addProfessor(String name, Integer campusId);
    //search for professor by name
    Professor searchProfessorByName(String name);
}
