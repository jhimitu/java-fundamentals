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
}
