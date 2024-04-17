package com.navigator.controller;

import com.navigator.entity.Professor;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/update/professor")
public class ProfessorServlet extends HttpServlet {

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
    // create new professor

    String name = req.getParameter("name");
    Integer campus_id = Integer.valueOf(req.getParameter("campus_id"));
    Professor professor = new Professor(name, campus_id);

  }
}
