package com.navigator.repository;

import static org.junit.Assert.*;

import com.navigator.entity.Agent;
import com.navigator.entity.Category;
import com.navigator.repository.AgentRepository;
import com.navigator.repository.Impl.AgentsRepositoryImpl;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class AgentsRepositoryImplTest {

  private AgentRepository repo = new AgentsRepositoryImpl();

  @Test
  public void testFindAgentsByCategory() {
    Category cate = new Category(10, "Closed-source LLMs");
    List<Agent> agt = repo.findAgentsByCategory(cate);
    assertEquals("ChatGPT", agt.get(0).getAgentName());
    assertEquals("New Bing", agt.get(1).getAgentName());
    assertEquals("Claude", agt.get(2).getAgentName());
    assertEquals("Gemini", agt.get(3).getAgentName());
    assertEquals("Le Chat", agt.get(4).getAgentName());
  }
}