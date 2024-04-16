package com.navigator.entity;

import java.time.LocalDateTime;

public class Comment {
  private Integer reviewId;
  private Integer courseId;
  private Integer professorId;
  private Integer rating;
  private String comment;
  private LocalDateTime datePosted;

  public Comment(Integer reviewId, Integer courseId, Integer professorId, Integer rating, String comment, LocalDateTime datePosted) {
    this.reviewId = reviewId;
    this.courseId = courseId;
    this.professorId = professorId;
    this.rating = rating;
    this.comment = comment;
    this.datePosted = datePosted;
  }

  public Integer getReviewId() {
    return reviewId;
  }

  public Integer getCourseId() {
    return courseId;
  }

  public Integer getProfessorId() {
    return professorId;
  }

  public Integer getRating() {
    return rating;
  }

  public String getComment() {
    return comment;
  }

  public LocalDateTime getDatePosted() {
    return datePosted;
  }

  public void setReviewId(Integer reviewId) {
    this.reviewId = reviewId;
  }

  public void setCourseId(Integer courseId) {
    this.courseId = courseId;
  }

  public void setProfessorId(Integer professorId) {
    this.professorId = professorId;
  }

  public void setRating(Integer rating) {
    this.rating = rating;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public void setDatePosted(LocalDateTime datePosted) {
    this.datePosted = datePosted;
  }

}
