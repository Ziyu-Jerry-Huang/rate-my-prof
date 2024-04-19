import static org.junit.Assert.*;

import com.navigator.entity.Campus;
import com.navigator.repository.CampusRepository;
import com.navigator.repository.impl.CampusRepositoryImpl;
import java.util.List;
import org.junit.Test;

public class CampusRepositoryImplTest {

  @Test
  public void testGetAllCampus() {
    CampusRepository campusRepository = new CampusRepositoryImpl();
    List<Campus> campus = campusRepository.getAllCampus();
    assertEquals("Online", campus.get(0).getCampusName());
    assertEquals("Boston", campus.get(1).getCampusName());
    assertEquals("Silicon Valley", campus.get(2).getCampusName());
    assertEquals("Seattle", campus.get(3).getCampusName());
    assertEquals("Oakland", campus.get(4).getCampusName());
  }

}
