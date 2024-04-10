package com.navigator.repository;

import com.navigator.entity.Agent;
import com.navigator.entity.Category;
import java.util.List;

public interface AgentRepository {

  /**
   * retrieve all AI agents from the database
   * @return a List of class Agent
   */
  List<Agent> findAllAgents();

  /**
   * retrieve all AI agents that belong to Category c from the database
   * @param c the Category to query by
   * @return a List of class Agent that belong to Category c
   */
  List<Agent> findAgentsByCategory(Category c);
}
