import com.navigator.entity.Professor;
import com.navigator.repository.ProfessorRepository;
import com.navigator.repository.impl.ProfessorRepositoryImpl;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ProfessorRepositoryImplTest {
    @Test
    public void testAddProfessor() {
        ProfessorRepository professorRepository = new ProfessorRepositoryImpl();
        professorRepository.addProfessor("Mark Miller", 1);
        professorRepository.addProfessor("Maryam", 1);
    }

    @Test
    public void testSearchProfessorByName() {
        Professor professor = new Professor(1, "Mark Miller", 1,5.0);
        ProfessorRepository professorRepository = new ProfessorRepositoryImpl();
        List<Professor> profMark = professorRepository.searchProfessorByName("Mark Miller");
        // verify that the professor was found

    }
}
