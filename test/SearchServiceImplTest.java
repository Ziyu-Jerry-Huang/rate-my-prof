import com.navigator.entity.Course;
import com.navigator.entity.Professor;
import com.navigator.entity.Sort;
import com.navigator.service.SearchService;
import com.navigator.service.impl.SearchServiceImpl;
import org.junit.Test;

import java.util.List;
import java.util.Set;

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
