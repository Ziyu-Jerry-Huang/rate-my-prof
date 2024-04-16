package com.navigator.service;

import com.navigator.service.Impl.HomepageServiceImpl;
import java.util.List;
import java.util.Map;
import org.junit.Before;
import org.junit.Test;

public class HomepageServiceImplTest {

  private HomepageService service = new HomepageServiceImpl();
  private Category cate10, cate11, cate12, cate13, cate14;

  @Before
  public void setup() {
    cate10 = new Category(10, "Closed-source LLMs");
    cate11 = new Category(11, "Open Source LLMs");
    cate12 = new Category(12, "Writing");
    cate13 = new Category(13, "Image Creation");
    cate14 = new Category(14, "Speech Recognition");
  }

  @Test
  public void testAllAgents() {
    Map<Category, List<Agent>> agentsInCategories = service.allAgents();
    assertEquals("ChatGPT", agentsInCategories.get(cate10).get(0).getAgentName());
    assertEquals("Mixtral-8x7B", agentsInCategories.get(cate11).get(1).getAgentName());
    assertEquals("Grammarly", agentsInCategories.get(cate12).get(2).getAgentName());
    assertEquals("civitai", agentsInCategories.get(cate13).get(3).getAgentName());
    assertEquals("whisper-web", agentsInCategories.get(cate14).get(4).getAgentName());
  }
}
