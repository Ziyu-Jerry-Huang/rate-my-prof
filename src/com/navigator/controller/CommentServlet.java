package com.navigator.controller;

import com.navigator.service.CommentService;
import com.navigator.service.impl.CommentServiceImpl;
import com.navigator.utils.GsonTools;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/comment")
public class CommentServlet extends HttpServlet {
    private CommentService commentService = new CommentServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("application/json; charset=UTF-8");
        Integer courseId = Integer.valueOf(req.getParameter("course_id"));
        Integer rating = Integer.valueOf(req.getParameter("rating"));
        String content = req.getParameter("content");
        commentService.addComment(courseId, rating, content);
        resp.getWriter().write(
            GsonTools.success("Comment added successfully")
        );
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("application/json; charset=UTF-8");
        Integer professorId = Integer.valueOf(req.getParameter("professor_id"));
        if(req.getParameter("professor_id") != null) {
            resp.getWriter().write(
                GsonTools.success("Comments retrieved successfully", commentService.getCommentsByProfessorId(professorId))
            );
        }else{
            Integer courseId = Integer.valueOf(req.getParameter("course_id"));
            resp.getWriter().write(
                GsonTools.success("Comments retrieved successfully", commentService.getCommentsByCourseId(courseId))
            );
        }

    }
}
