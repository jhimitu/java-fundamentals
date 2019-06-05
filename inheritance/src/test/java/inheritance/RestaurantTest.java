package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class RestaurantTest {
    @Test
    public void testRestaurantName() {
        Restaurant restaurant = new Restaurant();
        restaurant.setName("BDs Mongolian Bar & Grill");

        assertEquals("BDs Mongolian Bar & Grill", restaurant.getName());
    }

    @Test
    public void testToString() {
        Restaurant restaurant = new Restaurant();

        restaurant.setName("BDs Mongolian Bar & Grill");
        restaurant.setPrice("$");
        restaurant.setStars(4);

        String expected = "Restaurant: BDs Mongolian Bar & Grill \n" +
        "stars: 4\n" +
        "price: $\n" +
        "reviews: test";

        System.out.println(restaurant);
        assertEquals(expected, restaurant.toString());
    }

    @Test
    public void testAddReview() {
        Restaurant restaurant = new Restaurant();

        restaurant.setName("BDs Mongolian Bar & Grill");
        restaurant.setPrice("$");
        restaurant.setStars(4);

        String expected = "Restaurant: BDs Mongolian Bar & Grill \n" +
                "stars: 4\n" +
                "price: $\n" +
                "reviews: test";

        Review newReview = new Review("Bryson Tiller", "it was great", 4);
        Review newReview2 = new Review("Bryson Tiller", "it was great", 4);
        Review newReview3 = new Review("Summer Walker", "Great place. Great food. Would definitely recommend.", 5);
        restaurant.addReview(newReview);
        restaurant.addReview(newReview2);
        restaurant.addReview(newReview3);

        System.out.println(restaurant.toString());
    }

    @Test
    public void testCalculateStars() {
        Restaurant restaurant = new Restaurant();

        restaurant.setName("BDs Mongolian Bar & Grill");
        restaurant.setPrice("$");
        restaurant.setStars(4);

        String expected = "Restaurant: BDs Mongolian Bar & Grill \n" +
                "stars: 4\n" +
                "price: $\n" +
                "reviews: test";

        Review newReview = new Review("Jhene Aiko", "The food was amazing!", 4);
        Review newReview2 = new Review("BJ The Chicago Kid", "Awesome.", 5);
        Review newReview3 = new Review("Teyana Taylor", "it was ok.", 2);
        restaurant.addReview(newReview);
        restaurant.addReview(newReview2);
        restaurant.addReview(newReview3);
        restaurant.calculateStars();
        System.out.println(restaurant.toString());
    }
}

