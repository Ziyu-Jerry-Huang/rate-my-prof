import com.navigator.repository.ProfessorRepository;
import com.navigator.repository.impl.ProfessorRepositoryImpl;
import com.navigator.service.ProfessorService;
import com.navigator.service.impl.ProfessorServiceImpl;
import org.junit.Test;

public class ProfessorServiceImplTest {

  @Test
  public void testAddProfessor() {
    ProfessorService professorService = new ProfessorServiceImpl();
    professorService.addProfessor("Mark Miller", 3);
  }
}
