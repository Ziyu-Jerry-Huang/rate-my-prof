package com.navigator.repository.impl;

import com.navigator.entity.Comment;
import com.navigator.repository.CommentRepository;
import com.navigator.utils.JDBCTools;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class CommentRepositoryImpl implements CommentRepository {
    @Override
    public void addComment(Integer courseId, Integer professorId, Integer rating,String content, LocalDateTime datePosted) {
        // add comment to database

            Connection connection = null;
            PreparedStatement statement = null;
            String sql = "INSERT INTO reviews (course_id, professor_id, rating, comment,date_posted) VALUES (?, ?,?, ?, ?)";
            try{
                connection = JDBCTools.getConnection();
                statement = connection.prepareStatement(sql);
                statement.setInt(1, courseId);
                statement.setInt(2, professorId);
                statement.setInt(3, rating);
                statement.setString(4, content);
                statement.setObject(5, datePosted);
                statement.executeUpdate();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            } finally {
                JDBCTools.release(null, statement, connection);
            }

    }

    @Override
    public List<Comment> getCommentsByProfessorId(Integer professorId) {
        // get comments by professor id
        Connection connection = null;
        PreparedStatement statement = null;
        String sql = "SELECT * FROM reviews WHERE professor_id = ?";
        ResultSet resultSet = null;
    List<Comment> comments = new ArrayList<>();
        try{
            connection = JDBCTools.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setInt(1, professorId);
            resultSet = statement.executeQuery();
            while(resultSet.next()) {
                Comment comment = new Comment(
                    resultSet.getInt("review_id"),
                    resultSet.getInt("course_id"),
                    resultSet.getInt("professor_id"),
                    resultSet.getInt("rating"),
                    resultSet.getString("comment"),
                    resultSet.getObject("date_posted", LocalDateTime.class)
                );
                comments.add(comment);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            JDBCTools.release(resultSet, statement, connection);

        }
        return comments;
    }
}
