package com.navigator.repository.impl;

import com.navigator.entity.Professor;
import com.navigator.repository.ProfessorRepository;

import com.navigator.utils.JDBCTools;
import java.sql.*;

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
    public Professor searchProfessorByName(String name) {
        Connection connection = null;
        PreparedStatement statement = null;
        String sql = "SELECT * FROM professors WHERE name = ?";
        ResultSet resultSet = null;
        Professor professor = null;
        // search for professor by name
        try{
            connection = JDBCTools.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setString(1, name);
            resultSet = statement.executeQuery();
            if(resultSet.next()) {
                professor = new Professor(
                    resultSet.getInt("professor_id"),
                    resultSet.getString("name"),
                    resultSet.getInt("campus_id")
                );
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            JDBCTools.release(resultSet, statement, connection);
        }

        return professor;
    }

}
