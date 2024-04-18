import com.navigator.utils.GsonTools;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GsonToolsTest {

    @Test
    public void testSuccess() {
        String expected = "{\"status\":\"success\",\"message\":\"message\"}";
        assertEquals(expected, GsonTools.success("message"));
    }

}
