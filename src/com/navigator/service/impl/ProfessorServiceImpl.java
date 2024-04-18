package com.navigator.service.impl;

import com.navigator.entity.Professor;
import com.navigator.repository.ProfessorRepository;
import com.navigator.repository.impl.ProfessorRepositoryImpl;
import com.navigator.service.ProfessorService;

public class ProfessorServiceImpl implements ProfessorService {
    private ProfessorRepository professorRepository = new ProfessorRepositoryImpl();
    @Override
    public void addProfessor(String name, Integer campusId) {
        // add professor to database
        professorRepository.addProfessor(name, campusId);

    }

    @Override
    public Professor searchProfessorByName(String name) {
        // search for professor by name
        return professorRepository.searchProfessorByName(name);
    }
}