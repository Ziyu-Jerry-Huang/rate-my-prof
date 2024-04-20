import com.navigator.entity.Course;
import com.navigator.repository.CourseRepository;
import com.navigator.service.CourseService;
import com.navigator.service.impl.CourseServiceImpl;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CourseServiceImplTest {
    List<Course> courses = new ArrayList<>();
    @Test
    public void testAddCourse() {
        CourseService courseService = new CourseServiceImpl();
        courseService.addCourse("OOD", 1, "CS5004", 1);
        courseService.addCourse("Data Structure", 4, "CS5008", 1);
    }

    @Test
    public void testSearchCourseByName() {
        CourseService courseService = new CourseServiceImpl();
        courses = courseService.searchCourseByName("OOD");
        for (Course course : courses) {
            System.out.println(course.getProfessorName());
        }
    }

    @Test
    public void testSearchCourseByCode() {
        CourseService courseService = new CourseServiceImpl();
        courses = courseService.searchCourseByCode("CS5008");
        for (Course course : courses) {
            System.out.println(course.getProfessorName());
        }
    }
}
