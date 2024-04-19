package com.navigator.controller;

import com.google.gson.Gson;
import com.navigator.entity.Course;
import com.navigator.entity.Professor;
import com.navigator.service.SearchService;
import com.navigator.service.impl.SearchServiceImpl;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import com.navigator.utils.GsonTools;

@WebServlet("/search")
public class SearchServlet extends HttpServlet {
    private SearchService searchService = new SearchServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("application/json; charset=UTF-8");
        String keyword = req.getParameter("keyword");
        Set<Course> courses = searchService.searchCourses(keyword);
        Set<Professor> professors = searchService.searchProfessors(keyword);
        Map<String, Object> result = new HashMap<>();
        result.put("courses", courses);
        result.put("professors", professors);
        resp.getWriter().write(GsonTools.success("search completed",result));
    }
}
