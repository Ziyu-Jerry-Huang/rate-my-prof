package com.navigator.repository;

import static org.junit.Assert.*;

import com.navigator.entity.Category;
import com.navigator.repository.Impl.CategoriesRepositoryImpl;
import java.util.List;
import org.junit.Test;

public class CategoriesRepositoryImplTest {

  private CategoriesRepository repo = new CategoriesRepositoryImpl();

  @Test
  public void testFindAllCategories() {
    List<Category> categories = repo.findAllCategories();
    assertEquals("Closed-source LLMs", categories.get(0).getCategory());
    assertEquals("Open Source LLMs", categories.get(1).getCategory());
    assertEquals("Writing", categories.get(2).getCategory());
    assertEquals("Image Creation", categories.get(3).getCategory());
    assertEquals("Speech Recognition", categories.get(4).getCategory());
  }
}
