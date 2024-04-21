import com.navigator.entity.Course;
import com.navigator.entity.Professor;
import com.navigator.service.SearchService;
import com.navigator.service.impl.SearchServiceImpl;
import org.junit.Test;

import java.util.Set;

public class SearchServiceImplTest {
    @Test
    public void testSearchCourses() {
        SearchService searchService = new SearchServiceImpl();
        Set<Course> courses = searchService.searchCourses("CS",null);
        for (Course course : courses) {
            System.out.println(course.getCourseCode());
        }
    }

    @Test
    public void testSearchProfessors() {
        SearchService searchService = new SearchServiceImpl();
        Set<Professor> professors = searchService.searchProfessors("Ma",null);
        for (Professor professor : professors) {
            System.out.println(professor.getName());
        }
    }
}
