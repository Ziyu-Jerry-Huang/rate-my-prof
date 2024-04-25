package serviceTest;

import com.rateneuprofessor.entity.Course;
import com.rateneuprofessor.entity.Professor;
import com.rateneuprofessor.entity.Sort;
import com.rateneuprofessor.service.SearchService;
import com.rateneuprofessor.service.impl.SearchServiceImpl;
import org.junit.Test;

import java.util.List;

public class SearchServiceImplTest {
    @Test
    public void testSearchCourses() {
        SearchService searchService = new SearchServiceImpl();
        List<Course> courses = searchService.searchCourses("CS",null, Sort.Default);
        for (Course course : courses) {
            System.out.println(course.getCourseCode());
        }
    }

    @Test
    public void testSearchProfessors() {
        SearchService searchService = new SearchServiceImpl();
        List<Professor> professors = searchService.searchProfessors("Ma",null, Sort.Default);
        for (Professor professor : professors) {
            System.out.println(professor.getName());
        }
    }
}
