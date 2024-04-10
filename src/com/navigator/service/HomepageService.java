package com.navigator.service;

import com.navigator.entity.Agent;
import com.navigator.entity.Category;
import java.util.List;
import java.util.Map;

public interface HomepageService {

  /**
   * return all agents in the database for homepage to show
   * organize by Categories
   * @return a map with Category as key and a List of Agent as value
   */
  Map<Category, List<Agent>> allAgents();
}
