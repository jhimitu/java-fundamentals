package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShopTest {
    @Test
    public void testToString() {
        Shop shop = new Shop();
        shop.setName("Zara");
        shop.setDescription("an amazing place where your money disappears.");
        shop.setDollarSigns(3);

        String expected = "shop name: Zara\n" +
                "description: an amazing place where your money disappears.\n" +
                "# of dollar signs: 3\n";

        assertEquals(expected, shop.toString());
    }
}
