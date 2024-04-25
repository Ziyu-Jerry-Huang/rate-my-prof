import com.rateneuprofessor.service.ProfessorService;
import com.rateneuprofessor.service.impl.ProfessorServiceImpl;
import org.junit.Test;

public class ProfessorServiceImplTest {

  @Test
  public void testAddProfessor() {
    ProfessorService professorService = new ProfessorServiceImpl();
    professorService.addProfessor("Mark Miller", 3);
  }
}
