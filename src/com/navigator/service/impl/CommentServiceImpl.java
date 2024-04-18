package com.navigator.service.impl;

import com.navigator.entity.Comment;
import com.navigator.repository.CommentRepository;
import com.navigator.repository.ProfessorRepository;
import com.navigator.repository.impl.CommentRepositoryImpl;
import com.navigator.repository.impl.ProfessorRepositoryImpl;
import com.navigator.service.CommentService;

import java.time.LocalDateTime;
import java.util.List;

public class CommentServiceImpl implements CommentService {
    private CommentRepository commentRepository = new CommentRepositoryImpl();
    private ProfessorRepository professorRepository = new ProfessorRepositoryImpl();
    @Override
    public void addComment(Integer courseId, Integer rating, String content) {
        Integer professorId = professorRepository.getProfessorIdByCourseId(courseId);
        commentRepository.addComment(courseId, professorId, rating, content, LocalDateTime.now());
    }
    @Override
    public List<Comment> getCommentsByProfessorId(Integer professorId) {
        return commentRepository.getCommentsByProfessorId(professorId);
    }
}
