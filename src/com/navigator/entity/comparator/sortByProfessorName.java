package com.navigator.entity.comparator;

import com.navigator.entity.Professor;

import java.util.Comparator;

public class sortByProfessorName implements Comparator<Professor> {

    @Override
    public int compare(Professor o1, Professor o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
