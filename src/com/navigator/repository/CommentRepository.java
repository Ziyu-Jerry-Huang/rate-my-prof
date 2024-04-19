package com.navigator.repository;

import com.navigator.entity.Comment;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

public interface CommentRepository {
    //  Add a new comment to the database.
    void addComment(Integer courseId,Integer professorId, Integer rating,String content, LocalDateTime datePosted);

    // Get all comments for a professor.
    List<Comment> getCommentsByProfessorId(Integer professorId);

    // Get all comments for a course.
    List<Comment> getCommentsByCourseId(Integer courseId);
}
