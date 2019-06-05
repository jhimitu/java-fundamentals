package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReviewTest {
    @Test
    public void testReviewAuthor() {
        Review review = new Review();
        review.setAuthor("somebody");
        assertEquals("somebody", review.getAuthor());
    }
}
