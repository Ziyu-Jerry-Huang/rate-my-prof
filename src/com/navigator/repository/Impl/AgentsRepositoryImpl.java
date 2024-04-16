package com.navigator.repository.Impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AgentsRepositoryImpl implements AgentRepository {

  private static String url = "jdbc:mysql://localhost:3306/ai_navigator";
  private static String dbuser = "root";
  private static String dbpassword = "1234";

  @Override
  public List<Agent> findAllAgents() {

    // find JDBC MySQL Driver
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
      return null;
    }

    Connection conn = null;
    Statement stmt = null;
    List<Agent> res = new ArrayList<>();
    try {
      conn = DriverManager.getConnection(url, dbuser, dbpassword);
      stmt = conn.createStatement();
      String query = "SELECT * FROM agents";
      ResultSet rs = stmt.executeQuery(query);

      while (rs.next()) {
        res.add(new Agent(
            rs.getInt("agent_id"),
            rs.getString("agent_name"),
            rs.getString("url"),
            rs.getInt("category_id"),
            rs.getString("description"),
            rs.getDouble("score"),
            rs.getInt("visited_mum"),
            rs.getString("is_active"),
            rs.getString("fee")
        ));
      }
    } catch (Exception e) {
      e.printStackTrace();
    }

    return res;
  }

  @Override
  public List<Agent> findAgentsByCategory(Category cate) {

    List<Agent> res = new ArrayList<>();
    try {
      Class.forName("com.mysql.cj.jdbc.Driver"); // find JDBC MySQL Driver
      Connection conn = DriverManager.getConnection(url, dbuser, dbpassword);

      String query = "SELECT * FROM agents WHERE category_id = ?";
      PreparedStatement pstmt = conn.prepareStatement(query);

      Integer cateId = cate.getCategoryId();
      pstmt.setInt(1, cateId);

      ResultSet rs = pstmt.executeQuery();
      while (rs.next()) {
        res.add(new Agent(
            rs.getInt("agent_id"),
            rs.getString("agent_name"),
            rs.getString("url"),
            rs.getInt("category_id"),
            rs.getString("description"),
            rs.getDouble("score"),
            rs.getInt("visited_num"),
            rs.getString("is_active"),
            rs.getString("fee")
        ));
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    return res;
  }
}
