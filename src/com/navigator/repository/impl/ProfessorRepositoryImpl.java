package com.navigator.repository.impl;

import com.navigator.entity.Professor;
import com.navigator.repository.ProfessorRepository;

import com.navigator.utils.JDBCTools;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProfessorRepositoryImpl implements ProfessorRepository {
    @Override
    public void addProfessor(String name, Integer campusId) {
        Connection connection = null;
        PreparedStatement statement = null;
        String sql = "INSERT INTO professors (name, campus_id) VALUES (?, ?)";
        try{
            connection = JDBCTools.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setString(1, name);
            statement.setInt(2, campusId);
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            JDBCTools.release(null, statement, connection);
        }
    }

    @Override
    public List<Professor> searchProfessorByName(String name) {
        Connection connection = null;
        PreparedStatement statement = null;
        String sql = "SELECT * FROM professors WHERE name LIKE ?";
        ResultSet resultSet = null;
        List<Professor> professors = new ArrayList<>();
        // search for professor by name
        try{
            connection = JDBCTools.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setString(1, "%" + name + "%");
            resultSet = statement.executeQuery();
            while(resultSet.next()) {
                Professor professor = new Professor(
                    resultSet.getInt("professor_id"),
                    resultSet.getString("name"),
                    resultSet.getInt("campus_id")
                );
                professors.add(professor);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            JDBCTools.release(resultSet, statement, connection);
        }

        return professors;
    }

    @Override
    public Integer getProfessorIdByCourseId(Integer courseId) {
        Connection connection = null;
        PreparedStatement statement = null;
        String sql = "SELECT professor_id FROM courses WHERE course_id = ?";
        ResultSet resultSet = null;
        Integer professorId = null;
        try{
            connection = JDBCTools.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setInt(1, courseId);
            resultSet = statement.executeQuery();
            if(resultSet.next()) {
                professorId = resultSet.getInt("professor_id");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            JDBCTools.release(resultSet, statement, connection);
        }

        return professorId;
    }

}
