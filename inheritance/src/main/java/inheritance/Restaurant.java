package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private String name;
    private int stars;
    private String price;
    private List<Review> reviews = new ArrayList<>();

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

    public List<Review> getReviews() {
        return reviews;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if (reviews.size() != 0) {
            for (int i = 0; i < reviews.size(); i++) {
                stringBuilder.append(reviews.get(i));
            }
        }

        return String.format("Restaurant: %s \n" +
                "stars: %d\n" +
                "price: %s\n" +
                "reviews:\n" +
                "%s", this.name, this.stars, this.price, stringBuilder);
    }

    public void addReview(String name, String review, int stars) {
        Review newReview = new Review(name, review, stars);
        reviews.add(newReview);
    }
}
