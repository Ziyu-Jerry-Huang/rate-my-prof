import com.rateneuprofessor.service.CommentService;
import com.rateneuprofessor.service.impl.CommentServiceImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CommentServiceImplTest {
    @Test
    public void testAddComment() {
        CommentService commentService = new CommentServiceImpl();
        commentService.addComment(1, 5, "Great professor!");
        commentService.addComment(2, 4, "Good professor!");
        commentService.addComment(1, 3, "Average professor!");
        commentService.addComment(1, 2, "Bad professor!");
        commentService.addComment(1, 1, "Terrible professor!");
        commentService.addComment(2, 1, "Terrible professor!");
    }
    @Test
    public void testGetCommentsByProfessorId() {
        CommentService commentService = new CommentServiceImpl();
        assertEquals(1, commentService.getCommentsByProfessorId(1).size());
    }
}
