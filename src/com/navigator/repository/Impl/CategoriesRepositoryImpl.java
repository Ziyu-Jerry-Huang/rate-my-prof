package com.navigator.repository.Impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CategoriesRepositoryImpl implements CategoriesRepository {

  private static String url = "jdbc:mysql://localhost:3306/ai_navigator";
  private static String dbuser = "root";
  private static String dbpassword = "1234";

  @Override
  public List<Category> findAllCategories() {

    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
      return null;
    }

    Connection conn = null;
    Statement stmt = null;
    List<Category> res = new ArrayList<>();
    try {
      conn = DriverManager.getConnection(url, dbuser, dbpassword);
      stmt = conn.createStatement();
      String query = "SELECT * FROM categories";
      ResultSet rs = stmt.executeQuery(query);

      while (rs.next()) {
        res.add(new Category(
            rs.getInt("category_id"),
            rs.getString("category")
        ));
      }
    } catch (Exception e) {
      e.printStackTrace();
    }

    return res;
  }

}
