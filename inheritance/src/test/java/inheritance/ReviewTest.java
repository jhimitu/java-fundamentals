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

    @Test
    public void testToString() {
        Review review = new Review();

        review.setAuthor("Summer Walker");
        review.setBody("great experience. great food. would definitely recommend");
        review.setStars(4);

        String expected = "Review: great experience. great food. would definitely recommend \n" +
                "author: Summer Walker\n" +
                "stars: 4";

        System.out.println(review);
        assertEquals(expected, review.toString());
    }
}
