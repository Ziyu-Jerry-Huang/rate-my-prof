package com.navigator.controller;

import com.navigator.service.CourseService;
import com.navigator.service.impl.CourseServiceImpl;
import com.navigator.utils.GsonTools;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/course")
public class CourseServlet extends HttpServlet {
    private CourseService courseService = new CourseServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("application/json; charset=UTF-8");
        String courseName = req.getParameter("course_name");
        String courseCode = req.getParameter("course_code");
        Integer professorId = Integer.valueOf(req.getParameter("professor_id"));
        Integer campusId = Integer.valueOf(req.getParameter("campus_id"));
        courseService.addCourse(courseName, professorId,courseCode, campusId);
        resp.getWriter().write(
            GsonTools.success("Course added successfully")
        );
    }
}