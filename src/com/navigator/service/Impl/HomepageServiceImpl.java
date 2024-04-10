package com.navigator.service.Impl;

import com.navigator.entity.Agent;
import com.navigator.entity.Category;
import com.navigator.repository.AgentRepository;
import com.navigator.repository.CategoriesRepository;
import com.navigator.repository.Impl.AgentsRepositoryImpl;
import com.navigator.repository.Impl.CategoriesRepositoryImpl;
import com.navigator.service.HomepageService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HomepageServiceImpl implements HomepageService {

  private AgentRepository agentRepository = new AgentsRepositoryImpl();
  private CategoriesRepository categoriesRepository = new CategoriesRepositoryImpl();

  @Override
  public Map<Category, List<Agent>> allAgents() {

    List<Category> listCategories = categoriesRepository.findAllCategories();
    Map<Category, List<Agent>> agentsMapInCategories = new HashMap<>();

    for (Category cate: listCategories) {
      List<Agent> agt = agentRepository.findAgentsByCategory(cate);
      agentsMapInCategories.put(cate, agt);
    }

    return agentsMapInCategories;
  }
}
