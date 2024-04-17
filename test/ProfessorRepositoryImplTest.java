import com.navigator.entity.Professor;
import com.navigator.repository.ProfessorRepository;
import com.navigator.repository.impl.ProfessorRepositoryImpl;
import org.junit.Test;
import static org.junit.Assert.*;

public class ProfessorRepositoryImplTest {
    @Test
    public void testAddProfessor() {
        ProfessorRepository professorRepository = new ProfessorRepositoryImpl();
        professorRepository.addProfessor("Mark Miller", 1);
    }

    @Test
    public void testSearchProfessorByName() {
        Professor professor = new Professor(1, "Mark Miller", 1);
        ProfessorRepository professorRepository = new ProfessorRepositoryImpl();
        Professor profMark = professorRepository.searchProfessorByName("Mark Miller");
        // verify that the professor was found
        assertEquals(profMark.getProfessorId(),Integer.valueOf(2));

    }
}
