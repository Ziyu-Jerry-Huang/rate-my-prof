package com.navigator.repository;

import com.navigator.entity.Category;
import java.util.List;

public interface CategoriesRepository {

  /**
   * retrieve all available categories from the database
   * @return a List of class Category
   */
  List<Category> findAllCategories();
}
