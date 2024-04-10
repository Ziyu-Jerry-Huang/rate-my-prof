package com.navigator.entity;

public class Agent {
  private Integer agentId;
  private String agentName;
  private String url;
  private Integer categoryId;
  private String description;
  private Double score;
  private Integer visitedNum;
  private String isActive;
  private String fee;

  public Agent(Integer agentId, String agentName, String url, Integer categoryId,
      String description,
      Double score, Integer visitedNum, String isActive, String fee) {
    this.agentId = agentId;
    this.agentName = agentName;
    this.url = url;
    this.categoryId = categoryId;
    this.description = description;
    this.score = score;
    this.visitedNum = visitedNum;
    this.isActive = isActive;
    this.fee = fee;
  }

  public Integer getAgentId() {
    return agentId;
  }

  public void setAgentId(Integer agentId) {
    this.agentId = agentId;
  }

  public String getAgentName() {
    return agentName;
  }

  public void setAgentName(String agentName) {
    this.agentName = agentName;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Integer getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Integer categoryId) {
    this.categoryId = categoryId;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Double getScore() {
    return score;
  }

  public void setScore(Double score) {
    this.score = score;
  }

  public Integer getVisitedNum() {
    return visitedNum;
  }

  public void setVisitedNum(Integer visitedNum) {
    this.visitedNum = visitedNum;
  }

  public String getActive() {
    return isActive;
  }

  public void setActive(String active) {
    isActive = active;
  }

  public String getFee() {
    return fee;
  }

  public void setFee(String fee) {
    this.fee = fee;
  }

}
