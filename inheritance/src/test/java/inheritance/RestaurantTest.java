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
}

