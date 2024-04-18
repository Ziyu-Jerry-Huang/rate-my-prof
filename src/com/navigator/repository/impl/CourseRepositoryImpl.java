package com.navigator.repository.impl;

import com.navigator.repository.CourseRepository;
import com.navigator.utils.JDBCTools;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CourseRepositoryImpl implements CourseRepository {
    @Override
    public void addCourse(String courseName, Integer professorId, String courseCode, Integer campusId) {
        // add course to database
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        String query = "INSERT INTO courses (course_name, professor_id, course_code, campus_id) VALUES (?, ?, ?, ?)";
        try {
            connection = JDBCTools.getConnection();
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, courseName);
            preparedStatement.setInt(2, professorId);
            preparedStatement.setString(3, courseCode);
            preparedStatement.setInt(4, campusId);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            JDBCTools.release(null, preparedStatement, connection);
        }
    }
}
