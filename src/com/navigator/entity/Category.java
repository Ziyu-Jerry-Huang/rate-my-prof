package com.navigator.entity;

import java.util.Objects;

public class Category {
  private Integer categoryId;
  private String category;

  public Category(Integer categoryId, String category) {
    this.categoryId = categoryId;
    this.category = category;
  }

  public Integer getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Integer categoryId) {
    this.categoryId = categoryId;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  @Override
  public int hashCode() {
    return Objects.hash(category);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) { return true; }
    if (!(o instanceof Category other)) {
      return false;
    }
    return this.category.equals(other.getCategory());
  }
}
