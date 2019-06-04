package inheritance;

public class Restaurant {
    private String name;
    private int stars;
    private String price;

    public Restaurant() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String toString() {
        String result = "";
        return String.format("Restaurant: %s \n" +
                "stars: %d\n" +
                "price: %s", this.name, this.stars, this.price);
    }
}
