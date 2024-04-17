package com.navigator.repository.impl;

import com.navigator.entity.Professor;
import com.navigator.repository.ProfessorRepository;

import java.sql.*;

public class ProfessorRepositoryImpl implements ProfessorRepository {
    @Override
    public void addProfessor(String name, Integer campusId) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/ratemyprofessor";
            String user = "root";
            String password = "";
            Connection connection = DriverManager.getConnection(url, user, password);
            String sql = "INSERT INTO professors (name, campus_id) VALUES (?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, name);
            statement.setInt(2, campusId);
            statement.executeUpdate();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Professor searchProfessorByName(String name) {
        Professor professor = null;
        // search for professor by name
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/ratemyprofessor";
            String user = "root";
            String password = "";
            Connection connection = DriverManager.getConnection(url, user, password);
            String sql = "SELECT * FROM professors WHERE name = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, name);
            ResultSet resultSet = statement.executeQuery();
            if(resultSet.next()){
                Integer professorId = resultSet.getInt("professor_id");
                String professorName = resultSet.getString("name");
                Integer campusId = resultSet.getInt("campus_id");
                professor = new Professor(professorId, professorName, campusId);
            }
            statement.close();
            connection.close();
            return professor;
        }catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
