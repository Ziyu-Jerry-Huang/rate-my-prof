package com.navigator.service;

import com.navigator.entity.Comment;

import java.util.List;

public interface CommentService {
    void addComment(Integer courseId,Integer rating,String content);
    List<Comment> getCommentsByProfessorId(Integer professorId);;
    List<Comment> getCommentsByCourseId(Integer courseId);
    void deleteComment(Integer commentId);
}
