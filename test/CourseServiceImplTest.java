import com.navigator.repository.CourseRepository;
import com.navigator.service.CourseService;
import com.navigator.service.impl.CourseServiceImpl;
import org.junit.Test;

public class CourseServiceImplTest {
    @Test
    public void testAddCourse() {
        CourseService courseService = new CourseServiceImpl();
        courseService.addCourse("OOD", 1, "CS5004", 1);

    }
}
