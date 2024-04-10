package com.navigator.controller;

import com.navigator.entity.Agent;
import com.navigator.entity.Category;
import com.navigator.service.HomepageService;
import com.navigator.service.Impl.HomepageServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@WebServlet("/home")
public class HomepageServlet extends HttpServlet {

  private HomepageService homepageService = new HomepageServiceImpl();

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws IOException, ServletException {
    Map<Category, List<Agent>> agentsInCategories = homepageService.allAgents();
    req.setAttribute("agentsInCategories", agentsInCategories);
    req.getRequestDispatcher("/index.jsp").forward(req, resp);
  }
}
