package com.navigator.controller;

import com.navigator.entity.Professor;
import com.navigator.service.ProfessorService;
import com.navigator.service.impl.ProfessorServiceImpl;
import com.navigator.utils.GsonTools;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/update/professor")
public class ProfessorServlet extends HttpServlet {

  private ProfessorService professorService = new ProfessorServiceImpl();

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {

     resp.setContentType("application/json; charset=UTF-8");

    // create new professor
    String name = req.getParameter("name");
    Integer campus_id = Integer.valueOf(req.getParameter("campus_id"));
    professorService.addProfessor(name, campus_id);
    resp.getWriter().write(
         GsonTools.success("Professor added successfully")
    );
  }
}
